package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class gy implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f6500u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f6501v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f6502w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ iy f6503x;

    public /* synthetic */ gy(iy iyVar, int i, int i10, int i11) {
        this.f6500u = i11;
        this.f6501v = i;
        this.f6502w = i10;
        this.f6503x = iyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6500u) {
            case 0:
                ly lyVar = ((hy) this.f6503x).K;
                if (lyVar != null) {
                    lyVar.j(this.f6501v, this.f6502w);
                    return;
                }
                return;
            default:
                ly lyVar2 = ((vy) this.f6503x).A;
                if (lyVar2 != null) {
                    lyVar2.j(this.f6501v, this.f6502w);
                    return;
                }
                return;
        }
    }
}
