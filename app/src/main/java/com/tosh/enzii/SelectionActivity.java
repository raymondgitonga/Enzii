package com.tosh.enzii;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class SelectionActivity extends AppCompatActivity {

    private TextView nameView;
    private ListView newsView;
    private String[] headlines = new String[] {"Petitioners: Stop Huduma Namba registration",
            "South Africa demonstrated elections can be peaceful",
            "Ignore summons at your own peril, Senate warns governors",
            "Inside Raila 2022 game plan as party lines up rallies",
            "Senator in Sh400m gold scam involving UAE royal family",
            "Fire erupts again in Mt Kenya Forest in suspected arson",
            "Tanzanian arrested for selling daughter for body parts",
            "Julius Malema fires revolutionary signals in South Africa's election results",
            "Local banks take Sh8 billion hit in KQ shares",
            "The 10 Best Travel Apps for Exploring the World"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);


        nameView =(TextView) findViewById(R.id.nameView);
        newsView = (ListView) findViewById(R.id.newsView);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_2, headlines);
        newsView.setAdapter(adapter);

        newsView.setOn
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        nameView.setText("Welcome " + name +"!");

    }
}
