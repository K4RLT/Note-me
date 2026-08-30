package com.google.android.gms.internal.consent_sdk;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class q5 extends c5 {
    private static final Map zzb = new ConcurrentHashMap();
    protected r6 zzc;
    private int zzd;

    public q5() {
        this.zza = 0;
        this.zzd = -1;
        this.zzc = r6.e;
    }

    public static q5 h(Class cls) {
        Map map = zzb;
        q5 q5Var = (q5) map.get(cls);
        if (q5Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                q5Var = (q5) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (q5Var == null) {
            q5 q5Var2 = (q5) ((q5) x6.g(cls)).f(6);
            if (q5Var2 != null) {
                map.put(cls, q5Var2);
                return q5Var2;
            }
            g5.q.l();
            return null;
        }
        return q5Var;
    }

    public static Object i(Method method, q5 q5Var, Object... objArr) {
        try {
            return method.invoke(q5Var, objArr);
        } catch (IllegalAccessException e) {
            l4.a.k("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e8) {
            Throwable cause = e8.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (!(cause instanceof Error)) {
                    l4.a.k("Unexpected exception thrown by generated accessor method.", cause);
                    return null;
                }
                throw ((Error) cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static void k(Class cls, q5 q5Var) {
        q5Var.j();
        zzb.put(cls, q5Var);
    }

    @Override // com.google.android.gms.internal.consent_sdk.c5
    public final void a(i5 i5Var) {
        m6 a10 = j6.f13458c.a(getClass());
        a6 a6Var = i5Var.f13442b;
        if (a6Var == null) {
            a6Var = new a6(i5Var);
        }
        a10.e(this, a6Var);
    }

    @Override // com.google.android.gms.internal.consent_sdk.c5
    public final int b(m6 m6Var) {
        if (e()) {
            int g8 = m6Var.g(this);
            if (g8 >= 0) {
                return g8;
            }
            q.x.o(g3.a.g(g8, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i == Integer.MAX_VALUE) {
            int g10 = m6Var.g(this);
            if (g10 >= 0) {
                this.zzd = (this.zzd & Integer.MIN_VALUE) | g10;
                return g10;
            }
            q.x.o(g3.a.g(g10, "serialized size must be non-negative, was "));
            return 0;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.consent_sdk.c5
    public final int c() {
        if (e()) {
            int g8 = j6.f13458c.a(getClass()).g(this);
            if (g8 >= 0) {
                return g8;
            }
            q.x.o(g3.a.g(g8, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int g10 = j6.f13458c.a(getClass()).g(this);
        if (g10 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | g10;
            return g10;
        }
        q.x.o(g3.a.g(g10, "serialized size must be non-negative, was "));
        return 0;
    }

    public final void d() {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final boolean e() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return j6.f13458c.a(getClass()).d(this, (q5) obj);
    }

    public abstract Object f(int i);

    public final p5 g() {
        return (p5) f(5);
    }

    public final int hashCode() {
        if (!e()) {
            int i = this.zza;
            if (i == 0) {
                int b10 = j6.f13458c.a(getClass()).b(this);
                this.zza = b10;
                return b10;
            }
            return i;
        }
        return j6.f13458c.a(getClass()).b(this);
    }

    public final void j() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = f6.f13404a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(obj);
        f6.c(this, sb2, 0);
        return sb2.toString();
    }
}
