package com.example.sky.sampletask;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Second extends AppCompatActivity {
    private int oncreateCounter,onPauseCounter,OnResumeCounter;
    Button btn;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        oncreateCounter++;
        TextView textView=(TextView) findViewById(R.id.activity_first);
        textView.setText("onCreate"+""+oncreateCounter);

        btn=(Button)findViewById(R.id.Button_2_1);
        final Intent intent=new Intent(this,MainActivity.class);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
            }
        });
    }
    protected void onPause() {
        super.onPause();
        onPauseCounter++;
        TextView textView=(TextView) findViewById(R.id.activity_secon);
        textView.setTextSize(16);
        textView.setText("Onpause"+""+onPauseCounter);

    }


    protected void onResume() {
        super.onResume();
        OnResumeCounter++;
        TextView textView=(TextView)findViewById(R.id.activity_third);
        textView.setTextSize(16);
        textView.setText("OnResume"+""+OnResumeCounter);
    }
}
