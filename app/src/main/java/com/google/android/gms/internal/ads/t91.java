package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public abstract class t91 {

    /* renamed from: a, reason: collision with root package name */
    public static final CopyOnWriteArrayList f11299a = new CopyOnWriteArrayList();

    public static void a(String str) {
        Iterator it = f11299a.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
    }
}
