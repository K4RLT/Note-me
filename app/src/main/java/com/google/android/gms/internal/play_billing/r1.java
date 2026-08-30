package com.google.android.gms.internal.play_billing;
import g3.a;
import i2.c;
import q.l;
import q.x;
import x.o;
import x2.g;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class r1 extends b1 {
    private static final Map zzb = new ConcurrentHashMap();
    protected s2 zzc;
    private int zzd;

    public r1() {
        this.zza = 0;
        this.zzd = -1;
        this.zzc = s2.f15527f;
    }

    public static void f(Class cls, r1 r1Var) {
        r1Var.e();
        zzb.put(cls, r1Var);
    }

    public static final boolean i(r1 r1Var, boolean z3) {
        byte byteValue = ((Byte) r1Var.j(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean d2 = m2.f15489c.a(r1Var.getClass()).d(r1Var);
        if (z3) {
            r1Var.j(2);
        }
        return d2;
    }

    public static r1 m(Class cls) {
        Map map = zzb;
        r1 r1Var = (r1) map.get(cls);
        if (r1Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                r1Var = (r1) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (r1Var == null) {
            r1 r1Var2 = (r1) ((r1) x2.g(cls)).j(6);
            if (r1Var2 != null) {
                map.put(cls, r1Var2);
                return r1Var2;
            }
            g5.q.l();
            return null;
        }
        return r1Var;
    }

    public static Object o(Method method, r1 r1Var, Object... objArr) {
        try {
            return method.invoke(r1Var, objArr);
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

    @Override // com.google.android.gms.internal.play_billing.b1
    public final void a(i1 i1Var) {
        p2 a10 = m2.f15489c.a(getClass());
        d2 d2Var = i1Var.f15445a;
        if (d2Var == null) {
            d2Var = new d2(i1Var);
        }
        a10.h(this, d2Var);
    }

    @Override // com.google.android.gms.internal.play_billing.b1
    public final int c(p2 p2Var) {
        if (h()) {
            int g8 = p2Var.g(this);
            if (g8 >= 0) {
                return g8;
            }
            q.x.o(g3.a.g(g8, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i == Integer.MAX_VALUE) {
            int g10 = p2Var.g(this);
            if (g10 >= 0) {
                this.zzd = (this.zzd & Integer.MIN_VALUE) | g10;
                return g10;
            }
            q.x.o(g3.a.g(g10, "serialized size must be non-negative, was "));
            return 0;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.play_billing.b1
    public final int d() {
        if (h()) {
            int g8 = m2.f15489c.a(getClass()).g(this);
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
        int g10 = m2.f15489c.a(getClass()).g(this);
        if (g10 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | g10;
            return g10;
        }
        q.x.o(g3.a.g(g10, "serialized size must be non-negative, was "));
        return 0;
    }

    public final void e() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return m2.f15489c.a(getClass()).f(this, (r1) obj);
    }

    public final void g() {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final boolean h() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public final int hashCode() {
        if (!h()) {
            int i = this.zza;
            if (i == 0) {
                int i10 = m2.f15489c.a(getClass()).i(this);
                this.zza = i10;
                return i10;
            }
            return i;
        }
        return m2.f15489c.a(getClass()).i(this);
    }

    public abstract Object j(int i);

    public final q1 k() {
        return (q1) j(5);
    }

    public final q1 l() {
        q1 q1Var = (q1) j(5);
        if (!q1Var.f15515u.equals(this)) {
            if (!q1Var.f15516v.h()) {
                r1 n10 = q1Var.f15515u.n();
                m2.f15489c.a(n10.getClass()).e(n10, q1Var.f15516v);
                q1Var.f15516v = n10;
            }
            r1 r1Var = q1Var.f15516v;
            m2.f15489c.a(r1Var.getClass()).e(r1Var, this);
        }
        return q1Var;
    }

    public final r1 n() {
        return (r1) j(4);
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = i2.f15449a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(obj);
        i2.c(this, sb2, 0);
        return sb2.toString();
    }
}
