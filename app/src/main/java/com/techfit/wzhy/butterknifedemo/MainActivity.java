package com.techfit.wzhy.butterknifedemo;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatImageView;
import android.widget.TextView;

import butterknife.BindColor;
import butterknife.BindDrawable;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tv)
    TextView mTv;
    private int mCount = 0;//计数

    //绑定字符串
    @BindString(R.string.app_name)
    String mAppName;
    //绑定颜色
    @BindColor(R.color.colorPrimary)
    int mColor;
    @BindDrawable(R.mipmap.ic_launcher)
    Drawable mLauncher;
    @BindView(R.id.iv)
    AppCompatImageView mIv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //绑定ButterKnife
        ButterKnife.bind(this);
    }

    //按钮点击事件
    @OnClick(R.id.btn)
    public void changeText() {
        mTv.setText(mAppName + "：按钮被点击了" + (++mCount) + "次");
        if (mCount > 1) return;
        mTv.setTextColor(mColor);
        mIv.setImageDrawable(mLauncher);
    }
}
