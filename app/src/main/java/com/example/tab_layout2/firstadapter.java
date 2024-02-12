package com.example.tab_layout2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.imageview.ShapeableImageView;

import java.util.ArrayList;

public class firstadapter extends RecyclerView.Adapter<firstadapter.ViewHolder> {

    Context context;
    ArrayList<animemodel> arrnames;
     firstadapter(Context context, ArrayList<animemodel> arrnames){
         this.context = context;
         this.arrnames = arrnames;

     }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view  = LayoutInflater.from(context).inflate(R.layout.chats_design,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return  viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
         holder.img.setImageResource(arrnames.get(position).image);
         holder.txt1.setText(arrnames.get(position).name);
         holder.txt2.setText(arrnames.get(position).message);
    }

    @Override
    public int getItemCount() {
        return arrnames.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

         ShapeableImageView img;
         TextView txt1, txt2;

        public ViewHolder(View a){
            super(a);

            img = a.findViewById(R.id.imgae1);
            txt1 = a.findViewById(R.id.text1);
            txt2 = a.findViewById(R.id.text2);
        }
    }
}
