package com.example.shoppingmall;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    private final static String TAG = "SecondActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);

        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("msg","data from SecondActivity");//intent.putExtra:传递数据
                setResult(RESULT_OK,intent);//RESULT传递状态（(RESULT_OK/CANCELED），intent传递数据
                finish();

            }
        });
        Intent i = getIntent();
        Bundle bundle = i.getBundleExtra("msg");
        if (bundle != null){
            Message msg = (Message) bundle.get("msg");
            Log.d(TAG,"mag ="+ msg);
        }


    }

}
