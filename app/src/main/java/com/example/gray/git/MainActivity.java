package com.example.gray.git;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //在dev上修改内容
        TextView textView=findViewById(R.id.tv);
        textView.setText("Hello Git");
    }
}
