package v1;
import b.c;
import l.e;
import n.d0;
import n.q;

import b2.a2;
import b2.k1;
import com.google.android.gms.internal.ads.mf;
import com.google.android.gms.internal.ads.yg0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public final class i extends j {

    /* renamed from: c, reason: collision with root package name */
    public final d1.q f27319c;

    /* renamed from: d, reason: collision with root package name */
    public final yg0 f27320d;
    public final q e;

    /* renamed from: f, reason: collision with root package name */
    public k1 f27321f;

    /* renamed from: g, reason: collision with root package name */
    public k f27322g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f27323h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f27324j;

    /* JADX WARN: Type inference failed for: r3v1, types: [com.google.android.gms.internal.ads.yg0, java.lang.Object] */
    public i(d1.q qVar) {
        this.f27319c = qVar;
        Object obj = new Object();
        obj.f12867b = new long[2];
        this.f27320d = obj;
        this.e = new q(2);
        this.i = true;
        this.f27324j = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [d1.q] */
    /* JADX WARN: Type inference failed for: r5v1, types: [d1.q] */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43, types: [d1.q] */
    /* JADX WARN: Type inference failed for: r5v44, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20, types: [t0.e] */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23, types: [t0.e] */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    @Override // v1.j
    public final boolean a(q qVar, z1.x xVar, mf mfVar, boolean z3) {
        yg0 yg0Var;
        q qVar2;
        Object obj;
        boolean z9;
        boolean z10;
        k kVar;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i;
        int i10;
        boolean z15;
        int i11;
        boolean z16;
        int i12;
        int i13;
        t tVar;
        boolean a10 = super.a(qVar, xVar, mfVar, z3);
        b2.k kVar2 = this.f27319c;
        boolean z17 = true;
        if (kVar2.H) {
            Object r8 = 0;
            while (kVar2 != 0) {
                if (kVar2 instanceof a2) {
                    this.f27321f = b2.l.s((a2) kVar2, 16);
                } else if ((kVar2.f15690w & 16) != 0 && (kVar2 instanceof b2.k)) {
                    d1.q qVar3 = kVar2.J;
                    int i14 = 0;
                    kVar2 = kVar2;
                    r8 = r8;
                    while (qVar3 != null) {
                        if ((qVar3.f15690w & 16) != 0) {
                            i14++;
                            r8 = r8;
                            if (i14 == 1) {
                                kVar2 = qVar3;
                            } else {
                                if (r8 == 0) {
                                    r8 = new t0.e(new d1.q[16]);
                                }
                                if (kVar2 != 0) {
                                    r8.b(kVar2);
                                    kVar2 = 0;
                                }
                                r8.b(qVar3);
                            }
                        }
                        qVar3 = qVar3.f15693z;
                        kVar2 = kVar2;
                        r8 = r8;
                    }
                    if (i14 == 1) {
                    }
                }
                kVar2 = b2.e(r8);
            }
            if (this.f27321f != null) {
                int f10 = qVar.f();
                int i15 = 0;
                while (true) {
                    yg0Var = this.f27320d;
                    qVar2 = this.e;
                    if (i15 >= f10) {
                        break;
                    }
                    long c10 = qVar.c(i15);
                    t tVar2 = (t) qVar.g(i15);
                    if (yg0Var.b(c10)) {
                        boolean z18 = z17;
                        long j10 = tVar2.f27346g;
                        long j11 = tVar2.f27343c;
                        if ((((j10 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0 && (((j11 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                            z16 = z18;
                            z15 = a10;
                            ArrayList arrayList = new ArrayList(tVar2.b().size());
                            List b10 = tVar2.b();
                            i11 = f10;
                            int size = b10.size();
                            i12 = i15;
                            int i16 = 0;
                            while (i16 < size) {
                                List list = b10;
                                d dVar = (d) b10.get(i16);
                                q qVar4 = qVar2;
                                long j12 = c10;
                                long j13 = dVar.f27291b;
                                if ((((j13 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                                    tVar = tVar2;
                                    long j14 = dVar.f27290a;
                                    i13 = size;
                                    k1 k1Var = this.f27321f;
                                    k1Var.getClass();
                                    arrayList.add(new d(j14, k1Var.q1(xVar, j13), dVar.f27292c));
                                } else {
                                    i13 = size;
                                    tVar = tVar2;
                                }
                                i16++;
                                size = i13;
                                b10 = list;
                                qVar2 = qVar4;
                                c10 = j12;
                                tVar2 = tVar;
                            }
                            q qVar5 = qVar2;
                            long j15 = c10;
                            k1 k1Var2 = this.f27321f;
                            k1Var2.getClass();
                            long q12 = k1Var2.q1(xVar, j10);
                            k1 k1Var3 = this.f27321f;
                            k1Var3.getClass();
                            t tVar3 = new t(tVar2.f27341a, tVar2.f27342b, k1Var3.q1(xVar, j11), tVar2.f27344d, tVar2.e, tVar2.f27345f, q12, tVar2.f27347h, tVar2.i, arrayList, tVar2.f27348j, tVar2.f27350l);
                            t tVar4 = tVar2.f27353o;
                            if (tVar4 == null) {
                                tVar4 = tVar2;
                            }
                            tVar3.f27353o = tVar4;
                            t tVar5 = tVar2.f27353o;
                            if (tVar5 != null) {
                                tVar2 = tVar5;
                            }
                            tVar3.f27353o = tVar2;
                            qVar5.d(j15, tVar3);
                        } else {
                            z15 = a10;
                            i11 = f10;
                            i12 = i15;
                            z16 = z18;
                        }
                    } else {
                        z15 = a10;
                        i11 = f10;
                        z16 = z17;
                        i12 = i15;
                    }
                    i15 = i12 + 1;
                    z17 = z16;
                    a10 = z15;
                    f10 = i11;
                }
                boolean z19 = a10;
                boolean z20 = z17;
                if (qVar2.f() == 0) {
                    yg0Var.f12866a = 0;
                    this.f27325a.j();
                    return z20;
                }
                int i17 = yg0Var.f12866a;
                while (true) {
                    i17--;
                    if (-1 >= i17) {
                        break;
                    }
                    if (!qVar.a(yg0Var.f12867b[i17]) && i17 < (i10 = yg0Var.f12866a)) {
                        int i18 = i10 - 1;
                        int i19 = i17;
                        while (i19 < i18) {
                            long[] jArr = yg0Var.f12867b;
                            int i20 = i19 + 1;
                            jArr[i19] = jArr[i20];
                            i19 = i20;
                        }
                        yg0Var.f12866a--;
                    }
                }
                ArrayList arrayList2 = new ArrayList(qVar2.f());
                int f11 = qVar2.f();
                for (int i21 = 0; i21 < f11; i21++) {
                    arrayList2.add(qVar2.g(i21));
                }
                k kVar3 = new k(arrayList2, mfVar);
                int size2 = arrayList2.size();
                int i22 = 0;
                while (true) {
                    if (i22 < size2) {
                        obj = arrayList2.get(i22);
                        if (mfVar.a(((t) obj).f27341a)) {
                            break;
                        }
                        i22++;
                    } else {
                        obj = null;
                        break;
                    }
                }
                t tVar6 = (t) obj;
                if (tVar6 != null) {
                    boolean z21 = tVar6.f27344d;
                    if (!z3) {
                        z9 = false;
                        this.i = false;
                    } else {
                        z9 = false;
                        if (!this.i && (z21 || tVar6.f27347h)) {
                            k1 k1Var4 = this.f27321f;
                            k1Var4.getClass();
                            long j16 = k1Var4.f31771w;
                            long j17 = tVar6.f27343c;
                            float intBitsToFloat = Float.intBitsToFloat((int) (j17 >> 32));
                            float intBitsToFloat2 = Float.intBitsToFloat((int) (j17 & 4294967295L));
                            int i23 = (int) (j16 >> 32);
                            int i24 = (int) (j16 & 4294967295L);
                            if (intBitsToFloat < 0.0f) {
                                z11 = z20;
                            } else {
                                z11 = false;
                            }
                            if (intBitsToFloat > i23) {
                                z12 = z20;
                            } else {
                                z12 = false;
                            }
                            boolean z22 = z12 | z11;
                            if (intBitsToFloat2 < 0.0f) {
                                z13 = z20;
                            } else {
                                z13 = false;
                            }
                            boolean z23 = z22 | z13;
                            if (intBitsToFloat2 > i24) {
                                z14 = z20;
                            } else {
                                z14 = false;
                            }
                            this.i = !(z14 | z23);
                        }
                    }
                    boolean z24 = this.i;
                    boolean z25 = this.f27323h;
                    int i25 = 5;
                    if (z24 != z25 && ((i = kVar3.e) == 3 || i == 4 || i == 5)) {
                        if (z24) {
                            i25 = 4;
                        }
                        kVar3.e = i25;
                    } else {
                        int i26 = kVar3.e;
                        if (i26 == 4 && z25 && !this.f27324j) {
                            kVar3.e = 3;
                        } else if (i26 == 5 && z24 && z21) {
                            kVar3.e = 3;
                        }
                    }
                } else {
                    z9 = false;
                }
                if (!z19 && kVar3.e == 3 && (kVar = this.f27322g) != null) {
                    Object r12 = kVar.f27327a;
                    int size3 = r12.size();
                    Object r52 = kVar3.f27327a;
                    if (size3 == r52.size()) {
                        int size4 = r52.size();
                        for (Object r62 = z9; r62 < size4; r62++) {
                            if (j1.c(((t) r12.get(r62)).f27343c, ((t) r52.get(r62)).f27343c)) {
                            }
                        }
                        z10 = z9;
                        this.f27322g = kVar3;
                        return z10;
                    }
                }
                z10 = z20;
                this.f27322g = kVar3;
                return z10;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List, java.lang.Object] */
    @Override // v1.j
    public final void b(mf mfVar) {
        super.b(mfVar);
        k kVar = this.f27322g;
        if (kVar == null) {
            return;
        }
        this.f27323h = this.i;
        Object r12 = kVar.f27327a;
        int size = ((Collection) r12).size();
        boolean z3 = false;
        for (int i = 0; i < size; i++) {
            t tVar = (t) r12.get(i);
            boolean z9 = tVar.f27344d;
            long j10 = tVar.f27341a;
            boolean a10 = mfVar.a(j10);
            boolean z10 = this.i;
            if ((!z9 && !a10) || (!z9 && !z10)) {
                this.f27320d.c(j10);
            }
        }
        this.i = false;
        if (kVar.e == 5) {
            z3 = true;
        }
        this.f27324j = z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [d1.q] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [d1.q] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [d1.q] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [t0.e] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [t0.e] */
    public final void c() {
        t0.e eVar = this.f27325a;
        Object[] objArr = eVar.f25617u;
        int i = eVar.f25619w;
        for (int i10 = 0; i10 < i; i10++) {
            ((i) objArr[i10]).c();
        }
        b2.k kVar = this.f27319c;
        Object r32 = 0;
        while (kVar != 0) {
            if (kVar instanceof a2) {
                ((a2) kVar).O();
            } else if ((kVar.f15690w & 16) != 0 && (kVar instanceof b2.k)) {
                d1.q qVar = kVar.J;
                int i11 = 0;
                kVar = kVar;
                r32 = r32;
                while (qVar != null) {
                    if ((qVar.f15690w & 16) != 0) {
                        i11++;
                        r32 = r32;
                        if (i11 == 1) {
                            kVar = qVar;
                        } else {
                            if (r32 == 0) {
                                r32 = new t0.e(new d1.q[16]);
                            }
                            if (kVar != 0) {
                                r32.b(kVar);
                                kVar = 0;
                            }
                            r32.b(qVar);
                        }
                    }
                    qVar = qVar.f15693z;
                    kVar = kVar;
                    r32 = r32;
                }
                if (i11 == 1) {
                }
            }
            kVar = b2.e(r32);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:6:0x008d A[LOOP:0: B:5:0x008b->B:6:0x008d, LOOP_END] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [d1.q] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [d1.q] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [t0.e] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [t0.e] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(com.google.android.gms.internal.ads.mf r15) {
        /*
            r14 = this;
            q r0 = r14.e
            int r1 = r0.f()
            r2 = 0
            r3 = 0
            if (r1 != 0) goto Ld
        La:
            r9 = r3
            goto L83
        Ld:
            d1.q r1 = r14.f27319c
            boolean r4 = r1.H
            if (r4 != 0) goto L14
            goto La
        L14:
            v1.k r4 = r14.f27322g
            r4.getClass()
            b2.k1 r5 = r14.f27321f
            r5.getClass()
            long r5 = r5.f31771w
            r7 = r1
            r8 = r2
        L22:
            r9 = 1
            if (r7 == 0) goto L6c
            boolean r10 = r7 instanceof b2.a2
            if (r10 == 0) goto L31
            b2.a2 r7 = (b2.a2) r7
            v1.l r9 = v1.l.f27333w
            r7.H(r4, r9, r5)
            goto L67
        L31:
            int r10 = r7.f15690w
            r11 = 16
            r10 = r10 & r11
            if (r10 == 0) goto L67
            boolean r10 = r7 instanceof b2.k
            if (r10 == 0) goto L67
            r10 = r7
            b2.k r10 = (b2.k) r10
            d1.q r10 = r10.J
            r12 = r3
        L42:
            if (r10 == 0) goto L64
            int r13 = r10.f15690w
            r13 = r13 & r11
            if (r13 == 0) goto L61
            int r12 = r12 + 1
            if (r12 != r9) goto L4f
            r7 = r10
            goto L61
        L4f:
            if (r8 != 0) goto L58
            t0.e r8 = new t0.e
            d1.q[] r13 = new d1.q[r11]
            r8.<init>(r13)
        L58:
            if (r7 == 0) goto L5e
            r8.b(r7)
            r7 = r2
        L5e:
            r8.b(r10)
        L61:
            d1.q r10 = r10.f15693z
            goto L42
        L64:
            if (r12 != r9) goto L67
            goto L22
        L67:
            d1.q r7 = b2.e(r8)
            goto L22
        L6c:
            boolean r1 = r1.H
            if (r1 == 0) goto L83
            t0.e r1 = r14.f27325a
            java.lang.Object[] r4 = r1.f25617u
            int r1 = r1.f25619w
            r5 = r3
        L77:
            if (r5 >= r1) goto L83
            r6 = r4[r5]
            v1.i r6 = (v1.i) r6
            r6.d(r15)
            int r5 = r5 + 1
            goto L77
        L83:
            r14.b(r15)
            int r15 = r0.f20927x
            java.lang.Object[] r1 = r0.f20926w
            r4 = r3
        L8b:
            if (r4 >= r15) goto L92
            r1[r4] = r2
            int r4 = r4 + 1
            goto L8b
        L92:
            r0.f20927x = r3
            r0.f20924u = r3
            r14.f27321f = r2
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: v1.i.d(com.google.android.gms.internal.ads.mf):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [d1.q] */
    /* JADX WARN: Type inference failed for: r0v3, types: [d1.q] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [d1.q] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [t0.e] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [t0.e] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [d1.q] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [d1.q] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10, types: [t0.e] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [t0.e] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final boolean e(mf mfVar, boolean z3) {
        if (this.e.f() == 0) {
            return false;
        }
        b2.k kVar = this.f27319c;
        if (!kVar.H) {
            return false;
        }
        k kVar2 = this.f27322g;
        kVar2.getClass();
        k1 k1Var = this.f27321f;
        k1Var.getClass();
        long j10 = k1Var.f31771w;
        b2.k kVar3 = kVar;
        Object r72 = 0;
        while (kVar3 != 0) {
            if (kVar3 instanceof a2) {
                ((a2) kVar3).H(kVar2, l.f27331u, j10);
            } else if ((kVar3.f15690w & 16) != 0 && (kVar3 instanceof b2.k)) {
                d1.q qVar = kVar3.J;
                int i = 0;
                kVar3 = kVar3;
                r72 = r72;
                while (qVar != null) {
                    if ((qVar.f15690w & 16) != 0) {
                        i++;
                        r72 = r72;
                        if (i == 1) {
                            kVar3 = qVar;
                        } else {
                            if (r72 == 0) {
                                r72 = new t0.e(new d1.q[16]);
                            }
                            if (kVar3 != 0) {
                                r72.b(kVar3);
                                kVar3 = 0;
                            }
                            r72.b(qVar);
                        }
                    }
                    qVar = qVar.f15693z;
                    kVar3 = kVar3;
                    r72 = r72;
                }
                if (i == 1) {
                }
            }
            kVar3 = b2.e(r72);
        }
        if (kVar.H) {
            t0.e eVar = this.f27325a;
            Object[] objArr = eVar.f25617u;
            int i10 = eVar.f25619w;
            for (int i11 = 0; i11 < i10; i11++) {
                i iVar = (i) objArr[i11];
                this.f27321f.getClass();
                iVar.e(mfVar, z3);
            }
        }
        if (kVar.H) {
            Object r14 = 0;
            while (kVar != 0) {
                if (kVar instanceof a2) {
                    ((a2) kVar).H(kVar2, l.f27332v, j10);
                } else if ((kVar.f15690w & 16) != 0 && (kVar instanceof b2.k)) {
                    d1.q qVar2 = kVar.J;
                    int i12 = 0;
                    kVar = kVar;
                    r14 = r14;
                    while (qVar2 != null) {
                        if ((qVar2.f15690w & 16) != 0) {
                            i12++;
                            r14 = r14;
                            if (i12 == 1) {
                                kVar = qVar2;
                            } else {
                                if (r14 == 0) {
                                    r14 = new t0.e(new d1.q[16]);
                                }
                                if (kVar != 0) {
                                    r14.b(kVar);
                                    kVar = 0;
                                }
                                r14.b(qVar2);
                            }
                        }
                        qVar2 = qVar2.f15693z;
                        kVar = kVar;
                        r14 = r14;
                    }
                    if (i12 == 1) {
                    }
                }
                kVar = b2.e(r14);
            }
        }
        return true;
    }

    public final void f(long j10, d0 d0Var) {
        yg0 yg0Var = this.f27320d;
        if (yg0Var.b(j10) && d0Var.f(this) < 0) {
            yg0Var.c(j10);
            this.e.e(j10);
        }
        t0.e eVar = this.f27325a;
        Object[] objArr = eVar.f25617u;
        int i = eVar.f25619w;
        for (int i10 = 0; i10 < i; i10++) {
            ((i) objArr[i10]).f(j10, d0Var);
        }
    }

    public final String toString() {
        return "Node(modifierNode=" + this.f27319c + ", children=" + this.f27325a + ", pointerIds=" + this.f27320d + ')';
    }
}