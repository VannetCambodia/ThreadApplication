package com.vannet.thread

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {
    var txt:TextView? = null
    val msg1:String = "love gfg"
    val msg2:String = "not gfg"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txt = findViewById(R.id.tv1)
    }

    fun testThread(view: View) {
        thread {
            while (true){
                // Update Text View at Current
                // iteration
                runOnUiThread { txt!!.text = msg1}

                // Thread sleep for 1 sec
                Thread.sleep(1000)

                // Update Text View at Current
                // iteration
                runOnUiThread { txt!!.text = msg2 }

                // Thread sleep for 1 sec
                Thread.sleep(1000)
            }
        }
    }
}