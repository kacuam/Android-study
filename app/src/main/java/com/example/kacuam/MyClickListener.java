package com.example.kacuam;

import android.app.Activity;
import android.view.View;

import com.example.kacuam.util.ToastUtil;

public class MyClickListener implements View.OnClickListener {

    private Activity mActivity;

    public MyClickListener(Activity activity) {
        this.mActivity = activity;
    }

    @Override
    public void onClick(View v) {
        ToastUtil.shoeMsg(mActivity, "click...");
    }
}
