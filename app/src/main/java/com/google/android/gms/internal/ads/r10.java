package com.google.android.gms.internal.ads;
import b.a;
import l9.l;
import na.b;
import s9.p;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;

/* loaded from: classes.dex */
public final class r10 implements sr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10055a;

    /* renamed from: b, reason: collision with root package name */
    public final o10 f10056b;

    /* renamed from: c, reason: collision with root package name */
    public final rr1 f10057c;

    public r10(o10 o10Var, rr1 rr1Var) {
        this.f10055a = 2;
        this.f10057c = rr1Var;
        this.f10056b = o10Var;
    }

    public bl0 a() {
        be0 be0Var = (be0) this.f10057c.zzb();
        this.f10056b.a();
        return new bl0(5, be0Var);
    }

    @Override // com.google.android.gms.internal.ads.wr1
    public final Object zzb() {
        switch (this.f10055a) {
            case 0:
                try {
                    return na.b.a(this.f10056b.a()).c(0, ((ApplicationInfo) this.f10057c.zzb()).packageName);
                } catch (PackageManager.NameNotFoundException unused) {
                    return null;
                }
            case 1:
                return new l9.l(this.f10056b.a(), (String) this.f10057c.zzb());
            case 2:
                return a();
            default:
                Context a10 = this.f10056b.a();
                fe0 fe0Var = (fe0) this.f10057c.zzb();
                wx wxVar = xx.f12651a;
                lo1.b(wxVar);
                return new s9.p(a10, fe0Var, wxVar);
        }
    }

    public /* synthetic */ r10(o10 o10Var, rr1 rr1Var, int i) {
        this.f10055a = i;
        this.f10056b = o10Var;
        this.f10057c = rr1Var;
    }
}
