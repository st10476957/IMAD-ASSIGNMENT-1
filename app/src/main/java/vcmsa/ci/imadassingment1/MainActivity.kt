package vcmsa.ci.imadassingment1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

    // find the edittext by Id
    val editText = findViewById<EditText>(R.id.inputtime)

    //find the textview by Id
    val textview = findViewById<TextView>(R.id.suggestedmeal)

    // find button1 by Id
    val button1 = findViewById<Button>(R.id.enterbutton)

    // find button2 by Id
    val button2 = findViewById<Button>(R.id.resetbutton2)


        button1.setOnClickListener() {
            val timeofday = editText.text.toString()

            // if ... else
            if (timeofday == "Mornimg" || timeofday == "morning"){
                textview.text = "Eat bacon and egg with toast"

            } else if (timeofday == "Afternoon" || timeofday == "afternoon"){
                textview.text = "Eat a sandwhich or burger and chips"

            } else if (timeofday == "Midafternoon" || timeofday == "midafternoon"){
                textview.text = "Eat any type of fruit or Nuts"

            } else if (timeofday == "Midmorning" || timeofday == "midmorning"){
                textview.text = "Eat a lite snack may cheese and crackers"

            } else if (timeofday == "Night" || timeofday == "nigth"){
                textview.text = "Eat a jacket potato and mince with white sauce"

            } else if(timeofday == "Evening" || timeofday == "evening"){
                textview.text = "Eat chicken and rice"

            } else if (timeofday == "Midnigth" || timeofday == "midnigth"){
                textview.text = "Eat a pack of snappers as a snack"

            }

            // Title: Kotlin if ... Else
            // Author: w3schools
            // Date: 1 April 2025
            // Available: https://www.w3schools.com/kotlin/kotlin_conditions.php
        }

        button2.setOnClickListener {
            editText.text.clear()
            textview.text = "Awating your next input"

        }





       }


    }
