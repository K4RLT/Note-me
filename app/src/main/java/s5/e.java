package s5;

import android.database.Cursor;
import java.util.Arrays;
import q.x;
import ya.n9;

/* loaded from: classes.dex */
public final class e extends f {
    public String[] A;
    public byte[][] B;
    public Cursor C;

    /* renamed from: x, reason: collision with root package name */
    public int[] f24920x;

    /* renamed from: y, reason: collision with root package name */
    public long[] f24921y;

    /* renamed from: z, reason: collision with root package name */
    public double[] f24922z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(r5.c cVar, String str) {
        super(cVar, str);
        cVar.getClass();
        str.getClass();
        this.f24920x = new int[0];
        this.f24921y = new long[0];
        this.f24922z = new double[0];
        this.A = new String[0];
        this.B = new byte[0];
    }

    public static void m(Cursor cursor, int i) {
        if (i >= 0 && i < cursor.getColumnCount()) {
            return;
        }
        n9.b(25, "column index out of range");
        throw null;
    }

    @Override // p5.c
    public final String D(int i) {
        f();
        Cursor o10 = o();
        m(o10, i);
        String string = o10.getString(i);
        string.getClass();
        return string;
    }

    @Override // p5.c
    public final boolean P() {
        f();
        k();
        Cursor cursor = this.C;
        if (cursor != null) {
            return cursor.moveToNext();
        }
        x.o("Required value was null.");
        return false;
    }

    @Override // p5.c
    public final void b(int i, long j10) {
        f();
        j(1, i);
        this.f24920x[i] = 1;
        this.f24921y[i] = j10;
    }

    @Override // p5.c
    public final void c(double d2, int i) {
        f();
        j(2, i);
        this.f24920x[i] = 2;
        this.f24922z[i] = d2;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (!this.f24925w) {
            h();
            reset();
        }
        this.f24925w = true;
    }

    @Override // p5.c
    public final void g(int i) {
        f();
        j(5, i);
        this.f24920x[i] = 5;
    }

    @Override // p5.c
    public final int getColumnCount() {
        f();
        k();
        Cursor cursor = this.C;
        if (cursor != null) {
            return cursor.getColumnCount();
        }
        return 0;
    }

    @Override // p5.c
    public final String getColumnName(int i) {
        f();
        k();
        Cursor cursor = this.C;
        if (cursor != null) {
            m(cursor, i);
            String columnName = cursor.getColumnName(i);
            columnName.getClass();
            return columnName;
        }
        x.o("Required value was null.");
        return null;
    }

    @Override // p5.c
    public final double getDouble(int i) {
        f();
        Cursor o10 = o();
        m(o10, i);
        return o10.getDouble(i);
    }

    @Override // p5.c
    public final long getLong(int i) {
        f();
        Cursor o10 = o();
        m(o10, i);
        return o10.getLong(i);
    }

    @Override // s5.f, p5.c
    public final void h() {
        f();
        this.f24920x = new int[0];
        this.f24921y = new long[0];
        this.f24922z = new double[0];
        this.A = new String[0];
        this.B = new byte[0];
    }

    @Override // p5.c
    public final boolean isNull(int i) {
        f();
        Cursor o10 = o();
        m(o10, i);
        return o10.isNull(i);
    }

    public final void j(int i, int i10) {
        int i11 = i10 + 1;
        int[] iArr = this.f24920x;
        if (iArr.length < i11) {
            this.f24920x = Arrays.copyOf(iArr, i11);
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        byte[][] bArr = this.B;
                        if (bArr.length < i11) {
                            this.B = (byte[][]) Arrays.copyOf(bArr, i11);
                            return;
                        }
                        return;
                    }
                    return;
                }
                String[] strArr = this.A;
                if (strArr.length < i11) {
                    this.A = (String[]) Arrays.copyOf(strArr, i11);
                    return;
                }
                return;
            }
            double[] dArr = this.f24922z;
            if (dArr.length < i11) {
                this.f24922z = Arrays.copyOf(dArr, i11);
                return;
            }
            return;
        }
        long[] jArr = this.f24921y;
        if (jArr.length < i11) {
            this.f24921y = Arrays.copyOf(jArr, i11);
        }
    }

    public final void k() {
        if (this.C == null) {
            this.C = this.f24923u.r(new ic.c(28, this));
        }
    }

    public final Cursor o() {
        Cursor cursor = this.C;
        if (cursor != null) {
            return cursor;
        }
        n9.b(21, "no row");
        throw null;
    }

    @Override // s5.f, p5.c
    public final void reset() {
        f();
        Cursor cursor = this.C;
        if (cursor != null) {
            cursor.close();
        }
        this.C = null;
    }

    @Override // p5.c
    public final void s(int i, String str) {
        str.getClass();
        f();
        j(3, i);
        this.f24920x[i] = 3;
        this.A[i] = str;
    }
}
