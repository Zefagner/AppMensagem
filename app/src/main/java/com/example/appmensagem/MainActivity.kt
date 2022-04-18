package com.example.appmensagem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_mensagem.setOnClickListener(){
            val msg = edit_mensagem.text.toString()
            tv_resultado.text = msg
        }
    }
}