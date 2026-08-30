package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.util.EnumSet;

/* loaded from: classes.dex */
public final class et {

    /* renamed from: c, reason: collision with root package name */
    public static final et f14272c;

    /* renamed from: d, reason: collision with root package name */
    public static final et f14273d;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f14274a;

    /* renamed from: b, reason: collision with root package name */
    public final n4 f14275b;

    static {
        if (n4.r(EnumSet.noneOf(gt.class)) == null) {
            int i = n4.f14693w;
            f5 f5Var = f5.D;
        }
        gt gtVar = gt.f14379u;
        n4 r8 = n4.r(EnumSet.of(gtVar));
        if (r8 == null) {
            int i10 = n4.f14693w;
            r8 = f5.D;
        }
        f14272c = new et(true, r8);
        n4 r10 = n4.r(EnumSet.of(gtVar));
        if (r10 == null) {
            int i11 = n4.f14693w;
            r10 = f5.D;
        }
        f14273d = new et(false, r10);
    }

    public et(boolean z3, n4 n4Var) {
        this.f14274a = z3;
        this.f14275b = n4Var;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof et) {
                et etVar = (et) obj;
                if (this.f14274a == etVar.f14274a && this.f14275b.equals(etVar.f14275b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        if (true != this.f14274a) {
            i = 1237;
        } else {
            i = 1231;
        }
        return ((i ^ 1000003) * 1000003) ^ this.f14275b.hashCode();
    }

    public final String toString() {
        return "DownloadConstraints{requireUnmeteredNetwork=" + this.f14274a + ", requiredNetworkTypes=" + String.valueOf(this.f14275b) + "}";
    }
}
