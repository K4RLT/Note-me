package com.google.android.gms.internal.ads;
import a7.k;

import java.security.SecureRandom;

/* loaded from: classes.dex */
public abstract class ae1 {

    /* renamed from: a, reason: collision with root package name */
    public static final k f4467a = new k(9);

    public static byte[] a(int i) {
        byte[] bArr = new byte[i];
        ((SecureRandom) f4467a.get()).nextBytes(bArr);
        return bArr;
    }
}
