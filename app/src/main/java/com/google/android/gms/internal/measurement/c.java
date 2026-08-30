package com.google.android.gms.internal.measurement;
import p.a;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final zb.e f13663d = zb.e.n(new Object[]{"_syn", "_err", "_el"}, 3);

    /* renamed from: a, reason: collision with root package name */
    public String f13664a;

    /* renamed from: b, reason: collision with root package name */
    public final long f13665b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f13666c;

    public c(String str, long j10, HashMap hashMap) {
        this.f13664a = str;
        this.f13665b = j10;
        HashMap hashMap2 = new HashMap();
        this.f13666c = hashMap2;
        if (hashMap != null) {
            hashMap2.putAll(hashMap);
        }
    }

    public static Object a(String str, Object obj, Object obj2) {
        if (f13663d.contains(str) && (obj2 instanceof Double)) {
            return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
        }
        if (str.startsWith("_")) {
            if (obj instanceof String) {
                return obj2;
            }
            if (obj != null) {
                return obj;
            }
        } else {
            if (obj instanceof Double) {
                return obj2;
            }
            if (obj instanceof Long) {
                return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
            }
            if (obj instanceof String) {
                return obj2.toString();
            }
        }
        return obj2;
    }

    public final /* synthetic */ Object clone() {
        return new c(this.f13664a, this.f13665b, new HashMap(this.f13666c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f13665b != cVar.f13665b || !this.f13664a.equals(cVar.f13664a)) {
                return false;
            }
            return this.f13666c.equals(cVar.f13666c);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f13664a.hashCode() * 31;
        long j10 = this.f13665b;
        return this.f13666c.hashCode() + ((hashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31);
    }

    public final String toString() {
        String str = this.f13664a;
        String valueOf = String.valueOf(this.f13666c);
        StringBuilder sb2 = new StringBuilder("Event{name='");
        sb2.append(str);
        sb2.append("', timestamp=");
        sb2.append(this.f13665b);
        return a.o(sb2, ", params=", valueOf, "}");
    }
}
