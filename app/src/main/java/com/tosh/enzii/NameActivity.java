package com.tosh.enzii;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class NameActivity extends AppCompatActivity {
    @BindView(R.id.nameButton) Button mNameButton;
    @BindView(R.id.editText) EditText mEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);

        ButterKnife.bind(this);

        mEditText.addTextChangedListener(nameTextWatcher);

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
    private TextWatcher nameTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            String nameInput = mEditText.getText().toString().trim();

            mNameButton.setEnabled(!nameInput.isEmpty());

        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };
}
