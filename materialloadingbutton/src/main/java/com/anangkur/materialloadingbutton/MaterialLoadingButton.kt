package com.anangkur.materialloadingbutton

import android.content.Context
import android.graphics.drawable.GradientDrawable
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.RelativeLayout

class MaterialLoadingButton(context: Context, attrs: AttributeSet): RelativeLayout(context, attrs){

    private var view: View = LayoutInflater.from(context).inflate(R.layout.loading_button, null)
    private var button: Button = view.findViewById(R.id.button)
    private var progressBar: ProgressBar = view.findViewById(R.id.progress)

    private var startColor: Int = 0
    private var endColor: Int = 0

    private var cornerRadius: Float = 0f

    private var textButton: String = ""

    private var orientation = Orientation.TOP_BOTTOM

    enum class Orientation {
        TOP_BOTTOM,
        TR_BL,
        RIGHT_LEFT,
        BR_TL,
        BOTTOM_TOP,
        BL_TR,
        LEFT_RIGHT,
        TL_BR
    }

    init {
        addView(view)
    }

    fun showProgress(){
        button.text = null
        progressBar.visibility = View.VISIBLE
    }

    fun hideProgress(){
        button.text = textButton
        progressBar.visibility = View.GONE
    }

    fun setText(text: String){
        textButton = text
        button.text = text
    }

    fun setRadius(radius: Float){
        cornerRadius = radius
        button.background = setupGradientDrawable()
    }

    fun setColor(color: Int){
        startColor = color
        endColor = color
        button.background = setupGradientDrawable()
    }

    fun setGradientColor(startColor: Int, endColor: Int){
        this.startColor = startColor
        this.endColor = endColor
        button.background = setupGradientDrawable()
    }

    override fun setOnClickListener(l: OnClickListener?) {
        button.setOnClickListener(l)
    }

    private fun setupColor(startColor: Int, endColor: Int): IntArray{
        val colors = IntArray(2)
        colors[0] = startColor
        colors[1] = endColor
        return colors
    }

    private fun setupGradientDrawable(): GradientDrawable{
        val gradientDrawable = GradientDrawable(setupOrientation(orientation), setupColor(startColor, endColor))
        gradientDrawable.cornerRadius = cornerRadius
        return gradientDrawable
    }

    private fun setupOrientation(orientation: Orientation): GradientDrawable.Orientation{
        return when(orientation){
            Orientation.TOP_BOTTOM -> GradientDrawable.Orientation.TOP_BOTTOM
            Orientation.TR_BL -> GradientDrawable.Orientation.TR_BL
            Orientation.RIGHT_LEFT -> GradientDrawable.Orientation.RIGHT_LEFT
            Orientation.BR_TL -> GradientDrawable.Orientation.BR_TL
            Orientation.BOTTOM_TOP -> GradientDrawable.Orientation.BOTTOM_TOP
            Orientation.BL_TR -> GradientDrawable.Orientation.BL_TR
            Orientation.LEFT_RIGHT -> GradientDrawable.Orientation.LEFT_RIGHT
            Orientation.TL_BR -> GradientDrawable.Orientation.TL_BR
        }
    }
}