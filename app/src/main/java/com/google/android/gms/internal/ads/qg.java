package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
public final class qg {

    /* renamed from: a, reason: collision with root package name */
    public Object f9839a;

    /* renamed from: b, reason: collision with root package name */
    public Object f9840b;

    /* renamed from: c, reason: collision with root package name */
    public int f9841c;

    /* renamed from: d, reason: collision with root package name */
    public long f9842d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public eu f9843f = eu.f5807b;

    static {
        String str = bq0.f4860a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public final void a(Object obj, Object obj2, int i, long j10, boolean z3) {
        eu euVar = eu.f5807b;
        this.f9839a = obj;
        this.f9840b = obj2;
        this.f9841c = i;
        this.f9842d = j10;
        this.f9843f = euVar;
        this.e = z3;
    }

    public final long b(int i, int i10) {
        a a10 = this.f9843f.a(i);
        if (a10.f4287a != -1) {
            return a10.e[i10];
        }
        return -9223372036854775807L;
    }

    public final void c(int i) {
        this.f9843f.a(i).getClass();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && qg.class.equals(obj.getClass())) {
                qg qgVar = (qg) obj;
                if (Objects.equals(this.f9839a, qgVar.f9839a) && Objects.equals(this.f9840b, qgVar.f9840b) && this.f9841c == qgVar.f9841c && this.f9842d == qgVar.f9842d && this.e == qgVar.e && Objects.equals(this.f9843f, qgVar.f9843f)) {
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
        Object obj = this.f9839a;
        int i = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Object obj2 = this.f9840b;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        int i10 = ((((hashCode + 217) * 31) + i) * 31) + this.f9841c;
        long j10 = this.f9842d;
        return this.f9843f.hashCode() + (((((i10 * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 961) + (this.e ? 1 : 0)) * 31);
    }
}
