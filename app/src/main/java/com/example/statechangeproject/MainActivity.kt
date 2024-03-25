package com.example.statechangeproject

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

    lateinit var button: Button
    lateinit var text: TextView
    lateinit var secondText: TextView
    lateinit var thirdText: TextView
    lateinit var fourthText: TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.idButton)
        text = findViewById(R.id.idText)
        secondText = findViewById(R.id.idText2)
        thirdText = findViewById(R.id.idText3)
        fourthText = findViewById(R.id.idText4)

        button.setOnClickListener {
            (text.setText("Hei maailma!")) // hello world in finnish
            (secondText.setText("Hello World!")) // changes hello world in arabic to english
            (thirdText.setText("Salut lume!")) // romanian
            (fourthText.setText("Привiт, свiте!")) //ukrainian

        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        outState.putString("saved 1", text.text.toString())
        outState.putString("saved 2", secondText.text.toString())
        outState.putString("saved 3", thirdText.text.toString())
        outState.putString("saved 4", fourthText.text.toString())

    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        text.setText(savedInstanceState.getString("saved 1"))
        secondText.setText(savedInstanceState.getString("saved 2"))
        thirdText.setText(savedInstanceState.getString("saved 3"))
        fourthText.setText(savedInstanceState.getString("saved 4"))
    }
}