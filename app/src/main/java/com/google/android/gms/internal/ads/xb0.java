package com.google.android.gms.internal.ads;
import ac.b;
import f9.a;
import g9.c3;
import g9.r;

/* loaded from: classes.dex */
public final /* synthetic */ class xb0 implements j81 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12538a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c3 f12539b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qp0 f12540c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sp0 f12541d;
    public final /* synthetic */ a e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mw f12542f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f12543g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f12544h;
    public final /* synthetic */ Object i;

    public /* synthetic */ xb0(Object obj, c3 c3Var, qp0 qp0Var, sp0 sp0Var, a aVar, mw mwVar, String str, String str2, int i) {
        this.f12538a = i;
        this.i = obj;
        this.f12539b = c3Var;
        this.f12540c = qp0Var;
        this.f12541d = sp0Var;
        this.e = aVar;
        this.f12542f = mwVar;
        this.f12543g = str;
        this.f12544h = str2;
    }

    @Override // com.google.android.gms.internal.ads.j81
    public final b l(Object obj) {
        a aVar;
        mw mwVar;
        me0 me0Var;
        a aVar2;
        mw mwVar2;
        switch (this.f12538a) {
            case 0:
                ac0 ac0Var = (ac0) this.i;
                c3 c3Var = this.f12539b;
                qp0 qp0Var = this.f12540c;
                sp0 sp0Var = this.f12541d;
                a aVar3 = this.e;
                mw mwVar3 = this.f12542f;
                String str = this.f12543g;
                String str2 = this.f12544h;
                h00 a10 = ac0Var.f4446j.a(c3Var, qp0Var, sp0Var);
                fj fjVar = new fj(a10);
                sc0 sc0Var = ac0Var.f4448l.f11885a;
                x00 j02 = a10.j0();
                nl nlVar = sl.f10846mf;
                r rVar = r.e;
                if (!((Boolean) rVar.f17698c.a(nlVar)).booleanValue()) {
                    aVar = new a(ac0Var.f4439a, null);
                } else {
                    aVar = aVar3;
                }
                if (true != ((Boolean) rVar.f17698c.a(nlVar)).booleanValue()) {
                    mwVar = null;
                } else {
                    mwVar = mwVar3;
                }
                j02.p(sc0Var, sc0Var, sc0Var, sc0Var, sc0Var, false, null, aVar, null, mwVar, ac0Var.f4451o, ac0Var.f4450n, ac0Var.f4449m, null, sc0Var, null, null, null, null, null, null, null, ac0Var.f4456t);
                a10.h1("/getNativeAdViewSignals", lp.f8087n);
                a10.h1("/getNativeClickMeta", lp.f8088o);
                if (((Boolean) rVar.f17698c.a(sl.H8)).booleanValue()) {
                    if (((Boolean) rVar.f17698c.a(sl.J8)).booleanValue() && (me0Var = ac0Var.f4455s) != null) {
                        a10.h1("/onDeviceStorageEvent", new cp(3, me0Var));
                    }
                }
                x00 j03 = a10.j0();
                synchronized (j03.f12393x) {
                    j03.M = true;
                }
                a10.j0().A = new m00(fjVar, 1);
                a10.D0(str, str2);
                return fjVar;
            default:
                fc0 fc0Var = (fc0) this.i;
                c3 c3Var2 = this.f12539b;
                qp0 qp0Var2 = this.f12540c;
                sp0 sp0Var2 = this.f12541d;
                a aVar4 = this.e;
                mw mwVar4 = this.f12542f;
                String str3 = this.f12543g;
                String str4 = this.f12544h;
                h00 a11 = fc0Var.f6012c.a(c3Var2, qp0Var2, sp0Var2);
                fj fjVar2 = new fj(a11);
                if (fc0Var.f6010a.f4579b != null) {
                    fc0Var.a(a11, aVar4, mwVar4);
                    a11.C0(new x0(5, 0, 0));
                } else {
                    sc0 sc0Var2 = fc0Var.f6013d.f11885a;
                    x00 j04 = a11.j0();
                    nl nlVar2 = sl.f10846mf;
                    r rVar2 = r.e;
                    if (!((Boolean) rVar2.f17698c.a(nlVar2)).booleanValue()) {
                        aVar2 = new a(fc0Var.e, null);
                    } else {
                        aVar2 = aVar4;
                    }
                    if (true != ((Boolean) rVar2.f17698c.a(nlVar2)).booleanValue()) {
                        mwVar2 = null;
                    } else {
                        mwVar2 = mwVar4;
                    }
                    j04.p(sc0Var2, sc0Var2, sc0Var2, sc0Var2, sc0Var2, false, null, aVar2, null, mwVar2, fc0Var.f6016h, fc0Var.f6015g, fc0Var.f6014f, null, sc0Var2, null, null, null, null, fc0Var.f6018k, null, null, fc0Var.i);
                    fc0.b(a11);
                }
                a11.j0().A = new zd1(11, fc0Var, a11, fjVar2);
                a11.D0(str3, str4);
                return fjVar2;
        }
    }
}
