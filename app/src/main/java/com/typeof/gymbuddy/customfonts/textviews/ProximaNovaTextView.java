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
public class ProximaNovaTextView extends TextView {
    public ProximaNovaTextView(Context context) {
        super(context);

        applyCustomFont(context);
    }

    public ProximaNovaTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);

        applyCustomFont(context);
    }

    public ProximaNovaTextView(Context context, AttributeSet attributeSet, int defStyle) {
        super(context, attributeSet, defStyle);

        applyCustomFont(context);
    }

    private void applyCustomFont(Context context) {
        Typeface customFont = FontCache.getTypeface("fonts/ProximaNova/proximanova-regular-webfont.ttf", context);

        setTypeface(customFont);
    }

}
