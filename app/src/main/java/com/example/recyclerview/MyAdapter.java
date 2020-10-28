package com.example.recyclerview;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private Context mContext;
    private List<Product> productList;
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView= LayoutInflater.from(mContext).inflate(R.layout.items,parent,false);
        return new ViewHolder((mItemView));
    }
    @Override
    public void onBindViewHolder(@NonNull MyAdapter.ViewHolder holder, int position) {
        Product singleProduct=productList.get(position);
        holder.txtProduct.setText(singleProduct.getNom());
        holder.imgProduct.setBackgroundResource(singleProduct.getImage());
    }
    @Override
    public int getItemCount() {
        return productList.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgProduct;
        private TextView txtProduct;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgProduct=itemView.findViewById(R.id.imageView);
            txtProduct=itemView.findViewById(R.id.textView);
        }
    }
    MyAdapter(Context mContext,List<Product>productList){
        this.mContext=mContext;
        this.productList=productList;
    }
}
