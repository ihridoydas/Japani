package com.hridoy.language.japani.N5.Grama;

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

import com.hridoy.language.japani.R;
import com.hridoy.language.japani.N5.Voca.N5ViewIntentVoca;

import java.util.List;

public class RecyclerVewAdapter extends RecyclerView.Adapter<RecyclerVewAdapter.MyViewHolder>{

    Context mContext;
    List<Grammar>mData;


    public RecyclerVewAdapter(Context mContext, List<Grammar> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v;
        v= LayoutInflater.from(mContext).inflate(R.layout.item_grammer,parent,false);

        final MyViewHolder vHolder=new MyViewHolder(v);


        vHolder.item_grammer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 01"){
                    Intent intent = new Intent(mContext, N5ViewIntentGrama.class);

                    intent.putExtra("LessonN5Grama1",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }
                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 02"){
                    Intent intent = new Intent(mContext, N5ViewIntentGrama.class);

                    intent.putExtra("LessonN5Grama2",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }

                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 03"){
                    Intent intent = new Intent(mContext, N5ViewIntentGrama.class);

                    intent.putExtra("LessonN5Grama3",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }


                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 04"){
                    Intent intent = new Intent(mContext, N5ViewIntentGrama.class);

                    intent.putExtra("LessonN5Grama4",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }

                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 05"){
                    Intent intent = new Intent(mContext, N5ViewIntentGrama.class);

                    intent.putExtra("LessonN5Grama5",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }

                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 06"){
                    Intent intent = new Intent(mContext, N5ViewIntentGrama.class);

                    intent.putExtra("LessonN5Grama6",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }

                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 07"){
                    Intent intent = new Intent(mContext, N5ViewIntentGrama.class);

                    intent.putExtra("LessonN5Grama7",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }

                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 08"){
                    Intent intent = new Intent(mContext, N5ViewIntentGrama.class);

                    intent.putExtra("LessonN5Grama8",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }

                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 09"){
                    Intent intent = new Intent(mContext, N5ViewIntentGrama.class);

                    intent.putExtra("LessonN5Grama9",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }

                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 10"){
                    Intent intent = new Intent(mContext, N5ViewIntentGrama.class);

                    intent.putExtra("LessonN5Grama10",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }

                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 11"){
                    Intent intent = new Intent(mContext, N5ViewIntentGrama.class);

                    intent.putExtra("LessonN5Grama11",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }

                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 12"){
                    Intent intent = new Intent(mContext, N5ViewIntentGrama.class);

                    intent.putExtra("LessonN5Grama12",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }

                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 13"){
                    Intent intent = new Intent(mContext, N5ViewIntentGrama.class);

                    intent.putExtra("LessonN5Grama13",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }

                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 14"){
                    Intent intent = new Intent(mContext, N5ViewIntentGrama.class);

                    intent.putExtra("LessonN5Grama14",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }

                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 15"){
                    Intent intent = new Intent(mContext, N5ViewIntentGrama.class);

                    intent.putExtra("LessonN5Grama15",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }

                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 16"){
                    Intent intent = new Intent(mContext, N5ViewIntentGrama.class);

                    intent.putExtra("LessonN5Grama16",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }

                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 17"){
                    Intent intent = new Intent(mContext, N5ViewIntentGrama.class);

                    intent.putExtra("LessonN5Grama17",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }

                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 18"){
                    Intent intent = new Intent(mContext, N5ViewIntentGrama.class);

                    intent.putExtra("LessonN5Grama18",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }

                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 19"){
                    Intent intent = new Intent(mContext, N5ViewIntentGrama.class);

                    intent.putExtra("LessonN5Grama19",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }

                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 20"){
                    Intent intent = new Intent(mContext, N5ViewIntentGrama.class);

                    intent.putExtra("LessonN5Grama20",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }

                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 21"){
                    Intent intent = new Intent(mContext, N5ViewIntentGrama.class);

                    intent.putExtra("LessonN5Grama21",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }

                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 22"){
                    Intent intent = new Intent(mContext, N5ViewIntentGrama.class);

                    intent.putExtra("LessonN5Grama22",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }

                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 23"){
                    Intent intent = new Intent(mContext, N5ViewIntentGrama.class);

                    intent.putExtra("LessonN5Grama23",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }

                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 24"){
                    Intent intent = new Intent(mContext, N5ViewIntentGrama.class);

                    intent.putExtra("LessonN5Grama24",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }

                else if(mData.get(vHolder.getAdapterPosition()).getName()=="Lesson 25"){
                    Intent intent = new Intent(mContext, N5ViewIntentGrama.class);

                    intent.putExtra("LessonN5Grama25",mData.get(vHolder.getAdapterPosition()).getName());
                    mContext.startActivity(intent);



                }






                else{
                    Toast.makeText(mContext, "No Data Availebal", Toast.LENGTH_LONG).show();

                }





                //  Toast.makeText(mContext, "lll"+String.valueOf(vHolder.getAdapterPosition()), Toast.LENGTH_LONG).show();
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

        private LinearLayout item_grammer;
        private TextView tv_lessonNo;
        private ImageView img;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            item_grammer =(LinearLayout) itemView.findViewById(R.id.grammar_item_id);

            tv_lessonNo =(TextView) itemView.findViewById(R.id.lesson_no_grammer);
            img=(ImageView) itemView.findViewById(R.id.grammar_image);

        }
    }

}
