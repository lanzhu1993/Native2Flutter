package com.josh.flutter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.flutter.app.FlutterFragmentActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        main_skip.setOnClickListener {
            startActivity(Intent(this,MainFlutterActivity::class.java))
        }
    }
}
