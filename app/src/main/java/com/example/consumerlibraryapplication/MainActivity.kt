package com.example.consumerlibraryapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.libraryapplication.ConsumeMeObject
import com.example.libraryapplication.MainActivity
import com.cloudinary.*;
import com.bumptech.glide.Glide


class MainActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ConsumeMeObject().pleaseConsumeMe("gfhd", 66)


//        val em: Emitter = Emitter.EmitterBuilder("notarealuri.fake.io", this)
//            .build()

    }

//    override fun onResume() {
//        super.onResume()
//        val myIntent = Intent(this, MainActivity::class.java)
//        startActivity(myIntent)
//    }
}