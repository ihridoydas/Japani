package com.hridoy.language.japani.N3.kanji;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hridoy.language.japani.R;

import java.util.List;

public class RecyclerVewAdapterN3 extends RecyclerView.Adapter<RecyclerVewAdapterN3.MyViewHolder>{

    Context mContext;
    List<KanjiN3>mData;


    public RecyclerVewAdapterN3(Context mContext, List<KanjiN3> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public RecyclerVewAdapterN3.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v;
        v= LayoutInflater.from(mContext).inflate(R.layout.item_kanji_n3,parent,false);

        final MyViewHolder vHolder=new RecyclerVewAdapterN3.MyViewHolder(v);


        vHolder.item_kanji_n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "Toast Hridoy "+String.valueOf(vHolder.getAdapterPosition()), Toast.LENGTH_LONG).show();
            }
        });

        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerVewAdapterN3.MyViewHolder holder, int position) {


        holder.tv_lessonNo.setText(mData.get(position).getName());
        holder.img.setImageResource(mData.get(position).getPhoto());




    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        private LinearLayout item_kanji_n3;
        private TextView tv_lessonNo;
        private ImageView img;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            item_kanji_n3 =(LinearLayout) itemView.findViewById(R.id.kanji_item_id_n3);

            tv_lessonNo =(TextView) itemView.findViewById(R.id.lesson_no_kanji_n3);
            img=(ImageView) itemView.findViewById(R.id.kanji_image_n3);

        }
    }

}
