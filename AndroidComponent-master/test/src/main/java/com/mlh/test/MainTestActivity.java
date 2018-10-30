package com.mlh.test;
import android.widget.Toast;

import com.wustor.basemodule.BaseActivity;

public class MainTestActivity extends BaseActivity {

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        Toast.makeText(mContext,"跳转到了其他模块了",Toast.LENGTH_SHORT).show();
    }
}
