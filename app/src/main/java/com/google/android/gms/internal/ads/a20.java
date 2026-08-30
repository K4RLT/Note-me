package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class a20 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4319a;

    /* renamed from: b, reason: collision with root package name */
    public final y10 f4320b;

    /* renamed from: c, reason: collision with root package name */
    public bp0 f4321c;

    /* renamed from: d, reason: collision with root package name */
    public qo0 f4322d;
    public p80 e;

    /* renamed from: f, reason: collision with root package name */
    public k60 f4323f;

    public /* synthetic */ a20(y10 y10Var, int i) {
        this.f4319a = i;
        this.f4320b = y10Var;
    }

    public b20 a() {
        lo1.c(this.e, p80.class);
        lo1.c(this.f4323f, k60.class);
        return new b20(this.f4320b, new v80(16), this.e, this.f4323f, new tf(28, false), this.f4321c, this.f4322d);
    }

    public k20 b() {
        lo1.c(this.e, p80.class);
        lo1.c(this.f4323f, k60.class);
        return new k20(this.f4320b, new v80(16), this.e, this.f4323f, new tf(28, false), this.f4321c, this.f4322d);
    }

    public final /* bridge */ Object c() {
        switch (this.f4319a) {
            case 0:
                return a();
            default:
                return b();
        }
    }
}
