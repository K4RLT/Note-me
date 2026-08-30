package com.google.android.gms.internal.ads;
import p.a;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class jd1 {

    /* renamed from: b, reason: collision with root package name */
    public static final jd1 f7422b;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f7423a = new AtomicReference(new ee1(new na1(2)));

    static {
        try {
            jd1 jd1Var = new jd1();
            jd1Var.a(new wc1(cd1.class, hc1.f6675y));
            f7422b = jd1Var;
        } catch (Exception e) {
            androidx.datastore.preferences.protobuf.s1.n(e);
        }
    }

    public final synchronized void a(wc1 wc1Var) {
        AtomicReference atomicReference = this.f7423a;
        na1 na1Var = new na1((ee1) atomicReference.get());
        na1Var.b(wc1Var);
        atomicReference.set(new ee1(na1Var));
    }

    public final synchronized void b(uc1 uc1Var) {
        AtomicReference atomicReference = this.f7423a;
        na1 na1Var = new na1((ee1) atomicReference.get());
        na1Var.e(uc1Var);
        atomicReference.set(new ee1(na1Var));
    }

    public final synchronized void c(nd1 nd1Var) {
        AtomicReference atomicReference = this.f7423a;
        na1 na1Var = new na1((ee1) atomicReference.get());
        na1Var.g(nd1Var);
        atomicReference.set(new ee1(na1Var));
    }

    public final synchronized void d(ld1 ld1Var) {
        AtomicReference atomicReference = this.f7423a;
        na1 na1Var = new na1((ee1) atomicReference.get());
        na1Var.h(ld1Var);
        atomicReference.set(new ee1(na1Var));
    }

    public final xy e(yd1 yd1Var) {
        ee1 ee1Var = (ee1) this.f7423a.get();
        ee1Var.getClass();
        ce1 ce1Var = new ce1(yd1.class, (gl1) yd1Var.f12856v);
        HashMap hashMap = ee1Var.f5670b;
        if (hashMap.containsKey(ce1Var)) {
            return ((uc1) hashMap.get(ce1Var)).f11624b.d(yd1Var);
        }
        String ce1Var2 = ce1Var.toString();
        throw new GeneralSecurityException(a.o(new StringBuilder(ce1Var2.length() + 47), "No Key Parser for requested key type ", ce1Var2, " available"));
    }

    public final be1 f(xy xyVar) {
        ee1 ee1Var = (ee1) this.f7423a.get();
        ee1Var.getClass();
        de1 de1Var = new de1(xyVar.getClass(), yd1.class);
        HashMap hashMap = ee1Var.f5669a;
        if (hashMap.containsKey(de1Var)) {
            return ((wc1) hashMap.get(de1Var)).f12216b.a(xyVar);
        }
        String de1Var2 = de1Var.toString();
        throw new GeneralSecurityException(a.o(new StringBuilder(de1Var2.length() + 32), "No Key serializer for ", de1Var2, " available"));
    }

    public final v91 g(zd1 zd1Var) {
        ee1 ee1Var = (ee1) this.f7423a.get();
        ee1Var.getClass();
        ce1 ce1Var = new ce1(zd1.class, (gl1) zd1Var.f13142v);
        HashMap hashMap = ee1Var.f5672d;
        if (hashMap.containsKey(ce1Var)) {
            return ((ld1) hashMap.get(ce1Var)).f8015b.c(zd1Var);
        }
        String ce1Var2 = ce1Var.toString();
        throw new GeneralSecurityException(a.o(new StringBuilder(ce1Var2.length() + 54), "No Parameters Parser for requested key type ", ce1Var2, " available"));
    }

    public final be1 h(v91 v91Var) {
        ee1 ee1Var = (ee1) this.f7423a.get();
        ee1Var.getClass();
        de1 de1Var = new de1(v91Var.getClass(), zd1.class);
        HashMap hashMap = ee1Var.f5671c;
        if (hashMap.containsKey(de1Var)) {
            return ((nd1) hashMap.get(de1Var)).f8675b.b(v91Var);
        }
        String de1Var2 = de1Var.toString();
        throw new GeneralSecurityException(a.o(new StringBuilder(de1Var2.length() + 39), "No Key Format serializer for ", de1Var2, " available"));
    }
}
