package ff;

import a0.u;
import d3.j;
import pf.f0;
import q.x;

/* loaded from: classes.dex */
public abstract class a {
    /* JADX WARN: Type inference failed for: r1v0, types: [d3.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [d3.k, java.lang.Object] */
    public static j a(f0 f0Var) {
        Object obj = new Object();
        obj.f15720c = new Object();
        j jVar = new j(obj);
        obj.f15719b = jVar;
        obj.f15718a = a5.a.class;
        try {
            f0Var.p(new u((Object) obj, 2, f0Var));
            obj.f15718a = "Deferred.asListenableFuture";
            return jVar;
        } catch (Exception e) {
            jVar.f15723v.m(e);
            return jVar;
        }
    }

    public static int b(float f10) {
        if (!Float.isNaN(f10)) {
            return Math.round(f10);
        }
        x.n("Cannot round NaN value.");
        return 0;
    }

    public static long c(double d2) {
        if (!Double.isNaN(d2)) {
            return Math.round(d2);
        }
        x.n("Cannot round NaN value.");
        return 0L;
    }
}