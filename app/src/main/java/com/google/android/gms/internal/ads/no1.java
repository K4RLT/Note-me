package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class no1 extends om1 {
    public static final int[] B = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    public final int A;

    /* renamed from: w, reason: collision with root package name */
    public final int f8791w;

    /* renamed from: x, reason: collision with root package name */
    public final om1 f8792x;

    /* renamed from: y, reason: collision with root package name */
    public final om1 f8793y;

    /* renamed from: z, reason: collision with root package name */
    public final int f8794z;

    public no1(om1 om1Var, om1 om1Var2) {
        this.f8792x = om1Var;
        this.f8793y = om1Var2;
        int k3 = om1Var.k();
        this.f8794z = k3;
        this.f8791w = om1Var2.k() + k3;
        this.A = Math.max(om1Var.w(), om1Var2.w()) + 1;
    }

    public static int D(int i) {
        if (i >= 47) {
            return Integer.MAX_VALUE;
        }
        return B[i];
    }

    @Override // com.google.android.gms.internal.ads.om1
    public final byte g(int i) {
        int i10 = this.f8794z;
        if (i < i10) {
            return this.f8792x.g(i);
        }
        return this.f8793y.g(i - i10);
    }

    @Override // com.google.android.gms.internal.ads.om1, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new ko1(this);
    }

    @Override // com.google.android.gms.internal.ads.om1
    public final int k() {
        return this.f8791w;
    }

    @Override // com.google.android.gms.internal.ads.om1
    public final om1 n(int i, int i10) {
        return o(i, i10);
    }

    @Override // com.google.android.gms.internal.ads.om1
    public final om1 o(int i, int i10) {
        int i11 = this.f8791w;
        int b10 = om1.b(i, i10, i11);
        if (b10 == 0) {
            return om1.f9167v;
        }
        if (b10 == i11) {
            return this;
        }
        om1 om1Var = this.f8792x;
        int i12 = this.f8794z;
        if (i10 <= i12) {
            return om1Var.n(i, i10);
        }
        int i13 = i10 - i12;
        om1 om1Var2 = this.f8793y;
        if (i >= i12) {
            return om1Var2.n(i - i12, i13);
        }
        return new no1(om1Var.n(i, om1Var.k()), om1Var2.n(0, i13));
    }

    @Override // com.google.android.gms.internal.ads.om1
    public final void p(int i, int i10, int i11, byte[] bArr) {
        int i12 = i + i11;
        om1 om1Var = this.f8792x;
        int i13 = this.f8794z;
        if (i12 <= i13) {
            om1Var.p(i, i10, i11, bArr);
            return;
        }
        om1 om1Var2 = this.f8793y;
        if (i >= i13) {
            om1Var2.p(i - i13, i10, i11, bArr);
            return;
        }
        int i14 = i13 - i;
        om1Var.p(i, i10, i14, bArr);
        om1Var2.p(0, i10 + i14, i11 - i14, bArr);
    }

    @Override // com.google.android.gms.internal.ads.om1
    public final void r(um1 um1Var) {
        this.f8792x.r(um1Var);
        this.f8793y.r(um1Var);
    }

    @Override // com.google.android.gms.internal.ads.om1
    public final boolean s(om1 om1Var) {
        boolean D;
        mo1 mo1Var = new mo1(this);
        lm1 next = mo1Var.next();
        mo1 mo1Var2 = new mo1(om1Var);
        lm1 next2 = mo1Var2.next();
        int i = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int k3 = next.k() - i;
            int k4 = next2.k() - i10;
            int min = Math.min(k3, k4);
            if (i == 0) {
                D = next.D(next2, i10, min);
            } else {
                D = next2.D(next, i, min);
            }
            if (!D) {
                return false;
            }
            i11 += min;
            int i12 = this.f8791w;
            if (i11 >= i12) {
                if (i11 == i12) {
                    return true;
                }
                g5.q.l();
                return false;
            }
            if (min == k3) {
                i = 0;
                next = mo1Var.next();
            } else {
                i += min;
                next = next;
            }
            if (min == k4) {
                next2 = mo1Var2.next();
                i10 = 0;
            } else {
                i10 += min;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.om1
    public final int u(int i, int i10, int i11) {
        int i12 = i10 + i11;
        om1 om1Var = this.f8792x;
        int i13 = this.f8794z;
        if (i12 <= i13) {
            return om1Var.u(i, i10, i11);
        }
        om1 om1Var2 = this.f8793y;
        if (i10 >= i13) {
            return om1Var2.u(i, i10 - i13, i11);
        }
        int i14 = i13 - i10;
        return om1Var2.u(om1Var.u(i, i10, i14), 0, i11 - i14);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.qn1, java.io.InputStream] */
    @Override // com.google.android.gms.internal.ads.om1
    public final rm1 v() {
        boolean z3;
        lm1 lm1Var;
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque(this.A);
        arrayDeque.push(this);
        om1 om1Var = this.f8792x;
        while (om1Var instanceof no1) {
            no1 no1Var = (no1) om1Var;
            arrayDeque.push(no1Var);
            om1Var = no1Var.f8792x;
        }
        lm1 lm1Var2 = (lm1) om1Var;
        while (true) {
            if (lm1Var2 != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                if (lm1Var2 == null) {
                    l4.a.c();
                    return null;
                }
                while (true) {
                    if (arrayDeque.isEmpty()) {
                        lm1Var = null;
                        break;
                    }
                    om1 om1Var2 = ((no1) arrayDeque.pop()).f8793y;
                    while (om1Var2 instanceof no1) {
                        no1 no1Var2 = (no1) om1Var2;
                        arrayDeque.push(no1Var2);
                        om1Var2 = no1Var2.f8792x;
                    }
                    lm1Var = (lm1) om1Var2;
                    if (lm1Var.k() == 0) {
                    }
                }
                arrayList.add(lm1Var2.q());
                lm1Var2 = lm1Var;
            } else {
                ?? inputStream = new InputStream();
                inputStream.f9910u = arrayList.iterator();
                inputStream.f9912w = 0;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    inputStream.f9912w++;
                }
                inputStream.f9913x = -1;
                if (!inputStream.f()) {
                    inputStream.f9911v = ln1.f8075b;
                    inputStream.f9914y = 0;
                }
                return new qm1(inputStream);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.om1
    public final int w() {
        return this.A;
    }

    @Override // com.google.android.gms.internal.ads.om1
    public final boolean x() {
        if (this.f8791w >= D(this.A)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.om1
    /* renamed from: y */
    public final m61 iterator() {
        return new ko1(this);
    }
}
