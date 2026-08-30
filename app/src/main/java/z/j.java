package z;
import a.a;
import j.c;

import b0.d0;
import java.util.List;
import z1.a1;
import z1.z0;

/* loaded from: classes.dex */
public final class j implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f31704a;

    /* renamed from: b, reason: collision with root package name */
    public final List f31705b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f31706c;

    /* renamed from: d, reason: collision with root package name */
    public final d1.d f31707d;
    public final d1.i e;

    /* renamed from: f, reason: collision with root package name */
    public final y2.m f31708f;

    /* renamed from: g, reason: collision with root package name */
    public final int f31709g;

    /* renamed from: h, reason: collision with root package name */
    public final long f31710h;
    public final Object i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f31711j;

    /* renamed from: k, reason: collision with root package name */
    public final androidx.compose.foundation.lazy.layout.b f31712k;

    /* renamed from: l, reason: collision with root package name */
    public int f31713l;

    /* renamed from: m, reason: collision with root package name */
    public final int f31714m;

    /* renamed from: n, reason: collision with root package name */
    public final int f31715n;

    /* renamed from: o, reason: collision with root package name */
    public final int f31716o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f31717p;

    /* renamed from: q, reason: collision with root package name */
    public int f31718q = Integer.MIN_VALUE;

    /* renamed from: r, reason: collision with root package name */
    public final int[] f31719r;

    public j(int i, List list, boolean z3, d1.d dVar, d1.i iVar, y2.m mVar, int i10, int i11, int i12, long j10, Object obj, Object obj2, androidx.compose.foundation.lazy.layout.b bVar, long j11) {
        int i13;
        int i14;
        this.f31704a = i;
        this.f31705b = list;
        this.f31706c = z3;
        this.f31707d = dVar;
        this.e = iVar;
        this.f31708f = mVar;
        this.f31709g = i12;
        this.f31710h = j10;
        this.i = obj;
        this.f31711j = obj2;
        this.f31712k = bVar;
        int size = list.size();
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < size; i17++) {
            a1 a1Var = (a1) list.get(i17);
            boolean z9 = this.f31706c;
            if (z9) {
                i13 = a1Var.f31770v;
            } else {
                i13 = a1Var.f31769u;
            }
            i15 += i13;
            if (!z9) {
                i14 = a1Var.f31770v;
            } else {
                i14 = a1Var.f31769u;
            }
            i16 = Math.max(i16, i14);
        }
        this.f31714m = i15;
        int i18 = i15 + this.f31709g;
        this.f31715n = i18 >= 0 ? i18 : 0;
        this.f31716o = i16;
        this.f31719r = new int[this.f31705b.size() * 2];
    }

    public final void a(z0 z0Var) {
        if (this.f31718q == Integer.MIN_VALUE) {
            w.a("position() should be called first");
        }
        List list = this.f31705b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a1 a1Var = (a1) list.get(i);
            boolean z3 = this.f31706c;
            if (z3) {
                int i10 = a1Var.f31770v;
            } else {
                int i11 = a1Var.f31769u;
            }
            long i12 = i(i);
            this.f31712k.a(i, this.i);
            long c10 = y2.c(i12, this.f31710h);
            if (z3) {
                z0.r(z0Var, a1Var, c10);
            } else {
                z0.m(z0Var, a1Var, c10);
            }
        }
    }

    @Override // b0.d0
    public final int b() {
        return this.f31705b.size();
    }

    @Override // b0.d0
    public final int c() {
        return this.f31715n;
    }

    @Override // b0.d0
    public final int d() {
        return 1;
    }

    @Override // b0.d0
    public final Object e(int i) {
        return ((a1) this.f31705b.get(i)).H();
    }

    @Override // b0.d0
    public final boolean f() {
        return this.f31706c;
    }

    @Override // b0.d0
    public final void g() {
        this.f31717p = true;
    }

    @Override // b0.d0
    public final int getIndex() {
        return this.f31704a;
    }

    @Override // b0.d0
    public final Object getKey() {
        return this.i;
    }

    @Override // b0.d0
    public final void h(int i, int i10, int i11) {
        k(i, i10, i11);
    }

    @Override // b0.d0
    public final long i(int i) {
        int i10 = i * 2;
        int[] iArr = this.f31719r;
        return (iArr[i10] << 32) | (iArr[i10 + 1] & 4294967295L);
    }

    @Override // b0.d0
    public final int j() {
        return 0;
    }

    public final void k(int i, int i10, int i11) {
        int i12;
        int i13;
        this.f31713l = i;
        boolean z3 = this.f31706c;
        if (z3) {
            i12 = i11;
        } else {
            i12 = i10;
        }
        this.f31718q = i12;
        List list = this.f31705b;
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            a1 a1Var = (a1) list.get(i14);
            int i15 = i14 * 2;
            int[] iArr = this.f31719r;
            if (z3) {
                d1.d dVar = this.f31707d;
                if (dVar != null) {
                    iArr[i15] = dVar.a(a1Var.f31769u, i10, this.f31708f);
                    iArr[i15 + 1] = i;
                    i13 = a1Var.f31770v;
                } else {
                    w.a.b("null horizontalAlignment when isVertical == true");
                    l4.a.p();
                    return;
                }
            } else {
                iArr[i15] = i;
                int i16 = i15 + 1;
                d1.i iVar = this.e;
                if (iVar != null) {
                    iArr[i16] = iVar.a(a1Var.f31770v, i11);
                    i13 = a1Var.f31769u;
                } else {
                    w.a.b("null verticalAlignment when isVertical == false");
                    l4.a.p();
                    return;
                }
            }
            i += i13;
        }
    }
}
