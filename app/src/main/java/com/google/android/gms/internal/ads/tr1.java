package com.google.android.gms.internal.ads;
import g5.q;
import q.h;

/* loaded from: classes.dex */
public final class tr1 implements sr1, pr1 {

    /* renamed from: b, reason: collision with root package name */
    public static final tr1 f11430b = new tr1(null);

    /* renamed from: a, reason: collision with root package name */
    public final Object f11431a;

    public tr1(Object obj) {
        this.f11431a = obj;
    }

    public static tr1 a(Object obj) {
        if (obj != null) {
            return new tr1(obj);
        }
        g5.q.h("instance cannot be null");
        return null;
    }

    public static tr1 b(Object obj) {
        if (obj == null) {
            return f11430b;
        }
        return new tr1(obj);
    }

    @Override // com.google.android.gms.internal.ads.wr1
    public final Object zzb() {
        return this.f11431a;
    }
}
