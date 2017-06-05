package com.mvvm.lux.widget.loading.factory;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.view.SimpleDraweeView;
import com.mvvm.lux.widget.R;
import com.shuyu.frescoutil.FrescoImageUtil;

/**
 * 自定义样式LoadingBar的例子
 * author  dengyuhan
 * created 2017/4/16 05:13
 */
public class CustomLoadingFactory implements LoadingFactory {

    @Override
    public View onCreateView(ViewGroup parent) {
        View loadingView = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_custom, parent, false);
        SimpleDraweeView iv_icon = (SimpleDraweeView) loadingView.findViewById(R.id.iv_icon);
        Uri uri = FrescoImageUtil.getUriFromRes(R.drawable.buka_loading);
        DraweeController controller = Fresco.newDraweeControllerBuilder()
                .setUri(uri)
                .setAutoPlayAnimations(true)    //设置加载动画
                .build();
        iv_icon.setController(controller);
        return loadingView;
    }
}
