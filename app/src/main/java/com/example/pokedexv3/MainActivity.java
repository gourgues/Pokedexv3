package com.example.pokedexv3;
import android.content.Context;
import android.content.SharedPreferences;

import com.android.volley.Cache;
import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.toolbox.HttpHeaderParser;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import android.app.ProgressDialog;
import android.support.v4.content.res.TypedArrayUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.inputmethod.EditorInfo;
import android.support.v7.widget.SearchView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import android.content.Intent;

public class MainActivity extends AppCompatActivity implements MyAdapter.OnItemClickListener{

    public static final String EXTRA_NAME = "pokemonName";
    public static final String EXTRA_ID = "pokemonId";
    public static final String EXTRA_TYPE = "pokemonType";
    public static final String EXTRA_HEIGHT = "pokemonHeight";
    public static final String EXTRA_WEIGHT = "pokemonWeight";
    public static final String EXTRA_CATCHRATE = "pokemonCatchrate";
    public static final String EXTRA_EV = "pokemonEv";
    public static final String EXTRA_ABILITYNAME = "pokemonAbilityname";
    public static final String EXTRA_ABILITYDESCRIPTION = "pokemonAbilitydescription";
    public static final String EXTRA_SECONDABILITYNAME = "pokemonSecondabilityname";
    public static final String EXTRA_SECONDABILITYDESCRIPTION = "pokemonSecondabilitydescription";
    public static final String EXTRA_HIDDENABILITYNAME = "pokemonHiddenabilityname";
    public static final String EXTRA_HIDDENABILITYDESCRIPTION = "pokemonHiddenabilitydescription";
    public static final String EXTRA_WEAKNESS = "pokemonWeakness";
    public static final String EXTRA_RESISTANCE = "pokemonResistance";
    public static final String EXTRA_IMMUNITY = "pokemonImmunity";
    public static final String EXTRA_STATPV = "pokemonStatpv";
    public static final String EXTRA_STATATT = "pokemonStatatt";
    public static final String EXTRA_STATDEF = "pokemonStatdef";
    public static final String EXTRA_STATATTSPE = "pokemonStatattspe";
    public static final String EXTRA_STATDEFSPE = "pokemonStatdefspe";
    public static final String EXTRA_STATVIT = "pokemonStatvit";
    public static final String EXTRA_TOTALSTAT = "pokemonTotalstat";
    public static final String EXTRA_IMAGE = "pokemonImage";
    public static final String EXTRA_ARTWORK = "pokemonArtwork";
    public static final String EXTRA_SPRITE = "pokemonSprite";
    public static final String EXTRA_SHINYSPRITE = "pokemonShinysprite";

    public static int EXTRA_SEARCH = 0;

    private static final String URL_DATA = "https://raw.githubusercontent.com/gourgues/pokedex/master/pokedex4g.json";

    private RecyclerView recyclerView;
    private MyAdapter myAdapter;
    private Context context;

