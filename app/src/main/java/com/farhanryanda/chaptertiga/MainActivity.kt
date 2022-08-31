package com.farhanryanda.chaptertiga

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var edtAngkaSatu : EditText
    private lateinit var edtAngkaDua : EditText
    private lateinit var btnCalculate : Button
    private lateinit var btnReset : Button
    private lateinit var tvResult : TextView
    private lateinit var tvKondisi : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtAngkaSatu = findViewById(R.id.angka_satu)
        edtAngkaDua = findViewById(R.id.angka_dua)
        btnCalculate = findViewById(R.id.btn_calculate)
        btnReset = findViewById(R.id.btn_reset)
        tvResult = findViewById(R.id.tv_result)
        tvKondisi = findViewById(R.id.tv_kondisi)

        btnCalculate.setOnClickListener {
            var input = edtAngkaSatu.text.toString().toInt()
            var inputDua = edtAngkaDua.text.toString().toInt()
            var jumlah = input + inputDua
            tvResult.text = jumlah.toString()
            if (jumlah > 100) {
                tvKondisi.text = "Jumlah > 100"
            } else {
                tvKondisi.text = "Jumlah < 100"
            }

        }

        btnReset.setOnClickListener {
            resetData()
        }
    }

    fun resetData() {
        edtAngkaSatu.setText("")
        edtAngkaDua.setText("")
    }
}