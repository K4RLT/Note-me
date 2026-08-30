package xa;
import x.o;
import q.x;

import com.google.android.gms.internal.ads.k41;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class d extends AbstractMap implements Serializable {
    public static final Object D = new Object();
    public transient c A;
    public transient c B;
    public transient k41 C;

    /* renamed from: u, reason: collision with root package name */
    public transient Object f30396u;

    /* renamed from: v, reason: collision with root package name */
    public transient int[] f30397v;

    /* renamed from: w, reason: collision with root package name */
    public transient Object[] f30398w;

    /* renamed from: x, reason: collision with root package name */
    public transient Object[] f30399x;

    /* renamed from: y, reason: collision with root package name */
    public transient int f30400y = Math.min(Math.max(3, 1), 1073741823);

    /* renamed from: z, reason: collision with root package name */
    public transient int f30401z;

    public final Object[] a() {
        Object[] objArr = this.f30398w;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final Object[] b() {
        Object[] objArr = this.f30399x;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final Map c() {
        Object obj = this.f30396u;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (f()) {
            return;
        }
        this.f30400y += 32;
        Map c10 = c();
        if (c10 != null) {
            this.f30400y = Math.min(Math.max(size(), 3), 1073741823);
            c10.clear();
            this.f30396u = null;
            this.f30401z = 0;
            return;
        }
        Arrays.fill(a(), 0, this.f30401z, (Object) null);
        Arrays.fill(b(), 0, this.f30401z, (Object) null);
        Object obj = this.f30396u;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(k(), 0, this.f30401z, 0);
        this.f30401z = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map c10 = c();
        if (c10 != null) {
            return c10.containsKey(obj);
        }
        if (h(obj) == -1) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map c10 = c();
        if (c10 == null) {
            for (int i = 0; i < this.f30401z; i++) {
                if (Objects.equals(obj, b()[i])) {
                    return true;
                }
            }
            return false;
        }
        return c10.containsValue(obj);
    }

    public final void e(int i, int i10) {
        Object obj = this.f30396u;
        Objects.requireNonNull(obj);
        int[] k3 = k();
        Object[] a10 = a();
        Object[] b10 = b();
        int size = size();
        int i11 = size - 1;
        if (i < i11) {
            int i12 = i + 1;
            Object obj2 = a10[i11];
            a10[i] = obj2;
            b10[i] = b10[i11];
            a10[i11] = null;
            b10[i11] = null;
            k3[i] = k3[i11];
            k3[i11] = 0;
            int l10 = u0.l(obj2) & i10;
            int u9 = u0.u(l10, obj);
            if (u9 == size) {
                u0.F(l10, obj, i12);
                return;
            }
            while (true) {
                int i13 = u9 - 1;
                int i14 = k3[i13];
                int i15 = i14 & i10;
                if (i15 != size) {
                    u9 = i15;
                } else {
                    k3[i13] = (i14 & (~i10)) | (i10 & i12);
                    return;
                }
            }
        } else {
            a10[i] = null;
            b10[i] = null;
            k3[i] = 0;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        c cVar = this.B;
        if (cVar == null) {
            c cVar2 = new c(this, 0);
            this.B = cVar2;
            return cVar2;
        }
        return cVar;
    }

    public final boolean f() {
        if (this.f30396u == null) {
            return true;
        }
        return false;
    }

    public final int g() {
        return (1 << (this.f30400y & 31)) - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map c10 = c();
        if (c10 != null) {
            return c10.get(obj);
        }
        int h3 = h(obj);
        if (h3 == -1) {
            return null;
        }
        return b()[h3];
    }

    public final int h(Object obj) {
        if (f()) {
            return -1;
        }
        int l10 = u0.l(obj);
        int g8 = g();
        Object obj2 = this.f30396u;
        Objects.requireNonNull(obj2);
        int u9 = u0.u(l10 & g8, obj2);
        if (u9 != 0) {
            int i = ~g8;
            int i10 = l10 & i;
            do {
                int i11 = u9 - 1;
                int i12 = k()[i11];
                if ((i12 & i) == i10 && Objects.equals(obj, a()[i11])) {
                    return i11;
                }
                u9 = i12 & g8;
            } while (u9 != 0);
        }
        return -1;
    }

    public final int i(int i, int i10, int i11, int i12) {
        int i13 = i10 - 1;
        Object A = u0.A(i10);
        if (i12 != 0) {
            u0.F(i11 & i13, A, i12 + 1);
        }
        Object obj = this.f30396u;
        Objects.requireNonNull(obj);
        int[] k3 = k();
        for (int i14 = 0; i14 <= i; i14++) {
            int u9 = u0.u(i14, obj);
            while (u9 != 0) {
                int i15 = u9 - 1;
                int i16 = k3[i15];
                int i17 = ((~i) & i16) | i14;
                int i18 = i17 & i13;
                int u10 = u0.u(i18, A);
                u0.F(i18, A, u9);
                k3[i15] = ((~i13) & i17) | (u10 & i13);
                u9 = i16 & i;
            }
        }
        this.f30396u = A;
        this.f30400y = ((32 - Integer.numberOfLeadingZeros(i13)) & 31) | (this.f30400y & (-32));
        return i13;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public final Object j(Object obj) {
        if (!f()) {
            int g8 = g();
            Object obj2 = this.f30396u;
            Objects.requireNonNull(obj2);
            int m4 = u0.m(obj, null, g8, obj2, k(), a(), null);
            if (m4 != -1) {
                Object obj3 = b()[m4];
                e(m4, g8);
                this.f30401z--;
                this.f30400y += 32;
                return obj3;
            }
        }
        return D;
    }

    public final int[] k() {
        int[] iArr = this.f30397v;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        c cVar = this.A;
        if (cVar == null) {
            c cVar2 = new c(this, 1);
            this.A = cVar2;
            return cVar2;
        }
        return cVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i;
        int i10;
        int i11;
        int i12 = 32;
        if (f()) {
            if (f()) {
                int i13 = this.f30400y;
                int max = Math.max(i13 + 1, 2);
                int highestOneBit = Integer.highestOneBit(max);
                if (max > highestOneBit && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                    highestOneBit = 1073741824;
                }
                int max2 = Math.max(4, highestOneBit);
                this.f30396u = u0.A(max2);
                this.f30400y = ((32 - Integer.numberOfLeadingZeros(max2 - 1)) & 31) | (this.f30400y & (-32));
                this.f30397v = new int[i13];
                this.f30398w = new Object[i13];
                this.f30399x = new Object[i13];
            } else {
                x.o("Arrays already allocated");
                return null;
            }
        }
        Map c10 = c();
        if (c10 != null) {
            return c10.put(obj, obj2);
        }
        int[] k3 = k();
        Object[] a10 = a();
        Object[] b10 = b();
        int i14 = this.f30401z;
        int i15 = i14 + 1;
        int l10 = u0.l(obj);
        int g8 = g();
        int i16 = l10 & g8;
        Object obj3 = this.f30396u;
        Objects.requireNonNull(obj3);
        int u9 = u0.u(i16, obj3);
        if (u9 == 0) {
            if (i15 > g8) {
                if (g8 < 32) {
                    i11 = 4;
                } else {
                    i11 = 2;
                }
                g8 = i(g8, (g8 + 1) * i11, l10, i14);
            } else {
                Object obj4 = this.f30396u;
                Objects.requireNonNull(obj4);
                u0.F(i16, obj4, i15);
            }
            i = 1;
        } else {
            int i17 = ~g8;
            int i18 = l10 & i17;
            int i19 = 0;
            int i20 = 0;
            while (true) {
                int i21 = u9 - 1;
                int i22 = k3[i21];
                i = 1;
                int i23 = i22 & i17;
                int i24 = i12;
                if (i23 == i18 && Objects.equals(obj, a10[i21])) {
                    Object obj5 = b10[i21];
                    b10[i21] = obj2;
                    return obj5;
                }
                int i25 = i22 & g8;
                int i26 = i20 + 1;
                if (i25 == 0) {
                    if (i26 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(g() + 1, 1.0f);
                        if (isEmpty()) {
                            i19 = -1;
                        }
                        while (i19 >= 0) {
                            linkedHashMap.put(a()[i19], b()[i19]);
                            int i27 = i19 + 1;
                            if (i27 >= this.f30401z) {
                                i19 = -1;
                            } else {
                                i19 = i27;
                            }
                        }
                        this.f30396u = linkedHashMap;
                        this.f30397v = null;
                        this.f30398w = null;
                        this.f30399x = null;
                        this.f30400y += 32;
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i15 > g8) {
                        if (g8 < i24) {
                            i10 = 4;
                        } else {
                            i10 = 2;
                        }
                        g8 = i(g8, (g8 + 1) * i10, l10, i14);
                    } else {
                        k3[i21] = (i15 & g8) | i23;
                    }
                } else {
                    i20 = i26;
                    u9 = i25;
                    i12 = i24;
                }
            }
        }
        int length = k().length;
        if (i15 > length) {
            int i28 = i;
            int min = Math.min(1073741823, (Math.max(i28, length >>> 1) + length) | i28);
            if (min != length) {
                this.f30397v = Arrays.copyOf(k(), min);
                this.f30398w = Arrays.copyOf(a(), min);
                this.f30399x = Arrays.copyOf(b(), min);
            }
        }
        k()[i14] = (~g8) & l10;
        a()[i14] = obj;
        b()[i14] = obj2;
        this.f30401z = i15;
        this.f30400y += 32;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map c10 = c();
        if (c10 != null) {
            return c10.remove(obj);
        }
        Object j10 = j(obj);
        if (j10 == D) {
            return null;
        }
        return j10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map c10 = c();
        if (c10 != null) {
            return c10.size();
        }
        return this.f30401z;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        k41 k41Var = this.C;
        if (k41Var == null) {
            k41 k41Var2 = new k41(5, this);
            this.C = k41Var2;
            return k41Var2;
        }
        return k41Var;
    }
}
