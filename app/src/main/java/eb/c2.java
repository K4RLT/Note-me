package eb;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class c2 implements Runnable {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ t1 B;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f16085u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f16086v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ long f16087w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Bundle f16088x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ boolean f16089y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ boolean f16090z;

    public c2(t1 t1Var, String str, String str2, long j10, Bundle bundle, boolean z3, boolean z9, boolean z10) {
        this.f16085u = str;
        this.f16086v = str2;
        this.f16087w = j10;
        this.f16088x = bundle;
        this.f16089y = z3;
        this.f16090z = z9;
        this.A = z10;
        this.B = t1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.B.O(this.f16085u, this.f16086v, this.f16087w, this.f16088x, this.f16089y, this.f16090z, this.A);
    }
}
