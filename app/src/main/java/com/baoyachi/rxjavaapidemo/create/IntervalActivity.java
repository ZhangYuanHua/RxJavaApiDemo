package com.baoyachi.rxjavaapidemo.create;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.baoyachi.rxjavaapidemo.R;

/**
 * 日期：16/7/17 18:43
 * <p>
 * 描述：
 */
public class IntervalActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView tvContent = (TextView) findViewById(R.id.tv_content);
        tvContent.setText(this.getClass().getSimpleName());

        init();

    }

    private void init()
    {

    }
}
