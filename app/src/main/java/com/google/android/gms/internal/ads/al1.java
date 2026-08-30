package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class al1 extends ThreadLocal {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tc f4536a;

    public al1(tc tcVar) {
        this.f4536a = tcVar;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        try {
            yk1 yk1Var = yk1.f12901c;
            tc tcVar = this.f4536a;
            Mac mac = (Mac) yk1Var.f12905a.o((String) tcVar.f11316w);
            mac.init((SecretKeySpec) tcVar.f11317x);
            return mac;
        } catch (GeneralSecurityException e) {
            androidx.datastore.preferences.protobuf.s1.r(e);
            return null;
        }
    }
}
