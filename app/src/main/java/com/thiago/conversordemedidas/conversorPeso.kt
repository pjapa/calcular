package com.thiago.conversordemedidas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.widget.ArrayAdapter
import android.widget.Spinner

class conversorPeso : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
        getSupportActionBar()?.hide()
        setContentView(R.layout.activity_conversor_peso)
        var unidades = arrayOf("Miligrama(mg)", "Centigrama (cg)", "Grama (g)", "Quilograma (kg)")

        val spinner = findViewById<Spinner>(R.id.select)
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item,unidades)
        spinner.adapter = adapter
    }
}