package com.example.a45010.databindingdemo;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.a45010.databindingdemo.databinding.ActivityDoubleBindBinding;

public class DoubleBindActivity extends AppCompatActivity implements View.OnClickListener {

    private DoubleBindBean doubleBindBean;
    private boolean flag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_double_bind);
        //ActivityDoubleBindBinding bindBinding = DataBindingUtil.setContentView(this,R.layout.activity_double_bind);
        ActivityDoubleBindBinding bindBinding = DataBindingUtil.setContentView(this,R.layout.activity_double_bind);
        doubleBindBean = new DoubleBindBean("我是原始内容");
        bindBinding.setDoubleBindBean(doubleBindBean);
        bindBinding.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_change){
            flag = !flag;
            if (flag){
                doubleBindBean.setContent("我是更新后的内容");
            }else {
                doubleBindBean.setContent("我是原始内容");
            }
        }

    }
}
