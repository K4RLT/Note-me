package com.google.android.gms.internal.ads;
import g3.a;
import p.a;

import android.os.Build;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class uu1 {

    /* renamed from: d, reason: collision with root package name */
    public static final uu1 f11724d;

    /* renamed from: a, reason: collision with root package name */
    public final int f11725a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11726b;

    /* renamed from: c, reason: collision with root package name */
    public final j51 f11727c;

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.i51, com.google.android.gms.internal.ads.y41] */
    static {
        uu1 uu1Var;
        if (Build.VERSION.SDK_INT >= 33) {
            y41 y41Var = new y41(4);
            for (int i = 1; i <= 10; i++) {
                y41Var.f(Integer.valueOf(bq0.e(i)));
            }
            uu1Var = new uu1(2, y41Var.h());
        } else {
            uu1Var = new uu1(2, 10);
        }
        f11724d = uu1Var;
    }

    public uu1(int i, Set set) {
        this.f11725a = i;
        j51 r8 = j51.r(set);
        this.f11727c = r8;
        m61 a10 = r8.a();
        int i10 = 0;
        while (a10.hasNext()) {
            i10 = Math.max(i10, Integer.bitCount(((Integer) a10.next()).intValue()));
        }
        this.f11726b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uu1)) {
            return false;
        }
        uu1 uu1Var = (uu1) obj;
        if (this.f11725a == uu1Var.f11725a && this.f11726b == uu1Var.f11726b && Objects.equals(this.f11727c, uu1Var.f11727c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        j51 j51Var = this.f11727c;
        if (j51Var == null) {
            hashCode = 0;
        } else {
            hashCode = j51Var.hashCode();
        }
        return (((this.f11725a * 31) + this.f11726b) * 31) + hashCode;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f11727c);
        int i = this.f11725a;
        int length = String.valueOf(i).length();
        int i10 = this.f11726b;
        StringBuilder sb2 = new StringBuilder(length + 38 + String.valueOf(i10).length() + 15 + valueOf.length() + 1);
        a.r(i, i10, "AudioProfile[format=", ", maxChannelCount=", sb2);
        return a.o(sb2, ", channelMasks=", valueOf, "]");
    }

    public uu1(int i, int i10) {
        this.f11725a = i;
        this.f11726b = i10;
        this.f11727c = null;
    }
}