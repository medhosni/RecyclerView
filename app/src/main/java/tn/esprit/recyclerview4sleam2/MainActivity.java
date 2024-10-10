package tn.esprit.recyclerview4sleam2;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
private RecyclerView recyclerView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler);

        List<Champion> champs = new ArrayList();

        champs.add(new Champion("ahri",R.drawable.ic_ahri));
        champs.add(new Champion("Annie",R.drawable.ic_annie));
        champs.add(new Champion("blitzcrank",R.drawable.ic_blitzcrank));
        champs.add(new Champion("nasus",R.drawable.ic_nasus));
        champs.add(new Champion("EKKO",R.drawable.ic_ekko));
        champs.add(new Champion("Ashe",R.drawable.ic_ashe));
        champs.add(new Champion("M.F",R.drawable.ic_missfortune));
        champs.add(new Champion("Thresh",R.drawable.ic_thresh));

        recyclerView.setAdapter(new MyAdapter(champs,this));

        LinearLayoutManager layoutManager = new  LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager );








    }
}