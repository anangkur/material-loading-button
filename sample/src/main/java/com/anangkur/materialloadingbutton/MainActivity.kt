package com.anangkur.materialloadingbutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var isNormalButtonProgress = false
    private var isRoundedButtonProgress = false
    private var isRoundedGradientButtonProgress = false
    private var isNormalGradientButtonProgress = false
    private var isRoundedStrokeButtonProgress = false
    private var isNormalStrokeButtonProgress = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupNormalButton()
        setupRoundedButton()
        setupRoundedGradientButton()
        setupRoundedStrokeButton()
        setupNormalGradientButton()
        setupNormalStrokeButton()
    }

    private fun setupNormalButton(){
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

    private fun setupRoundedStrokeButton(){
        rounded_stroke_button.setOnClickListener {
            if (isRoundedStrokeButtonProgress){
                isRoundedStrokeButtonProgress = false
                rounded_stroke_button.hideProgress()
                Toast.makeText(this, "Rounded Stroke Button Hide Progress", Toast.LENGTH_SHORT).show()
            }else{
                isRoundedStrokeButtonProgress = true
                rounded_stroke_button.showProgress()
                Toast.makeText(this, "Rounded Stroke Button Show Progress", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun setupNormalGradientButton(){
        normal_gradient_button.setOnClickListener {
            if (isNormalGradientButtonProgress){
                isNormalGradientButtonProgress = false
                normal_gradient_button.hideProgress()
                Toast.makeText(this, "Normal Gradient Button Hide Progress", Toast.LENGTH_SHORT).show()
            }else{
                isNormalGradientButtonProgress = true
                normal_gradient_button.showProgress()
                Toast.makeText(this, "Normal Gradient Button Show Progress", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun setupNormalStrokeButton(){
        normal_stroke_button.setOnClickListener {
            if (isNormalStrokeButtonProgress){
                isNormalStrokeButtonProgress = false
                normal_stroke_button.hideProgress()
                Toast.makeText(this, "Normal Stroke Button Hide Progress", Toast.LENGTH_SHORT).show()
            }else{
                isNormalStrokeButtonProgress = true
                normal_stroke_button.showProgress()
                Toast.makeText(this, "Normal Stroke Button Show Progress", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
