package com.cb005454.manuja.mainmenu;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class adapterGents extends RecyclerView.Adapter<adapterGents.ViewHolder>{
     public adapterGents(List<GentsList>listgents, Context context){
         this.listgents = listgents;
         this.context = context;
     }
     private List<GentsList>listgents;
     private  Context context;
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
       View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardviewgents,viewGroup,false);
        return  new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

        GentsList listItem = listgents.get(i);

        viewHolder.textviewhead.setText(listItem.getHeadGents());
        viewHolder.textviewDescription.setText(listItem.getDescriptionGents());

        Picasso.get().load(listItem.getImageUrlGents()).into(viewHolder.imageView);


    }

    @Override
    public int getItemCount() {
        return listgents.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textviewhead, textviewDescription;
        public ImageView imageView;
        public LinearLayout linearLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textviewhead = itemView.findViewById(R.id.textViewHeadGents);
            textviewDescription = itemView.findViewById(R.id.textViewDescriptionGents);
            imageView = itemView.findViewById(R.id.imageviewGents);
            linearLayout = itemView.findViewById(R.id.linerlayoutGents);
        }
    }
}
