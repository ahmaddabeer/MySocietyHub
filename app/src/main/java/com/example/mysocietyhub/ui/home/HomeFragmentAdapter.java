package com.example.mysocietyhub.ui.home;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.mysocietyhub.R;

import java.util.List;

public class HomeFragmentAdapter extends RecyclerView.Adapter<HomeFragmentAdapter.ViewHolder>{



    public HomeFragmentAdapter(Context context, List<HomeViewModel> data) {
        this.context = context;
        this.data = data;
    }

    Context context;
    List<HomeViewModel> data;

    @NonNull
    @Override
    public HomeFragmentAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.home_fragment_single_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeFragmentAdapter.ViewHolder holder, int position) {


        final HomeViewModel flag = data.get(position);


        holder.service.setText(flag.getName());
        Glide.with(holder.img.getContext())
                .load(flag.getImage())
                .into(holder.img);

        holder.img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(context, HomeDetail.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.putExtra("position",+1);
                intent.putExtra("item",
                        flag.getName());

                context.startActivity(intent);


            }
        });




    }



    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView service;
        ImageView img;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            service = itemView.findViewById(R.id.name);
            img = itemView.findViewById(R.id.image);

        }
    }
}
