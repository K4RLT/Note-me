package com.google.android.gms.internal.ads;
import g3.a;
import p.a;

import android.text.TextUtils;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class hi {

    /* renamed from: a, reason: collision with root package name */
    public final int f6819a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6820b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6821c;

    /* renamed from: d, reason: collision with root package name */
    public final mw1[] f6822d;
    public int e;

    static {
        String str = bq0.f4860a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public hi(String str, mw1... mw1VarArr) {
        boolean z3;
        int f10;
        String str2;
        int length = mw1VarArr.length;
        int i = 1;
        if (length > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        b80.l(z3);
        this.f6820b = str;
        this.f6822d = mw1VarArr;
        this.f6819a = length;
        String str3 = mw1VarArr[0].f8459o;
        if (TextUtils.isEmpty(str3)) {
            f10 = ha.f(mw1VarArr[0].f8458n);
        } else {
            f10 = ha.f(str3);
        }
        this.f6821c = f10;
        mw1 mw1Var = mw1VarArr[0];
        String str4 = mw1Var.f8450d;
        str4 = (str4 == null || str4.equals("und")) ? "" : str4;
        int i10 = mw1Var.f8451f | 16384;
        while (true) {
            mw1[] mw1VarArr2 = this.f6822d;
            if (i < mw1VarArr2.length) {
                mw1 mw1Var2 = mw1VarArr2[i];
                String str5 = mw1Var2.f8450d;
                if (str5 == null || str5.equals("und")) {
                    str2 = "";
                } else {
                    str2 = str5;
                }
                if (!str4.equals(str2)) {
                    a("languages", i, mw1VarArr2[0].f8450d, str5);
                    return;
                } else {
                    if (i10 != (mw1Var2.f8451f | 16384)) {
                        a("role flags", i, Integer.toBinaryString(mw1VarArr2[0].f8451f), Integer.toBinaryString(this.f6822d[i].f8451f));
                        return;
                    }
                    i++;
                }
            } else {
                return;
            }
        }
    }

    public static void a(String str, int i, String str2, String str3) {
        int length = String.valueOf(str2).length();
        int length2 = String.valueOf(str3).length();
        StringBuilder sb2 = new StringBuilder(str.length() + 40 + length + 17 + length2 + 9 + String.valueOf(i).length() + 1);
        a.t(sb2, "Different ", str, " combined in one TrackGroup: '", str2);
        sb2.append("' (track 0) and '");
        sb2.append(str3);
        sb2.append("' (track ");
        sb2.append(i);
        sb2.append(")");
        x21.P("TrackGroup", "", new IllegalStateException(sb2.toString()));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && hi.class == obj.getClass()) {
            hi hiVar = (hi) obj;
            if (this.f6820b.equals(hiVar.f6820b) && Arrays.equals(this.f6822d, hiVar.f6822d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.e;
        if (i == 0) {
            int hashCode = Arrays.hashCode(this.f6822d) + ((this.f6820b.hashCode() + 527) * 31);
            this.e = hashCode;
            return hashCode;
        }
        return i;
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f6822d);
        String str = this.f6820b;
        return a.o(new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(arrays).length()), str, ": ", arrays);
    }
}
