package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes.dex */
public final class h6 implements m6 {

    /* renamed from: a, reason: collision with root package name */
    public final c5 f13433a;

    /* renamed from: b, reason: collision with root package name */
    public final s6 f13434b;

    public h6(s6 s6Var, c5 c5Var) {
        j4 j4Var = l5.f13482a;
        this.f13434b = s6Var;
        this.f13433a = c5Var;
    }

    @Override // com.google.android.gms.internal.consent_sdk.m6
    public final void a(Object obj) {
        this.f13434b.getClass();
        r6 r6Var = ((q5) obj).zzc;
        if (r6Var.f13542d) {
            r6Var.f13542d = false;
        }
        j4 j4Var = l5.f13482a;
        throw p.a.f(obj);
    }

    @Override // com.google.android.gms.internal.consent_sdk.m6
    public final int b(q5 q5Var) {
        q5Var.zzc.getClass();
        return 506991;
    }

    @Override // com.google.android.gms.internal.consent_sdk.m6
    public final q5 c() {
        c5 c5Var = this.f13433a;
        if (c5Var instanceof q5) {
            return (q5) ((q5) c5Var).f(4);
        }
        p5 p5Var = (p5) ((q5) c5Var).f(5);
        boolean e = p5Var.f13523v.e();
        q5 q5Var = p5Var.f13523v;
        if (!e) {
            return q5Var;
        }
        q5Var.getClass();
        j6.f13458c.a(q5Var.getClass()).a(q5Var);
        q5Var.j();
        return p5Var.f13523v;
    }

    @Override // com.google.android.gms.internal.consent_sdk.m6
    public final boolean d(q5 q5Var, q5 q5Var2) {
        if (!q5Var.zzc.equals(q5Var2.zzc)) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.consent_sdk.m6
    public final void e(Object obj, a6 a6Var) {
        throw p.a.f(obj);
    }

    @Override // com.google.android.gms.internal.consent_sdk.m6
    public final void f(Object obj, Object obj2) {
        n6.o(obj, obj2);
    }

    @Override // com.google.android.gms.internal.consent_sdk.m6
    public final int g(c5 c5Var) {
        r6 r6Var = ((q5) c5Var).zzc;
        int i = r6Var.f13541c;
        if (i == -1) {
            r6Var.f13541c = 0;
            return 0;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.consent_sdk.m6
    public final boolean h(Object obj) {
        throw p.a.f(obj);
    }
}
