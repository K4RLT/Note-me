package w0;
import l.a;

import java.util.Arrays;
import r0.n1;
import wa.b9;
import ya.dd;

/* loaded from: classes.dex */
public final class k {
    public static final k e = new k(0, 0, new Object[0], null);

    /* renamed from: a, reason: collision with root package name */
    public int f27679a;

    /* renamed from: b, reason: collision with root package name */
    public int f27680b;

    /* renamed from: c, reason: collision with root package name */
    public final y0.b f27681c;

    /* renamed from: d, reason: collision with root package name */
    public Object[] f27682d;

    public k(int i, int i10, Object[] objArr, y0.b bVar) {
        this.f27679a = i;
        this.f27680b = i10;
        this.f27681c = bVar;
        this.f27682d = objArr;
    }

    public static k j(int i, Object obj, Object obj2, int i10, Object obj3, Object obj4, int i11, y0.b bVar) {
        Object[] objArr;
        if (i11 > 30) {
            return new k(0, 0, new Object[]{obj, obj2, obj3, obj4}, bVar);
        }
        int d2 = dd.d(i, i11);
        int d10 = dd.d(i10, i11);
        if (d2 != d10) {
            if (d2 < d10) {
                objArr = new Object[]{obj, obj2, obj3, obj4};
            } else {
                objArr = new Object[]{obj3, obj4, obj, obj2};
            }
            return new k((1 << d2) | (1 << d10), 0, objArr, bVar);
        }
        return new k(0, 1 << d2, new Object[]{j(i, obj, obj2, i10, obj3, obj4, i11 + 5, bVar)}, bVar);
    }

