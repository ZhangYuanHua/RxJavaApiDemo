package com.baoyachi.rxjavaapidemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.baoyachi.rxjavaapidemo.create.CreateActivity;
import com.baoyachi.rxjavaapidemo.create.DeferActivity;
import com.baoyachi.rxjavaapidemo.create.FromActivity;
import com.baoyachi.rxjavaapidemo.create.IntervalActivity;
import com.baoyachi.rxjavaapidemo.create.JustActivity;

public class MainActivity extends AppCompatActivity
{

    private TextView mTvCreate;
    private TextView mTvJust;
    private TextView mTvFrom;
    private TextView mTvDefer;
    private TextView mTvInterval;

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

        mTvJust = (TextView) findViewById(R.id.tv_just);
        mTvJust.setOnClickListener(view -> {
            startActivity(new Intent(getBaseContext(), JustActivity.class));
        });

        mTvFrom = (TextView) findViewById(R.id.tv_from);
        mTvFrom.setOnClickListener(view -> {
            startActivity(new Intent(getBaseContext(), FromActivity.class));
        });

        mTvDefer = (TextView) findViewById(R.id.tv_defer);
        mTvDefer.setOnClickListener(view -> {
            startActivity(new Intent(getBaseContext(), DeferActivity.class));
        });

        mTvInterval = (TextView) findViewById(R.id.tv_interval);
        mTvInterval.setOnClickListener(view -> {
            startActivity(new Intent(getBaseContext(), IntervalActivity.class));
        });


    }

}
