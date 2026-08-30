package xf;

import c4.s;
import df.q;
import pf.n0;
import uf.r;
import ve.i;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f30768a;

    /* renamed from: b, reason: collision with root package name */
    public final q f30769b;

    /* renamed from: c, reason: collision with root package name */
    public final q f30770c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f30771d;
    public final i e;

    /* renamed from: f, reason: collision with root package name */
    public final q f30772f;

    /* renamed from: g, reason: collision with root package name */
    public Object f30773g;

    /* renamed from: h, reason: collision with root package name */
    public int f30774h = -1;
    public final /* synthetic */ e i;

    public c(e eVar, Object obj, q qVar, q qVar2, s sVar, i iVar, q qVar3) {
        this.i = eVar;
        this.f30768a = obj;
        this.f30769b = qVar;
        this.f30770c = qVar2;
        this.f30771d = sVar;
        this.e = iVar;
        this.f30772f = qVar3;
    }

    public final void a() {
        n0 n0Var;
        Object obj = this.f30773g;
        if (obj instanceof r) {
            ((r) obj).h(this.f30774h, this.i.f30780u);
            return;
        }
        if (obj instanceof n0) {
            n0Var = (n0) obj;
        } else {
            n0Var = null;
        }
        if (n0Var != null) {
            n0Var.a();
        }
    }
}
