package g5;
import x.n;
import x.o;
import q.x;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class a0 implements q5.d, q5.c {
    public static final TreeMap C = new TreeMap();
    public final int[] A;
    public int B;

    /* renamed from: u, reason: collision with root package name */
    public final int f17418u;

    /* renamed from: v, reason: collision with root package name */
    public volatile String f17419v;

    /* renamed from: w, reason: collision with root package name */
    public final long[] f17420w;

    /* renamed from: x, reason: collision with root package name */
    public final double[] f17421x;

    /* renamed from: y, reason: collision with root package name */
    public final String[] f17422y;

    /* renamed from: z, reason: collision with root package name */
    public final byte[][] f17423z;

    public a0(int i) {
        this.f17418u = i;
        int i10 = i + 1;
        this.A = new int[i10];
        this.f17420w = new long[i10];
        this.f17421x = new double[i10];
        this.f17422y = new String[i10];
        this.f17423z = new byte[i10];
    }

    public static final a0 k(int i, String str) {
        TreeMap treeMap = C;
        synchronized (treeMap) {
            Map.Entry ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
            if (ceilingEntry != null) {
                treeMap.remove(ceilingEntry.getKey());
                a0 a0Var = (a0) ceilingEntry.getValue();
                a0Var.getClass();
                a0Var.f17419v = str;
                a0Var.B = i;
                return a0Var;
            }
            a0 a0Var2 = new a0(i);
            a0Var2.f17419v = str;
            a0Var2.B = i;
            return a0Var2;
        }
    }

    @Override // q5.c
    public final void b(int i, long j10) {
        this.A[i] = 2;
        this.f17420w[i] = j10;
    }

    @Override // q5.c
    public final void c(double d2, int i) {
        this.A[i] = 3;
        this.f17421x[i] = d2;
    }

    @Override // q5.d
    public final void f(q5.c cVar) {
        int i = this.B;
        if (1 <= i) {
            int i10 = 1;
            while (true) {
                int i11 = this.A[i10];
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 4) {
                                if (i11 == 5) {
                                    byte[] bArr = this.f17423z[i10];
                                    if (bArr != null) {
                                        cVar.z(bArr, i10);
                                    } else {
                                        x.n("Required value was null.");
                                        return;
                                    }
                                }
                            } else {
                                String str = this.f17422y[i10];
                                if (str != null) {
                                    cVar.n(i10, str);
                                } else {
                                    x.n("Required value was null.");
                                    return;
                                }
                            }
                        } else {
                            cVar.c(this.f17421x[i10], i10);
                        }
                    } else {
                        cVar.b(i10, this.f17420w[i10]);
                    }
                } else {
                    cVar.g(i10);
                }
                if (i10 != i) {
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    @Override // q5.c
    public final void g(int i) {
        this.A[i] = 1;
    }

    @Override // q5.d
    public final String j() {
        String str = this.f17419v;
        if (str != null) {
            return str;
        }
        x.o("Required value was null.");
        return null;
    }

    public final void m() {
        TreeMap treeMap = C;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f17418u), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                it.getClass();
                while (true) {
                    int i = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i;
                }
            }
        }
    }

    @Override // q5.c
    public final void n(int i, String str) {
        str.getClass();
        this.A[i] = 4;
        this.f17422y[i] = str;
    }

    @Override // q5.c
    public final void z(byte[] bArr, int i) {
        this.A[i] = 5;
        this.f17423z[i] = bArr;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
