package com.google.android.gms.internal.ads;

import java.util.Locale;

/* loaded from: classes.dex */
public final class vb {

    /* renamed from: d, reason: collision with root package name */
    public static final vb f11869d = new vb(1.0f, 1.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f11870a;

    /* renamed from: b, reason: collision with root package name */
    public final float f11871b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11872c;

    static {
        String str = bq0.f4860a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public vb(float f10, float f11) {
        boolean z3;
        if (f10 > 0.0f) {
            z3 = true;
        } else {
            z3 = false;
        }
        b80.l(z3);
        b80.l(f11 > 0.0f);
        this.f11870a = f10;
        this.f11871b = f11;
        this.f11872c = Math.round(f10 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && vb.class == obj.getClass()) {
            vb vbVar = (vb) obj;
            if (this.f11870a == vbVar.f11870a && this.f11871b == vbVar.f11871b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f11871b) + ((Float.floatToRawIntBits(this.f11870a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f11870a), Float.valueOf(this.f11871b)};
        String str = bq0.f4860a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
