package com.example.user.a1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    private int mCounter = 0;
    Button btn;
    TextView txv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.btn);
        txv = (TextView) findViewById(R.id.txv);

       btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               mCounter++;
               txv.setText(Integer.toString(mCounter));
           }
       });
    }
}
