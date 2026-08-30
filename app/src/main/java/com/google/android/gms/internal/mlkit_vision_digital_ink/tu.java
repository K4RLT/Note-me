package com.google.android.gms.internal.mlkit_vision_digital_ink;

import android.net.Uri;
import java.io.IOException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class tu implements qu {

    /* renamed from: a, reason: collision with root package name */
    public final xv f15027a;

    /* renamed from: b, reason: collision with root package name */
    public final iv f15028b;

    /* renamed from: c, reason: collision with root package name */
    public final iv f15029c;

    /* renamed from: d, reason: collision with root package name */
    public final s5 f15030d;
    public final Uri e;

    /* renamed from: f, reason: collision with root package name */
    public final Uri f15031f;

    /* renamed from: g, reason: collision with root package name */
    public final i f15032g;

    /* renamed from: h, reason: collision with root package name */
    public final Executor f15033h;
    public final ss i;

    public tu(xv xvVar, iv ivVar, iv ivVar2, Uri uri, Uri uri2, s5 s5Var, i iVar, Executor executor, ss ssVar) {
        this.f15027a = xvVar;
        this.f15028b = ivVar2;
        this.f15029c = ivVar;
        this.e = uri;
        this.f15031f = uri2;
        this.f15030d = s5Var;
        this.f15032g = iVar;
        this.f15033h = executor;
        this.i = ssVar;
    }

    public static ua h() {
        return n5.l(new IllegalStateException("Migration flag had unexpected state"));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.qu
    public final ya a(fs fsVar) {
        int ordinal = this.f15030d.g().ordinal();
        xv xvVar = this.f15027a;
        if (ordinal != 1) {
            int i = 3;
            int i10 = 2;
            if (ordinal != 2) {
                if (ordinal != 3) {
                    return h();
                }
                return this.f15028b.a(fsVar);
            }
            f9 g8 = g(xvVar.a(fsVar));
            su suVar = new su(this, fsVar, i10);
            int i11 = g2.f14354a;
            return n5.q(g8, new r0(q1.b(), i, suVar), this.f15033h);
        }
        return xvVar.a(fsVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.qu
    public final ya b() {
        int ordinal = this.f15030d.g().ordinal();
        Uri uri = this.e;
        Uri uri2 = this.f15031f;
        try {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        return h();
                    }
                    try {
                        i(uri);
                        return va.f15125v;
                    } catch (IOException e) {
                        return n5.l(e);
                    }
                }
                try {
                    i(uri2);
                    return va.f15125v;
                } catch (IOException e8) {
                    return n5.l(e8);
                }
            }
            try {
                i(uri);
                i(uri2);
                return va.f15125v;
            } catch (Throwable th) {
                i(uri2);
                throw th;
            }
        } catch (IOException e10) {
            return n5.l(e10);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.qu
    public final ya c(tr trVar) {
        int ordinal = this.f15030d.g().ordinal();
        xv xvVar = this.f15027a;
        if (ordinal != 1) {
            int i = 3;
            if (ordinal != 2) {
                if (ordinal != 3) {
                    return h();
                }
                return this.f15028b.c(trVar);
            }
            f9 g8 = g(xvVar.c(trVar));
            r0 r0Var = new r0(this, 12, trVar);
            int i10 = g2.f14354a;
            return n5.q(g8, new r0(q1.b(), i, r0Var), this.f15033h);
        }
        return xvVar.c(trVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.qu
    public final ya d(fs fsVar) {
        int ordinal = this.f15030d.g().ordinal();
        xv xvVar = this.f15027a;
        if (ordinal != 1) {
            int i = 3;
            if (ordinal != 2) {
                if (ordinal != 3) {
                    return h();
                }
                return this.f15028b.d(fsVar);
            }
            f9 g8 = g(xvVar.d(fsVar));
            su suVar = new su(this, fsVar, 0);
            int i10 = g2.f14354a;
            return n5.q(g8, new r0(q1.b(), i, suVar), this.f15033h);
        }
        return xvVar.d(fsVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.qu
    public final ya e(fs fsVar, tr trVar) {
        int ordinal = this.f15030d.g().ordinal();
        xv xvVar = this.f15027a;
        if (ordinal != 1) {
            int i = 3;
            if (ordinal != 2) {
                if (ordinal != 3) {
                    return h();
                }
                return this.f15028b.e(fsVar, trVar);
            }
            f9 g8 = g(xvVar.e(fsVar, trVar));
            c1 c1Var = new c1(13, this, fsVar, trVar);
            int i10 = g2.f14354a;
            return n5.q(g8, new r0(q1.b(), i, c1Var), this.f15033h);
        }
        return xvVar.e(fsVar, trVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.qu
    public final ya f(fs fsVar) {
        int ordinal = this.f15030d.g().ordinal();
        xv xvVar = this.f15027a;
        int i = 1;
        if (ordinal != 1) {
            int i10 = 3;
            if (ordinal != 2) {
                if (ordinal != 3) {
                    return h();
                }
                return this.f15028b.f(fsVar);
            }
            f9 g8 = g(xvVar.f(fsVar));
            su suVar = new su(this, fsVar, i);
            int i11 = g2.f14354a;
            return n5.q(g8, new r0(q1.b(), i10, suVar), this.f15033h);
        }
        return xvVar.f(fsVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.google.android.gms.internal.mlkit_vision_digital_ink.g9, com.google.android.gms.internal.mlkit_vision_digital_ink.f9, com.google.android.gms.internal.mlkit_vision_digital_ink.ma, java.lang.Runnable] */
    public final f9 g(ya yaVar) {
        ys ysVar = new ys(7);
        int i = g2.f14354a;
        int i10 = 0;
        f2 f2Var = new f2(q1.b(), i10, ysVar);
        Executor executor = this.f15033h;
        x9 p10 = n5.p(yaVar, f2Var, executor);
        f2 f2Var2 = new f2(q1.b(), i10, new ys(8));
        int i11 = g9.F;
        ?? g9Var = new g9(p10, Exception.class, f2Var2);
        p10.g(g9Var, f7.l(executor, g9Var));
        return g9Var;
    }

    public final void i(Uri uri) {
        i iVar = this.f15032g;
        if (iVar.g(uri)) {
            iVar.d(uri);
        }
    }

    public final ya j(hx hxVar, hx hxVar2) {
        this.i.getClass();
        if (cx.f14175a.nextLong() % 10000 == 0) {
            hxVar.equals(hxVar2);
        }
        if (hxVar.f14445a) {
            return n5.m(hxVar.a());
        }
        return n5.l((Throwable) hxVar.b());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.qu
    public final ya zzb() {
        int ordinal = this.f15030d.g().ordinal();
        xv xvVar = this.f15027a;
        if (ordinal != 1) {
            int i = 3;
            if (ordinal != 2) {
                if (ordinal != 3) {
                    return h();
                }
                return this.f15028b.zzb();
            }
            xvVar.zzb();
            f9 g8 = g(va.f15125v);
            p0 p0Var = new p0(i, this);
            int i10 = g2.f14354a;
            return n5.q(g8, new r0(q1.b(), i, p0Var), this.f15033h);
        }
        xvVar.zzb();
        return va.f15125v;
    }
}
