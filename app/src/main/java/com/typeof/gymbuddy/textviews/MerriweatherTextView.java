package com.typeof.gymbuddy.textviews;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

import com.typeof.gymbuddy.helpers.FontCache;

/**
 * Custom font for text view
 */
public class MerriweatherTextView extends TextView {

    public MerriweatherTextView(Context context) {
        super(context);

        applyCustomFont(context);
    }

    public MerriweatherTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);

        applyCustomFont(context);
    }

    public  MerriweatherTextView(Context context, AttributeSet attributeSet, int defStyle) {
        super(context, attributeSet, defStyle);

        applyCustomFont(context);
    }

    private void applyCustomFont(Context context) {
        Typeface customFont = FontCache.getTypeface("fonts/Merriweather/Merriweather-LightItalic.ttf", context);

        setTypeface(customFont);
    }
}
