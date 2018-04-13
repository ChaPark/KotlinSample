package com.corpark.kotlinsample

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.intentFor

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        onClickListener()

    }

    private fun onClickListener() {
        sub_btn.setOnClickListener {
            Toast.makeText(this, "hello", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, SubActivity::class.java)
            intent.putExtra("key", "gogogo!")
            startActivity(intent)
        }

        anko_btn.setOnClickListener {
            startActivity(intentFor<AnkoActivity>())
        }
    }


    data class Person(val name: String,
                      val email: String,
                      val age: Int)
    val john = Person("John", "John@gmail.com", 122)
}
