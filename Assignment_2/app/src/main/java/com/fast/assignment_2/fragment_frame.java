package com.fast.assignment_2;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

public class fragment_frame extends Fragment {

    Button img;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        img = getView().findViewById(R.id.btn_touchMe);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView img1 = getView().findViewById(R.id.img_bt1);
                ImageView img2 = getView().findViewById(R.id.img_bt2);
                img1.setVisibility(View.GONE);
                img2.setVisibility(View.VISIBLE);
            }
        });
        return inflater.inflate(R.layout.fragment_frame , null);
    }
}
