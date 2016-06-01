package com.typeof.gymbuddy.customfonts.buttons;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.Button;

import com.typeof.gymbuddy.helpers.FontCache;

/**
 * Gymbuddy
 * Group 22
 * Created on 16-06-01.
 */
public class MontserratButton extends Button {

    public MontserratButton(Context context) {
        super(context);

        applyCustomFont(context);
    }

    public MontserratButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);

        applyCustomFont(context);
    }

    public  MontserratButton(Context context, AttributeSet attributeSet, int defStyle) {
        super(context, attributeSet, defStyle);

        applyCustomFont(context);
    }

    private void applyCustomFont(Context context) {
        Typeface customFont = FontCache.getTypeface("fonts/Montserrat/Montserrat-Bold.ttf", context);

        setTypeface(customFont);
    }
    
}
