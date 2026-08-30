package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class g1 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6238a;

    /* renamed from: b, reason: collision with root package name */
    public final e1 f6239b;

    /* renamed from: c, reason: collision with root package name */
    public final SparseArray f6240c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f6241d;
    public final q0 e;

    /* renamed from: f, reason: collision with root package name */
    public final s6 f6242f;

    /* renamed from: g, reason: collision with root package name */
    public final CopyOnWriteArraySet f6243g;

    /* renamed from: h, reason: collision with root package name */
    public final long f6244h;
    public final k1 i;

    /* renamed from: j, reason: collision with root package name */
    public l3 f6245j = new l3(3, (byte) 0);

    /* renamed from: k, reason: collision with root package name */
    public io0 f6246k;

    /* renamed from: l, reason: collision with root package name */
    public Pair f6247l;

    /* renamed from: m, reason: collision with root package name */
    public int f6248m;

    /* renamed from: n, reason: collision with root package name */
    public int f6249n;

    /* renamed from: o, reason: collision with root package name */
    public long f6250o;

    /* renamed from: p, reason: collision with root package name */
    public int f6251p;

    public g1(b1 b1Var) {
        this.f6238a = b1Var.f4651a;
        e1 e1Var = b1Var.f4653c;
        e1Var.getClass();
        this.f6239b = e1Var;
        this.f6240c = new SparseArray();
        b51 b51Var = d51.f5314v;
        y51 y51Var = y51.f12781y;
        this.f6241d = b1Var.f4654d;
        s6 s6Var = b1Var.e;
        this.f6242f = s6Var;
        this.f6244h = -b1Var.f4656g;
        k1 k1Var = b1Var.f4657h;
        this.i = k1Var;
        this.e = new q0(b1Var.f4652b, k1Var, s6Var);
        this.f6243g = new CopyOnWriteArraySet();
        new mw1(new rv1());
        this.f6250o = -9223372036854775807L;
        this.f6251p = -1;
        this.f6249n = 0;
    }
}
