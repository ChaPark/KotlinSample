package com.corpark.kotlinsample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_sub.*

class SubActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        initView()
    }

    private fun initView() {
        sub_text.text = intent.getStringExtra("key")

        val name: String? = null
        name?.length
    }
}
