package com.example.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.firstapp.databinding.ActivityMainBinding
import com.example.firstapp.ui.login.LoginActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.goToActivity1.setOnClickListener { goingToActivity1() }
        binding.goToActivity2.setOnClickListener { goingToActivity2() }
        binding.goToActivity3.setOnClickListener { goingToActivity3() }
        binding.goToActivity4.setOnClickListener { goingToActivity4() }
        binding.goToActivity5.setOnClickListener { goingToActivity5() }
        binding.goToActivity6.setOnClickListener { goingToActivity6() }
        binding.goToActivity7.setOnClickListener { goingToActivity7() }

    }
    private fun goingToActivity1(){
        val intent = Intent(this, MainActivity2::class.java).apply {

        }
        startActivity(intent)
    }
    private fun goingToActivity2(){
        val intent = Intent(this, MainActivity3::class.java).apply {

        }
        startActivity(intent)
    }
    private fun goingToActivity3(){
        val intent = Intent(this, MainActivity4::class.java).apply {

        }
        startActivity(intent)
    }
    private fun goingToActivity4(){
        val intent = Intent(this, FullscreenActivity::class.java).apply {

        }
        startActivity(intent)
    }
    private fun goingToActivity5(){
        val intent = Intent(this, LoginActivity::class.java).apply {

        }
        startActivity(intent)
    }
    private fun goingToActivity6(){
        val intent = Intent(this, MainActivity5::class.java).apply {

        }
        startActivity(intent)
    }
    private fun goingToActivity7(){
        val intent = Intent(this, ItemDetailFragment::class.java).apply {

        }
        startActivity(intent)
    }
}



