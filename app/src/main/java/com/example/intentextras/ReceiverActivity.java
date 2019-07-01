package com.example.intentextras;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toolbar;

public class ReceiverActivity extends AppCompatActivity {
    TextView tvName;
    TextView tvAge;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receiver);
        Toolbar toolbar=findViewById(R.id.toolbar);
        Bundle extras=getIntent().getExtras();
        if(extras!=null);
        String names=extras.getString("etName");
        String ages=extras.getString("etAge");
    }





    

}
