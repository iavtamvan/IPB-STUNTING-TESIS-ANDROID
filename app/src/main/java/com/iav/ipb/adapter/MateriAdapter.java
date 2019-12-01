package com.iav.ipb.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.iav.ipb.R;
import com.iav.ipb.model.MateriModel;

import java.util.ArrayList;

public class MateriAdapter extends
        RecyclerView.Adapter<MateriAdapter.ViewHolder>{

    private Context context;
    private ArrayList<MateriModel> listmateri;

    public ArrayList<MateriModel> getList(){
        return listmateri;
    }



    public void setListmateri(ArrayList<MateriModel> listmateri){
        this.listmateri = listmateri;
    }

    public MateriAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public MateriAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_materi, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.tvNama.setText(getList().get(position).getName());

        Glide.with(context)
                .load(getList().get(position).getPhoto())
                .into(holder.ivGambar);

//        holder.cvKKlik.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                context.startActivity(new Intent(context, KuisActivity.class));
//            }
//        });
    }

    @Override
    public int getItemCount() {
        return getList().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView ivGambar;
        private TextView tvNama;
        private CardView cvKKlik;

        public ViewHolder(View itemView) {
            super(itemView);
            ivGambar = (ImageView) itemView.findViewById(R.id.iv_list);
            tvNama = (TextView) itemView.findViewById(R.id.tv_nama_list);
//            cvKKlik = itemView.findViewById(R.id.cvKlik);

        }
    }
}
