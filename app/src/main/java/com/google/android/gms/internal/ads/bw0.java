package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.facebook.ads.AdError;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class bw0 {

    /* renamed from: h, reason: collision with root package name */
    public static final HashMap f4889h = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Context f4890a;

    /* renamed from: b, reason: collision with root package name */
    public final cw0 f4891b;

    /* renamed from: c, reason: collision with root package name */
    public final cv0 f4892c;

    /* renamed from: d, reason: collision with root package name */
    public final bv0 f4893d;
    public final boolean e;

    /* renamed from: f, reason: collision with root package name */
    public xv0 f4894f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f4895g = new Object();

    public bw0(Context context, cw0 cw0Var, cv0 cv0Var, bv0 bv0Var, boolean z3) {
        this.f4890a = context;
        this.f4891b = cw0Var;
        this.f4892c = cv0Var;
        this.f4893d = bv0Var;
        this.e = z3;
    }

    public final boolean a(uv0 uv0Var) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                xv0 xv0Var = new xv0(c(uv0Var).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.f4890a, "msa-r", uv0Var.a(), null, new Bundle(), 2), uv0Var, this.f4891b, this.f4892c, this.e);
                if (xv0Var.i()) {
                    int k3 = xv0Var.k();
                    if (k3 == 0) {
                        synchronized (this.f4895g) {
                            xv0 xv0Var2 = this.f4894f;
                            if (xv0Var2 != null) {
                                try {
                                    xv0Var2.j();
                                } catch (aw0 e) {
                                    this.f4892c.c(e.f4619u, -1L, e);
                                }
                            }
                            this.f4894f = xv0Var;
                        }
                        this.f4892c.b(3000, System.currentTimeMillis() - currentTimeMillis);
                        return true;
                    }
                    StringBuilder sb2 = new StringBuilder(String.valueOf(k3).length() + 4);
                    sb2.append("ci: ");
                    sb2.append(k3);
                    throw new aw0(4001, sb2.toString());
                }
                throw new aw0(4000, "init failed");
            } catch (Exception e8) {
                throw new aw0(AdError.INTERNAL_ERROR_2004, e8);
            }
        } catch (aw0 e10) {
            this.f4892c.c(e10.f4619u, System.currentTimeMillis() - currentTimeMillis, e10);
            return false;
        } catch (Exception e11) {
            this.f4892c.c(4010, System.currentTimeMillis() - currentTimeMillis, e11);
            return false;
        }
    }

    public final xv0 b() {
        xv0 xv0Var;
        synchronized (this.f4895g) {
            xv0Var = this.f4894f;
        }
        return xv0Var;
    }

    public final synchronized Class c(uv0 uv0Var) {
        try {
            mh mhVar = uv0Var.f11729a;
            if (mhVar != null) {
                String z3 = mhVar.z();
                HashMap hashMap = f4889h;
                Class cls = (Class) hashMap.get(z3);
                if (cls != null) {
                    return cls;
                }
                try {
                    bv0 bv0Var = this.f4893d;
                    File file = uv0Var.f11730b;
                    bv0Var.getClass();
                    if (bv0.a(file)) {
                        try {
                            File file2 = uv0Var.f11731c;
                            if (!file2.exists()) {
                                file2.mkdirs();
                            }
                            Class<?> loadClass = new DexClassLoader(uv0Var.f11730b.getAbsolutePath(), file2.getAbsolutePath(), null, this.f4890a.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                            hashMap.put(z3, loadClass);
                            return loadClass;
                        } catch (ClassNotFoundException e) {
                            e = e;
                            throw new aw0(AdError.REMOTE_ADS_SERVICE_ERROR, e);
                        } catch (IllegalArgumentException e8) {
                            e = e8;
                            throw new aw0(AdError.REMOTE_ADS_SERVICE_ERROR, e);
                        } catch (SecurityException e10) {
                            e = e10;
                            throw new aw0(AdError.REMOTE_ADS_SERVICE_ERROR, e);
                        }
                    }
                    throw new aw0(2026, "VM did not pass signature verification");
                } catch (GeneralSecurityException e11) {
                    throw new aw0(2026, e11);
                }
            }
            throw new aw0(4010, "mc");
        } finally {
        }
    }
}
