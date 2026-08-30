package com.google.android.gms.internal.measurement;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class b5 extends m4 {
    private static Map<Object, b5> zzc = new ConcurrentHashMap();
    protected b6 zzb;
    private int zzd;

    public b5() {
        this.zza = 0;
        this.zzd = -1;
        this.zzb = b6.f13654f;
    }

    public static b5 d(Class cls) {
        b5 b5Var = zzc.get(cls);
        if (b5Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                b5Var = zzc.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (b5Var == null) {
            b5 b5Var2 = (b5) ((b5) e6.a(cls)).g(6);
            if (b5Var2 != null) {
                zzc.put(cls, b5Var2);
                return b5Var2;
            }
            g5.q.l();
            return null;
        }
        return b5Var;
    }

    public static i5 e(i5 i5Var) {
        int i;
        int size = i5Var.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size << 1;
        }
        return i5Var.e(i);
    }

    public static n5 f(f5 f5Var) {
        int i;
        int size = f5Var.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size << 1;
        }
        n5 n5Var = (n5) f5Var;
        if (i >= n5Var.f13861w) {
            return new n5(Arrays.copyOf(n5Var.f13860v, i), n5Var.f13861w, true);
        }
        q.x.m();
        return null;
    }

    public static Object h(Method method, b5 b5Var, Object... objArr) {
        try {
            return method.invoke(b5Var, objArr);
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

    public static void i(Class cls, b5 b5Var) {
        b5Var.n();
        zzc.put(cls, b5Var);
    }

    @Override // com.google.android.gms.internal.measurement.m4
    public final int a(a6 a6Var) {
        int d2;
        int d10;
        if (o()) {
            if (a6Var == null) {
                y5 y5Var = y5.f13983c;
                y5Var.getClass();
                d10 = y5Var.a(getClass()).d(this);
            } else {
                d10 = a6Var.d(this);
            }
            if (d10 >= 0) {
                return d10;
            }
            q.x.o(g3.a.g(d10, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.zzd;
        if ((i & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i & Integer.MAX_VALUE;
        }
        if (a6Var == null) {
            y5 y5Var2 = y5.f13983c;
            y5Var2.getClass();
            d2 = y5Var2.a(getClass()).d(this);
        } else {
            d2 = a6Var.d(this);
        }
        j(d2);
        return d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        y5 y5Var = y5.f13983c;
        y5Var.getClass();
        return y5Var.a(getClass()).b(this, (b5) obj);
    }

    public abstract Object g(int i);

    public final int hashCode() {
        if (o()) {
            y5 y5Var = y5.f13983c;
            y5Var.getClass();
            return y5Var.a(getClass()).f(this);
        }
        if (this.zza == 0) {
            y5 y5Var2 = y5.f13983c;
            y5Var2.getClass();
            this.zza = y5Var2.a(getClass()).f(this);
        }
        return this.zza;
    }

    public final void j(int i) {
        if (i >= 0) {
            this.zzd = (i & Integer.MAX_VALUE) | (this.zzd & Integer.MIN_VALUE);
        } else {
            q.x.o(g3.a.g(i, "serialized size must be non-negative, was "));
        }
    }

    public final a5 k() {
        return (a5) g(5);
    }

    public final a5 l() {
        a5 a5Var = (a5) g(5);
        b5 b5Var = a5Var.f13638u;
        if (b5Var.equals(this)) {
            return a5Var;
        }
        if (!a5Var.f13639v.o()) {
            b5 b5Var2 = (b5) b5Var.g(4);
            b5 b5Var3 = a5Var.f13639v;
            y5 y5Var = y5.f13983c;
            y5Var.getClass();
            y5Var.a(b5Var2.getClass()).g(b5Var2, b5Var3);
            a5Var.f13639v = b5Var2;
        }
        b5 b5Var4 = a5Var.f13639v;
        y5 y5Var2 = y5.f13983c;
        y5Var2.getClass();
        y5Var2.a(b5Var4.getClass()).g(b5Var4, this);
        return a5Var;
    }

    public final void m() {
        y5 y5Var = y5.f13983c;
        y5Var.getClass();
        y5Var.a(getClass()).c(this);
        n();
    }

    public final void n() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final boolean o() {
        if ((this.zzd & Integer.MIN_VALUE) != 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = s5.f13911a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(obj);
        s5.b(this, sb2, 0);
        return sb2.toString();
    }
}
