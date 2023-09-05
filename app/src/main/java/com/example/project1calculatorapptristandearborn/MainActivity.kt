package com.example.project1calculatorapptristandearborn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.project1calculatorapptristandearborn.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    fun clear(view: View) {
        binding.answer.text=""
    }
    fun negative(view: View) {
        if (view is Button){

        }
    }
    fun percent(view: View) {
        if (view is Button){

            binding.answer.text=""

        }


    }
    fun divide(view: View) {
        if (view is Button){
            binding.answer.append(view.text)
        }
    }
    fun digit(view: View) {
        if (view is Button){
            binding.answer.append(view.text)
        }
    }
    fun times(view: View) {
        if (view is Button){
            binding.answer.append(view.text)
        }
    }
    fun minus(view: View) {
        if (view is Button){
            binding.answer.append(view.text)
        }
    }
    fun plus(view: View) {
        if (view is Button){
            binding.answer.append(view.text)
        }
    }
    fun decimal(view: View) {
        if (view is Button){
            binding.answer.append(view.text)
        }
    }
    fun equals(view: View) {
        var stringText = binding.answer.text.toString()
        for(i in 0..stringText.length-1){
            if(stringText[i] == 'X' || stringText[i] == '-' || stringText[i] == '+' || stringText[i] == '/'){
                var ans = 0.00
                var numOne = ""
                for(j in 0..i){
                    numOne += j
                }
                var numTwo = ""
                for(k in i..stringText.length){
                    numTwo+=k
                }
                if(stringText[i] == 'X'){
                    ans = numOne.toDouble() * numTwo.toDouble()
                }
                if(stringText[i] == '/'){
                    ans = numOne.toDouble() / numTwo.toDouble()
                }
                if(stringText[i] == '+'){
                    ans = numOne.toDouble() + numTwo.toDouble()
                }
                if(stringText[i] == '-'){
                    ans = numOne.toDouble() - numTwo.toDouble()
                }
                binding.answer.text= ans.toString()
            }
        }
    }



}