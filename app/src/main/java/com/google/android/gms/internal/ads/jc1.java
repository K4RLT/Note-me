package com.google.android.gms.internal.ads;
import a7.k;
import q.x;

/* loaded from: classes.dex */
public abstract class jc1 implements o91 {

    /* renamed from: a, reason: collision with root package name */
    public static final k f7420a = new k(8);

    public static tb1 b(sa1 sa1Var) {
        byte[] bArr = tb1.f11307d;
        if (tb1.b(hc1.e())) {
            return new tb1(((gl1) sa1Var.Q.f4819v).b(), sa1Var.R.b());
        }
        x.o("Cipher does not implement AES GCM SIV.");
        return null;
    }
}
