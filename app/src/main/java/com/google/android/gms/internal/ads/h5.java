package com.google.android.gms.internal.ads;
import a.a;
import p.a;

/* loaded from: classes.dex */
public final class h5 implements q7 {

    /* renamed from: a, reason: collision with root package name */
    public final float f6599a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6600b;

    public h5(int i, float f10) {
        this.f6599a = f10;
        this.f6600b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h5.class == obj.getClass()) {
            h5 h5Var = (h5) obj;
            if (this.f6599a == h5Var.f6599a && this.f6600b == h5Var.f6600b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return p.a.a(527, 31, this.f6599a) + this.f6600b;
    }

    public final String toString() {
        float f10 = this.f6599a;
        int length = String.valueOf(f10).length();
        int i = this.f6600b;
        StringBuilder sb2 = new StringBuilder(length + 47 + String.valueOf(i).length());
        sb2.append("smta: captureFrameRate=");
        sb2.append(f10);
        sb2.append(", svcTemporalLayerCount=");
        sb2.append(i);
        return sb2.toString();
    }
}
