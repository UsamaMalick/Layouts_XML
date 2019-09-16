package com.fast.assignment_2;


import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.Objects;

public class LayOuts extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lay_outs);

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);


        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_addPhoto:
                        Toast.makeText(LayOuts.this, "Photo Add Fragment", Toast.LENGTH_LONG).show();
                        break;
                    case R.id.action_search:
                        Toast.makeText(LayOuts.this, "Search Fragment", Toast.LENGTH_LONG).show();
                        break;
                    case R.id.action_profile:
                        Toast.makeText(LayOuts.this, "User Profile", Toast.LENGTH_LONG).show();
                        break;
                    case R.id.action_likes:
                        Toast.makeText(LayOuts.this, "Reacts", Toast.LENGTH_LONG).show();
                        break;
                    case R.id.action_home:
                        Toast.makeText(LayOuts.this, "Home Fragment", Toast.LENGTH_LONG).show();
                        break;
                }
                return true;
            }
        });

    }
}
