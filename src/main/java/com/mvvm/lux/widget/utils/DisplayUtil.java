package com.mvvm.lux.widget.utils;

import android.content.res.Configuration;
import android.util.DisplayMetrics;

import com.mvvm.lux.framework.BaseApplication;

/**
 * Created by hcc on 16/8/4 21:18
 * 100332338@qq.com
 * <p/>
 * 屏幕像素转换工具类
 */
public class DisplayUtil {

    private static BaseApplication sContext = BaseApplication.getAppContext();

    public static int px2dp(float pxValue) {

        final float scale = sContext.getResources().getDisplayMetrics().density;
        return (int) (pxValue / scale + 0.5f);
    }

    public static int dp2px(float dipValue) {
        final float scale = sContext.getResources().getDisplayMetrics().density;
        return (int) (dipValue * scale + 0.5f);
    }

    public static int px2sp(float pxValue) {

        final float fontScale = sContext.getResources().getDisplayMetrics().scaledDensity;
        return (int) (pxValue / fontScale + 0.5f);
    }

    public static int sp2px(float spValue) {

        final float fontScale = sContext.getResources().getDisplayMetrics().scaledDensity;
        return (int) (spValue * fontScale + 0.5f);
    }

    public static int getScreenWidth() {

        DisplayMetrics dm = sContext.getResources().getDisplayMetrics();
        return dm.widthPixels;
    }

    public static int getScreenHeight() {

        DisplayMetrics dm = sContext.getResources().getDisplayMetrics();
        return dm.heightPixels;
    }

    public static float getDisplayDensity() {

        if (sContext == null) {
            return -1;
        }
        return sContext.getResources().getDisplayMetrics().density;
    }

    /**
     * 是否为竖屏
     *
     * @return
     */
    public static boolean isPortrait() {
        int mCurrentOrientation = sContext.getResources().getConfiguration().orientation;
        if (mCurrentOrientation == Configuration.ORIENTATION_PORTRAIT) {
            return true;
        } else if (mCurrentOrientation == Configuration.ORIENTATION_LANDSCAPE) {
            return false;
        }
        return false;
    }
}
