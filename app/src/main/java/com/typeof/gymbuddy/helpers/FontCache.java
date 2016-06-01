package com.typeof.gymbuddy.helpers;

import android.content.Context;
import android.graphics.Typeface;

import java.util.HashMap;

/**
 * Font Cache
 */
public class FontCache {
    private static HashMap<String, Typeface> fontCache = new HashMap<>();

    public static Typeface getTypeface(String fontName, Context context) {
        Typeface typeface = fontCache.get(fontName);

        if (typeface == null) {
            try {
                typeface = Typeface.createFromAsset(context.getAssets(), fontName);
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }

            fontCache.put(fontName, typeface);
        }

        return typeface;
    }
}
