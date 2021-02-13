package com.vannet.thread

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun threadTest(view: View) {
        Toast.makeText(applicationContext,"hwsad",Toast.LENGTH_SHORT).show()
    }
}