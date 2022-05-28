package com.example.drawtriangle

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Path
import android.util.AttributeSet
import android.view.View

class CanvasView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr)
{
    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        val paint = Paint()
        val path = Path()
        path.moveTo(500f, 100f)
        path.lineTo(1000f, 1400f)
        path.lineTo(50f, 1400f)
        paint.style = Paint.Style.STROKE
        paint.strokeWidth = 5f
        canvas?.drawPath(path, paint)
    }
}