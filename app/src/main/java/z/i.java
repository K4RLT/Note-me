package z;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import pf.z;
import t.z0;
import z1.q0;

/* loaded from: classes.dex */
public final class i implements q0 {

    /* renamed from: a, reason: collision with root package name */
    public final j f31689a;

    /* renamed from: b, reason: collision with root package name */
    public final int f31690b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f31691c;

    /* renamed from: d, reason: collision with root package name */
    public final float f31692d;
    public final q0 e;

    /* renamed from: f, reason: collision with root package name */
    public final float f31693f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f31694g;

    /* renamed from: h, reason: collision with root package name */
    public final z f31695h;
    public final y2.c i;

    /* renamed from: j, reason: collision with root package name */
    public final long f31696j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f31697k;

    /* renamed from: l, reason: collision with root package name */
    public final int f31698l;

    /* renamed from: m, reason: collision with root package name */
    public final int f31699m;

    /* renamed from: n, reason: collision with root package name */
    public final int f31700n;

    /* renamed from: o, reason: collision with root package name */
    public final z0 f31701o;

    /* renamed from: p, reason: collision with root package name */
    public final int f31702p;

    /* renamed from: q, reason: collision with root package name */
    public final int f31703q;

    public i(j jVar, int i, boolean z3, float f10, q0 q0Var, float f11, boolean z9, z zVar, y2.c cVar, long j10, List list, int i10, int i11, int i12, z0 z0Var, int i13, int i14) {
        this.f31689a = jVar;
        this.f31690b = i;
        this.f31691c = z3;
        this.f31692d = f10;
        this.e = q0Var;
        this.f31693f = f11;
        this.f31694g = z9;
        this.f31695h = zVar;
        this.i = cVar;
        this.f31696j = j10;
        this.f31697k = list;
        this.f31698l = i10;
        this.f31699m = i11;
        this.f31700n = i12;
        this.f31701o = z0Var;
        this.f31702p = i13;
        this.f31703q = i14;
    }

    @Override // z1.q0
    public final void a() {
        this.e.a();
    }

    @Override // z1.q0
    public final Map b() {
        return this.e.b();
    }

    @Override // z1.q0
    public final df.l c() {
        return this.e.c();
    }

    /* JADX WARN: Type inference failed for: r15v0, types: [java.util.List, java.lang.Object] */
    public final i d(int i, boolean z3) {
        j jVar;
        if (!this.f31694g) {
            Object r15 = this.f31697k;
            if (!r15.isEmpty() && (jVar = this.f31689a) != null) {
                int i10 = jVar.f31715n;
                int i11 = this.f31690b - i;
                if (i11 >= 0 && i11 < i10) {
                    j jVar2 = (j) qe.l.w(r15);
                    j jVar3 = (j) qe.l.C(r15);
                    if (!jVar2.f31717p && !jVar3.f31717p) {
                        int i12 = jVar2.f31713l;
                        int i13 = this.f31699m;
                        int i14 = this.f31698l;
                        if (i < 0) {
                            if (Math.min((i12 + jVar2.f31715n) - i14, (jVar3.f31713l + jVar3.f31715n) - i13) <= (-i)) {
                                return null;
                            }
                        } else if (Math.min(i14 - i12, i13 - jVar3.f31713l) <= i) {
                            return null;
                        }
                        int size = ((Collection) r15).size();
                        boolean z9 = false;
                        for (int i15 = 0; i15 < size; i15++) {
                            j jVar4 = (j) r15.get(i15);
                            boolean z10 = jVar4.f31706c;
                            int[] iArr = jVar4.f31719r;
                            if (!jVar4.f31717p) {
                                jVar4.f31713l += i;
                                int length = iArr.length;
                                for (int i16 = 0; i16 < length; i16++) {
                                    int i17 = i16 & 1;
                                    if ((z10 && i17 != 0) || (!z10 && i17 == 0)) {
                                        iArr[i16] = iArr[i16] + i;
                                    }
                                }
                                if (z3) {
                                    int size2 = jVar4.f31705b.size();
                                    for (int i18 = 0; i18 < size2; i18++) {
                                        jVar4.f31712k.a(i18, jVar4.i);
                                    }
                                }
                            }
                        }
                        if (this.f31691c || i > 0) {
                            z9 = true;
                        }
                        return new i(this.f31689a, i11, z9, i, this.e, this.f31693f, this.f31694g, this.f31695h, this.i, this.f31696j, r15, this.f31698l, this.f31699m, this.f31700n, this.f31701o, this.f31702p, this.f31703q);
                    }
                    return null;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public final long e() {
        q0 q0Var = this.e;
        return (q0Var.getWidth() << 32) | (q0Var.getHeight() & 4294967295L);
    }

    @Override // z1.q0
    public final int getHeight() {
        return this.e.getHeight();
    }

    @Override // z1.q0
    public final int getWidth() {
        return this.e.getWidth();
    }
}