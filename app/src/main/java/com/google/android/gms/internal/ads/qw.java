package com.google.android.gms.internal.ads;
import g9.r;
import k9.a0;
import k9.c0;

/* loaded from: classes.dex */
public final class qw {

    /* renamed from: a, reason: collision with root package name */
    public final c0 f9997a;

    public qw(c0 c0Var) {
        this.f9997a = c0Var;
    }

    public final void a(int i, long j10) {
        long j11;
        nl nlVar = sl.f10644a1;
        r rVar = r.e;
        if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue()) {
            return;
        }
        c0 c0Var = this.f9997a;
        c0Var.i();
        synchronized (c0Var.f19642a) {
            j11 = c0Var.D;
        }
        if (j10 - j11 < 0) {
            a0.k("Receiving npa decision in the past, ignoring.");
            return;
        }
        if (!((Boolean) rVar.f17698c.a(sl.f10660b1)).booleanValue()) {
            c0Var.c(-1);
            c0Var.d(j10);
        } else {
            c0Var.c(i);
            c0Var.d(j10);
        }
    }
}
