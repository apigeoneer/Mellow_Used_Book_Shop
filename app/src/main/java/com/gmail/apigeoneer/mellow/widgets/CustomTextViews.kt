package com.gmail.apigeoneer.mellow.widgets

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView
import com.gmail.apigeoneer.mellow.R

class BoldTextView(context: Context, attrs: AttributeSet)
    : AppCompatTextView(context, attrs) {

        init {
            applyFont()
        }

    private fun applyFont() {
        val boldTypeface: Typeface = Typeface.create("Montserrat Bold", Typeface.BOLD)
        typeface = boldTypeface
    }
}

class NormalTextView(context: Context, attrs: AttributeSet)
    : AppCompatTextView(context, attrs) {

    init {
        applyFont()
    }

    private fun applyFont() {
        val normalTypeface: Typeface = Typeface.create("Montserrat", Typeface.NORMAL)
        typeface = normalTypeface
    }
}