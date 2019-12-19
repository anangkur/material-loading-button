package com.anangkur.materialloadingbutton

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var isNormalButtonProgress = false
    private var isRoundedButtonProgress = false
    private var isRoundedGradientButtonProgress = false
    private var isRoundedStrokeButtonProgress = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupNormalButton()
        setupRoundedButton()
        setupRoundedGradientButton()
        setupRoundedStrokeButton()
    }

    private fun setupNormalButton(){
        normal_button.setText("Normal Button")
        normal_button.setColor(ContextCompat.getColor(this, R.color.gray))
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
        rounded_button.setTextColor(ContextCompat.getColor(this, R.color.white))
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
        rounded_gradient_button.setOrientation(MaterialLoadingButton.Orientation.TL_BR)
        rounded_gradient_button.setGradientColor(
            ContextCompat.getColor(this, R.color.lilac),
            ContextCompat.getColor(this, R.color.half_baked))
        rounded_gradient_button.setText("Rounded Gradient Button")
        rounded_gradient_button.setTextColor(ContextCompat.getColor(this, R.color.white))
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
        rounded_stroke_button.setRadius(100f)
        rounded_stroke_button.setStroke(1, ContextCompat.getColor(this, R.color.colorPrimary), ContextCompat.getColor(this, R.color.white))
        rounded_stroke_button.setText("Rounded Stroke Button")
        rounded_stroke_button.setTypeFace(ResourcesCompat.getFont(this, R.font.comfortaa_bold)!!)
        rounded_stroke_button.setTextColor(ContextCompat.getColor(this, R.color.colorPrimary))
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
}
