package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.firstapp.ui.main.MainFragment

class MainActivity4 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }
}