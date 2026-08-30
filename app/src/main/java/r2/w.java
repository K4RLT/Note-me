package r2;

import com.google.android.gms.internal.ads.a2;
import com.google.android.gms.internal.ads.l3;
import wa.b9;

/* loaded from: classes.dex */
public final class w implements g {

    /* renamed from: a, reason: collision with root package name */
    public final int f24513a;

    /* renamed from: b, reason: collision with root package name */
    public final int f24514b;

    public w(int i, int i10) {
        this.f24513a = i;
        this.f24514b = i10;
    }

    @Override // r2.g
    public final void a(a2 a2Var) {
        int e = b9.e(this.f24513a, 0, ((l3) a2Var.f4318z).c());
        int e8 = b9.e(this.f24514b, 0, ((l3) a2Var.f4318z).c());
        if (e < e8) {
            a2Var.g(e, e8);
        } else {
            a2Var.g(e8, e);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f24513a == wVar.f24513a && this.f24514b == wVar.f24514b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f24513a * 31) + this.f24514b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SetSelectionCommand(start=");
        sb2.append(this.f24513a);
        sb2.append(", end=");
        return a5.a.i(sb2, this.f24514b, ')');
    }
}
