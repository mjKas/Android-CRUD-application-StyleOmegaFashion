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

public class AdapterLadies  extends RecyclerView.Adapter<AdapterLadies.ViewHolder> {
    private List<listLadies> listItems;
    private Context context;
    public  AdapterLadies(List<listLadies>ladiesItems, Context context){
        this.listItems = ladiesItems;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardviewladies,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterLadies.ViewHolder viewHolder, int i) {
        listLadies ladiesItems = listItems.get(i);

        viewHolder.textViewhead.setText(ladiesItems.getHead());
        viewHolder.textViewDescription.setText(ladiesItems.getDescription());
        Picasso.get().load(ladiesItems.getImageUrl()).into(viewHolder.imageView);
        //viewHolder.linearLayout.setOnClickListener();


    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textViewhead, textViewDescription;
        public ImageView imageView;
        public LinearLayout linearLayout;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewhead = itemView.findViewById(R.id.textViewHeadLadies);
            textViewDescription = itemView.findViewById(R.id.textViewDescriptionLadies);
            imageView = itemView.findViewById(R.id.imageviewLadies);
            linearLayout = itemView.findViewById(R.id.linerlayoutLadies);
        }
    }
}
