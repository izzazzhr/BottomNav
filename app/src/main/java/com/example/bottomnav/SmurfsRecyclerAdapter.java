package com.example.bottomnav;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class SmurfsRecyclerAdapter extends RecyclerView.Adapter<SmurfsRecyclerAdapter.ViewHolder> {
    private List<SmurfsModel> smurfs;
    private OnItemClickListener<SmurfsModel> clickListener;

    public void setSmurfs(ArrayList<SmurfsModel> smurfs) {this.smurfs=smurfs;}


    public void setClickListener(OnItemClickListener<SmurfsModel> clickListener) {
        this.clickListener = clickListener;
    }




    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false );

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
       holder.onBind(smurfs.get(position));

    }

    @Override
    public int getItemCount() {
        return smurfs.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        SmurfsModel smurf;
        ImageView ivSmurfsPhoto;
        TextView tvSmurfsName;
        TextView tvSmurfsSum;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            ivSmurfsPhoto = itemView.findViewById(R.id.iv_smurfs);
            tvSmurfsName = itemView.findViewById(R.id.tv1_SmurfsName);
            tvSmurfsSum = itemView.findViewById(R.id.tv2_summary);
        }

        public void onBind(SmurfsModel smurf){
            this.smurf = smurf;
            ivSmurfsPhoto.setImageResource(smurf.getPhoto());
            tvSmurfsName.setText(smurf.getName());
            tvSmurfsSum.setText(smurf.getSummary());

        }

        @Override
        public void onClick(View v) {
            clickListener.onClick(smurf);

        }
    }

}
