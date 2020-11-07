package com.example.shoppingmall;

import android.content.Intent;
import android.net.Uri;
import android.nfc.Tag;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class FirstActivity extends AppCompatActivity {
    private final static String TAG = "FirstActivity";
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1){
            if (resultCode == RESULT_OK){
                String msg = data.getStringExtra("msg");
                Log.d(TAG,"mag ="+ msg);
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);

        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               /* Bundle bundle = new Bundle();
                String myname = "FHYJY";
                String mynumber = "20201023";*/


                //隐式intent示例1,打开拨号盘
             /* Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:13850674334"));
                startActivity(intent);*/

                //隐式intent示例2，使用intent打开网页
                /* Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.baidu.com"));
                startActivity(intent);*/

                //示例3需要启动的界面返回结果（secondactivity）
               /* Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
                startActivityForResult(intent,1);*/

                //示例4：传递复杂数据，借助于Bundle，比如传递一个类对象
                Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
                Bundle bundle = new Bundle();
                Message message = new Message("张三","M",21);
                bundle.putParcelable("msg",message);
                intent.putExtra("Message",bundle);
                startActivity(intent);
            }
        });

    }

}
