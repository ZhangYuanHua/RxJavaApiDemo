package com.baoyachi.rxjavaapidemo.create;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.baoyachi.rxjavaapidemo.R;
import com.baoyachi.rxjavaapidemo.util.LogUtil;

import rx.Observable;
import rx.Subscriber;

public class CreateActivity extends AppCompatActivity
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
        Observable.create(new Observable.OnSubscribe<Integer>()
        {
            @Override
            public void call(Subscriber<? super Integer> subscriber)
            {
                try
                {
                    for(int i =0;i<3;i++)
                    {
                        subscriber.onNext(i);
                    }

                }catch(Exception e)
                {
                    subscriber.onError(e);
                }finally
                {
                    subscriber.onCompleted();
                }


            }
        }).subscribe(new Subscriber<Integer>()
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
