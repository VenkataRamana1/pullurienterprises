package com.img.pulluri;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class titleAdapter extends RecyclerView.Adapter<titleAdapter.MyViewHolder> {
    private Context mContext;
    private ArrayList<String> titleList;
    private CustomeItemClickListener clickListener;

    public titleAdapter(Context mContext, ArrayList<String> titleList, CustomeItemClickListener clickListener) {
        this.mContext = mContext;
        this.titleList = titleList;
        this.clickListener = clickListener;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.title_layout,viewGroup,false);
        final MyViewHolder viewHolder = new MyViewHolder(view);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickListener.onItemClick(v,viewHolder.getPosition());
            }
        });
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int position) {
        myViewHolder.titleText.setText(titleList.get(position).replace("_"," "));
    }

    @Override
    public int getItemCount() {
        return titleList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
    TextView titleText;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            titleText = (TextView) itemView.findViewById(R.id.title_text);
        }
    }
}
