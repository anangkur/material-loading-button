package com.anangkur.materialloadingbutton

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Color
import android.graphics.drawable.Drawable
import android.graphics.drawable.GradientDrawable
import android.graphics.drawable.RippleDrawable
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.annotation.ColorInt
import androidx.core.content.ContextCompat
import androidx.core.view.setPadding
import kotlin.math.roundToInt


class MaterialLoadingButton(context: Context, attrs: AttributeSet): RelativeLayout(context, attrs){

    private var view: View = LayoutInflater.from(context).inflate(R.layout.loading_button, null)
    private var textView: TextView = view.findViewById(R.id.text)
    private var progressBar: ProgressBar = view.findViewById(R.id.progress)

    private var startColor: Int = 0
    private var endColor: Int = 0

    private var strokeColor: Int = 0
    private var strokeWidth: Int = 0

    private var cornerRadius: Float = 0f
    private var mRadiusTopLeft: Float = 0f
    private var mRadiusTopRight: Float = 0f
    private var mRadiusBottomRight: Float = 0f
    private var mRadiusBottomLeft: Float = 0f

    private var textButton: String = ""
    private var orientation = Orientation.TOP_BOTTOM

    private var textColor: Int = 0

    private val rippleColor = adjustAlpha(ContextCompat.getColor(context, R.color.ripple), 0.26f)

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
        view.setPadding(calculateDp(8))
        textView.background = setupBackground()
        addView(view)
    }

    fun showProgress(){
        textView.text = null
        progressBar.visibility = View.VISIBLE
    }

    fun hideProgress(){
        textView.text = textButton
        progressBar.visibility = View.GONE
    }

    fun setText(text: String){
        textButton = text
        textView.text = text
    }

    fun setRadius(radius: Float){
        cornerRadius = radius
        textView.background = setupBackground()
    }

    fun setColor(color: Int){
        startColor = color
        endColor = color
        textView.background = setupBackground()
    }

    fun setGradientColor(startColor: Int, endColor: Int){
        this.startColor = startColor
        this.endColor = endColor
        textView.background = setupBackground()
    }

    fun setOrientation(orientation: Orientation){
        this.orientation = orientation
        textView.background = setupBackground()
    }

    fun setTextColor(color: Int){
        textColor = color
        textView.setTextColor(textColor)
    }

    fun setStroke(width: Int, colorStroke: Int, colorBackground: Int){
        strokeColor = colorStroke
        strokeWidth = width
        startColor = colorBackground
        endColor = colorBackground
        textView.background = setupBackground()
    }

    private fun applyRadius(drawable: GradientDrawable) {
        if (cornerRadius > 0) {
            drawable.cornerRadius = cornerRadius
        } else {
            drawable.cornerRadii = floatArrayOf(
                mRadiusTopLeft, mRadiusTopLeft, mRadiusTopRight, mRadiusTopRight,
                mRadiusBottomRight, mRadiusBottomRight, mRadiusBottomLeft, mRadiusBottomLeft
            )
        }
    }

    private fun getRippleDrawable(defaultDrawable: Drawable): Drawable? {
        return RippleDrawable(
            ColorStateList.valueOf(rippleColor),
            defaultDrawable,
            defaultDrawable
        )
    }

    private fun setupBackground(): Drawable? {
        val defaultDrawable = GradientDrawable(setupOrientation(orientation), setupColor(startColor, endColor))
        if (strokeColor != 0 && strokeWidth != 0){
            defaultDrawable.setStroke(calculateDp(strokeWidth), strokeColor)
        }
        applyRadius(defaultDrawable)

        return getRippleDrawable(defaultDrawable)
    }

    private fun adjustAlpha(@ColorInt color: Int, factor: Float): Int {
        val alpha = (Color.alpha(color) * factor).roundToInt()
        val red: Int = Color.red(color)
        val green: Int = Color.green(color)
        val blue: Int = Color.blue(color)
        return Color.argb(alpha, red, green, blue)
    }

    override fun setOnClickListener(l: OnClickListener?) {
        textView.setOnClickListener(l)
    }

    private fun setupColor(startColor: Int, endColor: Int): IntArray{
        val colors = IntArray(2)
        colors[0] = startColor
        colors[1] = endColor
        return colors
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

    private fun calculateDp(size: Int): Int{
        var  scale: Float = resources.displayMetrics.density
        return (size * scale + 0.5f).toInt()
    }
}