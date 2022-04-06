package com.duxiaoming.testflutter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import com.alibaba.fastjson.JSONObject;
import com.duxiaoming.flutter.MainActivity;


/**
 * @author duxiaoming
 * @date 2022/3/9
 */
public class HomeActivity extends Activity {
    private final static String ROUTE = "route";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);
    }

    public void firstBtnClicked(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("path", "saasOrderDetail");
        intent.putExtra(ROUTE, jsonObject.toJSONString());
        startActivity(intent);
    }

}
