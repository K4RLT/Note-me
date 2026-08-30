package com.google.android.gms.internal.ads;
import a0.k;
import k9.a0;
import k9.f0;
import p.a;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class b00 extends iy {
    public int A;

    /* renamed from: w, reason: collision with root package name */
    public final ry f4647w;

    /* renamed from: x, reason: collision with root package name */
    public tf f4648x;

    /* renamed from: y, reason: collision with root package name */
    public ly f4649y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f4650z;

    public b00(Context context, ry ryVar) {
        super(context);
        this.A = 1;
        this.f4650z = false;
        this.f4647w = ryVar;
        ryVar.a(this);
    }

    public final boolean D() {
        int i = this.A;
        if (i != 1 && i != 2 && this.f4648x != null) {
            return true;
        }
        return false;
    }

    public final void E(int i) {
        sy syVar = this.f7252v;
        ry ryVar = this.f4647w;
        if (i == 4) {
            ryVar.d();
            syVar.f11196d = true;
            syVar.a();
        } else if (this.A == 4) {
            ryVar.f10347m = false;
            syVar.f11196d = false;
            syVar.a();
        }
        this.A = i;
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final String d() {
        return "ImmersivePlayer";
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final void e(ly lyVar) {
        this.f4649y = lyVar;
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final void f(String str) {
        if (str != null) {
            Uri.parse(str).toString();
            this.f4648x = new tf(14);
            E(3);
            k9.f0.f19676l.post(new zz(this, 2));
        }
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final void g() {
        k9.a0.k("AdImmersivePlayerView stop");
        tf tfVar = this.f4648x;
        if (tfVar != null) {
            ((AtomicBoolean) tfVar.f11339v).set(false);
            this.f4648x = null;
            E(1);
        }
        this.f4647w.b();
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final void h() {
        k9.a0.k("AdImmersivePlayerView play");
        if (D()) {
            ((AtomicBoolean) this.f4648x.f11339v).set(true);
            E(4);
            this.f7251u.f8892c = true;
            k9.f0.f19676l.post(new zz(this, 0));
        }
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final void i() {
        k9.a0.k("AdImmersivePlayerView pause");
        if (D() && ((AtomicBoolean) this.f4648x.f11339v).get()) {
            ((AtomicBoolean) this.f4648x.f11339v).set(false);
            E(5);
            k9.f0.f19676l.post(new zz(this, 1));
        }
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final int j() {
        return D() ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final int k() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final void l(int i) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 27);
        sb2.append("AdImmersivePlayerView seek ");
        sb2.append(i);
        k9.a0.k(sb2.toString());
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final void m(float f10, float f11) {
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final int n() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final int o() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final long p() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final long q() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final long r() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final int s() {
        return D() ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final void t() {
        if (this.f4648x != null) {
            this.f7252v.getClass();
        }
    }

    @Override // android.view.View
    public final String toString() {
        String name = b00.class.getName();
        String hexString = Integer.toHexString(hashCode());
        return p.a.o(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
    }
}
