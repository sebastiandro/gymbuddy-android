package com.typeof.gymbuddy.customfonts.textviews;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

import com.typeof.gymbuddy.helpers.FontCache;

/**
 * Gymbuddy
 * Group 22
 * Created on 16-06-01.
 */
public class MontserratTextView extends TextView {
    public MontserratTextView(Context context) {
        super(context);

        applyCustomFont(context);
    }

    public MontserratTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);

        applyCustomFont(context);
    }

    public MontserratTextView(Context context, AttributeSet attributeSet, int defStyle) {
        super(context, attributeSet, defStyle);

        applyCustomFont(context);
    }

    private void applyCustomFont(Context context) {
        Typeface customFont = FontCache.getTypeface("fonts/Montserrat/Montserrat-Bold.ttf", context);

        setTypeface(customFont);
    }

}
