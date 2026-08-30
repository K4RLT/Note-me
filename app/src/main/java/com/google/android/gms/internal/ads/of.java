package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;

/* loaded from: classes.dex */
public final class of {

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f9101c = {"/aclk", "/pcs/click", "/dbm/clk"};

    /* renamed from: a, reason: collision with root package name */
    public final String[] f9102a = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};

    /* renamed from: b, reason: collision with root package name */
    public final lf f9103b;

    public of(lf lfVar) {
        this.f9103b = lfVar;
    }

    public static Uri d(Uri uri, String str) {
        try {
            if (uri != null) {
                try {
                    if (uri.getHost().equals("ad.doubleclick.net")) {
                        if (uri.getPath().contains(";")) {
                            if (!uri.toString().contains("dc_ms=")) {
                                String uri2 = uri.toString();
                                int indexOf = uri2.indexOf(";adurl");
                                if (indexOf != -1) {
                                    int i = indexOf + 1;
                                    return Uri.parse(uri2.substring(0, i) + "dc_ms=" + str + ";" + uri2.substring(i));
                                }
                                String encodedPath = uri.getEncodedPath();
                                int indexOf2 = uri2.indexOf(encodedPath);
                                return Uri.parse(uri2.substring(0, encodedPath.length() + indexOf2) + ";dc_ms=" + str + ";" + uri2.substring(indexOf2 + encodedPath.length()));
                            }
                            throw new Exception("Parameter already exists: dc_ms");
                        }
                    }
                } catch (NullPointerException unused) {
                }
                if (uri.getQueryParameter("ms") == null) {
                    String uri3 = uri.toString();
                    int indexOf3 = uri3.indexOf("&adurl");
                    if (indexOf3 == -1) {
                        indexOf3 = uri3.indexOf("?adurl");
                    }
                    if (indexOf3 != -1) {
                        int i10 = indexOf3 + 1;
                        return Uri.parse(uri3.substring(0, i10) + "ms=" + str + "&" + uri3.substring(i10));
                    }
                    return uri.buildUpon().appendQueryParameter("ms", str).build();
                }
                throw new Exception("Query parameter already exists: ms");
            }
            throw null;
        } catch (UnsupportedOperationException unused2) {
            throw new Exception("Provided Uri is not in a valid state");
        }
    }

    public final boolean a(Uri uri) {
        uri.getClass();
        try {
            String host = uri.getHost();
            String[] strArr = this.f9102a;
            for (int i = 0; i < 3; i++) {
                if (host.endsWith(strArr[i])) {
                    return true;
                }
            }
        } catch (NullPointerException unused) {
        }
        return false;
    }

    public final Uri b(Uri uri, Context context, View view, Activity activity) {
        try {
            return d(uri, this.f9103b.c(context, uri.getQueryParameter("ai"), view, activity));
        } catch (UnsupportedOperationException unused) {
            throw new Exception("Provided Uri is not in a valid state");
        }
    }

    public final boolean c(Uri uri) {
        if (a(uri)) {
            for (int i = 0; i < 3; i++) {
                if (uri.getPath().endsWith(f9101c[i])) {
                    return true;
                }
            }
        }
        return false;
    }
}
