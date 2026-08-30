package r0;
import a1.a;
import l.a;
import n.i0;
import n.j0;
import n.l0;
import n.q0;
import n.w;
import n1.b;
import r0.x;
import s.c;
import s.d;
import s0.a;
import s0.k0;
import t0.e;
import t0.g;

import android.os.Trace;
import com.google.android.gms.internal.ads.hb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import ya.gc;

/* loaded from: classes.dex */
public final class x implements t {
    public final i0 A;
    public final j0 B;
    public final j0 C;
    public final i0 D;
    public final a E;
    public final a F;
    public final i0 G;
    public i0 H;
    public boolean I;
    public x J;
    public int K;
    public final ic.c L;
    public final hb M;
    public final r N;
    public int O;

    /* renamed from: u, reason: collision with root package name */
    public final u f24426u;

    /* renamed from: v, reason: collision with root package name */
    public final ra.e f24427v;

    /* renamed from: w, reason: collision with root package name */
    public final AtomicReference f24428w = new AtomicReference(null);

    /* renamed from: x, reason: collision with root package name */
    public final Object f24429x = new Object();

    /* renamed from: y, reason: collision with root package name */
    public final l0 f24430y;

    /* renamed from: z, reason: collision with root package name */
    public final b2 f24431z;

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, com.google.android.gms.internal.ads.hb] */
    public x(u uVar, ra.e eVar) {
        this.f24426u = uVar;
        this.f24427v = eVar;
        l0 l0Var = new l0(new j0());
        this.f24430y = l0Var;
        b2 b2Var = new b2();
        if (uVar.c()) {
            b2Var.E = new w();
        }
        if (uVar.e()) {
            b2Var.b();
        }
        this.f24431z = b2Var;
        this.A = gc.b();
        this.B = new j0();
        this.C = new j0();
        this.D = gc.b();
        a aVar = new a();
        this.E = aVar;
        a aVar2 = new a();
        this.F = aVar2;
        this.G = gc.b();
        this.H = gc.b();
        ic.c cVar = new ic.c(25, uVar);
        this.L = cVar;
        Object obj = new Object();
        e eVar2 = new e(new w1[16]);
        obj.f6651w = eVar2;
        int i = q0.f20928a;
        obj.f6652x = new j0();
        obj.f6653y = eVar2;
        obj.f6654z = new e(new Object[16]);
        obj.A = new e(new df.a[16]);
        this.M = obj;
        r rVar = new r(eVar, uVar, b2Var, l0Var, aVar, aVar2, cVar, this);
        uVar.m(rVar);
        this.N = rVar;
        int i10 = i.f24264a;
    }

    public final void A(df.p pVar) {
        boolean i = i();
        p();
        u uVar = this.f24426u;
        if (i) {
            r rVar = this.N;
            rVar.f24358z = 100;
            rVar.f24357y = true;
            uVar.a(this, pVar);
            rVar.u();
            return;
        }
        uVar.a(this, pVar);
    }

    public final void a() {
        this.f24428w.set(null);
        this.E.f24852a.a();
        this.F.f24852a.a();
        l0 l0Var = this.f24430y;
        if (!l0Var.f20913u.g()) {
            hb hbVar = this.M;
            try {
                hbVar.f(l0Var, this.N.B());
                hbVar.b();
            } finally {
                hbVar.a();
            }
        }
    }

    public final void b(Object obj, boolean z3) {
        int i;
        Object g8 = this.A.g(obj);
        if (g8 != null) {
            boolean z9 = g8 instanceof j0;
            q0 q0Var = q0.f24324u;
            j0 j0Var = this.B;
            j0 j0Var2 = this.C;
            i0 i0Var = this.G;
            if (z9) {
                j0 j0Var3 = (j0) g8;
                Object[] objArr = j0Var3.f20899b;
                long[] jArr = j0Var3.f20898a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i10 = 0;
                    while (true) {
                        long j10 = jArr[i10];
                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i11 = 8;
                            int i12 = 8 - ((~(i10 - length)) >>> 31);
                            int i13 = 0;
                            while (i13 < i12) {
                                if ((j10 & 255) < 128) {
                                    q1 q1Var = (q1) objArr[(i10 << 3) + i13];
                                    if (!gc.c(i0Var, obj, q1Var)) {
                                        i = i11;
                                        if (q1Var.b(obj) != q0Var) {
                                            if (q1Var.f24334g != null && !z3) {
                                                j0Var2.a(q1Var);
                                            } else {
                                                j0Var.a(q1Var);
                                            }
                                        }
                                        j10 >>= i;
                                        i13++;
                                        i11 = i;
                                    }
                                }
                                i = i11;
                                j10 >>= i;
                                i13++;
                                i11 = i;
                            }
                            if (i12 != i11) {
                                return;
                            }
                        }
                        if (i10 != length) {
                            i10++;
                        } else {
                            return;
                        }
                    }
                }
            } else {
                q1 q1Var2 = (q1) g8;
                if (!gc.c(i0Var, obj, q1Var2) && q1Var2.b(obj) != q0Var) {
                    if (q1Var2.f24334g != null && !z3) {
                        j0Var2.a(q1Var2);
                    } else {
                        j0Var.a(q1Var2);
                    }
                }
            }
        }
    }

    public final void c(Set set, boolean z3) {
        long j10;
        long j11;
        long j12;
        char c10;
        long[] jArr;
        boolean z9;
        long[] jArr2;
        long j13;
        boolean c11;
        boolean z10;
        long[] jArr3;
        long j14;
        long[] jArr4;
        long[] jArr5;
        int i;
        long j15;
        boolean z11;
        int i10;
        long j16;
        long[] jArr6;
        long[] jArr7;
        char c12;
        long j17;
        int i11;
        int i12;
        long[] jArr8;
        boolean z12 = set instanceof g;
        i0 i0Var = this.D;
        Object obj = null;
        int i13 = 8;
        if (z12) {
            j0 j0Var = ((g) set).f25620u;
            Object[] objArr = j0Var.f20899b;
            long[] jArr9 = j0Var.f20898a;
            int length = jArr9.length - 2;
            if (length >= 0) {
                int i14 = 0;
                j10 = 128;
                j11 = 255;
                while (true) {
                    long j18 = jArr9[i14];
                    char c13 = 7;
                    j12 = -9187201950435737472L;
                    if ((((~j18) << 7) & j18 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i15 = 8 - ((~(i14 - length)) >>> 31);
                        int i16 = 0;
                        while (i16 < i15) {
                            if ((j18 & 255) < 128) {
                                Object obj2 = objArr[(i14 << 3) + i16];
                                c12 = c13;
                                if (obj2 instanceof q1) {
                                    ((q1) obj2).b(obj);
                                } else {
                                    b(obj2, z3);
                                    Object g8 = i0Var.g(obj2);
                                    if (g8 != null) {
                                        if (g8 instanceof j0) {
                                            j0 j0Var2 = (j0) g8;
                                            Object[] objArr2 = j0Var2.f20899b;
                                            long[] jArr10 = j0Var2.f20898a;
                                            int length2 = jArr10.length - 2;
                                            if (length2 >= 0) {
                                                int i17 = i13;
                                                i11 = length;
                                                int i18 = 0;
                                                while (true) {
                                                    long j19 = jArr10[i18];
                                                    j17 = j18;
                                                    long[] jArr11 = jArr10;
                                                    if ((((~j19) << c12) & j19 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i19 = 8 - ((~(i18 - length2)) >>> 31);
                                                        int i20 = 0;
                                                        while (i20 < i19) {
                                                            if ((j19 & 255) < 128) {
                                                                jArr8 = jArr9;
                                                                b((g0) objArr2[(i18 << 3) + i20], z3);
                                                            } else {
                                                                jArr8 = jArr9;
                                                            }
                                                            j19 >>= i17;
                                                            i20++;
                                                            jArr9 = jArr8;
                                                        }
                                                        jArr7 = jArr9;
                                                        if (i19 != i17) {
                                                            break;
                                                        }
                                                    } else {
                                                        jArr7 = jArr9;
                                                    }
                                                    if (i18 == length2) {
                                                        break;
                                                    }
                                                    i18++;
                                                    jArr10 = jArr11;
                                                    j18 = j17;
                                                    jArr9 = jArr7;
                                                    i17 = 8;
                                                }
                                            }
                                        } else {
                                            jArr7 = jArr9;
                                            j17 = j18;
                                            i11 = length;
                                            b((g0) g8, z3);
                                        }
                                        i12 = 8;
                                    }
                                }
                                jArr7 = jArr9;
                                j17 = j18;
                                i11 = length;
                                i12 = 8;
                            } else {
                                jArr7 = jArr9;
                                c12 = c13;
                                j17 = j18;
                                i11 = length;
                                i12 = i13;
                            }
                            j18 = j17 >> i12;
                            i16++;
                            length = i11;
                            i13 = i12;
                            c13 = c12;
                            jArr9 = jArr7;
                            obj = null;
                        }
                        jArr6 = jArr9;
                        c10 = c13;
                        int i21 = length;
                        if (i15 != i13) {
                            break;
                        } else {
                            length = i21;
                        }
                    } else {
                        jArr6 = jArr9;
                        c10 = 7;
                    }
                    if (i14 == length) {
                        break;
                    }
                    i14++;
                    jArr9 = jArr6;
                    obj = null;
                    i13 = 8;
                }
            } else {
                j10 = 128;
                j11 = 255;
                j12 = -9187201950435737472L;
                c10 = 7;
            }
        } else {
            j10 = 128;
            j11 = 255;
            j12 = -9187201950435737472L;
            c10 = 7;
            for (Object obj3 : set) {
                if (obj3 instanceof q1) {
                    ((q1) obj3).b(null);
                } else {
                    b(obj3, z3);
                    Object g10 = i0Var.g(obj3);
                    if (g10 != null) {
                        if (g10 instanceof j0) {
                            j0 j0Var3 = (j0) g10;
                            Object[] objArr3 = j0Var3.f20899b;
                            long[] jArr12 = j0Var3.f20898a;
                            int length3 = jArr12.length - 2;
                            if (length3 >= 0) {
                                int i22 = 0;
                                while (true) {
                                    long j20 = jArr12[i22];
                                    if ((((~j20) << 7) & j20 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i23 = 8 - ((~(i22 - length3)) >>> 31);
                                        for (int i24 = 0; i24 < i23; i24++) {
                                            if ((j20 & 255) < 128) {
                                                b((g0) objArr3[(i22 << 3) + i24], z3);
                                            }
                                            j20 >>= 8;
                                        }
                                        if (i23 != 8) {
                                            break;
                                        }
                                    }
                                    if (i22 != length3) {
                                        i22++;
                                    }
                                }
                            }
                        } else {
                            b((g0) g10, z3);
                        }
                    }
                }
            }
        }
        i0 i0Var2 = this.A;
        j0 j0Var4 = this.B;
        if (z3) {
            j0 j0Var5 = this.C;
            if (j0Var5.h()) {
                long[] jArr13 = i0Var2.f20892a;
                int length4 = jArr13.length - 2;
                if (length4 >= 0) {
                    int i25 = 0;
                    while (true) {
                        long j21 = jArr13[i25];
                        if ((((~j21) << c10) & j21 & j12) != j12) {
                            int i26 = 8 - ((~(i25 - length4)) >>> 31);
                            int i27 = 0;
                            while (i27 < i26) {
                                if ((j21 & j11) < j10) {
                                    int i28 = (i25 << 3) + i27;
                                    Object obj4 = i0Var2.f20893b[i28];
                                    Object obj5 = i0Var2.f20894c[i28];
                                    if (obj5 instanceof j0) {
                                        j0 j0Var6 = (j0) obj5;
                                        Object[] objArr4 = j0Var6.f20899b;
                                        long[] jArr14 = j0Var6.f20898a;
                                        int length5 = jArr14.length - 2;
                                        if (length5 >= 0) {
                                            j15 = j21;
                                            int i29 = 0;
                                            while (true) {
                                                long j22 = jArr14[i29];
                                                jArr5 = jArr13;
                                                i = length4;
                                                if ((((~j22) << c10) & j22 & j12) != j12) {
                                                    int i30 = 8 - ((~(i29 - length5)) >>> 31);
                                                    for (int i31 = 0; i31 < i30; i31 = i10 + 1) {
                                                        if ((j22 & j11) < j10) {
                                                            i10 = i31;
                                                            int i32 = (i29 << 3) + i10;
                                                            j16 = j22;
                                                            q1 q1Var = (q1) objArr4[i32];
                                                            if (j0Var5.c(q1Var) || j0Var4.c(q1Var)) {
                                                                j0Var6.m(i32);
                                                            }
                                                        } else {
                                                            i10 = i31;
                                                            j16 = j22;
                                                        }
                                                        j22 = j16 >> 8;
                                                    }
                                                    if (i30 != 8) {
                                                        break;
                                                    }
                                                }
                                                if (i29 == length5) {
                                                    break;
                                                }
                                                i29++;
                                                length4 = i;
                                                jArr13 = jArr5;
                                            }
                                        } else {
                                            jArr5 = jArr13;
                                            i = length4;
                                            j15 = j21;
                                        }
                                        z11 = j0Var6.g();
                                    } else {
                                        jArr5 = jArr13;
                                        i = length4;
                                        j15 = j21;
                                        obj5.getClass();
                                        q1 q1Var2 = (q1) obj5;
                                        if (!j0Var5.c(q1Var2) && !j0Var4.c(q1Var2)) {
                                            z11 = false;
                                        } else {
                                            z11 = true;
                                        }
                                    }
                                    if (z11) {
                                        i0Var2.l(i28);
                                    }
                                } else {
                                    jArr5 = jArr13;
                                    i = length4;
                                    j15 = j21;
                                }
                                j21 = j15 >> 8;
                                i27++;
                                length4 = i;
                                jArr13 = jArr5;
                            }
                            jArr4 = jArr13;
                            int i33 = length4;
                            if (i26 != 8) {
                                break;
                            } else {
                                length4 = i33;
                            }
                        } else {
                            jArr4 = jArr13;
                        }
                        if (i25 == length4) {
                            break;
                        }
                        i25++;
                        jArr13 = jArr4;
                    }
                }
                j0Var5.b();
                h();
                return;
            }
        }
        if (j0Var4.h()) {
            long[] jArr15 = i0Var2.f20892a;
            int length6 = jArr15.length - 2;
            if (length6 >= 0) {
                int i34 = 0;
                while (true) {
                    long j23 = jArr15[i34];
                    if ((((~j23) << c10) & j23 & j12) != j12) {
                        int i35 = 8 - ((~(i34 - length6)) >>> 31);
                        int i36 = 0;
                        while (i36 < i35) {
                            if ((j23 & j11) < j10) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            if (z9) {
                                int i37 = (i34 << 3) + i36;
                                Object obj6 = i0Var2.f20893b[i37];
                                Object obj7 = i0Var2.f20894c[i37];
                                if (obj7 instanceof j0) {
                                    j0 j0Var7 = (j0) obj7;
                                    Object[] objArr5 = j0Var7.f20899b;
                                    long[] jArr16 = j0Var7.f20898a;
                                    int length7 = jArr16.length - 2;
                                    if (length7 >= 0) {
                                        j13 = j23;
                                        int i38 = 0;
                                        while (true) {
                                            long j24 = jArr16[i38];
                                            Object[] objArr6 = objArr5;
                                            long[] jArr17 = jArr16;
                                            if ((((~j24) << c10) & j24 & j12) != j12) {
                                                int i39 = 8 - ((~(i38 - length7)) >>> 31);
                                                int i40 = 0;
                                                while (i40 < i39) {
                                                    if ((j24 & j11) < j10) {
                                                        z10 = true;
                                                    } else {
                                                        z10 = false;
                                                    }
                                                    if (z10) {
                                                        jArr3 = jArr15;
                                                        int i41 = (i38 << 3) + i40;
                                                        j14 = j24;
                                                        if (j0Var4.c((q1) objArr6[i41])) {
                                                            j0Var7.m(i41);
                                                        }
                                                    } else {
                                                        jArr3 = jArr15;
                                                        j14 = j24;
                                                    }
                                                    i40++;
                                                    jArr15 = jArr3;
                                                    j24 = j14 >> 8;
                                                }
                                                jArr2 = jArr15;
                                                if (i39 != 8) {
                                                    break;
                                                }
                                            } else {
                                                jArr2 = jArr15;
                                            }
                                            if (i38 == length7) {
                                                break;
                                            }
                                            i38++;
                                            objArr5 = objArr6;
                                            jArr16 = jArr17;
                                            jArr15 = jArr2;
                                        }
                                    } else {
                                        jArr2 = jArr15;
                                        j13 = j23;
                                    }
                                    c11 = j0Var7.g();
                                } else {
                                    jArr2 = jArr15;
                                    j13 = j23;
                                    obj7.getClass();
                                    c11 = j0Var4.c((q1) obj7);
                                }
                                if (c11) {
                                    i0Var2.l(i37);
                                }
                            } else {
                                jArr2 = jArr15;
                                j13 = j23;
                            }
                            i36++;
                            j23 = j13 >> 8;
                            jArr15 = jArr2;
                        }
                        jArr = jArr15;
                        if (i35 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr15;
                    }
                    if (i34 == length6) {
                        break;
                    }
                    i34++;
                    jArr15 = jArr;
                }
            }
            h();
            j0Var4.b();
        }
    }

    public final void d() {
        synchronized (this.f24429x) {
            try {
                e(this.E);
                n();
            } catch (Throwable th) {
                try {
                    if (!this.f24430y.f20913u.g()) {
                        hb hbVar = this.M;
                        try {
                            hbVar.f(this.f24430y, this.N.B());
                            hbVar.b();
                            hbVar.a();
                        } catch (Throwable th2) {
                            hbVar.a();
                            throw th2;
                        }
                    }
                    throw th;
                } catch (Throwable th3) {
                    a();
                    throw th3;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x01d1 A[Catch: all -> 0x01d5, TRY_LEAVE, TryCatch #4 {all -> 0x01d5, blocks: (B:130:0x01c9, B:132:0x01d1), top: B:129:0x01c9 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(a r33) {
        /*
            Method dump skipped, instructions count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.x.e(a):void");
    }

    public final void f() {
        synchronized (this.f24429x) {
            try {
                if (this.F.f24852a.d()) {
                    e(this.F);
                }
            } catch (Throwable th) {
                try {
                    if (!this.f24430y.f20913u.g()) {
                        hb hbVar = this.M;
                        try {
                            hbVar.f(this.f24430y, this.N.B());
                            hbVar.b();
                            hbVar.a();
                        } catch (Throwable th2) {
                            hbVar.a();
                            throw th2;
                        }
                    }
                    throw th;
                } catch (Throwable th3) {
                    a();
                    throw th3;
                }
            }
        }
    }

    public final void g() {
        hb hbVar;
        synchronized (this.f24429x) {
            try {
                this.N.f24354v = null;
                if (!this.f24430y.f20913u.g()) {
                    hbVar = this.M;
                    try {
                        hbVar.f(this.f24430y, this.N.B());
                        hbVar.b();
                        hbVar.a();
                    } finally {
                    }
                }
            } catch (Throwable th) {
                try {
                    if (!this.f24430y.f20913u.g()) {
                        hbVar = this.M;
                        try {
                            hbVar.f(this.f24430y, this.N.B());
                            hbVar.b();
                            hbVar.a();
                        } finally {
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    a();
                    throw th2;
                }
            }
        }
    }

    public final void h() {
        char c10;
        long j10;
        long j11;
        long j12;
        boolean z3;
        boolean z9;
        long[] jArr;
        long[] jArr2;
        int i;
        long j13;
        char c11;
        long j14;
        long j15;
        int i10;
        boolean z10;
        int i11;
        long j16;
        i0 i0Var = this.D;
        long[] jArr3 = i0Var.f20892a;
        int length = jArr3.length - 2;
        char c12 = 7;
        long j17 = -9187201950435737472L;
        int i12 = 8;
        if (length >= 0) {
            int i13 = 0;
            long j18 = 128;
            while (true) {
                long j19 = jArr3[i13];
                j11 = 255;
                if ((((~j19) << c12) & j19 & j17) != j17) {
                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((j19 & 255) < j18) {
                            c11 = c12;
                            int i16 = (i13 << 3) + i15;
                            j14 = j17;
                            Object obj = i0Var.f20893b[i16];
                            Object obj2 = i0Var.f20894c[i16];
                            boolean z11 = obj2 instanceof j0;
                            i0 i0Var2 = this.A;
                            if (z11) {
                                j0 j0Var = (j0) obj2;
                                Object[] objArr = j0Var.f20899b;
                                long[] jArr4 = j0Var.f20898a;
                                j15 = j18;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j13 = j19;
                                    int i17 = i12;
                                    int i18 = 0;
                                    while (true) {
                                        long j20 = jArr4[i18];
                                        jArr2 = jArr3;
                                        i = length;
                                        if ((((~j20) << c11) & j20 & j14) != j14) {
                                            int i19 = 8 - ((~(i18 - length2)) >>> 31);
                                            int i20 = 0;
                                            while (i20 < i19) {
                                                if ((j20 & 255) < j15) {
                                                    i11 = i20;
                                                    int i21 = (i18 << 3) + i11;
                                                    j16 = j20;
                                                    if (!i0Var2.c((g0) objArr[i21])) {
                                                        j0Var.m(i21);
                                                    }
                                                } else {
                                                    i11 = i20;
                                                    j16 = j20;
                                                }
                                                j20 = j16 >> i17;
                                                i20 = i11 + 1;
                                            }
                                            if (i19 != i17) {
                                                break;
                                            }
                                        }
                                        if (i18 == length2) {
                                            break;
                                        }
                                        i18++;
                                        jArr3 = jArr2;
                                        length = i;
                                        i17 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    i = length;
                                    j13 = j19;
                                }
                                z10 = j0Var.g();
                            } else {
                                jArr2 = jArr3;
                                i = length;
                                j13 = j19;
                                j15 = j18;
                                obj2.getClass();
                                if (!i0Var2.c((g0) obj2)) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                            }
                            if (z10) {
                                i0Var.l(i16);
                            }
                            i10 = 8;
                        } else {
                            jArr2 = jArr3;
                            i = length;
                            j13 = j19;
                            c11 = c12;
                            j14 = j17;
                            j15 = j18;
                            i10 = i12;
                        }
                        j19 = j13 >> i10;
                        i15++;
                        i12 = i10;
                        c12 = c11;
                        j17 = j14;
                        j18 = j15;
                        jArr3 = jArr2;
                        length = i;
                    }
                    jArr = jArr3;
                    int i22 = length;
                    c10 = c12;
                    j10 = j17;
                    j12 = j18;
                    if (i14 != i12) {
                        break;
                    } else {
                        length = i22;
                    }
                } else {
                    jArr = jArr3;
                    c10 = c12;
                    j10 = j17;
                    j12 = j18;
                }
                if (i13 == length) {
                    break;
                }
                i13++;
                c12 = c10;
                j17 = j10;
                j18 = j12;
                jArr3 = jArr;
                i12 = 8;
            }
        } else {
            c10 = 7;
            j10 = -9187201950435737472L;
            j11 = 255;
            j12 = 128;
        }
        j0 j0Var2 = this.C;
        if (j0Var2.h()) {
            Object[] objArr2 = j0Var2.f20899b;
            long[] jArr5 = j0Var2.f20898a;
            int length3 = jArr5.length - 2;
            if (length3 >= 0) {
                int i23 = 0;
                while (true) {
                    long j21 = jArr5[i23];
                    if ((((~j21) << c10) & j21 & j10) != j10) {
                        int i24 = 8 - ((~(i23 - length3)) >>> 31);
                        for (int i25 = 0; i25 < i24; i25++) {
                            if ((j21 & j11) < j12) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                                int i26 = (i23 << 3) + i25;
                                if (((q1) objArr2[i26]).f24334g != null) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                if (!z9) {
                                    j0Var2.m(i26);
                                }
                            }
                            j21 >>= 8;
                        }
                        if (i24 != 8) {
                            return;
                        }
                    }
                    if (i23 != length3) {
                        i23++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final boolean i() {
        boolean z3;
        synchronized (this.f24429x) {
            z3 = true;
            if (this.O != 1) {
                z3 = false;
            }
            if (z3) {
                this.O = 0;
            }
        }
        return z3;
    }

    public final void j(df.p pVar) {
        try {
            synchronized (this.f24429x) {
                m();
                i0 i0Var = this.H;
                this.H = gc.b();
                try {
                    r rVar = this.N;
                    if (!rVar.e.f24852a.c()) {
                        c("Expected applyChanges() to have been called");
                    }
                    rVar.P = null;
                    try {
                        rVar.n(i0Var, pVar);
                    } finally {
                        rVar.P = null;
                    }
                } catch (Throwable th) {
                    this.H = i0Var;
                    throw th;
                }
            }
        } catch (Throwable th2) {
            try {
                if (!this.f24430y.f20913u.g()) {
                    hb hbVar = this.M;
                    try {
                        hbVar.f(this.f24430y, this.N.B());
                        hbVar.b();
                        hbVar.a();
                    } catch (Throwable th3) {
                        hbVar.a();
                        throw th3;
                    }
                }
                throw th2;
            } catch (Throwable th4) {
                a();
                throw th4;
            }
        }
    }

    public final void k() {
        boolean z3;
        hb hbVar;
        synchronized (this.f24429x) {
            try {
                if (this.f24431z.f24192v > 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                try {
                    try {
                        if (!z3) {
                            if (!this.f24430y.f20913u.g()) {
                            }
                            this.A.a();
                            this.D.a();
                            this.H.a();
                            this.E.f24852a.a();
                            this.F.f24852a.a();
                            r rVar = this.N;
                            rVar.E.clear();
                            rVar.f24351s.clear();
                            rVar.e.f24852a.a();
                            rVar.f24354v = null;
                            this.O = 1;
                        }
                        hbVar.f(this.f24430y, this.N.B());
                        if (z3) {
                            e2 k3 = this.f24431z.k();
                            try {
                                k3.n(k3.f24234t, new b8.l(this.M, 4, k3));
                                k3.e(true);
                                this.f24427v.o();
                                hbVar.d();
                            } catch (Throwable th) {
                                k3.e(false);
                                throw th;
                            }
                        }
                        hbVar.b();
                        hbVar.a();
                        this.A.a();
                        this.D.a();
                        this.H.a();
                        this.E.f24852a.a();
                        this.F.f24852a.a();
                        r rVar2 = this.N;
                        rVar2.E.clear();
                        rVar2.f24351s.clear();
                        rVar2.e.f24852a.a();
                        rVar2.f24354v = null;
                        this.O = 1;
                    } catch (Throwable th2) {
                        hbVar.a();
                        throw th2;
                    }
                    hbVar = this.M;
                } finally {
                    Trace.endSection();
                }
                Trace.beginSection("Compose:deactivate");
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void l() {
        boolean z3;
        synchronized (this.f24429x) {
            try {
                if (this.N.F) {
                    b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (this.O != 3) {
                    this.O = 3;
                    int i = i.f24264a;
                    a aVar = this.N.L;
                    if (aVar != null) {
                        e(aVar);
                    }
                    if (this.f24431z.f24192v > 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3 || !this.f24430y.f20913u.g()) {
                        hb hbVar = this.M;
                        try {
                            hbVar.f(this.f24430y, this.N.B());
                            if (z3) {
                                e2 k3 = this.f24431z.k();
                                try {
                                    k3.n(k3.f24234t, new a(9, this.M));
                                    k3.G();
                                    k3.e(true);
                                    this.f24427v.r();
                                    this.f24427v.o();
                                    hbVar.d();
                                } catch (Throwable th) {
                                    k3.e(false);
                                    throw th;
                                }
                            }
                            hbVar.b();
                            hbVar.a();
                        } catch (Throwable th2) {
                            hbVar.a();
                            throw th2;
                        }
                    }
                    r rVar = this.N;
                    rVar.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    try {
                        rVar.f24336b.p(rVar);
                        rVar.E.clear();
                        rVar.f24351s.clear();
                        rVar.e.f24852a.a();
                        rVar.f24354v = null;
                        rVar.f24335a.r();
                        Trace.endSection();
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        this.f24426u.q(this);
    }

    public final void m() {
        Object obj = y.f24436a;
        AtomicReference atomicReference = this.f24428w;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (!andSet.equals(obj)) {
                if (andSet instanceof Set) {
                    c((Set) andSet, true);
                    return;
                }
                if (andSet instanceof Object[]) {
                    for (Set set : (Set[]) andSet) {
                        c(set, true);
                    }
                    return;
                }
                d("corrupt pendingModifications drain: " + atomicReference);
                l4.a.p();
                return;
            }
            d("pending composition has not been applied");
            l4.a.p();
        }
    }

    public final void n() {
        AtomicReference atomicReference = this.f24428w;
        Object andSet = atomicReference.getAndSet(null);
        if (!kotlin.jvm.internal.a(andSet, y.f24436a)) {
            if (andSet instanceof Set) {
                c((Set) andSet, false);
                return;
            }
            if (andSet instanceof Object[]) {
                for (Set set : (Set[]) andSet) {
                    c(set, false);
                }
                return;
            }
            if (andSet == null) {
                d("calling recordModificationsOf and applyChanges concurrently is not supported");
                l4.a.p();
            } else {
                d("corrupt pendingModifications drain: " + atomicReference);
                l4.a.p();
            }
        }
    }

    public final void o() {
        qe.u uVar = qe.u.f24025u;
        AtomicReference atomicReference = this.f24428w;
        Object andSet = atomicReference.getAndSet(uVar);
        if (!kotlin.jvm.internal.a(andSet, y.f24436a) && andSet != null) {
            if (andSet instanceof Set) {
                c((Set) andSet, false);
                return;
            }
            if (andSet instanceof Object[]) {
                for (Set set : (Set[]) andSet) {
                    c(set, false);
                }
                return;
            }
            d("corrupt pendingModifications drain: " + atomicReference);
            l4.a.p();
        }
    }

    public final void p() {
        String str;
        int i = this.O;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        str = "";
                    } else {
                        str = "The composition is disposed";
                    }
                } else {
                    str = "A previous pausable composition for this composition was cancelled. This composition must be disposed.";
                }
            } else {
                str = "The composition should be activated before setting content.";
            }
            b(str);
        }
    }

    public final void q(ArrayList arrayList) {
        l0 l0Var = this.f24430y;
        r rVar = this.N;
        if (arrayList.size() <= 0) {
            try {
                rVar.getClass();
                try {
                    rVar.E(arrayList);
                    rVar.i();
                    return;
                } catch (Throwable th) {
                    rVar.a();
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    if (!l0Var.f20913u.g()) {
                        hb hbVar = this.M;
                        try {
                            hbVar.f(l0Var, rVar.B());
                            hbVar.b();
                            hbVar.a();
                        } catch (Throwable th3) {
                            hbVar.a();
                            throw th3;
                        }
                    }
                    throw th2;
                } catch (Throwable th4) {
                    a();
                    throw th4;
                }
            }
        }
        ((z0) ((pe.j) arrayList.get(0)).f22693u).getClass();
        throw null;
    }

    public final q0 r(q1 q1Var, Object obj) {
        x xVar;
        int i = q1Var.f24330b;
        if ((i & 2) != 0) {
            q1Var.f24330b = i | 4;
        }
        a aVar = q1Var.f24331c;
        if (aVar != null && aVar.a()) {
            if (!this.f24431z.n(aVar)) {
                synchronized (this.f24429x) {
                    xVar = this.J;
                }
                if (xVar != null) {
                    r rVar = xVar.N;
                    if (rVar.F && rVar.g0(q1Var, obj)) {
                        return q0.f24327x;
                    }
                }
                return q0.f24324u;
            }
            if (q1Var.f24332d != null) {
                q0 t3 = t(q1Var, aVar, obj);
                if (t3 != q0.f24324u) {
                    this.L.h();
                }
                return t3;
            }
            return q0.f24324u;
        }
        return q0.f24324u;
    }

    public final void s() {
        q1 q1Var;
        x xVar;
        synchronized (this.f24429x) {
            try {
                for (Object obj : this.f24431z.f24193w) {
                    if (obj instanceof q1) {
                        q1Var = (q1) obj;
                    } else {
                        q1Var = null;
                    }
                    if (q1Var != null && (xVar = q1Var.f24329a) != null) {
                        xVar.r(q1Var, null);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final q0 t(q1 q1Var, a aVar, Object obj) {
        boolean z3;
        int i;
        synchronized (this.f24429x) {
            try {
                x xVar = this.J;
                x xVar2 = null;
                if (xVar != null) {
                    b2 b2Var = this.f24431z;
                    int i10 = this.K;
                    if (b2Var.A) {
                        c("Writer is active");
                    }
                    if (i10 < 0 || i10 >= b2Var.f24192v) {
                        c("Invalid group index");
                    }
                    if (b2Var.n(aVar)) {
                        int i11 = b2Var.f24191u[(i10 * 5) + 3] + i10;
                        int i12 = aVar.f24176a;
                        if (i10 <= i12 && i12 < i11) {
                            xVar2 = xVar;
                        }
                    }
                    xVar = null;
                    xVar2 = xVar;
                }
                if (xVar2 == null) {
                    r rVar = this.N;
                    if (rVar.F && rVar.g0(q1Var, obj)) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        return q0.f24327x;
                    }
                    if (obj == null) {
                        this.H.m(q1Var, v0.f24420y);
                    } else {
                        boolean z9 = obj instanceof g0;
                        i0 i0Var = this.H;
                        if (!z9) {
                            i0Var.m(q1Var, v0.f24420y);
                        } else {
                            Object g8 = i0Var.g(q1Var);
                            if (g8 != null) {
                                if (g8 instanceof j0) {
                                    j0 j0Var = (j0) g8;
                                    Object[] objArr = j0Var.f20899b;
                                    long[] jArr = j0Var.f20898a;
                                    int length = jArr.length - 2;
                                    if (length >= 0) {
                                        int i13 = 0;
                                        loop0: while (true) {
                                            long j10 = jArr[i13];
                                            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i14 = 8;
                                                int i15 = 8 - ((~(i13 - length)) >>> 31);
                                                int i16 = 0;
                                                while (i16 < i15) {
                                                    if ((j10 & 255) < 128) {
                                                        i = i14;
                                                        if (objArr[(i13 << 3) + i16] == v0.f24420y) {
                                                            break loop0;
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
                                } else if (g8 == v0.f24420y) {
                                }
                            }
                            gc.a(this.H, q1Var, obj);
                        }
                    }
                }
                if (xVar2 != null) {
                    return xVar2.t(q1Var, aVar, obj);
                }
                this.f24426u.j(this);
                if (this.N.F) {
                    return q0.f24326w;
                }
                return q0.f24325v;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void u(Object obj) {
        Object g8 = this.A.g(obj);
        if (g8 != null) {
            boolean z3 = g8 instanceof j0;
            i0 i0Var = this.G;
            if (z3) {
                j0 j0Var = (j0) g8;
                Object[] objArr = j0Var.f20899b;
                long[] jArr = j0Var.f20898a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j10 = jArr[i];
                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i10 = 8 - ((~(i - length)) >>> 31);
                            for (int i11 = 0; i11 < i10; i11++) {
                                if ((255 & j10) < 128) {
                                    q1 q1Var = (q1) objArr[(i << 3) + i11];
                                    if (q1Var.b(obj) == q0.f24327x) {
                                        gc.a(i0Var, obj, q1Var);
                                    }
                                }
                                j10 >>= 8;
                            }
                            if (i10 != 8) {
                                return;
                            }
                        }
                        if (i != length) {
                            i++;
                        } else {
                            return;
                        }
                    }
                }
            } else {
                q1 q1Var2 = (q1) g8;
                if (q1Var2.b(obj) == q0.f24327x) {
                    gc.a(i0Var, obj, q1Var2);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean v(java.util.Set r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            boolean r2 = r1 instanceof g
            i0 r3 = r0.D
            i0 r4 = r0.A
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L5e
            g r1 = (g) r1
            j0 r1 = r1.f25620u
            java.lang.Object[] r2 = r1.f20899b
            long[] r1 = r1.f20898a
            int r7 = r1.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L7b
            r8 = r5
        L1c:
            r9 = r1[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L59
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r5
        L36:
            if (r13 >= r11) goto L57
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.32E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L53
            int r14 = r8 << 3
            int r14 = r14 + r13
            r14 = r2[r14]
            boolean r15 = r4.c(r14)
            if (r15 != 0) goto L52
            boolean r14 = r3.c(r14)
            if (r14 == 0) goto L53
        L52:
            return r6
        L53:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L36
        L57:
            if (r11 != r12) goto L7b
        L59:
            if (r8 == r7) goto L7b
            int r8 = r8 + 1
            goto L1c
        L5e:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L64:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L7b
            java.lang.Object r2 = r1.next()
            boolean r7 = r4.c(r2)
            if (r7 != 0) goto L7a
            boolean r2 = r3.c(r2)
            if (r2 == 0) goto L64
        L7a:
            return r6
        L7b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.x.v(java.util.Set):boolean");
    }

    public final boolean w() {
        boolean d2;
        synchronized (this.f24429x) {
            m();
            try {
                i0 i0Var = this.H;
                this.H = gc.b();
                try {
                    r rVar = this.N;
                    k0 k0Var = rVar.e.f24852a;
                    if (!k0Var.c()) {
                        c("Expected applyChanges() to have been called");
                    }
                    if (i0Var.e <= 0 && rVar.f24351s.isEmpty()) {
                        d2 = false;
                    } else {
                        rVar.P = null;
                        try {
                            rVar.n(i0Var, null);
                            rVar.P = null;
                            d2 = k0Var.d();
                        } catch (Throwable th) {
                            rVar.P = null;
                            throw th;
                        }
                    }
                    if (!d2) {
                        n();
                    }
                } catch (Throwable th2) {
                    this.H = i0Var;
                    throw th2;
                }
            } catch (Throwable th3) {
                try {
                    if (!this.f24430y.f20913u.g()) {
                        hb hbVar = this.M;
                        try {
                            hbVar.f(this.f24430y, this.N.B());
                            hbVar.b();
                            hbVar.a();
                        } catch (Throwable th4) {
                            hbVar.a();
                            throw th4;
                        }
                    }
                    throw th3;
                } catch (Throwable th5) {
                    a();
                    throw th5;
                }
            }
        }
        return d2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.Set[]] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object[]] */
    public final void x(g gVar) {
        g gVar2;
        while (true) {
            Object obj = this.f24428w.get();
            if (obj != null && !obj.equals(y.f24436a)) {
                if (obj instanceof Set) {
                    gVar2 = new Set[]{obj, gVar};
                } else if (obj instanceof Object[]) {
                    Set[] setArr = (Set[]) obj;
                    int length = setArr.length;
                    Object copyOf = Arrays.copyOf(setArr, length + 1);
                    copyOf[length] = gVar;
                    gVar2 = copyOf;
                } else {
                    androidx.datastore.preferences.protobuf.s1.j(this.f24428w, "corrupt pendingModifications: ");
                    return;
                }
            } else {
                gVar2 = gVar;
            }
            AtomicReference atomicReference = this.f24428w;
            while (!atomicReference.compareAndSet(obj, gVar2)) {
                if (atomicReference.get() != obj) {
                    break;
                }
            }
            if (obj == null) {
                synchronized (this.f24429x) {
                    n();
                }
                return;
            }
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.x.y(java.lang.Object):void");
    }

    public final void z(Object obj) {
        synchronized (this.f24429x) {
            try {
                u(obj);
                Object g8 = this.D.g(obj);
                if (g8 != null) {
                    if (g8 instanceof j0) {
                        j0 j0Var = (j0) g8;
                        Object[] objArr = j0Var.f20899b;
                        long[] jArr = j0Var.f20898a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i = 0;
                            while (true) {
                                long j10 = jArr[i];
                                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i10 = 8 - ((~(i - length)) >>> 31);
                                    for (int i11 = 0; i11 < i10; i11++) {
                                        if ((255 & j10) < 128) {
                                            u((g0) objArr[(i << 3) + i11]);
                                        }
                                        j10 >>= 8;
                                    }
                                    if (i10 != 8) {
                                        break;
                                    }
                                }
                                if (i == length) {
                                    break;
                                } else {
                                    i++;
                                }
                            }
                        }
                    } else {
                        u((g0) g8);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}