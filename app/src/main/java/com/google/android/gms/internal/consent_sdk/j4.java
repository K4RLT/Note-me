package com.google.android.gms.internal.consent_sdk;
import c7.a;
import f0.c;
import l4.a;
import q.x;
import x.n;

import android.util.Log;
import com.google.android.gms.internal.ads.gl;

/* loaded from: classes.dex */
public final class j4 implements e6, e7, xb.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f13457u;

    /* renamed from: v, reason: collision with root package name */
    public static final j4 f13452v = new j4(0);

    /* renamed from: w, reason: collision with root package name */
    public static final j4 f13453w = new j4(1);

    /* renamed from: x, reason: collision with root package name */
    public static final j4 f13454x = new j4(2);

    /* renamed from: y, reason: collision with root package name */
    public static final j4 f13455y = new j4(3);

    /* renamed from: z, reason: collision with root package name */
    public static final j4 f13456z = new j4(4);
    public static final j4 A = new j4(5);
    public static final j4 B = new j4(6);
    public static final j4 C = new j4(7);
    public static final j4 D = new j4(8);
    public static final j4 E = new j4(9);
    public static final j4 F = new j4(10);
    public static final j4 G = new j4(11);
    public static final j4 H = new j4(12);
    public static final j4 I = new j4(13);
    public static final j4 J = new j4(14);
    public static final j4 K = new j4(15);
    public static final j4 L = new j4(16);
    public static final j4 M = new j4(17);
    public static final j4 N = new j4(18);
    public static final j4 O = new j4(19);
    public static final j4 P = new j4(20);

    public /* synthetic */ j4(int i) {
        this.f13457u = i;
    }

    @Override // com.google.android.gms.internal.consent_sdk.e6
    public l6 a(Class cls) {
        switch (this.f13457u) {
            case 20:
                if (q5.class.isAssignableFrom(cls)) {
                    try {
                        return (l6) q5.h(cls.asSubclass(q5.class)).f(3);
                    } catch (Exception e) {
                        l4.a.k("Unable to get message info for ".concat(cls.getName()), e);
                    }
                } else {
                    q.x.n("Unsupported message type: ".concat(cls.getName()));
                }
                return null;
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.e6
    public boolean b(Class cls) {
        switch (this.f13457u) {
            case 20:
                return q5.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override // xb.a
    public void d(c7.a aVar) {
        Log.e("UserMessagingPlatform", "Failed to load and cache a form, error=".concat(String.valueOf(aVar.f3896v)));
    }

    @Override // com.google.android.gms.internal.consent_sdk.f7
    public Object zzb() {
        switch (this.f13457u) {
            case gl.zzm /* 21 */:
                return new Object();
            default:
                c0 c0Var = d0.f13388b;
                f0.c(c0Var);
                return new p0(c0Var);
        }
    }
}
