package com.anangkur.materialloadingbutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.anangkur.materialloadingbutton.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    private var isNormalButtonProgress = false
    private var isRoundedButtonProgress = false
    private var isRoundedGradientButtonProgress = false
    private var isNormalGradientButtonProgress = false
    private var isRoundedStrokeButtonProgress = false
    private var isNormalStrokeButtonProgress = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        setupNormalButton()
        setupRoundedButton()
        setupRoundedGradientButton()
        setupRoundedStrokeButton()
        setupNormalGradientButton()
        setupNormalStrokeButton()
    }

    private fun setupNormalButton(){
        binding.normalButton.setOnClickListener {
            if (isNormalButtonProgress){
                isNormalButtonProgress = false
                binding.normalButton.hideProgress()
                Toast.makeText(this, "Normal Button Hide Progress", Toast.LENGTH_SHORT).show()
            }else{
                isNormalButtonProgress = true
                binding.normalButton.showProgress()
                Toast.makeText(this, "Normal Button Show Progress", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun setupRoundedButton(){
        binding.roundedButton.setOnClickListener {
            if (isRoundedButtonProgress){
                isRoundedButtonProgress = false
                binding.roundedButton.hideProgress()
                Toast.makeText(this, "Rounded Button Hide Progress", Toast.LENGTH_SHORT).show()
            }else{
                isRoundedButtonProgress = true
                binding.roundedButton.showProgress()
                Toast.makeText(this, "Rounded Button Show Progress", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun setupRoundedGradientButton(){
        binding.roundedGradientButton.setOnClickListener {
            if (isRoundedGradientButtonProgress){
                isRoundedGradientButtonProgress = false
                binding.roundedGradientButton.hideProgress()
                Toast.makeText(this, "Rounded Gradient Button Hide Progress", Toast.LENGTH_SHORT).show()
            }else{
                isRoundedGradientButtonProgress = true
                binding.roundedGradientButton.showProgress()
                Toast.makeText(this, "Rounded Gradient Button Show Progress", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun setupRoundedStrokeButton(){
        binding.roundedStrokeButton.setOnClickListener {
            if (isRoundedStrokeButtonProgress){
                isRoundedStrokeButtonProgress = false
                binding.roundedStrokeButton.hideProgress()
                Toast.makeText(this, "Rounded Stroke Button Hide Progress", Toast.LENGTH_SHORT).show()
            }else{
                isRoundedStrokeButtonProgress = true
                binding.roundedStrokeButton.showProgress()
                Toast.makeText(this, "Rounded Stroke Button Show Progress", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun setupNormalGradientButton(){
        binding.normalGradientButton.setOnClickListener {
            if (isNormalGradientButtonProgress){
                isNormalGradientButtonProgress = false
                binding.normalGradientButton.hideProgress()
                Toast.makeText(this, "Normal Gradient Button Hide Progress", Toast.LENGTH_SHORT).show()
            }else{
                isNormalGradientButtonProgress = true
                binding.normalGradientButton.showProgress()
                Toast.makeText(this, "Normal Gradient Button Show Progress", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun setupNormalStrokeButton(){
        binding.normalStrokeButton.setOnClickListener {
            if (isNormalStrokeButtonProgress){
                isNormalStrokeButtonProgress = false
                binding.normalStrokeButton.hideProgress()
                Toast.makeText(this, "Normal Stroke Button Hide Progress", Toast.LENGTH_SHORT).show()
            }else{
                isNormalStrokeButtonProgress = true
                binding.normalStrokeButton.showProgress()
                Toast.makeText(this, "Normal Stroke Button Show Progress", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
