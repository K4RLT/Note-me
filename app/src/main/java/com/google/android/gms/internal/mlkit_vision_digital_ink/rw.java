package com.google.android.gms.internal.mlkit_vision_digital_ink;
import n0.a;
import pa.f;
import pa.j;

import android.content.Context;
import android.net.Uri;

/* loaded from: classes.dex */
public final class rw implements uq {
    public final kv A;
    public final tq B;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f14938u;

    /* renamed from: v, reason: collision with root package name */
    public final pw f14939v;

    /* renamed from: w, reason: collision with root package name */
    public final s5 f14940w;

    /* renamed from: x, reason: collision with root package name */
    public final tq f14941x;

    /* renamed from: y, reason: collision with root package name */
    public final tq f14942y;

    /* renamed from: z, reason: collision with root package name */
    public final tq f14943z;

    public /* synthetic */ rw(pw pwVar, s5 s5Var, tq tqVar, tq tqVar2, tq tqVar3, kv kvVar, tq tqVar4, int i) {
        this.f14938u = i;
        this.f14939v = pwVar;
        this.f14940w = s5Var;
        this.f14941x = tqVar;
        this.f14942y = tqVar2;
        this.f14943z = tqVar3;
        this.A = kvVar;
        this.B = tqVar4;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.uq
    public final Object c() {
        switch (this.f14938u) {
            case 0:
                Context e = this.f14940w.e();
                Uri uri = (Uri) this.f14941x.c();
                s5 a10 = this.A.a();
                q2 q2Var = (q2) this.B.c();
                pw pwVar = this.f14939v;
                pwVar.getClass();
                m0 a11 = n0.a();
                a11.b(uri);
                a11.a(rs.v());
                a11.c(false);
                a11.e(pa.j(e, (ab) pwVar.f14821v, a10, q2Var));
                s0 p10 = ((u0) pwVar.f14822w).p(a11.d());
                pa.f(p10);
                return p10;
            default:
                Context e8 = this.f14940w.e();
                Uri uri2 = (Uri) this.f14941x.c();
                s5 a12 = this.A.a();
                q2 q2Var2 = (q2) this.B.c();
                pw pwVar2 = this.f14939v;
                pwVar2.getClass();
                m0 a13 = n0.a();
                a13.b(uri2);
                a13.a(rs.v());
                a13.c(false);
                a13.e(pa.j(e8, (ab) pwVar2.f14821v, a12, q2Var2));
                s0 p11 = ((u0) pwVar2.f14822w).p(a13.d());
                pa.f(p11);
                return p11;
        }
    }
}
