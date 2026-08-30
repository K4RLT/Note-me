package com.google.android.gms.internal.ads;
import id.a;
import ig.a;
import ig.z;
import k6.i;
import k9.a0;
import q.x;

import android.content.Context;
import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class dr {

    /* renamed from: a, reason: collision with root package name */
    public Object f5482a;

    /* renamed from: b, reason: collision with root package name */
    public int f5483b;

    /* renamed from: c, reason: collision with root package name */
    public Object f5484c;

    /* renamed from: d, reason: collision with root package name */
    public Object f5485d;
    public Object e;

    /* renamed from: f, reason: collision with root package name */
    public Object f5486f;

    /* renamed from: g, reason: collision with root package name */
    public Object f5487g;

    public a a() {
        String str;
        if (this.f5483b == 0) {
            str = " registrationStatus";
        } else {
            str = "";
        }
        if (((Long) this.e) == null) {
            str = str.concat(" expiresInSecs");
        }
        if (((Long) this.f5486f) == null) {
            str = str.concat(" tokenCreationEpochInSecs");
        }
        if (str.isEmpty()) {
            return new a((String) this.f5482a, this.f5483b, (String) this.f5484c, (String) this.f5485d, ((Long) this.e).longValue(), ((Long) this.f5486f).longValue(), (String) this.f5487g);
        }
        x.o("Missing required properties:".concat(str));
        return null;
    }

    public void b(z zVar, IOException iOException) {
        a aVar;
        ProxySelector proxySelector;
        if (zVar.f18606b.type() != Proxy.Type.DIRECT && (proxySelector = (aVar = (a) this.f5484c).f18450g) != null) {
            proxySelector.connectFailed(aVar.f18445a.k(), zVar.f18606b.address(), iOException);
        }
        i iVar = (i) this.f5485d;
        synchronized (iVar) {
            ((LinkedHashSet) iVar.f19569v).add(zVar);
        }
    }

    public cr c() {
        rr0 d2 = rr0.d((Context) this.f5485d, 6);
        d2.zza();
        cr crVar = new cr();
        a0.k("loadJavascriptEngine > Before UI_THREAD_EXECUTOR");
        xx.f12655f.execute(new t81(this, 8, crVar));
        a0.k("loadNewJavascriptEngine: Promise created");
        crVar.i(new hq0(6, this, crVar, d2), new zd1(this, crVar, d2, 6, false));
        return crVar;
    }

    public br d() {
        a0.k("getEngine: Trying to acquire lock");
        Object obj = this.f5484c;
        synchronized (obj) {
            try {
                a0.k("getEngine: Lock acquired");
                a0.k("refreshIfDestroyed: Trying to acquire lock");
                synchronized (obj) {
                    try {
                        a0.k("refreshIfDestroyed: Lock acquired");
                        cr crVar = (cr) this.f5487g;
                        if (crVar != null && this.f5483b == 0) {
                            crVar.i(new tf(10, this), fp.f6138v);
                        }
                    } finally {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        a0.k("refreshIfDestroyed: Lock released");
        cr crVar2 = (cr) this.f5487g;
        if (crVar2 != null && ((AtomicInteger) crVar2.f3469c).get() != -1) {
            int i = this.f5483b;
            if (i == 0) {
                a0.k("getEngine (NO_UPDATE): Lock released");
                return ((cr) this.f5487g).l();
            }
            if (i == 1) {
                this.f5483b = 2;
                c();
                a0.k("getEngine (PENDING_UPDATE): Lock released");
                return ((cr) this.f5487g).l();
            }
            a0.k("getEngine (UPDATING): Lock released");
            return ((cr) this.f5487g).l();
        }
        this.f5483b = 2;
        this.f5487g = c();
        a0.k("getEngine (NULL or REJECTED): Lock released");
        return ((cr) this.f5487g).l();
    }
}
