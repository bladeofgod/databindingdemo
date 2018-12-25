package com.example.a45010.databindingdemo;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

public class DoubleBindBean extends BaseObservable {

    private String content;

    public DoubleBindBean(String content) {
        this.content = content;
    }

    @Bindable
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        notifyPropertyChanged(BR.content);
    }
}
