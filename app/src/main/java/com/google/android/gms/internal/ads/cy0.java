package com.google.android.gms.internal.ads;
import d3.h;
import d3.j;
import d3.k;

import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class cy0 {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f5221a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5222b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5223c;

    public cy0(ExecutorService executorService, String str, long j10) {
        this.f5221a = executorService;
        this.f5222b = str;
        this.f5223c = j10;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [k, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [h, java.lang.Object] */
    public final j a(String str, boolean z3, byte[] bArr, String str2) {
        Object obj = new Object();
        obj.f15720c = new Object();
        j jVar = new j(obj);
        obj.f15719b = jVar;
        obj.f15718a = ay0.class;
        try {
        } catch (Exception e) {
            e = e;
        }
        try {
            this.f5221a.execute(new zx0(this, str, (h) obj, z3, str2, bArr));
            obj.f15718a = "";
            return jVar;
        } catch (Exception e8) {
            e = e8;
            jVar.f15723v.m(e);
            return jVar;
        }
    }
}