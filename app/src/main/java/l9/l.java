package l9;

import android.content.Context;
import com.google.android.gms.internal.ads.nl;
import com.google.android.gms.internal.ads.pu;
import com.google.android.gms.internal.ads.sl;
import g9.p;
import g9.r;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class l implements c {

    /* renamed from: u, reason: collision with root package name */
    public final Context f20059u;

    /* renamed from: v, reason: collision with root package name */
    public final String f20060v;

    /* renamed from: w, reason: collision with root package name */
    public String f20061w;

    public l(Context context, String str) {
        this.f20059u = context;
        this.f20060v = str;
    }

    public final k a(HashMap hashMap, String str) {
        k kVar = k.f20056w;
        k kVar2 = k.f20055v;
        if (str != null) {
            nl nlVar = sl.f10738g;
            r rVar = r.e;
            if (!((Boolean) rVar.f17698c.a(nlVar)).booleanValue() || !str.isEmpty()) {
                if (!((Boolean) rVar.f17698c.a(sl.f10709e3)).booleanValue() || !p.f17688g.f17691c) {
                    try {
                        StringBuilder sb2 = new StringBuilder(str.length() + 13);
                        sb2.append("Pinging URL: ");
                        sb2.append(str);
                        i.a(sb2.toString());
                        HttpURLConnection httpURLConnection = (HttpURLConnection) b(str).openConnection();
                        try {
                            d dVar = p.f17688g.f17689a;
                            String str2 = this.f20060v;
                            httpURLConnection.setConnectTimeout(60000);
                            httpURLConnection.setInstanceFollowRedirects(true);
                            httpURLConnection.setReadTimeout(60000);
                            if (str2 != null) {
                                httpURLConnection.setRequestProperty("User-Agent", str2);
                            }
                            httpURLConnection.setUseCaches(false);
                            if (hashMap != null) {
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                                }
                            }
                            f fVar = new f();
                            fVar.a(httpURLConnection, null);
                            int responseCode = httpURLConnection.getResponseCode();
                            fVar.b(httpURLConnection, responseCode);
                            if (responseCode >= 200 && responseCode < 300) {
                                if (((Boolean) r.e.f17698c.a(sl.V8)).booleanValue()) {
                                    this.f20061w = httpURLConnection.getHeaderField("X-Afma-Ad-Event-Value");
                                }
                                kVar2 = k.f20054u;
                                httpURLConnection.disconnect();
                                return kVar2;
                            }
                            StringBuilder sb3 = new StringBuilder(String.valueOf(responseCode).length() + 54 + str.length());
                            sb3.append("Received non-success response code ");
                            sb3.append(responseCode);
                            sb3.append(" from pinging URL: ");
                            sb3.append(str);
                            i.f(sb3.toString());
                            if (responseCode == 502) {
                                kVar2 = kVar;
                            }
                            httpURLConnection.disconnect();
                            return kVar2;
                        } catch (Throwable th) {
                            httpURLConnection.disconnect();
                            throw th;
                        }
                    } catch (MalformedURLException e) {
                        e = e;
                        kVar = kVar2;
                        c(e, str);
                        return kVar;
                    } catch (IOException e8) {
                        e = e8;
                        String message = e.getMessage();
                        StringBuilder sb4 = new StringBuilder(String.valueOf(message).length() + str.length() + 27);
                        sb4.append("Error while pinging URL: ");
                        sb4.append(str);
                        sb4.append(". ");
                        sb4.append(message);
                        i.f(sb4.toString());
                        return kVar;
                    } catch (IndexOutOfBoundsException e10) {
                        e = e10;
                        kVar = kVar2;
                        c(e, str);
                        return kVar;
                    } catch (RuntimeException e11) {
                        e = e11;
                        String message2 = e.getMessage();
                        StringBuilder sb42 = new StringBuilder(String.valueOf(message2).length() + str.length() + 27);
                        sb42.append("Error while pinging URL: ");
                        sb42.append(str);
                        sb42.append(". ");
                        sb42.append(message2);
                        i.f(sb42.toString());
                        return kVar;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
        return kVar2;
    }

    public final URL b(String str) {
        URL url = null;
        try {
            url = new URI(str).toURL();
        } catch (IllegalArgumentException e) {
            e = e;
            c(e, str);
        } catch (MalformedURLException e8) {
            e = e8;
            c(e, str);
        } catch (URISyntaxException e10) {
            c(e10, str);
            if (((Boolean) r.e.f17698c.a(sl.f10721f)).booleanValue()) {
                try {
                    i.a("Attempting to parse components, encode, and reconstruct URI.");
                    URL url2 = new URL(str);
                    URI uri = new URI(url2.getProtocol(), url2.getUserInfo(), url2.getHost(), url2.getPort(), url2.getPath(), url2.getQuery(), url2.getRef());
                    url = uri.toURL();
                    String obj = uri.toString();
                    StringBuilder sb2 = new StringBuilder(str.length() + 114 + obj.length());
                    sb2.append("Successfully constructed URL after component encoding via new URI(parts).toURL() for original: \"");
                    sb2.append(str);
                    sb2.append("\" -> encoded URI: ");
                    sb2.append(obj);
                    i.a(sb2.toString());
                } catch (IllegalArgumentException | MalformedURLException | URISyntaxException e11) {
                    c(e11, str);
                }
            }
        }
        if (url == null) {
            StringBuilder sb3 = new StringBuilder(str.length() + 47);
            sb3.append("Falling back to direct new URL(\"");
            sb3.append(str);
            sb3.append("\") constructor.");
            i.a(sb3.toString());
            return new URL(str);
        }
        return url;
    }

    public final void c(Exception exc, String str) {
        String message = exc.getMessage();
        StringBuilder sb2 = new StringBuilder(str.length() + 32 + String.valueOf(message).length());
        sb2.append("Error while parsing ping URL: ");
        sb2.append(str);
        sb2.append(". ");
        sb2.append(message);
        i.f(sb2.toString());
        pu.a(this.f20059u).d(exc, "HttpUrlPinger.pingUrl", ((Integer) r.e.f17698c.a(sl.f10784ie)).intValue() / 100.0f);
    }

    @Override // l9.c
    public final k o(String str) {
        return a(null, str);
    }
}
