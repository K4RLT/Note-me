package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class s20 implements sr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10465a;

    /* renamed from: b, reason: collision with root package name */
    public final wr1 f10466b;

    public /* synthetic */ s20(wr1 wr1Var, int i) {
        this.f10465a = i;
        this.f10466b = wr1Var;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [fa.b, com.google.android.gms.internal.ads.pg0, com.google.android.gms.internal.ads.rg0, fa.c] */
    public rg0 a() {
        Context a10 = ((o10) this.f10466b).a();
        fa.c pg0Var = new pg0();
        pg0Var.B = 1;
        pg0Var.f9519z = new cj(a10, f9.k.C.f16828t.a(), (fa.b) pg0Var, (fa.c) pg0Var, 2);
        return pg0Var;
    }

    @Override // com.google.android.gms.internal.ads.wr1
    public final Object zzb() {
        switch (this.f10465a) {
            case 0:
                return new k9.r(((o10) this.f10466b).a());
            case 1:
                return new v20(((l10) this.f10466b).zzb(), 0);
            case 2:
                return new v20(((l10) this.f10466b).zzb(), 1);
            case 3:
                return new w20((nf0) this.f10466b.zzb(), 0);
            case 4:
                return new a30(0, (nf0) this.f10466b.zzb());
            case 5:
                return new d30(((o10) this.f10466b).a());
            case 6:
                return new v20(((l10) this.f10466b).zzb(), 2);
            case 7:
                return new a30(1, (r9.d) this.f10466b.zzb());
            case 8:
                return new y20(1, (pp0) this.f10466b.zzb());
            case 9:
                tw j10 = tw.j(((r20) this.f10466b).f10064a.a());
                return new a30(2, new x90((la.a) j10.f11470v, 5, (qw) ((rr1) j10.f11472x).zzb()));
            case 10:
                return new v20(((l10) this.f10466b).zzb(), 3);
            case 11:
                return new w20((nf0) this.f10466b.zzb(), 1);
            case 12:
                return new pr(((jr) this.f10466b.zzb()).f7513a);
            case 13:
                return new c90(new h40(0, (x70) ((w40) this.f10466b).f12132a.f18933v), xx.f12657h);
            case 14:
                return new c90((dg0) this.f10466b.zzb(), xx.f12657h);
            case 15:
                return new c90((r50) this.f10466b.zzb(), xx.f12657h);
            case 16:
                return new c90((r50) this.f10466b.zzb(), xx.f12657h);
            case 17:
                return ((d40) this.f10466b).zzb();
            case 18:
                l9.a a10 = ((u10) this.f10466b).a();
                k9.f0 f0Var = f9.k.C.f16813c;
                return new yh(UUID.randomUUID().toString(), a10, "native", new JSONObject(), true);
            case 19:
                String packageName = ((o10) this.f10466b).a().getPackageName();
                lo1.b(packageName);
                return packageName;
            case 20:
                Context a11 = ((o10) this.f10466b).a();
                wx wxVar = xx.f12651a;
                lo1.b(wxVar);
                return new lg0(a11, wxVar, 1);
            case gl.zzm /* 21 */:
                return a();
            case 22:
                return new hx0(22, ((w10) this.f10466b).zzb());
            case 23:
                return new jh0(((o10) this.f10466b).a());
            case 24:
                return new ci0(((o10) this.f10466b).a());
            case 25:
                return new ju0(((o10) this.f10466b).a());
            case 26:
                return new mk0((od0) this.f10466b.zzb());
            case 27:
                return new yk0((be0) this.f10466b.zzb());
            case 28:
                return new hl0(1, (Set) this.f10466b.zzb());
            default:
                wx wxVar2 = xx.f12651a;
                lo1.b(wxVar2);
                return new yl0(wxVar2, ((o10) this.f10466b).a(), 0);
        }
    }
}
