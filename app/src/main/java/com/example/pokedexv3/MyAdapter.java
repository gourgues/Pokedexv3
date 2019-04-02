package com.example.pokedexv3;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> implements Filterable {

    private List<PokemonDetails> pokemonDetails;
    private List<PokemonDetails> pokemonDetailsFull;
    private Context context;
    private OnItemClickListener mListener;

    public interface OnItemClickListener{
        void onItemClick(int position);
    }

    public void setOnItemClickListener(OnItemClickListener listener){
        this.mListener = listener;
    }

    public MyAdapter(List<PokemonDetails> pokemonDetails, Context context){
        this.pokemonDetails=pokemonDetails;
        pokemonDetailsFull = new ArrayList<>(pokemonDetails);
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i){
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.details_pokemon, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder,final int position) {

        final PokemonDetails listPokemonDetails = pokemonDetails.get(position);

        holder.textViewName.setText("  "+listPokemonDetails.getName());
        holder.textViewId.setText(" #"+listPokemonDetails.getId());

        Picasso.get()
                .load(listPokemonDetails.getImage())
                .into(holder.imageViewImage);

    }

    @Override
    public int getItemCount() {
        return pokemonDetails.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView textViewName;
        public TextView textViewId;
        public ImageView imageViewImage;
        public LinearLayout linearLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textViewName = (TextView) itemView.findViewById(R.id.textView_Name);
            textViewId = (TextView) itemView.findViewById(R.id.textView_Id);
            imageViewImage = (ImageView) itemView.findViewById(R.id.imageView_Image);
            linearLayout = (LinearLayout) itemView.findViewById(R.id.linearLayout);

            itemView.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (mListener != null){
                        int position = getAdapterPosition();
                        if(position != RecyclerView.NO_POSITION){
                            mListener.onItemClick(position);
                        }
                    }

                }
            });

        }
    }

    @Override
    public Filter getFilter() {
        return filtre;
    }

    private Filter filtre = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            List<PokemonDetails> filteredList = new ArrayList<>();
            if(constraint == null || constraint.length() == 0){
                filteredList.addAll(pokemonDetailsFull);
            }
            else{
                String filterPattern = constraint.toString().toLowerCase().trim();
                for(PokemonDetails pokemon : pokemonDetailsFull){
                    if(pokemon.getName().toLowerCase().contains(filterPattern)){
                        filteredList.add(pokemon);
                    }
                }
            }
            FilterResults results = new FilterResults();
            results.values = filteredList;
            return results;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            pokemonDetails.clear();
            pokemonDetails.addAll((List) results.values);
            notifyDataSetChanged();
        }
    };
}
