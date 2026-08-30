package com.google.android.gms.internal.ads;
import la.a;

import android.content.Context;
import java.math.BigInteger;

/* loaded from: classes.dex */
public final class k50 implements sr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7657a;

    /* renamed from: b, reason: collision with root package name */
    public final wr1 f7658b;

    /* renamed from: c, reason: collision with root package name */
    public final o60 f7659c;

    /* renamed from: d, reason: collision with root package name */
    public final wr1 f7660d;

    public k50(o60 o60Var, rr1 rr1Var, l10 l10Var) {
        this.f7657a = 3;
        this.f7659c = o60Var;
        this.f7658b = rr1Var;
        this.f7660d = l10Var;
    }

    public ll0 a() {
        wx wxVar = xx.f12651a;
        lo1.b(wxVar);
        return new ll0(wxVar, (qd0) this.f7658b.zzb(), this.f7659c.a(), (String) this.f7660d.zzb(), 3);
    }

    public ll0 b() {
        Context a10 = ((o10) this.f7658b).a();
        wx wxVar = xx.f12651a;
        lo1.b(wxVar);
        return new ll0(a10, wxVar, this.f7659c.a(), ((u10) this.f7660d).a());
    }

    @Override // com.google.android.gms.internal.ads.wr1
    public final Object zzb() {
        String bigInteger;
        switch (this.f7657a) {
            case 0:
                a aVar = (a) this.f7658b.zzb();
                sx zzb = ((v10) this.f7660d).zzb();
                String str = this.f7659c.a().f4583g;
                z11 z11Var = zzb.f11185w;
                synchronized (z11Var) {
                    bigInteger = ((BigInteger) z11Var.f13046v).toString();
                    z11Var.f13046v = ((BigInteger) z11Var.f13046v).add(BigInteger.ONE);
                    z11Var.f13047w = bigInteger;
                }
                return new lx(aVar, zzb, bigInteger, str);
            case 1:
                return new nl0((a) this.f7658b.zzb(), this.f7659c.a(), ((Long) this.f7660d.zzb()).longValue());
            case 2:
                return a();
            case 3:
                wx wxVar = xx.f12651a;
                lo1.b(wxVar);
                return new ll0((Object) wxVar, this.f7659c.a(), this.f7658b.zzb(), (Object) ((l10) this.f7660d).zzb(), 5);
            default:
                return b();
        }
    }

    public k50(rr1 rr1Var, v10 v10Var, o60 o60Var) {
        this.f7657a = 0;
        this.f7658b = rr1Var;
        this.f7660d = v10Var;
        this.f7659c = o60Var;
    }

    public /* synthetic */ k50(wr1 wr1Var, o60 o60Var, wr1 wr1Var2, int i) {
        this.f7657a = i;
        this.f7658b = wr1Var;
        this.f7659c = o60Var;
        this.f7660d = wr1Var2;
    }
}
