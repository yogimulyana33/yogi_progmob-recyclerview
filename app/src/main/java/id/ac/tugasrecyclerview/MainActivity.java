package id.ac.tugasrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    String s1[], s2[];
    int images[] = {R.drawable.facebook,R.drawable.ig,R.drawable.tw,R.drawable.yt,R.drawable.wa,R.drawable.yogimulyana};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        s1 = getResources().getStringArray(R.array.Sosial_Media);
        s2 = getResources().getStringArray(R.array.description);

        Adaptertugas adaptertugas = new Adaptertugas(this,s1,s2,images);
        recyclerView.setAdapter(adaptertugas);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
