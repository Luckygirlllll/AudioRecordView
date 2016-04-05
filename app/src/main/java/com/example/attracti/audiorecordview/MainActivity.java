package com.example.attracti.audiorecordview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {


    CanvasView mCanvasView;
    //setup buttons
    Button mKick;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//example, the kick drum button
        mKick = (Button) findViewById(R.id.kick);
        //  mCanvasView = (CanvasView) findViewById(R.id.canvasView1);
        mCanvasView = new CanvasView(getApplicationContext());
        LinearLayout container = (LinearLayout) findViewById(R.id.conteiner);
        container.addView(mCanvasView);

        mKick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCanvasView.drawLine();

            }
        });
    }
}

