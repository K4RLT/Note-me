package r0;
import p.i;
import p.j;
import p.k;
import p.m;
import b1.h0;
import b1.i0;
import b1.i;
import b1.j0;
import b1.p;
import b1.w;
import b1.z;
import n.c0;
import r0.n2;
import t0.e;
import z0.d;

/* loaded from: classes.dex */
public final class g0 extends i0 implements n2 {

    /* renamed from: v, reason: collision with root package name */
    public final df.a f24253v;

    /* renamed from: w, reason: collision with root package name */
    public final v0 f24254w;

    /* renamed from: x, reason: collision with root package name */
    public f0 f24255x = new f0(p.k().g());

    public g0(df.a aVar, v0 v0Var) {
        this.f24253v = aVar;
        this.f24254w = v0Var;
    }

    @Override // h0
    public final void a(j0 j0Var) {
        j0Var.getClass();
        this.f24255x = (f0) j0Var;
    }

    @Override // h0
    public final j0 b() {
        return this.f24255x;
    }

    @Override // n2
    public final Object getValue() {
        df.l e = p.k().e();
        if (e != null) {
            e.invoke(this);
        }
        i k3 = p.k();
        return h((f0) p.j(this.f24255x, k3), k3, true, this.f24253v).f24248f;
    }

    public final f0 h(f0 f0Var, i iVar, boolean z3, df.a aVar) {
        e q10;
        v0 v0Var;
        int i;
        f0 f0Var2 = f0Var;
        if (f0Var2.c(this, iVar)) {
            if (z3) {
                q10 = y.q();
                Object[] objArr = q10.f25617u;
                int i10 = q10.f25619w;
                for (int i11 = 0; i11 < i10; i11++) {
                    ((z) objArr[i11]).b();
                }
                try {
                    c0 c0Var = f0Var2.e;
                    ya.y yVar = j2.f24272a;
                    d dVar = (d) yVar.b();
                    if (dVar == null) {
                        dVar = new d();
                        yVar.c(dVar);
                    }
                    int i12 = dVar.f31760a;
                    Object[] objArr2 = c0Var.f20850b;
                    int[] iArr = c0Var.f20851c;
                    long[] jArr = c0Var.f20849a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i13 = 0;
                        while (true) {
                            long j10 = jArr[i13];
                            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i14 = 8;
                                int i15 = 8 - ((~(i13 - length)) >>> 31);
                                int i16 = 0;
                                while (i16 < i15) {
                                    if ((j10 & 255) < 128) {
                                        int i17 = (i13 << 3) + i16;
                                        i = i14;
                                        h0 h0Var = (h0) objArr2[i17];
                                        dVar.f31760a = i12 + iArr[i17];
                                        df.l e = iVar.e();
                                        if (e != null) {
                                            e.invoke(h0Var);
                                        }
                                    } else {
                                        i = i14;
                                    }
                                    j10 >>= i;
                                    i16++;
                                    i14 = i;
                                }
                                if (i15 != i14) {
                                    break;
                                }
                            }
                            if (i13 == length) {
                                break;
                            }
                            i13++;
                        }
                    }
                    dVar.f31760a = i12;
                    Object[] objArr3 = q10.f25617u;
                    int i18 = q10.f25619w;
                    for (int i19 = 0; i19 < i18; i19++) {
                        ((z) objArr3[i19]).a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return f0Var2;
        }
        c0 c0Var2 = new c0();
        ya.y yVar2 = j2.f24272a;
        d dVar2 = (d) yVar2.b();
        if (dVar2 == null) {
            dVar2 = new d();
            yVar2.c(dVar2);
        }
        int i20 = dVar2.f31760a;
        q10 = y.q();
        Object[] objArr4 = q10.f25617u;
        int i21 = q10.f25619w;
        for (int i22 = 0; i22 < i21; i22++) {
            ((z) objArr4[i22]).b();
        }
        try {
            dVar2.f31760a = i20 + 1;
            Object i23 = w.i(aVar, new e0(this, dVar2, c0Var2, i20));
            dVar2.f31760a = i20;
            Object[] objArr5 = q10.f25617u;
            int i24 = q10.f25619w;
            for (int i25 = 0; i25 < i24; i25++) {
                ((z) objArr5[i25]).a();
            }
            Object obj = p.f1387c;
            synchronized (obj) {
                try {
                    i k3 = p.k();
                    Object obj2 = f0Var2.f24248f;
                    if (obj2 != f0.f24245h && (v0Var = this.f24254w) != null && v0Var.b(i23, obj2)) {
                        f0Var2.e = c0Var2;
                        f0Var2.f24249g = f0Var2.d(this, k3);
                    } else {
                        f0 f0Var3 = this.f24255x;
                        synchronized (obj) {
                            j0 m4 = p.m(f0Var3, this);
                            m4.a(f0Var3);
                            m4.f1350a = k3.g();
                            f0Var2 = (f0) m4;
                            f0Var2.e = c0Var2;
                            f0Var2.f24249g = f0Var2.d(this, k3);
                            f0Var2.f24248f = i23;
                        }
                        return f0Var2;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            d dVar3 = (d) j2.f24272a.b();
            if (dVar3 != null && dVar3.f31760a == 0) {
                p.k().m();
                synchronized (obj) {
                    i k4 = p.k();
                    f0Var2.f24246c = k4.g();
                    f0Var2.f24247d = k4.h();
                    return f0Var2;
                }
            }
            return f0Var2;
        } finally {
            Object[] objArr6 = q10.f25617u;
            int i26 = q10.f25619w;
            for (int i27 = 0; i27 < i26; i27++) {
                ((z) objArr6[i27]).a();
            }
        }
    }

    public final f0 i() {
        i k3 = p.k();
        return h((f0) p.j(this.f24255x, k3), k3, false, this.f24253v);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("DerivedState(value=");
        f0 f0Var = (f0) p.i(this.f24255x);
        if (f0Var.c(this, p.k())) {
            str = String.valueOf(f0Var.f24248f);
        } else {
            str = "<Not calculated>";
        }
        sb2.append(str);
        sb2.append(")@");
        sb2.append(hashCode());
        return sb2.toString();
    }
}
