package com.google.android.gms.internal.ads;
import a0.k;
import ac.b;
import b5.b;
import f9.a;
import f9.k;
import g9.r;
import k9.a0;
import r.e;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import android.view.InputEvent;
import android.view.View;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class lr implements j81 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8108a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f8109b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f8110c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f8111d;
    public final Object e;

    public lr(dr drVar, String str, hr hrVar, gr grVar) {
        this.f8108a = 0;
        this.e = drVar;
        this.f8109b = str;
        this.f8111d = hrVar;
        this.f8110c = grVar;
    }

    public ac.b a(Object obj) {
        yx yxVar = new yx();
        br d2 = ((dr) this.e).d();
        k9.a0.k("callJs > getEngine: Promise created");
        d2.i(new tw(this, d2, obj, yxVar, 8, false), new x90(d2, this, yxVar));
        return yxVar;
    }

    @Override // com.google.android.gms.internal.ads.j81
    public final ac.b l(Object obj) {
        ac.b A;
        v81 e;
        switch (this.f8108a) {
            case 0:
                return a(obj);
            case 1:
                g30 g30Var = (g30) this.f8110c;
                Uri.Builder builder = (Uri.Builder) this.f8111d;
                String str = (String) this.f8109b;
                InputEvent inputEvent = (InputEvent) this.e;
                if (((Integer) obj).intValue() == 1) {
                    Uri.Builder buildUpon = builder.build().buildUpon();
                    nl nlVar = sl.Fb;
                    ql qlVar = g9.r.e.f17698c;
                    buildUpon.appendQueryParameter((String) qlVar.a(nlVar), "1");
                    buildUpon.appendQueryParameter((String) qlVar.a(sl.Eb), "12");
                    if (str.contains((CharSequence) qlVar.a(sl.Gb))) {
                        buildUpon.authority((String) qlVar.a(sl.Hb));
                    }
                    ci0 ci0Var = g30Var.f6282c;
                    Uri build = buildUpon.build();
                    ci0Var.getClass();
                    try {
                        b5.b bVar = ci0Var.f5091a;
                        Objects.requireNonNull(bVar);
                        A = bVar.d(build, inputEvent);
                    } catch (Exception e8) {
                        A = ed1.A(e8);
                    }
                    return ed1.c0(q81.t(A), new dq(2, builder), g30Var.f6284f);
                }
                builder.appendQueryParameter((String) g9.r.e.f17698c.a(sl.Eb), "10");
                return ed1.e(builder.toString());
            case 2:
                ac0 ac0Var = (ac0) this.f8110c;
                String str2 = (String) this.f8109b;
                mw mwVar = (mw) this.f8111d;
                f9.a aVar = (f9.a) this.e;
                ac0Var.getClass();
                fp fpVar = f9.k.C.f16814d;
                h00 e10 = fp.e(ac0Var.f4439a, new x0(0, 0, 0), "native-omid", false, false, ac0Var.f4441c, null, ac0Var.f4442d, null, ac0Var.e, ac0Var.f4443f, null, null, ac0Var.f4452p, ac0Var.f4453q, ac0Var.f4449m);
                fj fjVar = new fj(e10);
                e10.j0().A = new tf(21, fjVar);
                e10.loadData(Base64.encodeToString(str2.getBytes(), 1), "text/html", "base64");
                if (((Boolean) g9.r.e.f17698c.a(sl.f10846mf)).booleanValue()) {
                    if (mwVar != null) {
                        e10.j0().S = mwVar;
                    }
                    e10.j0().Q = aVar;
                }
                return fjVar;
            case 3:
                zd1 zd1Var = (zd1) this.f8110c;
                return ed1.c0(((xg0) this.f8111d).a((dv) this.e), (j81) this.f8109b, (wx) zd1Var.f13142v);
            case 4:
                uj0 uj0Var = (uj0) this.f8110c;
                qp0 qp0Var = (qp0) this.f8111d;
                wp0 wp0Var = (wp0) this.e;
                di0 di0Var = (di0) this.f8109b;
                rr0 d2 = rr0.d(uj0Var.f11649j, 12);
                d2.j(qp0Var.E);
                d2.zza();
                ac.b Y = ed1.Y(di0Var.a(wp0Var, qp0Var), qp0Var.R, TimeUnit.MILLISECONDS, uj0Var.f11646f);
                uj0Var.f11648h.b(wp0Var, qp0Var, Y, uj0Var.f11644c);
                ed1.V(Y, uj0Var.f11650k, d2, false);
                return Y;
            case 5:
                cu0 cu0Var = (cu0) this.f8110c;
                hx0 hx0Var = (hx0) this.f8111d;
                zd1 zd1Var2 = (zd1) this.e;
                po0 po0Var = (po0) this.f8109b;
                rq0 rq0Var = (rq0) obj;
                synchronized (cu0Var) {
                    try {
                        cu0Var.f5172b = true;
                        rq0Var.f10272a = (j60) ((jk0) hx0Var.f6914v).f7466v;
                        if (!cu0Var.f5171a) {
                            zd1Var2.m(po0Var.f9571g, rq0Var);
                            e = v81.f11836v;
                        } else {
                            e = ed1.e(new yq0(rq0Var, po0Var));
                        }
                    } finally {
                    }
                }
                return e;
            case 6:
                return ((wy0) ((px0) this.f8110c).f9648b.f13335f.get()).a((Context) this.f8111d, (View) this.e, (Activity) this.f8109b);
            default:
                return ((wy0) ((px0) this.f8110c).f9648b.f13335f.get()).d((Context) this.f8111d, (String) this.f8109b, (View) this.e);
        }
    }

    public /* synthetic */ lr(int i, Object obj, Object obj2, Object obj3, String str) {
        this.f8108a = i;
        this.f8110c = obj;
        this.f8111d = obj2;
        this.f8109b = str;
        this.e = obj3;
    }

    public /* synthetic */ lr(ac0 ac0Var, String str, mw mwVar, f9.a aVar) {
        this.f8108a = 2;
        this.f8110c = ac0Var;
        this.f8109b = str;
        this.f8111d = mwVar;
        this.e = aVar;
    }

    public /* synthetic */ lr(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f8108a = i;
        this.f8110c = obj;
        this.f8111d = obj2;
        this.e = obj3;
        this.f8109b = obj4;
    }
}
