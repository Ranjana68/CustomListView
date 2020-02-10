package com.example.lenovo.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    Integer pics[]={
            R.drawable.w0,
            R.drawable.w1,
            R.drawable.w2,
            R.drawable.w3,
            R.drawable.w4,
    };
    String text[]={
            "Premchand","Mahadevi Verma","Suryakant Tripathi Nirala","Kabir Das","TulsiDas"//alpha,beta,cupcake,donat,eclears,foryo
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv=findViewById(R.id.lv);

        MyAdapter ad=new MyAdapter(this,text,pics);
        lv.setAdapter(ad);
    }
}
