package n0;
import f.a;
import p.a;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import r.l0;
import r.m0;
import r0.a1;
import r0.r;
import r0.y;

/* loaded from: classes.dex */
public final class d implements l0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f20973a;

    /* renamed from: b, reason: collision with root package name */
    public final float f20974b;

    /* renamed from: c, reason: collision with root package name */
    public final a1 f20975c;

    public d(boolean z3, float f10, a1 a1Var) {
        this.f20973a = z3;
        this.f20974b = f10;
        this.f20975c = a1Var;
    }

    @Override // r.l0
    public final m0 b(v.i iVar, r rVar) {
        long a10;
        rVar.a0(988743187);
        k kVar = (k) rVar.j(m.f20994a);
        a1 a1Var = this.f20975c;
        if (((k1.r) a1Var.getValue()).f19523a != 16) {
            rVar.a0(-303557454);
            rVar.p(false);
            a10 = ((k1.r) a1Var.getValue()).f19523a;
        } else {
            rVar.a0(-303499670);
            a10 = kVar.a(rVar);
            rVar.p(false);
        }
        a1 G = y.G(new k1.r(a10), rVar);
        a1 G2 = y.G(kVar.b(rVar), rVar);
        rVar.a0(331259447);
        ViewGroup b10 = ya.a1.b((View) rVar.j(AndroidCompositionLocals_androidKt.f645f));
        boolean f10 = rVar.f(iVar) | rVar.f(this) | rVar.f(b10);
        Object O = rVar.O();
        Object obj = r0.l.f24285a;
        if (f10 || O == obj) {
            Object aVar = new a(this.f20973a, this.f20974b, G, G2, b10);
            rVar.k0(aVar);
            O = aVar;
        }
        a aVar2 = (a) O;
        rVar.p(false);
        boolean f11 = rVar.f(iVar) | rVar.h(aVar2);
        Object O2 = rVar.O();
        if (f11 || O2 == obj) {
            O2 = new a6.f(iVar, aVar2, null, 21);
            rVar.k0(O2);
        }
        y.g(aVar2, iVar, (df.p) O2, rVar);
        rVar.p(false);
        return aVar2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (this.f20973a != dVar.f20973a || !y2.a(this.f20974b, dVar.f20974b) || !this.f20975c.equals(dVar.f20975c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f20975c.hashCode() + a.a(Boolean.hashCode(this.f20973a) * 31, 31, this.f20974b);
    }
}
