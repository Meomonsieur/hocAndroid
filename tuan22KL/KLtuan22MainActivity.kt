package com.example.firstapplication.tuan22KL

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import com.example.firstapplication.R

class KLtuan22MainActivity : AppCompatActivity() {
    var txt1:EditText? = null
    var txt2:EditText? = null
    var btn1:EditText? = null
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kltuan22_main)
        txt1=findViewById(R.id.tuan22klTxt1)
        txt2=findViewById(R.id.tuan22klTxt2)
        btn1=findViewById(R.id.tuan22klBtn1)
        btn1!!.setOnClickListener(View.OnClickListener {
            var i = Intent(this@KLtuan22MainActivity,
                KLtuan22ScActivity::class.java)
            i.putExtra("so1",txt1!!.text.toString())
            i.putExtra("so2",txt2!!.text.toString())
            startActivity(i)
        })
    }
}