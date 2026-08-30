package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ah {

    /* renamed from: m, reason: collision with root package name */
    public static final Object f4496m = new Object();

    /* renamed from: n, reason: collision with root package name */
    public static final y4 f4497n;

    /* renamed from: a, reason: collision with root package name */
    public Object f4498a = f4496m;

    /* renamed from: b, reason: collision with root package name */
    public y4 f4499b = f4497n;

    /* renamed from: c, reason: collision with root package name */
    public long f4500c;

    /* renamed from: d, reason: collision with root package name */
    public long f4501d;
    public long e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4502f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4503g;

    /* renamed from: h, reason: collision with root package name */
    public v1 f4504h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public long f4505j;

    /* renamed from: k, reason: collision with root package name */
    public int f4506k;

    /* renamed from: l, reason: collision with root package name */
    public int f4507l;

    /* JADX WARN: Type inference failed for: r5v0, types: [com.google.android.gms.internal.ads.n, com.google.android.gms.internal.ads.b0] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, com.google.android.gms.internal.ads.v1] */
    static {
        j2 j2Var;
        b51 b51Var = d51.f5314v;
        y51 y51Var = y51.f12781y;
        List list = Collections.EMPTY_LIST;
        y51 y51Var2 = y51.f12781y;
        o3 o3Var = o3.f8931a;
        Uri uri = Uri.EMPTY;
        if (uri != null) {
            j2Var = new j2(uri, y51Var2);
        } else {
            j2Var = null;
        }
        f4497n = new y4("androidx.media3.common.Timeline", new n(), j2Var, new Object(), a7.C);
        String str = bq0.f4860a;
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
        Integer.toString(12, 36);
        Integer.toString(13, 36);
    }

    public final void a(y4 y4Var, boolean z3, boolean z9, v1 v1Var, long j10) {
        this.f4498a = f4496m;
        if (y4Var == null) {
            y4Var = f4497n;
        }
        this.f4499b = y4Var;
        this.f4500c = -9223372036854775807L;
        this.f4501d = -9223372036854775807L;
        this.e = -9223372036854775807L;
        this.f4502f = z3;
        this.f4503g = z9;
        this.f4504h = v1Var;
        this.f4505j = j10;
        this.f4506k = 0;
        this.f4507l = 0;
        this.i = false;
    }

    public final boolean b() {
        return this.f4504h != null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && ah.class.equals(obj.getClass())) {
                ah ahVar = (ah) obj;
                if (Objects.equals(this.f4498a, ahVar.f4498a) && Objects.equals(this.f4499b, ahVar.f4499b) && Objects.equals(this.f4504h, ahVar.f4504h) && this.f4500c == ahVar.f4500c && this.f4501d == ahVar.f4501d && this.e == ahVar.e && this.f4502f == ahVar.f4502f && this.f4503g == ahVar.f4503g && this.i == ahVar.i && this.f4505j == ahVar.f4505j && this.f4506k == ahVar.f4506k && this.f4507l == ahVar.f4507l) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((this.f4498a.hashCode() + 217) * 31) + this.f4499b.hashCode();
        v1 v1Var = this.f4504h;
        if (v1Var == null) {
            hashCode = 0;
        } else {
            hashCode = v1Var.hashCode();
        }
        int i = ((hashCode2 * 961) + hashCode) * 31;
        long j10 = this.f4500c;
        int i10 = (i + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f4501d;
        int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.e;
        int i12 = ((((((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.f4502f ? 1 : 0)) * 31) + (this.f4503g ? 1 : 0)) * 31) + (this.i ? 1 : 0);
        long j13 = this.f4505j;
        return ((((((i12 * 961) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + this.f4506k) * 31) + this.f4507l) * 31;
    }
}
