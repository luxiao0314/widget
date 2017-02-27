package com.mvvm.lux.widget.utils;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.annotation.ColorRes;
import android.support.annotation.DrawableRes;
import android.support.annotation.StringRes;
import android.support.v4.content.ContextCompat;
import android.util.DisplayMetrics;
import android.view.View;


/**
 * Created by hcc on 16/8/4 21:18
 * 100332338@qq.com
 * <p/>
 * 屏幕像素转换工具类
 */
public class DisplayUtil {


    public static int px2dp(Context context,float pxValue) {

        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (pxValue / scale + 0.5f);
    }

    public static int dp2px(Context context,float dipValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dipValue * scale + 0.5f);
    }

    public static int px2sp(Context context,float pxValue) {

        final float fontScale = context.getResources().getDisplayMetrics().scaledDensity;
        return (int) (pxValue / fontScale + 0.5f);
    }

    public static int sp2px(Context context,float spValue) {

        final float fontScale = context.getResources().getDisplayMetrics().scaledDensity;
        return (int) (spValue * fontScale + 0.5f);
    }

    public static int getScreenWidth(Context context) {

        DisplayMetrics dm = context.getResources().getDisplayMetrics();
        return dm.widthPixels;
    }

    public static int getScreenHeight(Context context) {

        DisplayMetrics dm = context.getResources().getDisplayMetrics();
        return dm.heightPixels;
    }

    public static float getDisplayDensity(Context context) {

        if (context == null) {
            return -1;
        }
        return context.getResources().getDisplayMetrics().density;
    }

    /**
     * 是否为竖屏
     *
     * @return
     */
    public static boolean isPortrait(Context context) {
        int mCurrentOrientation = context.getResources().getConfiguration().orientation;
        if (mCurrentOrientation == Configuration.ORIENTATION_PORTRAIT) {
            return true;
        } else if (mCurrentOrientation == Configuration.ORIENTATION_LANDSCAPE) {
            return false;
        }
        return false;
    }

    public static Drawable getDrawble(Context context,@DrawableRes int id){
        return ContextCompat.getDrawable(context,id);
    }

    public static int getColor(Context context,@ColorRes int id){
        return  ContextCompat.getColor(context,id);
    }

    public static String getString(Context context,@StringRes int id){
        return  context.getResources().getString(id);
    }

    public static <T extends View> T findViewById(View v, int id) {
        return (T) v.findViewById(id);
    }

}
