package com.maistasinamus.kebabai;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Collections;
import java.util.List;

public class AdapterKebabai extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context context;
    private LayoutInflater inflater;
    List<NewEntry> data = Collections.emptyList();
    NewEntry current;
    int currentPos = 0;

    // create constructor to initialize context and data sent from Search activity
    public AdapterKebabai(Context context, List<NewEntry> data) {
        this.context = context;
        inflater = LayoutInflater.from(context);
        this.data = data;
        for (NewEntry kebab : data) {
            Log.e("pokemon", kebab.getPavadinimas() + " " + kebab.getKaina());
        }
    }

    // Inflate the layout when ViewHolder created
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.container_kebab, parent, false);
        MyHolder holder = new MyHolder(view);
        return holder;
    }

    // Bind data
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        // Get current position of item in RecyclerView to bind data and assign values from list
        MyHolder myHolder = (MyHolder) holder;
        NewEntry current = data.get(position);
        myHolder.textPavadinimas.setText(current.getPavadinimas());
        myHolder.textDydis.setText("Tipas: " + current.getDydis());
        myHolder.textTipas.setText("Tipas: " + current.getTipas());
        myHolder.textKaina.setText("Kaina: " + current.getKaina());
        Log.e("kebab", current.getPavadinimas() + " " + current.getKaina());

    }

    // return total item from List
    @Override
    public int getItemCount() {
        return data.size();
    }


    class MyHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView textPavadinimas;
        TextView textDydis;
        TextView textTipas;
        TextView textKaina;

        // create constructor to get widget reference
        public MyHolder(View itemView) {
            super(itemView);
            textPavadinimas = (TextView) itemView.findViewById(R.id.textPavadinimas);
            textDydis = (TextView) itemView.findViewById(R.id.textWeight);
            textTipas = (TextView) itemView.findViewById(R.id.textMesa);
            textKaina = (TextView) itemView.findViewById(R.id.textKaina);
            itemView.setOnClickListener(this);
        }

        // Click event for all items
        @Override
        public void onClick(View v) {

            Toast.makeText(context, "You clicked an item", Toast.LENGTH_SHORT).show();

        }

    }

}