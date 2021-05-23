package com.kitty.crazyshape

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, "作者：朱小萍", Toast.LENGTH_LONG).show()


        imgNext.setOnLongClickListener(object: View.OnLongClickListener{
            override fun onLongClick(p0: View?):Boolean {
                intent = Intent(this@MainActivity, Gamesactivity::class.java)
                startActivity(intent)
                return true
            }
        })

    }
}