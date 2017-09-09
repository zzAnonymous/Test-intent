package com.example.administrator.demo09062;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Administrator on 2017/9/7.
 */

public class editinfo extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_info);

        final EditText edittext = (EditText) findViewById(R.id.etinfoo);


        Intent intent = this.getIntent();
        edittext.setText(intent.getStringExtra("textview"));

        final Button btyes= (Button) findViewById(R.id.btyes);
        btyes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent();
                intent.putExtra("edittext",edittext.getText().toString());
                setResult(20,intent);
                editinfo.this.finish();
            }
        });


    }
}
