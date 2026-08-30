package r0;
import b2.t;
import l.a;
import n.d0;
import n.v;
import n.w;
import n1.b;
import r0.d2;
import r0.e2;
import r0.s;
import s.c;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class e2 {

    /* renamed from: a, reason: collision with root package name */
    public final b2 f24217a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f24218b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f24219c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f24220d;
    public HashMap e;

    /* renamed from: f, reason: collision with root package name */
    public w f24221f;

    /* renamed from: g, reason: collision with root package name */
    public int f24222g;

    /* renamed from: h, reason: collision with root package name */
    public int f24223h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f24224j;

    /* renamed from: k, reason: collision with root package name */
    public int f24225k;

    /* renamed from: l, reason: collision with root package name */
    public int f24226l;

    /* renamed from: m, reason: collision with root package name */
    public int f24227m;

    /* renamed from: n, reason: collision with root package name */
    public int f24228n;

    /* renamed from: o, reason: collision with root package name */
    public int f24229o;

    /* renamed from: p, reason: collision with root package name */
    public final t f24230p;

    /* renamed from: q, reason: collision with root package name */
    public final t f24231q;

    /* renamed from: r, reason: collision with root package name */
    public final t f24232r;

    /* renamed from: s, reason: collision with root package name */
    public w f24233s;

    /* renamed from: t, reason: collision with root package name */
    public int f24234t;

    /* renamed from: u, reason: collision with root package name */
    public int f24235u;

    /* renamed from: v, reason: collision with root package name */
    public int f24236v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f24237w;

    /* renamed from: x, reason: collision with root package name */
    public v f24238x;

    public e2(b2 b2Var) {
        this.f24217a = b2Var;
        int[] iArr = b2Var.f24191u;
        this.f24218b = iArr;
        Object[] objArr = b2Var.f24193w;
        this.f24219c = objArr;
        this.f24220d = b2Var.C;
        this.e = b2Var.D;
        this.f24221f = b2Var.E;
        int i = b2Var.f24192v;
        this.f24222g = i;
        this.f24223h = (iArr.length / 5) - i;
        int i10 = b2Var.f24194x;
        this.f24225k = i10;
        this.f24226l = objArr.length - i10;
        this.f24227m = i;
        this.f24230p = new t(3, (byte) 0);
        this.f24231q = new t(3, (byte) 0);
        this.f24232r = new t(3, (byte) 0);
        this.f24235u = i;
        this.f24236v = -1;
    }

    public static int i(int i, int i10, int i11, int i12) {
        if (i > i10) {
            return -(((i12 - i11) - i) + 1);
        }
        return i;
    }

    public static void y(e2 e2Var) {
        int i = e2Var.f24236v;
        int r8 = e2Var.r(i);
        int[] iArr = e2Var.f24218b;
        int i10 = (r8 * 5) + 1;
        int i11 = iArr[i10];
        if ((i11 & 134217728) == 0) {
            int i12 = (i11 & (-134217729)) | 134217728;
            iArr[i10] = i12;
            if ((67108864 & i12) != 0) {
                return;
            }
            e2Var.S(e2Var.D(i, iArr));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        r2 = r8.f24218b;
        r3 = r9 * 5;
        r4 = r0 * 5;
        r5 = r1 * 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0063, code lost:
    
        if (r9 >= r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0065, code lost:
    
        qe.k.c(r4 + r3, r3, r5, r2, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006a, code lost:
    
        qe.k.c(r5, r5 + r4, r3 + r4, r2, r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A(int r9) {
        /*
            r8 = this;
            int r0 = r8.f24223h
            int r1 = r8.f24222g
            if (r1 == r9) goto Lab
            java.util.ArrayList r2 = r8.f24220d
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L59
            int r2 = r8.f24223h
            int r3 = r8.o()
            int r3 = r3 - r2
            java.util.ArrayList r2 = r8.f24220d
            if (r1 >= r9) goto L39
            int r2 = d2.a(r2, r1, r3)
        L1d:
            java.util.ArrayList r4 = r8.f24220d
            int r4 = r4.size()
            if (r2 >= r4) goto L59
            java.util.ArrayList r4 = r8.f24220d
            java.lang.Object r4 = r4.get(r2)
            a r4 = (a) r4
            int r5 = r4.f24176a
            if (r5 >= 0) goto L59
            int r5 = r5 + r3
            if (r5 >= r9) goto L59
            r4.f24176a = r5
            int r2 = r2 + 1
            goto L1d
        L39:
            int r2 = d2.a(r2, r9, r3)
        L3d:
            java.util.ArrayList r4 = r8.f24220d
            int r4 = r4.size()
            if (r2 >= r4) goto L59
            java.util.ArrayList r4 = r8.f24220d
            java.lang.Object r4 = r4.get(r2)
            a r4 = (a) r4
            int r5 = r4.f24176a
            if (r5 < 0) goto L59
            int r5 = r3 - r5
            int r5 = -r5
            r4.f24176a = r5
            int r2 = r2 + 1
            goto L3d
        L59:
            if (r0 <= 0) goto L70
            int[] r2 = r8.f24218b
            int r3 = r9 * 5
            int r4 = r0 * 5
            int r5 = r1 * 5
            if (r9 >= r1) goto L6a
            int r4 = r4 + r3
            qe.k.c(r4, r3, r5, r2, r2)
            goto L70
        L6a:
            int r6 = r5 + r4
            int r3 = r3 + r4
            qe.k.c(r5, r6, r3, r2, r2)
        L70:
            if (r9 >= r1) goto L74
            int r1 = r9 + r0
        L74:
            int r2 = r8.o()
            if (r1 >= r2) goto L7b
            goto L80
        L7b:
            java.lang.String r3 = "Check failed"
            c(r3)
        L80:
            if (r1 >= r2) goto Lab
            int[] r3 = r8.f24218b
            int r4 = r1 * 5
            int r4 = r4 + 2
            r3 = r3[r4]
            r5 = -2
            if (r3 <= r5) goto L8f
            r6 = r3
            goto L95
        L8f:
            int r6 = r8.p()
            int r6 = r6 + r3
            int r6 = r6 - r5
        L95:
            if (r6 >= r9) goto L98
            goto L9f
        L98:
            int r7 = r8.p()
            int r7 = r7 - r6
            int r7 = r7 - r5
            int r6 = -r7
        L9f:
            if (r6 == r3) goto La5
            int[] r3 = r8.f24218b
            r3[r4] = r6
        La5:
            int r1 = r1 + 1
            if (r1 != r9) goto L80
            int r1 = r1 + r0
            goto L80
        Lab:
            r8.f24222g = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.e2.A(int):void");
    }

    public final void B(int i, int i10) {
        int i11 = this.f24226l;
        int i12 = this.f24225k;
        int i13 = this.f24227m;
        if (i12 != i) {
            Object[] objArr = this.f24219c;
            if (i < i12) {
                System.arraycopy(objArr, i, objArr, i + i11, i12 - i);
            } else {
                int i14 = i12 + i11;
                System.arraycopy(objArr, i14, objArr, i12, (i + i11) - i14);
            }
        }
        int min = Math.min(i10 + 1, p());
        if (i13 != min) {
            int length = this.f24219c.length - i11;
            if (min < i13) {
                int r8 = r(min);
                int r10 = r(i13);
                int i15 = this.f24222g;
                while (r8 < r10) {
                    int i16 = (r8 * 5) + 4;
                    int i17 = this.f24218b[i16];
                    if (i17 < 0) {
                        c("Unexpected anchor value, expected a positive anchor");
                    }
                    this.f24218b[i16] = -((length - i17) + 1);
                    r8++;
                    if (r8 == i15) {
                        r8 += this.f24223h;
                    }
                }
            } else {
                int r11 = r(i13);
                int r12 = r(min);
                while (r11 < r12) {
                    int i18 = (r11 * 5) + 4;
                    int i19 = this.f24218b[i18];
                    if (i19 >= 0) {
                        c("Unexpected anchor value, expected a negative anchor");
                    }
                    this.f24218b[i18] = i19 + length + 1;
                    r11++;
                    if (r11 == this.f24222g) {
                        r11 += this.f24223h;
                    }
                }
            }
            this.f24227m = min;
        }
        this.f24225k = i;
    }

    public final Object C(int i) {
        int r8 = r(i);
        int[] iArr = this.f24218b;
        if ((iArr[(r8 * 5) + 1] & 1073741824) != 0) {
            return this.f24219c[h(g(r8, iArr))];
        }
        return null;
    }

    public final int D(int i, int[] iArr) {
        int i10 = iArr[(r(i) * 5) + 2];
        if (i10 > -2) {
            return i10;
        }
        return (p() + i10) - (-2);
    }

    public final Object E(Object obj) {
        if (this.f24228n > 0) {
            w(1, this.f24236v);
        }
        Object[] objArr = this.f24219c;
        int i = this.i;
        this.i = i + 1;
        Object obj2 = objArr[h(i)];
        if (this.i > this.f24224j) {
            c("Writing to an invalid slot");
        }
        this.f24219c[h(this.i - 1)] = obj;
        return obj2;
    }

    public final void F() {
        int i;
        int i10;
        v vVar = this.f24238x;
        if (vVar != null) {
            while (vVar.f20953b != 0) {
                int K = y.K(vVar);
                int r8 = r(K);
                int i11 = K + 1;
                int t3 = t(K) + K;
                while (true) {
                    i = 0;
                    if (i11 < t3) {
                        if ((this.f24218b[(r(i11) * 5) + 1] & 201326592) != 0) {
                            i10 = 1;
                            break;
                        }
                        i11 += t(i11);
                    } else {
                        i10 = 0;
                        break;
                    }
                }
                int[] iArr = this.f24218b;
                int i12 = (r8 * 5) + 1;
                int i13 = iArr[i12];
                if ((67108864 & i13) != 0) {
                    i = 1;
                }
                if (i != i10) {
                    iArr[i12] = (i10 << 26) | ((-67108865) & i13);
                    int D = D(K, iArr);
                    if (D >= 0) {
                        y.k(vVar, D);
                    }
                }
            }
        }
    }

    public final boolean G() {
        if (this.f24228n != 0) {
            c("Cannot remove group while inserting");
        }
        int i = this.f24234t;
        int i10 = this.i;
        int g8 = g(r(i), this.f24218b);
        int K = K();
        N(this.f24236v);
        v vVar = this.f24238x;
        if (vVar != null) {
            while (true) {
                int i11 = vVar.f20953b;
                if (i11 == 0) {
                    break;
                }
                if (i11 != 0) {
                    if (vVar.f20952a[0] < i) {
                        break;
                    }
                    y.K(vVar);
                } else {
                    l4.a.h("IntList is empty.");
                    return false;
                }
            }
        }
        boolean H = H(i, this.f24234t - i);
        I(g8, this.i - g8, i - 1);
        this.f24234t = i;
        this.i = i10;
        this.f24229o -= K;
        return H;
    }

    public final boolean H(int i, int i10) {
        boolean z3 = false;
        if (i10 > 0) {
            ArrayList arrayList = this.f24220d;
            A(i);
            if (!arrayList.isEmpty()) {
                HashMap hashMap = this.e;
                int i11 = i + i10;
                int a10 = d2.a(this.f24220d, i11, o() - this.f24223h);
                if (a10 >= this.f24220d.size()) {
                    a10--;
                }
                int i12 = a10 + 1;
                int i13 = 0;
                while (a10 >= 0) {
                    a aVar = (a) this.f24220d.get(a10);
                    int c10 = c(aVar);
                    if (c10 < i) {
                        break;
                    }
                    if (c10 < i11) {
                        aVar.f24176a = Integer.MIN_VALUE;
                        if (hashMap != null) {
                        }
                        if (i13 == 0) {
                            i13 = a10 + 1;
                        }
                        i12 = a10;
                    }
                    a10--;
                }
                if (i12 < i13) {
                    z3 = true;
                }
                if (z3) {
                    this.f24220d.subList(i12, i13).clear();
                }
            }
            this.f24222g = i;
            this.f24223h += i10;
            int i14 = this.f24227m;
            if (i14 > i) {
                this.f24227m = Math.max(i, i14 - i10);
            }
            int i15 = this.f24235u;
            if (i15 >= this.f24222g) {
                this.f24235u = i15 - i10;
            }
            int i16 = this.f24236v;
            if (i16 >= 0 && (this.f24218b[(r(i16) * 5) + 1] & 67108864) != 0) {
                S(i16);
            }
        }
        return z3;
    }

    public final void I(int i, int i10, int i11) {
        if (i10 > 0) {
            int i12 = this.f24226l;
            int i13 = i + i10;
            B(i13, i11);
            this.f24225k = i;
            this.f24226l = i12 + i10;
            Arrays.fill(this.f24219c, i, i13, (Object) null);
            int i14 = this.f24224j;
            if (i14 >= i) {
                this.f24224j = i14 - i10;
            }
        }
    }

    public final Object J(int i, Object obj, int i10) {
        int M = M(r(i), this.f24218b);
        int g8 = g(r(i + 1), this.f24218b);
        int i11 = M + i10;
        if (i11 < M || i11 >= g8) {
            c("Write to an invalid slot index " + i10 + " for group " + i);
        }
        int h3 = h(i11);
        Object[] objArr = this.f24219c;
        Object obj2 = objArr[h3];
        objArr[h3] = obj;
        return obj2;
    }

    public final int K() {
        int r8 = r(this.f24234t);
        int i = this.f24234t;
        int[] iArr = this.f24218b;
        int i10 = r8 * 5;
        int i11 = iArr[i10 + 3] + i;
        this.f24234t = i11;
        this.i = g(r(i11), iArr);
        int i12 = this.f24218b[i10 + 1];
        if ((1073741824 & i12) != 0) {
            return 1;
        }
        return i12 & 67108863;
    }

    public final void L() {
        int i = this.f24235u;
        this.f24234t = i;
        this.i = g(r(i), this.f24218b);
    }

    public final int M(int i, int[] iArr) {
        if (i >= o()) {
            return this.f24219c.length - this.f24226l;
        }
        int b10 = d2.b(i, iArr);
        int i10 = this.f24226l;
        int length = this.f24219c.length;
        if (b10 < 0) {
            return (length - i10) + b10 + 1;
        }
        return b10;
    }

    public final o0 N(int i) {
        a Q;
        HashMap hashMap = this.e;
        if (hashMap == null || (Q = Q(i)) == null) {
            return null;
        }
        return (o0) hashMap.get(Q);
    }

    public final void O() {
        if (this.f24228n != 0) {
            c("Key must be supplied when inserting");
        }
        v0 v0Var = l.f24285a;
        P(0, v0Var, v0Var, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void P(int i, Object obj, Object obj2, boolean z3) {
        Object[] objArr;
        int i10;
        int i11;
        int i12;
        int i13 = this.f24236v;
        if (this.f24228n > 0) {
            objArr = true;
        } else {
            objArr = false;
        }
        this.f24232r.e(this.f24229o);
        v0 v0Var = l.f24285a;
        if (objArr != false) {
            int i14 = this.f24234t;
            int g8 = g(r(i14), this.f24218b);
            v(1);
            this.i = g8;
            this.f24224j = g8;
            int r8 = r(i14);
            if (obj != v0Var) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            if (!z3 && obj2 != v0Var) {
                i12 = 1;
            } else {
                i12 = 0;
            }
            int i15 = i(g8, this.f24225k, this.f24226l, this.f24219c.length);
            if (i15 >= 0 && this.f24227m < i14) {
                i15 = -(((this.f24219c.length - this.f24226l) - i15) + 1);
            }
            int[] iArr = this.f24218b;
            int i16 = this.f24236v;
            int i17 = r8 * 5;
            iArr[i17] = i;
            iArr[i17 + 1] = ((z3 ? 1 : 0) << 30) | (i11 << 29) | (i12 << 28);
            iArr[i17 + 2] = i16;
            iArr[i17 + 3] = 0;
            iArr[i17 + 4] = i15;
            int i18 = (z3 ? 1 : 0) + i11 + i12;
            if (i18 > 0) {
                w(i18, i14);
                Object[] objArr2 = this.f24219c;
                int i19 = this.i;
                if (z3) {
                    objArr2[i19] = obj2;
                    i19++;
                }
                if (i11 != 0) {
                    objArr2[i19] = obj;
                    i19++;
                }
                if (i12 != 0) {
                    objArr2[i19] = obj2;
                    i19++;
                }
                this.i = i19;
            }
            this.f24229o = 0;
            i10 = i14 + 1;
            this.f24236v = i14;
            this.f24234t = i10;
            if (i13 >= 0) {
                N(i13);
            }
        } else {
            this.f24230p.e(i13);
            this.f24231q.e((o() - this.f24223h) - this.f24235u);
            int i20 = this.f24234t;
            int r10 = r(i20);
            if (!kotlin.jvm.internal.a(obj2, v0Var)) {
                if (z3) {
                    T(this.f24234t, obj2);
                } else {
                    R(obj2);
                }
            }
            this.i = M(r10, this.f24218b);
            this.f24224j = g(r(this.f24234t + 1), this.f24218b);
            int[] iArr2 = this.f24218b;
            int i21 = r10 * 5;
            this.f24229o = iArr2[i21 + 1] & 67108863;
            this.f24236v = i20;
            this.f24234t = i20 + 1;
            i10 = i20 + iArr2[i21 + 3];
        }
        this.f24235u = i10;
    }

    public final a Q(int i) {
        ArrayList arrayList;
        int d2;
        if (i < 0 || i >= p() || (d2 = d2.d((arrayList = this.f24220d), i, p())) < 0) {
            return null;
        }
        return (a) arrayList.get(d2);
    }

    public final void R(Object obj) {
        int r8 = r(this.f24234t);
        int i = (r8 * 5) + 1;
        if ((this.f24218b[i] & 268435456) == 0) {
            c("Updating the data of a group that was not created with a data slot");
        }
        Object[] objArr = this.f24219c;
        int[] iArr = this.f24218b;
        objArr[h(Integer.bitCount(iArr[i] >> 29) + g(r8, iArr))] = obj;
    }

    public final void S(int i) {
        if (i >= 0) {
            v vVar = this.f24238x;
            if (vVar == null) {
                vVar = new v();
                this.f24238x = vVar;
            }
            y.k(vVar, i);
        }
    }

    public final void T(int i, Object obj) {
        int r8 = r(i);
        int[] iArr = this.f24218b;
        if (r8 >= iArr.length || (iArr[(r8 * 5) + 1] & 1073741824) == 0) {
            c("Updating the node of a group at " + i + " that was not created with as a node group");
        }
        this.f24219c[h(g(r8, this.f24218b))] = obj;
    }

    public final void a(int i) {
        if (i < 0) {
            c("Cannot seek backwards");
        }
        if (this.f24228n > 0) {
            b("Cannot call seek() while inserting");
        }
        if (i == 0) {
            return;
        }
        int i10 = this.f24234t + i;
        if (i10 < this.f24236v || i10 > this.f24235u) {
            c("Cannot seek outside the current group (" + this.f24236v + '-' + this.f24235u + ')');
        }
        this.f24234t = i10;
        int g8 = g(r(i10), this.f24218b);
        this.i = g8;
        this.f24224j = g8;
    }

    public final a b(int i) {
        ArrayList arrayList = this.f24220d;
        int d2 = d2.d(arrayList, i, p());
        if (d2 < 0) {
            if (i > this.f24222g) {
                i = -(p() - i);
            }
            a aVar = new a(i);
            arrayList.add(-(d2 + 1), aVar);
            return aVar;
        }
        return (a) arrayList.get(d2);
    }

    public final int c(a aVar) {
        int i = aVar.f24176a;
        if (i < 0) {
            return p() + i;
        }
        return i;
    }

    public final void d() {
        int i = this.f24228n;
        this.f24228n = i + 1;
        if (i == 0) {
            this.f24231q.e((o() - this.f24223h) - this.f24235u);
        }
    }

    public final void e(boolean z3) {
        this.f24237w = true;
        if (z3 && this.f24230p.f1592a == 0) {
            A(p());
            B(this.f24219c.length - this.f24226l, this.f24222g);
            int i = this.f24225k;
            Arrays.fill(this.f24219c, i, this.f24226l + i, (Object) null);
            F();
        }
        int[] iArr = this.f24218b;
        int i10 = this.f24222g;
        Object[] objArr = this.f24219c;
        int i11 = this.f24225k;
        ArrayList arrayList = this.f24220d;
        HashMap hashMap = this.e;
        w wVar = this.f24221f;
        b2 b2Var = this.f24217a;
        if (!b2Var.A) {
            a("Unexpected writer close()");
        }
        b2Var.A = false;
        b2Var.f24191u = iArr;
        b2Var.f24192v = i10;
        b2Var.f24193w = objArr;
        b2Var.f24194x = i11;
        b2Var.C = arrayList;
        b2Var.D = hashMap;
        b2Var.E = wVar;
    }

    public final int f(int i) {
        return g(r(i), this.f24218b);
    }

    public final int g(int i, int[] iArr) {
        if (i >= o()) {
            return this.f24219c.length - this.f24226l;
        }
        int i10 = iArr[(i * 5) + 4];
        int i11 = this.f24226l;
        int length = this.f24219c.length;
        if (i10 < 0) {
            return (length - i11) + i10 + 1;
        }
        return i10;
    }

    public final int h(int i) {
        int i10;
        int i11 = this.f24226l;
        if (i < this.f24225k) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        return (i11 * i10) + i;
    }

    public final void j() {
        boolean z3;
        boolean z9;
        int i;
        int r8;
        d0 d0Var;
        int i10 = 0;
        if (this.f24228n > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        int i11 = this.f24234t;
        int i12 = this.f24235u;
        int i13 = this.f24236v;
        int r10 = r(i13);
        int i14 = this.f24229o;
        int i15 = i11 - i13;
        int i16 = r10 * 5;
        int i17 = i16 + 1;
        if ((this.f24218b[i17] & 1073741824) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        t tVar = this.f24232r;
        if (z3) {
            w wVar = this.f24233s;
            if (wVar != null && (d0Var = (d0) wVar.b(i13)) != null) {
                Object[] objArr = d0Var.f20855a;
                int i18 = d0Var.f20856b;
                for (int i19 = 0; i19 < i18; i19++) {
                    E(objArr[i19]);
                }
            }
            int[] iArr = this.f24218b;
            iArr[i16 + 3] = i15;
            d2.c(iArr, r10, i14);
            int d2 = tVar.d();
            if (z9) {
                i14 = 1;
            }
            this.f24229o = d2 + i14;
            int D = D(i13, this.f24218b);
            this.f24236v = D;
            if (D < 0) {
                r8 = p();
            } else {
                r8 = r(D + 1);
            }
            if (r8 >= 0) {
                i10 = g(r8, this.f24218b);
            }
            this.i = i10;
            this.f24224j = i10;
            return;
        }
        if (i11 != i12) {
            c("Expected to be at the end of a group");
        }
        int[] iArr2 = this.f24218b;
        int i20 = i16 + 3;
        int i21 = iArr2[i20];
        int i22 = iArr2[i17] & 67108863;
        iArr2[i20] = i15;
        d2.c(iArr2, r10, i14);
        int d10 = this.f24230p.d();
        this.f24235u = (o() - this.f24223h) - this.f24231q.d();
        this.f24236v = d10;
        int D2 = D(i13, this.f24218b);
        int d11 = tVar.d();
        this.f24229o = d11;
        if (D2 == d10) {
            if (!z9) {
                i10 = i14 - i22;
            }
            this.f24229o = d11 + i10;
            return;
        }
        int i23 = i15 - i21;
        if (z9) {
            i = 0;
        } else {
            i = i14 - i22;
        }
        if (i23 != 0 || i != 0) {
            while (D2 != 0 && D2 != d10 && (i != 0 || i23 != 0)) {
                int r11 = r(D2);
                if (i23 != 0) {
                    int[] iArr3 = this.f24218b;
                    int i24 = (r11 * 5) + 3;
                    iArr3[i24] = iArr3[i24] + i23;
                }
                if (i != 0) {
                    int[] iArr4 = this.f24218b;
                    d2.c(iArr4, r11, (iArr4[(r11 * 5) + 1] & 67108863) + i);
                }
                int[] iArr5 = this.f24218b;
                if ((iArr5[(r11 * 5) + 1] & 1073741824) != 0) {
                    i = 0;
                }
                D2 = D(D2, iArr5);
            }
        }
        this.f24229o += i;
    }

    public final void k() {
        if (this.f24228n <= 0) {
            b("Unbalanced begin/end insert");
        }
        int i = this.f24228n - 1;
        this.f24228n = i;
        if (i == 0) {
            if (this.f24232r.f1592a != this.f24230p.f1592a) {
                c("startGroup/endGroup mismatch while inserting");
            }
            this.f24235u = (o() - this.f24223h) - this.f24231q.d();
        }
    }

    public final void l(int i) {
        boolean z3;
        boolean z9 = false;
        if (this.f24228n <= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            c("Cannot call ensureStarted() while inserting");
        }
        int i10 = this.f24236v;
        if (i10 != i) {
            if (i >= i10 && i < this.f24235u) {
                z9 = true;
            }
            if (!z9) {
                c("Started group at " + i + " must be a subgroup of the group at " + i10);
            }
            int i11 = this.f24234t;
            int i12 = this.i;
            int i13 = this.f24224j;
            this.f24234t = i;
            O();
            this.f24234t = i11;
            this.i = i12;
            this.f24224j = i13;
        }
    }

    public final void m(int i, int i10, int i11) {
        if (i >= this.f24222g) {
            i = -((p() - i) + 2);
        }
        while (i11 < i10) {
            this.f24218b[(r(i11) * 5) + 2] = i;
            int i12 = this.f24218b[(r(i11) * 5) + 3] + i11;
            m(i11, i12, i11 + 1);
            i11 = i12;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ec, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(int r19, df.p r20) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.e2.n(int, df.p):void");
    }

    public final int o() {
        return this.f24218b.length / 5;
    }

    public final int p() {
        return o() - this.f24223h;
    }

    public final Object q(int i) {
        int r8 = r(i);
        int[] iArr = this.f24218b;
        int i10 = (r8 * 5) + 1;
        if ((iArr[i10] & 268435456) != 0) {
            return this.f24219c[Integer.bitCount(iArr[i10] >> 29) + g(r8, iArr)];
        }
        return l.f24285a;
    }

    public final int r(int i) {
        int i10;
        int i11 = this.f24223h;
        if (i < this.f24222g) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        return (i11 * i10) + i;
    }

    public final Object s(int i) {
        int r8 = r(i);
        int[] iArr = this.f24218b;
        int i10 = r8 * 5;
        int i11 = iArr[i10 + 1];
        if ((536870912 & i11) != 0) {
            return this.f24219c[Integer.bitCount(i11 >> 30) + iArr[i10 + 4]];
        }
        return null;
    }

    public final int t(int i) {
        return this.f24218b[(r(i) * 5) + 3];
    }

    public final String toString() {
        return "SlotWriter(current = " + this.f24234t + " end=" + this.f24235u + " size = " + p() + " gap=" + this.f24222g + '-' + (this.f24222g + this.f24223h) + ')';
    }

    public final boolean u(int i, int i10) {
        int o10;
        int t3;
        if (i10 == this.f24236v) {
            o10 = this.f24235u;
        } else {
            t tVar = this.f24230p;
            if (i10 > tVar.c(0)) {
                t3 = t(i10);
            } else {
                int[] iArr = tVar.f1593b;
                int min = Math.min(iArr.length, tVar.f1592a);
                int i11 = 0;
                while (true) {
                    if (i11 < min) {
                        if (iArr[i11] == i10) {
                            break;
                        }
                        i11++;
                    } else {
                        i11 = -1;
                        break;
                    }
                }
                if (i11 < 0) {
                    t3 = t(i10);
                } else {
                    o10 = (o() - this.f24223h) - this.f24231q.f1593b[i11];
                }
            }
            o10 = t3 + i10;
        }
        if (i <= i10 || i >= o10) {
            return false;
        }
        return true;
    }

    public final void v(int i) {
        int i10;
        if (i > 0) {
            int i11 = this.f24234t;
            A(i11);
            int i12 = this.f24222g;
            int i13 = this.f24223h;
            int[] iArr = this.f24218b;
            int length = iArr.length / 5;
            int i14 = length - i13;
            int i15 = 0;
            if (i13 < i) {
                int max = Math.max(Math.max(length * 2, i14 + i), 32);
                int[] iArr2 = new int[max * 5];
                int i16 = max - i14;
                qe.k.c(0, 0, i12 * 5, iArr, iArr2);
                qe.k.c((i12 + i16) * 5, (i13 + i12) * 5, length * 5, iArr, iArr2);
                this.f24218b = iArr2;
                i13 = i16;
            }
            int i17 = this.f24235u;
            if (i17 >= i12) {
                this.f24235u = i17 + i;
            }
            int i18 = i12 + i;
            this.f24222g = i18;
            this.f24223h = i13 - i;
            if (i14 > 0) {
                i10 = f(i11 + i);
            } else {
                i10 = 0;
            }
            if (this.f24227m >= i12) {
                i15 = this.f24225k;
            }
            int i19 = i(i10, i15, this.f24226l, this.f24219c.length);
            for (int i20 = i12; i20 < i18; i20++) {
                this.f24218b[(i20 * 5) + 4] = i19;
            }
            int i21 = this.f24227m;
            if (i21 >= i12) {
                this.f24227m = i21 + i;
            }
        }
    }

    public final void w(int i, int i10) {
        if (i > 0) {
            B(this.i, i10);
            int i11 = this.f24225k;
            int i12 = this.f24226l;
            if (i12 < i) {
                Object[] objArr = this.f24219c;
                int length = objArr.length;
                int i13 = length - i12;
                int max = Math.max(Math.max(length * 2, i13 + i), 32);
                Object[] objArr2 = new Object[max];
                for (int i14 = 0; i14 < max; i14++) {
                    objArr2[i14] = null;
                }
                int i15 = max - i13;
                int i16 = i12 + i11;
                System.arraycopy(objArr, 0, objArr2, 0, i11);
                System.arraycopy(objArr, i16, objArr2, i11 + i15, length - i16);
                this.f24219c = objArr2;
                i12 = i15;
            }
            int i17 = this.f24224j;
            if (i17 >= i11) {
                this.f24224j = i17 + i;
            }
            this.f24225k = i11 + i;
            this.f24226l = i12 - i;
        }
    }

    public final boolean x(int i) {
        if ((this.f24218b[(r(i) * 5) + 1] & 1073741824) != 0) {
            return true;
        }
        return false;
    }

    public final void z(b2 b2Var, int i) {
        if (this.f24228n <= 0) {
            c("Check failed");
        }
        if (i == 0 && this.f24234t == 0 && this.f24217a.f24192v == 0) {
            int[] iArr = b2Var.f24191u;
            int i10 = iArr[(i * 5) + 3];
            int i11 = b2Var.f24192v;
            if (i10 == i11) {
                int[] iArr2 = this.f24218b;
                Object[] objArr = this.f24219c;
                ArrayList arrayList = this.f24220d;
                HashMap hashMap = this.e;
                w wVar = this.f24221f;
                Object[] objArr2 = b2Var.f24193w;
                int i12 = b2Var.f24194x;
                HashMap hashMap2 = b2Var.D;
                w wVar2 = b2Var.E;
                this.f24218b = iArr;
                this.f24219c = objArr2;
                this.f24220d = b2Var.C;
                this.f24222g = i11;
                this.f24223h = (iArr.length / 5) - i11;
                this.f24225k = i12;
                this.f24226l = objArr2.length - i12;
                this.f24227m = i11;
                this.e = hashMap2;
                this.f24221f = wVar2;
                b2Var.f24191u = iArr2;
                b2Var.f24192v = 0;
                b2Var.f24193w = objArr;
                b2Var.f24194x = 0;
                b2Var.C = arrayList;
                b2Var.D = hashMap;
                b2Var.E = wVar;
                return;
            }
        }
        e2 k3 = b2Var.k();
        try {
            y.w(k3, i, this, true, true, false);
            k3.e(true);
        } catch (Throwable th) {
            k3.e(false);
            throw th;
        }
    }
}
