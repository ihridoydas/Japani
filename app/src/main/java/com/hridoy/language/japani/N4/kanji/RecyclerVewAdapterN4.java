package com.hridoy.language.japani.N4.kanji;


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

import com.hridoy.language.japani.N5.kanji.N5ViewIntentKanji;
import com.hridoy.language.japani.R;

import java.util.List;

public class RecyclerVewAdapterN4 extends RecyclerView.Adapter<RecyclerVewAdapterN4.MyViewHolder>{

    Context mContext;
    List<KanjiN4>mData;


    public RecyclerVewAdapterN4(Context mContext, List<KanjiN4> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public RecyclerVewAdapterN4.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v;
        v= LayoutInflater.from(mContext).inflate(R.layout.item_kanji,parent,false);

        final MyViewHolder vHolder=new RecyclerVewAdapterN4.MyViewHolder(v);


        vHolder.item_kanji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 01"){
                    Intent intent = new Intent(mContext, N4ViewIntentKanji.class);

                    intent.putExtra("LessonN4Kanji1",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }
                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 02"){
                    Intent intent = new Intent(mContext, N4ViewIntentKanji.class);

                    intent.putExtra("LessonN4Kanji2",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }

                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 03"){
                    Intent intent = new Intent(mContext, N4ViewIntentKanji.class);

                    intent.putExtra("LessonN4Kanji3",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }


                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 04"){
                    Intent intent = new Intent(mContext, N4ViewIntentKanji.class);

                    intent.putExtra("LessonN4Kanji4",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }

                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 05"){
                    Intent intent = new Intent(mContext, N4ViewIntentKanji.class);

                    intent.putExtra("LessonN4Kanji5",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }

                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 06"){
                    Intent intent = new Intent(mContext, N4ViewIntentKanji.class);

                    intent.putExtra("LessonN4Kanji6",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }

                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 07"){
                    Intent intent = new Intent(mContext, N4ViewIntentKanji.class);

                    intent.putExtra("LessonN4Kanji7",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }

                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 08"){
                    Intent intent = new Intent(mContext, N4ViewIntentKanji.class);

                    intent.putExtra("LessonN4Kanji8",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);

                }

                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 09"){
                    Intent intent = new Intent(mContext, N4ViewIntentKanji.class);

                    intent.putExtra("LessonN4Kanji9",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);

                }
                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 10"){
                    Intent intent = new Intent(mContext, N4ViewIntentKanji.class);

                    intent.putExtra("LessonN4Kanji10",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);

                }

                else{
                    Toast.makeText(mContext, "No Data Availebal", Toast.LENGTH_LONG).show();

                }

                //Toast.makeText(mContext, "Toast "+String.valueOf(vHolder.getAdapterPosition()), Toast.LENGTH_LONG).show();
            }
        });

        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerVewAdapterN4.MyViewHolder holder, int position) {


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
