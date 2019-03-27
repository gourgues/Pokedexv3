package com.example.pokedexv3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewFlipper;

import java.io.*;
import java.lang.*;

import com.squareup.picasso.Picasso;

import org.json.JSONArray;

import java.util.ArrayList;

import static com.example.pokedexv3.MainActivity.EXTRA_NAME;
import static com.example.pokedexv3.MainActivity.EXTRA_ID;
import static com.example.pokedexv3.MainActivity.EXTRA_TYPE;
import static com.example.pokedexv3.MainActivity.EXTRA_HEIGHT;
import static com.example.pokedexv3.MainActivity.EXTRA_WEIGHT;
import static com.example.pokedexv3.MainActivity.EXTRA_CATCHRATE;
import static com.example.pokedexv3.MainActivity.EXTRA_EV;
import static com.example.pokedexv3.MainActivity.EXTRA_ABILITYNAME;
import static com.example.pokedexv3.MainActivity.EXTRA_ABILITYDESCRIPTION;
import static com.example.pokedexv3.MainActivity.EXTRA_SECONDABILITYNAME;
import static com.example.pokedexv3.MainActivity.EXTRA_SECONDABILITYDESCRIPTION;
import static com.example.pokedexv3.MainActivity.EXTRA_HIDDENABILITYNAME;
import static com.example.pokedexv3.MainActivity.EXTRA_HIDDENABILITYDESCRIPTION;
import static com.example.pokedexv3.MainActivity.EXTRA_WEAKNESS;
import static com.example.pokedexv3.MainActivity.EXTRA_RESISTANCE;
import static com.example.pokedexv3.MainActivity.EXTRA_IMMUNITY;
import static com.example.pokedexv3.MainActivity.EXTRA_STATPV;
import static com.example.pokedexv3.MainActivity.EXTRA_STATATT;
import static com.example.pokedexv3.MainActivity.EXTRA_STATDEF;
import static com.example.pokedexv3.MainActivity.EXTRA_STATATTSPE;
import static com.example.pokedexv3.MainActivity.EXTRA_STATDEFSPE;
import static com.example.pokedexv3.MainActivity.EXTRA_STATVIT;
import static com.example.pokedexv3.MainActivity.EXTRA_TOTALSTAT;
import static com.example.pokedexv3.MainActivity.EXTRA_IMAGE;
import static com.example.pokedexv3.MainActivity.EXTRA_ARTWORK;
import static com.example.pokedexv3.MainActivity.EXTRA_SPRITE;
import static com.example.pokedexv3.MainActivity.EXTRA_SHINYSPRITE;


public class DetailActivity extends AppCompatActivity{

