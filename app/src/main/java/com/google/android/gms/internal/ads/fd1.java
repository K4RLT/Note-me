package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class fd1 {

    /* renamed from: b, reason: collision with root package name */
    public static final fd1 f6043b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f6044a = new HashMap();

    static {
        ga1 ga1Var = ga1.f6345k;
        fd1 fd1Var = new fd1();
        try {
            fd1Var.a(ga1Var, dd1.class);
            f6043b = fd1Var;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException("unexpected error.", e);
        }
    }

    public final synchronized void a(ga1 ga1Var, Class cls) {
        try {
            HashMap hashMap = this.f6044a;
            ga1 ga1Var2 = (ga1) hashMap.get(cls);
            if (ga1Var2 != null && !ga1Var2.equals(ga1Var)) {
                String obj = cls.toString();
                StringBuilder sb2 = new StringBuilder(obj.length() + 60);
                sb2.append("Different key creator for parameters class ");
                sb2.append(obj);
                sb2.append(" already inserted");
                throw new GeneralSecurityException(sb2.toString());
            }
            hashMap.put(cls, ga1Var);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final xy b(v91 v91Var, Integer num) {
        xy a10;
        synchronized (this) {
            ga1 ga1Var = (ga1) this.f6044a.get(v91Var.getClass());
            if (ga1Var != null) {
                a10 = ga1Var.a(v91Var, num);
            } else {
                String obj = v91Var.toString();
                StringBuilder sb2 = new StringBuilder(obj.length() + 86);
                sb2.append("Cannot create a new key for parameters ");
                sb2.append(obj);
                sb2.append(": no key creator for this class was registered.");
                throw new GeneralSecurityException(sb2.toString());
            }
        }
        return a10;
    }
}
