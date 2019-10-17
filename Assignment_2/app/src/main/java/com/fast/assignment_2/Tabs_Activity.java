package com.fast.assignment_2;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Tabs_Activity extends AppCompatActivity {


    TextView Constraint , Linear , Relative , Frame;
    ViewPager viewpager ;
    PagerViewAdapter pagerView_adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabs_);

        Constraint = findViewById(R.id.txt_Cons);
        Linear = findViewById(R.id.txt_lin);
        Relative = findViewById(R.id.txt_Rel);
        Frame = findViewById(R.id.txt_frm);

        viewpager = findViewById(R.id.fragment_container);
        pagerView_adapter = new PagerViewAdapter(getSupportFragmentManager());

        viewpager.setAdapter(pagerView_adapter);

        Constraint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewpager.setCurrentItem(1);
            }
        });

        Linear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewpager.setCurrentItem(3);
            }
        });

        Relative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewpager.setCurrentItem(0);
            }
        });

        Frame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewpager.setCurrentItem(2);
            }
        });




        viewpager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {
                onChangeTab(i);
            }


            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });
    }

    private void onChangeTab(int position) {

        if(position == 0)
        {
            Relative.setTextSize(20);
            Constraint.setTextSize(15);
            Frame.setTextSize(15);
            Linear.setTextSize(15);
            Toast.makeText(Tabs_Activity.this, "Relative", Toast.LENGTH_SHORT).show();
        }
        else if(position == 1)
        {
            Relative.setTextSize(15);
            Constraint.setTextSize(20);
            Frame.setTextSize(15);
            Linear.setTextSize(15);
            Toast.makeText(Tabs_Activity.this, "Constraint", Toast.LENGTH_SHORT).show();
        }
        else if(position == 2)
        {
            Relative.setTextSize(15);
            Constraint.setTextSize(15);
            Frame.setTextSize(20);
            Linear.setTextSize(15);
            Toast.makeText(Tabs_Activity.this, "Frame", Toast.LENGTH_SHORT).show();
        }
        else if(position == 3)
        {
            Relative.setTextSize(15);
            Constraint.setTextSize(15);
            Frame.setTextSize(15);
            Linear.setTextSize(20);
            Toast.makeText(Tabs_Activity.this, "Linear", Toast.LENGTH_SHORT).show();
        }
        else Toast.makeText(Tabs_Activity.this, "Tab Change Failed!", Toast.LENGTH_LONG).show();

    }
}
