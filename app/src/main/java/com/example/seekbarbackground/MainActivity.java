package com.example.seekbarbackground;

import androidx.appcompat.app.AppCompatActivity;

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
        this.seekBar.setMax(7);
        this.parentLayout = findViewById(R.id.relParent);



        this.seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progressValue, boolean fromUser) {
                setColor(progressValue);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

    }


    public void setColor(int progressValue) {
        int color = progressValue;
        switch (color){
            case 0 :
                color = Color.WHITE;
                break;
            case 1 :
                color = Color.YELLOW;
                break;
            case 2:
                color = Color.RED;
                break;
            case 3 :
                color = Color.MAGENTA;
                break;
            case 4:
                color = Color.GREEN;
                break;
            case 5 :
                color = Color.BLUE;
                break;
            case 6 :
                color = Color.GRAY;
                break;
            case 7:
                color=Color.BLACK;
                break;
        }

        this.parentLayout.setBackgroundColor(color);
    }

}