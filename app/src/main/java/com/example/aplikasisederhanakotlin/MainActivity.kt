package com.example.aplikasisederhanakotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun submit_btn(view: View){

        var namaEditText = findViewById<EditText>(R.id.nama_edit_text)
        var emailEditText = findViewById<EditText>(R.id.email)
        var nama = namaEditText.text.toString()
        var email = emailEditText.text.toString()
        var hasil = nama+"/n"+email
        var toast = Toast.makeText(applicationContext, hasil , Toast.LENGTH_LONG)
        toast.show()

    }
}