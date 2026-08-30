package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class g3 extends t2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a3 f6278b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f3 f6279c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(f3 f3Var, a3 a3Var, a3 a3Var2) {
        super(a3Var);
        this.f6278b = a3Var2;
        this.f6279c = f3Var;
    }

    @Override // com.google.android.gms.internal.ads.t2, com.google.android.gms.internal.ads.a3
    public final z2 a(long j10) {
        z2 a10 = this.f6278b.a(j10);
        b3 b3Var = a10.f13048a;
        long j11 = b3Var.f4702a;
        long j12 = b3Var.f4703b;
        long j13 = this.f6279c.f5899v;
        b3 b3Var2 = new b3(j11, j12 + j13);
        b3 b3Var3 = a10.f13049b;
        return new z2(b3Var2, new b3(b3Var3.f4702a, b3Var3.f4703b + j13));
    }
}
