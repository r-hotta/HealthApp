package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.ktx.database
import com.google.firebase.database.ktx.getValue
import com.google.firebase.ktx.Firebase

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_image)
       val textView5 = findViewById<TextView>(R.id.textView5)
        textView5.text="hello2"
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val intent = Intent(applicationContext,MainActivity3::class.java)
            startActivity(intent)
        }
        val database = Firebase.database
        val ref = database.getReference("message")

        ref.addValueEventListener(object: ValueEventListener {

            override fun onDataChange(snapshot: DataSnapshot) {
                val value = snapshot.getValue<String>()
                Log.d("Test", "受信した値: " + value)
                textView5.text = value
                val image=findViewById<ImageView>(R.id.imageViewMessege)
                if(value!!.contains("良好")){
                    image.setImageResource(R.drawable.gennki)
                }else if(value.contains("良好")){
                    image.setImageResource(R.drawable.gennki)
                }else{
//                    image.setImageResource(R.drawable.sakura)

                }
                if(value!!.contains("再診")){
                    image.setImageResource(R.drawable.isya)
                }else if(value.contains("再診")){
                    image.setImageResource(R.drawable.isya)
                }else{
//                    image.setImageResource(R.drawable.sakura)

                }
                if(value!!.contains("危険")){
                    image.setImageResource(R.drawable.kikenn)
                }else if(value.contains("危険")){
                    image.setImageResource(R.drawable.kikenn)
                }else{
//                    image.setImageResource(R.drawable.sakura)

                }

            }




            override fun onCancelled(error: DatabaseError) {
                Log.w("Test", "受信エラー", error.toException())
            }
        })
    }}