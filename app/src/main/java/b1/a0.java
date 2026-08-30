package b1;
import a0.b;
import a0.e;
import n.c0;
import n.i0;
import n.j0;
import p.k;

import java.util.HashMap;
import ya.gc;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final df.l f1295a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1296b;

    /* renamed from: c, reason: collision with root package name */
    public c0 f1297c;

    /* renamed from: j, reason: collision with root package name */
    public int f1302j;

    /* renamed from: d, reason: collision with root package name */
    public int f1298d = -1;
    public final i0 e = gc.b();

    /* renamed from: f, reason: collision with root package name */
    public final i0 f1299f = new i0();

    /* renamed from: g, reason: collision with root package name */
    public final j0 f1300g = new j0();

    /* renamed from: h, reason: collision with root package name */
    public final t0.e f1301h = new t0.e(new r0.g0[16]);
    public final z i = new z(0, this);

    /* renamed from: k, reason: collision with root package name */
    public final i0 f1303k = gc.b();

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f1304l = new HashMap();

    public a0(df.l lVar) {
        this.f1295a = lVar;
    }

    public final void a(Object obj, a1.f fVar, df.a aVar) {
        boolean z3;
        int i;
        int i10;
        boolean z9;
        Object obj2 = this.f1296b;
        c0 c0Var = this.f1297c;
        int i11 = this.f1298d;
        this.f1296b = obj;
        this.f1297c = (c0) this.f1299f.g(obj);
        if (this.f1298d == -1) {
            this.f1298d = Long.hashCode(k().g());
        }
        z zVar = this.i;
        t0.e q10 = r0.y.q();
        boolean z10 = true;
        try {
            q10.b(zVar);
            w.i(aVar, fVar);
            q10.n(q10.f25619w - 1);
            Object obj3 = this.f1296b;
            obj3.getClass();
            int i12 = this.f1298d;
            c0 c0Var2 = this.f1297c;
            if (c0Var2 != null) {
                long[] jArr = c0Var2.f20849a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i13 = 0;
                    while (true) {
                        long j10 = jArr[i13];
                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i14 = 8;
                            int i15 = 8 - ((~(i13 - length)) >>> 31);
                            z3 = z10;
                            int i16 = 0;
                            while (i16 < i15) {
                                if ((j10 & 255) < 128) {
                                    int i17 = (i13 << 3) + i16;
                                    i10 = i14;
                                    Object obj4 = c0Var2.f20850b[i17];
                                    i = i16;
                                    if (c0Var2.f20851c[i17] != i12) {
                                        z9 = z3;
                                    } else {
                                        z9 = false;
                                    }
                                    if (z9) {
                                        d(obj3, obj4);
                                    }
                                    if (z9) {
                                        c0Var2.g(i17);
                                    }
                                } else {
                                    i = i16;
                                    i10 = i14;
                                }
                                j10 >>= i10;
                                i16 = i + 1;
                                i14 = i10;
                            }
                            if (i15 != i14) {
                                break;
                            }
                        } else {
                            z3 = z10;
                        }
                        if (i13 == length) {
                            break;
                        }
                        i13++;
                        z10 = z3;
                    }
                }
            }
            this.f1296b = obj2;
            this.f1297c = c0Var;
            this.f1298d = i11;
        } catch (Throwable th) {
            q10.n(q10.f25619w - 1);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:273:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x053f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(java.util.Set r45) {
        /*
            Method dump skipped, instructions count: 1562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.b(java.util.Set):boolean");
    }

    public final void c(Object obj, int i, Object obj2, c0 c0Var) {
        int i10;
        if (this.f1302j <= 0) {
            int c10 = c0Var.c(obj);
            if (c10 < 0) {
                c10 = ~c10;
                i10 = -1;
            } else {
                i10 = c0Var.f20851c[c10];
            }
            c0Var.f20850b[c10] = obj;
            c0Var.f20851c[c10] = i;
            if ((obj instanceof r0.g0) && i10 != i) {
                r0.f0 i11 = ((r0.g0) obj).i();
                this.f1304l.put(obj, i11.f24248f);
                c0 c0Var2 = i11.e;
                i0 i0Var = this.f1303k;
                gc.d(i0Var, obj);
                Object[] objArr = c0Var2.f20850b;
                long[] jArr = c0Var2.f20849a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i12 = 0;
                    while (true) {
                        long j10 = jArr[i12];
                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i13 = 8 - ((~(i12 - length)) >>> 31);
                            for (int i14 = 0; i14 < i13; i14++) {
                                if ((j10 & 255) < 128) {
                                    h0 h0Var = (h0) objArr[(i12 << 3) + i14];
                                    if (h0Var instanceof i0) {
                                        ((i0) h0Var).f(2);
                                    }
                                    gc.a(i0Var, h0Var, obj);
                                }
                                j10 >>= 8;
                            }
                            if (i13 != 8) {
                                break;
                            }
                        }
                        if (i12 == length) {
                            break;
                        } else {
                            i12++;
                        }
                    }
                }
            }
            if (i10 == -1) {
                if (obj instanceof i0) {
                    ((i0) obj).f(2);
                }
                gc.a(this.e, obj, obj2);
            }
        }
    }

    public final void d(Object obj, Object obj2) {
        i0 i0Var = this.e;
        gc.c(i0Var, obj2, obj);
        if ((obj2 instanceof r0.g0) && !i0Var.c(obj2)) {
            gc.d(this.f1303k, obj2);
            this.f1304l.remove(obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.e():void");
    }
}
