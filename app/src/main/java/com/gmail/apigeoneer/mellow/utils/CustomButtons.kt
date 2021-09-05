package com.gmail.apigeoneer.mellow.utils

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatButton

class NormalButton(context: Context, attrs: AttributeSet): AppCompatButton(context, attrs) {

    init {
        applyFont()
    }

    private fun applyFont() {
        val boldTypeface: Typeface=Typeface.create("Montserrat Bold", Typeface.BOLD)
        typeface=boldTypeface
    }
}