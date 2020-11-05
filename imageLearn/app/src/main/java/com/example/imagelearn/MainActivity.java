package com.example.imagelearn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void changeImg(View view){
        ImageView iv = (ImageView) findViewById(R.id.imgLogo);
        Log.i("INFO", "UPDATE IMAGE SOURCE");
        if(iv.getTag() != null && iv.getTag().toString().equals("pic1")){
            Log.i("INFO", "IMG PIC 2");
            iv.setImageResource(R.drawable.img_republic);
            iv.setTag("pic2");
        }else{
            Log.i("INFO", "IMG PIC 1");
            iv.setImageResource(R.drawable.img_rebel);
            iv.setTag("pic1");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
