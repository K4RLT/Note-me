package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class gd1 {

    /* renamed from: b, reason: collision with root package name */
    public static final gd1 f6378b = new gd1();

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f6379a = new ConcurrentHashMap();

    public final void a(ha1 ha1Var, Class cls) {
        ha1 ha1Var2 = (ha1) this.f6379a.putIfAbsent(cls, ha1Var);
        if (ha1Var2 != null && !ha1Var2.equals(ha1Var)) {
            androidx.datastore.preferences.protobuf.s1.q("Different key creator for parameters class already inserted");
        }
    }
}
