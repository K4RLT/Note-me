package eb;
import b.b;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: f, reason: collision with root package name */
    public static final Object f16078f = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final String f16079a;

    /* renamed from: b, reason: collision with root package name */
    public final b0 f16080b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f16081c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f16082d = new Object();
    public volatile Object e = null;

    public c0(String str, Object obj, b0 b0Var) {
        this.f16079a = str;
        this.f16081c = obj;
        this.f16080b = b0Var;
    }

    public final Object a(Object obj) {
        Object obj2;
        synchronized (this.f16082d) {
        }
        if (obj != null) {
            return obj;
        }
        if (q1.f16330k == null) {
            return this.f16081c;
        }
        synchronized (f16078f) {
            try {
                if (de.b()) {
                    if (this.e == null) {
                        obj2 = this.f16081c;
                    } else {
                        obj2 = this.e;
                    }
                    return obj2;
                }
                try {
                    for (c0 c0Var : v.f16389a) {
                        if (!de.b()) {
                            Object obj3 = null;
                            try {
                                b0 b0Var = c0Var.f16080b;
                                if (b0Var != null) {
                                    obj3 = b0Var.zza();
                                }
                            } catch (IllegalStateException unused) {
                            }
                            synchronized (f16078f) {
                                c0Var.e = obj3;
                            }
                        } else {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                    }
                } catch (SecurityException unused2) {
                }
                b0 b0Var2 = this.f16080b;
                if (b0Var2 == null) {
                    return this.f16081c;
                }
                try {
                    return b0Var2.zza();
                } catch (IllegalStateException unused3) {
                    return this.f16081c;
                } catch (SecurityException unused4) {
                    return this.f16081c;
                }
            } finally {
            }
        }
    }
}
