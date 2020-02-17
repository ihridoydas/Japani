package com.hridoy.language.japani.N4.Voca;

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

public class RecyclerVewAdapterN4 extends RecyclerView.Adapter<RecyclerVewAdapterN4.MyViewHolder>{


    Context mContext;
    List<VocabularyN4> mData;

    public RecyclerVewAdapterN4(Context mContext, List<VocabularyN4> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        View v;
        v= LayoutInflater.from(mContext).inflate(R.layout.item_vocabulary_n4,parent,false);
        final MyViewHolder vHolder= new MyViewHolder(v);


        vHolder.item_vocabulary_n4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, " example"+String.valueOf(vHolder.getAdapterPosition()), Toast.LENGTH_LONG).show();
            }
        });

        return vHolder;
    }

    @Override
    public void onBindViewHolder( MyViewHolder holder, int position) {


        holder.tv_lessonNo.setText(mData.get(position).getName());
        holder.img.setImageResource(mData.get(position).getPhoto());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        private LinearLayout item_vocabulary_n4;
        private TextView tv_lessonNo;
        private ImageView img;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            item_vocabulary_n4 =itemView.findViewById(R.id.vocabulary_item_id_n4);

            tv_lessonNo =(TextView) itemView.findViewById(R.id.lesson_no_n4);
            img=(ImageView) itemView.findViewById(R.id.vocaulary_image_n4);

        }
    }
}
