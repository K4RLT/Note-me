package ya;
import ie.a;
import ie.b;
import ie.c;
import je.a;
import me.a;
import q.x;

import com.google.android.gms.internal.ads.k41;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class d extends AbstractMap implements Serializable {
    public static final Object D = new Object();
    public transient b A;
    public transient b B;
    public transient k41 C;

    /* renamed from: u, reason: collision with root package name */
    public transient Object f31189u;

    /* renamed from: v, reason: collision with root package name */
    public transient int[] f31190v;

    /* renamed from: w, reason: collision with root package name */
    public transient Object[] f31191w;

    /* renamed from: x, reason: collision with root package name */
    public transient Object[] f31192x;

    /* renamed from: y, reason: collision with root package name */
    public transient int f31193y = Math.min(Math.max(12, 1), 1073741823);

    /* renamed from: z, reason: collision with root package name */
    public transient int f31194z;

    public final Map a() {
        Object obj = this.f31189u;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final void b(int i, int i10) {
        Object obj = this.f31189u;
        obj.getClass();
        int[] iArr = this.f31190v;
        iArr.getClass();
        Object[] objArr = this.f31191w;
        objArr.getClass();
        Object[] objArr2 = this.f31192x;
        objArr2.getClass();
        int size = size();
        int i11 = size - 1;
        if (i < i11) {
            int i12 = i + 1;
            Object obj2 = objArr[i11];
            objArr[i] = obj2;
            objArr2[i] = objArr2[i11];
            objArr[i11] = null;
            objArr2[i11] = null;
            iArr[i] = iArr[i11];
            iArr[i11] = 0;
            int a10 = a(obj2) & i10;
            int b10 = b(a10, obj);
            if (b10 == size) {
                ie.d(a10, obj, i12);
                return;
            }
            while (true) {
                int i13 = b10 - 1;
                int i14 = iArr[i13];
                int i15 = i14 & i10;
                if (i15 != size) {
                    b10 = i15;
                } else {
                    iArr[i13] = (i14 & (~i10)) | (i10 & i12);
                    return;
                }
            }
        } else {
            objArr[i] = null;
            objArr2[i] = null;
            iArr[i] = 0;
        }
    }

    public final boolean c() {
        if (this.f31189u == null) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (c()) {
            return;
        }
        this.f31193y += 32;
        Map a10 = a();
        if (a10 == null) {
            Object[] objArr = this.f31191w;
            objArr.getClass();
            Arrays.fill(objArr, 0, this.f31194z, (Object) null);
            Object[] objArr2 = this.f31192x;
            objArr2.getClass();
            Arrays.fill(objArr2, 0, this.f31194z, (Object) null);
            Object obj = this.f31189u;
            obj.getClass();
            if (obj instanceof byte[]) {
                Arrays.fill((byte[]) obj, (byte) 0);
            } else if (obj instanceof short[]) {
                Arrays.fill((short[]) obj, (short) 0);
            } else {
                Arrays.fill((int[]) obj, 0);
            }
            int[] iArr = this.f31190v;
            iArr.getClass();
            Arrays.fill(iArr, 0, this.f31194z, 0);
            this.f31194z = 0;
            return;
        }
        this.f31193y = Math.min(Math.max(size(), 3), 1073741823);
        a10.clear();
        this.f31189u = null;
        this.f31194z = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map a10 = a();
        if (a10 != null) {
            return a10.containsKey(obj);
        }
        if (f(obj) == -1) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map a10 = a();
        if (a10 == null) {
            for (int i = 0; i < this.f31194z; i++) {
                Object[] objArr = this.f31192x;
                objArr.getClass();
                if (a(obj, objArr[i])) {
                    return true;
                }
            }
            return false;
        }
        return a10.containsValue(obj);
    }

    public final int e() {
        return (1 << (this.f31193y & 31)) - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        b bVar = this.B;
        if (bVar == null) {
            b bVar2 = new b(this, 0);
            this.B = bVar2;
            return bVar2;
        }
        return bVar;
    }

    public final int f(Object obj) {
        if (c()) {
            return -1;
        }
        int a10 = a(obj);
        int e = e();
        Object obj2 = this.f31189u;
        obj2.getClass();
        int b10 = b(a10 & e, obj2);
        if (b10 != 0) {
            int i = ~e;
            int i10 = a10 & i;
            do {
                int i11 = b10 - 1;
                int[] iArr = this.f31190v;
                iArr.getClass();
                int i12 = iArr[i11];
                if ((i12 & i) == i10) {
                    Object[] objArr = this.f31191w;
                    objArr.getClass();
                    if (a(obj, objArr[i11])) {
                        return i11;
                    }
                }
                b10 = i12 & e;
            } while (b10 != 0);
        }
        return -1;
    }

    public final int g(int i, int i10, int i11, int i12) {
        int i13 = i10 - 1;
        Object c10 = c(i10);
        if (i12 != 0) {
            ie.d(i11 & i13, c10, i12 + 1);
        }
        Object obj = this.f31189u;
        obj.getClass();
        int[] iArr = this.f31190v;
        iArr.getClass();
        for (int i14 = 0; i14 <= i; i14++) {
            int b10 = b(i14, obj);
            while (b10 != 0) {
                int i15 = b10 - 1;
                int i16 = iArr[i15];
                int i17 = ((~i) & i16) | i14;
                int i18 = i17 & i13;
                int b11 = b(i18, c10);
                ie.d(i18, c10, b10);
                iArr[i15] = ((~i13) & i17) | (b11 & i13);
                b10 = i16 & i;
            }
        }
        this.f31189u = c10;
        this.f31193y = ((32 - Integer.numberOfLeadingZeros(i13)) & 31) | (this.f31193y & (-32));
        return i13;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map a10 = a();
        if (a10 != null) {
            return a10.get(obj);
        }
        int f10 = f(obj);
        if (f10 == -1) {
            return null;
        }
        Object[] objArr = this.f31192x;
        objArr.getClass();
        return objArr[f10];
    }

    public final Object h(Object obj) {
        if (!c()) {
            int e = e();
            Object obj2 = this.f31189u;
            obj2.getClass();
            int[] iArr = this.f31190v;
            iArr.getClass();
            Object[] objArr = this.f31191w;
            objArr.getClass();
            int a10 = a(obj, null, e, obj2, iArr, objArr, null);
            if (a10 != -1) {
                Object[] objArr2 = this.f31192x;
                objArr2.getClass();
                Object obj3 = objArr2[a10];
                b(a10, e);
                this.f31194z--;
                this.f31193y += 32;
                return obj3;
            }
        }
        return D;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        b bVar = this.A;
        if (bVar == null) {
            b bVar2 = new b(this, 1);
            this.A = bVar2;
            return bVar2;
        }
        return bVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i;
        int i10;
        int i11;
        int i12 = 32;
        if (c()) {
            if (c()) {
                int i13 = this.f31193y;
                int max = Math.max(i13 + 1, 2);
                int highestOneBit = Integer.highestOneBit(max);
                if (max > highestOneBit && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                    highestOneBit = 1073741824;
                }
                int max2 = Math.max(4, highestOneBit);
                this.f31189u = c(max2);
                this.f31193y = ((32 - Integer.numberOfLeadingZeros(max2 - 1)) & 31) | (this.f31193y & (-32));
                this.f31190v = new int[i13];
                this.f31191w = new Object[i13];
                this.f31192x = new Object[i13];
            } else {
                x.o("Arrays already allocated");
                return null;
            }
        }
        Map a10 = a();
        if (a10 == null) {
            int[] iArr = this.f31190v;
            iArr.getClass();
            Object[] objArr = this.f31191w;
            objArr.getClass();
            Object[] objArr2 = this.f31192x;
            objArr2.getClass();
            int i14 = this.f31194z;
            int i15 = i14 + 1;
            int a11 = a(obj);
            int e = e();
            int i16 = a11 & e;
            Object obj3 = this.f31189u;
            obj3.getClass();
            int b10 = b(i16, obj3);
            if (b10 == 0) {
                if (i15 > e) {
                    if (e < 32) {
                        i11 = 4;
                    } else {
                        i11 = 2;
                    }
                    e = g(e, (e + 1) * i11, a11, i14);
                } else {
                    Object obj4 = this.f31189u;
                    obj4.getClass();
                    ie.d(i16, obj4, i15);
                }
                i = 1;
            } else {
                int i17 = ~e;
                int i18 = a11 & i17;
                int i19 = 0;
                int i20 = 0;
                while (true) {
                    int i21 = b10 - 1;
                    int i22 = iArr[i21];
                    i = 1;
                    int i23 = i22 & i17;
                    int i24 = i12;
                    if (i23 == i18 && a(obj, objArr[i21])) {
                        Object obj5 = objArr2[i21];
                        objArr2[i21] = obj2;
                        return obj5;
                    }
                    int i25 = i22 & e;
                    int i26 = i20 + 1;
                    if (i25 == 0) {
                        if (i26 >= 9) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap(e() + 1, 1.0f);
                            if (isEmpty()) {
                                i19 = -1;
                            }
                            while (i19 >= 0) {
                                Object[] objArr3 = this.f31191w;
                                objArr3.getClass();
                                Object obj6 = objArr3[i19];
                                Object[] objArr4 = this.f31192x;
                                objArr4.getClass();
                                linkedHashMap.put(obj6, objArr4[i19]);
                                int i27 = i19 + 1;
                                if (i27 >= this.f31194z) {
                                    i19 = -1;
                                } else {
                                    i19 = i27;
                                }
                            }
                            this.f31189u = linkedHashMap;
                            this.f31190v = null;
                            this.f31191w = null;
                            this.f31192x = null;
                            this.f31193y += 32;
                            return linkedHashMap.put(obj, obj2);
                        }
                        if (i15 > e) {
                            if (e < i24) {
                                i10 = 4;
                            } else {
                                i10 = 2;
                            }
                            e = g(e, (e + 1) * i10, a11, i14);
                        } else {
                            iArr[i21] = (i15 & e) | i23;
                        }
                    } else {
                        i20 = i26;
                        b10 = i25;
                        i12 = i24;
                    }
                }
            }
            int[] iArr2 = this.f31190v;
            iArr2.getClass();
            int length = iArr2.length;
            if (i15 > length) {
                int i28 = i;
                int min = Math.min(1073741823, (Math.max(i28, length >>> 1) + length) | i28);
                if (min != length) {
                    int[] iArr3 = this.f31190v;
                    iArr3.getClass();
                    this.f31190v = Arrays.copyOf(iArr3, min);
                    Object[] objArr5 = this.f31191w;
                    objArr5.getClass();
                    this.f31191w = Arrays.copyOf(objArr5, min);
                    Object[] objArr6 = this.f31192x;
                    objArr6.getClass();
                    this.f31192x = Arrays.copyOf(objArr6, min);
                }
            }
            int i29 = (~e) & a11;
            int[] iArr4 = this.f31190v;
            iArr4.getClass();
            iArr4[i14] = i29;
            Object[] objArr7 = this.f31191w;
            objArr7.getClass();
            objArr7[i14] = obj;
            Object[] objArr8 = this.f31192x;
            objArr8.getClass();
            objArr8[i14] = obj2;
            this.f31194z = i15;
            this.f31193y += 32;
            return null;
        }
        return a10.put(obj, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map a10 = a();
        if (a10 != null) {
            return a10.remove(obj);
        }
        Object h3 = h(obj);
        if (h3 == D) {
            return null;
        }
        return h3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map a10 = a();
        if (a10 != null) {
            return a10.size();
        }
        return this.f31194z;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        k41 k41Var = this.C;
        if (k41Var == null) {
            k41 k41Var2 = new k41(6, this);
            this.C = k41Var2;
            return k41Var2;
        }
        return k41Var;
    }
}
