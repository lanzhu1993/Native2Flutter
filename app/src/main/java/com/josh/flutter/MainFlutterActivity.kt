package com.josh.flutter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main_flutterctivity.*


class MainFlutterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_flutterctivity)
        // 通过FlutterView引入Flutter编写的页面
        fl_container.addView(FlutterApp.getInstance().getFlutterView())

    }

    override fun onDestroy() {
        super.onDestroy()
        fl_container.removeAllViews()
    }
}
