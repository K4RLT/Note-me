package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final class zq extends er {
    public final sg.f e;

    /* renamed from: f, reason: collision with root package name */
    public long f15350f;

    /* JADX WARN: Type inference failed for: r0v0, types: [sg.g, sg.f, java.lang.Object] */
    public zq(long j10) {
        ?? obj = new Object();
        this.e = obj;
        this.f15350f = -1L;
        this.f14268a = sg.v.f25310d;
        this.f14269b = j10;
        this.f14270c = new dr(this, j10, obj);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.er
    public final long a() {
        return this.f15350f;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.er
    public final void b(sg.m mVar) {
        sg.f fVar = mVar.f25292u;
        sg.f fVar2 = this.e;
        fVar2.f(fVar, 0L, fVar2.f25274v);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.er
    public final a4.b c(a4.b bVar) {
        if (((ig.l) bVar.f241d).c("Content-Length") != null) {
            return bVar;
        }
        this.f14270c.close();
        sg.f fVar = this.e;
        this.f15350f = fVar.f25274v;
        u0 b10 = bVar.b();
        ((f4.h) b10.f15038x).e("Transfer-Encoding");
        ((f4.h) b10.f15038x).f("Content-Length", Long.toString(fVar.f25274v));
        return b10.f();
    }
}
