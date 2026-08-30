package j;
import j.b;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f18615b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static b f18616c;

    /* renamed from: a, reason: collision with root package name */
    public o f18617a;

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, j.b] */
    public static synchronized void b() {
        synchronized (b.class) {
            if (f18616c == null) {
                Object obj = new Object();
                f18616c = obj;
                obj.f18617a = o.c();
                o oVar = f18616c.f18617a;
                g9.n nVar = new g9.n(9);
                synchronized (oVar) {
                    oVar.e = nVar;
                }
            }
        }
    }

    public static void c(Drawable drawable, ig.h hVar, int[] iArr) {
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        PorterDuff.Mode mode2 = o.f18669f;
        int[] state = drawable.getState();
        int[] iArr2 = k.f18646a;
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z3 = hVar.f18504b;
            if (!z3 && !hVar.f18503a) {
                drawable.clearColorFilter();
                return;
            }
            PorterDuffColorFilter porterDuffColorFilter = null;
            if (z3) {
                colorStateList = (ColorStateList) hVar.f18505c;
            } else {
                colorStateList = null;
            }
            if (hVar.f18503a) {
                mode = (PorterDuff.Mode) hVar.f18506d;
            } else {
                mode = o.f18669f;
            }
            if (colorStateList != null && mode != null) {
                porterDuffColorFilter = o.f(colorStateList.getColorForState(iArr, 0), mode);
            }
            drawable.setColorFilter(porterDuffColorFilter);
            return;
        }
        Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
    }

    public final synchronized Drawable a(Context context, int i) {
        return this.f18617a.d(context, i);
    }
}