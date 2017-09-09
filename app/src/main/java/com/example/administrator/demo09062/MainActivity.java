package com.example.administrator.demo09062;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView txt= (TextView) findViewById(R.id.txt);
        Button nextbt= (Button) findViewById(R.id.nextbt1);
        nextbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle=new Bundle();
                bundle.putString("textview", txt.getText().toString());
                Intent intent=new Intent(MainActivity.this,editinfo.class);
                intent.putExtras(bundle);
                startActivityForResult(intent,100);
            }
        });
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        Toast.makeText(this,data.getStringExtra("edittext"),Toast.LENGTH_LONG).show();
        super.onActivityResult(requestCode, resultCode, data);
        TextView text= (TextView) findViewById(R.id.txt);
        text.setText(data.getStringExtra("edittext"));

    }
}
