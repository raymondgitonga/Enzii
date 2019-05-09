package com.tosh.enzii;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class NameActivity extends AppCompatActivity {
    private Button mNameButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);

        mNameButton = (Button) findViewById(R.id.nameButton);

        mNameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NameActivity.this, SelectionActivity.class);
                startActivity(intent);
                Toast.makeText(NameActivity.this, "Welcome", Toast.LENGTH_LONG).show();
            }
        });
    }
}
