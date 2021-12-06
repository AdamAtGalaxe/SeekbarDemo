package com.galaxe.seekbardemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import android.widget.Toast

class MainActivity : AppCompatActivity(), SeekBar.OnSeekBarChangeListener {
    lateinit var seek: SeekBar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        seek = findViewById(R.id.mySeek)
        
        //seek.setOnSeekBarChangeListener(this)
        seek.setOnSeekBarChangeListener(this)


    }

    override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {

    }

    override fun onStartTrackingTouch(seekBar: SeekBar?) {

    }

    override fun onStopTrackingTouch(seekBar: SeekBar?) {
        
        Toast.makeText(this, "Progress is ${seekBar?.progress}%", Toast.LENGTH_LONG).show()
    }
}