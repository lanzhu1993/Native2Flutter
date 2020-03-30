package com.josh.flutter

import android.view.ViewGroup
import android.widget.FrameLayout
import io.flutter.app.FlutterApplication
import io.flutter.embedding.android.FlutterView
import io.flutter.embedding.engine.FlutterEngine
import io.flutter.embedding.engine.dart.DartExecutor

/**
 *    author : Josh.lu
 *    e-mail : lusq@tuya.com
 *    date   : 2020/3/30  7:25 PM
 *    desc   :
 *    version: 1.0
 */
class FlutterApp : FlutterApplication() {



    companion object{
        private lateinit var instance: FlutterApp
        private lateinit var flutterEngine: FlutterEngine
        private lateinit var flutterView: FlutterView

        @JvmStatic
        fun getInstance() = instance
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        initFlutterView()
        initFlutterEngine()
    }

    private fun initFlutterView() {
        // 通过FlutterView引入Flutter编写的页面
        flutterView = FlutterView(this)
        val lp: FrameLayout.LayoutParams = FrameLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.MATCH_PARENT
        )
    }

    private fun initFlutterEngine() {
        flutterEngine = FlutterEngine(this)
        flutterEngine.dartExecutor.executeDartEntrypoint(
            DartExecutor.DartEntrypoint.createDefault()
        )
        flutterEngine.navigationChannel.setInitialRoute("/")
        flutterView.attachToFlutterEngine(flutterEngine)
    }



    fun getFlutterView(): FlutterView {
        return flutterView
    }
}