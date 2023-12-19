package com.example.flashlight2
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.graphics.Color

class ColorActivity : AppCompatActivity() {

    companion object {
        const val COLOR_ID = "color_id"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Отримуємо інтент
        val intent = intent

        // Отримуємо інформацію про колір з інтенту
        val colorId = intent.getIntExtra(COLOR_ID, Color.WHITE)

        // Встановлюємо колір екрану
        window.decorView.setBackgroundColor(colorId)
    }
}
