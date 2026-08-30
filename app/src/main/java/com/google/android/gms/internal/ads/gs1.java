package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class gs1 {

    /* renamed from: b, reason: collision with root package name */
    public static final gs1 f6444b = new gs1(new HashMap());

    /* renamed from: a, reason: collision with root package name */
    public final Map f6445a;

    public /* synthetic */ gs1(HashMap hashMap) {
        this.f6445a = Collections.unmodifiableMap(hashMap);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gs1)) {
            return false;
        }
        return this.f6445a.equals(((gs1) obj).f6445a);
    }

    public final int hashCode() {
        return this.f6445a.hashCode();
    }
}
