package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class bz extends c1.a {

    /* renamed from: w, reason: collision with root package name */
    public final h00 f4908w;

    /* renamed from: x, reason: collision with root package name */
    public final jz f4909x;

    /* renamed from: y, reason: collision with root package name */
    public final String f4910y;

    /* renamed from: z, reason: collision with root package name */
    public final String[] f4911z;

    public bz(h00 h00Var, jz jzVar, String str, String[] strArr) {
        super(3);
        this.f4908w = h00Var;
        this.f4909x = jzVar;
        this.f4910y = str;
        this.f4911z = strArr;
        f9.k.C.A.f5226u.add(this);
    }

    @Override // c1.a
    public final void q() {
        try {
            this.f4909x.d(this.f4910y, this.f4911z);
        } finally {
            k9.f0.f19676l.post(new f(20, this));
        }
    }

    @Override // c1.a
    public final ac.b r() {
        if (((Boolean) g9.r.e.f17698c.a(sl.D2)).booleanValue() && (this.f4909x instanceof oz)) {
            return xx.f12655f.j(new qf(2, this));
        }
        return super.r();
    }
}
