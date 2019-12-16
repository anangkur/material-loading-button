package com.anangkur.materialloadingbutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var isNormalButtonProgress = false
    private var isRoundedButtonProgress = false
    private var isRoundedGradientButtonProgress = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupNormalButton()
        setupRoundedButton()
        setupRoundedGradientButton()
    }

    private fun setupNormalButton(){
        normal_button.setText("Normal Button")
        normal_button.setOnClickListener {
            if (isNormalButtonProgress){
                isNormalButtonProgress = false
                normal_button.hideProgress()
                Toast.makeText(this, "Normal Button Hide Progress", Toast.LENGTH_SHORT).show()
            }else{
                isNormalButtonProgress = true
                normal_button.showProgress()
                Toast.makeText(this, "Normal Button Show Progress", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun setupRoundedButton(){
        rounded_button.setRadius(100f)
        rounded_button.setColor(ContextCompat.getColor(this, R.color.colorPrimary))
        rounded_button.setText("Rounded Button")
        rounded_button.setOnClickListener {
            if (isRoundedButtonProgress){
                isRoundedButtonProgress = false
                rounded_button.hideProgress()
                Toast.makeText(this, "Rounded Button Hide Progress", Toast.LENGTH_SHORT).show()
            }else{
                isRoundedButtonProgress = true
                rounded_button.showProgress()
                Toast.makeText(this, "Rounded Button Show Progress", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun setupRoundedGradientButton(){
        rounded_gradient_button.setRadius(100f)
        rounded_gradient_button.setGradientColor(
            ContextCompat.getColor(this, R.color.colorPrimary),
            ContextCompat.getColor(this, R.color.colorAccent))
        rounded_gradient_button.setText("Rounded Gradient Button")
        rounded_gradient_button.setOnClickListener {
            if (isRoundedGradientButtonProgress){
                isRoundedGradientButtonProgress = false
                rounded_gradient_button.hideProgress()
                Toast.makeText(this, "Rounded Gradient Button Hide Progress", Toast.LENGTH_SHORT).show()
            }else{
                isRoundedGradientButtonProgress = true
                rounded_gradient_button.showProgress()
                Toast.makeText(this, "Rounded Gradient Button Show Progress", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
