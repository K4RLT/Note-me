package re;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.l;
import q.x;
import ya.ib;

/* loaded from: classes.dex */
public final class e implements Map, Serializable, ef.d {
    public static final e H;
    public int A;
    public int B;
    public int C;
    public f D;
    public g E;
    public f F;
    public boolean G;

    /* renamed from: u, reason: collision with root package name */
    public Object[] f24757u;

    /* renamed from: v, reason: collision with root package name */
    public Object[] f24758v;

    /* renamed from: w, reason: collision with root package name */
    public int[] f24759w;

    /* renamed from: x, reason: collision with root package name */
    public int[] f24760x;

    /* renamed from: y, reason: collision with root package name */
    public int f24761y;

    /* renamed from: z, reason: collision with root package name */
    public int f24762z;

    static {
        e eVar = new e(0);
        eVar.G = true;
        H = eVar;
    }

    public e(int i) {
        if (i >= 0) {
            Object[] objArr = new Object[i];
            int[] iArr = new int[i];
            int highestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
            this.f24757u = objArr;
            this.f24758v = null;
            this.f24759w = iArr;
            this.f24760x = new int[highestOneBit];
            this.f24761y = 2;
            this.f24762z = 0;
            this.A = Integer.numberOfLeadingZeros(highestOneBit) + 1;
            return;
        }
        x.n("capacity must be non-negative.");
        throw null;
    }

    public final int a(Object obj) {
        c();
        while (true) {
            int j10 = j(obj);
            int i = this.f24761y * 2;
            int length = this.f24760x.length / 2;
            if (i > length) {
                i = length;
            }
            int i10 = 0;
            while (true) {
                int[] iArr = this.f24760x;
                int i11 = iArr[j10];
                if (i11 <= 0) {
                    int i12 = this.f24762z;
                    Object[] objArr = this.f24757u;
                    if (i12 >= objArr.length) {
                        g(1);
                    } else {
                        int i13 = i12 + 1;
                        this.f24762z = i13;
                        objArr[i12] = obj;
                        this.f24759w[i12] = j10;
                        iArr[j10] = i13;
                        this.C++;
                        this.B++;
                        if (i10 > this.f24761y) {
                            this.f24761y = i10;
                        }
                        return i12;
                    }
                } else {
                    if (l.a(this.f24757u[i11 - 1], obj)) {
                        return -i11;
                    }
                    i10++;
                    if (i10 > i) {
                        k(this.f24760x.length * 2);
                        break;
                    }
                    int i14 = j10 - 1;
                    if (j10 == 0) {
                        j10 = this.f24760x.length - 1;
                    } else {
                        j10 = i14;
                    }
                }
            }
        }
    }

    public final e b() {
        c();
        this.G = true;
        if (this.C > 0) {
            return this;
        }
        e eVar = H;
        eVar.getClass();
        return eVar;
    }

    public final void c() {
        if (!this.G) {
            return;
        }
        x.h();
    }

