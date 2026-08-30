package t;
import c.a;
import a.a;
import c.b;
import x.o;
import b0.x;
import b2.a2;
import b2.e2;
import b2.i;
import b2.j;
import b2.k;
import b2.l;
import c0.d0;
import d0.f;
import d1.q;
import i1.s;
import j2.u;
import p.c0;
import t.g1;
import t.i0;
import t.j0;
import t.k0;
import t.n0;
import t.o1;
import t.p;
import t.r1;
import t1.c;
import t1.d;
import u1.g;
import v.h;
import v1.h0;
import v1.t;

import android.os.Build;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.util.Collection;
import ya.hc;

/* loaded from: classes.dex */
public final class r1 extends k implements d, e2, i, a2 {
    public z0 K;
    public e L;
    public boolean M;
    public i N;
    public rf.h O;
    public b P;
    public boolean Q;
    public h0 R;
    public f S;
    public n0 T;
    public final d U;
    public final g1 V;
    public final j W;
    public final z1 X;
    public final c7.f0 Y;
    public final i Z;

    /* renamed from: a0, reason: collision with root package name */
    public d0 f25507a0;

    /* renamed from: b0, reason: collision with root package name */
    public o1 f25508b0;

    /* renamed from: c0, reason: collision with root package name */
    public f5.a f25509c0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [g1, j, q] */
    /* JADX WARN: Type inference failed for: r0v7, types: [j, f, q] */
    /* JADX WARN: Type inference failed for: r0v8, types: [j, c0, q] */
    /* JADX WARN: Type inference failed for: r1v1, types: [n0] */
    /* JADX WARN: Type inference failed for: r9v0, types: [k, java.lang.Object, t.r1] */
    public r1(f fVar, d dVar, n0 n0Var, z0 z0Var, s1 s1Var, i iVar, boolean z3, boolean z9) {
        j jVar;
        e eVar = e.A;
        this.K = z0Var;
        this.L = eVar;
        this.M = z3;
        this.N = iVar;
        this.S = fVar;
        this.T = n0Var;
        d dVar2 = new d();
        this.U = dVar2;
        q qVar = new q();
        qVar.I = z3;
        Y0(qVar);
        this.V = qVar;
        j jVar2 = new j(new u(new k6.i(androidx.compose.foundation.gestures.a.f476c)));
        this.W = jVar2;
        f fVar2 = this.S;
        Object r12 = this.T;
        if (r12 == 0) {
            jVar = jVar2;
        } else {
            jVar = r12;
        }
        z1 z1Var = new z1(s1Var, fVar2, jVar, z0Var, z9, dVar2, new h0(this, 2));
        this.X = z1Var;
        c7.f0 f0Var = new c7.f0(z1Var, z3);
        this.Y = f0Var;
        i iVar2 = new i(z0Var, z1Var, z9, dVar);
        Y0(iVar2);
        this.Z = iVar2;
        Y0(new g(f0Var, dVar2));
        Y0(new s(2, null, 4));
        q qVar2 = new q();
        qVar2.I = iVar2;
        Y0(qVar2);
        c0 c0Var = new c0(9, this);
        q qVar3 = new q();
        qVar3.I = c0Var;
        Y0(qVar3);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b1(t.r1 r8, ve.c r9) {
        /*
            boolean r0 = r9 instanceof i0
            if (r0 == 0) goto L13
            r0 = r9
            i0 r0 = (i0) r0
            int r1 = r0.f25418x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25418x = r1
            goto L18
        L13:
            i0 r0 = new i0
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f25416v
            int r1 = r0.f25418x
            r6 = 0
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L28
            t.r1 r8 = r0.f25415u
            pe.a.e(r9)
            goto L4c
        L28:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r8)
            r8 = 0
            return r8
        L2f:
            pe.a.e(r9)
            b r9 = r8.P
            if (r9 == 0) goto L4e
            i r1 = r8.N
            if (r1 == 0) goto L4c
            a r3 = new a
            r3.<init>(r9)
            r0.f25415u = r8
            r0.f25418x = r2
            java.lang.Object r9 = a(r3, r0)
            ue.a r0 = ue.a.f27192u
            if (r9 != r0) goto L4c
            return r0
        L4c:
            r8.P = r6
        L4e:
            r3 = r8
            d r8 = r3.U
            pf.z r8 = r8.c()
            o1 r2 = new o1
            r7 = 0
            r4 = 0
            r2.<init>(r3, r4, r6, r7)
            r9 = 3
            pf.x(r8, r6, r2, r9)
            pe.z r8 = pe.z.f22715a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: t.r1.b1(t.r1, ve.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0059, code lost:
    
        if (a(r5, r0) == r4) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r8v4, types: [h, java.lang.Object, b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c1(t.r1 r6, o r7, ve.c r8) {
        /*
            boolean r0 = r8 instanceof j0
            if (r0 == 0) goto L13
            r0 = r8
            j0 r0 = (j0) r0
            int r1 = r0.f25429z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25429z = r1
            goto L18
        L13:
            j0 r0 = new j0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f25427x
            int r1 = r0.f25429z
            r2 = 2
            r3 = 1
            ue.a r4 = ue.a.f27192u
            if (r1 == 0) goto L3f
            if (r1 == r3) goto L37
            if (r1 != r2) goto L30
            b r6 = r0.f25426w
            o r7 = r0.f25425v
            t.r1 r0 = r0.f25424u
            pe.a.e(r8)
            goto L76
        L30:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r6)
            r6 = 0
            return r6
        L37:
            o r7 = r0.f25425v
            t.r1 r6 = r0.f25424u
            pe.a.e(r8)
            goto L5c
        L3f:
            pe.a.e(r8)
            b r8 = r6.P
            if (r8 == 0) goto L5c
            i r1 = r6.N
            if (r1 == 0) goto L5c
            a r5 = new a
            r5.<init>(r8)
            r0.f25424u = r6
            r0.f25425v = r7
            r0.f25429z = r3
            java.lang.Object r8 = a(r5, r0)
            if (r8 != r4) goto L5c
            goto L73
        L5c:
            b r8 = new b
            r8.<init>()
            i r1 = r6.N
            if (r1 == 0) goto L78
            r0.f25424u = r6
            r0.f25425v = r7
            r0.f25426w = r8
            r0.f25429z = r2
            java.lang.Object r0 = a(r8, r0)
            if (r0 != r4) goto L74
        L73:
            return r4
        L74:
            r0 = r6
            r6 = r8
        L76:
            r8 = r6
            r6 = r0
        L78:
            r6.P = r8
            long r6 = r7.f25480a
            pe.z r6 = pe.z.f22715a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: t.r1.c1(t.r1, o, ve.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d1(t.r1 r8, p r9, ve.c r10) {
        /*
            boolean r0 = r10 instanceof k0
            if (r0 == 0) goto L13
            r0 = r10
            k0 r0 = (k0) r0
            int r1 = r0.f25439y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25439y = r1
            goto L18
        L13:
            k0 r0 = new k0
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f25437w
            int r1 = r0.f25439y
            r6 = 0
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L2a
            p r9 = r0.f25436v
            t.r1 r8 = r0.f25435u
            pe.a.e(r10)
            goto L50
        L2a:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r8)
            r8 = 0
            return r8
        L31:
            pe.a.e(r10)
            b r10 = r8.P
            if (r10 == 0) goto L52
            i r1 = r8.N
            if (r1 == 0) goto L50
            c r3 = new c
            r3.<init>(r10)
            r0.f25435u = r8
            r0.f25436v = r9
            r0.f25439y = r2
            java.lang.Object r10 = a(r3, r0)
            ue.a r0 = ue.a.f27192u
            if (r10 != r0) goto L50
            return r0
        L50:
            r8.P = r6
        L52:
            r3 = r8
            long r4 = r9.f25489a
            d r8 = r3.U
            pf.z r8 = r8.c()
            o1 r2 = new o1
            r7 = 0
            r2.<init>(r3, r4, r6, r7)
            r9 = 3
            pf.x(r8, r6, r2, r9)
            pe.z r8 = pe.z.f22715a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: t.r1.d1(t.r1, p, ve.c):java.lang.Object");
    }

    @Override // d
    public final boolean E(KeyEvent keyEvent) {
        float f10;
        long floatToRawIntBits;
        float f11;
        boolean z3 = false;
        if (!this.M || ((!a.a(c.a(keyEvent), a.f25632n) && !a.a(hc.a(keyEvent.getKeyCode()), a.f25631m)) || c.b(keyEvent) != 2 || keyEvent.isCtrlPressed())) {
            return false;
        }
        if (this.X.f25603d == z0.f25597u) {
            z3 = true;
        }
        i iVar = this.Z;
        if (z3) {
            int i = (int) (iVar.Q & 4294967295L);
            if (a.a(hc.a(keyEvent.getKeyCode()), a.f25631m)) {
                f11 = i;
            } else {
                f11 = -i;
            }
            floatToRawIntBits = (Float.floatToRawIntBits(0.0f) << 32) | (4294967295L & Float.floatToRawIntBits(f11));
        } else {
            int i10 = (int) (iVar.Q >> 32);
            if (a.a(hc.a(keyEvent.getKeyCode()), a.f25631m)) {
                f10 = i10;
            } else {
                f10 = -i10;
            }
            floatToRawIntBits = (Float.floatToRawIntBits(0.0f) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
        }
        pf.x(M0(), null, new o1(this, floatToRawIntBits, null, 1), 3);
        return true;
    }

    @Override // e2
    public final void F0(j jVar) {
        if (this.M && (this.f25507a0 == null || this.f25508b0 == null)) {
            this.f25507a0 = new d0(15, this);
            this.f25508b0 = new o1(this, null);
        }
        d0 d0Var = this.f25507a0;
        if (d0Var != null) {
            kf.g[] gVarArr = u.f18865a;
            jVar.k(i.f18792d, new a(null, d0Var));
        }
        o1 o1Var = this.f25508b0;
        if (o1Var != null) {
            kf.g[] gVarArr2 = u.f18865a;
            jVar.k(i.e, o1Var);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List, java.lang.Object] */
    @Override // a2
    public final void H(k kVar, l lVar, long j10) {
        te.c cVar;
        float l0;
        float l02;
        long j11;
        boolean b10;
        Object r02 = kVar.f27327a;
        int size = ((Collection) r02).size();
        int i = 0;
        while (true) {
            cVar = null;
            if (i >= size) {
                break;
            }
            if (((Boolean) this.L.invoke((t) r02.get(i))).booleanValue()) {
                if (this.M && this.R == null) {
                    b8.s sVar = new b8.s(5, this);
                    k kVar2 = d0.f27293a;
                    h0 h0Var = new h0(null, null, null, sVar);
                    Y0(h0Var);
                    this.R = h0Var;
                }
                h0 h0Var2 = this.R;
                if (h0Var2 != null) {
                    h0Var2.H(kVar, lVar, j10);
                }
            } else {
                i++;
            }
        }
        if (this.M) {
            if (lVar == l.f27331u && kVar.e == 6) {
                if (this.f25509c0 == null) {
                    this.f25509c0 = new f5.a(this.X, new a(0, ViewConfiguration.get(l.w(this).getContext())), new n1(2, this, r1.class, "onWheelScrollStopped", "onWheelScrollStopped-TH1AsA0(J)V", 4, 0), l.u(this).S);
                }
                f5.a aVar = this.f25509c0;
                if (aVar != null) {
                    pf.z M0 = M0();
                    if (((pf.r1) aVar.f16728g) == null) {
                        aVar.f16728g = pf.x(M0, null, new l5.a(aVar, cVar, 8), 3);
                    }
                }
            }
            f5.a aVar2 = this.f25509c0;
            if (aVar2 != null && lVar == l.f27332v) {
                int i10 = kVar.e;
                Object r32 = kVar.f27327a;
                if (i10 == 6) {
                    Collection collection = (Collection) r32;
                    int size2 = collection.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        if (((t) r32.get(i11)).f()) {
                            return;
                        }
                    }
                    a aVar3 = (a) aVar2.f16725c;
                    y2.c cVar2 = (y2.c) aVar2.e;
                    ViewConfiguration viewConfiguration = (ViewConfiguration) aVar3.f25315v;
                    int i12 = Build.VERSION.SDK_INT;
                    if (i12 > 26) {
                        l0 = b(viewConfiguration);
                    } else {
                        l0 = cVar2.l0(64);
                    }
                    float f10 = -l0;
                    if (i12 > 26) {
                        l02 = n2.a(viewConfiguration);
                    } else {
                        l02 = cVar2.l0(64);
                    }
                    float f11 = -l02;
                    b bVar = new b(0L);
                    int size3 = collection.size();
                    int i13 = 0;
                    while (true) {
                        j11 = bVar.f18762a;
                        if (i13 >= size3) {
                            break;
                        }
                        bVar = new b(b.h(j11, ((t) r32.get(i13)).f27348j));
                        i13++;
                    }
                    float intBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32)) * f11;
                    float intBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L)) * f10;
                    long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
                    z1 z1Var = (z1) aVar2.f16724b;
                    float g8 = z1Var.g(z1Var.e(floatToRawIntBits));
                    if (g8 == 0.0f) {
                        b10 = false;
                    } else {
                        s1 s1Var = z1Var.f25600a;
                        if (g8 > 0.0f) {
                            b10 = s1Var.c();
                        } else {
                            b10 = s1Var.b();
                        }
                    }
                    if (b10 ? !(((rf.h) aVar2.f16727f).e(new u0(floatToRawIntBits, ((t) qe.l.w(r32)).f27342b, false)) instanceof rf.n) : aVar2.f16723a) {
                        int size4 = collection.size();
                        for (int i14 = 0; i14 < size4; i14++) {
                            ((t) r32.get(i14)).a();
                        }
                    }
                }
            }
        }
    }

    @Override // q
    public final boolean N0() {
        return false;
    }

    @Override // a2
    public final void O() {
        h0 h0Var = this.R;
        if (h0Var != null) {
            h0Var.O();
        }
    }

    @Override // q
    public final void Q0() {
        if (this.H) {
            y2.c cVar = l.u(this).S;
            j jVar = this.W;
            jVar.getClass();
            jVar.f25422a = new u(new k6.i(cVar));
        }
        f5.a aVar = this.f25509c0;
        if (aVar != null) {
            aVar.e = l.u(this).S;
        }
    }

    @Override // q
    public final void R0() {
        this.Q = false;
        e1();
    }

    @Override // j
    public final void d() {
        O();
        if (this.H) {
            y2.c cVar = l.u(this).S;
            j jVar = this.W;
            jVar.getClass();
            jVar.f25422a = new u(new k6.i(cVar));
        }
        f5.a aVar = this.f25509c0;
        if (aVar != null) {
            aVar.e = l.u(this).S;
        }
    }

    public final void e1() {
        b bVar = this.P;
        if (bVar != null) {
            i iVar = this.N;
            if (iVar != null) {
                iVar.b(new a(bVar));
            }
            this.P = null;
        }
    }

    public final void f1(f fVar, d dVar, n0 n0Var, z0 z0Var, s1 s1Var, i iVar, boolean z3, boolean z9) {
        boolean z10;
        n0 n0Var2;
        h0 h0Var;
        boolean z11 = true;
        boolean z12 = false;
        if (this.M != z3) {
            this.Y.f3949u = z3;
            this.V.I = z3;
            z10 = true;
        } else {
            z10 = false;
        }
        if (n0Var == null) {
            n0Var2 = this.W;
        } else {
            n0Var2 = n0Var;
        }
        z1 z1Var = this.X;
        if (!kotlin.jvm.internal.a(z1Var.f25600a, s1Var)) {
            z1Var.f25600a = s1Var;
            z12 = true;
        }
        z1Var.f25601b = fVar;
        if (z1Var.f25603d != z0Var) {
            z1Var.f25603d = z0Var;
            z12 = true;
        }
        if (z1Var.e != z9) {
            z1Var.e = z9;
            z12 = true;
        }
        z1Var.f25602c = n0Var2;
        z1Var.f25604f = this.U;
        i iVar2 = this.Z;
        iVar2.I = z0Var;
        iVar2.K = z9;
        iVar2.L = dVar;
        this.S = fVar;
        this.T = n0Var;
        e eVar = e.A;
        z0 z0Var2 = z1Var.f25603d;
        z0 z0Var3 = z0.f25597u;
        if (z0Var2 != z0Var3) {
            z0Var3 = z0.f25598v;
        }
        this.L = eVar;
        if (this.M != z3) {
            this.M = z3;
            if (!z3) {
                e1();
                h0 h0Var2 = this.R;
                if (h0Var2 != null) {
                    Z0(h0Var2);
                }
                this.R = null;
            }
            z12 = true;
        }
        if (!kotlin.jvm.internal.a(this.N, iVar)) {
            e1();
            this.N = iVar;
        }
        if (this.K != z0Var3) {
            this.K = z0Var3;
        } else {
            z11 = z12;
        }
        if (z11 && (h0Var = this.R) != null) {
            h0Var.a1();
        }
        if (z10) {
            this.f25507a0 = null;
            this.f25508b0 = null;
            l.m(this);
        }
    }

    @Override // d
    public final boolean h(KeyEvent keyEvent) {
        return false;
    }
}