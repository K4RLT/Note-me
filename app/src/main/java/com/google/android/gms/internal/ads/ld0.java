package com.google.android.gms.internal.ads;
import j6.s;
import l9.k;

/* loaded from: classes.dex */
public final class ld0 {

    /* renamed from: a, reason: collision with root package name */
    public final be0 f8013a;

    public ld0(be0 be0Var) {
        this.f8013a = be0Var;
    }

    public final boolean a(mw0 mw0Var) {
        boolean K = mw0Var.K();
        l9.k kVar = l9.k.f20054u;
        be0 be0Var = this.f8013a;
        if (K) {
            j6.s a10 = be0Var.a();
            a10.k("action", "aq_ad_closed");
            a10.k("gqi", mw0Var.C());
            a10.k("aq_ad_duration", String.valueOf(mw0Var.D()));
            a10.k("aq_ad_bounce_cnt", String.valueOf(mw0Var.E()));
            a10.k("aq_time_away", String.valueOf(mw0Var.H()));
            return a10.m().equals(kVar);
        }
        j6.s a11 = be0Var.a();
        a11.k("action", "aq_ad_kill");
        a11.k("gqi", mw0Var.C());
        a11.k("aq_ad_duration", String.valueOf(mw0Var.D()));
        a11.k("aq_ad_bounce_cnt", String.valueOf(mw0Var.E()));
        a11.k("aq_time_away", String.valueOf(mw0Var.H()));
        a11.k("aq_is_os_kill", String.valueOf(mw0Var.G()));
        return a11.m().equals(kVar);
    }
}
