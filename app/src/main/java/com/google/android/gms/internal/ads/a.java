package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f4287a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri[] f4288b;

    /* renamed from: c, reason: collision with root package name */
    public final y4[] f4289c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f4290d;
    public final long[] e;

    /* renamed from: f, reason: collision with root package name */
    public final String[] f4291f;

    /* renamed from: g, reason: collision with root package name */
    public final ye[] f4292g;

    static {
        String str = bq0.f4860a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
    }

    public a(int i, int[] iArr, y4[] y4VarArr, long[] jArr, String[] strArr, ye[] yeVarArr) {
        boolean z3;
        Uri uri;
        int length = iArr.length;
        int length2 = y4VarArr.length;
        int i10 = 0;
        if (length == length2) {
            z3 = true;
        } else {
            z3 = false;
        }
        b80.l(z3);
        b80.l(length == yeVarArr.length);
        this.f4287a = i;
        this.f4290d = iArr;
        this.f4289c = y4VarArr;
        this.e = jArr;
        this.f4288b = new Uri[length2];
        while (true) {
            Uri[] uriArr = this.f4288b;
            if (i10 < uriArr.length) {
                y4 y4Var = y4VarArr[i10];
                if (y4Var == null) {
                    uri = null;
                } else {
                    j2 j2Var = y4Var.f12771b;
                    j2Var.getClass();
                    uri = j2Var.f7285a;
                }
                uriArr[i10] = uri;
                i10++;
            } else {
                this.f4291f = strArr;
                this.f4292g = yeVarArr;
                return;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f4287a == aVar.f4287a && Arrays.equals(this.f4289c, aVar.f4289c) && Arrays.equals(this.f4290d, aVar.f4290d) && Arrays.equals(this.e, aVar.e) && Arrays.equals(this.f4291f, aVar.f4291f) && Arrays.equals(this.f4292g, aVar.f4292g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f4292g) + ((((Arrays.hashCode(this.e) + ((Arrays.hashCode(this.f4290d) + ((Arrays.hashCode(this.f4289c) + (((this.f4287a * 31) - 1) * 961)) * 31)) * 31)) * 29791) + Arrays.hashCode(this.f4291f)) * 31)) * 31;
    }
}
