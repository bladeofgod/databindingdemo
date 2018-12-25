package com.example.a45010.databindingdemo;

import android.database.DatabaseUtils;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.a45010.databindingdemo.databinding.ActivityMain2Binding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main_2);
        //MainActivityBindin binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        ActivityMain2Binding binding = DataBindingUtil.setContentView(this,R.layout.activity_main_2);
        TestModel testModel = new TestModel();
        testModel.setName("tom");
        binding.setTest(testModel);
    }
}
