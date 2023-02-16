package com.example.a16class

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModel

class MainActivity : AppCompatActivity() {


   companion object{
       const val TAG ="LIFE_CYCLE"
   }

    private val viewModel: MainViewModel by viewModels()

    private var counter = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)





    }
}