package com.baoyachi.rxjavaapidemo.util;

import android.util.Log;

import com.baoyachi.rxjavaapidemo.app.RxJavaApplication;

/**
 * 日期：16/7/17 17:09
 * <p>
 * 描述：
 */
public class LogUtil
{
    public static void i(Object message)
    {
        Log.i(RxJavaApplication.TAG,message+"");
    }

}
