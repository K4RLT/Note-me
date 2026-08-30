package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class fz0 {

    /* renamed from: a, reason: collision with root package name */
    public final wx f6224a;

    /* renamed from: b, reason: collision with root package name */
    public final hz0 f6225b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f6226c;

    /* renamed from: d, reason: collision with root package name */
    public final String f6227d;
    public final wd e;

    /* renamed from: f, reason: collision with root package name */
    public final pz0 f6228f;

    /* renamed from: g, reason: collision with root package name */
    public final h21 f6229g;

    public fz0(wx wxVar, hz0 hz0Var, pz0 pz0Var, yx0 yx0Var, String str, wd wdVar, xr1 xr1Var, xr1 xr1Var2, xr1 xr1Var3, h21 h21Var) {
        this.f6224a = wxVar;
        this.f6225b = hz0Var;
        this.f6227d = str;
        this.f6228f = pz0Var;
        this.e = wdVar;
        this.f6229g = h21Var;
        int ordinal = yx0Var.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    this.f6226c = xr1Var3.zzb();
                    return;
                } else {
                    g5.q.l();
                    throw null;
                }
            }
            this.f6226c = xr1Var2.zzb();
            return;
        }
        this.f6226c = xr1Var.zzb();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [com.google.android.gms.internal.ads.n81, ac.b, com.google.android.gms.internal.ads.e81] */
    public final ac.b a() {
        boolean z3;
        boolean z9;
        hz0 hz0Var = this.f6225b;
        synchronized (hz0Var) {
            z3 = hz0Var.f6939d;
        }
        if (!z3) {
            return ed1.e(Integer.toString(7));
        }
        pz0 pz0Var = this.f6228f;
        synchronized (pz0Var) {
            z9 = pz0Var.f9682j;
        }
        if (!z9) {
            final int i = 1;
            return ed1.E(new Callable(this) { // from class: com.google.android.gms.internal.ads.ez0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ fz0 f5872b;

                {
                    this.f5872b = this;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    String encodeToString;
                    switch (i) {
                        case 0:
                            fz0 fz0Var = this.f5872b;
                            try {
                                fz0Var.f6229g.a(FacebookMediationAdapter.ERROR_INVALID_SERVER_PARAMETERS).a();
                                je jeVar = (je) fz0Var.e.c();
                                String str = fz0Var.f6227d;
                                hz0 hz0Var2 = fz0Var.f6225b;
                                try {
                                    encodeToString = Base64.encodeToString(((ue) hz0Var2.d(str, jeVar.b()).c()).b(), 11);
                                } catch (IllegalArgumentException unused) {
                                    hz0Var2.getClass();
                                    wd B0 = je.B0();
                                    B0.g(4096);
                                    encodeToString = Base64.encodeToString(hz0Var2.b(((je) B0.c()).b(), str, true), 11);
                                }
                                return encodeToString;
                            } finally {
                            }
                        default:
                            fz0 fz0Var2 = this.f5872b;
                            String str2 = fz0Var2.f6227d;
                            hz0 hz0Var3 = fz0Var2.f6225b;
                            hz0Var3.getClass();
                            wd B02 = je.B0();
                            B02.g(16384);
                            return Base64.encodeToString(hz0Var3.b(((je) B02.c()).b(), str2, true), 11);
                    }
                }
            }, this.f6224a);
        }
        Set set = this.f6226c;
        ArrayList arrayList = new ArrayList(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f6224a.j((b01) it.next()));
        }
        d51 u9 = d51.u(arrayList);
        final int i10 = 0;
        Callable callable = new Callable(this) { // from class: com.google.android.gms.internal.ads.ez0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ fz0 f5872b;

            {
                this.f5872b = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                String encodeToString;
                switch (i10) {
                    case 0:
                        fz0 fz0Var = this.f5872b;
                        try {
                            fz0Var.f6229g.a(FacebookMediationAdapter.ERROR_INVALID_SERVER_PARAMETERS).a();
                            je jeVar = (je) fz0Var.e.c();
                            String str = fz0Var.f6227d;
                            hz0 hz0Var2 = fz0Var.f6225b;
                            try {
                                encodeToString = Base64.encodeToString(((ue) hz0Var2.d(str, jeVar.b()).c()).b(), 11);
                            } catch (IllegalArgumentException unused) {
                                hz0Var2.getClass();
                                wd B0 = je.B0();
                                B0.g(4096);
                                encodeToString = Base64.encodeToString(hz0Var2.b(((je) B0.c()).b(), str, true), 11);
                            }
                            return encodeToString;
                        } finally {
                        }
                    default:
                        fz0 fz0Var2 = this.f5872b;
                        String str2 = fz0Var2.f6227d;
                        hz0 hz0Var3 = fz0Var2.f6225b;
                        hz0Var3.getClass();
                        wd B02 = je.B0();
                        B02.g(16384);
                        return Base64.encodeToString(hz0Var3.b(((je) B02.c()).b(), str2, true), 11);
                }
            }
        };
        o81 o81Var = o81.f9033u;
        ?? e81Var = new e81(u9, false, false);
        e81Var.J = new m81(e81Var, callable, o81Var);
        e81Var.x();
        return e81Var;
    }
}
