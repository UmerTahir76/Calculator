package com.example.calculaterbykotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import com.example.calculaterbykotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),OnClickListener{

   private lateinit var  binding: ActivityMainBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.add.setOnClickListener(this)
        binding.subtract.setOnClickListener(this)
        binding.multiply.setOnClickListener(this)
        binding.divide.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        var firstnum =binding.firstNum.text.toString().toDouble()
        var secondnum =binding.secondNum.text.toString().toDouble()
        var result = 0.0

        when(v){
            binding.add->{
                result = firstnum+secondnum
            }
            binding.subtract->{
                result = firstnum-secondnum
            }
            binding.multiply->{
                result = firstnum*secondnum
            }
            binding.divide->{
                if (secondnum != 0.0) {
                    result = firstnum/secondnum
                } else {
                    result =Double.NaN // Display NaN for division by zero
                }
            }
        }
        binding.result.text = "Ans is $result"
    }
}