package com.google.android.gms.internal.ads;
import g9.r;
import p.a;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class pj0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f9529a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9530b;

    /* renamed from: c, reason: collision with root package name */
    public int f9531c;

    /* renamed from: d, reason: collision with root package name */
    public long f9532d;
    public final Integer e;

    public pj0(String str, String str2, int i, long j10, Integer num) {
        this.f9529a = str;
        this.f9530b = str2;
        this.f9531c = i;
        this.f9532d = j10;
        this.e = num;
    }

    public final String toString() {
        Integer num;
        int i = this.f9531c;
        long j10 = this.f9532d;
        String str = this.f9529a;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(i).length() + 1 + String.valueOf(j10).length());
        sb2.append(str);
        sb2.append(".");
        sb2.append(i);
        sb2.append(".");
        sb2.append(j10);
        String sb3 = sb2.toString();
        String str2 = this.f9530b;
        if (!TextUtils.isEmpty(str2)) {
            sb3 = a.o(new StringBuilder(sb3.length() + 1 + String.valueOf(str2).length()), sb3, ".", str2);
        }
        if (((Boolean) r.e.f17698c.a(sl.f10788j2)).booleanValue() && (num = this.e) != null && !TextUtils.isEmpty(str2)) {
            StringBuilder sb4 = new StringBuilder(sb3.length() + 1 + num.toString().length());
            sb4.append(sb3);
            sb4.append(".");
            sb4.append(num);
            return sb4.toString();
        }
        return sb3;
    }
}
