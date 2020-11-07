package com.example.shoppingmall;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //private  static  final  String TAG="MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        Log.i("MainActivity","onCreate()");

        Button normalBut = findViewById(R.id.start_normal_activity);
        normalBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this,NormalActivity.class);
                startActivity(intent1);
            }
        });
        Button dialogBtu = findViewById(R.id.start_dialog_activity);
        dialogBtu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this,DialogActivity.class);
                startActivity(intent2);
            }
        });



    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("MainActivity","onCreate()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("MainActivity","onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("MainActivity","onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("MainActivity","onCreate()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("MainActivity","onDestroy()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("MainActivity","onRestart()");
    }
}
