package com.tosh.enzii;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.graphics.Typeface;


import butterknife.BindView;
import butterknife.ButterKnife;

public class SelectionActivity extends AppCompatActivity {

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
