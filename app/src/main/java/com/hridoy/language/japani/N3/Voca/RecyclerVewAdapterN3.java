package com.hridoy.language.japani.N3.Voca;

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

import com.hridoy.language.japani.N5.Voca.N5ViewIntentVoca;
import com.hridoy.language.japani.R;

import java.util.List;

public class RecyclerVewAdapterN3 extends RecyclerView.Adapter<RecyclerVewAdapterN3.MyViewHolder>{


    Context mContext;
    List<VocabularyN3> mData;

    public RecyclerVewAdapterN3(Context mContext, List<VocabularyN3> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        View v;
        v= LayoutInflater.from(mContext).inflate(R.layout.item_vocabulary_n3,parent,false);
        final MyViewHolder vHolder= new MyViewHolder(v);


        vHolder.item_vocabulary_n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 01"){
                    Intent intent = new Intent(mContext, N3ViewIntentVoca.class);

                    intent.putExtra("Lesson1",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }
                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 02"){
                    Intent intent = new Intent(mContext, N3ViewIntentVoca.class);

                    intent.putExtra("Lesson2",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }

                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 03"){
                    Intent intent = new Intent(mContext, N3ViewIntentVoca.class);

                    intent.putExtra("Lesson3",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }

                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 04"){
                    Intent intent = new Intent(mContext, N3ViewIntentVoca.class);

                    intent.putExtra("Lesson4",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }


                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 05"){
                    Intent intent = new Intent(mContext, N3ViewIntentVoca.class);

                    intent.putExtra("Lesson5",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }


                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 06"){
                    Intent intent = new Intent(mContext, N3ViewIntentVoca.class);

                    intent.putExtra("Lesson6",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }


                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 07"){
                    Intent intent = new Intent(mContext, N3ViewIntentVoca.class);

                    intent.putExtra("Lesson7",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }


                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 08"){
                    Intent intent = new Intent(mContext, N3ViewIntentVoca.class);

                    intent.putExtra("Lesson8",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }

                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 09"){
                    Intent intent = new Intent(mContext, N3ViewIntentVoca.class);

                    intent.putExtra("Lesson9",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }

                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 10"){
                    Intent intent = new Intent(mContext, N3ViewIntentVoca.class);

                    intent.putExtra("Lesson10",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }


                else{
                    Toast.makeText(mContext, "No Data Availebal", Toast.LENGTH_LONG).show();

                }
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

        private LinearLayout item_vocabulary_n3;
        private TextView tv_lessonNo;
        private ImageView img;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            item_vocabulary_n3 =itemView.findViewById(R.id.vocabulary_item_id_n3);

            tv_lessonNo =(TextView) itemView.findViewById(R.id.lesson_no_n3);
            img=(ImageView) itemView.findViewById(R.id.vocaulary_image_n3);

        }
    }
}
