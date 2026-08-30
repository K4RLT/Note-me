package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;

/* loaded from: classes.dex */
public final class cq0 {

    /* renamed from: a, reason: collision with root package name */
    public final of f5142a;

    public cq0(of ofVar) {
        this.f5142a = ofVar;
    }

    public static final Uri b(Uri uri, String str) {
        if (uri != null) {
            try {
                try {
                    String host = uri.getHost();
                    String path = uri.getPath();
                    if (host != null && host.equals("ad.doubleclick.net") && path != null) {
                        if (path.contains(";")) {
                            if (!uri.toString().contains("dc_ms=")) {
                                String uri2 = uri.toString();
                                int indexOf = uri2.indexOf(";adurl");
                                if (indexOf != -1) {
                                    int i = indexOf + 1;
                                    StringBuilder sb2 = new StringBuilder(uri2.substring(0, i));
                                    sb2.append("dc_ms=");
                                    sb2.append(str);
                                    sb2.append(";");
                                    sb2.append((CharSequence) uri2, i, uri2.length());
                                    return Uri.parse(sb2.toString());
                                }
                                String encodedPath = uri.getEncodedPath();
                                if (encodedPath != null) {
                                    int indexOf2 = uri2.indexOf(encodedPath);
                                    StringBuilder sb3 = new StringBuilder(uri2.substring(0, encodedPath.length() + indexOf2));
                                    sb3.append(";dc_ms=");
                                    sb3.append(str);
                                    sb3.append(";");
                                    sb3.append((CharSequence) uri2, indexOf2 + encodedPath.length(), uri2.length());
                                    return Uri.parse(sb3.toString());
                                }
                                throw new UnsupportedOperationException();
                            }
                            throw new Exception("Parameter already exists: dc_ms");
                        }
                    }
                } catch (UnsupportedOperationException unused) {
                    throw new Exception("Provided Uri is not in a valid state");
                }
            } catch (NullPointerException unused2) {
            }
        }
        if (uri.getQueryParameter("ms") == null) {
            String uri3 = uri.toString();
            int indexOf3 = uri3.indexOf("&adurl");
            if (indexOf3 == -1) {
                indexOf3 = uri3.indexOf("?adurl");
            }
            if (indexOf3 != -1) {
                int i10 = indexOf3 + 1;
                StringBuilder sb4 = new StringBuilder(uri3.substring(0, i10));
                sb4.append("ms=");
                sb4.append(str);
                sb4.append("&");
                sb4.append((CharSequence) uri3, i10, uri3.length());
                return Uri.parse(sb4.toString());
            }
            return uri.buildUpon().appendQueryParameter("ms", str).build();
        }
        throw new Exception("Query parameter already exists: ms");
    }

    public final Uri a(Uri uri, Context context, View view, Activity activity) {
        try {
            return b(uri, this.f5142a.f9103b.c(context, uri.getQueryParameter("ai"), view, activity));
        } catch (UnsupportedOperationException unused) {
            throw new Exception("Provided Uri is not in a valid state");
        }
    }
}
