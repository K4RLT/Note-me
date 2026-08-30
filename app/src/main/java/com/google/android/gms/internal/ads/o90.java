package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class o90 implements sr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9045a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.e4 f9046b;

    public /* synthetic */ o90(com.google.android.gms.internal.measurement.e4 e4Var, int i) {
        this.f9045a = i;
        this.f9046b = e4Var;
    }

    @Override // com.google.android.gms.internal.ads.wr1
    public final Object zzb() {
        switch (this.f9045a) {
            case 0:
                h00 h00Var = (h00) this.f9046b.f13729w;
                if (h00Var == null) {
                    return null;
                }
                return h00Var.u();
            case 1:
                h00 h00Var2 = (h00) this.f9046b.f13729w;
                if (h00Var2 != null) {
                    return h00Var2.u();
                }
                return null;
            default:
                return (h00) this.f9046b.f13729w;
        }
    }
}
