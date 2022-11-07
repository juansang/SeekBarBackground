package com.example.seekbarbackground;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    private SeekBar seekBar;
    private RelativeLayout parentLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.seekBar = findViewById(R.id.seekbar);
        this.seekBar.setMax(100);
        this.parentLayout = findViewById(R.id.relParent);



        this.seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progressValue, boolean fromUser) {
                setBackgroundColor(progressValue);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

    }


    public void setBackgroundColor(int progressValue) {
        int color = progressValue;
        if(color>=0 && color<=33.3){
            color = ContextCompat.getColor(this, R.color.yellow);
        }else if(color>33.3 && color<=66.6){
            color = ContextCompat.getColor(this, R.color.green);
        }else if(color>66.6 && color<=100){
            color = ContextCompat.getColor(this, R.color.blue);
        }

        this.parentLayout.setBackgroundColor(color);
    }

}