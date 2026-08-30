package r2;
import a.a;

import com.google.android.gms.internal.ads.a2;
import com.google.android.gms.internal.ads.l3;

/* loaded from: classes.dex */
public final class f implements g {

    /* renamed from: a, reason: collision with root package name */
    public final int f24488a;

    /* renamed from: b, reason: collision with root package name */
    public final int f24489b;

    public f(int i, int i10) {
        boolean z3;
        this.f24488a = i;
        this.f24489b = i10;
        if (i >= 0 && i10 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            s2.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i10 + " respectively.");
        }
    }

    @Override // r2.g
    public final void a(a2 a2Var) {
        int i = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 < this.f24488a) {
                int i12 = i11 + 1;
                int i13 = a2Var.f4314v;
                if (i13 > i12) {
                    char b10 = a2Var.b((i13 - i12) - 1);
                    char b11 = a2Var.b(a2Var.f4314v - i12);
                    if (Character.isHighSurrogate(b10) && Character.isLowSurrogate(b11)) {
                        i11 += 2;
                    } else {
                        i11 = i12;
                    }
                    i10++;
                } else {
                    i11 = i13;
                    break;
                }
            } else {
                break;
            }
        }
        int i14 = 0;
        while (true) {
            if (i >= this.f24489b) {
                break;
            }
            int i15 = i14 + 1;
            int i16 = a2Var.f4315w;
            l3 l3Var = (l3) a2Var.f4318z;
            if (i16 + i15 < l3Var.c()) {
                char b12 = a2Var.b((a2Var.f4315w + i15) - 1);
                char b13 = a2Var.b(a2Var.f4315w + i15);
                if (Character.isHighSurrogate(b12) && Character.isLowSurrogate(b13)) {
                    i14 += 2;
                } else {
                    i14 = i15;
                }
                i++;
            } else {
                i14 = l3Var.c() - a2Var.f4315w;
                break;
            }
        }
        int i17 = a2Var.f4315w;
        a2Var.a(i17, i14 + i17);
        int i18 = a2Var.f4314v;
        a2Var.a(i18 - i11, i18);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f24488a == fVar.f24488a && this.f24489b == fVar.f24489b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f24488a * 31) + this.f24489b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb2.append(this.f24488a);
        sb2.append(", lengthAfterCursor=");
        return a5.a.i(sb2, this.f24489b, ')');
    }
}
