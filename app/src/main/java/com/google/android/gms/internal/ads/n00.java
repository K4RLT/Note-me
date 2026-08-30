package com.google.android.gms.internal.ads;
import b0.e1;
import j.m0;
import ne.f;
import qe.k;
import w1.a;
import w1.c;
import y1.a;
import y2.q;
import ya.ab;
import ya.be;
import ya.of;
import ya.y;
import ya.za;
import ya.zd;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class n00 implements of {

    /* renamed from: a, reason: collision with root package name */
    public long f8504a;

    /* renamed from: b, reason: collision with root package name */
    public Object f8505b;

    /* renamed from: c, reason: collision with root package name */
    public Object f8506c;

    public n00(int i) {
        switch (i) {
            case 2:
                this.f8505b = new c();
                this.f8506c = new c();
                return;
            default:
                this.f8504a = 0L;
                this.f8505b = uh.f11636a;
                this.f8506c = null;
                return;
        }
    }

    public void a(long j10, long j11) {
        ((c) this.f8505b).a(j10, Float.intBitsToFloat((int) (j11 >> 32)));
        ((c) this.f8506c).a(j10, Float.intBitsToFloat((int) (j11 & 4294967295L)));
    }

    public long b(long j10) {
        if (q.b(j10) <= 0.0f || q.c(j10) <= 0.0f) {
            a.b("maximumVelocity should be a positive value. You specified=" + ((Object) q.f(j10)));
        }
        return be.a(((c) this.f8505b).b(q.b(j10)), ((c) this.f8506c).b(q.c(j10)));
    }

    public void c() {
        c cVar = (c) this.f8505b;
        a[] aVarArr = cVar.f27696d;
        k.j(0, aVarArr.length, null, aVarArr);
        cVar.e = 0;
        c cVar2 = (c) this.f8506c;
        a[] aVarArr2 = cVar2.f27696d;
        k.j(0, aVarArr2.length, null, aVarArr2);
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

    /* JADX WARN: Type inference failed for: r4v0, types: [m0, java.lang.Object] */
    @Override // of
    public e1 zza() {
        f fVar = (f) this.f8505b;
        ab abVar = (ab) this.f8506c;
        long j10 = this.f8504a;
        Object obj = new Object();
        obj.f18664w = za.TYPE_THIN;
        y yVar = new y(4, false);
        yVar.f31593x = fVar.e.a();
        yVar.f31591v = abVar;
        yVar.f31592w = Long.valueOf((SystemClock.elapsedRealtime() - j10) & Long.MAX_VALUE);
        obj.f18666y = new zd(yVar);
        return new e1((m0) obj, 0);
    }
}