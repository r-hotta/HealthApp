package com.example.myapplication
import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color;
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val yatta =Seikou()
        val button1 = findViewById<Button>(R.id.buttonmi)
        val button2 = findViewById<Button>(R.id.buttonHi)
        val button3 = findViewById<Button>(R.id.buttonUe)
        val button4 = findViewById<Button>(R.id.buttonSi)
        val buttonr = findViewById<Button>(R.id.buttonre)
        val textView = findViewById<TextView>(R.id.textView)
        val textView2 = findViewById<TextView>(R.id.textView2)
        val textView3 = findViewById<TextView>(R.id.textView3)
        val textView4 = findViewById<TextView>(R.id.textView4)
        var c =0

 fun seikou () {
     c++
     textView2.setTextColor(Color.BLUE);
     textView2.text = "うまくよけたね！！！"

     textView4.text = "${c}回連続でよけてます。"
 }

     fun sippai(){
                    textView2.setTextColor(Color.RED);
                    textView2.text = "残念、当てられちゃった"

                    c =0
                    textView4.text ="今${c}回連続でよけてます。"
     }

        button1.setOnClickListener {
            Log.d("rei", "migiボタンがおされた ")

            textView.text = "あなたが向いたのは右"
            val r = (1..4).random()
                when (r) {

                    1 -> {
                        textView3.text = "相手が指さしたのは右"
                        sippai()
                    }
                    2 -> {
                        val textView3 = findViewById<TextView>(R.id.textView3)
                        val textView2 = findViewById<TextView>(R.id.textView2)
                        textView3.text = "相手が指さしたのは左"
                        seikou()
                    }
                    3 -> {
                        val textView3 = findViewById<TextView>(R.id.textView3)
                        val textView2 = findViewById<TextView>(R.id.textView2)
                        seikou()

                    }
                    else -> {
                        val textView3 = findViewById<TextView>(R.id.textView3)
                        val textView2 = findViewById<TextView>(R.id.textView2)
                        textView3.text = "相手が指さしたのは下"
                        seikou()
                    }
            }}
            button2.setOnClickListener {
                Log.d("rei", "hidariボタンがおされた ")
                val textView = findViewById<TextView>(R.id.textView)
                val textView2 = findViewById<TextView>(R.id.textView2)

                textView.text = "あなたが向いたのは左"
                val r = (1..4).random()
                when (r) {
                    1 -> {

                        val textView3 = findViewById<TextView>(R.id.textView3)
                        val textView2 = findViewById<TextView>(R.id.textView2)
                        textView3.text = "相手が指さしたのは右"
                        seikou()
                    }
                    2 -> {

                        val textView3 = findViewById<TextView>(R.id.textView3)
                        val textView2 = findViewById<TextView>(R.id.textView2)
                        textView3.text = "相手が指さしたのは左"
                        sippai()
                    }
                    3 -> {

                        val textView3 = findViewById<TextView>(R.id.textView3)
                        val textView2 = findViewById<TextView>(R.id.textView2)
                        textView3.text = "相手が指さしたのは上"
                        seikou()
                    }
                    else -> {

                        val textView3 = findViewById<TextView>(R.id.textView3)
                        val textView2 = findViewById<TextView>(R.id.textView2)
                        textView3.text = "相手が指さしたのは下"
                        seikou()
                    }

            }}
            button3.setOnClickListener {
                Log.d("rei", "ueボタンがおされた ")
                val textView = findViewById<TextView>(R.id.textView)
                textView.text = "あなたが向いたのは上"
                val r = (1..4).random()
                when (r) {
                    1 -> {
                        val textView3 = findViewById<TextView>(R.id.textView3)
                        val textView2 = findViewById<TextView>(R.id.textView2)
                        textView3.text = "相手が指さしたのは右"
                        seikou()
                    }
                    2 -> {
                        val textView3 = findViewById<TextView>(R.id.textView3)
                        val textView2 = findViewById<TextView>(R.id.textView2)
                        textView3.text = "相手が指さしたのは左"
                        seikou()
                    }
                    3 -> {
                        val textView3 = findViewById<TextView>(R.id.textView3)
                        val textView2 = findViewById<TextView>(R.id.textView2)
                        textView3.text = "相手が指さしたのは上"
                        sippai()
                    }
                    else -> {
                        val textView3 = findViewById<TextView>(R.id.textView3)
                        val textView2 = findViewById<TextView>(R.id.textView2)
                        textView3.text = "相手が指さしたのは下"
                        seikou()
                    }}}
            button4.setOnClickListener {
                Log.d("rei", "sitaボタンがおされた ")
                val textView = findViewById<TextView>(R.id.textView)
                textView.text = "あなたが向いたのは下"
                val r = (1..4).random()
                when (r) {
                    1 -> {
                        val textView3 = findViewById<TextView>(R.id.textView3)
                        val textView2 = findViewById<TextView>(R.id.textView2)
                        textView3.text = "相手が指さしたのは右"
                        seikou()
                    }

                    2 -> {
                        val textView3 = findViewById<TextView>(R.id.textView3)
                        val textView2 = findViewById<TextView>(R.id.textView2)
                        textView3.text = "相手が指さしたのは左"
                        seikou()
                    }

                    3 -> {
                        val textView3 = findViewById<TextView>(R.id.textView3)
                        val textView2 = findViewById<TextView>(R.id.textView2)
                        textView3.text = "相手が指さしたのは上"
                        seikou()
                    }

                    else -> {
                        val textView3 = findViewById<TextView>(R.id.textView3)
                        val textView2 = findViewById<TextView>(R.id.textView2)
                        textView3.text = "相手が指さしたのは下"
                        sippai()

                    }
                }

            }
        buttonr.setOnClickListener {
            val intent = Intent(applicationContext,MainActivity2::class.java)
            startActivity(intent)
        }}}






