package com.google.android.gms.internal.ads;
import l9.i;
import n9.c;
import n9.i;
import n9.l;
import n9.q;
import n9.t;
import n9.x;
import z8.a;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final class et implements l, q, x, t, i {

    /* renamed from: a, reason: collision with root package name */
    public final as f5770a;

    public et(as asVar) {
        this.f5770a = asVar;
    }

    @Override // q, x, i
    public final void a(a aVar) {
        try {
            int i = aVar.f31969a;
            String str = aVar.f31970b;
            String str2 = aVar.f31971c;
            StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 59 + String.valueOf(str).length() + 16 + String.valueOf(str2).length());
            sb2.append("Mediated ad failed to show: Error Code = ");
            sb2.append(i);
            sb2.append(". Error Message = ");
            sb2.append(str);
            sb2.append(" Error Domain = ");
            sb2.append(str2);
            i.f(sb2.toString());
            this.f5770a.c3(aVar.a());
        } catch (RemoteException unused) {
        }
    }

    @Override // l, q, t
    public final void b() {
        try {
            this.f5770a.d();
        } catch (RemoteException unused) {
        }
    }

    @Override // x, t
    public final void c() {
        try {
            this.f5770a.n();
        } catch (RemoteException unused) {
        }
    }

    @Override // x
    public final void d() {
        try {
            this.f5770a.s();
        } catch (RemoteException unused) {
        }
    }

    @Override // c
    public final void e() {
        try {
            this.f5770a.g();
        } catch (RemoteException unused) {
        }
    }

    @Override // x
    public final void f() {
        try {
            this.f5770a.D();
        } catch (RemoteException unused) {
        }
    }

    @Override // c
    public final void g() {
        try {
            this.f5770a.i();
        } catch (RemoteException unused) {
        }
    }

    @Override // c
    public final void h() {
        try {
            this.f5770a.a();
        } catch (RemoteException unused) {
        }
    }

    @Override // c
    public final void onAdClosed() {
        try {
            this.f5770a.b();
        } catch (RemoteException unused) {
        }
    }
}
