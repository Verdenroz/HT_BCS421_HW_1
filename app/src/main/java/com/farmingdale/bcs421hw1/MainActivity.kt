package com.farmingdale.bcs421hw1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import java.io.Console

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var t1 = findViewById<TextView>(R.id.greeting)
        findViewById<Button>(R.id.introButton)
            .setOnClickListener {
                Log.d("test", "Hello World! by " + resources.getString(R.string.author))
                t1.text = "The video links in module 1 were broken so I assume all we had to do is make an empty views project and share it to github -" + resources.getString(R.string.author)
            }

    }
}