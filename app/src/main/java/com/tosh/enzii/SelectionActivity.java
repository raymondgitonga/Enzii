package com.tosh.enzii;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;



import butterknife.BindView;
import butterknife.ButterKnife;

public class SelectionActivity extends AppCompatActivity {
    public

    @BindView(R.id.nameView) TextView nameView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);


        ButterKnife.bind(this);


        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        nameView.setText("Welcome " + name +"! Your Top Headlines");


    }


}
