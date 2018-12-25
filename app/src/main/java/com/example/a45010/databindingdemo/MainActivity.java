package com.example.a45010.databindingdemo;

import android.content.Intent;
import android.database.DatabaseUtils;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.a45010.databindingdemo.databinding.ActivityMain2Binding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main_2);
        //MainActivityBindin binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        ActivityMain2Binding binding = DataBindingUtil.setContentView(this,R.layout.activity_main_2);
        TestModel testModel = new TestModel();
        testModel.setName("tom");
        binding.setTest(testModel);

        UserBean userBean = new UserBean("张三");
        binding.setUser(userBean);

        binding.setClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_1){
            startActivity(new Intent(this,DoubleBindActivity.class));
        }
    }
}
