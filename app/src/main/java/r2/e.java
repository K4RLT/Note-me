package r2;
import a.a;

import com.google.android.gms.internal.ads.a2;
import com.google.android.gms.internal.ads.l3;

/* loaded from: classes.dex */
public final class e implements g {

    /* renamed from: a, reason: collision with root package name */
    public final int f24486a;

    /* renamed from: b, reason: collision with root package name */
    public final int f24487b;

    public e(int i, int i10) {
        boolean z3;
        this.f24486a = i;
        this.f24487b = i10;
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
        int i = a2Var.f4315w;
        l3 l3Var = (l3) a2Var.f4318z;
        int i10 = this.f24487b;
        int i11 = i + i10;
        if (((i ^ i11) & (i10 ^ i11)) < 0) {
            i11 = l3Var.c();
        }
        a2Var.a(a2Var.f4315w, Math.min(i11, l3Var.c()));
        int i12 = a2Var.f4314v;
        int i13 = this.f24486a;
        int i14 = i12 - i13;
        if (((i12 ^ i14) & (i13 ^ i12)) < 0) {
            i14 = 0;
        }
        a2Var.a(Math.max(0, i14), a2Var.f4314v);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f24486a == eVar.f24486a && this.f24487b == eVar.f24487b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f24486a * 31) + this.f24487b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        sb2.append(this.f24486a);
        sb2.append(", lengthAfterCursor=");
        return a5.a.i(sb2, this.f24487b, ')');
    }
}
