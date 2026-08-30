package com.google.android.gms.internal.measurement;
import a5.a;
import n.r0;
import q.x;
import v6.a;
import x.n;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class k4 {

    /* renamed from: g, reason: collision with root package name */
    public static final Object f13797g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public static volatile z3 f13798h;
    public static final AtomicInteger i;

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.gms.internal.ads.d f13799a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13800b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f13801c;

    /* renamed from: d, reason: collision with root package name */
    public volatile int f13802d = -1;
    public volatile Object e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f13803f;

    static {
        new AtomicReference();
        i = new AtomicInteger();
    }

    public k4(com.google.android.gms.internal.ads.d dVar, String str, Object obj, int i10) {
        this.f13803f = i10;
        dVar.getClass();
        if (((Uri) dVar.f5230v) != null) {
            this.f13799a = dVar;
            this.f13800b = str;
            this.f13801c = obj;
            return;
        }
        q.x.n("Must pass a valid SharedPreferences file name or ContentProvider URI");
        throw null;
    }

    public final Object a() {
        boolean z3;
        n.r0 r0Var;
        int i10 = i.get();
        if (this.f13802d < i10) {
            synchronized (this) {
                try {
                    if (this.f13802d < i10) {
                        z3 z3Var = f13798h;
                        yb.b bVar = yb.a.f31630u;
                        String str = null;
                        if (z3Var != null) {
                            bVar = (yb.b) z3Var.f13992b.get();
                            if (bVar.b()) {
                                d4 d4Var = (d4) bVar.a();
                                com.google.android.gms.internal.ads.d dVar = this.f13799a;
                                Uri uri = (Uri) dVar.f5230v;
                                String str2 = (String) dVar.f5232x;
                                String str3 = this.f13800b;
                                d4Var.getClass();
                                if (uri != null) {
                                    r0Var = (n.r0) d4Var.f13685a.get(uri.toString());
                                } else {
                                    r0Var = null;
                                }
                                if (r0Var != null) {
                                    if (str2 != null) {
                                        str3 = str2 + str3;
                                    }
                                    str = (String) r0Var.get(str3);
                                }
                            }
                        }
                        if (z3Var != null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            this.f13799a.getClass();
                            Object d2 = d(z3Var);
                            if (d2 == null && (d2 = b(z3Var)) == null) {
                                d2 = this.f13801c;
                            }
                            if (bVar.b()) {
                                if (str == null) {
                                    d2 = this.f13801c;
                                } else {
                                    d2 = c(str);
                                }
                            }
                            this.e = d2;
                            this.f13802d = i10;
                        } else {
                            throw new IllegalStateException("Must call PhenotypeFlagInitializer.maybeInit() first");
                        }
                    }
                } finally {
                }
            }
        }
        return this.e;
    }

    public final Object b(z3 z3Var) {
        e4 e4Var;
        String str;
        e4 e4Var2;
        if (!this.f13799a.f5229u) {
            Context context = z3Var.f13991a;
            synchronized (e4.class) {
                try {
                    if (e4.f13726x == null) {
                        if (wa.v6.a(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
                            e4Var2 = new e4(context);
                        } else {
                            e4Var2 = new e4(0);
                        }
                        e4.f13726x = e4Var2;
                    }
                    e4Var = e4.f13726x;
                } catch (Throwable th) {
                    throw th;
                }
            }
            com.google.android.gms.internal.ads.d dVar = this.f13799a;
            if (dVar.f5229u) {
                str = null;
            } else {
                String str2 = (String) dVar.f5231w;
                str = this.f13800b;
                if (str2 == null || !str2.isEmpty()) {
                    str = a5.a.g(str2, str);
                }
            }
            Object o10 = e4Var.o(str);
            if (o10 != null) {
                return c(o10);
            }
        }
        return null;
    }

    public final Object c(Object obj) {
        switch (this.f13803f) {
            case 0:
                if (obj instanceof Boolean) {
                    return (Boolean) obj;
                }
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (x3.f13966c.matcher(str).matches()) {
                        return Boolean.TRUE;
                    }
                    if (x3.f13967d.matcher(str).matches()) {
                        return Boolean.FALSE;
                    }
                }
                String str2 = (String) this.f13799a.f5232x;
                String str3 = this.f13800b;
                if (str2 == null || !str2.isEmpty()) {
                    str3 = a5.a.g(str2, str3);
                }
                Log.e("PhenotypeFlag", "Invalid boolean value for " + str3 + ": " + String.valueOf(obj));
                return null;
            case 1:
                if (obj instanceof Long) {
                    return (Long) obj;
                }
                if (obj instanceof String) {
                    try {
                        return Long.valueOf(Long.parseLong((String) obj));
                    } catch (NumberFormatException unused) {
                    }
                }
                String str4 = (String) this.f13799a.f5232x;
                String str5 = this.f13800b;
                if (str4 == null || !str4.isEmpty()) {
                    str5 = a5.a.g(str4, str5);
                }
                Log.e("PhenotypeFlag", "Invalid long value for " + str5 + ": " + String.valueOf(obj));
                return null;
            case 2:
                if (obj instanceof String) {
                    return (String) obj;
                }
                return null;
            default:
                if (obj instanceof Double) {
                    return (Double) obj;
                }
                if (obj instanceof Float) {
                    return Double.valueOf(((Float) obj).doubleValue());
                }
                if (obj instanceof String) {
                    try {
                        return Double.valueOf(Double.parseDouble((String) obj));
                    } catch (NumberFormatException unused2) {
                    }
                }
                String str6 = (String) this.f13799a.f5232x;
                String str7 = this.f13800b;
                if (str6 == null || !str6.isEmpty()) {
                    str7 = a5.a.g(str6, str7);
                }
                Log.e("PhenotypeFlag", "Invalid double value for " + str7 + ": " + String.valueOf(obj));
                return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:32|(1:34)(7:46|(1:48)(1:53)|49|(1:51)|41|42|43)|35|36|37|38|(1:40)|41|42|43) */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x008f, code lost:
    
        if ("com.google.android.gms".equals(r3.packageName) != false) goto L30;
     */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, java.lang.Runnable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.google.android.gms.internal.measurement.z3 r9) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.k4.d(com.google.android.gms.internal.measurement.z3):java.lang.Object");
    }
}
