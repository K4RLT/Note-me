package b1;
import l.c;
import n.j0;
import p.e;
import p.m;

import b0.e1;
import b0.g1;
import com.google.android.gms.internal.ads.av0;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final a1.j f1385a = new a1.j(5);

    /* renamed from: b, reason: collision with root package name */
    public static final ya.y f1386b = new ya.y(6);

    /* renamed from: c, reason: collision with root package name */
    public static final Object f1387c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static m f1388d;
    public static long e;

    /* renamed from: f, reason: collision with root package name */
    public static final g1 f1389f;

    /* renamed from: g, reason: collision with root package name */
    public static final e1 f1390g;

    /* renamed from: h, reason: collision with root package name */
    public static Object f1391h;
    public static Object i;

    /* renamed from: j, reason: collision with root package name */
    public static final c f1392j;

    /* renamed from: k, reason: collision with root package name */
    public static final z0.a f1393k;

    /* JADX WARN: Type inference failed for: r0v9, types: [z0.a, java.util.concurrent.atomic.AtomicInteger] */
    /* JADX WARN: Type inference failed for: r1v2, types: [b1.i, b1.d, b1.c] */
    /* JADX WARN: Type inference failed for: r2v1, types: [g1, java.lang.Object] */
    static {
        m mVar = m.f1366y;
        f1388d = mVar;
        long j10 = 1;
        e = j10 + j10;
        Object obj = new Object();
        obj.f1190w = new long[16];
        obj.f1191x = new int[16];
        int[] iArr = new int[16];
        int i10 = 0;
        while (i10 < 16) {
            int i11 = i10 + 1;
            iArr[i10] = i11;
            i10 = i11;
        }
        obj.f1192y = iArr;
        f1389f = obj;
        e1 e1Var = new e1(2, (char) 0);
        e1Var.f1180c = new int[16];
        e1Var.f1181d = new av0[16];
        f1390g = e1Var;
        qe.s sVar = qe.s.f24023u;
        f1391h = sVar;
        i = sVar;
        long j11 = e;
        e = j10 + j11;
        d dVar = new d(j11, mVar, null, new a1.j(4));
        f1388d = f1388d.n(dVar.f1346b);
        f1392j = dVar;
        f1393k = new AtomicInteger(0);
    }

    public static final void a() {
        f(f1385a);
    }

    public static final df.l b(df.l lVar, df.l lVar2) {
        if (lVar != null && lVar2 != null && lVar != lVar2) {
            return new n(lVar, lVar2, 1);
        }
        if (lVar == null) {
            return lVar2;
        }
        return lVar;
    }

    public static final HashMap c(long j10, d dVar, m mVar) {
        long[] jArr;
        m mVar2;
        long[] jArr2;
        m mVar3;
        int i10;
        j0 s10;
        long j11 = j10;
        j0 x9 = dVar.x();
        if (x9 != null) {
            m k3 = dVar.d().n(dVar.g()).k(dVar.f1324j);
            Object[] objArr = x9.f20899b;
            long[] jArr3 = x9.f20898a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i11 = 0;
                HashMap hashMap = null;
                while (true) {
                    long j12 = jArr3[i11];
                    if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i12 = 8;
                        int i13 = 8 - ((~(i11 - length)) >>> 31);
                        int i14 = 0;
                        while (i14 < i13) {
                            if ((j12 & 255) < 128) {
                                h0 h0Var = (h0) objArr[(i11 << 3) + i14];
                                j0 b10 = h0Var.b();
                                jArr2 = jArr3;
                                i10 = i12;
                                j0 s11 = s(b10, j11, mVar);
                                if (s11 != null && (s10 = s(b10, j11, k3)) != null && !s11.equals(s10)) {
                                    mVar3 = k3;
                                    j0 s12 = s(b10, dVar.g(), dVar.d());
                                    if (s12 != null) {
                                        j0 g8 = h0Var.g(s10, s11, s12);
                                        if (g8 == null) {
                                            return null;
                                        }
                                        if (hashMap == null) {
                                            hashMap = new HashMap();
                                        }
                                        hashMap.put(s11, g8);
                                        hashMap = hashMap;
                                    } else {
                                        r();
                                        throw null;
                                    }
                                } else {
                                    mVar3 = k3;
                                }
                            } else {
                                jArr2 = jArr3;
                                mVar3 = k3;
                                i10 = i12;
                            }
                            j12 >>= i10;
                            i14++;
                            j11 = j10;
                            i12 = i10;
                            jArr3 = jArr2;
                            k3 = mVar3;
                        }
                        jArr = jArr3;
                        mVar2 = k3;
                        if (i13 != i12) {
                            return hashMap;
                        }
                    } else {
                        jArr = jArr3;
                        mVar2 = k3;
                    }
                    if (i11 != length) {
                        i11++;
                        j11 = j10;
                        jArr3 = jArr;
                        k3 = mVar2;
                    } else {
                        return hashMap;
                    }
                }
            }
        }
        return null;
    }

    public static final void d(i iVar) {
        d dVar;
        Object obj;
        long j10;
        if (!f1388d.g(iVar.g())) {
            StringBuilder sb2 = new StringBuilder("Snapshot is not open: snapshotId=");
            sb2.append(iVar.g());
            sb2.append(", disposed=");
            sb2.append(iVar.f1347c);
            sb2.append(", applied=");
            if (iVar instanceof d) {
                dVar = (d) iVar;
            } else {
                dVar = null;
            }
            if (dVar != null) {
                obj = Boolean.valueOf(dVar.f1327m);
            } else {
                obj = "read-only";
            }
            sb2.append(obj);
            sb2.append(", lowestPin=");
            synchronized (f1387c) {
                g1 g1Var = f1389f;
                if (g1Var.f1188u > 0) {
                    j10 = ((long[]) g1Var.f1190w)[0];
                } else {
                    j10 = -1;
                }
            }
            sb2.append(j10);
            throw new IllegalStateException(sb2.toString().toString());
        }
    }

    public static final m e(m mVar, long j10, long j11) {
        while (kotlin.jvm.internal.c(j10, j11) < 0) {
            mVar = mVar.n(j10);
            j10++;
        }
        return mVar;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List, java.lang.Object] */
    public static final Object f(df.l lVar) {
        j0 j0Var;
        Object v2;
        c cVar = f1392j;
        synchronized (f1387c) {
            try {
                j0Var = cVar.f1323h;
                if (j0Var != null) {
                    f1393k.addAndGet(1);
                }
                v2 = v(cVar, lVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (j0Var != null) {
            try {
                Object r42 = f1391h;
                int size = ((Collection) r42).size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((df.p) r42.get(i10)).invoke(new t0.g(j0Var), cVar);
                }
            } finally {
                f1393k.addAndGet(-1);
            }
        }
        synchronized (f1387c) {
            g();
            if (j0Var != null) {
                Object[] objArr = j0Var.f20899b;
                long[] jArr = j0Var.f20898a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i11 = 0;
                    while (true) {
                        long j10 = jArr[i11];
                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i12 = 8 - ((~(i11 - length)) >>> 31);
                            for (int i13 = 0; i13 < i12; i13++) {
                                if ((255 & j10) < 128) {
                                    q((h0) objArr[(i11 << 3) + i13]);
                                }
                                j10 >>= 8;
                            }
                            if (i12 != 8) {
                                break;
                            }
                        }
                        if (i11 == length) {
                            break;
                        }
                        i11++;
                    }
                }
            }
        }
        return v2;
    }

    public static final void g() {
        e1 e1Var = f1390g;
        int i10 = e1Var.f1179b;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            Object obj = null;
            if (i11 >= i10) {
                break;
            }
            av0 av0Var = ((av0[]) e1Var.f1181d)[i11];
            if (av0Var != null) {
                obj = av0Var.get();
            }
            if (obj != null && p((h0) obj)) {
                if (i12 != i11) {
                    ((av0[]) e1Var.f1181d)[i12] = av0Var;
                    int[] iArr = (int[]) e1Var.f1180c;
                    iArr[i12] = iArr[i11];
                }
                i12++;
            }
            i11++;
        }
        for (int i13 = i12; i13 < i10; i13++) {
            ((av0[]) e1Var.f1181d)[i13] = null;
            ((int[]) e1Var.f1180c)[i13] = 0;
        }
        if (i12 != i10) {
            e1Var.f1179b = i12;
        }
    }

    public static final i h(i iVar, df.l lVar, boolean z3) {
        d dVar;
        boolean z9 = iVar instanceof d;
        if (!z9 && iVar != null) {
            return new n0(iVar, lVar, false, z3);
        }
        if (z9) {
            dVar = (d) iVar;
        } else {
            dVar = null;
        }
        return new m0(dVar, lVar, null, false, z3);
    }

    public static final j0 i(j0 j0Var) {
        j0 s10;
        i k3 = k();
        j0 s11 = s(j0Var, k3.g(), k3.d());
        if (s11 == null) {
            synchronized (f1387c) {
                i k4 = k();
                s10 = s(j0Var, k4.g(), k4.d());
            }
            if (s10 != null) {
                return s10;
            }
            r();
            throw null;
        }
        return s11;
    }

    public static final j0 j(j0 j0Var, i iVar) {
        j0 s10;
        j0 s11 = s(j0Var, iVar.g(), iVar.d());
        if (s11 == null) {
            synchronized (f1387c) {
                s10 = s(j0Var, iVar.g(), iVar.d());
            }
            if (s10 != null) {
                return s10;
            }
            r();
            throw null;
        }
        return s11;
    }

    public static final i k() {
        i iVar = (i) f1386b.b();
        if (iVar == null) {
            return f1392j;
        }
        return iVar;
    }

    public static final df.l l(df.l lVar, df.l lVar2, boolean z3) {
        if (!z3) {
            lVar2 = null;
        }
        if (lVar != null && lVar2 != null && lVar != lVar2) {
            return new n(lVar, lVar2, 0);
        }
        if (lVar == null) {
            return lVar2;
        }
        return lVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        r3 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final b1.j0 m(b1.j0 r10, b1.h0 r11) {
        /*
            b1.j0 r0 = r11.b()
            long r1 = b1.e
            g1 r3 = b1.p.f1389f
            int r4 = r3.f1188u
            if (r4 <= 0) goto L14
            java.lang.Object r1 = r3.f1190w
            long[] r1 = (long[]) r1
            r2 = 0
            r2 = r1[r2]
            r1 = r2
        L14:
            r3 = 1
            long r3 = (long) r3
            long r1 = r1 - r3
            r3 = 0
            r4 = r3
        L19:
            if (r0 == 0) goto L4b
            long r5 = r0.f1350a
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L24
            goto L44
        L24:
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 == 0) goto L48
            int r7 = kotlin.jvm.internal.c(r5, r1)
            if (r7 > 0) goto L48
            b1.m r7 = b1.m.f1366y
            boolean r5 = r7.g(r5)
            if (r5 != 0) goto L48
            if (r4 != 0) goto L3a
            r4 = r0
            goto L48
        L3a:
            long r1 = r0.f1350a
            long r5 = r4.f1350a
            int r1 = kotlin.jvm.internal.c(r1, r5)
            if (r1 >= 0) goto L46
        L44:
            r3 = r0
            goto L4b
        L46:
            r3 = r4
            goto L4b
        L48:
            b1.j0 r0 = r0.f1351b
            goto L19
        L4b:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r3 == 0) goto L55
            r3.f1350a = r0
            return r3
        L55:
            b1.j0 r10 = r10.b(r0)
            b1.j0 r0 = r11.b()
            r10.f1351b = r0
            r11.a(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.m(b1.j0, b1.h0):b1.j0");
    }

    public static final void n(i iVar, h0 h0Var) {
        iVar.t(iVar.h() + 1);
        df.l i10 = iVar.i();
        if (i10 != null) {
            i10.invoke(h0Var);
        }
    }

    public static final j0 o(j0 j0Var, i0 i0Var, i iVar, j0 j0Var2) {
        j0 m4;
        if (iVar.f()) {
            iVar.n(i0Var);
        }
        long g8 = iVar.g();
        if (j0Var2.f1350a == g8) {
            return j0Var2;
        }
        synchronized (f1387c) {
            m4 = m(j0Var, i0Var);
        }
        m4.f1350a = g8;
        if (j0Var2.f1350a != 1) {
            iVar.n(i0Var);
        }
        return m4;
    }

    public static final boolean p(h0 h0Var) {
        j0 j0Var;
        long j10 = e;
        g1 g1Var = f1389f;
        if (g1Var.f1188u > 0) {
            j10 = ((long[]) g1Var.f1190w)[0];
        }
        j0 j0Var2 = null;
        j0 j0Var3 = null;
        int i10 = 0;
        for (j0 b10 = h0Var.b(); b10 != null; b10 = b10.f1351b) {
            long j11 = b10.f1350a;
            if (j11 != 0) {
                if (kotlin.jvm.internal.c(j11, j10) < 0) {
                    if (j0Var2 == null) {
                        i10++;
                        j0Var2 = b10;
                    } else {
                        if (kotlin.jvm.internal.c(b10.f1350a, j0Var2.f1350a) < 0) {
                            j0Var = j0Var2;
                            j0Var2 = b10;
                        } else {
                            j0Var = b10;
                        }
                        if (j0Var3 == null) {
                            j0Var3 = h0Var.b();
                            j0 j0Var4 = j0Var3;
                            while (true) {
                                if (j0Var3 != null) {
                                    if (kotlin.jvm.internal.c(j0Var3.f1350a, j10) >= 0) {
                                        break;
                                    }
                                    if (kotlin.jvm.internal.c(j0Var4.f1350a, j0Var3.f1350a) < 0) {
                                        j0Var4 = j0Var3;
                                    }
                                    j0Var3 = j0Var3.f1351b;
                                } else {
                                    j0Var3 = j0Var4;
                                    break;
                                }
                            }
                        }
                        j0Var2.f1350a = 0L;
                        j0Var2.a(j0Var3);
                        j0Var2 = j0Var;
                    }
                } else {
                    i10++;
                }
            }
        }
        if (i10 <= 1) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void q(h0 h0Var) {
        Object obj;
        Object obj2;
        Object obj3;
        if (p(h0Var)) {
            e1 e1Var = f1390g;
            int i10 = e1Var.f1179b;
            int identityHashCode = System.identityHashCode(h0Var);
            int i11 = -1;
            if (i10 > 0) {
                int i12 = e1Var.f1179b - 1;
                int i13 = 0;
                while (true) {
                    if (i13 <= i12) {
                        int i14 = (i13 + i12) >>> 1;
                        int i15 = ((int[]) e1Var.f1180c)[i14];
                        if (i15 < identityHashCode) {
                            i13 = i14 + 1;
                        } else if (i15 > identityHashCode) {
                            i12 = i14 - 1;
                        } else {
                            av0 av0Var = ((av0[]) e1Var.f1181d)[i14];
                            if (av0Var != null) {
                                obj = av0Var.get();
                            } else {
                                obj = null;
                            }
                            if (h0Var != obj) {
                                for (int i16 = i14 - 1; -1 < i16 && ((int[]) e1Var.f1180c)[i16] == identityHashCode; i16--) {
                                    av0 av0Var2 = ((av0[]) e1Var.f1181d)[i16];
                                    if (av0Var2 != null) {
                                        obj3 = av0Var2.get();
                                    } else {
                                        obj3 = null;
                                    }
                                    if (obj3 == h0Var) {
                                        i11 = i16;
                                        break;
                                    }
                                }
                                i14++;
                                int i17 = e1Var.f1179b;
                                while (true) {
                                    if (i14 < i17) {
                                        if (((int[]) e1Var.f1180c)[i14] != identityHashCode) {
                                            i11 = -(i14 + 1);
                                            break;
                                        }
                                        av0 av0Var3 = ((av0[]) e1Var.f1181d)[i14];
                                        if (av0Var3 != null) {
                                            obj2 = av0Var3.get();
                                        } else {
                                            obj2 = null;
                                        }
                                        if (obj2 == h0Var) {
                                            break;
                                        } else {
                                            i14++;
                                        }
                                    } else {
                                        i11 = -(e1Var.f1179b + 1);
                                        break;
                                    }
                                }
                            }
                            i11 = i14;
                        }
                    } else {
                        i11 = -(i13 + 1);
                        break;
                    }
                }
                if (i11 >= 0) {
                    return;
                }
            }
            int i18 = -(i11 + 1);
            av0[] av0VarArr = (av0[]) e1Var.f1181d;
            int length = av0VarArr.length;
            if (i10 == length) {
                int i19 = length * 2;
                av0[] av0VarArr2 = new av0[i19];
                int[] iArr = new int[i19];
                int i20 = i18 + 1;
                System.arraycopy(av0VarArr, i18, av0VarArr2, i20, i10 - i18);
                System.arraycopy((av0[]) e1Var.f1181d, 0, av0VarArr2, 0, i18);
                qe.k.c(i20, i18, i10, (int[]) e1Var.f1180c, iArr);
                qe.k.f(0, i18, 6, (int[]) e1Var.f1180c, iArr);
                e1Var.f1181d = av0VarArr2;
                e1Var.f1180c = iArr;
            } else {
                int i21 = i18 + 1;
                System.arraycopy(av0VarArr, i18, av0VarArr, i21, i10 - i18);
                int[] iArr2 = (int[]) e1Var.f1180c;
                qe.k.c(i21, i18, i10, iArr2, iArr2);
            }
            ((av0[]) e1Var.f1181d)[i18] = new WeakReference(h0Var);
            ((int[]) e1Var.f1180c)[i18] = identityHashCode;
            e1Var.f1179b++;
        }
    }

    public static final void r() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final j0 s(j0 j0Var, long j10, m mVar) {
        j0 j0Var2 = null;
        while (j0Var != null) {
            long j11 = j0Var.f1350a;
            if (j11 != 0 && kotlin.jvm.internal.c(j11, j10) <= 0 && !mVar.g(j11) && (j0Var2 == null || kotlin.jvm.internal.c(j0Var2.f1350a, j0Var.f1350a) < 0)) {
                j0Var2 = j0Var;
            }
            j0Var = j0Var.f1351b;
        }
        if (j0Var2 == null) {
            return null;
        }
        return j0Var2;
    }

    public static final j0 t(j0 j0Var, h0 h0Var) {
        j0 s10;
        i k3 = k();
        df.l e8 = k3.e();
        if (e8 != null) {
            e8.invoke(h0Var);
        }
        j0 s11 = s(j0Var, k3.g(), k3.d());
        if (s11 == null) {
            synchronized (f1387c) {
                i k4 = k();
                j0 b10 = h0Var.b();
                b10.getClass();
                s10 = s(b10, k4.g(), k4.d());
                if (s10 == null) {
                    r();
                    throw null;
                }
            }
            return s10;
        }
        return s11;
    }

    public static final void u(int i10) {
        g1 g1Var = f1389f;
        int i11 = ((int[]) g1Var.f1192y)[i10];
        g1Var.q(i11, g1Var.f1188u - 1);
        g1Var.f1188u--;
        long[] jArr = (long[]) g1Var.f1190w;
        long j10 = jArr[i11];
        int i12 = i11;
        while (i12 > 0) {
            int i13 = ((i12 + 1) >> 1) - 1;
            if (kotlin.jvm.internal.c(jArr[i13], j10) <= 0) {
                break;
            }
            g1Var.q(i13, i12);
            i12 = i13;
        }
        long[] jArr2 = (long[]) g1Var.f1190w;
        int i14 = g1Var.f1188u >> 1;
        while (i11 < i14) {
            int i15 = (i11 + 1) << 1;
            int i16 = i15 - 1;
            if (i15 < g1Var.f1188u && kotlin.jvm.internal.c(jArr2[i15], jArr2[i16]) < 0) {
                if (kotlin.jvm.internal.c(jArr2[i15], jArr2[i11]) >= 0) {
                    break;
                }
                g1Var.q(i15, i11);
                i11 = i15;
            } else {
                if (kotlin.jvm.internal.c(jArr2[i16], jArr2[i11]) >= 0) {
                    break;
                }
                g1Var.q(i16, i11);
                i11 = i16;
            }
        }
        ((int[]) g1Var.f1192y)[i10] = g1Var.f1189v;
        g1Var.f1189v = i10;
    }

    public static final Object v(c cVar, df.l lVar) {
        long j10 = cVar.f1346b;
        Object invoke = lVar.invoke(f1388d.b(j10));
        long j11 = e;
        e = 1 + j11;
        m b10 = f1388d.b(j10);
        f1388d = b10;
        cVar.f1346b = j11;
        cVar.f1345a = b10;
        cVar.f1322g = 0;
        cVar.f1323h = null;
        cVar.o();
        f1388d = f1388d.n(j11);
        return invoke;
    }

    public static final j0 w(j0 j0Var, h0 h0Var, i iVar) {
        j0 s10;
        if (iVar.f()) {
            iVar.n(h0Var);
        }
        long g8 = iVar.g();
        j0 s11 = s(j0Var, g8, iVar.d());
        if (s11 != null) {
            if (s11.f1350a == iVar.g()) {
                return s11;
            }
            synchronized (f1387c) {
                s10 = s(h0Var.b(), g8, iVar.d());
                if (s10 != null) {
                    if (s10.f1350a != g8) {
                        j0 m4 = m(s10, h0Var);
                        m4.a(s10);
                        m4.f1350a = iVar.g();
                        s10 = m4;
                    }
                } else {
                    r();
                    throw null;
                }
            }
            if (s11.f1350a != 1) {
                iVar.n(h0Var);
            }
            return s10;
        }
        r();
        throw null;
    }
}