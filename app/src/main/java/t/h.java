package t;
import d0.d;
import p.a;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final d f25405a;

    /* renamed from: b, reason: collision with root package name */
    public final pf.l f25406b;

    public h(d dVar, pf.l lVar) {
        this.f25405a = dVar;
        this.f25406b = lVar;
    }

    public final String toString() {
        String str;
        String str2;
        pf.l lVar = this.f25406b;
        pf.y yVar = (pf.y) lVar.f22766y.L(pf.y.f22809w);
        if (yVar != null) {
            str = yVar.f22810v;
        } else {
            str = null;
        }
        StringBuilder sb2 = new StringBuilder("Request@");
        int hashCode = hashCode();
        ya.a(16);
        String num = Integer.toString(hashCode, 16);
        num.getClass();
        sb2.append(num);
        if (str != null) {
            str2 = a.k("[", str, "](");
        } else {
            str2 = "(";
        }
        sb2.append(str2);
        sb2.append("currentBounds()=");
        sb2.append(this.f25405a.invoke());
        sb2.append(", continuation=");
        sb2.append(lVar);
        sb2.append(')');
        return sb2.toString();
    }
}
