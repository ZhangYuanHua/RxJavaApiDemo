package com.baoyachi.rxjavaapidemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.baoyachi.rxjavaapidemo.create.CreateActivity;

public class MainActivity extends AppCompatActivity
{

    private TextView mTvCreate;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init()
    {
        mTvCreate = (TextView) findViewById(R.id.tv_create);
        mTvCreate.setOnClickListener(view -> {
            startActivity(new Intent(getBaseContext(), CreateActivity.class));
        });
    }

}