    @Override // java.util.Map
    public final void clear() {
        c();
        int i = this.f24762z - 1;
        if (i >= 0) {
            int i10 = 0;
            while (true) {
                int[] iArr = this.f24759w;
                int i11 = iArr[i10];
                if (i11 >= 0) {
                    this.f24760x[i11] = 0;
                    iArr[i10] = -1;
                }
                if (i10 == i) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        ib.b(this.f24757u, 0, this.f24762z);
        Object[] objArr = this.f24758v;
        if (objArr != null) {
            ib.b(objArr, 0, this.f24762z);
        }
        this.C = 0;
        this.f24762z = 0;
        this.B++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (h(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (i(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final void e(boolean z3) {
        int i;
        Object[] objArr = this.f24758v;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            i = this.f24762z;
            if (i10 >= i) {
                break;
            }
            int[] iArr = this.f24759w;
            int i12 = iArr[i10];
            if (i12 >= 0) {
                Object[] objArr2 = this.f24757u;
                objArr2[i11] = objArr2[i10];
                if (objArr != null) {
                    objArr[i11] = objArr[i10];
                }
                if (z3) {
                    iArr[i11] = i12;
                    this.f24760x[i12] = i11 + 1;
                }
                i11++;
            }
            i10++;
        }
        ib.b(this.f24757u, i11, i);
        if (objArr != null) {
            ib.b(objArr, i11, this.f24762z);
        }
        this.f24762z = i11;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        f fVar = this.F;
        if (fVar == null) {
            f fVar2 = new f(this, 0);
            this.F = fVar2;
            return fVar2;
        }
        return fVar;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (this.C != map.size() || !f(map.entrySet())) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean f(Collection collection) {
        boolean a10;
        collection.getClass();
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    Map.Entry entry = (Map.Entry) obj;
                    int h3 = h(entry.getKey());
                    if (h3 < 0) {
                        a10 = false;
                    } else {
                        Object[] objArr = this.f24758v;
                        objArr.getClass();
                        a10 = l.a(objArr[h3], entry.getValue());
                    }
                    if (!a10) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final void g(int i) {
        Object[] objArr;
        Object[] objArr2 = this.f24757u;
        int length = objArr2.length;
        int i10 = this.f24762z;
        int i11 = length - i10;
        int i12 = i10 - this.C;
        int i13 = 1;
        if (i11 < i && i11 + i12 >= i && i12 >= objArr2.length / 4) {
            e(true);
            return;
        }
        int i14 = i10 + i;
        if (i14 >= 0) {
            if (i14 > objArr2.length) {
                int length2 = objArr2.length;
                int i15 = length2 + (length2 >> 1);
                if (i15 - i14 < 0) {
                    i15 = i14;
                }
                if (i15 - 2147483639 > 0) {
                    if (i14 > 2147483639) {
                        i15 = Integer.MAX_VALUE;
                    } else {
                        i15 = 2147483639;
                    }
                }
                this.f24757u = Arrays.copyOf(objArr2, i15);
                Object[] objArr3 = this.f24758v;
                if (objArr3 != null) {
                    objArr = Arrays.copyOf(objArr3, i15);
                } else {
                    objArr = null;
                }
                this.f24758v = objArr;
                this.f24759w = Arrays.copyOf(this.f24759w, i15);
                if (i15 >= 1) {
                    i13 = i15;
                }
                int highestOneBit = Integer.highestOneBit(i13 * 3);
                if (highestOneBit > this.f24760x.length) {
                    k(highestOneBit);
                    return;
                }
                return;
            }
            return;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int h3 = h(obj);
        if (h3 < 0) {
            return null;
        }
        Object[] objArr = this.f24758v;
        objArr.getClass();
        return objArr[h3];
    }

    public final int h(Object obj) {
        int j10 = j(obj);
        int i = this.f24761y;
        while (true) {
            int i10 = this.f24760x[j10];
            if (i10 == 0) {
                return -1;
            }
            if (i10 > 0) {
                int i11 = i10 - 1;
                if (l.a(this.f24757u[i11], obj)) {
                    return i11;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            int i12 = j10 - 1;
            if (j10 == 0) {
                j10 = this.f24760x.length - 1;
            } else {
                j10 = i12;
            }
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        int i;
        int i10;
        c cVar = new c(this, 0);
        int i11 = 0;
        while (cVar.hasNext()) {
            int i12 = cVar.f15724u;
            e eVar = (e) cVar.f15727x;
            if (i12 < eVar.f24762z) {
                cVar.f15724u = i12 + 1;
                cVar.f15725v = i12;
                Object obj = eVar.f24757u[i12];
                if (obj != null) {
                    i = obj.hashCode();
                } else {
                    i = 0;
                }
                Object[] objArr = eVar.f24758v;
                objArr.getClass();
                Object obj2 = objArr[cVar.f15725v];
                if (obj2 != null) {
                    i10 = obj2.hashCode();
                } else {
                    i10 = 0;
                }
                cVar.c();
                i11 += i ^ i10;
            } else {
                l4.a.c();
                return 0;
            }
        }
        return i11;
    }

    public final int i(Object obj) {
        int i = this.f24762z;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.f24759w[i] >= 0) {
                Object[] objArr = this.f24758v;
                objArr.getClass();
                if (l.a(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        if (this.C == 0) {
            return true;
        }
        return false;
    }

    public final int j(Object obj) {
        int i;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return (i * (-1640531527)) >>> this.A;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0032, code lost:
    
        r3[r0] = r6;
        r5.f24759w[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(int r6) {
        /*
            r5 = this;
            int r0 = r5.B
            int r0 = r0 + 1
            r5.B = r0
            int r0 = r5.f24762z
            int r1 = r5.C
            r2 = 0
            if (r0 <= r1) goto L10
            r5.e(r2)
        L10:
            int[] r0 = new int[r6]
            r5.f24760x = r0
            int r6 = java.lang.Integer.numberOfLeadingZeros(r6)
            int r6 = r6 + 1
            r5.A = r6
        L1c:
            int r6 = r5.f24762z
            if (r2 >= r6) goto L4d
            int r6 = r2 + 1
            java.lang.Object[] r0 = r5.f24757u
            r0 = r0[r2]
            int r0 = r5.j(r0)
            int r1 = r5.f24761y
        L2c:
            int[] r3 = r5.f24760x
            r4 = r3[r0]
            if (r4 != 0) goto L3a
            r3[r0] = r6
            int[] r1 = r5.f24759w
            r1[r2] = r0
            r2 = r6
            goto L1c
        L3a:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L48
            int r4 = r0 + (-1)
            if (r0 != 0) goto L46
            int r0 = r3.length
            int r0 = r0 + (-1)
            goto L2c
        L46:
            r0 = r4
            goto L2c
        L48:
            java.lang.String r6 = "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"
            q.x.o(r6)
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: re.e.k(int):void");
    }

    @Override // java.util.Map
    public final Set keySet() {
        f fVar = this.D;
        if (fVar == null) {
            f fVar2 = new f(this, 1);
            this.D = fVar2;
            return fVar2;
        }
        return fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[LOOP:0: B:8:0x0022->B:25:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(int r12) {
        /*
            r11 = this;
            java.lang.Object[] r0 = r11.f24757u
            r0.getClass()
            r1 = 0
            r0[r12] = r1
            java.lang.Object[] r0 = r11.f24758v
            if (r0 == 0) goto Le
            r0[r12] = r1
        Le:
            int[] r0 = r11.f24759w
            r0 = r0[r12]
            int r1 = r11.f24761y
            int r1 = r1 * 2
            int[] r2 = r11.f24760x
            int r2 = r2.length
            int r2 = r2 / 2
            if (r1 <= r2) goto L1e
            r1 = r2
        L1e:
            r2 = 0
            r3 = r1
            r4 = r2
            r1 = r0
        L22:
            int r5 = r0 + (-1)
            if (r0 != 0) goto L2c
            int[] r0 = r11.f24760x
            int r0 = r0.length
            int r0 = r0 + (-1)
            goto L2d
        L2c:
            r0 = r5
        L2d:
            int r4 = r4 + 1
            int r5 = r11.f24761y
            int[] r6 = r11.f24760x
            r7 = -1
            if (r4 <= r5) goto L39
            r6[r1] = r2
            goto L68
        L39:
            r5 = r6[r0]
            if (r5 != 0) goto L40
            r6[r1] = r2
            goto L68
        L40:
            if (r5 >= 0) goto L47
            r6[r1] = r7
        L44:
            r1 = r0
            r4 = r2
            goto L61
        L47:
            java.lang.Object[] r6 = r11.f24757u
            int r8 = r5 + (-1)
            r6 = r6[r8]
            int r6 = r11.j(r6)
            int r6 = r6 - r0
            int[] r9 = r11.f24760x
            int r10 = r9.length
            int r10 = r10 + (-1)
            r6 = r6 & r10
            if (r6 < r4) goto L61
            r9[r1] = r5
            int[] r4 = r11.f24759w
            r4[r8] = r1
            goto L44
        L61:
            int r3 = r3 + r7
            if (r3 >= 0) goto L22
            int[] r0 = r11.f24760x
            r0[r1] = r7
        L68:
            int[] r0 = r11.f24759w
            r0[r12] = r7
            int r12 = r11.C
            int r12 = r12 + r7
            r11.C = r12
            int r12 = r11.B
            int r12 = r12 + 1
            r11.B = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: re.e.l(int):void");
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        c();
        int a10 = a(obj);
        Object[] objArr = this.f24758v;
        if (objArr == null) {
            int length = this.f24757u.length;
            if (length >= 0) {
                objArr = new Object[length];
                this.f24758v = objArr;
            } else {
                x.n("capacity must be non-negative.");
                return null;
            }
        }
        if (a10 < 0) {
            int i = (-a10) - 1;
            Object obj3 = objArr[i];
            objArr[i] = obj2;
            return obj3;
        }
        objArr[a10] = obj2;
        return null;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        map.getClass();
        c();
        Set<Map.Entry> entrySet = map.entrySet();
        if (!entrySet.isEmpty()) {
            g(entrySet.size());
            for (Map.Entry entry : entrySet) {
                int a10 = a(entry.getKey());
                Object[] objArr = this.f24758v;
                if (objArr == null) {
                    int length = this.f24757u.length;
                    if (length >= 0) {
                        objArr = new Object[length];
                        this.f24758v = objArr;
                    } else {
                        x.n("capacity must be non-negative.");
                        return;
                    }
                }
                if (a10 >= 0) {
                    objArr[a10] = entry.getValue();
                } else {
                    int i = (-a10) - 1;
                    if (!l.a(entry.getValue(), objArr[i])) {
                        objArr[i] = entry.getValue();
                    }
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        c();
        int h3 = h(obj);
        if (h3 < 0) {
            return null;
        }
        Object[] objArr = this.f24758v;
        objArr.getClass();
        Object obj2 = objArr[h3];
        l(h3);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.C;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder((this.C * 3) + 2);
        sb2.append("{");
        int i = 0;
        c cVar = new c(this, 0);
        while (cVar.hasNext()) {
            if (i > 0) {
                sb2.append(", ");
            }
            int i10 = cVar.f15724u;
            e eVar = (e) cVar.f15727x;
            if (i10 < eVar.f24762z) {
                cVar.f15724u = i10 + 1;
                cVar.f15725v = i10;
                Object obj = eVar.f24757u[i10];
                if (obj == eVar) {
                    sb2.append("(this Map)");
                } else {
                    sb2.append(obj);
                }
                sb2.append('=');
                Object[] objArr = eVar.f24758v;
                objArr.getClass();
                Object obj2 = objArr[cVar.f15725v];
                if (obj2 == eVar) {
                    sb2.append("(this Map)");
                } else {
                    sb2.append(obj2);
                }
                cVar.c();
                i++;
            } else {
                l4.a.c();
                return null;
            }
        }
        sb2.append("}");
        return sb2.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        g gVar = this.E;
        if (gVar == null) {
            g gVar2 = new g(0, this);
            this.E = gVar2;
            return gVar2;
        }
        return gVar;
    }

    public e() {
        this(8);
    }
}
