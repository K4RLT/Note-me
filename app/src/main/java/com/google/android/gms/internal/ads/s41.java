package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class s41 extends AbstractMap implements Serializable {
    public static final Object D = new Object();
    public transient p41 A;
    public transient p41 B;
    public transient k41 C;

    /* renamed from: u, reason: collision with root package name */
    public transient Object f10515u;

    /* renamed from: v, reason: collision with root package name */
    public transient int[] f10516v;

    /* renamed from: w, reason: collision with root package name */
    public transient Object[] f10517w;

    /* renamed from: x, reason: collision with root package name */
    public transient Object[] f10518x;

    /* renamed from: y, reason: collision with root package name */
    public transient int f10519y = Math.min(Math.max(3, 1), 1073741823);

    /* renamed from: z, reason: collision with root package name */
    public transient int f10520z;

    public s41(int i) {
    }

    public final int[] a() {
        int[] iArr = this.f10516v;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] b() {
        Object[] objArr = this.f10517w;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final Object[] c() {
        Object[] objArr = this.f10518x;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (e()) {
            return;
        }
        this.f10519y += 32;
        Map f10 = f();
        if (f10 != null) {
            this.f10519y = Math.min(Math.max(size(), 3), 1073741823);
            f10.clear();
            this.f10515u = null;
            this.f10520z = 0;
            return;
        }
        Arrays.fill(b(), 0, this.f10520z, (Object) null);
        Arrays.fill(c(), 0, this.f10520z, (Object) null);
        Object obj = this.f10515u;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(a(), 0, this.f10520z, 0);
        this.f10520z = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map f10 = f();
        if (f10 != null) {
            return f10.containsKey(obj);
        }
        if (j(obj) == -1) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map f10 = f();
        if (f10 == null) {
            for (int i = 0; i < this.f10520z; i++) {
                if (Objects.equals(obj, c()[i])) {
                    return true;
                }
            }
            return false;
        }
        return f10.containsValue(obj);
    }

    public final boolean e() {
        return this.f10515u == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        p41 p41Var = this.B;
        if (p41Var == null) {
            p41 p41Var2 = new p41(this, 0);
            this.B = p41Var2;
            return p41Var2;
        }
        return p41Var;
    }

    public final Map f() {
        Object obj = this.f10515u;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final void g(int i, int i10) {
        Object obj = this.f10515u;
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
            int q10 = b80.q(obj2) & i10;
            int p10 = an1.p(q10, obj);
            if (p10 == size) {
                an1.D(q10, obj, i12);
                return;
            }
            while (true) {
                int i13 = p10 - 1;
                int i14 = a10[i13];
                int i15 = i14 & i10;
                if (i15 != size) {
                    p10 = i15;
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

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map f10 = f();
        if (f10 != null) {
            return f10.get(obj);
        }
        int j10 = j(obj);
        if (j10 == -1) {
            return null;
        }
        return c()[j10];
    }

    public final int h() {
        return (1 << (this.f10519y & 31)) - 1;
    }

    public final int i(int i, int i10, int i11, int i12) {
        int i13 = i10 - 1;
        Object c10 = an1.c(i10);
        if (i12 != 0) {
            an1.D(i11 & i13, c10, i12 + 1);
        }
        Object obj = this.f10515u;
        Objects.requireNonNull(obj);
        int[] a10 = a();
        for (int i14 = 0; i14 <= i; i14++) {
            int p10 = an1.p(i14, obj);
            while (p10 != 0) {
                int i15 = p10 - 1;
                int i16 = a10[i15];
                int i17 = ((~i) & i16) | i14;
                int i18 = i17 & i13;
                int p11 = an1.p(i18, c10);
                an1.D(i18, c10, p10);
                a10[i15] = ((~i13) & i17) | (p11 & i13);
                p10 = i16 & i;
            }
        }
        this.f10515u = c10;
        this.f10519y = ((32 - Integer.numberOfLeadingZeros(i13)) & 31) | (this.f10519y & (-32));
        return i13;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public final int j(Object obj) {
        if (e()) {
            return -1;
        }
        int q10 = b80.q(obj);
        int h3 = h();
        Object obj2 = this.f10515u;
        Objects.requireNonNull(obj2);
        int p10 = an1.p(q10 & h3, obj2);
        if (p10 != 0) {
            int i = ~h3;
            int i10 = q10 & i;
            do {
                int i11 = p10 - 1;
                int i12 = a()[i11];
                if ((i12 & i) == i10 && Objects.equals(obj, b()[i11])) {
                    return i11;
                }
                p10 = i12 & h3;
            } while (p10 != 0);
        }
        return -1;
    }

    public final Object k(Object obj) {
        if (!e()) {
            int h3 = h();
            Object obj2 = this.f10515u;
            Objects.requireNonNull(obj2);
            int J = an1.J(obj, null, h3, obj2, a(), b(), null);
            if (J != -1) {
                Object obj3 = c()[J];
                g(J, h3);
                this.f10520z--;
                this.f10519y += 32;
                return obj3;
            }
        }
        return D;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        p41 p41Var = this.A;
        if (p41Var == null) {
            p41 p41Var2 = new p41(this, 1);
            this.A = p41Var2;
            return p41Var2;
        }
        return p41Var;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i;
        int i10;
        int i11;
        int i12 = 32;
        if (e()) {
            b80.L("Arrays already allocated", e());
            int i13 = this.f10519y;
            int max = Math.max(i13 + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > highestOneBit && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                highestOneBit = 1073741824;
            }
            int max2 = Math.max(4, highestOneBit);
            this.f10515u = an1.c(max2);
            this.f10519y = ((32 - Integer.numberOfLeadingZeros(max2 - 1)) & 31) | (this.f10519y & (-32));
            this.f10516v = new int[i13];
            this.f10517w = new Object[i13];
            this.f10518x = new Object[i13];
        }
        Map f10 = f();
        if (f10 != null) {
            return f10.put(obj, obj2);
        }
        int[] a10 = a();
        Object[] b10 = b();
        Object[] c10 = c();
        int i14 = this.f10520z;
        int i15 = i14 + 1;
        int q10 = b80.q(obj);
        int h3 = h();
        int i16 = q10 & h3;
        Object obj3 = this.f10515u;
        Objects.requireNonNull(obj3);
        int p10 = an1.p(i16, obj3);
        if (p10 == 0) {
            if (i15 > h3) {
                if (h3 < 32) {
                    i11 = 4;
                } else {
                    i11 = 2;
                }
                h3 = i(h3, (h3 + 1) * i11, q10, i14);
            } else {
                Object obj4 = this.f10515u;
                Objects.requireNonNull(obj4);
                an1.D(i16, obj4, i15);
            }
            i = 1;
        } else {
            int i17 = ~h3;
            int i18 = q10 & i17;
            int i19 = 0;
            int i20 = 0;
            while (true) {
                int i21 = p10 - 1;
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
                            if (i27 >= this.f10520z) {
                                i19 = -1;
                            } else {
                                i19 = i27;
                            }
                        }
                        this.f10515u = linkedHashMap;
                        this.f10516v = null;
                        this.f10517w = null;
                        this.f10518x = null;
                        this.f10519y += 32;
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i15 > h3) {
                        if (h3 < i24) {
                            i10 = 4;
                        } else {
                            i10 = 2;
                        }
                        h3 = i(h3, (h3 + 1) * i10, q10, i14);
                    } else {
                        a10[i21] = (i15 & h3) | i23;
                    }
                } else {
                    i20 = i26;
                    p10 = i25;
                    i12 = i24;
                }
            }
        }
        int length = a().length;
        if (i15 > length) {
            int i28 = i;
            int min = Math.min(1073741823, (Math.max(i28, length >>> 1) + length) | i28);
            if (min != length) {
                this.f10516v = Arrays.copyOf(a(), min);
                this.f10517w = Arrays.copyOf(b(), min);
                this.f10518x = Arrays.copyOf(c(), min);
            }
        }
        a()[i14] = (~h3) & q10;
        b()[i14] = obj;
        c()[i14] = obj2;
        this.f10520z = i15;
        this.f10519y += 32;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map f10 = f();
        if (f10 != null) {
            return f10.remove(obj);
        }
        Object k3 = k(obj);
        if (k3 == D) {
            return null;
        }
        return k3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map f10 = f();
        if (f10 != null) {
            return f10.size();
        }
        return this.f10520z;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        k41 k41Var = this.C;
        if (k41Var == null) {
            k41 k41Var2 = new k41(1, this);
            this.C = k41Var2;
            return k41Var2;
        }
        return k41Var;
    }

    public s41() {
    }
}
