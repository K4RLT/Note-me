package pe;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final ue.a f22682a = ue.a.f27192u;

    public static void a(Throwable th, Throwable th2) {
        boolean z3;
        th.getClass();
        th2.getClass();
        if (th != th2) {
            Integer num = ye.a.f31639a;
            if (num != null && num.intValue() < 19) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (z3) {
                th.addSuppressed(th2);
                return;
            }
            Method method = xe.a.f30764a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static final k b(Throwable th) {
        th.getClass();
        return new k(th);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [pe.m, java.lang.Object, pe.g] */
    /* JADX WARN: Type inference failed for: r2v5, types: [pe.a0, java.lang.Object, pe.g] */
    public static g c(h hVar, df.a aVar) {
        w wVar = w.f22712a;
        int ordinal = hVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    Object obj = new Object();
                    obj.f22683u = aVar;
                    obj.f22684v = wVar;
                    return obj;
                }
                l4.a.o();
                return null;
            }
            Object obj2 = new Object();
            obj2.f22698u = aVar;
            obj2.f22699v = wVar;
            return obj2;
        }
        return new n(aVar);
    }

    public static n d(df.a aVar) {
        aVar.getClass();
        return new n(aVar);
    }

    public static final void e(Object obj) {
        if (!(obj instanceof k)) {
        } else {
            throw ((k) obj).f22695u;
        }
    }

    public static final j f(Object obj, Object obj2) {
        return new j(obj, obj2);
    }

    public static final double g(long j10) {
        return ((j10 >>> 11) * 2048) + (j10 & 2047);
    }
}