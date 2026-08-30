package com.google.android.gms.internal.ads;
import j6.c;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class ve1 {

    /* renamed from: a, reason: collision with root package name */
    public static final j6.c f11893a;

    /* renamed from: b, reason: collision with root package name */
    public static final nd1 f11894b;

    /* renamed from: c, reason: collision with root package name */
    public static final ld1 f11895c;

    /* renamed from: d, reason: collision with root package name */
    public static final wc1 f11896d;
    public static final uc1 e;

    static {
        gl1 a10 = fe1.a("type.googleapis.com/google.crypto.tink.HmacKey");
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        yg1 yg1Var = yg1.SHA1;
        me1 me1Var = me1.f8331b;
        hashMap.put(yg1Var, me1Var);
        hashMap2.put(me1Var, yg1Var);
        yg1 yg1Var2 = yg1.SHA224;
        me1 me1Var2 = me1.f8332c;
        hashMap.put(yg1Var2, me1Var2);
        hashMap2.put(me1Var2, yg1Var2);
        yg1 yg1Var3 = yg1.SHA256;
        me1 me1Var3 = me1.f8333d;
        hashMap.put(yg1Var3, me1Var3);
        hashMap2.put(me1Var3, yg1Var3);
        yg1 yg1Var4 = yg1.SHA384;
        me1 me1Var4 = me1.e;
        hashMap.put(yg1Var4, me1Var4);
        hashMap2.put(me1Var4, yg1Var4);
        yg1 yg1Var5 = yg1.SHA512;
        me1 me1Var5 = me1.f8334f;
        hashMap.put(yg1Var5, me1Var5);
        hashMap2.put(me1Var5, yg1Var5);
        f11893a = new j6.c(8, (Object) Collections.unmodifiableMap(hashMap), (Object) Collections.unmodifiableMap(hashMap2), false);
        f11894b = new nd1(ne1.class, hc1.L);
        f11895c = new ld1(a10, hc1.I);
        f11896d = new wc1(ke1.class, hc1.J);
        e = new uc1(a10, hc1.K);
    }

    public static x91 a(ja1 ja1Var) {
        if (ja1Var == ja1.J) {
            return x91.f12506f;
        }
        if (ja1Var == ja1.G) {
            return x91.f12505d;
        }
        if (ja1Var == ja1.I) {
            return x91.e;
        }
        if (ja1Var == ja1.H) {
            return x91.f12507g;
        }
        throw new GeneralSecurityException("unknown variant: ".concat(String.valueOf(ja1Var)));
    }

    public static ja1 b(x91 x91Var) {
        if (x91Var == x91.f12506f) {
            return ja1.J;
        }
        if (x91Var == x91.f12505d) {
            return ja1.G;
        }
        if (x91Var == x91.e) {
            return ja1.I;
        }
        if (x91Var == x91.f12507g) {
            return ja1.H;
        }
        throw new GeneralSecurityException("unknown OutputPrefixType: ".concat(x91Var.f12526b));
    }
}
