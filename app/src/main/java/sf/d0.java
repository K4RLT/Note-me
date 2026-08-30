package sf;
import x.o;
import e0.c;
import l.a;
import q.x;

import java.util.Arrays;
import ya.rc;

/* loaded from: classes.dex */
public class d0 extends tf.b implements z, g, tf.p {
    public final rf.a A;
    public Object[] B;
    public long C;
    public long D;
    public int E;
    public int F;

    /* renamed from: y, reason: collision with root package name */
    public final int f25160y;

    /* renamed from: z, reason: collision with root package name */
    public final int f25161z;

    public d0(int i, int i10, rf.a aVar) {
        this.f25160y = i;
        this.f25161z = i10;
        this.A = aVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:1|(7:(2:3|(10:5|6|7|(2:9|(1:(1:(7:13|14|15|16|17|(3:18|19|(10:28|(2:33|34)|36|(1:38)|15|16|17|18|19|(0)(1:21))(0))|25)(2:39|40))(5:41|42|17|(3:18|19|(0)(0))|25))(4:43|44|45|46))(1:57)|47|48|16|17|(3:18|19|(0)(0))|25))|47|48|16|17|(3:18|19|(0)(0))|25)|59|6|7|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0036, code lost:
    
        r8 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007f A[Catch: all -> 0x0036, TRY_ENTER, TryCatch #0 {all -> 0x0036, blocks: (B:14:0x002f, B:18:0x0075, B:21:0x007f, B:30:0x0092, B:33:0x0099, B:34:0x009d, B:36:0x009e, B:42:0x0047), top: B:7:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /* JADX WARN: Type inference failed for: r4v1, types: [tf.b] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4, types: [sf.d0] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [sf.h] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v2, types: [tf.d] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [sf.f0] */
    /* JADX WARN: Type inference failed for: r9v8, types: [sf.f0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00ac -> B:15:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void k(sf.d0 r8, sf.h r9, te.c r10) {
        /*
            boolean r0 = r10 instanceof sf.c0
            if (r0 == 0) goto L13
            r0 = r10
            sf.c0 r0 = (sf.c0) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            sf.c0 r0 = new sf.c0
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f25155y
            int r1 = r0.A
            r2 = 3
            r3 = 2
            if (r1 == 0) goto L5a
            r8 = 1
            if (r1 == r8) goto L4b
            if (r1 == r3) goto L3f
            if (r1 != r2) goto L39
            pf.d1 r8 = r0.f25154x
            sf.f0 r9 = r0.f25153w
            sf.h r1 = r0.f25152v
            sf.d0 r4 = r0.f25151u
            pe.a.e(r10)     // Catch: java.lang.Throwable -> L36
        L32:
            r10 = r1
            r1 = r8
            r8 = r4
            goto L72
        L36:
            r8 = move-exception
            goto Lb2
        L39:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r8)
            return
        L3f:
            pf.d1 r8 = r0.f25154x
            sf.f0 r9 = r0.f25153w
            sf.h r1 = r0.f25152v
            sf.d0 r4 = r0.f25151u
            pe.a.e(r10)     // Catch: java.lang.Throwable -> L36
            goto L75
        L4b:
            sf.f0 r9 = r0.f25153w
            sf.h r8 = r0.f25152v
            sf.d0 r1 = r0.f25151u
            pe.a.e(r10)     // Catch: java.lang.Throwable -> L57
            r10 = r8
            r8 = r1
            goto L66
        L57:
            r8 = move-exception
            r4 = r1
            goto Lb2
        L5a:
            pe.a.e(r10)
            tf.d r10 = r8.c()
            sf.f0 r10 = (sf.f0) r10
            r7 = r10
            r10 = r9
            r9 = r7
        L66:
            te.g r1 = r0.getContext()     // Catch: java.lang.Throwable -> Laf
            pf.w r4 = pf.w.f22803v     // Catch: java.lang.Throwable -> Laf
            te.e r1 = r1.L(r4)     // Catch: java.lang.Throwable -> Laf
            pf.d1 r1 = (pf.d1) r1     // Catch: java.lang.Throwable -> Laf
        L72:
            r4 = r8
            r8 = r1
            r1 = r10
        L75:
            java.lang.Object r10 = r4.t(r9)     // Catch: java.lang.Throwable -> L36
            c4.s r5 = sf.e0.f25165a     // Catch: java.lang.Throwable -> L36
            ue.a r6 = ue.a.f27192u
            if (r10 != r5) goto L90
            r0.f25151u = r4     // Catch: java.lang.Throwable -> L36
            r0.f25152v = r1     // Catch: java.lang.Throwable -> L36
            r0.f25153w = r9     // Catch: java.lang.Throwable -> L36
            r0.f25154x = r8     // Catch: java.lang.Throwable -> L36
            r0.A = r3     // Catch: java.lang.Throwable -> L36
            java.lang.Object r10 = r4.i(r9, r0)     // Catch: java.lang.Throwable -> L36
            if (r10 != r6) goto L75
            goto Lae
        L90:
            if (r8 == 0) goto L9e
            boolean r5 = r8.f()     // Catch: java.lang.Throwable -> L36
            if (r5 == 0) goto L99
            goto L9e
        L99:
            java.util.concurrent.CancellationException r8 = r8.r()     // Catch: java.lang.Throwable -> L36
            throw r8     // Catch: java.lang.Throwable -> L36
        L9e:
            r0.f25151u = r4     // Catch: java.lang.Throwable -> L36
            r0.f25152v = r1     // Catch: java.lang.Throwable -> L36
            r0.f25153w = r9     // Catch: java.lang.Throwable -> L36
            r0.f25154x = r8     // Catch: java.lang.Throwable -> L36
            r0.A = r2     // Catch: java.lang.Throwable -> L36
            java.lang.Object r10 = r1.e(r10, r0)     // Catch: java.lang.Throwable -> L36
            if (r10 != r6) goto L32
        Lae:
            return
        Laf:
            r10 = move-exception
            r4 = r8
            r8 = r10
        Lb2:
            r4.g(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: sf.d0.k(sf.d0, sf.h, te.c):void");
    }

    @Override // tf.p
    public final g a(te.g gVar, int i, rf.a aVar) {
        if ((i == 0 || i == -3) && aVar == rf.a.f24769u) {
            return this;
        }
        return new tf.f(this, gVar, i, aVar);
    }

    @Override // sf.g
    public final Object b(h hVar, te.c cVar) {
        k(this, hVar, cVar);
        return ue.a.f27192u;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [sf.f0, java.lang.Object, tf.d] */
    @Override // tf.b
    public final tf.d d() {
        Object obj = new Object();
        obj.f25169a = -1L;
        return obj;
    }

    @Override // sf.h
    public final Object e(Object obj, te.c cVar) {
        Throwable th;
        te.c[] n10;
        b0 b0Var;
        if (q(obj)) {
            return pe.z.f22715a;
        }
        pf.l lVar = new pf.l(1, rc.b(cVar));
        lVar.s();
        te.c[] cVarArr = tf.c.f25715a;
        synchronized (this) {
            try {
                if (r(obj)) {
                    try {
                        lVar.resumeWith(pe.z.f22715a);
                        n10 = n(cVarArr);
                        b0Var = null;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    try {
                        b0 b0Var2 = new b0(this, o() + this.E + this.F, obj, lVar);
                        m(b0Var2);
                        this.F++;
                        if (this.f25161z == 0) {
                            cVarArr = n(cVarArr);
                        }
                        n10 = cVarArr;
                        b0Var = b0Var2;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        throw th;
                    }
                }
                if (b0Var != null) {
                    lVar.v(new pf.i(2, b0Var));
                }
                for (te.c cVar2 : n10) {
                    if (cVar2 != null) {
                        cVar2.resumeWith(pe.z.f22715a);
                    }
                }
                Object r8 = lVar.r();
                ue.a aVar = ue.a.f27192u;
                if (r8 != aVar) {
                    r8 = pe.z.f22715a;
                }
                if (r8 == aVar) {
                    return r8;
                }
                return pe.z.f22715a;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    @Override // tf.b
    public final tf.d[] f() {
        return new f0[2];
    }

    public final Object i(f0 f0Var, c0 c0Var) {
        pf.l lVar = new pf.l(1, rc.b(c0Var));
        lVar.s();
        synchronized (this) {
            try {
                if (s(f0Var) < 0) {
                    f0Var.f25170b = lVar;
                } else {
                    lVar.resumeWith(pe.z.f22715a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Object r8 = lVar.r();
        if (r8 == ue.a.f27192u) {
            return r8;
        }
        return pe.z.f22715a;
    }

    public final void j() {
        if (this.f25161z != 0 || this.F > 1) {
            Object[] objArr = this.B;
            objArr.getClass();
            while (this.F > 0) {
                long o10 = o();
                int i = this.E;
                int i10 = this.F;
                if (objArr[((int) ((o10 + (i + i10)) - 1)) & (objArr.length - 1)] == e0.f25165a) {
                    this.F = i10 - 1;
                    c(objArr, o() + this.E + this.F, null);
                } else {
                    return;
                }
            }
        }
    }

    public final void l() {
        tf.d[] dVarArr;
        Object[] objArr = this.B;
        objArr.getClass();
        c(objArr, o(), null);
        this.E--;
        long o10 = o() + 1;
        if (this.C < o10) {
            this.C = o10;
        }
        if (this.D < o10) {
            if (this.f25712v != 0 && (dVarArr = this.f25711u) != null) {
                for (tf.d dVar : dVarArr) {
                    if (dVar != null) {
                        f0 f0Var = (f0) dVar;
                        long j10 = f0Var.f25169a;
                        if (j10 >= 0 && j10 < o10) {
                            f0Var.f25169a = o10;
                        }
                    }
                }
            }
            this.D = o10;
        }
    }

    public final void m(Object obj) {
        int i = this.E + this.F;
        Object[] objArr = this.B;
        if (objArr == null) {
            objArr = p(null, 0, 2);
        } else if (i >= objArr.length) {
            objArr = p(objArr, i, objArr.length * 2);
        }
        c(objArr, o() + i, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final te.c[] n(te.c[] cVarArr) {
        tf.d[] dVarArr;
        f0 f0Var;
        pf.l lVar;
        int length = cVarArr.length;
        if (this.f25712v != 0 && (dVarArr = this.f25711u) != null) {
            int length2 = dVarArr.length;
            int i = 0;
            cVarArr = cVarArr;
            while (i < length2) {
                tf.d dVar = dVarArr[i];
                if (dVar != null && (lVar = (f0Var = (f0) dVar).f25170b) != null && s(f0Var) >= 0) {
                    int length3 = cVarArr.length;
                    cVarArr = cVarArr;
                    if (length >= length3) {
                        cVarArr = Arrays.copyOf(cVarArr, Math.max(2, cVarArr.length * 2));
                    }
                    cVarArr[length] = lVar;
                    f0Var.f25170b = null;
                    length++;
                }
                i++;
                cVarArr = cVarArr;
            }
        }
        return cVarArr;
    }

    public final long o() {
        return Math.min(this.D, this.C);
    }

    public final Object[] p(Object[] objArr, int i, int i10) {
        if (i10 > 0) {
            Object[] objArr2 = new Object[i10];
            this.B = objArr2;
            if (objArr != null) {
                long o10 = o();
                for (int i11 = 0; i11 < i; i11++) {
                    long j10 = i11 + o10;
                    c(objArr2, j10, objArr[((int) j10) & (objArr.length - 1)]);
                }
            }
            return objArr2;
        }
        x.o("Buffer size overflow");
        return null;
    }

    public final boolean q(Object obj) {
        int i;
        boolean z3;
        te.c[] cVarArr = tf.c.f25715a;
        synchronized (this) {
            if (r(obj)) {
                cVarArr = n(cVarArr);
                z3 = true;
            } else {
                z3 = false;
            }
        }
        for (te.c cVar : cVarArr) {
            if (cVar != null) {
                cVar.resumeWith(pe.z.f22715a);
            }
        }
        return z3;
    }

    public final boolean r(Object obj) {
        int i = this.f25712v;
        int i10 = this.f25160y;
        if (i == 0) {
            if (i10 != 0) {
                m(obj);
                int i11 = this.E + 1;
                this.E = i11;
                if (i11 > i10) {
                    l();
                }
                this.D = o() + this.E;
                return true;
            }
        } else {
            int i12 = this.E;
            int i13 = this.f25161z;
            if (i12 >= i13 && this.D <= this.C) {
                int ordinal = this.A.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            l4.a.o();
                            return false;
                        }
                    }
                } else {
                    return false;
                }
            }
            m(obj);
            int i14 = this.E + 1;
            this.E = i14;
            if (i14 > i13) {
                l();
            }
            long o10 = o() + this.E;
            long j10 = this.C;
            if (((int) (o10 - j10)) > i10) {
                u(1 + j10, this.D, o() + this.E, o() + this.E + this.F);
            }
        }
        return true;
    }

    public final long s(f0 f0Var) {
        long j10 = f0Var.f25169a;
        if (j10 >= o() + this.E) {
            if (this.f25161z > 0 || j10 > o() || this.F == 0) {
                return -1L;
            }
            return j10;
        }
        return j10;
    }

    public final Object t(f0 f0Var) {
        Object obj;
        te.c[] cVarArr = tf.c.f25715a;
        synchronized (this) {
            try {
                long s10 = s(f0Var);
                if (s10 < 0) {
                    obj = e0.f25165a;
                } else {
                    long j10 = f0Var.f25169a;
                    Object[] objArr = this.B;
                    objArr.getClass();
                    Object obj2 = objArr[((int) s10) & (objArr.length - 1)];
                    if (obj2 instanceof b0) {
                        obj2 = ((b0) obj2).f25147w;
                    }
                    f0Var.f25169a = s10 + 1;
                    Object obj3 = obj2;
                    cVarArr = v(j10);
                    obj = obj3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (te.c cVar : cVarArr) {
            if (cVar != null) {
                cVar.resumeWith(pe.z.f22715a);
            }
        }
        return obj;
    }

    public final void u(long j10, long j11, long j12, long j13) {
        long min = Math.min(j11, j10);
        for (long o10 = o(); o10 < min; o10++) {
            Object[] objArr = this.B;
            objArr.getClass();
            c(objArr, o10, null);
        }
        this.C = j10;
        this.D = j11;
        this.E = (int) (j12 - min);
        this.F = (int) (j13 - j12);
    }

    public final te.c[] v(long j10) {
        long j11;
        long j12;
        long j13;
        te.c[] cVarArr;
        long j14;
        te.c[] cVarArr2;
        tf.d[] dVarArr;
        c4.s sVar = e0.f25165a;
        te.c[] cVarArr3 = tf.c.f25715a;
        if (j10 <= this.D) {
            long o10 = o();
            long j15 = this.E + o10;
            int i = this.f25161z;
            if (i == 0 && this.F > 0) {
                j15++;
            }
            int i10 = 0;
            if (this.f25712v != 0 && (dVarArr = this.f25711u) != null) {
                for (tf.d dVar : dVarArr) {
                    if (dVar != null) {
                        long j16 = ((f0) dVar).f25169a;
                        if (j16 >= 0 && j16 < j15) {
                            j15 = j16;
                        }
                    }
                }
            }
            if (j15 > this.D) {
                long o11 = o() + this.E;
                int i11 = this.f25712v;
                int i12 = this.F;
                if (i11 > 0) {
                    j11 = 1;
                    i12 = Math.min(i12, i - ((int) (o11 - j15)));
                } else {
                    j11 = 1;
                }
                long j17 = this.F + o11;
                if (i12 > 0) {
                    Object[] objArr = this.B;
                    objArr.getClass();
                    j12 = o10;
                    te.c[] cVarArr4 = new te.c[i12];
                    long j18 = o11;
                    while (true) {
                        if (o11 < j17) {
                            cVarArr2 = cVarArr4;
                            Object obj = objArr[((int) o11) & (objArr.length - 1)];
                            if (obj != sVar) {
                                obj.getClass();
                                b0 b0Var = (b0) obj;
                                j13 = j15;
                                int i13 = i10 + 1;
                                cVarArr2[i10] = b0Var.f25148x;
                                c(objArr, o11, sVar);
                                c(objArr, j18, b0Var.f25147w);
                                j18 += j11;
                                if (i13 >= i12) {
                                    break;
                                }
                                i10 = i13;
                            } else {
                                j13 = j15;
                            }
                            o11 += j11;
                            cVarArr4 = cVarArr2;
                            j15 = j13;
                        } else {
                            cVarArr2 = cVarArr4;
                            j13 = j15;
                            break;
                        }
                    }
                    o11 = j18;
                    cVarArr = cVarArr2;
                } else {
                    j12 = o10;
                    j13 = j15;
                    cVarArr = cVarArr3;
                }
                int i14 = (int) (o11 - j12);
                if (this.f25712v == 0) {
                    j14 = o11;
                } else {
                    j14 = j13;
                }
                long max = Math.max(this.C, o11 - Math.min(this.f25160y, i14));
                if (i == 0 && max < j17) {
                    Object[] objArr2 = this.B;
                    objArr2.getClass();
                    if (kotlin.jvm.internal.a(objArr2[((int) max) & (objArr2.length - 1)], sVar)) {
                        o11 += j11;
                        max += j11;
                    }
                }
                u(max, j14, o11, j17);
                j();
                if (cVarArr.length == 0) {
                    return cVarArr;
                }
                return n(cVarArr);
            }
        }
        return cVarArr3;
    }
}