package com.google.android.gms.internal.ads;
import ac.b;

/* loaded from: classes.dex */
public final /* synthetic */ class m11 implements j81 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8203a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n11 f8204b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ vy0 f8205c;

    public /* synthetic */ m11(n11 n11Var, vy0 vy0Var, int i) {
        this.f8203a = i;
        this.f8204b = n11Var;
        this.f8205c = vy0Var;
    }

    @Override // com.google.android.gms.internal.ads.j81
    public final ac.b l(Object obj) {
        switch (this.f8203a) {
            case 0:
                n11 n11Var = this.f8204b;
                h91 a10 = n11Var.f8513b.a(this.f8205c);
                n11Var.i.e(15303, a10);
                return a10;
            default:
                n11 n11Var2 = this.f8204b;
                h91 a11 = n11Var2.f8513b.a(this.f8205c);
                n11Var2.i.e(15303, a11);
                return a11;
        }
    }
}
