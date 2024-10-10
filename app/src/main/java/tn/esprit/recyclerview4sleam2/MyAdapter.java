package tn.esprit.recyclerview4sleam2;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import java.util.zip.Inflater;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private List<Champion> champs;
    private  Context myContext;
   public MyAdapter(List<Champion> champs, Context context){
        this.champs=champs;
        this.myContext = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view= LayoutInflater.from(this.myContext).inflate(R.layout.single_item, parent, false);
            return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {


       holder.nameChamp.setText(champs.get(position).getName());
       holder.img.setImageResource(champs.get(position).getImage());
    }
        //done
    @Override
    public int getItemCount() {
        return champs.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

private ImageView img ;
private TextView nameChamp;
    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        this.img = itemView.findViewById(R.id.img);
        this.nameChamp = itemView.findViewById(R.id.nameChamp);


    }
}

}