    public void printType(String typeList, LinearLayout gallery, LayoutInflater inflater, int layout, int id){
        if(typeList.contains("acier")==true){
            View view = inflater.inflate(layout,gallery,false);
            ImageView imageViewType = view.findViewById(id);
            Picasso.get().load("https://www.breakflip.com/uploads/Pok%C3%A9mon/Types/acier_mini.png").into(imageViewType);

            gallery.addView(view);
        }
        if(typeList.contains("combat")==true){
            View view = inflater.inflate(layout,gallery,false);
            ImageView imageViewType = view.findViewById(id);
            Picasso.get().load("https://www.breakflip.com/uploads/Pok%C3%A9mon/Types/combat_mini.png").into(imageViewType);

            gallery.addView(view);
        }
        if(typeList.contains("dragon")==true){
            View view = inflater.inflate(layout,gallery,false);
            ImageView imageViewType = view.findViewById(id);
            Picasso.get().load("https://www.breakflip.com/uploads/Pok%C3%A9mon/Types/dragon_mini.png").into(imageViewType);

            gallery.addView(view);
        }
        if(typeList.contains("eau")==true){
            View view = inflater.inflate(layout,gallery,false);
            ImageView imageViewType = view.findViewById(id);
            Picasso.get().load("https://www.breakflip.com/uploads/Pok%C3%A9mon/Types/eau_mini.png").into(imageViewType);

            gallery.addView(view);
        }
        if(typeList.contains("electrik")==true){
            View view = inflater.inflate(layout,gallery,false);
            ImageView imageViewType = view.findViewById(id);
            Picasso.get().load("https://www.breakflip.com/uploads/Pok%C3%A9mon/Types/elektrik_mini.png").into(imageViewType);

            gallery.addView(view);
        }
        if(typeList.contains("fee")==true){
            View view = inflater.inflate(layout,gallery,false);
            ImageView imageViewType = view.findViewById(id);
            Picasso.get().load("https://www.breakflip.com/uploads/Pok%C3%A9mon/Types/fee_mini.png").into(imageViewType);

            gallery.addView(view);
        }
        if(typeList.contains("feu")==true){
            View view = inflater.inflate(layout,gallery,false);
            ImageView imageViewType = view.findViewById(id);
            Picasso.get().load("https://www.breakflip.com/uploads/Pok%C3%A9mon/Types/feu_mini.png").into(imageViewType);

            gallery.addView(view);
        }
        if(typeList.contains("glace")==true){
            View view = inflater.inflate(layout,gallery,false);
            ImageView imageViewType = view.findViewById(id);
            Picasso.get().load("https://www.breakflip.com/uploads/Pok%C3%A9mon/Types/glace_mini.png").into(imageViewType);

            gallery.addView(view);
        }
        if(typeList.contains("insecte")==true){
            View view = inflater.inflate(layout,gallery,false);
            ImageView imageViewType = view.findViewById(id);
            Picasso.get().load("https://www.breakflip.com/uploads/Pok%C3%A9mon/Types/insecte_mini.png").into(imageViewType);

            gallery.addView(view);
        }
        if(typeList.contains("normal")==true){
            View view = inflater.inflate(layout,gallery,false);
            ImageView imageViewType = view.findViewById(id);
            Picasso.get().load("https://www.breakflip.com/uploads/Pok%C3%A9mon/Types/normal_mini.png").into(imageViewType);

            gallery.addView(view);
        }
        if(typeList.contains("plante")==true){
            View view = inflater.inflate(layout,gallery,false);
            ImageView imageViewType = view.findViewById(id);
            Picasso.get().load("https://www.breakflip.com/uploads/Pok%C3%A9mon/Types/plante_mini.png").into(imageViewType);

            gallery.addView(view);
        }
        if(typeList.contains("poison")==true){
            View view = inflater.inflate(layout,gallery,false);
            ImageView imageViewType = view.findViewById(id);
            Picasso.get().load("https://www.breakflip.com/uploads/Pok%C3%A9mon/Types/poison_mini.png").into(imageViewType);

            gallery.addView(view);
        }
        if(typeList.contains("psy")==true){
            View view = inflater.inflate(layout,gallery,false);
            ImageView imageViewType = view.findViewById(id);
            Picasso.get().load("https://www.breakflip.com/uploads/Pok%C3%A9mon/Types/psy_mini.png").into(imageViewType);

            gallery.addView(view);
        }
        if(typeList.contains("roche")==true){
            View view = inflater.inflate(layout,gallery,false);
            ImageView imageViewType = view.findViewById(id);
            Picasso.get().load("https://www.breakflip.com/uploads/Pok%C3%A9mon/Types/roche_mini.png").into(imageViewType);

            gallery.addView(view);
        }
        if(typeList.contains("sol")==true){
            View view = inflater.inflate(layout,gallery,false);
            ImageView imageViewType = view.findViewById(id);
            Picasso.get().load("https://www.breakflip.com/uploads/Pok%C3%A9mon/Types/sol_mini.png").into(imageViewType);

            gallery.addView(view);
        }
        if(typeList.contains("spectre")==true){
            View view = inflater.inflate(layout,gallery,false);
            ImageView imageViewType = view.findViewById(id);
            Picasso.get().load("https://www.breakflip.com/uploads/Pok%C3%A9mon/Types/spectre_mini.png").into(imageViewType);

            gallery.addView(view);
        }
        if(typeList.contains("tenebres")==true){
            View view = inflater.inflate(layout,gallery,false);
            ImageView imageViewType = view.findViewById(id);
            Picasso.get().load("https://www.breakflip.com/uploads/Pok%C3%A9mon/Types/tenebres_mini.png").into(imageViewType);

            gallery.addView(view);
        }
        if(typeList.contains("vol")==true){
            View view = inflater.inflate(layout,gallery,false);
            ImageView imageViewType = view.findViewById(id);
            Picasso.get().load("https://www.breakflip.com/uploads/Pok%C3%A9mon/Types/vol_mini.png").into(imageViewType);

            gallery.addView(view);
        }

    }

