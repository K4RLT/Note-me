package com.google.android.gms.internal.ads;
import la.a;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ga0 implements sr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6334a;

    /* renamed from: b, reason: collision with root package name */
    public final rr1 f6335b;

    /* renamed from: c, reason: collision with root package name */
    public final wr1 f6336c;

    /* renamed from: d, reason: collision with root package name */
    public final wr1 f6337d;
    public final wr1 e;

    public /* synthetic */ ga0(rr1 rr1Var, rr1 rr1Var2, rr1 rr1Var3, Object obj, int i) {
        this.f6334a = i;
        this.f6335b = rr1Var;
        this.f6336c = rr1Var2;
        this.f6337d = rr1Var3;
        this.e = (wr1) obj;
    }

    @Override // com.google.android.gms.internal.ads.wr1
    public final /* bridge */ /* synthetic */ Object zzb() {
        switch (this.f6334a) {
            case 0:
                yh yhVar = (yh) this.f6335b.zzb();
                Executor executor = (Executor) this.f6336c.zzb();
                Context context = (Context) this.f6337d.zzb();
                return new x30(executor, new r30(context, yhVar), (la.a) this.e.zzb());
            default:
                pr1 b10 = rr1.b(this.f6335b);
                h21 h21Var = (h21) this.f6336c.zzb();
                return new u11(b10, h21Var, ((rx0) this.e.zzb()).W().A());
        }
    }
}
