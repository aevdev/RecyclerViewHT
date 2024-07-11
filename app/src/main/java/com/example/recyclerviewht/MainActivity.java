package com.example.recyclerviewht;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<State> states = new ArrayList<State>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recycler);
        StateAdapter adapter = new StateAdapter(this, states);
        recyclerView.setAdapter(adapter);

        states.add(new State("name", "russia", R.drawable.ic_launcher_background));
        states.add(new State("name", "russia", R.drawable.ic_launcher_background));
        states.add(new State("name", "russia", R.drawable.ic_launcher_background));
        states.add(new State("name", "russia", R.drawable.ic_launcher_background));
        states.add(new State("name", "russia", R.drawable.ic_launcher_background));
        states.add(new State("name", "russia", R.drawable.ic_launcher_background));
        states.add(new State("name", "russia", R.drawable.ic_launcher_background));
        states.add(new State("name", "russia", R.drawable.ic_launcher_background));
        states.add(new State("name", "russia", R.drawable.ic_launcher_background));
        states.add(new State("name", "russia", R.drawable.ic_launcher_background));
        states.add(new State("name", "russia", R.drawable.ic_launcher_background));
        states.add(new State("name", "russia", R.drawable.ic_launcher_background));
        states.add(new State("name", "russia", R.drawable.ic_launcher_background));
    }
}