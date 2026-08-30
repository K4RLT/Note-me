package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class mj1 implements xd1 {

    /* renamed from: a, reason: collision with root package name */
    public static final mj1 f8358a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final sd1 f8359b = new sd1(cd1.class, z91.class, hc1.R);

    @Override // com.google.android.gms.internal.ads.xd1
    public final Object a(com.google.android.gms.internal.mlkit_vision_digital_ink.gw gwVar, j6.l lVar) {
        gl1 g02;
        List arrayList;
        HashMap hashMap = new HashMap();
        for (int i = 0; i < ((List) gwVar.f14386v).size(); i++) {
            s91 H = gwVar.H(i);
            if (H.f10567b.equals(q91.f9787w)) {
                z91 z91Var = (z91) lVar.e(H);
                xy xyVar = H.f10566a;
                if (xyVar instanceof bk1) {
                    g02 = ((bk1) xyVar).g0();
                } else if (xyVar instanceof cd1) {
                    g02 = ((cd1) xyVar).g0();
                } else {
                    String name = xyVar.getClass().getName();
                    String valueOf = String.valueOf(xyVar.s());
                    throw new GeneralSecurityException(a5.a.l(new StringBuilder(name.length() + 59 + valueOf.length()), "Cannot get output prefix for key of class ", name, " with parameters ", valueOf));
                }
                qk1 qk1Var = new qk1(z91Var, H.f10568c);
                byte[] bArr = g02.f6427a;
                if (bArr.length != 0 && bArr.length != 5) {
                    androidx.datastore.preferences.protobuf.s1.q("PrefixMap only supports 0 and 5 byte prefixes");
                    return null;
                }
                if (hashMap.containsKey(g02)) {
                    arrayList = (List) hashMap.get(g02);
                } else {
                    arrayList = new ArrayList();
                    hashMap.put(g02, arrayList);
                }
                arrayList.add(qk1Var);
            }
        }
        if (((Map) gwVar.f14387w).get(ed1.class) == null) {
            return new pk1(new rd1(hashMap));
        }
        g5.q.b();
        return null;
    }

    @Override // com.google.android.gms.internal.ads.xd1
    public final Class zza() {
        return z91.class;
    }

    @Override // com.google.android.gms.internal.ads.xd1
    public final Class zzb() {
        return z91.class;
    }
}
