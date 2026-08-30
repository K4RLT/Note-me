package v1;
import a0.o;
import l.a;
import n.a0;
import n.d0;
import n.q;

import com.google.android.gms.internal.ads.mf;
import java.util.List;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final z1.x f27294a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f27295b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f27296c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f27297d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public final d0 f27298f = new d0();

    /* renamed from: g, reason: collision with root package name */
    public final j f27299g = new j();

    /* renamed from: h, reason: collision with root package name */
    public final a0 f27300h = new a0(10);

    public e(z1.x xVar) {
        this.f27294a = xVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    public final void a(long j10, List list, boolean z3) {
        int i;
        i iVar;
        i iVar2;
        a0 a0Var = this.f27300h;
        a0Var.a();
        int size = list.size();
        j jVar = this.f27299g;
        j jVar2 = jVar;
        boolean z9 = true;
        for (int i10 = 0; i10 < size; i10++) {
            d1.q qVar = (d1.q) list.get(i10);
            if (qVar.H) {
                qVar.G = new o(this, 21, qVar);
                if (z9) {
                    t0.e eVar = jVar2.f27325a;
                    Object r14 = eVar.f25617u;
                    int i11 = eVar.f25619w;
                    int i12 = 0;
                    while (true) {
                        if (i12 < i11) {
                            iVar2 = r14[i12];
                            if (kotlin.jvm.internal.a(((i) iVar2).f27319c, qVar)) {
                                break;
                            } else {
                                i12++;
                            }
                        } else {
                            iVar2 = 0;
                            break;
                        }
                    }
                    iVar = iVar2;
                    if (iVar != null) {
                        iVar.i = true;
                        iVar.f27320d.a(j10);
                        Object e = a0Var.e(j10);
                        if (e == null) {
                            e = new d0();
                            a0Var.h(j10, e);
                        }
                        ((d0) e).a(iVar);
                        jVar2 = iVar;
                    } else {
                        z9 = false;
                    }
                }
                iVar = new i(qVar);
                iVar.f27320d.a(j10);
                Object e8 = a0Var.e(j10);
                if (e8 == null) {
                    e8 = new d0();
                    a0Var.h(j10, e8);
                }
                ((d0) e8).a(iVar);
                jVar2.f27325a.b(iVar);
                jVar2 = iVar;
            }
        }
        if (z3) {
            long[] jArr = a0Var.f20836b;
            Object[] objArr = a0Var.f20837c;
            long[] jArr2 = a0Var.f20835a;
            int length = jArr2.length - 2;
            if (length >= 0) {
                int i13 = 0;
                while (true) {
                    long j11 = jArr2[i13];
                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i14 = 8;
                        int i15 = 8 - ((~(i13 - length)) >>> 31);
                        int i16 = 0;
                        while (i16 < i15) {
                            if ((255 & j11) < 128) {
                                int i17 = (i13 << 3) + i16;
                                long j12 = jArr[i17];
                                d0 d0Var = (d0) objArr[i17];
                                t0.e eVar2 = jVar.f27325a;
                                i = i14;
                                Object[] objArr2 = eVar2.f25617u;
                                int i18 = eVar2.f25619w;
                                for (int i19 = 0; i19 < i18; i19++) {
                                    ((i) objArr2[i19]).f(j12, d0Var);
                                }
                            } else {
                                i = i14;
                            }
                            j11 >>= i;
                            i16++;
                            i14 = i;
                        }
                        if (i15 != i14) {
                            return;
                        }
                    }
                    if (i13 != length) {
                        i13++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final boolean b(mf mfVar, boolean z3) {
        q qVar = (q) mfVar.f8337v;
        z1.x xVar = this.f27294a;
        j jVar = this.f27299g;
        boolean a10 = jVar.a(qVar, xVar, mfVar, z3);
        t0.e eVar = jVar.f27325a;
        if (!a10) {
            return false;
        }
        boolean z9 = true;
        this.f27295b = true;
        Object[] objArr = eVar.f25617u;
        int i = eVar.f25619w;
        boolean z10 = false;
        for (int i10 = 0; i10 < i; i10++) {
            if (!((i) objArr[i10]).e(mfVar, z3) && !z10) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        Object[] objArr2 = eVar.f25617u;
        int i11 = eVar.f25619w;
        boolean z11 = false;
        for (int i12 = 0; i12 < i11; i12++) {
            if (!((i) objArr2[i12]).d(mfVar) && !z11) {
                z11 = false;
            } else {
                z11 = true;
            }
        }
        jVar.b(mfVar);
        if (!z11 && !z10) {
            z9 = false;
        }
        this.f27295b = false;
        if (this.e) {
            this.e = false;
            d0 d0Var = this.f27298f;
            int i13 = d0Var.f20856b;
            for (int i14 = 0; i14 < i13; i14++) {
                d((d1.q) d0Var.e(i14));
            }
            d0Var.c();
        }
        if (this.f27296c) {
            this.f27296c = false;
            c();
        }
        if (this.f27297d) {
            this.f27297d = false;
            jVar.f27325a.j();
        }
        return z9;
    }

    public final void c() {
        if (this.f27295b) {
            this.f27296c = true;
            return;
        }
        j jVar = this.f27299g;
        t0.e eVar = jVar.f27325a;
        Object[] objArr = eVar.f25617u;
        int i = eVar.f25619w;
        for (int i10 = 0; i10 < i; i10++) {
            ((i) objArr[i10]).c();
        }
        if (this.f27297d) {
            this.f27297d = true;
        } else {
            jVar.f27325a.j();
        }
    }

    public final void d(d1.q qVar) {
        if (this.f27295b) {
            this.e = true;
            this.f27298f.a(qVar);
            return;
        }
        j jVar = this.f27299g;
        d0 d0Var = jVar.f27326b;
        d0Var.c();
        d0Var.a(jVar);
        while (d0Var.h()) {
            j jVar2 = (j) d0Var.j(d0Var.f20856b - 1);
            int i = 0;
            while (true) {
                t0.e eVar = jVar2.f27325a;
                if (i < eVar.f25619w) {
                    i iVar = (i) eVar.f25617u[i];
                    if (kotlin.jvm.internal.a(iVar.f27319c, qVar)) {
                        jVar2.f27325a.m(iVar);
                        iVar.c();
                    } else {
                        d0Var.a(iVar);
                        i++;
                    }
                }
            }
        }
    }
}