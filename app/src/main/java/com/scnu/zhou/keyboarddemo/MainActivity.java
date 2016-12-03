package com.scnu.zhou.keyboarddemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.scnu.zhou.widget.NumberKeyboard;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NumberKeyboard numberKeyboard = (NumberKeyboard) findViewById(R.id.numberKeyboard);

        numberKeyboard.setOnInputListener(new NumberKeyboard.OnIuputListener() {
            @Override
            public void onInput(int num) {

                if (num != -1) {
                    // 输入
                }
                else{
                    // 回退
                }
            }
        });
    }
}