    private List<PokemonDetails> pokemonDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));

        pokemonDetails = new ArrayList<>();

        loadRecyclerViewData();

    }

    private void loadRecyclerViewData(){

        final ProgressDialog progressDialog = new ProgressDialog(this);
        //progressDialog.setMessage("loading data...");
        //progressDialog.show();

        StringRequest stringRequest = new StringRequest(Request.Method.GET,
                URL_DATA,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        progressDialog.dismiss();
                        try {
                            JSONObject jsonObject = new JSONObject(response);
                            JSONArray jsonArray = jsonObject.getJSONArray("pokemon");

                            for (int i = 0; i < jsonArray.length(); i++) {
                                JSONObject o = jsonArray.getJSONObject(i);

                                String pokemonName = o.getString("name");
                                String pokemonId = o.getString("id");
                                String pokemonType = o.getString("type");
                                String pokemonHeight = o.getString("height");
                                String pokemonWeight = o.getString("weight");
                                String pokemonCatchrate = o.getString("catchrate");
                                String pokemonEv = o.getString("ev");
                                String pokemonAbilityname = o.optString("abilityname");
                                String pokemonAbilitydescription = o.getString("abilitydescription");
                                String pokemonSecondabilityname = o.getString("secondabilityname");
                                String pokemonSecondabilitydescription = o.getString("secondabilitydescription");
                                String pokemonHiddenabilityname = o.getString("hiddenabilityname");
                                String pokemonHiddenabilitydescription = o.getString("hiddenabilitydescription");
                                String pokemonWeakness = o.getString("weakness");
                                String pokemonResistance = o.getString("resistance");
                                String pokemonImmunity = o.getString("immunity");
                                String pokemonStatpv = o.getString("statpv");
                                String pokemonStatatt = o.getString("statatt");
                                String pokemonStatdef = o.getString("statdef");
                                String pokemonStatattspe = o.getString("statattspe");
                                String pokemonStatdefspe = o.getString("statdefspe");
                                String pokemonStatvit = o.getString("statvit");
                                String pokemonTotalstat = o.getString("totalstat");
                                String pokemonImage = o.getString("image");
                                String pokemonArtwork = o.getString("artwork");
                                String pokemonSprite = o.getString("sprite");
                                String pokemonShinysprite = o.getString("shinysprite");

                                pokemonDetails.add(new PokemonDetails(pokemonName, pokemonId, pokemonType, pokemonHeight, pokemonWeight, pokemonCatchrate, pokemonEv,
                                        pokemonAbilityname, pokemonAbilitydescription, pokemonSecondabilityname, pokemonSecondabilitydescription, pokemonHiddenabilityname, pokemonHiddenabilitydescription,
                                        pokemonWeakness, pokemonResistance, pokemonImmunity,
                                        pokemonStatpv, pokemonStatatt, pokemonStatdef, pokemonStatattspe, pokemonStatdefspe, pokemonStatvit, pokemonTotalstat,
                                        pokemonImage, pokemonArtwork, pokemonSprite, pokemonShinysprite));

                            }

                            myAdapter = new MyAdapter(pokemonDetails, MainActivity.this);
                            recyclerView.setAdapter(myAdapter);
                            myAdapter.setOnItemClickListener(MainActivity.this);

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        progressDialog.dismiss();
                       // Toast.makeText(getApplicationContext(), volleyError.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                })
        {
            @Override
            protected Response<String> parseNetworkResponse(NetworkResponse response) {
                try {
                    Cache.Entry cacheEntry = HttpHeaderParser.parseCacheHeaders(response);
                    if (cacheEntry == null) {
                        cacheEntry = new Cache.Entry();
                    }
                    final long cacheHitButRefreshed = 3 * 60 * 1000; // in 3 minutes cache will be hit, but also refreshed on background
                    final long cacheExpired = 24 * 60 * 60 * 1000; // in 24 hours this cache entry expires completely
                    long now = System.currentTimeMillis();
                    final long softExpire = now + cacheHitButRefreshed;
                    final long ttl = now + cacheExpired;
                    cacheEntry.data = response.data;
                    cacheEntry.softTtl = softExpire;
                    cacheEntry.ttl = ttl;
                    String headerValue;
                    headerValue = response.headers.get("Date");
                    if (headerValue != null) {
                        cacheEntry.serverDate = HttpHeaderParser.parseDateAsEpoch(headerValue);
                    }
                    headerValue = response.headers.get("Last-Modified");
                    if (headerValue != null) {
                        cacheEntry.lastModified = HttpHeaderParser.parseDateAsEpoch(headerValue);
                    }
                    cacheEntry.responseHeaders = response.headers;
                    final String jsonString = new String(response.data,
                            HttpHeaderParser.parseCharset(response.headers));
                    return Response.success(new String(jsonString), cacheEntry);
                } catch (UnsupportedEncodingException e) {
                    return Response.error(new ParseError(e));
                }
            }

            @Override
            protected void deliverResponse(String response) {
                super.deliverResponse(String.valueOf(response));
            }

            @Override
            public void deliverError(VolleyError error) {
                super.deliverError(error);
            }

            @Override
            protected VolleyError parseNetworkError(VolleyError volleyError) {
                return super.parseNetworkError(volleyError);
            }
        };
            RequestQueue requestQueue =  Volley.newRequestQueue(this);
            requestQueue.add(stringRequest);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);

        MenuItem searchItem = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView) searchItem.getActionView();

        searchView.setImeOptions(EditorInfo.IME_ACTION_DONE);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                myAdapter.getFilter().filter(newText);
                return false;
            }
        });
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.tri_nom){
            Toast.makeText(this,"recherche par nom", Toast.LENGTH_SHORT).show();
            EXTRA_SEARCH = 0;
        }
        if(item.getItemId()==R.id.tri_id){
            Toast.makeText(this,"recherche par id", Toast.LENGTH_SHORT).show();
            EXTRA_SEARCH = 1;
        }
        if(item.getItemId()==R.id.tri_type){
            Toast.makeText(this,"recherche par type", Toast.LENGTH_SHORT).show();
            EXTRA_SEARCH = 2;
        }
        if(item.getItemId()==R.id.tri_ev){
            Toast.makeText(this,"recherche par ev", Toast.LENGTH_SHORT).show();
            EXTRA_SEARCH = 3;
        }
        if(item.getItemId()==R.id.tri_talent){
            Toast.makeText(this,"recherche par talent", Toast.LENGTH_SHORT).show();
            EXTRA_SEARCH = 4;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onItemClick(int position){
        Intent detailIntent = new Intent(this, DetailActivity.class);
        PokemonDetails clickedItem = pokemonDetails.get(position);

        detailIntent.putExtra(EXTRA_NAME, clickedItem.getName());
        detailIntent.putExtra(EXTRA_ID, clickedItem.getId());
        detailIntent.putExtra(EXTRA_TYPE, clickedItem.getType());
        detailIntent.putExtra(EXTRA_HEIGHT, clickedItem.getHeight());
        detailIntent.putExtra(EXTRA_WEIGHT, clickedItem.getWeight());
        detailIntent.putExtra(EXTRA_CATCHRATE, clickedItem.getCatchrate());
        detailIntent.putExtra(EXTRA_EV, clickedItem.getEv());
        detailIntent.putExtra(EXTRA_ABILITYNAME, clickedItem.getAbilityname());
        detailIntent.putExtra(EXTRA_ABILITYDESCRIPTION, clickedItem.getAbilitydescription());
        detailIntent.putExtra(EXTRA_SECONDABILITYNAME, clickedItem.getSecondabilityname());
        detailIntent.putExtra(EXTRA_SECONDABILITYDESCRIPTION, clickedItem.getSecondabilitydescription());
        detailIntent.putExtra(EXTRA_HIDDENABILITYNAME, clickedItem.getHiddenabilityname());
        detailIntent.putExtra(EXTRA_HIDDENABILITYDESCRIPTION, clickedItem.getHiddenabilitydescription());
        detailIntent.putExtra(EXTRA_WEAKNESS, clickedItem.getWeakness());
        detailIntent.putExtra(EXTRA_RESISTANCE, clickedItem.getResistance());
        detailIntent.putExtra(EXTRA_IMMUNITY, clickedItem.getImmunity());
        detailIntent.putExtra(EXTRA_STATPV, clickedItem.getStatpv());
        detailIntent.putExtra(EXTRA_STATATT, clickedItem.getStatatt());
        detailIntent.putExtra(EXTRA_STATDEF, clickedItem.getStatdef());
        detailIntent.putExtra(EXTRA_STATATTSPE, clickedItem.getStatattspe());
        detailIntent.putExtra(EXTRA_STATDEFSPE, clickedItem.getStatdefspe());
        detailIntent.putExtra(EXTRA_STATVIT, clickedItem.getStatvit());
        detailIntent.putExtra(EXTRA_TOTALSTAT, clickedItem.getTotalstat());
        detailIntent.putExtra(EXTRA_IMAGE, clickedItem.getImage());
        detailIntent.putExtra(EXTRA_ARTWORK, clickedItem.getArtwork());
        detailIntent.putExtra(EXTRA_SPRITE, clickedItem.getSprite());
        detailIntent.putExtra(EXTRA_SHINYSPRITE, clickedItem.getShinysprite());

        startActivity(detailIntent);
    }
}
