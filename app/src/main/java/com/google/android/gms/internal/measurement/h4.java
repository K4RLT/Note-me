package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* loaded from: classes.dex */
public abstract class h4 {

    /* renamed from: a, reason: collision with root package name */
    public static final n.e f13769a = new n.r0(0);

    public static synchronized Uri a(String str) {
        Uri uri;
        synchronized (h4.class) {
            n.e eVar = f13769a;
            uri = (Uri) eVar.get(str);
            if (uri == null) {
                uri = Uri.parse("content://com.google.android.gms.phenotype/" + Uri.encode(str));
                eVar.put(str, uri);
            }
        }
        return uri;
    }
}
