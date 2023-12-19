package com.example.flashlight2
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnWhite: Button = findViewById(R.id.btnWhite)
        val btnRed: Button = findViewById(R.id.btnRed)
        val btnBlue: Button = findViewById(R.id.btnBlue)
        val btnCyan: Button = findViewById(R.id.btnCyan)
        val btnLightGray: Button = findViewById(R.id.btnLightGray)
        val btnMagenta: Button = findViewById(R.id.btnMagenta)
        val btnGreen: Button = findViewById(R.id.btnGreen)

        btnWhite.setOnClickListener { changeColor(ContextCompat.getColor(this, R.color.white)) }
        btnRed.setOnClickListener { changeColor(ContextCompat.getColor(this, R.color.red)) }
        btnBlue.setOnClickListener { changeColor(ContextCompat.getColor(this, R.color.blue)) }
        btnCyan.setOnClickListener { changeColor(ContextCompat.getColor(this, R.color.cyan)) }
        btnLightGray.setOnClickListener { changeColor(ContextCompat.getColor(this, R.color.ligtgray)) }
        btnMagenta.setOnClickListener { changeColor(ContextCompat.getColor(this, R.color.magenta)) }
        btnGreen.setOnClickListener { changeColor(ContextCompat.getColor(this, R.color.green)) }
    }

    private fun changeColor(color: Int) {
        val intent = Intent(this, ColorActivity::class.java)
        intent.putExtra(ColorActivity.COLOR_ID, color)
        startActivity(intent)
    }
}