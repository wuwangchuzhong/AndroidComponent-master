package com.wustor.goodsmodule;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.wustor.basemodule.BaseFragment;
import com.wustor.routermodule.ReflectUtils;

public class HomeFragment extends BaseFragment {

    private TextView tvModule;
    private Button btnButton;
    private Button btn_jump_test;
    private Button btnButtontest;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_home;
    }

    @Override
    protected View initView(View parent) {
        tvModule = parent.findViewById(R.id.tv_module);
        btnButton = parent.findViewById(R.id.btn_jump);
        btn_jump_test = parent.findViewById(R.id.btn_jump_test);
        btnButtontest = parent.findViewById(R.id.btn_jump_test_module);
        tvModule.setText("首页\nGoodsModule");
        btnButton.setText("跳转到商品详情");
        btn_jump_test.setText("跳转到商品详情的module");
        btnButtontest.setText("跳转到测试Module");
        btnButton.setOnClickListener(new View.OnClickListener() {//跳转到商品详情页
            @Override
            public void onClick(View view) {
                ReflectUtils.startActivityWithName(mContext, "com.wustor.goodsmodule.GoodsDetailActivity");
            }
        });
        btn_jump_test.setOnClickListener(new View.OnClickListener() {//跳转到商品详情的demo
            @Override
            public void onClick(View view) {
                ReflectUtils.startActivityWithName(mContext, "com.wustor.goodsmodule.GoodsDetailTestActivity");
            }
        });
        //跳转到测试模块
        btnButtontest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                ReflectUtils.startActivityWithName(mContext, "com.mlh.test.MainTestActivity");
                ReflectUtils.startActivityWithName(mContext, "com.mlh.test.TestActivity");
//                Intent intent=new Intent(mContext,MainTestActivity.class);
            }
        });
        return parent;
    }
}
