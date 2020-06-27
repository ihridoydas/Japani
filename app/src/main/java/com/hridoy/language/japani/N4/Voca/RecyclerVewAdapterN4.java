package com.hridoy.language.japani.N4.Voca;

import android.app.Dialog;
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

import com.hridoy.language.japani.N5.Voca.Vocabulary;
import com.hridoy.language.japani.R;

import java.util.List;

public class RecyclerVewAdapterN4 extends RecyclerView.Adapter<RecyclerVewAdapterN4.MyViewHolder>{


    Context mContext;
    List<VocabularyN4> mData;

    Dialog myDialog;



    public RecyclerVewAdapterN4(Context mContext, List<VocabularyN4> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        View v;
        v= LayoutInflater.from(mContext).inflate(R.layout.item_vocabulary,parent,false);
        final MyViewHolder vHolder= new MyViewHolder(v);



        vHolder.item_vocabulary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 01"){
                    Intent intent = new Intent(mContext, N4ViewIntentVoca.class);

                    intent.putExtra("Lesson1",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }
                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 02"){
                    Intent intent = new Intent(mContext, N4ViewIntentVoca.class);

                    intent.putExtra("Lesson2",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }

                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 03"){
                    Intent intent = new Intent(mContext, N4ViewIntentVoca.class);

                    intent.putExtra("Lesson3",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }

                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 04"){
                    Intent intent = new Intent(mContext, N4ViewIntentVoca.class);

                    intent.putExtra("Lesson4",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }


                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 05"){
                    Intent intent = new Intent(mContext, N4ViewIntentVoca.class);

                    intent.putExtra("Lesson5",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }


                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 06"){
                    Intent intent = new Intent(mContext, N4ViewIntentVoca.class);

                    intent.putExtra("Lesson6",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }


                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 07"){
                    Intent intent = new Intent(mContext, N4ViewIntentVoca.class);

                    intent.putExtra("Lesson7",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }


                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 08"){
                    Intent intent = new Intent(mContext, N4ViewIntentVoca.class);

                    intent.putExtra("Lesson8",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }

                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 09"){
                    Intent intent = new Intent(mContext, N4ViewIntentVoca.class);

                    intent.putExtra("Lesson9",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }

                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 10"){
                    Intent intent = new Intent(mContext, N4ViewIntentVoca.class);

                    intent.putExtra("Lesson10",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }
                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 11"){
                    Intent intent = new Intent(mContext, N4ViewIntentVoca.class);

                    intent.putExtra("Lesson11",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }

                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 12"){
                    Intent intent = new Intent(mContext, N4ViewIntentVoca.class);

                    intent.putExtra("Lesson12",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }

                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 13"){
                    Intent intent = new Intent(mContext, N4ViewIntentVoca.class);

                    intent.putExtra("Lesson13",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }



                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 14"){
                    Intent intent = new Intent(mContext, N4ViewIntentVoca.class);

                    intent.putExtra("Lesson14",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }

                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 15"){
                    Intent intent = new Intent(mContext, N4ViewIntentVoca.class);

                    intent.putExtra("Lesson15",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }


                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 16"){
                    Intent intent = new Intent(mContext, N4ViewIntentVoca.class);

                    intent.putExtra("Lesson16",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }



                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 17"){
                    Intent intent = new Intent(mContext, N4ViewIntentVoca.class);

                    intent.putExtra("Lesson17",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }


                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 18"){
                    Intent intent = new Intent(mContext, N4ViewIntentVoca.class);

                    intent.putExtra("Lesson18",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }


                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 19"){
                    Intent intent = new Intent(mContext, N4ViewIntentVoca.class);

                    intent.putExtra("Lesson19",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }


                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 20"){
                    Intent intent = new Intent(mContext, N4ViewIntentVoca.class);

                    intent.putExtra("Lesson20",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }

                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 21"){
                    Intent intent = new Intent(mContext, N4ViewIntentVoca.class);

                    intent.putExtra("Lesson21",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }

                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 22"){
                    Intent intent = new Intent(mContext, N4ViewIntentVoca.class);

                    intent.putExtra("Lesson22",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }


                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 23"){
                    Intent intent = new Intent(mContext, N4ViewIntentVoca.class);

                    intent.putExtra("Lesson23",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }


                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 24"){
                    Intent intent = new Intent(mContext, N4ViewIntentVoca.class);

                    intent.putExtra("Lesson24",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }

                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 25"){
                    Intent intent = new Intent(mContext, N4ViewIntentVoca.class);

                    intent.putExtra("Lesson25",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }

                else{
                    Toast.makeText(mContext, "No Data Availebal", Toast.LENGTH_LONG).show();

                }

                //Toast.makeText(maContext, "Toast example"+String.valueOf(vHolder.getAdapterPosition()), Toast.LENGTH_LONG).show();
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


        public View item_vocabulary;

        private TextView tv_lessonNo;
        private ImageView img;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            item_vocabulary =itemView.findViewById(R.id.vocabulary_item_id);

            tv_lessonNo =(TextView) itemView.findViewById(R.id.lesson_no);
            img=(ImageView) itemView.findViewById(R.id.vocaulary_image);

        }
    }
}
