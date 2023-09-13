package com.example.project1calculatorapptristandearborn

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.project1calculatorapptristandearborn.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //binding lets me call get the textview, change it, and redisplay it
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
    fun clear(view: View) { //when c is pressed
        binding.answer.text="" //replaces textview with empty string
    }
    fun negative(view: View) { //when - is pressed
        if (view is Button){
            var str = binding.answer.text.toString() //converts textview to string
            var num = str.toDouble() //converts string to double for operations
            var ans = num * -1 //times negative one to flip between positive and negative
            str = ans.toString() //converts double to string
            binding.answer.text = str //replaces textview with new string
        }
    }
    fun percent(view: View) { //when % is pressed
        var str = binding.answer.text.toString()
        var num = str.toDouble()
        var ans = num / 100 //divide by 100 for percentage decimal
        str = ans.toString()
        binding.answer.text = str


    }
    fun divide(view: View) { //when / is pressed
        if (view is Button){
            binding.answer.append(view.text) //adds a division sign to textview
        }
    }
    fun digit(view: View) { //when a number is pressed
        if (view is Button){
            binding.answer.append(view.text) //adds what number was pressed to textview
        }
    }
    fun times(view: View) { //when X is pressed
        if (view is Button){
            binding.answer.append(view.text) //adds a multiplication sign to textview
        }
    }
    fun minus(view: View) { //when - is pressed
        if (view is Button){
            binding.answer.append(view.text) //adds a minus sign to textview
        }
    }
    fun plus(view: View) { //when + is pressed
        if (view is Button){
            binding.answer.append(view.text) //adds a plus sign to textview
        }
    }
    fun decimal(view: View) { //when . is pressed
        if (view is Button){
            binding.answer.append(view.text) //adds a decimal point to textview
        }
    }
    fun equals(view: View) { //when = is pressed
        var str = binding.answer.text.toString() //converts textview to string
        for (i in 0..str.length-1) { // for the total length of the string
            if (str[i] == 'X' || str[i] == '-' || str[i] == '+' || str[i] == '/') { //finds when an operation is used in string
                var numOne = "" //empty string to add numbers into
                var numTwo = "" //empty string to add numbers into
                for (j in 0..i-1) { //for beginning of string to when operation is used in string
                    numOne += str[j] //adds everything from before the operation to a string, numOne
                }
                for (k in i + 1..str.length - 1) { //for after operation is used to end of string
                    numTwo += str[k] //adds everything from after operation to a string, numTwo
                }
                if (str[i] == '+'){ //if addition
                    var numOneNum = numOne.toDouble() //converts numOne to a double
                    var numTwoNum = numTwo.toDouble() //converts numTwo to a double
                    var ans = numOneNum+numTwoNum //adds together
                    str = ans.toString() //turns answer to string
                    binding.answer.text = str //displays string in textview
                }
                if (str[i] == '-'){ //if minus
                    var numOneNum = numOne.toDouble() //converts numOne to a double
                    var numTwoNum = numTwo.toDouble() //converts numTwo to a double
                    var ans = numOneNum-numTwoNum //subtracts numbers
                    str = ans.toString() //turns answer to string
                    binding.answer.text = str //displays string in textview
                }
                if (str[i] == 'X'){ //if multiplication
                    var numOneNum = numOne.toDouble() //converts numOne to a double
                    var numTwoNum = numTwo.toDouble() //converts numTwo to a double
                    var ans = numOneNum*numTwoNum //multiplies together
                    str = ans.toString() //turns answer to string
                    binding.answer.text = str //displays string in textview
                }
                if (str[i] == '/'){ //if division
                    var numOneNum = numOne.toDouble() //converts numOne to a double
                    var numTwoNum = numTwo.toDouble() //converts numTwo to a double
                    var ans = numOneNum/numTwoNum //divides numbers
                    str = ans.toString() //turns answer to string
                    binding.answer.text = str //displays string in textview
                }

            }
        }
    }

    fun sin(view: View) { //when sin is pressed
        var str = binding.answer.text.toString()
        var num = str.toDouble()
        var ans = kotlin.math.sin(num) //uses kotlin built-in math to find sine of number in radians
        str = ans.toString()
        binding.answer.text = str
    }
    fun cos(view: View) { //when cos is pressed
        var str = binding.answer.text.toString()
        var num = str.toDouble()
        var ans = kotlin.math.cos(num) //uses kotlin built-in math to find cosine of number in radians
        str = ans.toString()
        binding.answer.text = str
    }
    fun tan(view: View) { //when tan is pressed
        var str = binding.answer.text.toString()
        var num = str.toDouble()
        var ans = kotlin.math.tan(num) //uses kotlin built-in math to find tangent of number in radians
        str = ans.toString()
        binding.answer.text = str
    }
    fun log(view: View) { //when log10 is pressed
        var str = binding.answer.text.toString()
        var num = str.toDouble()
        var ans = kotlin.math.log10(num) //uses kotlin built-in math to find log 10 of number
        str = ans.toString()
        binding.answer.text = str
    }
    fun ln(view: View) { //when ln is pressed
        var str = binding.answer.text.toString()
        var num = str.toDouble()
        var ans = kotlin.math.ln(num) //uses kotlin built-in math to find natural log of number
        str = ans.toString()
        binding.answer.text = str
    }


}