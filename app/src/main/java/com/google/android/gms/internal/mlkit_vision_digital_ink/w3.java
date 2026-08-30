package com.google.android.gms.internal.mlkit_vision_digital_ink;

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
public final class w3 extends AbstractMap implements Serializable {
    public static final Object D = new Object();
    public transient t3 A;
    public transient t3 B;
    public transient k41 C;

    /* renamed from: u, reason: collision with root package name */
    public transient Object f15171u;

    /* renamed from: v, reason: collision with root package name */
    public transient int[] f15172v;

    /* renamed from: w, reason: collision with root package name */
    public transient Object[] f15173w;

    /* renamed from: x, reason: collision with root package name */
    public transient Object[] f15174x;

    /* renamed from: y, reason: collision with root package name */
    public transient int f15175y = Math.min(Math.max(12, 1), 1073741823);

    /* renamed from: z, reason: collision with root package name */
    public transient int f15176z;

    public final int[] a() {
        int[] iArr = this.f15172v;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] b() {
        Object[] objArr = this.f15173w;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final Object[] c() {
        Object[] objArr = this.f15174x;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (g()) {
            return;
        }
        this.f15175y += 32;
        Map e = e();
        if (e != null) {
            this.f15175y = Math.min(Math.max(size(), 3), 1073741823);
            e.clear();
            this.f15171u = null;
            this.f15176z = 0;
            return;
        }
        Arrays.fill(b(), 0, this.f15176z, (Object) null);
        Arrays.fill(c(), 0, this.f15176z, (Object) null);
        Object obj = this.f15171u;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(a(), 0, this.f15176z, 0);
        this.f15176z = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map e = e();
        if (e != null) {
            return e.containsKey(obj);
        }
        if (i(obj) == -1) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map e = e();
        if (e == null) {
            for (int i = 0; i < this.f15176z; i++) {
                if (Objects.equals(obj, c()[i])) {
                    return true;
                }
            }
            return false;
        }
        return e.containsValue(obj);
    }

    public final Map e() {
        Object obj = this.f15171u;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        t3 t3Var = this.B;
        if (t3Var == null) {
            t3 t3Var2 = new t3(this, 0);
            this.B = t3Var2;
            return t3Var2;
        }
        return t3Var;
    }

    public final void f(int i, int i10) {
        Object obj = this.f15171u;
        Objects.requireNonNull(obj);
        int[] a10 = a();
        Object[] b10 = b();
        Object[] c10 = c();
        int size = size();
        int i11 = size - 1;
        if (i < i11) {
            int i12 = i + 1;
            Object obj2 = b10[i11];
            b10[i] = obj2;
            c10[i] = c10[i11];
            b10[i11] = null;
            c10[i11] = null;
            a10[i] = a10[i11];
            a10[i11] = 0;
            int j10 = tl.j(obj2) & i10;
            int g8 = f7.g(j10, obj);
            if (g8 == size) {
                f7.n(j10, obj, i12);
                return;
            }
            while (true) {
                int i13 = g8 - 1;
                int i14 = a10[i13];
                int i15 = i14 & i10;
                if (i15 != size) {
                    g8 = i15;
                } else {
                    a10[i13] = (i14 & (~i10)) | (i10 & i12);
                    return;
                }
            }
        } else {
            b10[i] = null;
            c10[i] = null;
            a10[i] = 0;
        }
    }

    public final boolean g() {
        return this.f15171u == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map e = e();
        if (e != null) {
            return e.get(obj);
        }
        int i = i(obj);
        if (i == -1) {
            return null;
        }
        return c()[i];
    }

    public final int h() {
        return (1 << (this.f15175y & 31)) - 1;
    }

    public final int i(Object obj) {
        if (g()) {
            return -1;
        }
        int j10 = tl.j(obj);
        int h3 = h();
        Object obj2 = this.f15171u;
        Objects.requireNonNull(obj2);
        int g8 = f7.g(j10 & h3, obj2);
        if (g8 != 0) {
            int i = ~h3;
            int i10 = j10 & i;
            do {
                int i11 = g8 - 1;
                int i12 = a()[i11];
                if ((i12 & i) == i10 && Objects.equals(obj, b()[i11])) {
                    return i11;
                }
                g8 = i12 & h3;
            } while (g8 != 0);
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public final int j(int i, int i10, int i11, int i12) {
        int i13 = i10 - 1;
        Object k3 = f7.k(i10);
        if (i12 != 0) {
            f7.n(i11 & i13, k3, i12 + 1);
        }
        Object obj = this.f15171u;
        Objects.requireNonNull(obj);
        int[] a10 = a();
        for (int i14 = 0; i14 <= i; i14++) {
            int g8 = f7.g(i14, obj);
            while (g8 != 0) {
                int i15 = g8 - 1;
                int i16 = a10[i15];
                int i17 = ((~i) & i16) | i14;
                int i18 = i17 & i13;
                int g10 = f7.g(i18, k3);
                f7.n(i18, k3, g8);
                a10[i15] = ((~i13) & i17) | (g10 & i13);
                g8 = i16 & i;
            }
        }
        this.f15171u = k3;
        this.f15175y = ((32 - Integer.numberOfLeadingZeros(i13)) & 31) | (this.f15175y & (-32));
        return i13;
    }

    public final Object k(Object obj) {
        if (!g()) {
            int h3 = h();
            Object obj2 = this.f15171u;
            Objects.requireNonNull(obj2);
            int e = f7.e(obj, null, h3, obj2, a(), b(), null);
            if (e != -1) {
                Object obj3 = c()[e];
                f(e, h3);
                this.f15176z--;
                this.f15175y += 32;
                return obj3;
            }
        }
        return D;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        t3 t3Var = this.A;
        if (t3Var == null) {
            t3 t3Var2 = new t3(this, 1);
            this.A = t3Var2;
            return t3Var2;
        }
        return t3Var;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i;
        int i10;
        int i11;
        int i12 = 32;
        if (g()) {
            pa.s("Arrays already allocated", g());
            int i13 = this.f15175y;
            int max = Math.max(i13 + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > highestOneBit && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                highestOneBit = 1073741824;
            }
            int max2 = Math.max(4, highestOneBit);
            this.f15171u = f7.k(max2);
            this.f15175y = ((32 - Integer.numberOfLeadingZeros(max2 - 1)) & 31) | (this.f15175y & (-32));
            this.f15172v = new int[i13];
            this.f15173w = new Object[i13];
            this.f15174x = new Object[i13];
        }
        Map e = e();
        if (e != null) {
            return e.put(obj, obj2);
        }
        int[] a10 = a();
        Object[] b10 = b();
        Object[] c10 = c();
        int i14 = this.f15176z;
        int i15 = i14 + 1;
        int j10 = tl.j(obj);
        int h3 = h();
        int i16 = j10 & h3;
        Object obj3 = this.f15171u;
        Objects.requireNonNull(obj3);
        int g8 = f7.g(i16, obj3);
        if (g8 == 0) {
            if (i15 > h3) {
                if (h3 < 32) {
                    i11 = 4;
                } else {
                    i11 = 2;
                }
                h3 = j(h3, (h3 + 1) * i11, j10, i14);
            } else {
                Object obj4 = this.f15171u;
                Objects.requireNonNull(obj4);
                f7.n(i16, obj4, i15);
            }
            i = 1;
        } else {
            int i17 = ~h3;
            int i18 = j10 & i17;
            int i19 = 0;
            int i20 = 0;
            while (true) {
                int i21 = g8 - 1;
                int i22 = a10[i21];
                i = 1;
                int i23 = i22 & i17;
                int i24 = i12;
                if (i23 == i18 && Objects.equals(obj, b10[i21])) {
                    Object obj5 = c10[i21];
                    c10[i21] = obj2;
                    return obj5;
                }
                int i25 = i22 & h3;
                int i26 = i20 + 1;
                if (i25 == 0) {
                    if (i26 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(h() + 1, 1.0f);
                        if (isEmpty()) {
                            i19 = -1;
                        }
                        while (i19 >= 0) {
                            linkedHashMap.put(b()[i19], c()[i19]);
                            int i27 = i19 + 1;
                            if (i27 >= this.f15176z) {
                                i19 = -1;
                            } else {
                                i19 = i27;
                            }
                        }
                        this.f15171u = linkedHashMap;
                        this.f15172v = null;
                        this.f15173w = null;
                        this.f15174x = null;
                        this.f15175y += 32;
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i15 > h3) {
                        if (h3 < i24) {
                            i10 = 4;
                        } else {
                            i10 = 2;
                        }
                        h3 = j(h3, (h3 + 1) * i10, j10, i14);
                    } else {
                        a10[i21] = (i15 & h3) | i23;
                    }
                } else {
                    i20 = i26;
                    g8 = i25;
                    i12 = i24;
                }
            }
        }
        int length = a().length;
        if (i15 > length) {
            int i28 = i;
            int min = Math.min(1073741823, (Math.max(i28, length >>> 1) + length) | i28);
            if (min != length) {
                this.f15172v = Arrays.copyOf(a(), min);
                this.f15173w = Arrays.copyOf(b(), min);
                this.f15174x = Arrays.copyOf(c(), min);
            }
        }
        a()[i14] = (~h3) & j10;
        b()[i14] = obj;
        c()[i14] = obj2;
        this.f15176z = i15;
        this.f15175y += 32;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map e = e();
        if (e != null) {
            return e.remove(obj);
        }
        Object k3 = k(obj);
        if (k3 == D) {
            return null;
        }
        return k3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map e = e();
        if (e != null) {
            return e.size();
        }
        return this.f15176z;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        k41 k41Var = this.C;
        if (k41Var == null) {
            k41 k41Var2 = new k41(3, this);
            this.C = k41Var2;
            return k41Var2;
        }
        return k41Var;
    }
}
