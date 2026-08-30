package com.daren.scraply.data.local;

import eb.y;
import g5.v;
import i7.c;
import i7.d;
import j5.a;
import j7.f;
import j7.l;
import j7.q;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public abstract class ScraplyDatabase extends v {

    /* renamed from: m, reason: collision with root package name */
    public static volatile ScraplyDatabase f4149m;

    /* renamed from: q, reason: collision with root package name */
    public static final ExecutorService f4153q;

    /* renamed from: l, reason: collision with root package name */
    public static final y f4148l = new y(23);

    /* renamed from: n, reason: collision with root package name */
    public static final a[] f4150n = {new a(1, 2)};

    /* renamed from: o, reason: collision with root package name */
    public static final d f4151o = new d(0);

    /* renamed from: p, reason: collision with root package name */
    public static final d f4152p = new d(1);

    static {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(4, new c(0));
        newFixedThreadPool.getClass();
        f4153q = newFixedThreadPool;
    }

    public abstract f x();

    public abstract l y();

    public abstract q z();
}
