package com.thvc.beeway.adapter;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;

import java.util.ArrayList;

/**
 * 项目名称：Beeway
 * 类描述：ViewPager适配器，用于程序引导页面、主界面轮播图
 * 创建人：谢庆华.
 * 创建时间：2015/8/12 14:34
 * 修改人：Administrator
 * 修改时间：2015/8/12 14:34
 * 修改备注：
 */
public class ViewPagerAdapter extends PagerAdapter{
    //界面列表
    private ArrayList<View> views;

    public ViewPagerAdapter(ArrayList<View> views){
        this.views = views;
    }

    /**
     * 获得当前界面数
     */
    @Override
    public int getCount() {
        if (views != null) {
            return views.size();
        }
        return 0;
    }

    /**
     * 初始化position位置的界面
     */
    @Override
    public Object instantiateItem(View view, int position) {

        ((ViewPager) view).addView(views.get(position), 0);

        return views.get(position);
    }

    /**
     * 判断是否由对象生成界面
     */
    @Override
    public boolean isViewFromObject(View view, Object arg1) {
        return (view == arg1);
    }

    /**
     * 销毁position位置的界面
     */
    @Override
    public void destroyItem(View view, int position, Object arg2) {
        ((ViewPager) view).removeView(views.get(position));
    }

}
