package com.google.android.gms.internal.ads;
import ac.b;

import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class tz0 implements b01 {

    /* renamed from: a, reason: collision with root package name */
    public final Map f11493a;

    /* renamed from: b, reason: collision with root package name */
    public final wd f11494b;

    /* renamed from: c, reason: collision with root package name */
    public final g21 f11495c;

    /* renamed from: d, reason: collision with root package name */
    public final long f11496d;

    public tz0(wd wdVar, Map map, rx0 rx0Var, h21 h21Var) {
        this.f11493a = map;
        this.f11494b = wdVar;
        this.f11495c = h21Var.a(112);
        this.f11496d = rx0Var.X();
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        je jeVar;
        try {
            try {
                this.f11495c.a();
                ac.b bVar = (ac.b) this.f11493a.get("gs");
                if (bVar != null && (jeVar = (je) bVar.get(this.f11496d, TimeUnit.MILLISECONDS)) != null) {
                    wd wdVar = this.f11494b;
                    synchronized (wdVar) {
                        re z02 = jeVar.z0();
                        wdVar.b();
                        ((je) wdVar.f4845v).n0(z02);
                        long w02 = jeVar.w0();
                        wdVar.b();
                        ((je) wdVar.f4845v).W(w02);
                    }
                }
            } catch (Throwable th) {
                this.f11495c.c();
                throw th;
            }
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException e) {
            this.f11495c.b(e);
        }
        this.f11495c.c();
        return null;
    }
}