    public final Object[] a(int i, int i10, int i11, Object obj, Object obj2, int i12, y0.b bVar) {
        int i13;
        Object obj3 = this.f27682d[i];
        if (obj3 != null) {
            i13 = obj3.hashCode();
        } else {
            i13 = 0;
        }
        k j10 = j(i13, obj3, x(i), i11, obj, obj2, i12 + 5, bVar);
        int t3 = t(i10);
        int i14 = t3 + 1;
        Object[] objArr = this.f27682d;
        Object[] objArr2 = new Object[objArr.length - 1];
        qe.k.g(0, i, 6, objArr, objArr2);
        qe.k.d(i, i + 2, i14, objArr, objArr2);
        objArr2[t3 - 1] = j10;
        qe.k.d(t3, i14, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public final int b() {
        if (this.f27680b == 0) {
            return this.f27682d.length / 2;
        }
        int bitCount = Integer.bitCount(this.f27679a);
        int length = this.f27682d.length;
        for (int i = bitCount * 2; i < length; i++) {
            bitCount += s(i).b();
        }
        return bitCount;
    }

    public final boolean c(Object obj) {
        jf.b h3 = b9.h(b9.i(0, this.f27682d.length), 2);
        int i = h3.f19189u;
        int i10 = h3.f19190v;
        int i11 = h3.f19191w;
        if ((i11 > 0 && i <= i10) || (i11 < 0 && i10 <= i)) {
            while (!kotlin.jvm.internal.a(obj, this.f27682d[i])) {
                if (i != i10) {
                    i += i11;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(int i, Object obj, int i10) {
        int d2 = 1 << dd.d(i, i10);
        if (h(d2)) {
            return kotlin.jvm.internal.a(obj, this.f27682d[f(d2)]);
        }
        if (i(d2)) {
            k s10 = s(t(d2));
            if (i10 == 30) {
                return s10.c(obj);
            }
            return s10.d(i, obj, i10 + 5);
        }
        return false;
    }

    public final boolean e(k kVar) {
        if (this != kVar) {
            if (this.f27680b == kVar.f27680b && this.f27679a == kVar.f27679a) {
                int length = this.f27682d.length;
                for (int i = 0; i < length; i++) {
                    if (this.f27682d[i] == kVar.f27682d[i]) {
                    }
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int f(int i) {
        return Integer.bitCount((i - 1) & this.f27679a) * 2;
    }

    public final Object g(int i, Object obj, int i10) {
        int d2 = 1 << dd.d(i, i10);
        if (h(d2)) {
            int f10 = f(d2);
            if (kotlin.jvm.internal.a(obj, this.f27682d[f10])) {
                return x(f10);
            }
            return null;
        }
        if (i(d2)) {
            k s10 = s(t(d2));
            if (i10 == 30) {
                jf.b h3 = b9.h(b9.i(0, s10.f27682d.length), 2);
                int i11 = h3.f19189u;
                int i12 = h3.f19190v;
                int i13 = h3.f19191w;
                if ((i13 > 0 && i11 <= i12) || (i13 < 0 && i12 <= i11)) {
                    while (!kotlin.jvm.internal.a(obj, s10.f27682d[i11])) {
                        if (i11 != i12) {
                            i11 += i13;
                        } else {
                            return null;
                        }
                    }
                    return s10.x(i11);
                }
                return null;
            }
            return s10.g(i, obj, i10 + 5);
        }
        return null;
    }

    public final boolean h(int i) {
        if ((i & this.f27679a) != 0) {
            return true;
        }
        return false;
    }

    public final boolean i(int i) {
        if ((i & this.f27680b) != 0) {
            return true;
        }
        return false;
    }

    public final k k(int i, d dVar) {
        dVar.c(dVar.f27670z - 1);
        dVar.f27668x = x(i);
        Object[] objArr = this.f27682d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f27681c == dVar.f27666v) {
            this.f27682d = dd.b(objArr, i);
            return this;
        }
        return new k(0, 0, dd.b(objArr, i), dVar.f27666v);
    }

    public final k l(int i, Object obj, Object obj2, int i10, d dVar) {
        d dVar2;
        k l10;
        int d2 = 1 << dd.d(i, i10);
        boolean h3 = h(d2);
        y0.b bVar = this.f27681c;
        if (h3) {
            int f10 = f(d2);
            if (kotlin.jvm.internal.a(obj, this.f27682d[f10])) {
                dVar.f27668x = x(f10);
                if (x(f10) == obj2) {
                    return this;
                }
                if (bVar == dVar.f27666v) {
                    this.f27682d[f10 + 1] = obj2;
                    return this;
                }
                dVar.f27669y++;
                Object[] objArr = this.f27682d;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                copyOf[f10 + 1] = obj2;
                return new k(this.f27679a, this.f27680b, copyOf, dVar.f27666v);
            }
            dVar.c(dVar.f27670z + 1);
            y0.b bVar2 = dVar.f27666v;
            if (bVar == bVar2) {
                this.f27682d = a(f10, d2, i, obj, obj2, i10, bVar2);
                this.f27679a ^= d2;
                this.f27680b |= d2;
                return this;
            }
            return new k(this.f27679a ^ d2, this.f27680b | d2, a(f10, d2, i, obj, obj2, i10, bVar2), bVar2);
        }
        if (i(d2)) {
            int t3 = t(d2);
            k s10 = s(t3);
            if (i10 == 30) {
                jf.b h10 = b9.h(b9.i(0, s10.f27682d.length), 2);
                int i11 = h10.f19189u;
                int i12 = h10.f19190v;
                int i13 = h10.f19191w;
                if ((i13 > 0 && i11 <= i12) || (i13 < 0 && i12 <= i11)) {
                    while (!kotlin.jvm.internal.a(obj, s10.f27682d[i11])) {
                        if (i11 != i12) {
                            i11 += i13;
                        }
                    }
                    dVar.f27668x = s10.x(i11);
                    if (s10.f27681c == dVar.f27666v) {
                        s10.f27682d[i11 + 1] = obj2;
                        l10 = s10;
                    } else {
                        dVar.f27669y++;
                        Object[] objArr2 = s10.f27682d;
                        Object[] copyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                        copyOf2[i11 + 1] = obj2;
                        l10 = new k(0, 0, copyOf2, dVar.f27666v);
                    }
                    dVar2 = dVar;
                }
                dVar.c(dVar.f27670z + 1);
                l10 = new k(0, 0, dd.a(s10.f27682d, 0, obj, obj2), dVar.f27666v);
                dVar2 = dVar;
            } else {
                dVar2 = dVar;
                l10 = s10.l(i, obj, obj2, i10 + 5, dVar2);
            }
            if (s10 == l10) {
                return this;
            }
            return r(t3, l10, dVar2.f27666v);
        }
        dVar.c(dVar.f27670z + 1);
        y0.b bVar3 = dVar.f27666v;
        int f11 = f(d2);
        Object[] objArr3 = this.f27682d;
        if (bVar == bVar3) {
            this.f27682d = dd.a(objArr3, f11, obj, obj2);
            this.f27679a |= d2;
            return this;
        }
        return new k(this.f27679a | d2, this.f27680b, dd.a(objArr3, f11, obj, obj2), bVar3);
    }

    public final k m(k kVar, int i, y0.a aVar, d dVar) {
        k kVar2;
        Object[] objArr;
        int i10;
        int i11;
        k j10;
        int i12;
        int i13;
        int i14;
        if (this == kVar) {
            aVar.f30795a += b();
            return this;
        }
        int i15 = 0;
        if (i > 30) {
            y0.b bVar = dVar.f27666v;
            int i16 = kVar.f27680b;
            Object[] objArr2 = this.f27682d;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length + kVar.f27682d.length);
            int length = this.f27682d.length;
            jf.b h3 = b9.h(b9.i(0, kVar.f27682d.length), 2);
            int i17 = h3.f19189u;
            int i18 = h3.f19190v;
            int i19 = h3.f19191w;
            if ((i19 > 0 && i17 <= i18) || (i19 < 0 && i18 <= i17)) {
                while (true) {
                    if (!c(kVar.f27682d[i17])) {
                        Object[] objArr3 = kVar.f27682d;
                        copyOf[length] = objArr3[i17];
                        copyOf[length + 1] = objArr3[i17 + 1];
                        length += 2;
                    } else {
                        aVar.f30795a++;
                    }
                    if (i17 == i18) {
                        break;
                    }
                    i17 += i19;
                }
            }
            if (length != this.f27682d.length) {
                if (length == kVar.f27682d.length) {
                    return kVar;
                }
                if (length == copyOf.length) {
                    return new k(0, 0, copyOf, bVar);
                }
                return new k(0, 0, Arrays.copyOf(copyOf, length), bVar);
            }
        } else {
            int i20 = this.f27680b | kVar.f27680b;
            int i21 = this.f27679a;
            int i22 = kVar.f27679a;
            int i23 = (i21 ^ i22) & (~i20);
            int i24 = i21 & i22;
            int i25 = i23;
            while (i24 != 0) {
                int lowestOneBit = Integer.lowestOneBit(i24);
                if (kotlin.jvm.internal.a(this.f27682d[f(lowestOneBit)], kVar.f27682d[kVar.f(lowestOneBit)])) {
                    i25 |= lowestOneBit;
                } else {
                    i20 |= lowestOneBit;
                }
                i24 ^= lowestOneBit;
            }
            if ((i20 & i25) != 0) {
                n1.b("Check failed.");
            }
            if (kotlin.jvm.internal.a(this.f27681c, dVar.f27666v) && this.f27679a == i25 && this.f27680b == i20) {
                kVar2 = this;
            } else {
                kVar2 = new k(i25, i20, new Object[Integer.bitCount(i20) + (Integer.bitCount(i25) * 2)], null);
            }
            int i26 = i20;
            int i27 = 0;
            while (i26 != 0) {
                int lowestOneBit2 = Integer.lowestOneBit(i26);
                Object[] objArr4 = kVar2.f27682d;
                int length2 = (objArr4.length - 1) - i27;
                if (i(lowestOneBit2)) {
                    j10 = s(t(lowestOneBit2));
                    if (kVar.i(lowestOneBit2)) {
                        j10 = j10.m(kVar.s(kVar.t(lowestOneBit2)), i + 5, aVar, dVar);
                        objArr = objArr4;
                    } else if (kVar.h(lowestOneBit2)) {
                        int f10 = kVar.f(lowestOneBit2);
                        Object obj = kVar.f27682d[f10];
                        Object x9 = kVar.x(f10);
                        int i28 = dVar.f27670z;
                        if (obj != null) {
                            i14 = obj.hashCode();
                        } else {
                            i14 = i15;
                        }
                        int i29 = i14;
                        objArr = objArr4;
                        j10 = j10.l(i29, obj, x9, i + 5, dVar);
                        if (dVar.f27670z == i28) {
                            aVar.f30795a++;
                        }
                    } else {
                        objArr = objArr4;
                    }
                } else {
                    objArr = objArr4;
                    if (kVar.i(lowestOneBit2)) {
                        k s10 = kVar.s(kVar.t(lowestOneBit2));
                        if (h(lowestOneBit2)) {
                            int f11 = f(lowestOneBit2);
                            Object obj2 = this.f27682d[f11];
                            if (obj2 != null) {
                                i12 = obj2.hashCode();
                            } else {
                                i12 = 0;
                            }
                            int i30 = i + 5;
                            if (s10.d(i12, obj2, i30)) {
                                aVar.f30795a++;
                            } else {
                                Object x10 = x(f11);
                                if (obj2 != null) {
                                    i13 = obj2.hashCode();
                                } else {
                                    i13 = 0;
                                }
                                j10 = s10.l(i13, obj2, x10, i30, dVar);
                            }
                        }
                        j10 = s10;
                    } else {
                        int f12 = f(lowestOneBit2);
                        Object obj3 = this.f27682d[f12];
                        Object x11 = x(f12);
                        int f13 = kVar.f(lowestOneBit2);
                        Object obj4 = kVar.f27682d[f13];
                        Object x12 = kVar.x(f13);
                        if (obj3 != null) {
                            i10 = obj3.hashCode();
                        } else {
                            i10 = 0;
                        }
                        if (obj4 != null) {
                            i11 = obj4.hashCode();
                        } else {
                            i11 = 0;
                        }
                        j10 = j(i10, obj3, x11, i11, obj4, x12, i + 5, dVar.f27666v);
                    }
                }
                objArr[length2] = j10;
                i27++;
                i26 ^= lowestOneBit2;
                i15 = 0;
            }
            int i31 = 0;
            while (i25 != 0) {
                int lowestOneBit3 = Integer.lowestOneBit(i25);
                int i32 = i31 * 2;
                if (!kVar.h(lowestOneBit3)) {
                    int f14 = f(lowestOneBit3);
                    Object[] objArr5 = kVar2.f27682d;
                    objArr5[i32] = this.f27682d[f14];
                    objArr5[i32 + 1] = x(f14);
                } else {
                    int f15 = kVar.f(lowestOneBit3);
                    Object[] objArr6 = kVar2.f27682d;
                    objArr6[i32] = kVar.f27682d[f15];
                    objArr6[i32 + 1] = kVar.x(f15);
                    if (h(lowestOneBit3)) {
                        aVar.f30795a++;
                    }
                }
                i31++;
                i25 ^= lowestOneBit3;
            }
            if (!e(kVar2)) {
                if (kVar.e(kVar2)) {
                    return kVar;
                }
                return kVar2;
            }
        }
        return this;
    }

    public final k n(int i, Object obj, int i10, d dVar) {
        k n10;
        int d2 = 1 << dd.d(i, i10);
        if (h(d2)) {
            int f10 = f(d2);
            if (kotlin.jvm.internal.a(obj, this.f27682d[f10])) {
                return p(f10, d2, dVar);
            }
        } else if (i(d2)) {
            int t3 = t(d2);
            k s10 = s(t3);
            if (i10 == 30) {
                jf.b h3 = b9.h(b9.i(0, s10.f27682d.length), 2);
                int i11 = h3.f19189u;
                int i12 = h3.f19190v;
                int i13 = h3.f19191w;
                if ((i13 > 0 && i11 <= i12) || (i13 < 0 && i12 <= i11)) {
                    while (!kotlin.jvm.internal.a(obj, s10.f27682d[i11])) {
                        if (i11 != i12) {
                            i11 += i13;
                        }
                    }
                    n10 = s10.k(i11, dVar);
                }
                n10 = s10;
                break;
            }
            n10 = s10.n(i, obj, i10 + 5, dVar);
            return q(s10, n10, t3, d2, dVar.f27666v);
        }
        return this;
    }

    public final k o(int i, Object obj, Object obj2, int i10, d dVar) {
        k kVar;
        k o10;
        int d2 = 1 << dd.d(i, i10);
        if (h(d2)) {
            int f10 = f(d2);
            if (kotlin.jvm.internal.a(obj, this.f27682d[f10]) && kotlin.jvm.internal.a(obj2, x(f10))) {
                return p(f10, d2, dVar);
            }
        } else if (i(d2)) {
            int t3 = t(d2);
            k s10 = s(t3);
            if (i10 == 30) {
                jf.b h3 = b9.h(b9.i(0, s10.f27682d.length), 2);
                int i11 = h3.f19189u;
                int i12 = h3.f19190v;
                int i13 = h3.f19191w;
                if ((i13 > 0 && i11 <= i12) || (i13 < 0 && i12 <= i11)) {
                    while (true) {
                        if (kotlin.jvm.internal.a(obj, s10.f27682d[i11]) && kotlin.jvm.internal.a(obj2, s10.x(i11))) {
                            o10 = s10.k(i11, dVar);
                            break;
                        }
                        if (i11 == i12) {
                            break;
                        }
                        i11 += i13;
                    }
                    kVar = s10;
                }
                o10 = s10;
                kVar = s10;
            } else {
                kVar = s10;
                o10 = kVar.o(i, obj, obj2, i10 + 5, dVar);
            }
            return q(kVar, o10, t3, d2, dVar.f27666v);
        }
        return this;
    }

    public final k p(int i, int i10, d dVar) {
        dVar.c(dVar.f27670z - 1);
        dVar.f27668x = x(i);
        Object[] objArr = this.f27682d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f27681c == dVar.f27666v) {
            this.f27682d = dd.b(objArr, i);
            this.f27679a ^= i10;
            return this;
        }
        return new k(i10 ^ this.f27679a, this.f27680b, dd.b(objArr, i), dVar.f27666v);
    }

    public final k q(k kVar, k kVar2, int i, int i10, y0.b bVar) {
        y0.b bVar2 = this.f27681c;
        if (kVar2 == null) {
            Object[] objArr = this.f27682d;
            if (objArr.length == 1) {
                return null;
            }
            if (bVar2 == bVar) {
                this.f27682d = dd.c(objArr, i);
                this.f27680b ^= i10;
                return this;
            }
            return new k(this.f27679a, i10 ^ this.f27680b, dd.c(objArr, i), bVar);
        }
        if (bVar2 != bVar && kVar == kVar2) {
            return this;
        }
        return r(i, kVar2, bVar);
    }

    public final k r(int i, k kVar, y0.b bVar) {
        Object[] objArr = this.f27682d;
        if (objArr.length == 1 && kVar.f27682d.length == 2 && kVar.f27680b == 0) {
            kVar.f27679a = this.f27680b;
            return kVar;
        }
        if (this.f27681c == bVar) {
            objArr[i] = kVar;
            return this;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        copyOf[i] = kVar;
        return new k(this.f27679a, this.f27680b, copyOf, bVar);
    }

    public final k s(int i) {
        Object obj = this.f27682d[i];
        obj.getClass();
        return (k) obj;
    }

    public final int t(int i) {
        return (this.f27682d.length - 1) - Integer.bitCount((i - 1) & this.f27680b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00cf, code lost:
    
        if (r14 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00db, code lost:
    
        r14.f4003w = w(r12, r4, (w0.k) r14.f4003w);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e5, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d8, code lost:
    
        if (r14 == null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final c7.x u(int r12, int r13, java.lang.Object r14, java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.k.u(int, int, java.lang.Object, java.lang.Object):c7.x");
    }

    public final k v(int i, Object obj, int i10) {
        k v2;
        int d2 = 1 << dd.d(i, i10);
        if (h(d2)) {
            int f10 = f(d2);
            if (kotlin.jvm.internal.a(obj, this.f27682d[f10])) {
                Object[] objArr = this.f27682d;
                if (objArr.length != 2) {
                    return new k(this.f27679a ^ d2, this.f27680b, dd.b(objArr, f10), null);
                }
                return null;
            }
            return this;
        }
        if (i(d2)) {
            int t3 = t(d2);
            k s10 = s(t3);
            if (i10 == 30) {
                jf.b h3 = b9.h(b9.i(0, s10.f27682d.length), 2);
                int i11 = h3.f19189u;
                int i12 = h3.f19190v;
                int i13 = h3.f19191w;
                if ((i13 > 0 && i11 <= i12) || (i13 < 0 && i12 <= i11)) {
                    while (!kotlin.jvm.internal.a(obj, s10.f27682d[i11])) {
                        if (i11 != i12) {
                            i11 += i13;
                        }
                    }
                    Object[] objArr2 = s10.f27682d;
                    if (objArr2.length == 2) {
                        v2 = null;
                    } else {
                        v2 = new k(0, 0, dd.b(objArr2, i11), null);
                    }
                }
                v2 = s10;
                break;
            }
            v2 = s10.v(i, obj, i10 + 5);
            if (v2 == null) {
                Object[] objArr3 = this.f27682d;
                if (objArr3.length != 1) {
                    return new k(this.f27679a, d2 ^ this.f27680b, dd.c(objArr3, t3), null);
                }
                return null;
            }
            if (s10 != v2) {
                return w(t3, d2, v2);
            }
        }
        return this;
    }

    public final k w(int i, int i10, k kVar) {
        Object[] objArr = kVar.f27682d;
        if (objArr.length == 2 && kVar.f27680b == 0) {
            if (this.f27682d.length == 1) {
                kVar.f27679a = this.f27680b;
                return kVar;
            }
            int f10 = f(i10);
            Object[] objArr2 = this.f27682d;
            Object obj = objArr[0];
            Object obj2 = objArr[1];
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length + 1);
            qe.k.d(i + 2, i + 1, objArr2.length, copyOf, copyOf);
            qe.k.d(f10 + 2, f10, i, copyOf, copyOf);
            copyOf[f10] = obj;
            copyOf[f10 + 1] = obj2;
            return new k(this.f27679a ^ i10, i10 ^ this.f27680b, copyOf, null);
        }
        Object[] objArr3 = this.f27682d;
        Object[] copyOf2 = Arrays.copyOf(objArr3, objArr3.length);
        copyOf2[i] = kVar;
        return new k(this.f27679a, this.f27680b, copyOf2, null);
    }

    public final Object x(int i) {
        return this.f27682d[i + 1];
    }
}
