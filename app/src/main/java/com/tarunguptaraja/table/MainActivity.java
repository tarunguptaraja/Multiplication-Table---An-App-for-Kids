package com.tarunguptaraja.table;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
SeekBar seekBar;
TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        seekBar = (SeekBar)findViewById(R.id.seekBar);
        text = (TextView)findViewById(R.id.text);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress,
                                          boolean fromUser) {
               progress+= 2;
               //Toast.makeText(getApplicationContext(),"seekbar progress: "+progress, Toast.LENGTH_SHORT).show();
                int p = seekBar.getProgress()+2;
                text.setText(String.valueOf(p));


            }



            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
//                Toast.makeText(getApplicationContext(),"seekbar touch started!", Toast.LENGTH_SHORT).show();
                int p = seekBar.getProgress()+2;
                text.setText(String.valueOf(p));


            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                int p = seekBar.getProgress() +2;
                TextView output = (TextView) findViewById(R.id.output);
                String temp = p +" x "+ 1+ " = "+ p;
                int x;
                for(int i=2;i<=10;i++){
                    x=p*i;
                    temp += "\n"+p +" x "+ i+ " = "+ x;
                }
                output.setText(temp);
            }
        });

}

}