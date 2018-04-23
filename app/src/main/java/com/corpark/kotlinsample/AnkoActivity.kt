package com.corpark.kotlinsample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.onClick

class AnkoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AnkoActivityUI().setContentView(this)

    }
}

class AnkoActivityUI :AnkoComponent<AnkoActivity> {
    override fun createView(ui: AnkoContext<AnkoActivity>) = with(ui) {
        verticalLayout {
            val name = editText()
            button("Say Hello") {
                onClick { ctx.toast("Hello, ${name.text}!") }
            }
        }
    }
}
