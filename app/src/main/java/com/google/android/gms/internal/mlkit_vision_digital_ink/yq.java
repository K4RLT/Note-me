package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;

/* loaded from: classes.dex */
public final class yq extends URLStreamHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f15298a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ir f15299b;

    public yq(ir irVar, String str) {
        this.f15298a = str;
        this.f15299b = irVar;
    }

    @Override // java.net.URLStreamHandler
    public final int getDefaultPort() {
        String str = this.f15298a;
        if (str.equals("http")) {
            return 80;
        }
        if (str.equals("https")) {
            return 443;
        }
        throw new AssertionError();
    }

    @Override // java.net.URLStreamHandler
    public final URLConnection openConnection(URL url) {
        ir irVar = this.f15299b;
        return irVar.c(url, irVar.f14482u.f18565v);
    }

    @Override // java.net.URLStreamHandler
    public final URLConnection openConnection(URL url, Proxy proxy) {
        return this.f15299b.c(url, proxy);
    }
}
