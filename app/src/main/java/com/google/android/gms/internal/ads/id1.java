package com.google.android.gms.internal.ads;
import j6.e;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class id1 {

    /* renamed from: b, reason: collision with root package name */
    public static final id1 f7114b = new id1();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f7115a = new AtomicReference(new vd1(new j6.e(9)));

    public final synchronized void a(sd1 sd1Var) {
        AtomicReference atomicReference = this.f7115a;
        j6.e eVar = new j6.e((vd1) atomicReference.get());
        eVar.m(sd1Var);
        atomicReference.set(new vd1(eVar));
    }

    public final synchronized void b(xd1 xd1Var) {
        AtomicReference atomicReference = this.f7115a;
        j6.e eVar = new j6.e((vd1) atomicReference.get());
        HashMap hashMap = (HashMap) eVar.f18919v;
        Class zza = xd1Var.zza();
        if (hashMap.containsKey(zza)) {
            xd1 xd1Var2 = (xd1) hashMap.get(zza);
            if (!xd1Var2.equals(xd1Var) || !xd1Var.equals(xd1Var2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(zza.toString()));
            }
        } else {
            hashMap.put(zza, xd1Var);
        }
        atomicReference.set(new vd1(eVar));
    }
}
