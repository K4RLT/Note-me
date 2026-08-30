package wa;
import i3.e;
import m3.g;
import w8.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import java.io.File;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class v8 {
    public v8() {
        new ConcurrentHashMap();
    }

    public static g e(g[] gVarArr, int i) {
        int i10;
        boolean z3;
        int i11;
        if ((i & 1) == 0) {
            i10 = 400;
        } else {
            i10 = 700;
        }
        if ((i & 2) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        g gVar = null;
        int i12 = Integer.MAX_VALUE;
        for (g gVar2 : gVarArr) {
            int abs = Math.abs(gVar2.f20607c - i10) * 2;
            if (gVar2.f20608d == z3) {
                i11 = 0;
            } else {
                i11 = 1;
            }
            int i13 = abs + i11;
            if (gVar == null || i12 > i13) {
                gVar = gVar2;
                i12 = i13;
            }
        }
        return gVar;
    }

    public abstract Typeface a(Context context, e eVar, Resources resources, int i);

    public abstract Typeface b(Context context, g[] gVarArr, int i);

    public Typeface c(Context context, List list, int i) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface d(Context context, Resources resources, int i, String str, int i10) {
        File c10 = w8.c(context);
        if (c10 == null) {
            return null;
        }
        try {
            if (!a(c10, resources, i)) {
                return null;
            }
            return Typeface.createFromFile(c10.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            c10.delete();
        }
    }
}
