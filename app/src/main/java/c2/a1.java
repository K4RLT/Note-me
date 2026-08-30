package c2;
import c2.a1;
import r0.w0;

import android.view.Choreographer;
import ya.lc;

/* loaded from: classes.dex */
public final class a1 implements w0 {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f3460u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f3461v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f3462w;

    public a1(w0 w0Var) {
        this.f3460u = 1;
        this.f3461v = w0Var;
        this.f3462w = new com.google.android.gms.internal.ads.d(10);
    }

    @Override // te.g
    public final Object H(df.p pVar, Object obj) {
        switch (this.f3460u) {
            case 0:
                return pVar.invoke(obj, this);
            default:
                return pVar.invoke(obj, this);
        }
    }

    @Override // te.g
    public final te.e L(te.f fVar) {
        switch (this.f3460u) {
            case 0:
                return lc.a(this, fVar);
            default:
                return lc.a(this, fVar);
        }
    }

    @Override // te.g
    public final te.g N(te.f fVar) {
        switch (this.f3460u) {
            case 0:
                return lc.b(this, fVar);
            default:
                return lc.b(this, fVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007b, code lost:
    
        if (r8 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003c  */
    @Override // w0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object R(df.l r7, te.c r8) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.a1.R(df.l, te.c):java.lang.Object");
    }

    @Override // te.g
    public final te.g V(te.g gVar) {
        switch (this.f3460u) {
            case 0:
                return lc.c(this, gVar);
            default:
                return lc.c(this, gVar);
        }
    }

    public a1(Choreographer choreographer, y0 y0Var) {
        this.f3460u = 0;
        this.f3461v = choreographer;
        this.f3462w = y0Var;
    }
}
