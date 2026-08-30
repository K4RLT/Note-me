package com.google.android.gms.internal.ads;
import g3.a;
import a5.a;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class tc1 {

    /* renamed from: c, reason: collision with root package name */
    public static final Logger f11324c = Logger.getLogger(tc1.class.getName());

    /* renamed from: d, reason: collision with root package name */
    public static final tc1 f11325d = new tc1();

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f11326a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f11327b = new ConcurrentHashMap();

    public final synchronized void a(ad1 ad1Var, boolean z3) {
        c(ad1Var, 1, z3);
    }

    public final ad1 b(Class cls, String str) {
        ad1 d2 = d(str);
        if (d2.f4463b.equals(cls)) {
            return d2;
        }
        String name = cls.getName();
        String valueOf = String.valueOf(d2.getClass());
        String obj = d2.f4463b.toString();
        StringBuilder sb2 = new StringBuilder(g3.a.v(valueOf, name.length() + 53, 23) + obj.length());
        g3.a.t(sb2, "Primitive type ", name, " not supported by key manager of type ", valueOf);
        throw new GeneralSecurityException(a5.a.k(sb2, ", which only supports: ", obj));
    }

    public final synchronized void c(ad1 ad1Var, int i, boolean z3) {
        if (ct.i(i)) {
            e(ad1Var, z3);
        } else {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
    }

    public final synchronized ad1 d(String str) {
        ConcurrentHashMap concurrentHashMap;
        concurrentHashMap = this.f11326a;
        if (concurrentHashMap.containsKey(str)) {
        } else {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 98);
            sb2.append("No key manager found for key type ");
            sb2.append(str);
            sb2.append(", see https://developers.google.com/tink/faq/registration_errors");
            throw new GeneralSecurityException(sb2.toString());
        }
        return (ad1) concurrentHashMap.get(str);
    }

    public final synchronized void e(ad1 ad1Var, boolean z3) {
        try {
            String str = ad1Var.f4462a;
            if (z3) {
                ConcurrentHashMap concurrentHashMap = this.f11327b;
                if (concurrentHashMap.containsKey(str) && !((Boolean) concurrentHashMap.get(str)).booleanValue()) {
                    throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
                }
            }
            ConcurrentHashMap concurrentHashMap2 = this.f11326a;
            ad1 ad1Var2 = (ad1) concurrentHashMap2.get(str);
            if (ad1Var2 != null && !ad1Var2.getClass().equals(ad1Var.getClass())) {
                f11324c.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type ".concat(str));
                throw new GeneralSecurityException("typeUrl (" + str + ") is already registered with " + ad1Var2.getClass().getName() + ", cannot be re-registered with " + ad1Var.getClass().getName());
            }
            concurrentHashMap2.putIfAbsent(str, ad1Var);
            this.f11327b.put(str, Boolean.valueOf(z3));
        } catch (Throwable th) {
            throw th;
        }
    }
}
