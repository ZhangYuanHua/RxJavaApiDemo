package com.baoyachi.rxjavaapidemo.create;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.baoyachi.rxjavaapidemo.R;
import com.baoyachi.rxjavaapidemo.util.LogUtil;

import rx.Observable;
import rx.Subscriber;

/**
 * 日期：16/7/17 17:25
 * <p>
 * 描述：
 */
public class FromActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        init();
    }

    private void init()
    {
        Observable.from(new Integer[]{1, 2, 3, 4}).subscribe(new Subscriber<Integer>()
        {
            @Override
            public void onCompleted()
            {
                LogUtil.i("onCompleted");
            }

            @Override
            public void onError(Throwable e)
            {
                LogUtil.i(e.getMessage());
            }

            @Override
            public void onNext(Integer integer)
            {
                LogUtil.i(integer);
            }
        });
    }
}
