package com.google.android.gms.internal.mlkit_vision_digital_ink;
import a7.k;
import ig.l;
import ig.p;
import ig.q;
import ig.r;
import ig.w;
import q.x;
import x.n;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class ir implements URLStreamHandlerFactory, Cloneable {

    /* renamed from: v, reason: collision with root package name */
    public static final LinkedHashSet f14478v = new LinkedHashSet(Arrays.asList("OPTIONS", "GET", "HEAD", "POST", "PUT", "DELETE", "TRACE", "PATCH"));

    /* renamed from: w, reason: collision with root package name */
    public static final TimeZone f14479w = TimeZone.getTimeZone("GMT");

    /* renamed from: x, reason: collision with root package name */
    public static final a7.k f14480x = new a7.k(17);

    /* renamed from: y, reason: collision with root package name */
    public static final r7 f14481y = new r7(2);

    /* renamed from: u, reason: collision with root package name */
    public final ig.q f14482u;

    public ir(ig.q qVar) {
        this.f14482u = qVar;
    }

    public static void a(Throwable th) {
        if (!(th instanceof IOException)) {
            if (!(th instanceof Error)) {
                if (th instanceof RuntimeException) {
                    throw ((RuntimeException) th);
                }
                throw new AssertionError();
            }
            throw ((Error) th);
        }
        throw ((IOException) th);
    }

    public static String b(ig.w wVar) {
        String str;
        ig.r rVar = wVar.f18597v;
        int i = wVar.f18598w;
        String str2 = wVar.f18599x;
        StringBuilder sb2 = new StringBuilder();
        if (rVar == ig.r.HTTP_1_0) {
            str = "HTTP/1.0";
        } else {
            str = "HTTP/1.1";
        }
        sb2.append(str);
        sb2.append(" ");
        sb2.append(i);
        sb2.append(" ");
        sb2.append(str2);
        return sb2.toString();
    }

    public static Map d(ig.l lVar, String str) {
        TreeMap treeMap = new TreeMap(f14481y);
        int f10 = lVar.f();
        for (int i = 0; i < f10; i++) {
            String d2 = lVar.d(i);
            String g8 = lVar.g(i);
            ArrayList arrayList = new ArrayList();
            List list = (List) treeMap.get(d2);
            if (list != null) {
                arrayList.addAll(list);
            }
            arrayList.add(g8);
            treeMap.put(d2, Collections.unmodifiableList(arrayList));
        }
        if (str != null) {
            treeMap.put(null, Collections.unmodifiableList(Collections.singletonList(str)));
        }
        return Collections.unmodifiableMap(treeMap);
    }

    public final HttpURLConnection c(URL url, Proxy proxy) {
        String protocol = url.getProtocol();
        ig.p pVar = new ig.p(this.f14482u);
        pVar.f18543b = proxy;
        ig.q qVar = new ig.q(pVar);
        if (protocol.equals("http")) {
            return new br(url, qVar);
        }
        if (protocol.equals("https")) {
            return new cr(url, qVar);
        }
        q.x.n("Unexpected protocol: ".concat(protocol));
        return null;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return new ir(this.f14482u);
    }

    @Override // java.net.URLStreamHandlerFactory
    public final URLStreamHandler createURLStreamHandler(String str) {
        if (!str.equals("http") && !str.equals("https")) {
            return null;
        }
        return new yq(this, str);
    }
}
