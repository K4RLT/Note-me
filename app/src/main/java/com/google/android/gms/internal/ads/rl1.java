package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class rl1 extends ul1 {

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f10237z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rl1(wl1 wl1Var, int i) {
        super(wl1Var);
        this.f10237z = i;
    }

    @Override // com.google.android.gms.internal.ads.ul1, java.util.Iterator
    public Object next() {
        switch (this.f10237z) {
            case 1:
                return a().f11940z;
            default:
                return super.next();
        }
    }
}
