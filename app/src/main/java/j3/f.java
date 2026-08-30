package j3;
import f.a;

import android.content.res.Resources;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import com.google.android.gms.internal.ads.h0;
import java.lang.reflect.Method;
import wa.v8;
import ya.gd;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final v8 f18880a;

    /* renamed from: b, reason: collision with root package name */
    public static final h0 f18881b;

    static {
        gd.a("TypefaceCompat static init");
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            f18880a = new v8();
        } else if (i >= 28) {
            f18880a = new i();
        } else if (i >= 26) {
            f18880a = new i();
        } else {
            Method method = h.f18888c;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                f18880a = new v8();
            } else {
                f18880a = new v8();
            }
        }
        f18881b = new h0(16);
        Trace.endSection();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        if (r3.equals(r9) == false) goto L15;
     */
    /* JADX WARN: Type inference failed for: r12v1, types: [j3.e, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface a(android.content.Context r16, i3.d r17, android.content.res.Resources r18, int r19, java.lang.String r20, int r21, int r22, com.google.android.gms.internal.ads.l3 r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.a(android.content.Context, i3.d, android.content.res.Resources, int, java.lang.String, int, int, com.google.android.gms.internal.ads.l3, boolean):android.graphics.Typeface");
    }

    public static String b(Resources resources, int i, String str, int i10, int i11) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i10 + '-' + i + '-' + i11;
    }
}
