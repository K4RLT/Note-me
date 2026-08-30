package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/* loaded from: classes.dex */
public final class ar implements ig.o {

    /* renamed from: a, reason: collision with root package name */
    public boolean f14027a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ br f14028b;

    public ar(br brVar) {
        this.f14028b = brVar;
    }

    @Override // ig.o
    public final ig.w a(mg.e eVar) {
        br brVar = this.f14028b;
        a4.b bVar = eVar.f20820f;
        synchronized (brVar.f14108h) {
            brVar.f14111l = false;
            lg.b bVar2 = eVar.f20819d;
            brVar.f14112m = bVar2.f20373c.f18606b;
            brVar.f14113n = bVar2.f20375f;
            brVar.f14108h.notifyAll();
            while (!this.f14027a) {
                try {
                    brVar.f14108h.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException();
                }
            }
        }
        er erVar = (er) bVar.e;
        if (erVar instanceof er) {
            bVar = erVar.c(bVar);
        }
        ig.w a10 = eVar.a(bVar);
        synchronized (brVar.f14108h) {
            try {
                brVar.f14110k = a10;
                ig.n nVar = (ig.n) a10.f18596u.f240c;
                nVar.getClass();
                try {
                    ((HttpURLConnection) brVar).url = new URL(nVar.f18541h);
                } catch (MalformedURLException e) {
                    throw new RuntimeException(e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return a10;
    }

    public final void b() {
        br brVar = this.f14028b;
        synchronized (brVar.f14108h) {
            this.f14027a = true;
            brVar.f14108h.notifyAll();
        }
    }
}
