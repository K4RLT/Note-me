package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class dj1 {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f5443f = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Uri f5444a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f5445b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5446c;

    /* renamed from: d, reason: collision with root package name */
    public final long f5447d;
    public final int e;

    static {
        t5.a("media3.datasource");
    }

    public dj1(Uri uri, Map map, long j10, long j11, int i) {
        boolean z3;
        boolean z9 = false;
        if (j10 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        b80.l(z3);
        b80.l(z3);
        if (j11 <= 0) {
            j11 = j11 == -1 ? -1L : j11;
            b80.l(z9);
            uri.getClass();
            this.f5444a = uri;
            this.f5445b = Collections.unmodifiableMap(new HashMap(map));
            this.f5446c = j10;
            this.f5447d = j11;
            this.e = i;
        }
        z9 = true;
        b80.l(z9);
        uri.getClass();
        this.f5444a = uri;
        this.f5445b = Collections.unmodifiableMap(new HashMap(map));
        this.f5446c = j10;
        this.f5447d = j11;
        this.e = i;
    }

    public final String toString() {
        String obj = this.f5444a.toString();
        int length = obj.length();
        long j10 = this.f5446c;
        int length2 = String.valueOf(j10).length();
        long j11 = this.f5447d;
        int length3 = String.valueOf(j11).length();
        int i = this.e;
        StringBuilder sb2 = new StringBuilder(length + 15 + length2 + 2 + length3 + 8 + String.valueOf(i).length() + 1);
        sb2.append("DataSpec[GET ");
        sb2.append(obj);
        sb2.append(", ");
        sb2.append(j10);
        g3.a.s(sb2, ", ", j11, ", null, ");
        return p.a.j(i, "]", sb2);
    }

    public dj1(Uri uri, long j10, long j11) {
        this(uri, Collections.EMPTY_MAP, j10, j11, 0);
    }
}
