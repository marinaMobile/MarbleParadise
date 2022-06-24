package com.amazon.mShop.android.shoppin

import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.DragEvent
import com.amazon.mShop.android.shoppin.PaintView.Companion.colorList
import com.amazon.mShop.android.shoppin.PaintView.Companion.currentBrush
import com.amazon.mShop.android.shoppin.PaintView.Companion.pathList
import kotlinx.android.synthetic.main.activity_remag.*

class remag : AppCompatActivity() {


    companion object{
        var path = Path()
        var paintBrush = Paint()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_remag)

        Log.d("this", "view created")

        redColor.setOnClickListener{
            paintBrush.color = Color.RED
            crntColor(paintBrush.color)
        }
        blueColor.setOnClickListener{
            paintBrush.color = Color.BLUE
            crntColor(paintBrush.color)
        }
        greenColor.setOnClickListener{
            paintBrush.color = Color.GREEN
            crntColor(paintBrush.color)
        }
        yellowColor.setOnClickListener{
            paintBrush.color = Color.YELLOW
            crntColor(paintBrush.color)
        }
        orangeColor.setOnClickListener{
            paintBrush.color = Color.rgb(252,186, 3)
            crntColor(paintBrush.color)
        }

        clearAll.setOnClickListener{
            path.reset()
            pathList.clear()
            colorList.clear()

        }

    }

    private fun crntColor(color: Int) {
        currentBrush = color
        path = Path()
    }
}