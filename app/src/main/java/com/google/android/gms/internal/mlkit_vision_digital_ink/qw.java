package com.google.android.gms.internal.mlkit_vision_digital_ink;
import n0.a;
import pa.c;
import pa.f;

import android.content.Context;
import android.net.Uri;

/* loaded from: classes.dex */
public final class qw implements uq {
    public final kv A;
    public final tq B;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f14872u;

    /* renamed from: v, reason: collision with root package name */
    public final pw f14873v;

    /* renamed from: w, reason: collision with root package name */
    public final s5 f14874w;

    /* renamed from: x, reason: collision with root package name */
    public final tq f14875x;

    /* renamed from: y, reason: collision with root package name */
    public final tq f14876y;

    /* renamed from: z, reason: collision with root package name */
    public final tq f14877z;

    public /* synthetic */ qw(pw pwVar, s5 s5Var, tq tqVar, tq tqVar2, tq tqVar3, kv kvVar, tq tqVar4, int i) {
        this.f14872u = i;
        this.f14873v = pwVar;
        this.f14874w = s5Var;
        this.f14875x = tqVar;
        this.f14876y = tqVar2;
        this.f14877z = tqVar3;
        this.A = kvVar;
        this.B = tqVar4;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.uq
    public final Object c() {
        switch (this.f14872u) {
            case 0:
                Context e = this.f14874w.e();
                Uri uri = (Uri) this.f14875x.c();
                s5 a10 = this.A.a();
                q2 q2Var = (q2) this.B.c();
                pw pwVar = this.f14873v;
                pwVar.getClass();
                m0 a11 = a();
                a11.b(uri);
                a11.a(cs.u());
                a11.c(false);
                a11.e(c(e, (ab) pwVar.f14821v, a10, q2Var));
                s0 p10 = ((u0) pwVar.f14822w).p(a11.d());
                f(p10);
                return p10;
            default:
                Context e8 = this.f14874w.e();
                Uri uri2 = (Uri) this.f14875x.c();
                s5 a12 = this.A.a();
                q2 q2Var2 = (q2) this.B.c();
                pw pwVar2 = this.f14873v;
                pwVar2.getClass();
                m0 a13 = a();
                a13.b(uri2);
                a13.a(cs.u());
                a13.c(false);
                a13.e(c(e8, (ab) pwVar2.f14821v, a12, q2Var2));
                s0 p11 = ((u0) pwVar2.f14822w).p(a13.d());
                f(p11);
                return p11;
        }
    }
}
