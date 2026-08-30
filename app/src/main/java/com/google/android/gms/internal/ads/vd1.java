package com.google.android.gms.internal.ads;
import j6.e;
import p.a;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class vd1 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f11890a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f11891b;

    public /* synthetic */ vd1(e eVar) {
        this.f11890a = new HashMap((HashMap) eVar.f18918u);
        this.f11891b = new HashMap((HashMap) eVar.f18919v);
    }

    public final Object a(xy xyVar, Class cls) {
        ud1 ud1Var = new ud1(xyVar.getClass(), cls);
        HashMap hashMap = this.f11890a;
        if (hashMap.containsKey(ud1Var)) {
            return ((sd1) hashMap.get(ud1Var)).f10596c.a(xyVar);
        }
        String ud1Var2 = ud1Var.toString();
        throw new GeneralSecurityException(a.o(new StringBuilder(ud1Var2.length() + FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH), "No PrimitiveConstructor for ", ud1Var2, " available, see https://developers.google.com/tink/faq/registration_errors"));
    }
}
