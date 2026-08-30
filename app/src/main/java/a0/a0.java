package a0;
import a.a;
import b0.d0;
import j.c;
import w.a;

import java.util.List;
import z1.a1;
import z1.z0;

/* loaded from: classes.dex */
public final class a0 implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f3a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5c;

    /* renamed from: d, reason: collision with root package name */
    public final y2.m f6d;
    public final List e;

    /* renamed from: f, reason: collision with root package name */
    public final long f7f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f8g;

    /* renamed from: h, reason: collision with root package name */
    public final androidx.compose.foundation.lazy.layout.b f9h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final int f10j;

    /* renamed from: k, reason: collision with root package name */
    public final int f11k;

    /* renamed from: l, reason: collision with root package name */
    public final int f12l;

    /* renamed from: m, reason: collision with root package name */
    public int f13m = Integer.MIN_VALUE;

    /* renamed from: n, reason: collision with root package name */
    public final long f14n;

    /* renamed from: o, reason: collision with root package name */
    public long f15o;

    /* renamed from: p, reason: collision with root package name */
    public int f16p;

    /* renamed from: q, reason: collision with root package name */
    public int f17q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f18r;

    public a0(int i, Object obj, int i10, int i11, y2.m mVar, int i12, int i13, List list, long j10, Object obj2, androidx.compose.foundation.lazy.layout.b bVar, long j11, int i14, int i15) {
        this.f3a = i;
        this.f4b = obj;
        this.f5c = i10;
        this.f6d = mVar;
        this.e = list;
        this.f7f = j10;
        this.f8g = obj2;
        this.f9h = bVar;
        this.i = i14;
        this.f10j = i15;
        int size = list.size();
        int i16 = 0;
        for (int i17 = 0; i17 < size; i17++) {
            i16 = Math.max(i16, ((a1) list.get(i17)).f31770v);
        }
        this.f11k = i16;
        int i18 = i11 + i16;
        this.f12l = i18 >= 0 ? i18 : 0;
        this.f14n = (this.f5c << 32) | (i16 & 4294967295L);
        this.f15o = 0L;
        this.f16p = -1;
        this.f17q = -1;
    }

    public final void a(z0 z0Var) {
        if (this.f13m == Integer.MIN_VALUE) {
            a.a("position() should be called first");
        }
        List list = this.e;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a1 a1Var = (a1) list.get(i);
            int i10 = a1Var.f31770v;
            long j10 = this.f15o;
            this.f9h.a(i, this.f4b);
            z0.r(z0Var, a1Var, y2.c(j10, this.f7f));
        }
    }

    @Override // d0
    public final int b() {
        return this.e.size();
    }

    @Override // d0
    public final int c() {
        return this.f12l;
    }

    @Override // d0
    public final int d() {
        return this.f10j;
    }

    @Override // d0
    public final Object e(int i) {
        return ((a1) this.e.get(i)).H();
    }

    @Override // d0
    public final boolean f() {
        return true;
    }

    @Override // d0
    public final void g() {
        this.f18r = true;
    }

    @Override // d0
    public final int getIndex() {
        return this.f3a;
    }

    @Override // d0
    public final Object getKey() {
        return this.f4b;
    }

    @Override // d0
    public final void h(int i, int i10, int i11) {
        k(i, 0, i10, i11, -1, -1);
    }

    @Override // d0
    public final long i(int i) {
        return this.f15o;
    }

    @Override // d0
    public final int j() {
        return this.i;
    }

    public final void k(int i, int i10, int i11, int i12, int i13, int i14) {
        this.f13m = i12;
        if (this.f6d == y2.m.f30815v) {
            i10 = (i11 - i10) - this.f5c;
        }
        this.f15o = (i10 << 32) | (i & 4294967295L);
        this.f16p = i13;
        this.f17q = i14;
    }
}
