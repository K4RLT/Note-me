package z6;

import j6.e;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class a implements Closeable {

    /* renamed from: y, reason: collision with root package name */
    public static final String[] f31932y = new String[128];

    /* renamed from: u, reason: collision with root package name */
    public int f31933u;

    /* renamed from: v, reason: collision with root package name */
    public int[] f31934v;

    /* renamed from: w, reason: collision with root package name */
    public String[] f31935w;

    /* renamed from: x, reason: collision with root package name */
    public int[] f31936x;

    static {
        for (int i = 0; i <= 31; i++) {
            f31932y[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f31932y;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public abstract int A();

    public abstract String B();

    public abstract int H();

    public final void K(int i) {
        int i10 = this.f31933u;
        int[] iArr = this.f31934v;
        if (i10 == iArr.length) {
            if (i10 != 256) {
                this.f31934v = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.f31935w;
                this.f31935w = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.f31936x;
                this.f31936x = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                throw new ab.b("Nesting too deep at ".concat(o()), 22);
            }
        }
        int[] iArr3 = this.f31934v;
        int i11 = this.f31933u;
        this.f31933u = i11 + 1;
        iArr3[i11] = i;
    }

    public abstract int L(e eVar);

    public abstract void M();

    public abstract void N();

    public final void O(String str) {
        throw new IOException(str + " at path " + o());
    }

    public abstract void f();

    public abstract void j();

    public abstract void k();

    public abstract void m();

    public final String o() {
        int i = this.f31933u;
        int[] iArr = this.f31934v;
        String[] strArr = this.f31935w;
        int[] iArr2 = this.f31936x;
        StringBuilder sb2 = new StringBuilder("$");
        for (int i10 = 0; i10 < i; i10++) {
            int i11 = iArr[i10];
            if (i11 != 1 && i11 != 2) {
                if (i11 == 3 || i11 == 4 || i11 == 5) {
                    sb2.append('.');
                    String str = strArr[i10];
                    if (str != null) {
                        sb2.append(str);
                    }
                }
            } else {
                sb2.append('[');
                sb2.append(iArr2[i10]);
                sb2.append(']');
            }
        }
        return sb2.toString();
    }

    public abstract boolean p();

    public abstract boolean r();

    public abstract double w();
}
