package r2;
import l.a;

import com.google.android.gms.internal.ads.a2;
import com.google.android.gms.internal.ads.l3;
import wa.b9;

/* loaded from: classes.dex */
public final class a implements g {

    /* renamed from: a, reason: collision with root package name */
    public final m2.g f24445a;

    /* renamed from: b, reason: collision with root package name */
    public final int f24446b;

    public a(String str, int i) {
        this(new m2.g(str), i);
    }

    @Override // r2.g
    public final void a(a2 a2Var) {
        int length;
        int i = a2Var.f4316x;
        m2.g gVar = this.f24445a;
        int i10 = -1;
        if (i != -1) {
            a2Var.e(gVar.f20477v, i, a2Var.f4317y);
        } else {
            a2Var.e(gVar.f20477v, a2Var.f4314v, a2Var.f4315w);
        }
        int i11 = a2Var.f4314v;
        int i12 = a2Var.f4315w;
        if (i11 == i12) {
            i10 = i12;
        }
        int i13 = this.f24446b;
        if (i13 > 0) {
            length = (i10 + i13) - 1;
        } else {
            length = (i10 + i13) - gVar.f20477v.length();
        }
        int e = b9.e(length, 0, ((l3) a2Var.f4318z).c());
        a2Var.g(e, e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (kotlin.jvm.internal.l.a(this.f24445a.f20477v, aVar.f24445a.f20477v) && this.f24446b == aVar.f24446b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f24445a.f20477v.hashCode() * 31) + this.f24446b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CommitTextCommand(text='");
        sb2.append(this.f24445a.f20477v);
        sb2.append("', newCursorPosition=");
        return a5.a.i(sb2, this.f24446b, ')');
    }

    public a(m2.g gVar, int i) {
        this.f24445a = gVar;
        this.f24446b = i;
    }
}
