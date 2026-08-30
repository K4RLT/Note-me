package com.google.android.gms.internal.ads;
import a5.a;
import g5.q;
import j6.l;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class re1 implements xd1 {

    /* renamed from: a, reason: collision with root package name */
    public static final re1 f10215a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final sd1 f10216b = new sd1(cd1.class, u91.class, hc1.D);

    @Override // com.google.android.gms.internal.ads.xd1
    public final Object a(com.google.android.gms.internal.mlkit_vision_digital_ink.gw gwVar, l lVar) {
        gl1 g02;
        List list;
        HashMap hashMap = new HashMap();
        for (int i = 0; i < ((List) gwVar.f14386v).size(); i++) {
            s91 H = gwVar.H(i);
            if (H.f10567b.equals(q91.f9787w)) {
                xy xyVar = H.f10566a;
                if (xyVar instanceof pe1) {
                    g02 = ((pe1) xyVar).g0();
                } else if (xyVar instanceof cd1) {
                    g02 = ((cd1) xyVar).g0();
                } else {
                    String name = xyVar.getClass().getName();
                    String valueOf = String.valueOf(xyVar.s());
                    throw new GeneralSecurityException(a.l(new StringBuilder(name.length() + 59 + valueOf.length()), "Cannot get output prefix for key of class ", name, " with parameters ", valueOf));
                }
                hc1 hc1Var = new hc1(17);
                byte[] bArr = g02.f6427a;
                if (bArr.length != 0 && bArr.length != 5) {
                    androidx.datastore.preferences.protobuf.s1.q("PrefixMap only supports 0 and 5 byte prefixes");
                    return null;
                }
                if (hashMap.containsKey(g02)) {
                    list = (List) hashMap.get(g02);
                } else {
                    ArrayList arrayList = new ArrayList();
                    hashMap.put(g02, arrayList);
                    list = arrayList;
                }
                list.add(hc1Var);
            }
        }
        if (((Map) gwVar.f14387w).get(ed1.class) == null) {
            gwVar.G();
            return new Object();
        }
        q.b();
        return null;
    }

    @Override // com.google.android.gms.internal.ads.xd1
    public final Class zza() {
        return u91.class;
    }

    @Override // com.google.android.gms.internal.ads.xd1
    public final Class zzb() {
        return u91.class;
    }
}
