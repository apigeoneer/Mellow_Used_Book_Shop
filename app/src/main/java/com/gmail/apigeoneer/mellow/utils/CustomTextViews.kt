package com.gmail.apigeoneer.mellow.utils

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatEditText
import androidx.appcompat.widget.AppCompatTextView

class BoldTextView(context: Context, attrs: AttributeSet) : AppCompatTextView(context, attrs) {

    init {
        applyFont()
    }

    private fun applyFont() {
        val boldTypeface: Typeface=Typeface.create("Montserrat Bold", Typeface.BOLD)
        typeface=boldTypeface
    }
}

class NormalTextView(context: Context, attrs: AttributeSet) : AppCompatTextView(context, attrs) {

    init {
        applyFont()
    }

    private fun applyFont() {
        val normalTypeface: Typeface=Typeface.create("Montserrat", Typeface.NORMAL)
        typeface=normalTypeface
    }
}

class NormalEditText(context: Context, attrs: AttributeSet) :
    AppCompatEditText(context, attrs) {

    init {
        applyFont()
    }

    private fun applyFont() {
        val normalTypeface: Typeface=Typeface.create("Montserrat", Typeface.NORMAL)
        typeface=normalTypeface
    }
}