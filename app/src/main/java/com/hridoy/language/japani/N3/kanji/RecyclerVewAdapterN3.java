package com.hridoy.language.japani.N3.kanji;


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



                if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 01"){
                    Intent intent = new Intent(mContext, N3ViewIntentKanji.class);

                    intent.putExtra("LessonN3Kanji1",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }
                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 02"){
                    Intent intent = new Intent(mContext, N3ViewIntentKanji.class);

                    intent.putExtra("LessonN3Kanji2",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }

                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 03"){
                    Intent intent = new Intent(mContext, N3ViewIntentKanji.class);

                    intent.putExtra("LessonN3Kanji3",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }


                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 04"){
                    Intent intent = new Intent(mContext, N3ViewIntentKanji.class);

                    intent.putExtra("LessonN3Kanji4",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }

                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 05"){
                    Intent intent = new Intent(mContext, N3ViewIntentKanji.class);

                    intent.putExtra("LessonN3Kanji5",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }

                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 06"){
                    Intent intent = new Intent(mContext, N3ViewIntentKanji.class);

                    intent.putExtra("LessonN3Kanji6",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }

                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 07"){
                    Intent intent = new Intent(mContext, N3ViewIntentKanji.class);

                    intent.putExtra("LessonN3Kanji7",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }

                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 08"){
                    Intent intent = new Intent(mContext, N3ViewIntentKanji.class);

                    intent.putExtra("LessonN3Kanji8",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }


                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 09"){
                    Intent intent = new Intent(mContext, N3ViewIntentKanji.class);

                    intent.putExtra("LessonN3Kanji9",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }


                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 10"){
                    Intent intent = new Intent(mContext, N3ViewIntentKanji.class);

                    intent.putExtra("LessonN3Kanji10",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }


                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 11"){
                    Intent intent = new Intent(mContext, N3ViewIntentKanji.class);

                    intent.putExtra("LessonN3Kanji1",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }


                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 12"){
                    Intent intent = new Intent(mContext, N3ViewIntentKanji.class);

                    intent.putExtra("LessonN3Kanji12",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }

                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 13"){
                    Intent intent = new Intent(mContext, N3ViewIntentKanji.class);

                    intent.putExtra("LessonN3Kanji13",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }

                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 14"){
                    Intent intent = new Intent(mContext, N3ViewIntentKanji.class);

                    intent.putExtra("LessonN3Kanji14",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }

                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 15"){
                    Intent intent = new Intent(mContext, N3ViewIntentKanji.class);

                    intent.putExtra("LessonN3Kanji15",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }


                else{
                    Toast.makeText(mContext, "No Data Availebal", Toast.LENGTH_LONG).show();

                }


                //Toast.makeText(mContext, "Toast Hridoy "+String.valueOf(vHolder.getAdapterPosition()), Toast.LENGTH_LONG).show();
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
