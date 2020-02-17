package com.hridoy.language.japani.N2.Grama;

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

public class RecyclerVewAdapterN2 extends RecyclerView.Adapter<RecyclerVewAdapterN2.MyViewHolder>{

    Context mContext;
    List<GrammarN2>mData;


    public RecyclerVewAdapterN2(Context mContext, List<GrammarN2> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v;
        v= LayoutInflater.from(mContext).inflate(R.layout.item_grammer_n2,parent,false);

        final MyViewHolder vHolder=new MyViewHolder(v);


        vHolder.item_grammer_n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "Hello"+String.valueOf(vHolder.getAdapterPosition()), Toast.LENGTH_LONG).show();
            }
        });

        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {


        holder.tv_lessonNo.setText(mData.get(position).getName());
        holder.img.setImageResource(mData.get(position).getPhoto());




    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        private LinearLayout item_grammer_n2;
        private TextView tv_lessonNo;
        private ImageView img;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            item_grammer_n2 =(LinearLayout) itemView.findViewById(R.id.grammar_item_id_n2);

            tv_lessonNo =(TextView) itemView.findViewById(R.id.lesson_no_grammer_n2);
            img=(ImageView) itemView.findViewById(R.id.grammar_image_n2);

        }
    }

}
