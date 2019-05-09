package com.tosh.enzii;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class NameActivity extends AppCompatActivity {
    private Button mNameButton;
    private EditText mEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);

        mNameButton = (Button) findViewById(R.id.nameButton);
        mEditText = (EditText) findViewById(R.id.editText);

        mNameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = mEditText.getText().toString();
                Intent intent = new Intent(NameActivity.this, SelectionActivity.class);
                intent.putExtra("name", name);
                startActivity(intent);
                Toast.makeText(NameActivity.this, "Welcome", Toast.LENGTH_LONG).show();
            }
        });
    }
}
