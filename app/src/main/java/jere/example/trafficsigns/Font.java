package jere.example.trafficsigns;

import android.content.Context;
import android.graphics.Typeface;

public class Font {
    public Context context;

    public Font(Context context) {
        this.context = context;
    }

    public Typeface sourceSansProRegular() {
        return Typeface.createFromAsset(context.getAssets(), "fonts/SourceSansPro-Regular.ttf");
    }
}
