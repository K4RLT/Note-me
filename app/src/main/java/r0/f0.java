package r0;
import p.j;
import b1.h0;
import b1.i;
import b1.j0;
import b1.p;
import b1.z;
import n.c0;
import n.m0;
import t0.e;

/* loaded from: classes.dex */
public final class f0 extends j0 {

    /* renamed from: h, reason: collision with root package name */
    public static final Object f24245h = new Object();

    /* renamed from: c, reason: collision with root package name */
    public long f24246c;

    /* renamed from: d, reason: collision with root package name */
    public int f24247d;
    public c0 e;

    /* renamed from: f, reason: collision with root package name */
    public Object f24248f;

    /* renamed from: g, reason: collision with root package name */
    public int f24249g;

    public f0(long j10) {
        super(j10);
        c0 c0Var = m0.f20916a;
        c0Var.getClass();
        this.e = c0Var;
        this.f24248f = f24245h;
    }

    @Override // j0
    public final void a(j0 j0Var) {
        j0Var.getClass();
        f0 f0Var = (f0) j0Var;
        this.e = f0Var.e;
        this.f24248f = f0Var.f24248f;
        this.f24249g = f0Var.f24249g;
    }

    @Override // j0
    public final j0 b(long j10) {
        return new f0(j10);
    }

    public final boolean c(g0 g0Var, i iVar) {
        boolean z3;
        boolean z9;
        Object obj = p.f1387c;
        synchronized (obj) {
            z3 = true;
            if (this.f24246c == iVar.g()) {
                if (this.f24247d == iVar.h()) {
                    z9 = false;
                }
            }
            z9 = true;
        }
        if (this.f24248f == f24245h || (z9 && this.f24249g != d(g0Var, iVar))) {
            z3 = false;
        }
        if (z3 && z9) {
            synchronized (obj) {
                this.f24246c = iVar.g();
                this.f24247d = iVar.h();
            }
            return z3;
        }
        return z3;
    }

    public final int d(g0 g0Var, i iVar) {
        c0 c0Var;
        int i;
        long[] jArr;
        int i10;
        long[] jArr2;
        int i11;
        int i12;
        j0 h3;
        synchronized (p.f1387c) {
            c0Var = this.e;
        }
        int i13 = 7;
        if (c0Var.e == 0) {
            return 7;
        }
        e q10 = y.q();
        Object[] objArr = q10.f25617u;
        int i14 = q10.f25619w;
        for (int i15 = 0; i15 < i14; i15++) {
            ((z) objArr[i15]).b();
        }
        try {
            Object[] objArr2 = c0Var.f20850b;
            int[] iArr = c0Var.f20851c;
            long[] jArr3 = c0Var.f20849a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                i = 7;
                int i16 = 0;
                while (true) {
                    long j10 = jArr3[i16];
                    if ((((~j10) << i13) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i17 = 8;
                        int i18 = 8 - ((~(i16 - length)) >>> 31);
                        int i19 = 0;
                        while (i19 < i18) {
                            if ((j10 & 255) < 128) {
                                int i20 = (i16 << 3) + i19;
                                Object obj = objArr2[i20];
                                i11 = i13;
                                int i21 = iArr[i20];
                                i12 = i17;
                                h0 h0Var = (h0) obj;
                                if (i21 != 1) {
                                    jArr2 = jArr3;
                                } else {
                                    if (h0Var instanceof g0) {
                                        try {
                                            g0 g0Var2 = (g0) h0Var;
                                            h3 = g0Var2.h((f0) p.j(g0Var2.f24255x, iVar), iVar, false, g0Var2.f24253v);
                                        } catch (Throwable th) {
                                            th = th;
                                            Object[] objArr3 = q10.f25617u;
                                            int i22 = q10.f25619w;
                                            for (int i23 = 0; i23 < i22; i23++) {
                                                ((z) objArr3[i23]).a();
                                            }
                                            throw th;
                                        }
                                    } else {
                                        h3 = p.j(h0Var.b(), iVar);
                                    }
                                    jArr2 = jArr3;
                                    i = (((i * 31) + System.identityHashCode(h3)) * 31) + Long.hashCode(h3.f1350a);
                                }
                            } else {
                                jArr2 = jArr3;
                                i11 = i13;
                                i12 = i17;
                            }
                            j10 >>= i12;
                            i19++;
                            i13 = i11;
                            jArr3 = jArr2;
                            i17 = i12;
                        }
                        jArr = jArr3;
                        i10 = i13;
                        if (i18 != i17) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        i10 = i13;
                    }
                    if (i16 != length) {
                        i16++;
                        i13 = i10;
                        jArr3 = jArr;
                    } else {
                        i13 = i;
                        break;
                    }
                }
            }
            i = i13;
            Object[] objArr4 = q10.f25617u;
            int i24 = q10.f25619w;
            for (int i25 = 0; i25 < i24; i25++) {
                ((z) objArr4[i25]).a();
            }
            return i;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
