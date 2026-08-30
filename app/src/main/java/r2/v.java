package r2;
import l.a;

import com.google.android.gms.internal.ads.a2;
import com.google.android.gms.internal.ads.l3;
import wa.b9;

/* loaded from: classes.dex */
public final class v implements g {

    /* renamed from: a, reason: collision with root package name */
    public final m2.g f24511a;

    /* renamed from: b, reason: collision with root package name */
    public final int f24512b;

    public v(String str, int i) {
        this.f24511a = new m2.g(str);
        this.f24512b = i;
    }

    @Override // r2.g
    public final void a(a2 a2Var) {
        int length;
        int i = a2Var.f4316x;
        m2.g gVar = this.f24511a;
        int i10 = -1;
        if (i != -1) {
            int i11 = a2Var.f4317y;
            String str = gVar.f20477v;
            String str2 = gVar.f20477v;
            a2Var.e(str, i, i11);
            if (str2.length() > 0) {
                a2Var.f(i, str2.length() + i);
            }
        } else {
            int i12 = a2Var.f4314v;
            int i13 = a2Var.f4315w;
            String str3 = gVar.f20477v;
            String str4 = gVar.f20477v;
            a2Var.e(str3, i12, i13);
            if (str4.length() > 0) {
                a2Var.f(i12, str4.length() + i12);
            }
        }
        int i14 = a2Var.f4314v;
        int i15 = a2Var.f4315w;
        if (i14 == i15) {
            i10 = i15;
        }
        int i16 = this.f24512b;
        if (i16 > 0) {
            length = (i10 + i16) - 1;
        } else {
            length = (i10 + i16) - gVar.f20477v.length();
        }
        int e = b9.e(length, 0, ((l3) a2Var.f4318z).c());
        a2Var.g(e, e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (kotlin.jvm.internal.a(this.f24511a.f20477v, vVar.f24511a.f20477v) && this.f24512b == vVar.f24512b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f24511a.f20477v.hashCode() * 31) + this.f24512b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SetComposingTextCommand(text='");
        sb2.append(this.f24511a.f20477v);
        sb2.append("', newCursorPosition=");
        return a5.a.i(sb2, this.f24512b, ')');
    }
}
