package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class i11 implements d11 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6955a;

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f6956b;

    /* renamed from: c, reason: collision with root package name */
    public final cy0 f6957c;

    /* renamed from: d, reason: collision with root package name */
    public final String f6958d;
    public final String e;

    /* renamed from: f, reason: collision with root package name */
    public final h21 f6959f;

    /* renamed from: g, reason: collision with root package name */
    public final j11 f6960g;

    /* renamed from: h, reason: collision with root package name */
    public final int f6961h;

    public i11(Context context, ExecutorService executorService, rx0 rx0Var, cy0 cy0Var, h21 h21Var, j11 j11Var) {
        this.f6955a = context;
        this.f6956b = executorService;
        this.f6957c = cy0Var;
        this.f6959f = h21Var;
        this.f6960g = j11Var;
        this.f6958d = rx0Var.Q();
        int K = rx0Var.K();
        if (K != 1) {
            int i = K - 2;
            int i10 = 2;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        i10 = 5;
                    } else {
                        i10 = 4;
                    }
                } else {
                    i10 = 3;
                }
            }
            this.f6961h = i10;
            this.e = rx0Var.W().B();
            return;
        }
        ln1.a();
        throw null;
    }

    public static ty0 a(int i) {
        sy0 C = ty0.C();
        C.b();
        ((ty0) C.f4845v).H(i);
        return (ty0) C.c();
    }

    @Override // com.google.android.gms.internal.ads.d11
    public final q81 zza() {
        int i;
        zg z3 = bh.z();
        byte[] p10 = x21.p();
        mm1 mm1Var = om1.f9167v;
        final int i10 = 0;
        mm1 z9 = om1.z(p10, 0, p10.length);
        z3.b();
        ((bh) z3.f4845v).A(z9);
        long j10 = Build.VERSION.SDK_INT;
        z3.b();
        ((bh) z3.f4845v).B(j10);
        String str = Build.MODEL;
        z3.b();
        ((bh) z3.f4845v).C(str);
        Context context = this.f6955a;
        String packageName = context.getPackageName();
        z3.b();
        ((bh) z3.f4845v).D(packageName);
        try {
            i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            i = -1;
        }
        z3.b();
        ((bh) z3.f4845v).E(i);
        z3.b();
        ((bh) z3.f4845v).F(this.f6958d);
        z3.b();
        ((bh) z3.f4845v).G(3);
        z3.b();
        ((bh) z3.f4845v).H(this.f6961h);
        byte[] b10 = ((bh) z3.c()).b();
        p61 p61Var = r61.e;
        if (p61Var.f10132b != null) {
            p61Var = new p61(p61Var.f10131a, (Character) null);
        }
        final int i11 = 2;
        c81 d02 = ed1.d0(q81.t(this.f6957c.a(Uri.parse(this.e).buildUpon().appendQueryParameter("aspq", p61Var.g(b10, b10.length)).build().toString(), false, new byte[0], null)), new f31(this) { // from class: com.google.android.gms.internal.ads.h11

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i11 f6540b;

            {
                this.f6540b = this;
            }

            @Override // com.google.android.gms.internal.ads.f31
            public final Object apply(Object obj) {
                ty0 a10;
                switch (i11) {
                    case 0:
                        this.f6540b.f6959f.b(20007);
                        return i11.a(13);
                    case 1:
                        this.f6540b.f6959f.b(20008);
                        return i11.a(13);
                    default:
                        by0 by0Var = (by0) obj;
                        i11 i11Var = this.f6540b;
                        h21 h21Var = i11Var.f6959f;
                        if (by0Var.f4906a != 200) {
                            h21Var.c(20003, new String(x21.p(), StandardCharsets.UTF_8));
                            return i11.a(7);
                        }
                        try {
                            String str2 = new String(by0Var.f4907b);
                            if (TextUtils.isEmpty(str2)) {
                                h21Var.b(20004);
                                a10 = i11.a(8);
                            } else {
                                ch B = ch.B(ay0.t(str2, true), wm1.a());
                                if (B.z().B() && B.z().z()) {
                                    if (!i11Var.f6960g.a(B)) {
                                        h21Var.b(20006);
                                        a10 = i11.a(12);
                                    } else {
                                        sy0 C = ty0.C();
                                        uy0 E = vy0.E();
                                        kh A = B.z().A();
                                        E.b();
                                        ((vy0) E.f4845v).H(A);
                                        List A2 = B.A();
                                        E.b();
                                        ((vy0) E.f4845v).J((hn1) A2);
                                        vy0 vy0Var = (vy0) E.c();
                                        C.b();
                                        ((ty0) C.f4845v).D(vy0Var);
                                        om1 C2 = B.z().C();
                                        C.b();
                                        ((ty0) C.f4845v).E(C2);
                                        C.b();
                                        ((ty0) C.f4845v).H(2);
                                        a10 = (ty0) C.c();
                                    }
                                }
                                h21Var.b(20004);
                                a10 = i11.a(8);
                            }
                            return a10;
                        } catch (Throwable th) {
                            h21Var.d(20005, th);
                            return i11.a(6);
                        }
                }
            }
        }, this.f6956b);
        f31 f31Var = new f31(this) { // from class: com.google.android.gms.internal.ads.h11

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i11 f6540b;

            {
                this.f6540b = this;
            }

            @Override // com.google.android.gms.internal.ads.f31
            public final Object apply(Object obj) {
                ty0 a10;
                switch (i10) {
                    case 0:
                        this.f6540b.f6959f.b(20007);
                        return i11.a(13);
                    case 1:
                        this.f6540b.f6959f.b(20008);
                        return i11.a(13);
                    default:
                        by0 by0Var = (by0) obj;
                        i11 i11Var = this.f6540b;
                        h21 h21Var = i11Var.f6959f;
                        if (by0Var.f4906a != 200) {
                            h21Var.c(20003, new String(x21.p(), StandardCharsets.UTF_8));
                            return i11.a(7);
                        }
                        try {
                            String str2 = new String(by0Var.f4907b);
                            if (TextUtils.isEmpty(str2)) {
                                h21Var.b(20004);
                                a10 = i11.a(8);
                            } else {
                                ch B = ch.B(ay0.t(str2, true), wm1.a());
                                if (B.z().B() && B.z().z()) {
                                    if (!i11Var.f6960g.a(B)) {
                                        h21Var.b(20006);
                                        a10 = i11.a(12);
                                    } else {
                                        sy0 C = ty0.C();
                                        uy0 E = vy0.E();
                                        kh A = B.z().A();
                                        E.b();
                                        ((vy0) E.f4845v).H(A);
                                        List A2 = B.A();
                                        E.b();
                                        ((vy0) E.f4845v).J((hn1) A2);
                                        vy0 vy0Var = (vy0) E.c();
                                        C.b();
                                        ((ty0) C.f4845v).D(vy0Var);
                                        om1 C2 = B.z().C();
                                        C.b();
                                        ((ty0) C.f4845v).E(C2);
                                        C.b();
                                        ((ty0) C.f4845v).H(2);
                                        a10 = (ty0) C.c();
                                    }
                                }
                                h21Var.b(20004);
                                a10 = i11.a(8);
                            }
                            return a10;
                        } catch (Throwable th) {
                            h21Var.d(20005, th);
                            return i11.a(6);
                        }
                }
            }
        };
        o81 o81Var = o81.f9033u;
        final int i12 = 1;
        i71 S = ed1.S(ed1.S(d02, UnknownHostException.class, f31Var, o81Var), SocketException.class, new f31(this) { // from class: com.google.android.gms.internal.ads.h11

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i11 f6540b;

            {
                this.f6540b = this;
            }

            @Override // com.google.android.gms.internal.ads.f31
            public final Object apply(Object obj) {
                ty0 a10;
                switch (i12) {
                    case 0:
                        this.f6540b.f6959f.b(20007);
                        return i11.a(13);
                    case 1:
                        this.f6540b.f6959f.b(20008);
                        return i11.a(13);
                    default:
                        by0 by0Var = (by0) obj;
                        i11 i11Var = this.f6540b;
                        h21 h21Var = i11Var.f6959f;
                        if (by0Var.f4906a != 200) {
                            h21Var.c(20003, new String(x21.p(), StandardCharsets.UTF_8));
                            return i11.a(7);
                        }
                        try {
                            String str2 = new String(by0Var.f4907b);
                            if (TextUtils.isEmpty(str2)) {
                                h21Var.b(20004);
                                a10 = i11.a(8);
                            } else {
                                ch B = ch.B(ay0.t(str2, true), wm1.a());
                                if (B.z().B() && B.z().z()) {
                                    if (!i11Var.f6960g.a(B)) {
                                        h21Var.b(20006);
                                        a10 = i11.a(12);
                                    } else {
                                        sy0 C = ty0.C();
                                        uy0 E = vy0.E();
                                        kh A = B.z().A();
                                        E.b();
                                        ((vy0) E.f4845v).H(A);
                                        List A2 = B.A();
                                        E.b();
                                        ((vy0) E.f4845v).J((hn1) A2);
                                        vy0 vy0Var = (vy0) E.c();
                                        C.b();
                                        ((ty0) C.f4845v).D(vy0Var);
                                        om1 C2 = B.z().C();
                                        C.b();
                                        ((ty0) C.f4845v).E(C2);
                                        C.b();
                                        ((ty0) C.f4845v).H(2);
                                        a10 = (ty0) C.c();
                                    }
                                }
                                h21Var.b(20004);
                                a10 = i11.a(8);
                            }
                            return a10;
                        } catch (Throwable th) {
                            h21Var.d(20005, th);
                            return i11.a(6);
                        }
                }
            }
        }, o81Var);
        this.f6959f.e(20002, S);
        return S;
    }
}
