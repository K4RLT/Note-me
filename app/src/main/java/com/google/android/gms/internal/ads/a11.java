package com.google.android.gms.internal.ads;
import c7.f0;

/* loaded from: classes.dex */
public final /* synthetic */ class a11 implements f31 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4311a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c11 f4312b;

    public /* synthetic */ a11(c11 c11Var, int i) {
        this.f4311a = i;
        this.f4312b = c11Var;
    }

    @Override // com.google.android.gms.internal.ads.f31
    public final Object apply(Object obj) {
        byte[] bArr = (byte[]) obj;
        switch (this.f4311a) {
            case 0:
                this.f4312b.g(new c7.f0(1), bArr, false);
                return null;
            default:
                this.f4312b.g(new c7.f0(1), bArr, true);
                return null;
        }
    }
}
