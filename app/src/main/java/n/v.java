package n;
import q.x;

import java.util.Arrays;
import wa.b9;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public int[] f20952a;

    /* renamed from: b, reason: collision with root package name */
    public int f20953b;

    public v(int i) {
        int[] iArr;
        if (i == 0) {
            iArr = m.f20915a;
        } else {
            iArr = new int[i];
        }
        this.f20952a = iArr;
    }

    public final void a(int i) {
        b(this.f20953b + 1);
        int[] iArr = this.f20952a;
        int i10 = this.f20953b;
        iArr[i10] = i;
        this.f20953b = i10 + 1;
    }

    public final void b(int i) {
        int[] iArr = this.f20952a;
        if (iArr.length < i) {
            this.f20952a = Arrays.copyOf(iArr, Math.max(i, (iArr.length * 3) / 2));
        }
    }

    public final int c(int i) {
        if (i >= 0 && i < this.f20953b) {
            return this.f20952a[i];
        }
        x.l("Index must be between 0 and size");
        return 0;
    }

    public final void d(int i) {
        int i10;
        if (i >= 0 && i < (i10 = this.f20953b)) {
            int[] iArr = this.f20952a;
            int i11 = iArr[i];
            if (i != i10 - 1) {
                qe.k.c(i, i + 1, i10, iArr, iArr);
            }
            this.f20953b--;
            return;
        }
        x.l("Index must be between 0 and size");
    }

    public final void e(int i, int i10) {
        if (i >= 0 && i < this.f20953b) {
            int[] iArr = this.f20952a;
            int i11 = iArr[i];
            iArr[i] = i10;
            return;
        }
        x.l("Index must be between 0 and size");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v) {
            v vVar = (v) obj;
            int i = vVar.f20953b;
            int i10 = this.f20953b;
            if (i == i10) {
                int[] iArr = this.f20952a;
                int[] iArr2 = vVar.f20952a;
                jf.d i11 = b9.i(0, i10);
                int i12 = i11.f19189u;
                int i13 = i11.f19190v;
                if (i12 <= i13) {
                    while (iArr[i12] == iArr2[i12]) {
                        if (i12 != i13) {
                            i12++;
                        } else {
                            return true;
                        }
                    }
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.f20952a;
        int i = this.f20953b;
        int i10 = 0;
        for (int i11 = 0; i11 < i; i11++) {
            i10 += Integer.hashCode(iArr[i11]) * 31;
        }
        return i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "[");
        int[] iArr = this.f20952a;
        int i = this.f20953b;
        int i10 = 0;
        while (true) {
            if (i10 < i) {
                int i11 = iArr[i10];
                if (i10 == -1) {
                    sb2.append((CharSequence) "...");
                    break;
                }
                if (i10 != 0) {
                    sb2.append((CharSequence) ", ");
                }
                sb2.append(i11);
                i10++;
            } else {
                sb2.append((CharSequence) "]");
                break;
            }
        }
        return sb2.toString();
    }

    public /* synthetic */ v() {
        this(16);
    }
}
