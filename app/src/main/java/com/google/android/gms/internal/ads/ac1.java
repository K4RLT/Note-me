package com.google.android.gms.internal.ads;
import c2.b;

/* loaded from: classes.dex */
public final class ac1 extends c2.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4457d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ac1(byte[] bArr, int i) {
        super(bArr);
        this.f4457d = i;
    }

    @Override // c2.b
    public final zb1 g(byte[] bArr, int i) {
        switch (this.f4457d) {
            case 0:
                return new yb1(bArr, i, 0);
            default:
                return new yb1(bArr, i, 1);
        }
    }
}
