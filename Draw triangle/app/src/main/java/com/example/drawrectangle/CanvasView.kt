package com.example.drawtriangle

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.util.AttributeSet
import android.view.View

class CanvasView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr)
{
    override fun onDraw(canvas: Canvas?)
    {
        super.onDraw(canvas)

        val paint = Paint()
        val path = Path()
        path.moveTo(1000f, 500f)
        path.lineTo(1500f, 1500f)
        path.lineTo(500f, 1000f)
        path.close()
        paint.setColor(Color.BLUE)
        paint.strokeWidth = 10f
        paint.style = Paint.Style.STROKE
        canvas?.drawPath(path , paint)
    }
}