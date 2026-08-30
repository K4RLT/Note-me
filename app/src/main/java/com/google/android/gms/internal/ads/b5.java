package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class b5 extends x4 {

    /* renamed from: b, reason: collision with root package name */
    public final int f4716b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4717c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4718d;
    public final int[] e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f4719f;

    public b5(int i, int i10, int i11, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f4716b = i;
        this.f4717c = i10;
        this.f4718d = i11;
        this.e = iArr;
        this.f4719f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && b5.class == obj.getClass()) {
                b5 b5Var = (b5) obj;
                if (this.f4716b == b5Var.f4716b && this.f4717c == b5Var.f4717c && this.f4718d == b5Var.f4718d && Arrays.equals(this.e, b5Var.e) && Arrays.equals(this.f4719f, b5Var.f4719f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f4719f) + ((Arrays.hashCode(this.e) + ((((((this.f4716b + 527) * 31) + this.f4717c) * 31) + this.f4718d) * 31)) * 31);
    }
}
