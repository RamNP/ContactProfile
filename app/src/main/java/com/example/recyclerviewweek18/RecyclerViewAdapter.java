package com.example.recyclerviewweek18;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Random;

public class RecyclerViewAdapter extends RecyclerView.Adapter <RecyclerViewAdapter.ViewHolder>{
    private ArrayList<ContactPojo> ContactArrayList;
    private Context context;

    public RecyclerViewAdapter(ArrayList<ContactPojo> contactArrayList, Context context) {
        ContactArrayList = contactArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_contact,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, int position) {
        ContactPojo contactPojo = ContactArrayList.get(position);
        holder.tvProfileLetter.setText(contactPojo.getProfileLetter().toString());
        holder.name.setText(contactPojo.getName());
        holder.number.setText(contactPojo.getName());
        holder.tvProfileLetter.setBackgroundColor(RandomColors.getColor());

    }

    @Override
    public int getItemCount() {

        return ContactArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvProfileLetter ,name ,number;
        public ViewHolder(View itemView){
            super(itemView);
            tvProfileLetter = itemView.findViewById(R.id.tvProfileLetter);
            name = itemView.findViewById(R.id.name);
            number = itemView.findViewById(R.id.number);

        }
    }
}
