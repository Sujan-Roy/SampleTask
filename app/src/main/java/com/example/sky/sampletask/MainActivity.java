package com.example.sky.sampletask;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int oncreateCounter,onPauseCounter,OnResumeCounter;
    private
    Button btn,btn1;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        oncreateCounter++;
        TextView textView=(TextView) findViewById(R.id.activity_first);
        textView.setText("onCreate"+""+oncreateCounter);
        btn1=(Button)findViewById(R.id.Button_one_2);


        final Intent intent=new Intent(this,Second.class);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
            }
        });

    }

    @Override
    protected void onPause() {
        super.onPause();
        onPauseCounter++;
        TextView textView=(TextView) findViewById(R.id.activity_second);
        textView.setTextSize(16);
        textView.setText("Onpause"+""+onPauseCounter);

    }

    @Override
    protected void onResume() {
        super.onResume();
        OnResumeCounter++;
        TextView textView=(TextView)findViewById(R.id.activity_third);
        textView.setTextSize(16);
        textView.setText("OnResume"+""+OnResumeCounter);
    }
}
