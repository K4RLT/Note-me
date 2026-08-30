package com.google.android.gms.internal.ads;
import b2.t;
import f9.k;
import g5.q;
import k9.a0;
import l9.i;
import oc.e;

import android.content.SharedPreferences;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class nb implements g2, hc, ie0 {

    /* renamed from: x, reason: collision with root package name */
    public static final c f8633x = new c(14);

    /* renamed from: u, reason: collision with root package name */
    public int f8634u;

    /* renamed from: v, reason: collision with root package name */
    public Object f8635v;

    /* renamed from: w, reason: collision with root package name */
    public Object f8636w;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public nb(int i, boolean z3) {
        this(4);
        switch (i) {
            case 4:
                this.f8635v = new Object();
                this.f8636w = new LinkedList();
                return;
            case 7:
                return;
            case 9:
                bx1 bx1Var = bx1.f4905w;
                this.f8635v = new SparseArray();
                this.f8636w = bx1Var;
                this.f8634u = -1;
                return;
            default:
                this.f8635v = new ArrayList();
                this.f8636w = new ArrayList(64);
                this.f8634u = 0;
                return;
        }
    }

    public static nb b(String str, boolean z3) {
        return new nb(str, Boolean.valueOf(z3), 1);
    }

    public static nb g(long j10, String str) {
        return new nb(str, Long.valueOf(j10), 2);
    }

    public int a() {
        int i = this.f8634u;
        if (i != 2) {
            if (i != 3) {
                return 0;
            }
            return 512;
        }
        return 2048;
    }

    @Override // com.google.android.gms.internal.ads.hc
    /* renamed from: c */
    public /* bridge */ /* synthetic */ hc mo211c() {
        return new nb((t) this.f8636w);
    }

    public Object d(int i) {
        SparseArray sparseArray = (SparseArray) this.f8635v;
        if (this.f8634u == -1) {
            this.f8634u = 0;
        }
        while (true) {
            int i10 = this.f8634u;
            if (i10 > 0 && i < sparseArray.keyAt(i10)) {
                this.f8634u--;
            }
        }
        while (this.f8634u < sparseArray.size() - 1 && i >= sparseArray.keyAt(this.f8634u + 1)) {
            this.f8634u++;
        }
        return sparseArray.valueAt(this.f8634u);
    }

    public void e(Object obj, Object obj2) {
        int i = this.f8634u + 1;
        Object[] objArr = (Object[]) this.f8635v;
        int length = objArr.length;
        int i10 = i + i;
        if (i10 > length) {
            this.f8635v = Arrays.copyOf(objArr, y41.d(length, i10));
        }
        ed1.k(obj, obj2);
        Object[] objArr2 = (Object[]) this.f8635v;
        int i11 = this.f8634u;
        int i12 = i11 + i11;
        objArr2[i12] = obj;
        objArr2[i12 + 1] = obj2;
        this.f8634u = i11 + 1;
    }

    public synchronized byte[] f(int i) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.f8636w;
            if (i10 < arrayList.size()) {
                byte[] bArr = (byte[]) arrayList.get(i10);
                int length = bArr.length;
                if (length >= i) {
                    this.f8634u -= length;
                    arrayList.remove(i10);
                    ((ArrayList) this.f8635v).remove(bArr);
                    return bArr;
                }
                i10++;
            } else {
                return new byte[i];
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.hc
    public byte h(oc ocVar, int i) {
        byte[] bArr = (byte[]) this.f8635v;
        int i10 = i >>> 3;
        if (i10 != this.f8634u) {
            ((t) this.f8636w).k(bArr, i10);
            this.f8634u = i10;
        }
        return (byte) (((ocVar.b(i) ^ bArr[i % 8]) << 24) >> 24);
    }

    public void i(fi fiVar) {
        synchronized (this.f8635v) {
            try {
                Iterator it = ((LinkedList) this.f8636w).iterator();
                while (it.hasNext()) {
                    fi fiVar2 = (fi) it.next();
                    k kVar = k.C;
                    if (!kVar.f16817h.g().l()) {
                        if (!fiVar.equals(fiVar2) && fiVar2.f6078o.equals(fiVar.f6078o)) {
                            it.remove();
                            return;
                        }
                    } else if (!kVar.f16817h.g().m() && !fiVar.equals(fiVar2) && fiVar2.f6080q.equals(fiVar.f6080q)) {
                        it.remove();
                        return;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void j(Set set) {
        if (set instanceof Collection) {
            int size = set.size() + this.f8634u;
            Object[] objArr = (Object[]) this.f8635v;
            int length = objArr.length;
            int i = size + size;
            if (i > length) {
                this.f8635v = Arrays.copyOf(objArr, y41.d(length, i));
            }
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            e(entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.ads.hc
    public oc k(oc ocVar, int i, int i10) {
        if (i >= 0 && i <= i10 && i10 <= ocVar.f9089a.length) {
            byte[] bArr = new byte[i10 - i];
            int i11 = 0;
            while (i < i10) {
                bArr[i11] = h(ocVar, i);
                i++;
                i11++;
            }
            return e(bArr);
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // com.google.android.gms.internal.ads.ie0
    /* renamed from: l */
    public /* synthetic */ void mo205l(Object obj) {
        int i = ys1.f12938v0;
        ((ie) obj).c0((ze) this.f8635v, (ze) this.f8636w, this.f8634u);
    }

    public synchronized void m(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            if (length <= 4096) {
                ((ArrayList) this.f8635v).add(bArr);
                ArrayList arrayList = (ArrayList) this.f8636w;
                int binarySearch = Collections.binarySearch(arrayList, bArr, f8633x);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                arrayList.add(binarySearch, bArr);
                this.f8634u += length;
                synchronized (this) {
                    while (this.f8634u > 4096) {
                        byte[] bArr2 = (byte[]) ((ArrayList) this.f8635v).remove(0);
                        ((ArrayList) this.f8636w).remove(bArr2);
                        this.f8634u -= bArr2.length;
                    }
                }
            }
        }
    }

    public d61 n() {
        return q(true);
    }

    public void o(fi fiVar) {
        synchronized (this.f8635v) {
            try {
                LinkedList linkedList = (LinkedList) this.f8636w;
                if (linkedList.size() >= 10) {
                    int size = linkedList.size();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(size).length() + 30);
                    sb2.append("Queue is full, current size = ");
                    sb2.append(size);
                    String sb3 = sb2.toString();
                    int i = a0.f19634b;
                    i.a(sb3);
                    linkedList.remove(0);
                }
                int i10 = this.f8634u;
                this.f8634u = i10 + 1;
                fiVar.f6075l = i10;
                synchronized (fiVar.f6071g) {
                    try {
                        int i11 = fiVar.f6074k;
                        int i12 = fiVar.f6075l;
                        int i13 = fiVar.f6067b;
                        if (!fiVar.f6069d) {
                            i13 = (i12 * i13) + (i11 * fiVar.f6066a);
                        }
                        if (i13 > fiVar.f6077n) {
                            fiVar.f6077n = i13;
                        }
                    } finally {
                    }
                }
                linkedList.add(fiVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Object p() {
        String str = (String) this.f8635v;
        Object obj = this.f8636w;
        pl plVar = (pl) kn.f7811a.get();
        if (plVar == null) {
            if (kn.f7812b.get() == null) {
                return obj;
            }
            q.b();
            return null;
        }
        SharedPreferences sharedPreferences = plVar.f9540a;
        int i = this.f8634u - 1;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return sharedPreferences.getString(str, (String) obj);
                }
                try {
                    return Double.valueOf(sharedPreferences.getFloat(str, (float) r3));
                } catch (ClassCastException unused) {
                    return Double.valueOf(sharedPreferences.getString(str, String.valueOf(((Double) obj).doubleValue())));
                }
            }
            try {
                return Long.valueOf(sharedPreferences.getLong(str, ((Long) obj).longValue()));
            } catch (ClassCastException unused2) {
                return Long.valueOf(sharedPreferences.getInt(str, (int) r3));
            }
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        try {
            return Boolean.valueOf(sharedPreferences.getBoolean(str, booleanValue));
        } catch (ClassCastException unused3) {
            return Boolean.valueOf(sharedPreferences.getString(str, String.valueOf(booleanValue)));
        }
    }

    public d61 q(boolean z3) {
        e51 e51Var;
        e51 e51Var2;
        if (z3 && (e51Var2 = (e51) this.f8636w) != null) {
            throw e51Var2.a();
        }
        d61 e = d61.e(this.f8634u, (Object[]) this.f8635v, this);
        if (z3 && (e51Var = (e51) this.f8636w) != null) {
            throw e51Var.a();
        }
        return e;
    }

    @Override // com.google.android.gms.internal.ads.g2
    public f2 t(o2 o2Var, long j10) {
        long j11;
        long n10 = o2Var.n();
        int min = (int) Math.min(112800L, o2Var.p() - n10);
        xk0 xk0Var = (xk0) this.f8636w;
        xk0Var.y(min);
        o2Var.y(xk0Var.f12580a, 0, min);
        int i = xk0Var.f12582c;
        long j12 = -1;
        long j13 = -1;
        long j14 = -9223372036854775807L;
        while (true) {
            if (xk0Var.B() >= 188) {
                byte[] bArr = xk0Var.f12580a;
                int i10 = xk0Var.f12581b;
                while (true) {
                    if (i10 < i) {
                        j11 = -9223372036854775807L;
                        if (bArr[i10] == 71) {
                            break;
                        }
                        i10++;
                    } else {
                        j11 = -9223372036854775807L;
                        break;
                    }
                }
                int i11 = i10 + 188;
                if (i11 > i) {
                    break;
                }
                long w10 = x21.w(xk0Var, i10, this.f8634u);
                if (w10 != j11) {
                    long c10 = ((dp0) this.f8635v).c(w10);
                    if (c10 > j10) {
                        if (j14 == j11) {
                            return new f2(c10, -1, n10);
                        }
                        return new f2(-9223372036854775807L, 0, n10 + j13);
                    }
                    j14 = c10;
                    long j15 = i10;
                    if (100000 + j14 > j10) {
                        return new f2(-9223372036854775807L, 0, n10 + j15);
                    }
                    j13 = j15;
                }
                xk0Var.E(i11);
                j12 = i11;
            } else {
                j11 = -9223372036854775807L;
                break;
            }
        }
        if (j14 != j11) {
            return new f2(j14, -2, n10 + j12);
        }
        return f2.f5884d;
    }

    @Override // com.google.android.gms.internal.ads.g2
    public void zzb() {
        byte[] bArr = bq0.f4861b;
        int length = bArr.length;
        ((xk0) this.f8636w).z(bArr, 0);
    }

    public nb(String str, Object obj, int i) {
        this.f8635v = str;
        this.f8636w = obj;
        this.f8634u = i;
    }

    public nb(t tVar) {
        this.f8634u = -1;
        this.f8635v = new byte[8];
        this.f8636w = tVar;
    }

    public nb(int i) {
        this.f8635v = new Object[i + i];
        this.f8634u = 0;
    }
}
