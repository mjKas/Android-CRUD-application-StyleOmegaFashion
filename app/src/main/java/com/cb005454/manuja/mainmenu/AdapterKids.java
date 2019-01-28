package com.cb005454.manuja.mainmenu;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.List;

class AdapterKids extends  RecyclerView.Adapter <AdapterKids.ViewHolder>{

    public AdapterKids(List<listKids> listKidss, Context context) {
        this.listKidss = listKidss;
        this.context = context;
    }

    private List<listKids> listKidss;
    private Context context;
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardviewkids, viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder viewHolder,final  int i) {
        final listKids listKids=listKidss.get(i);
        viewHolder.textViewhead.setText(listKids.getHeadKids());
        viewHolder.textViewDescription.setText(listKids.getDescriptionkids());
        Picasso.get().load(listKids.getImageUrlKids()).into(viewHolder.imageView);
        viewHolder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i==0) {
                    Intent intent = new Intent(context,viewDetailsKidsblk.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK |Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    context.startActivity(intent);
                }
            }
        });
    }



    @Override
    public int getItemCount() {
        return listKidss.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textViewhead,textViewDescription;
        public ImageView imageView;
        public LinearLayout linearLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewhead = itemView.findViewById(R.id.textViewHeadKids);
            textViewDescription = itemView.findViewById(R.id.textViewDescriptionKids);
            imageView = itemView.findViewById(R.id.imageviewKids);
            linearLayout = itemView.findViewById(R.id.linerlayoutKids);

        }
    }
}
