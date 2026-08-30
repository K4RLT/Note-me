package com.google.android.gms.internal.mlkit_vision_digital_ink;
import q1.b;

import android.net.Uri;
import java.io.IOException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class yu implements wv {

    /* renamed from: a, reason: collision with root package name */
    public final zv f15305a;

    /* renamed from: b, reason: collision with root package name */
    public final pv f15306b;

    /* renamed from: c, reason: collision with root package name */
    public final pv f15307c;

    /* renamed from: d, reason: collision with root package name */
    public final Uri f15308d;
    public final Uri e;

    /* renamed from: f, reason: collision with root package name */
    public final s5 f15309f;

    /* renamed from: g, reason: collision with root package name */
    public final i f15310g;

    /* renamed from: h, reason: collision with root package name */
    public final Executor f15311h;
    public final ss i;

    public yu(zv zvVar, pv pvVar, pv pvVar2, Uri uri, Uri uri2, s5 s5Var, i iVar, Executor executor, ss ssVar) {
        this.f15305a = zvVar;
        this.f15306b = pvVar;
        this.f15307c = pvVar2;
        this.f15308d = uri;
        this.e = uri2;
        this.f15309f = s5Var;
        this.f15310g = iVar;
        this.f15311h = executor;
        this.i = ssVar;
    }

    public static ua f() {
        return n5.l(new IllegalStateException("Migration flag had unexpected state"));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.wv
    public final ya a(ls lsVar, os osVar) {
        int ordinal = this.f15309f.g().ordinal();
        zv zvVar = this.f15305a;
        int i = 1;
        if (ordinal != 1) {
            int i10 = 3;
            if (ordinal != 2) {
                if (ordinal != 3) {
                    return f();
                }
                return this.f15307c.a(lsVar, osVar);
            }
            f9 e = e(zvVar.a(lsVar, osVar));
            xu xuVar = new xu(this, lsVar, osVar, i);
            int i11 = g2.f14354a;
            return n5.q(e, new r0(b(), i10, xuVar), this.f15311h);
        }
        return zvVar.a(lsVar, osVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.wv
    public final ya b(n4 n4Var) {
        int ordinal = this.f15309f.g().ordinal();
        zv zvVar = this.f15305a;
        if (ordinal != 1) {
            int i = 3;
            if (ordinal != 2) {
                if (ordinal != 3) {
                    return f();
                }
                return this.f15307c.b(n4Var);
            }
            f9 e = e(zvVar.b(n4Var));
            r0 r0Var = new r0(this, 15, n4Var);
            int i10 = g2.f14354a;
            return n5.q(e, new r0(b(), i, r0Var), this.f15311h);
        }
        return zvVar.b(n4Var);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.wv
    public final ya c(ls lsVar) {
        int ordinal = this.f15309f.g().ordinal();
        zv zvVar = this.f15305a;
        if (ordinal != 1) {
            int i = 3;
            if (ordinal != 2) {
                if (ordinal != 3) {
                    return f();
                }
                return this.f15307c.c(lsVar);
            }
            f9 e = e(zvVar.c(lsVar));
            r0 r0Var = new r0(this, 13, lsVar);
            int i10 = g2.f14354a;
            return n5.q(e, new r0(b(), i, r0Var), this.f15311h);
        }
        return zvVar.c(lsVar);
    }

    public final ya d(hx hxVar, hx hxVar2) {
        this.i.getClass();
        if (cx.f14175a.nextLong() % 10000 == 0) {
            hxVar.equals(hxVar2);
        }
        if (hxVar.f14445a) {
            return n5.m(hxVar.a());
        }
        return n5.l((Throwable) hxVar.b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.google.android.gms.internal.mlkit_vision_digital_ink.g9, com.google.android.gms.internal.mlkit_vision_digital_ink.f9, com.google.android.gms.internal.mlkit_vision_digital_ink.ma, java.lang.Runnable] */
    public final f9 e(ya yaVar) {
        ys ysVar = new ys(9);
        int i = g2.f14354a;
        int i10 = 0;
        f2 f2Var = new f2(b(), i10, ysVar);
        Executor executor = this.f15311h;
        x9 p10 = n5.p(yaVar, f2Var, executor);
        f2 f2Var2 = new f2(b(), i10, new ys(10));
        int i11 = g9.F;
        g9 g9Var = new g9(p10, Exception.class, f2Var2);
        p10.g(g9Var, f7.l(executor, g9Var));
        return g9Var;
    }

    public final void g(Uri uri) {
        i iVar = this.f15310g;
        if (iVar.g(uri)) {
            iVar.d(uri);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.wv
    public final ya j() {
        int ordinal = this.f15309f.g().ordinal();
        zv zvVar = this.f15305a;
        Uri uri = this.f15308d;
        Uri uri2 = this.e;
        if (ordinal != 1) {
            int i = 3;
            if (ordinal != 2) {
                if (ordinal != 3) {
                    return f();
                }
                try {
                    g(uri);
                    return this.f15307c.j();
                } catch (IOException e) {
                    return n5.l(e);
                }
            }
            try {
                ya j10 = zvVar.j();
                uu uuVar = new uu(this, 0);
                int i10 = g2.f14354a;
                return n5.q(j10, new r0(b(), i, uuVar), this.f15311h);
            } catch (IOException e8) {
                return n5.l(e8);
            }
        }
        try {
            try {
                g(uri);
                return zvVar.j();
            } finally {
                g(uri2);
            }
        } catch (IOException e10) {
            return n5.l(e10);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.wv
    public final ya p() {
        int ordinal = this.f15309f.g().ordinal();
        zv zvVar = this.f15305a;
        int i = 1;
        if (ordinal != 1) {
            int i10 = 3;
            if (ordinal != 2) {
                if (ordinal != 3) {
                    return f();
                }
                return this.f15307c.p();
            }
            zvVar.p();
            f9 e = e(va.f15125v);
            uu uuVar = new uu(this, i);
            int i11 = g2.f14354a;
            return n5.q(e, new r0(b(), i10, uuVar), this.f15311h);
        }
        zvVar.p();
        return va.f15125v;
    }
}