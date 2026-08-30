package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Binder;
import android.os.StrictMode;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class b4 implements c4 {
    public static final n.e B = new n.r0(0);
    public static final String[] C = {"key", "value"};
    public final ArrayList A;

    /* renamed from: u, reason: collision with root package name */
    public final ContentResolver f13648u;

    /* renamed from: v, reason: collision with root package name */
    public final Uri f13649v;

    /* renamed from: w, reason: collision with root package name */
    public final Runnable f13650w;

    /* renamed from: x, reason: collision with root package name */
    public final c2.c3 f13651x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f13652y;

    /* renamed from: z, reason: collision with root package name */
    public volatile Map f13653z;

    public b4(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        c2.c3 c3Var = new c2.c3(2, this);
        this.f13651x = c3Var;
        this.f13652y = new Object();
        this.A = new ArrayList();
        contentResolver.getClass();
        uri.getClass();
        this.f13648u = contentResolver;
        this.f13649v = uri;
        this.f13650w = runnable;
        contentResolver.registerContentObserver(uri, false, c3Var);
    }

    public static b4 a(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        b4 b4Var;
        synchronized (b4.class) {
            n.e eVar = B;
            b4Var = (b4) eVar.get(uri);
            if (b4Var == null) {
                try {
                    b4 b4Var2 = new b4(contentResolver, uri, runnable);
                    try {
                        eVar.put(uri, b4Var2);
                    } catch (SecurityException unused) {
                    }
                    b4Var = b4Var2;
                } catch (SecurityException unused2) {
                }
            }
        }
        return b4Var;
    }

    public static synchronized void c() {
        synchronized (b4.class) {
            try {
                Iterator it = ((n.d) B.values()).iterator();
                while (it.hasNext()) {
                    b4 b4Var = (b4) it.next();
                    b4Var.f13648u.unregisterContentObserver(b4Var.f13651x);
                }
                B.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [android.os.StrictMode$ThreadPolicy, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, com.google.android.gms.internal.measurement.o5] */
    public final Map b() {
        Map map;
        Object c10;
        Map map2 = this.f13653z;
        Map map3 = map2;
        if (map2 == null) {
            synchronized (this.f13652y) {
                try {
                    Object r02 = this.f13653z;
                    Map map4 = r02;
                    if (r02 == 0) {
                        try {
                            StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                            try {
                                Object obj = new Object();
                                obj.f13873u = this;
                                try {
                                    c10 = obj.c();
                                } catch (SecurityException unused) {
                                    long clearCallingIdentity = Binder.clearCallingIdentity();
                                    try {
                                        c10 = obj.c();
                                    } finally {
                                        Binder.restoreCallingIdentity(clearCallingIdentity);
                                    }
                                }
                                map = (Map) c10;
                                StrictMode.setThreadPolicy(allowThreadDiskReads);
                            } catch (SQLiteException | IllegalStateException | SecurityException unused2) {
                                Log.e("ConfigurationContentLdr", "PhenotypeFlag unable to load ContentProvider, using default values");
                                StrictMode.setThreadPolicy(allowThreadDiskReads);
                                map = null;
                            }
                            this.f13653z = map;
                            map4 = map;
                        } catch (Throwable th) {
                            StrictMode.setThreadPolicy(r02);
                            throw th;
                        }
                    }
                } finally {
                }
            }
        }
        if (map3 != null) {
            return map3;
        }
        return Collections.EMPTY_MAP;
    }

    @Override // com.google.android.gms.internal.measurement.c4
    public final /* synthetic */ Object o(String str) {
        return (String) b().get(str);
    }
}
