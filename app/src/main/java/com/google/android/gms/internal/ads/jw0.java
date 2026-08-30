package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Set;

/* loaded from: classes.dex */
public final class jw0 implements Closeable {

    /* renamed from: u, reason: collision with root package name */
    public r31 f7553u;

    /* renamed from: v, reason: collision with root package name */
    public x91 f7554v;

    /* renamed from: w, reason: collision with root package name */
    public HttpURLConnection f7555w;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        HttpURLConnection httpURLConnection = this.f7555w;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    public final HttpURLConnection f(x91 x91Var) {
        this.f7553u = new ho0(8, (byte) 0);
        this.f7554v = x91Var;
        ((Integer) this.f7553u.zza()).getClass();
        x91 x91Var2 = this.f7554v;
        x91Var2.getClass();
        Set set = kz.f7905z;
        fp fpVar = f9.k.C.f16825q;
        int intValue = ((Integer) g9.r.e.f17698c.a(sl.f10786j0)).intValue();
        URL url = new URL(x91Var2.f12526b);
        int i = 0;
        while (true) {
            i++;
            if (i <= 20) {
                URLConnection openConnection = url.openConnection();
                openConnection.setConnectTimeout(intValue);
                openConnection.setReadTimeout(intValue);
                if (openConnection instanceof HttpURLConnection) {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                    l9.f fVar = new l9.f();
                    fVar.a(httpURLConnection, null);
                    httpURLConnection.setInstanceFollowRedirects(false);
                    int responseCode = httpURLConnection.getResponseCode();
                    fVar.b(httpURLConnection, responseCode);
                    if (responseCode / 100 == 3) {
                        String headerField = httpURLConnection.getHeaderField("Location");
                        if (headerField != null) {
                            URL url2 = new URL(url, headerField);
                            String protocol = url2.getProtocol();
                            if (protocol != null) {
                                if (!protocol.equals("http") && !protocol.equals("https")) {
                                    q.x.p("Unsupported scheme: ".concat(protocol));
                                    return null;
                                }
                                String concat = "Redirecting to ".concat(headerField);
                                int i10 = k9.a0.f19634b;
                                l9.i.a(concat);
                                httpURLConnection.disconnect();
                                url = url2;
                            } else {
                                q.x.p("Protocol is null");
                                return null;
                            }
                        } else {
                            q.x.p("Missing Location header in redirect");
                            return null;
                        }
                    } else {
                        this.f7555w = httpURLConnection;
                        return httpURLConnection;
                    }
                } else {
                    q.x.p("Invalid protocol.");
                    return null;
                }
            } else {
                q.x.p("Too many redirects (20)");
                return null;
            }
        }
    }
}
