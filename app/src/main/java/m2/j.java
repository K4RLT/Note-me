package m2;
import l.a;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final l0 f20508a;

    public j(l0 l0Var) {
        this.f20508a = l0Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof j) {
                l0 l0Var = this.f20508a;
                g gVar = l0Var.f20514a;
                l0 l0Var2 = ((j) obj).f20508a;
                if (kotlin.jvm.internal.a(gVar, l0Var2.f20514a) && l0Var.f20515b.c(l0Var2.f20515b) && kotlin.jvm.internal.a(l0Var.f20516c, l0Var2.f20516c) && l0Var.f20517d == l0Var2.f20517d && l0Var.e == l0Var2.e && l0Var.f20518f == l0Var2.f20518f && kotlin.jvm.internal.a(l0Var.f20519g, l0Var2.f20519g) && l0Var.f20520h == l0Var2.f20520h && l0Var.i == l0Var2.i && y2.a.b(l0Var.f20521j, l0Var2.f20521j)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        l0 l0Var = this.f20508a;
        int hashCode = l0Var.f20514a.hashCode() * 31;
        q0 q0Var = l0Var.f20515b;
        h0 h0Var = q0Var.f20555a;
        long j10 = h0Var.f20485b;
        y2.p[] pVarArr = y2.o.f30818b;
        int hashCode2 = Long.hashCode(j10) * 31;
        q2.s sVar = h0Var.f20486c;
        int i18 = 0;
        if (sVar != null) {
            i = sVar.f23369u;
        } else {
            i = 0;
        }
        int i19 = (hashCode2 + i) * 31;
        q2.o oVar = h0Var.f20487d;
        if (oVar != null) {
            i10 = Integer.hashCode(oVar.f23361a);
        } else {
            i10 = 0;
        }
        int i20 = (i19 + i10) * 31;
        q2.p pVar = h0Var.e;
        if (pVar != null) {
            i11 = Integer.hashCode(pVar.f23362a);
        } else {
            i11 = 0;
        }
        int i21 = (i20 + i11) * 31;
        q2.i iVar = h0Var.f20488f;
        if (iVar != null) {
            i12 = iVar.hashCode();
        } else {
            i12 = 0;
        }
        int i22 = (i21 + i12) * 31;
        String str = h0Var.f20489g;
        if (str != null) {
            i13 = str.hashCode();
        } else {
            i13 = 0;
        }
        int d2 = p.a.d(h0Var.f20490h, (i22 + i13) * 31, 31);
        x2.a aVar = h0Var.i;
        if (aVar != null) {
            i14 = Float.hashCode(aVar.f30042a);
        } else {
            i14 = 0;
        }
        int i23 = (d2 + i14) * 31;
        x2.p pVar2 = h0Var.f20491j;
        if (pVar2 != null) {
            i15 = pVar2.hashCode();
        } else {
            i15 = 0;
        }
        int i24 = (i23 + i15) * 31;
        t2.b bVar = h0Var.f20492k;
        if (bVar != null) {
            i16 = bVar.f25638u.hashCode();
        } else {
            i16 = 0;
        }
        int i25 = (i24 + i16) * 31;
        long j11 = h0Var.f20493l;
        int i26 = k1.r.f19522m;
        int d10 = p.a.d(j11, i25, 31);
        y yVar = h0Var.f20496o;
        if (yVar != null) {
            i17 = yVar.hashCode();
        } else {
            i17 = 0;
        }
        int hashCode3 = (q0Var.f20556b.hashCode() + ((d10 + i17) * 31)) * 31;
        z zVar = q0Var.f20557c;
        if (zVar != null) {
            i18 = zVar.hashCode();
        }
        return Long.hashCode(l0Var.f20521j) + ((l0Var.i.hashCode() + ((l0Var.f20520h.hashCode() + ((l0Var.f20519g.hashCode() + p.a.b(l0Var.f20518f, p.a.c((((l0Var.f20516c.hashCode() + ((hashCode3 + i18 + hashCode) * 31)) * 31) + l0Var.f20517d) * 31, 31, l0Var.e), 31)) * 31)) * 31)) * 31);
    }
}
