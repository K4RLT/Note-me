package n;
import o.a;
import q.x;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class q implements Cloneable {

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ boolean f20924u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ long[] f20925v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object[] f20926w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ int f20927x;

    public q(int i) {
        if (i == 0) {
            this.f20925v = a.f21372b;
            this.f20926w = a.f21373c;
            return;
        }
        int i10 = i * 8;
        int i11 = 4;
        while (true) {
            if (i11 >= 32) {
                break;
            }
            int i12 = (1 << i11) - 12;
            if (i10 <= i12) {
                i10 = i12;
                break;
            }
            i11++;
        }
        int i13 = i10 / 8;
        this.f20925v = new long[i13];
        this.f20926w = new Object[i13];
    }

    public final boolean a(long j10) {
        if (this.f20924u) {
            int i = this.f20927x;
            long[] jArr = this.f20925v;
            Object[] objArr = this.f20926w;
            int i10 = 0;
            for (int i11 = 0; i11 < i; i11++) {
                Object obj = objArr[i11];
                if (obj != r.f20929a) {
                    if (i11 != i10) {
                        jArr[i10] = jArr[i11];
                        objArr[i10] = obj;
                        objArr[i11] = null;
                    }
                    i10++;
                }
            }
            this.f20924u = false;
            this.f20927x = i10;
        }
        if (a.b(this.f20925v, this.f20927x, j10) < 0) {
            return false;
        }
        return true;
    }

    public final Object b(long j10) {
        Object obj;
        int b10 = a.b(this.f20925v, this.f20927x, j10);
        if (b10 >= 0 && (obj = this.f20926w[b10]) != r.f20929a) {
            return obj;
        }
        return null;
    }

    public final long c(int i) {
        int i10;
        if (i >= 0 && i < (i10 = this.f20927x)) {
            if (this.f20924u) {
                long[] jArr = this.f20925v;
                Object[] objArr = this.f20926w;
                int i11 = 0;
                for (int i12 = 0; i12 < i10; i12++) {
                    Object obj = objArr[i12];
                    if (obj != r.f20929a) {
                        if (i12 != i11) {
                            jArr[i11] = jArr[i12];
                            objArr[i11] = obj;
                            objArr[i12] = null;
                        }
                        i11++;
                    }
                }
                this.f20924u = false;
                this.f20927x = i11;
            }
            return this.f20925v[i];
        }
        x.n(g3.a.g(i, "Expected index to be within 0..size()-1, but was "));
        return 0L;
    }

    public final Object clone() {
        Object clone = super.clone();
        clone.getClass();
        q qVar = (q) clone;
        qVar.f20925v = (long[]) this.f20925v.clone();
        qVar.f20926w = (Object[]) this.f20926w.clone();
        return qVar;
    }

    public final void d(long j10, Object obj) {
        Object obj2 = r.f20929a;
        int b10 = a.b(this.f20925v, this.f20927x, j10);
        if (b10 >= 0) {
            this.f20926w[b10] = obj;
            return;
        }
        int i = ~b10;
        int i10 = this.f20927x;
        if (i < i10) {
            Object[] objArr = this.f20926w;
            if (objArr[i] == obj2) {
                this.f20925v[i] = j10;
                objArr[i] = obj;
                return;
            }
        }
        if (this.f20924u) {
            long[] jArr = this.f20925v;
            if (i10 >= jArr.length) {
                Object[] objArr2 = this.f20926w;
                int i11 = 0;
                for (int i12 = 0; i12 < i10; i12++) {
                    Object obj3 = objArr2[i12];
                    if (obj3 != obj2) {
                        if (i12 != i11) {
                            jArr[i11] = jArr[i12];
                            objArr2[i11] = obj3;
                            objArr2[i12] = null;
                        }
                        i11++;
                    }
                }
                this.f20924u = false;
                this.f20927x = i11;
                i = ~a.b(this.f20925v, i11, j10);
            }
        }
        int i13 = this.f20927x;
        if (i13 >= this.f20925v.length) {
            int i14 = (i13 + 1) * 8;
            int i15 = 4;
            while (true) {
                if (i15 >= 32) {
                    break;
                }
                int i16 = (1 << i15) - 12;
                if (i14 <= i16) {
                    i14 = i16;
                    break;
                }
                i15++;
            }
            int i17 = i14 / 8;
            this.f20925v = Arrays.copyOf(this.f20925v, i17);
            this.f20926w = Arrays.copyOf(this.f20926w, i17);
        }
        int i18 = this.f20927x;
        if (i18 - i != 0) {
            long[] jArr2 = this.f20925v;
            int i19 = i + 1;
            qe.k.e(jArr2, jArr2, i19, i, i18);
            Object[] objArr3 = this.f20926w;
            qe.k.d(i19, i, this.f20927x, objArr3, objArr3);
        }
        this.f20925v[i] = j10;
        this.f20926w[i] = obj;
        this.f20927x++;
    }

    public final void e(long j10) {
        int b10 = a.b(this.f20925v, this.f20927x, j10);
        if (b10 >= 0) {
            Object[] objArr = this.f20926w;
            Object obj = objArr[b10];
            Object obj2 = r.f20929a;
            if (obj != obj2) {
                objArr[b10] = obj2;
                this.f20924u = true;
            }
        }
    }

    public final int f() {
        if (this.f20924u) {
            int i = this.f20927x;
            long[] jArr = this.f20925v;
            Object[] objArr = this.f20926w;
            int i10 = 0;
            for (int i11 = 0; i11 < i; i11++) {
                Object obj = objArr[i11];
                if (obj != r.f20929a) {
                    if (i11 != i10) {
                        jArr[i10] = jArr[i11];
                        objArr[i10] = obj;
                        objArr[i11] = null;
                    }
                    i10++;
                }
            }
            this.f20924u = false;
            this.f20927x = i10;
        }
        return this.f20927x;
    }

    public final Object g(int i) {
        int i10;
        if (i >= 0 && i < (i10 = this.f20927x)) {
            if (this.f20924u) {
                long[] jArr = this.f20925v;
                Object[] objArr = this.f20926w;
                int i11 = 0;
                for (int i12 = 0; i12 < i10; i12++) {
                    Object obj = objArr[i12];
                    if (obj != r.f20929a) {
                        if (i12 != i11) {
                            jArr[i11] = jArr[i12];
                            objArr[i11] = obj;
                            objArr[i12] = null;
                        }
                        i11++;
                    }
                }
                this.f20924u = false;
                this.f20927x = i11;
            }
            return this.f20926w[i];
        }
        x.n(g3.a.g(i, "Expected index to be within 0..size()-1, but was "));
        return null;
    }

    public final String toString() {
        if (f() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f20927x * 28);
        sb2.append('{');
        int i = this.f20927x;
        for (int i10 = 0; i10 < i; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(c(i10));
            sb2.append('=');
            Object g8 = g(i10);
            if (g8 != sb2) {
                sb2.append(g8);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public /* synthetic */ q(Object obj) {
        this(10);
    }
}
