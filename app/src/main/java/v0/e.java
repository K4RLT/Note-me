package v0;

import b1.s;
import df.l;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import q.x;
import qe.k;
import r0.n1;
import ya.od;
import ya.uc;

/* loaded from: classes.dex */
public final class e extends qe.f implements Collection, ef.b {
    public Object[] A;
    public int B;

    /* renamed from: u, reason: collision with root package name */
    public b f27269u;

    /* renamed from: v, reason: collision with root package name */
    public Object[] f27270v;

    /* renamed from: w, reason: collision with root package name */
    public Object[] f27271w;

    /* renamed from: x, reason: collision with root package name */
    public int f27272x;

    /* renamed from: y, reason: collision with root package name */
    public y0.b f27273y = new Object();

    /* renamed from: z, reason: collision with root package name */
    public Object[] f27274z;

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, y0.b] */
    public e(b bVar, Object[] objArr, Object[] objArr2, int i) {
        this.f27269u = bVar;
        this.f27270v = objArr;
        this.f27271w = objArr2;
        this.f27272x = i;
        this.f27274z = objArr;
        this.A = objArr2;
        this.B = bVar.a();
    }

    public static void k(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    public final Object[] A(Object[] objArr, int i, int i10, Iterator it) {
        boolean z3;
        if (!it.hasNext()) {
            n1.a("invalid buffersIterator");
        }
        if (i10 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            n1.a("negative shift");
        }
        if (i10 == 0) {
            return (Object[]) it.next();
        }
        Object[] t3 = t(objArr);
        int a10 = uc.a(i, i10);
        int i11 = i10 - 5;
        t3[a10] = A((Object[]) t3[a10], i, i11, it);
        while (true) {
            a10++;
            if (a10 >= 32 || !it.hasNext()) {
                break;
            }
            t3[a10] = A((Object[]) t3[a10], 0, i11, it);
        }
        return t3;
    }

    public final Object[] C(Object[] objArr, int i, Object[][] objArr2) {
        Object[] t3;
        cg.f fVar = new cg.f(objArr2);
        int i10 = i >> 5;
        int i11 = this.f27272x;
        if (i10 < (1 << i11)) {
            t3 = A(objArr, i, i11, fVar);
        } else {
            t3 = t(objArr);
        }
        while (fVar.hasNext()) {
            this.f27272x += 5;
            t3 = w(t3);
            int i12 = this.f27272x;
            A(t3, 1 << i12, i12, fVar);
        }
        return t3;
    }

    public final void D(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.B;
        int i10 = i >> 5;
        int i11 = this.f27272x;
        if (i10 > (1 << i11)) {
            this.f27274z = E(this.f27272x + 5, w(objArr), objArr2);
            this.A = objArr3;
            this.f27272x += 5;
            this.B++;
            return;
        }
        if (objArr == null) {
            this.f27274z = objArr2;
            this.A = objArr3;
            this.B = i + 1;
        } else {
            this.f27274z = E(i11, objArr, objArr2);
            this.A = objArr3;
            this.B++;
        }
    }

    public final Object[] E(int i, Object[] objArr, Object[] objArr2) {
        int a10 = uc.a(a() - 1, i);
        Object[] t3 = t(objArr);
        if (i == 5) {
            t3[a10] = objArr2;
            return t3;
        }
        t3[a10] = E(i - 5, (Object[]) t3[a10], objArr2);
        return t3;
    }

    public final int F(l lVar, Object[] objArr, int i, int i10, p8.c cVar, ArrayList arrayList, ArrayList arrayList2) {
        Object[] v2;
        if (r(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = cVar.f22619u;
        obj.getClass();
        Object[] objArr2 = (Object[]) obj;
        Object[] objArr3 = objArr2;
        for (int i11 = 0; i11 < i; i11++) {
            Object obj2 = objArr[i11];
            if (!((Boolean) lVar.invoke(obj2)).booleanValue()) {
                if (i10 == 32) {
                    if (!arrayList.isEmpty()) {
                        v2 = (Object[]) arrayList.remove(arrayList.size() - 1);
                    } else {
                        v2 = v();
                    }
                    objArr3 = v2;
                    i10 = 0;
                }
                objArr3[i10] = obj2;
                i10++;
            }
        }
        cVar.f22619u = objArr3;
        if (objArr2 != objArr3) {
            arrayList2.add(objArr2);
        }
        return i10;
    }

    public final int G(l lVar, Object[] objArr, int i, p8.c cVar) {
        Object[] objArr2 = objArr;
        int i10 = i;
        boolean z3 = false;
        for (int i11 = 0; i11 < i; i11++) {
            Object obj = objArr[i11];
            if (((Boolean) lVar.invoke(obj)).booleanValue()) {
                if (!z3) {
                    objArr2 = t(objArr);
                    z3 = true;
                    i10 = i11;
                }
            } else if (z3) {
                objArr2[i10] = obj;
                i10++;
            }
        }
        cVar.f22619u = objArr2;
        return i10;
    }

    public final int H(l lVar, int i, p8.c cVar) {
        int G = G(lVar, this.A, i, cVar);
        Object obj = cVar.f22619u;
        if (G == i) {
            return i;
        }
        obj.getClass();
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, G, i, (Object) null);
        this.A = objArr;
        this.B -= i - G;
        return G;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        if (r0 != r8) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (H(r1, r8, r5) != r8) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean I(df.l r16) {
        /*
            r15 = this;
            r1 = r16
            int r8 = r15.O()
            p8.c r5 = new p8.c
            r9 = 0
            r5.<init>(r9)
            java.lang.Object[] r0 = r15.f27274z
            r10 = 0
            r11 = 1
            if (r0 != 0) goto L1b
            int r0 = r15.H(r1, r8, r5)
            if (r0 == r8) goto Ld1
        L18:
            r10 = r11
            goto Ld1
        L1b:
            v0.a r12 = r15.s(r10)
            r13 = 32
            r0 = r13
        L22:
            if (r0 != r13) goto L35
            boolean r2 = r12.hasNext()
            if (r2 == 0) goto L35
            java.lang.Object r0 = r12.next()
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            int r0 = r15.G(r1, r0, r13, r5)
            goto L22
        L35:
            if (r0 != r13) goto L49
            int r0 = r15.H(r1, r8, r5)
            if (r0 != 0) goto L46
            java.lang.Object[] r1 = r15.f27274z
            int r2 = r15.B
            int r3 = r15.f27272x
            r15.z(r1, r2, r3)
        L46:
            if (r0 == r8) goto Ld1
            goto L18
        L49:
            int r2 = r12.f27261u
            int r2 = r2 - r11
            int r14 = r2 << 5
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r4 = r0
        L59:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L70
            java.lang.Object r0 = r12.next()
            r2 = r0
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            r3 = 32
            r0 = r15
            int r4 = r0.F(r1, r2, r3, r4, r5, r6, r7)
            r1 = r16
            goto L59
        L70:
            java.lang.Object[] r2 = r15.A
            r0 = r15
            r1 = r16
            r3 = r8
            int r1 = r0.F(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r2 = r5.f22619u
            r2.getClass()
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            java.util.Arrays.fill(r2, r1, r13, r9)
            boolean r3 = r7.isEmpty()
            java.lang.Object[] r4 = r15.f27274z
            if (r3 == 0) goto L90
            r4.getClass()
            goto L9a
        L90:
            int r3 = r15.f27272x
            java.util.Iterator r5 = r7.iterator()
            java.lang.Object[] r4 = r15.A(r4, r14, r3, r5)
        L9a:
            int r3 = r7.size()
            int r3 = r3 << 5
            int r14 = r14 + r3
            r3 = r14 & 31
            if (r3 != 0) goto La6
            goto Lab
        La6:
            java.lang.String r3 = "invalid size"
            r0.n1.a(r3)
        Lab:
            if (r14 != 0) goto Lb0
            r15.f27272x = r10
            goto Lc8
        Lb0:
            int r3 = r14 + (-1)
        Lb2:
            int r5 = r15.f27272x
            int r6 = r3 >> r5
            if (r6 != 0) goto Lc4
            int r5 = r5 + (-5)
            r15.f27272x = r5
            r4 = r4[r10]
            r4.getClass()
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            goto Lb2
        Lc4:
            java.lang.Object[] r9 = r15.x(r4, r3, r5)
        Lc8:
            r15.f27274z = r9
            r15.A = r2
            int r14 = r14 + r1
            r15.B = r14
            goto L18
        Ld1:
            if (r10 == 0) goto Ld8
            int r1 = r15.modCount
            int r1 = r1 + r11
            r15.modCount = r1
        Ld8:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.e.I(df.l):boolean");
    }

    public final Object[] J(Object[] objArr, int i, int i10, p8.c cVar) {
        int a10 = uc.a(i10, i);
        int i11 = 31;
        if (i == 0) {
            Object obj = objArr[a10];
            Object[] t3 = t(objArr);
            k.d(a10, a10 + 1, 32, objArr, t3);
            t3[31] = cVar.f22619u;
            cVar.f22619u = obj;
            return t3;
        }
        if (objArr[31] == null) {
            i11 = uc.a(L() - 1, i);
        }
        Object[] t10 = t(objArr);
        int i12 = i - 5;
        int i13 = a10 + 1;
        if (i13 <= i11) {
            while (true) {
                Object obj2 = t10[i11];
                obj2.getClass();
                t10[i11] = J((Object[]) obj2, i12, 0, cVar);
                if (i11 == i13) {
                    break;
                }
                i11--;
            }
        }
        Object obj3 = t10[a10];
        obj3.getClass();
        t10[a10] = J((Object[]) obj3, i12, i10, cVar);
        return t10;
    }

    public final Object K(Object[] objArr, int i, int i10, int i11) {
        int i12 = this.B - i;
        Object[] objArr2 = this.A;
        if (i12 == 1) {
            Object obj = objArr2[0];
            z(objArr, i, i10);
            return obj;
        }
        Object obj2 = objArr2[i11];
        Object[] t3 = t(objArr2);
        k.d(i11, i11 + 1, i12, objArr2, t3);
        t3[i12 - 1] = null;
        this.f27274z = objArr;
        this.A = t3;
        this.B = (i + i12) - 1;
        this.f27272x = i10;
        return obj2;
    }

    public final int L() {
        int i = this.B;
        if (i <= 32) {
            return 0;
        }
        return (i - 1) & (-32);
    }

    public final Object[] M(Object[] objArr, int i, int i10, Object obj, p8.c cVar) {
        int a10 = uc.a(i10, i);
        Object[] t3 = t(objArr);
        if (i == 0) {
            if (t3 != objArr) {
                ((AbstractList) this).modCount++;
            }
            cVar.f22619u = t3[a10];
            t3[a10] = obj;
            return t3;
        }
        Object obj2 = t3[a10];
        obj2.getClass();
        t3[a10] = M((Object[]) obj2, i - 5, i10, obj, cVar);
        return t3;
    }

    public final void N(Collection collection, int i, Object[] objArr, int i10, Object[][] objArr2, int i11, Object[] objArr3) {
        Object[] v2;
        if (i11 < 1) {
            n1.a("requires at least one nullBuffer");
        }
        Object[] t3 = t(objArr);
        objArr2[0] = t3;
        int i12 = i & 31;
        int size = ((collection.size() + i) - 1) & 31;
        int i13 = (i10 - i12) + size;
        if (i13 < 32) {
            k.d(size + 1, i12, i10, t3, objArr3);
        } else {
            int i14 = i13 - 31;
            if (i11 == 1) {
                v2 = t3;
            } else {
                v2 = v();
                i11--;
                objArr2[i11] = v2;
            }
            int i15 = i10 - i14;
            k.d(0, i15, i10, t3, objArr3);
            k.d(size + 1, i12, i15, t3, v2);
            objArr3 = v2;
        }
        Iterator it = collection.iterator();
        k(t3, i12, it);
        for (int i16 = 1; i16 < i11; i16++) {
            Object[] v4 = v();
            k(v4, 0, it);
            objArr2[i16] = v4;
        }
        k(objArr3, 0, it);
    }

    public final int O() {
        int i = this.B;
        if (i <= 32) {
            return i;
        }
        return i - ((i - 1) & (-32));
    }

    @Override // qe.f
    public final int a() {
        return this.B;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        od.b(i, a());
        if (i == a()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int L = L();
        if (i >= L) {
            q(i - L, obj, this.f27274z);
            return;
        }
        p8.c cVar = new p8.c(null);
        Object[] objArr = this.f27274z;
        objArr.getClass();
        q(0, cVar.f22619u, p(objArr, this.f27272x, i, obj, cVar));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        Collection collection2;
        e eVar;
        Object[] v2;
        od.b(i, this.B);
        if (i == this.B) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i10 = (i >> 5) << 5;
        int size = ((collection.size() + (this.B - i10)) - 1) / 32;
        if (size == 0) {
            int i11 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            Object[] objArr = this.A;
            Object[] t3 = t(objArr);
            k.d(size2 + 1, i11, O(), objArr, t3);
            k(t3, i11, collection.iterator());
            this.A = t3;
            this.B = collection.size() + this.B;
            return true;
        }
        Object[][] objArr2 = new Object[size];
        int O = O();
        int size3 = collection.size() + this.B;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= L()) {
            v2 = v();
            collection2 = collection;
            N(collection2, i, this.A, O, objArr2, size, v2);
            eVar = this;
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            eVar = this;
            Object[] objArr3 = eVar.A;
            if (size3 > O) {
                int i12 = size3 - O;
                Object[] u9 = u(objArr3, i12);
                eVar.o(collection2, i, i12, objArr2, size, u9);
                objArr2 = objArr2;
                v2 = u9;
            } else {
                v2 = v();
                int i13 = O - size3;
                k.d(0, i13, O, objArr3, v2);
                int i14 = 32 - i13;
                Object[] u10 = u(eVar.A, i14);
                int i15 = size - 1;
                objArr2[i15] = u10;
                eVar.o(collection2, i, i14, objArr2, i15, u10);
                collection2 = collection2;
            }
        }
        eVar.f27274z = C(eVar.f27274z, i10, objArr2);
        eVar.A = v2;
        eVar.B = collection2.size() + eVar.B;
        return true;
    }

    @Override // qe.f
    public final Object b(int i) {
        od.a(i, a());
        ((AbstractList) this).modCount++;
        int L = L();
        if (i >= L) {
            return K(this.f27274z, L, this.f27272x, i - L);
        }
        p8.c cVar = new p8.c(this.A[0]);
        Object[] objArr = this.f27274z;
        objArr.getClass();
        K(J(objArr, this.f27272x, i, cVar), L, this.f27272x, 0);
        return cVar.f22619u;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, y0.b] */
    public final b g() {
        b dVar;
        Object[] objArr = this.f27274z;
        if (objArr == this.f27270v && this.A == this.f27271w) {
            dVar = this.f27269u;
        } else {
            this.f27273y = new Object();
            this.f27270v = objArr;
            Object[] objArr2 = this.A;
            this.f27271w = objArr2;
            if (objArr == null) {
                if (objArr2.length == 0) {
                    dVar = h.f27281v;
                } else {
                    dVar = new h(Arrays.copyOf(objArr2, this.B));
                }
            } else {
                dVar = new d(objArr, objArr2, this.B, this.f27272x);
            }
        }
        this.f27269u = dVar;
        return dVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        od.a(i, a());
        if (L() <= i) {
            objArr = this.A;
        } else {
            objArr = this.f27274z;
            objArr.getClass();
            for (int i10 = this.f27272x; i10 > 0; i10 -= 5) {
                Object obj = objArr[uc.a(i, i10)];
                obj.getClass();
                objArr = (Object[]) obj;
            }
        }
        return objArr[i & 31];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        od.b(i, this.B);
        return new g(this, i);
    }

    public final int n() {
        return ((AbstractList) this).modCount;
    }

    public final void o(Collection collection, int i, int i10, Object[][] objArr, int i11, Object[] objArr2) {
        if (this.f27274z != null) {
            int i12 = i >> 5;
            a s10 = s(L() >> 5);
            int i13 = i11;
            Object[] objArr3 = objArr2;
            while (s10.f27261u - 1 != i12) {
                Object[] objArr4 = (Object[]) s10.previous();
                k.d(0, 32 - i10, 32, objArr4, objArr3);
                objArr3 = u(objArr4, i10);
                i13--;
                objArr[i13] = objArr3;
            }
            Object[] objArr5 = (Object[]) s10.previous();
            int L = i11 - (((L() >> 5) - 1) - i12);
            if (L < i11) {
                objArr2 = objArr[L];
                objArr2.getClass();
            }
            N(collection, i, objArr5, 32, objArr, L, objArr2);
            return;
        }
        x.o("root is null");
    }

    public final Object[] p(Object[] objArr, int i, int i10, Object obj, p8.c cVar) {
        Object obj2;
        int a10 = uc.a(i10, i);
        if (i == 0) {
            cVar.f22619u = objArr[31];
            Object[] t3 = t(objArr);
            k.d(a10 + 1, a10, 31, objArr, t3);
            t3[a10] = obj;
            return t3;
        }
        Object[] t10 = t(objArr);
        int i11 = i - 5;
        Object obj3 = t10[a10];
        obj3.getClass();
        t10[a10] = p((Object[]) obj3, i11, i10, obj, cVar);
        while (true) {
            a10++;
            if (a10 >= 32 || (obj2 = t10[a10]) == null) {
                break;
            }
            t10[a10] = p((Object[]) obj2, i11, 0, cVar.f22619u, cVar);
        }
        return t10;
    }

    public final void q(int i, Object obj, Object[] objArr) {
        int O = O();
        Object[] t3 = t(this.A);
        Object[] objArr2 = this.A;
        if (O < 32) {
            k.d(i + 1, i, O, objArr2, t3);
            t3[i] = obj;
            this.f27274z = objArr;
            this.A = t3;
            this.B++;
            return;
        }
        Object obj2 = objArr2[31];
        k.d(i + 1, i, 31, objArr2, t3);
        t3[i] = obj;
        D(objArr, t3, w(obj2));
    }

    public final boolean r(Object[] objArr) {
        if (objArr.length == 33 && objArr[32] == this.f27273y) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return I(new s(2, collection));
    }

    public final a s(int i) {
        Object[] objArr = this.f27274z;
        if (objArr != null) {
            int L = L() >> 5;
            od.b(i, L);
            int i10 = this.f27272x;
            if (i10 == 0) {
                return new c(i, objArr);
            }
            return new i(objArr, i, L, i10 / 5);
        }
        x.o("Invalid root");
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        od.a(i, a());
        if (L() <= i) {
            Object[] t3 = t(this.A);
            if (t3 != this.A) {
                ((AbstractList) this).modCount++;
            }
            int i10 = i & 31;
            Object obj2 = t3[i10];
            t3[i10] = obj;
            this.A = t3;
            return obj2;
        }
        p8.c cVar = new p8.c(null);
        Object[] objArr = this.f27274z;
        objArr.getClass();
        this.f27274z = M(objArr, this.f27272x, i, obj, cVar);
        return cVar.f22619u;
    }

    public final Object[] t(Object[] objArr) {
        if (objArr == null) {
            return v();
        }
        if (r(objArr)) {
            return objArr;
        }
        Object[] v2 = v();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        k.g(0, length, 6, objArr, v2);
        return v2;
    }

    public final Object[] u(Object[] objArr, int i) {
        if (r(objArr)) {
            k.d(i, 0, 32 - i, objArr, objArr);
            return objArr;
        }
        Object[] v2 = v();
        k.d(i, 0, 32 - i, objArr, v2);
        return v2;
    }

    public final Object[] v() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f27273y;
        return objArr;
    }

    public final Object[] w(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f27273y;
        return objArr;
    }

    public final Object[] x(Object[] objArr, int i, int i10) {
        if (i10 < 0) {
            n1.a("shift should be positive");
        }
        if (i10 == 0) {
            return objArr;
        }
        int a10 = uc.a(i, i10);
        Object obj = objArr[a10];
        obj.getClass();
        Object x9 = x((Object[]) obj, i, i10 - 5);
        if (a10 < 31) {
            int i11 = a10 + 1;
            if (objArr[i11] != null) {
                if (r(objArr)) {
                    Arrays.fill(objArr, i11, 32, (Object) null);
                }
                Object[] v2 = v();
                k.d(0, 0, i11, objArr, v2);
                objArr = v2;
            }
        }
        if (x9 != objArr[a10]) {
            Object[] t3 = t(objArr);
            t3[a10] = x9;
            return t3;
        }
        return objArr;
    }

    public final Object[] y(Object[] objArr, int i, int i10, p8.c cVar) {
        Object[] y10;
        int a10 = uc.a(i10 - 1, i);
        if (i == 5) {
            cVar.f22619u = objArr[a10];
            y10 = null;
        } else {
            Object obj = objArr[a10];
            obj.getClass();
            y10 = y((Object[]) obj, i - 5, i10, cVar);
        }
        if (y10 == null && a10 == 0) {
            return null;
        }
        Object[] t3 = t(objArr);
        t3[a10] = y10;
        return t3;
    }

    public final void z(Object[] objArr, int i, int i10) {
        if (i10 == 0) {
            this.f27274z = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.A = objArr;
            this.B = i;
            this.f27272x = i10;
            return;
        }
        p8.c cVar = new p8.c(null);
        objArr.getClass();
        Object[] y10 = y(objArr, i10, i, cVar);
        y10.getClass();
        Object obj = cVar.f22619u;
        obj.getClass();
        this.A = (Object[]) obj;
        this.B = i;
        if (y10[1] == null) {
            this.f27274z = (Object[]) y10[0];
            this.f27272x = i10 - 5;
        } else {
            this.f27274z = y10;
            this.f27272x = i10;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int O = O();
        if (O < 32) {
            Object[] t3 = t(this.A);
            t3[O] = obj;
            this.A = t3;
            this.B = a() + 1;
        } else {
            D(this.f27274z, this.A, w(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int O = O();
        Iterator it = collection.iterator();
        if (32 - O >= collection.size()) {
            Object[] t3 = t(this.A);
            k(t3, O, it);
            this.A = t3;
            this.B = collection.size() + this.B;
            return true;
        }
        int size = ((collection.size() + O) - 1) / 32;
        Object[][] objArr = new Object[size];
        Object[] t10 = t(this.A);
        k(t10, O, it);
        objArr[0] = t10;
        for (int i = 1; i < size; i++) {
            Object[] v2 = v();
            k(v2, 0, it);
            objArr[i] = v2;
        }
        this.f27274z = C(this.f27274z, L(), objArr);
        Object[] v4 = v();
        k(v4, 0, it);
        this.A = v4;
        this.B = collection.size() + this.B;
        return true;
    }
}