    public void printSprite(String sprite, String shinysprite, LinearLayout gallery, LayoutInflater inflater, int layout, int id) {
        if(0 == 0) {
            View view = inflater.inflate(layout, gallery, false);
            ImageView imageViewSprite = view.findViewById(id);
            Picasso.get().load(sprite).into(imageViewSprite);
            gallery.addView(view);
        }
        if(0 == 0) {
            View view = inflater.inflate(layout, gallery, false);
            ImageView imageViewSprite = view.findViewById(id);
            Picasso.get().load(shinysprite).into(imageViewSprite);
            gallery.addView(view);
        }
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        String pokemonName = intent.getStringExtra(EXTRA_NAME);
        String pokemonId = intent.getStringExtra(EXTRA_ID);
        String pokemonType = intent.getStringExtra(EXTRA_TYPE);
        String pokemonHeight = intent.getStringExtra(EXTRA_HEIGHT);
        String pokemonWeight = intent.getStringExtra(EXTRA_WEIGHT);
        String pokemonCatchrate = intent.getStringExtra(EXTRA_CATCHRATE);
        String pokemonEv = intent.getStringExtra(EXTRA_EV);
        String pokemonAbName = intent.getStringExtra(EXTRA_ABILITYNAME);
        String pokemonAbDesc = intent.getStringExtra(EXTRA_ABILITYDESCRIPTION);
        String pokemonSecAbName = intent.getStringExtra(EXTRA_SECONDABILITYNAME);
        String pokemonSecAbDesc = intent.getStringExtra(EXTRA_SECONDABILITYDESCRIPTION);
        String pokemonHidAbName = intent.getStringExtra(EXTRA_HIDDENABILITYNAME);
        String pokemonHidAbDesc = intent.getStringExtra(EXTRA_HIDDENABILITYDESCRIPTION);
        String pokemonWeakness = intent.getStringExtra(EXTRA_WEAKNESS);
        String pokemonResistance = intent.getStringExtra(EXTRA_RESISTANCE);
        String pokemonImmunity = intent.getStringExtra(EXTRA_IMMUNITY);
        String pokemonStatpv = intent.getStringExtra(EXTRA_STATPV);
        String pokemonStatatt = intent.getStringExtra(EXTRA_STATATT);
        String pokemonStatdef = intent.getStringExtra(EXTRA_STATDEF);
        String pokemonStatattspe = intent.getStringExtra(EXTRA_STATATTSPE);
        String pokemonStatdefspe = intent.getStringExtra(EXTRA_STATDEFSPE);
        String pokemonStatvit = intent.getStringExtra(EXTRA_STATVIT);
        String pokemonTotalstat = intent.getStringExtra(EXTRA_TOTALSTAT);
        String pokemonArtwork = intent.getStringExtra(EXTRA_ARTWORK);
        String pokemonSprite = intent.getStringExtra(EXTRA_SPRITE);
        String pokemonShinysprite = intent.getStringExtra(EXTRA_SHINYSPRITE);

        ImageView imageViewArtwork = findViewById(R.id.artworkViewDetail);
        TextView textViewName = findViewById(R.id.nameViewDetail);
        TextView textViewId = findViewById(R.id.idViewDetail);
        LinearLayout gallery = findViewById(R.id.gallery);
        LayoutInflater inflater = LayoutInflater.from(this);
        TextView textViewHeight = findViewById(R.id.heightViewDetail);
        TextView textViewWeight = findViewById(R.id.weightViewDetail);
        TextView textViewCatchrate = findViewById(R.id.catchrateViewDetail);
        TextView textViewEv = findViewById(R.id.evViewDetail);
        LinearLayout gallerysprite = findViewById(R.id.gallerysprite);
        LayoutInflater inflatersprite = LayoutInflater.from(this);
        TextView textViewAbname = findViewById(R.id.abnameViewDetail);
        TextView textViewAbdesc = findViewById(R.id.abdescViewDetail);
        TextView textViewSecabname = findViewById(R.id.secabnameViewDetail);
        TextView textViewSecabdesc = findViewById(R.id.secabdescViewDetail);
        TextView textViewHidabname = findViewById(R.id.hidabnameViewDetail);
        TextView textViewHidabdesc = findViewById(R.id.hidabdescViewDetail);
        LinearLayout gallery2 = findViewById(R.id.gallery2);
        LayoutInflater inflater2 = LayoutInflater.from(this);
        LinearLayout gallery3 = findViewById(R.id.gallery3);
        LayoutInflater inflater3 = LayoutInflater.from(this);
        LinearLayout gallery4 = findViewById(R.id.gallery4);
        LayoutInflater inflater4 = LayoutInflater.from(this);
        TextView textViewStatpv = findViewById(R.id.statpvViewDetail);
        TextView textViewStatatt = findViewById(R.id.statattViewDetail);
        TextView textViewStatdef = findViewById(R.id.statdefViewDetail);
        TextView textViewStatattspe = findViewById(R.id.statattspeViewDetail);
        TextView textViewStatdefspe = findViewById(R.id.statdefspeViewDetail);
        TextView textViewStatvit = findViewById(R.id.statvitViewDetail);
        TextView textViewTotaltat = findViewById(R.id.totalstatViewDetail);

        Picasso.get().load(pokemonArtwork).into(imageViewArtwork);
        textViewName.setText(pokemonName);
        textViewId.setText("#"+pokemonId);
        printType(pokemonType, gallery, inflater, R.layout.type_list, R.id.typeViewDetail);
        textViewHeight.setText("Taille : "+pokemonHeight);
        textViewWeight.setText("Poids : "+pokemonWeight);
        textViewCatchrate.setText("Taux de Capture : "+pokemonCatchrate);
        textViewEv.setText("Ev donnés : "+pokemonEv);
        printSprite(pokemonSprite, pokemonShinysprite, gallerysprite, inflatersprite, R.layout.sprite_list, R.id.spritesViewDetail);
        textViewAbname.setText(pokemonAbName);
        textViewAbdesc.setText(pokemonAbDesc);
        textViewSecabname.setText(pokemonSecAbName);
        textViewSecabdesc.setText(pokemonSecAbDesc);
        textViewHidabname.setText(pokemonHidAbName);
        textViewHidabdesc.setText(pokemonHidAbDesc);
        printType(pokemonWeakness, gallery2, inflater2, R.layout.weakness_list, R.id.weaknessViewDetail);
        printType(pokemonResistance, gallery3, inflater3, R.layout.resistance_list, R.id.resistanceViewDetail);
        printType(pokemonImmunity, gallery4, inflater4, R.layout.immunity_list, R.id.immunityViewDetail);
        textViewStatpv.setText(    "pv : "+pokemonStatpv);
        textViewStatatt.setText(   "att. : "+pokemonStatatt);
        textViewStatdef.setText(   "def. : "+pokemonStatdef);
        textViewStatattspe.setText("att. spé : "+pokemonStatattspe);
        textViewStatdefspe.setText("def. spé : "+pokemonStatdefspe);
        textViewStatvit.setText(   "vit. : "+pokemonStatvit);
        textViewTotaltat.setText(  "total : "+pokemonTotalstat);
    }
}
