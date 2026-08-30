package r0;
import b2.t;
import n1.a;
import s.c;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a2 {

    /* renamed from: a, reason: collision with root package name */
    public final b2 f24178a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f24179b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24180c;

    /* renamed from: d, reason: collision with root package name */
    public Object[] f24181d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f24182f;

    /* renamed from: g, reason: collision with root package name */
    public int f24183g;

    /* renamed from: h, reason: collision with root package name */
    public int f24184h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public final t f24185j;

    /* renamed from: k, reason: collision with root package name */
    public int f24186k;

    /* renamed from: l, reason: collision with root package name */
    public int f24187l;

    /* renamed from: m, reason: collision with root package name */
    public int f24188m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f24189n;

    public a2(b2 b2Var) {
        this.f24178a = b2Var;
        this.f24179b = b2Var.f24191u;
        int i = b2Var.f24192v;
        this.f24180c = i;
        this.f24181d = b2Var.f24193w;
        this.e = b2Var.f24194x;
        this.f24184h = i;
        this.i = -1;
        this.f24185j = new t(3, (byte) 0);
    }

    public final a a(int i) {
        ArrayList arrayList = this.f24178a.C;
        int d2 = d2.d(arrayList, i, this.f24180c);
        if (d2 < 0) {
            a aVar = new a(i);
            arrayList.add(-(d2 + 1), aVar);
            return aVar;
        }
        return (a) arrayList.get(d2);
    }

    public final Object b(int i, int[] iArr) {
        int bitCount;
        int i10 = i * 5;
        int i11 = iArr[i10 + 1];
        if ((268435456 & i11) != 0) {
            Object[] objArr = this.f24181d;
            if (i10 >= iArr.length) {
                bitCount = iArr.length;
            } else {
                bitCount = iArr[i10 + 4] + Integer.bitCount(i11 >> 29);
            }
            return objArr[bitCount];
        }
        return l.f24285a;
    }

    public final void c() {
        this.f24182f = true;
        if (this.f24178a.f24195y <= 0) {
            c("Unexpected reader close()");
        }
        r0.f24195y--;
        this.f24181d = new Object[0];
    }

    public final boolean d(int i) {
        if ((this.f24179b[(i * 5) + 1] & 67108864) != 0) {
            return true;
        }
        return false;
    }

    public final void e() {
        int i;
        int i10;
        if (this.f24186k == 0) {
            if (this.f24183g != this.f24184h) {
                c("endGroup() not called at the end of a group");
            }
            int i11 = (this.i * 5) + 2;
            int[] iArr = this.f24179b;
            int i12 = iArr[i11];
            this.i = i12;
            int i13 = this.f24180c;
            if (i12 < 0) {
                i = i13;
            } else {
                i = iArr[(i12 * 5) + 3] + i12;
            }
            this.f24184h = i;
            int d2 = this.f24185j.d();
            if (d2 < 0) {
                this.f24187l = 0;
                this.f24188m = 0;
                return;
            }
            this.f24187l = d2;
            if (i12 >= i13 - 1) {
                i10 = this.e;
            } else {
                i10 = iArr[((i12 + 1) * 5) + 4];
            }
            this.f24188m = i10;
        }
    }

    public final Object f() {
        int i = this.f24183g;
        if (i < this.f24184h) {
            return b(i, this.f24179b);
        }
        return 0;
    }

    public final int g() {
        int i = this.f24183g;
        if (i < this.f24184h) {
            return this.f24179b[i * 5];
        }
        return 0;
    }

    public final Object h(int i, int i10) {
        int i11;
        int[] iArr = this.f24179b;
        int b10 = d2.b(i, iArr);
        int i12 = i + 1;
        if (i12 < this.f24180c) {
            i11 = iArr[(i12 * 5) + 4];
        } else {
            i11 = this.e;
        }
        int i13 = b10 + i10;
        if (i13 < i11) {
            return this.f24181d[i13];
        }
        return l.f24285a;
    }

    public final int i(int i) {
        return this.f24179b[i * 5];
    }

    public final boolean j(int i) {
        if ((this.f24179b[(i * 5) + 1] & 134217728) != 0) {
            return true;
        }
        return false;
    }

    public final boolean k(int i) {
        if ((this.f24179b[(i * 5) + 1] & 536870912) != 0) {
            return true;
        }
        return false;
    }

    public final boolean l(int i) {
        if ((this.f24179b[(i * 5) + 1] & 1073741824) != 0) {
            return true;
        }
        return false;
    }

    public final Object m() {
        int i;
        if (this.f24186k <= 0 && (i = this.f24187l) < this.f24188m) {
            this.f24189n = true;
            Object[] objArr = this.f24181d;
            this.f24187l = i + 1;
            return objArr[i];
        }
        this.f24189n = false;
        return l.f24285a;
    }

    public final Object n(int i) {
        int i10 = i * 5;
        int[] iArr = this.f24179b;
        int i11 = iArr[i10 + 1] & 1073741824;
        if (i11 != 0) {
            if (i11 != 0) {
                return this.f24181d[iArr[i10 + 4]];
            }
            return l.f24285a;
        }
        return null;
    }

    public final int o(int i) {
        return this.f24179b[(i * 5) + 1] & 67108863;
    }

    public final Object p(int i, int[] iArr) {
        int i10 = i * 5;
        int i11 = iArr[i10 + 1];
        if ((536870912 & i11) != 0) {
            return this.f24181d[Integer.bitCount(i11 >> 30) + iArr[i10 + 4]];
        }
        return null;
    }

    public final int q(int i) {
        return this.f24179b[(i * 5) + 2];
    }

    public final void r(int i) {
        int i10;
        if (this.f24186k != 0) {
            c("Cannot reposition while in an empty region");
        }
        this.f24183g = i;
        int[] iArr = this.f24179b;
        int i11 = this.f24180c;
        if (i < i11) {
            i10 = iArr[(i * 5) + 2];
        } else {
            i10 = -1;
        }
        if (i10 != this.i) {
            this.i = i10;
            if (i10 < 0) {
                this.f24184h = i11;
            } else {
                this.f24184h = iArr[(i10 * 5) + 3] + i10;
            }
            this.f24187l = 0;
            this.f24188m = 0;
        }
    }

    public final int s() {
        int i;
        if (this.f24186k != 0) {
            c("Cannot skip while in an empty region");
        }
        int i10 = this.f24183g;
        int i11 = i10 * 5;
        int[] iArr = this.f24179b;
        int i12 = iArr[i11 + 1];
        if ((1073741824 & i12) != 0) {
            i = 1;
        } else {
            i = i12 & 67108863;
        }
        this.f24183g = iArr[i11 + 3] + i10;
        return i;
    }

    public final void t() {
        boolean z3;
        if (this.f24186k == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            c("Cannot skip the enclosing group while in an empty region");
        }
        this.f24183g = this.f24184h;
        this.f24187l = 0;
        this.f24188m = 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SlotReader(current=");
        sb2.append(this.f24183g);
        sb2.append(", key=");
        sb2.append(g());
        sb2.append(", parent=");
        sb2.append(this.i);
        sb2.append(", end=");
        return a5.a.i(sb2, this.f24184h, ')');
    }

    public final void u() {
        int i;
        if (this.f24186k <= 0) {
            int i10 = this.i;
            int i11 = this.f24183g;
            int i12 = i11 * 5;
            int[] iArr = this.f24179b;
            if (iArr[i12 + 2] != i10) {
                a("Invalid slot table detected");
            }
            int i13 = this.f24187l;
            int i14 = this.f24188m;
            t tVar = this.f24185j;
            if (i13 == 0 && i14 == 0) {
                tVar.e(-1);
            } else {
                tVar.e(i13);
            }
            this.i = i11;
            this.f24184h = iArr[i12 + 3] + i11;
            int i15 = i11 + 1;
            this.f24183g = i15;
            this.f24187l = d2.b(i11, iArr);
            if (i11 >= this.f24180c - 1) {
                i = this.e;
            } else {
                i = iArr[(i15 * 5) + 4];
            }
            this.f24188m = i;
        }
    }
}
