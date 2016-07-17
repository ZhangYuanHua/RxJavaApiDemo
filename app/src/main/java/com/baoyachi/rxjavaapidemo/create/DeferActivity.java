package com.baoyachi.rxjavaapidemo.create;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.baoyachi.rxjavaapidemo.R;
import com.baoyachi.rxjavaapidemo.util.LogUtil;

import rx.Observable;
import rx.Subscriber;
import rx.functions.Func0;

/**
 * 日期：16/7/17 17:17
 * <p>
 * 描述：
 */
public class DeferActivity extends AppCompatActivity
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
        final StringBuilder man = new StringBuilder("小明");

        Observable.defer(new Func0<Observable<String>>()
        {
            @Override
            public Observable<String> call()
            {
                return Observable.just(man.toString());
            }
        }).subscribe(new Subscriber<String>()
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
            public void onNext(String s)
            {
                LogUtil.i(s.toString());
            }
        });

        man.setLength(0);
        man.append("小红 女 5岁");

    }


}
