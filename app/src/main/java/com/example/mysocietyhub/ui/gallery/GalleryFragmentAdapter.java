package com.example.mysocietyhub.ui.gallery;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.mysocityhub.R;

import java.util.List;

public class GalleryFragmentAdapter extends RecyclerView.Adapter<GalleryFragmentAdapter.ViewHolder> {

    Context context;

    List<GalleryViewModel> data;

    public GalleryFragmentAdapter(Context context, List<GalleryViewModel> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public GalleryFragmentAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.gallery_farag_single_row,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GalleryFragmentAdapter.ViewHolder holder, int position) {

        final GalleryViewModel flag = data.get(position);

        holder.name.setText(flag.getName());

        Glide.with(holder.img.getContext())
                .load(flag.getImage())
                .into(holder.img);


    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView img;
        TextView name;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            img = itemView.findViewById(R.id.gallery_row_img);
            name = itemView.findViewById(R.id.gallery_row_text);

        }
    }
}
