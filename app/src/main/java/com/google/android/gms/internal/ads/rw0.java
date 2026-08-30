package com.google.android.gms.internal.ads;
import y3.i;
import y3.m;

import java.io.FileInputStream;

/* loaded from: classes.dex */
public final class rw0 implements y3.i {

    /* renamed from: a, reason: collision with root package name */
    public static final rw0 f10324a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final qw0 f10325b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.google.android.gms.internal.ads.rw0] */
    static {
        qw0 C = qw0.C();
        C.getClass();
        f10325b = C;
    }

    @Override // y3.i
    public final /* synthetic */ Object a() {
        return f10325b;
    }

    @Override // y3.i
    public final /* synthetic */ void b(Object obj, y3.m mVar) {
        ((qw0) obj).c(mVar);
    }

    @Override // y3.i
    public final Object c(FileInputStream fileInputStream) {
        try {
            return qw0.B(fileInputStream);
        } catch (Exception unused) {
            return f10325b;
        }
    }
}
