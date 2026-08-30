package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class n00 implements ya.of {

    /* renamed from: a, reason: collision with root package name */
    public long f8504a;

    /* renamed from: b, reason: collision with root package name */
    public Object f8505b;

    /* renamed from: c, reason: collision with root package name */
    public Object f8506c;

    public n00(int i) {
        switch (i) {
            case 2:
                this.f8505b = new w1.c();
                this.f8506c = new w1.c();
                return;
            default:
                this.f8504a = 0L;
                this.f8505b = uh.f11636a;
                this.f8506c = null;
                return;
        }
    }

    public void a(long j10, long j11) {
        ((w1.c) this.f8505b).a(j10, Float.intBitsToFloat((int) (j11 >> 32)));
        ((w1.c) this.f8506c).a(j10, Float.intBitsToFloat((int) (j11 & 4294967295L)));
    }

    public long b(long j10) {
        if (y2.q.b(j10) <= 0.0f || y2.q.c(j10) <= 0.0f) {
            y1.a.b("maximumVelocity should be a positive value. You specified=" + ((Object) y2.q.f(j10)));
        }
        return ya.be.a(((w1.c) this.f8505b).b(y2.q.b(j10)), ((w1.c) this.f8506c).b(y2.q.c(j10)));
    }

    public void c() {
        w1.c cVar = (w1.c) this.f8505b;
        w1.a[] aVarArr = cVar.f27696d;
        qe.k.j(0, aVarArr.length, null, aVarArr);
        cVar.e = 0;
        w1.c cVar2 = (w1.c) this.f8506c;
        w1.a[] aVarArr2 = cVar2.f27696d;
        qe.k.j(0, aVarArr2.length, null, aVarArr2);
        cVar2.e = 0;
        this.f8504a = 0L;
    }

    public w00 d() {
        Object obj;
        boolean z3;
        if (!((uh) this.f8505b).g() && (obj = this.f8506c) != null) {
            if (((uh) this.f8505b).e(obj) != -1) {
                z3 = true;
            } else {
                z3 = false;
            }
            b80.l(z3);
        }
        return new w00(this);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [j.m0, java.lang.Object] */
    @Override // ya.of
    public b0.e1 zza() {
        ne.f fVar = (ne.f) this.f8505b;
        ya.ab abVar = (ya.ab) this.f8506c;
        long j10 = this.f8504a;
        Object obj = new Object();
        obj.f18664w = ya.za.TYPE_THIN;
        ya.y yVar = new ya.y(4, false);
        yVar.f31593x = fVar.e.a();
        yVar.f31591v = abVar;
        yVar.f31592w = Long.valueOf((SystemClock.elapsedRealtime() - j10) & Long.MAX_VALUE);
        obj.f18666y = new ya.zd(yVar);
        return new b0.e1((j.m0) obj, 0);
    }
}
