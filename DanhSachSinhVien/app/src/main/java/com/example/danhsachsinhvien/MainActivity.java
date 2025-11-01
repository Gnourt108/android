package com.example.danhsachsinhvien;

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
    RecyclerView rcvGroups;
    GroupAdapter groupAdapter;
    List<Group> groupList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        rcvGroups = findViewById(R.id.rcvGroups);
        rcvGroups.setLayoutManager(new LinearLayoutManager(this));

        groupList = new ArrayList<>();
        groupList.add(new Group("BTS", 9.8, "ARMY", R.drawable.bts));
        groupList.add(new Group("BLACKPINK", 9.7, "BLINK", R.drawable.blackpink));
        groupList.add(new Group("Twice", 9.5, "ONCE", R.drawable.twice));
        groupList.add(new Group("EXO", 9.3, "EXO-L", R.drawable.exo));
        groupList.add(new Group("Red Velvet", 9.2, "ReVeluv", R.drawable.redvelvet));
        groupList.add(new Group("Seventeen", 9.4, "Carat", R.drawable.seventeen));
        groupList.add(new Group("Stray Kids", 9.1, "Stay", R.drawable.straykids));
        groupList.add(new Group("ITZY", 8.9, "Midzy", R.drawable.itzy));
        groupList.add(new Group("NCT", 9.0, "NCTzen", R.drawable.nct));
        groupList.add(new Group("NewJeans", 9.6, "Bunnies", R.drawable.newjeans));

        groupAdapter = new GroupAdapter(groupList);
        rcvGroups.setAdapter(groupAdapter);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}