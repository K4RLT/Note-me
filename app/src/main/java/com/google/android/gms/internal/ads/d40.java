package com.google.android.gms.internal.ads;
import la.a;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class d40 implements sr1 {

    /* renamed from: a, reason: collision with root package name */
    public final rr1 f5304a;

    /* renamed from: b, reason: collision with root package name */
    public final rr1 f5305b;

    /* renamed from: c, reason: collision with root package name */
    public final rr1 f5306c;

    public d40(rr1 rr1Var, rr1 rr1Var2, rr1 rr1Var3) {
        this.f5304a = rr1Var;
        this.f5305b = rr1Var2;
        this.f5306c = rr1Var3;
    }

    @Override // com.google.android.gms.internal.ads.wr1
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final x70 zzb() {
        return new x70((ScheduledExecutorService) this.f5304a.zzb(), (a) this.f5305b.zzb(), (be0) this.f5306c.zzb());
    }
}
