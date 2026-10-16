package com.ute.testgit

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var edtNumberA: EditText
    private lateinit var edtNumberB: EditText
    private lateinit var btnSum: Button
    private lateinit var btnCheckPrimeA: Button
    private lateinit var tvResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
        setupListeners()
    }

    private fun initViews() {
        edtNumberA = findViewById(R.id.edtNumberA)
        edtNumberB = findViewById(R.id.edtNumberB)
        btnSum = findViewById(R.id.btnSum)
        btnCheckPrimeA = findViewById(R.id.btnCheckPrimeA)
        tvResult = findViewById(R.id.tvResult)
    }

    private fun setupListeners() {
        // Câu 1 - Ý 3: Bắt sự kiện bấm nút tính tổng
        btnSum.setOnClickListener {
            val numA = edtNumberA.getIntValueOrShowError("Số A không hợp lệ") ?: return@setOnClickListener
            val numB = edtNumberB.getIntValueOrShowError("Số B không hợp lệ") ?: return@setOnClickListener

            val sum = numA + numB
            tvResult.text = "Kết quả: $numA + $numB = $sum"
        }
    }
}