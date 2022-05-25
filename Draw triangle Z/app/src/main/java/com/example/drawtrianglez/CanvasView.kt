package com.example.drawtrianglez

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
        path.moveTo(1000f, 50f)
        path.lineTo(100f, 1400f)
        path.lineTo(100f, 50f)
        canvas?.drawPath(path, paint)
    }
}