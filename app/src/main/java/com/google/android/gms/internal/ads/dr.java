package com.google.android.gms.internal.ads;

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

    public id.a a() {
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
            return new id.a((String) this.f5482a, this.f5483b, (String) this.f5484c, (String) this.f5485d, ((Long) this.e).longValue(), ((Long) this.f5486f).longValue(), (String) this.f5487g);
        }
        q.x.o("Missing required properties:".concat(str));
        return null;
    }

    public void b(ig.z zVar, IOException iOException) {
        ig.a aVar;
        ProxySelector proxySelector;
        if (zVar.f18606b.type() != Proxy.Type.DIRECT && (proxySelector = (aVar = (ig.a) this.f5484c).f18450g) != null) {
            proxySelector.connectFailed(aVar.f18445a.k(), zVar.f18606b.address(), iOException);
        }
        k6.i iVar = (k6.i) this.f5485d;
        synchronized (iVar) {
            ((LinkedHashSet) iVar.f19569v).add(zVar);
        }
    }

    public cr c() {
        rr0 d2 = rr0.d((Context) this.f5485d, 6);
        d2.zza();
        cr crVar = new cr();
        k9.a0.k("loadJavascriptEngine > Before UI_THREAD_EXECUTOR");
        xx.f12655f.execute(new t81(this, 8, crVar));
        k9.a0.k("loadNewJavascriptEngine: Promise created");
        crVar.i(new hq0(6, this, crVar, d2), new zd1(this, crVar, d2, 6, false));
        return crVar;
    }

    public br d() {
        k9.a0.k("getEngine: Trying to acquire lock");
        Object obj = this.f5484c;
        synchronized (obj) {
            try {
                k9.a0.k("getEngine: Lock acquired");
                k9.a0.k("refreshIfDestroyed: Trying to acquire lock");
                synchronized (obj) {
                    try {
                        k9.a0.k("refreshIfDestroyed: Lock acquired");
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
        k9.a0.k("refreshIfDestroyed: Lock released");
        cr crVar2 = (cr) this.f5487g;
        if (crVar2 != null && ((AtomicInteger) crVar2.f3469c).get() != -1) {
            int i = this.f5483b;
            if (i == 0) {
                k9.a0.k("getEngine (NO_UPDATE): Lock released");
                return ((cr) this.f5487g).l();
            }
            if (i == 1) {
                this.f5483b = 2;
                c();
                k9.a0.k("getEngine (PENDING_UPDATE): Lock released");
                return ((cr) this.f5487g).l();
            }
            k9.a0.k("getEngine (UPDATING): Lock released");
            return ((cr) this.f5487g).l();
        }
        this.f5483b = 2;
        this.f5487g = c();
        k9.a0.k("getEngine (NULL or REJECTED): Lock released");
        return ((cr) this.f5487g).l();
    }
}
