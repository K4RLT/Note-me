package com.google.android.gms.internal.ads;
import b.c;
import ee.a;
import f9.k;
import g9.r;
import r.e;
import y5.b;
import ya.ee;

import android.util.Base64;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class h10 {

    /* renamed from: a, reason: collision with root package name */
    public String f6535a;

    /* renamed from: b, reason: collision with root package name */
    public hp1 f6536b;

    /* renamed from: c, reason: collision with root package name */
    public er1 f6537c;

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f6538d;
    public final AtomicBoolean e = new AtomicBoolean(false);

    public h10(ScheduledExecutorService scheduledExecutorService) {
        this.f6538d = scheduledExecutorService;
    }

    public final void a() {
        if (((Boolean) g9.r.e.f17698c.a(sl.f10653aa)).booleanValue() && !this.e.getAndSet(true)) {
            b();
        }
    }

    public final void b() {
        String str;
        try {
            if (ya.ee.a("GET_VARIATIONS_HEADER")) {
                str = y5.b.c();
            } else {
                str = null;
            }
            if (str != null && !str.isEmpty()) {
                this.f6535a = str;
                byte[] decode = Base64.decode(str, 10);
                this.f6536b = hp1.z(decode, wm1.a());
                nl nlVar = sl.f10701da;
                g9.r rVar = g9.r.e;
                ql qlVar = rVar.f17698c;
                ql qlVar2 = rVar.f17698c;
                if (((Boolean) qlVar.a(nlVar)).booleanValue()) {
                    this.f6537c = er1.z(decode, wm1.a());
                }
                if (((Boolean) qlVar2.a(sl.f10669ba)).booleanValue() && ((Boolean) qlVar2.a(sl.f10653aa)).booleanValue()) {
                    this.f6538d.schedule(new f(26, this), ((Integer) qlVar2.a(sl.f10685ca)).intValue(), TimeUnit.MINUTES);
                }
            }
        } catch (pn1 e) {
            e = e;
            f9.k.C.f16817h.e("ChromeVariations", e);
        } catch (IllegalArgumentException e8) {
            e = e8;
            f9.k.C.f16817h.e("ChromeVariations", e);
        }
    }
}
