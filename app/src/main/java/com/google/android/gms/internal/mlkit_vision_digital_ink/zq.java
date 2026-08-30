package com.google.android.gms.internal.mlkit_vision_digital_ink;
import a4.b;
import f4.h;
import ig.l;
import sg.f;
import sg.g;
import sg.m;
import sg.v;

/* loaded from: classes.dex */
public final class zq extends er {
    public final f e;

    /* renamed from: f, reason: collision with root package name */
    public long f15350f;

    /* JADX WARN: Type inference failed for: r0v0, types: [g, f, java.lang.Object] */
    public zq(long j10) {
        Object obj = new Object();
        this.e = obj;
        this.f15350f = -1L;
        this.f14268a = v.f25310d;
        this.f14269b = j10;
        this.f14270c = new dr(this, j10, obj);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.er
    public final long a() {
        return this.f15350f;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.er
    public final void b(m mVar) {
        f fVar = mVar.f25292u;
        f fVar2 = this.e;
        fVar2.f(fVar, 0L, fVar2.f25274v);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.er
    public final b c(b bVar) {
        if (((l) bVar.f241d).c("Content-Length") != null) {
            return bVar;
        }
        this.f14270c.close();
        f fVar = this.e;
        this.f15350f = fVar.f25274v;
        u0 b10 = bVar.b();
        ((h) b10.f15038x).e("Transfer-Encoding");
        ((h) b10.f15038x).f("Content-Length", Long.toString(fVar.f25274v));
        return b10.f();
    }
}