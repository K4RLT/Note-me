package com.google.android.gms.internal.ads;
import ac.b;

/* loaded from: classes.dex */
public final /* synthetic */ class r11 implements j81 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10058a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s11 f10059b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ vy0 f10060c;

    public /* synthetic */ r11(s11 s11Var, vy0 vy0Var, int i) {
        this.f10058a = i;
        this.f10059b = s11Var;
        this.f10060c = vy0Var;
    }

    @Override // com.google.android.gms.internal.ads.j81
    public final ac.b l(Object obj) {
        switch (this.f10058a) {
            case 0:
                s11 s11Var = this.f10059b;
                h91 a10 = s11Var.f10451a.a(this.f10060c);
                s11Var.f10454d.e(20303, a10);
                return a10;
            default:
                s11 s11Var2 = this.f10059b;
                h91 a11 = s11Var2.f10451a.a(this.f10060c);
                s11Var2.f10454d.e(20303, a11);
                return a11;
        }
    }
}
