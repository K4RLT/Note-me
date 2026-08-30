package j3;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.util.List;
import wa.v8;

/* loaded from: classes.dex */
public final class k extends v8 {
    public static Font f(FontFamily fontFamily, int i) {
        int i10;
        int i11;
        if ((i & 1) != 0) {
            i10 = 700;
        } else {
            i10 = 400;
        }
        if ((i & 2) != 0) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        FontStyle fontStyle = new FontStyle(i10, i11);
        Font font = fontFamily.getFont(0);
        int h3 = h(fontStyle, font.getStyle());
        for (int i12 = 1; i12 < fontFamily.getSize(); i12++) {
            Font font2 = fontFamily.getFont(i12);
            int h10 = h(fontStyle, font2.getStyle());
            if (h10 < h3) {
                font = font2;
                h3 = h10;
            }
        }
        return font;
    }

    public static FontFamily g(m3.g[] gVarArr, ContentResolver contentResolver) {
        ParcelFileDescriptor openFileDescriptor;
        FontFamily.Builder builder = null;
        for (m3.g gVar : gVarArr) {
            try {
                openFileDescriptor = contentResolver.openFileDescriptor(gVar.f20605a, "r", null);
            } catch (IOException e) {
                Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            }
            if (openFileDescriptor == null) {
                if (openFileDescriptor == null) {
                }
            } else {
                try {
                    Font build = new Font.Builder(openFileDescriptor).setWeight(gVar.f20607c).setSlant(gVar.f20608d ? 1 : 0).setTtcIndex(gVar.f20606b).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (Throwable th) {
                    try {
                        openFileDescriptor.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                    break;
                }
            }
            openFileDescriptor.close();
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public static int h(FontStyle fontStyle, FontStyle fontStyle2) {
        int i;
        int abs = Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100;
        if (fontStyle.getSlant() == fontStyle2.getSlant()) {
            i = 0;
        } else {
            i = 2;
        }
        return abs + i;
    }

    @Override // wa.v8
    public final Typeface a(Context context, i3.e eVar, Resources resources, int i) {
        try {
            FontFamily.Builder builder = null;
            for (i3.f fVar : eVar.f18178a) {
                try {
                    Font build = new Font.Builder(resources, fVar.f18183f).setWeight(fVar.f18180b).setSlant(fVar.f18181c ? 1 : 0).setTtcIndex(fVar.e).setFontVariationSettings(fVar.f18182d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(f(build2, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // wa.v8
    public final Typeface b(Context context, m3.g[] gVarArr, int i) {
        try {
            FontFamily g8 = g(gVarArr, context.getContentResolver());
            if (g8 == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(g8).setStyle(f(g8, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // wa.v8
    public final Typeface c(Context context, List list, int i) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily g8 = g((m3.g[]) list.get(0), contentResolver);
            if (g8 == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(g8);
            for (int i10 = 1; i10 < list.size(); i10++) {
                FontFamily g10 = g((m3.g[]) list.get(i10), contentResolver);
                if (g10 != null) {
                    customFallbackBuilder.addCustomFallback(g10);
                }
            }
            return customFallbackBuilder.setStyle(f(g8, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // wa.v8
    public final Typeface d(Context context, Resources resources, int i, String str, int i10) {
        try {
            Font build = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }
}
