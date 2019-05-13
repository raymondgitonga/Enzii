package com.tosh.enzii;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.graphics.Typeface;


import butterknife.BindView;
import butterknife.ButterKnife;

public class SelectionActivity extends AppCompatActivity {

    @BindView(R.id.nameView) TextView nameView;
    @BindView(R.id.newsView) ListView mNewsView;
    private String[] headlines = new String[] {"Petitioners: Stop Huduma Namba registration",
            "South Africa demonstrated elections can be peaceful",
            "Ignore summons at your own peril, Senate warns governors",
            "Inside Raila 2022 game plan as party lines up rallies",
            "Senator in Sh400m gold scam involving UAE royal family",
            "Fire erupts again in Mt Kenya Forest in suspected arson",
            "Tanzanian arrested for selling daughter for body parts",
            "Julius Malema fires revolutionary signal in South Africa's election results",
            "Local banks take Sh8 billion hit in KQ shares",
            "The 10 Best Travel Apps for Exploring the World"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);

//        Typeface mediumFont = Typeface.createFromAsset(getAssets(), "fonts/Medium.ttf");
//        nameView.setTypeface(mediumFont);

        ButterKnife.bind(this);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, headlines);
        mNewsView.setAdapter(adapter);

        mNewsView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String headlines =((TextView)view).getText().toString();
                Toast.makeText(SelectionActivity.this, "Preparing your news", Toast.LENGTH_LONG).show();
            }
        });
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        nameView.setText("Welcome " + name +"!");

    }
}
