package com.wustor.cartmodule;

import com.wustor.basemodule.BaseActivity;
//购物车Module中的购物
public class CartActivity extends BaseActivity {

    @Override
    protected int getLayoutId() {
        return R.layout.activity_cart;
    }

    @Override
    protected void initView() {
        setTitle("购物车");
    }

}
