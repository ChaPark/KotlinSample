package com.corpark.kotlinsample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.webkit.WebChromeClient
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_web_view.*

class WebViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)

        initWebView()
    }

    fun initWebView(){
        webview.settings.javaScriptEnabled = true
        webview.webViewClient = object: WebViewClient(){
            override fun shouldOverrideUrlLoading(view: WebView?, request: WebResourceRequest?): Boolean {
                return super.shouldOverrideUrlLoading(view, request)
            }
        }
        webview.webChromeClient = WebChromeClient()
        webview.loadUrl("http://ssunny.dgseo.info/index/index.html")
    }
}
