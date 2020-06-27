package com.hridoy.language.japani.N5.kanji;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hridoy.language.japani.N5.kanji.Kanji;
import com.hridoy.language.japani.R;

import java.util.List;

public class RecyclerVewAdapter extends RecyclerView.Adapter<RecyclerVewAdapter.MyViewHolder>{

    Context mContext;
    List<Kanji>mData;


    public RecyclerVewAdapter(Context mContext, List<Kanji> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public RecyclerVewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v;
        v= LayoutInflater.from(mContext).inflate(R.layout.item_kanji,parent,false);

        final MyViewHolder vHolder=new RecyclerVewAdapter.MyViewHolder(v);


        vHolder.item_kanji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 01"){
                    Intent intent = new Intent(mContext, N5ViewIntentKanji.class);

                    intent.putExtra("LessonN5Kanji1",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }
                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 02"){
                    Intent intent = new Intent(mContext, N5ViewIntentKanji.class);

                    intent.putExtra("LessonN5Kanji2",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }

                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 03"){
                    Intent intent = new Intent(mContext, N5ViewIntentKanji.class);

                    intent.putExtra("LessonN5Kanji3",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }


                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 04"){
                    Intent intent = new Intent(mContext, N5ViewIntentKanji.class);

                    intent.putExtra("LessonN5Kanji4",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }

                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 05"){
                    Intent intent = new Intent(mContext, N5ViewIntentKanji.class);

                    intent.putExtra("LessonN5Kanji5",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }

                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 06"){
                    Intent intent = new Intent(mContext, N5ViewIntentKanji.class);

                    intent.putExtra("LessonN5Kanji6",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }

                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 07"){
                    Intent intent = new Intent(mContext, N5ViewIntentKanji.class);

                    intent.putExtra("LessonN5Kanji7",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }

                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 08"){
                    Intent intent = new Intent(mContext, N5ViewIntentKanji.class);

                    intent.putExtra("LessonN5Kanji8",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }


                else{
                    Toast.makeText(mContext, "No Data Availebal", Toast.LENGTH_LONG).show();

                }



               // Toast.makeText(mContext, "Toast example"+String.valueOf(vHolder.getAdapterPosition()), Toast.LENGTH_LONG).show();
            }
        });

        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerVewAdapter.MyViewHolder holder, int position) {


        holder.tv_lessonNo.setText(mData.get(position).getName());
        holder.img.setImageResource(mData.get(position).getPhoto());




    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        private LinearLayout item_kanji;
        private TextView tv_lessonNo;
        private ImageView img;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            item_kanji =(LinearLayout) itemView.findViewById(R.id.kanji_item_id);

            tv_lessonNo =(TextView) itemView.findViewById(R.id.lesson_no_kanji);
            img=(ImageView) itemView.findViewById(R.id.kanji_image);

        }
    }

}
