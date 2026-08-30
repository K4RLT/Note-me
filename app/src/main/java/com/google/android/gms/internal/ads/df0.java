package com.google.android.gms.internal.ads;
import c7.f0;

/* loaded from: classes.dex */
public final class df0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f5414a;

    /* renamed from: b, reason: collision with root package name */
    public f0 f5415b = new f0(4);

    /* renamed from: c, reason: collision with root package name */
    public boolean f5416c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5417d;

    public df0(Object obj) {
        this.f5414a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && df0.class == obj.getClass()) {
            return this.f5414a.equals(((df0) obj).f5414a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5414a.hashCode();
    }
}
