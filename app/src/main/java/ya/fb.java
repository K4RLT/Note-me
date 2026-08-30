package ya;
import m2.g;
import m2.p0;
import r2.x;

/* loaded from: classes.dex */
public abstract class fb {
    public static final g a(x xVar) {
        g gVar = xVar.f24515a;
        long j10 = xVar.f24516b;
        gVar.getClass();
        return gVar.subSequence(p0.e(j10), p0.d(j10));
    }

    public static final g b(x xVar, int i) {
        g gVar = xVar.f24515a;
        long j10 = xVar.f24516b;
        return gVar.subSequence(p0.d(j10), Math.min(p0.d(j10) + i, xVar.f24515a.f20477v.length()));
    }

    public static final g c(x xVar, int i) {
        g gVar = xVar.f24515a;
        long j10 = xVar.f24516b;
        return gVar.subSequence(Math.max(0, p0.e(j10) - i), p0.e(j10));
    }
}
