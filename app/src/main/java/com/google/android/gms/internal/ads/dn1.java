package com.google.android.gms.internal.ads;
import a5.a;
import g5.q;
import l4.a;
import q.x;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class dn1 extends cm1 {
    private static final int zza = Integer.MIN_VALUE;
    private static final int zzb = Integer.MAX_VALUE;
    private static final Map<Class<?>, dn1> zzd = new ConcurrentHashMap();
    static final int zzr = Integer.MAX_VALUE;
    static final int zzs = 0;
    private int zzc;
    protected vo1 zzt;

    public dn1() {
        this.zzq = 0;
        this.zzc = -1;
        this.zzt = vo1.f11961f;
    }

    public static Object j(Method method, dn1 dn1Var, Object... objArr) {
        try {
            return method.invoke(dn1Var, objArr);
        } catch (IllegalAccessException e) {
            a.k("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e8) {
            Throwable cause = e8.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (!(cause instanceof Error)) {
                    a.k("Unexpected exception thrown by generated accessor method.", cause);
                    return null;
                }
                throw ((Error) cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static vn1 k(jn1 jn1Var) {
        int size = jn1Var.size();
        return ((vn1) jn1Var).B(size + size);
    }

    public static dn1 l(dn1 dn1Var, rm1 rm1Var, wm1 wm1Var) {
        dn1 p10 = dn1Var.p();
        try {
            oo1 a10 = ho1.f6854c.a(p10.getClass());
            androidx.datastore.preferences.protobuf.i iVar = (androidx.datastore.preferences.protobuf.i) rm1Var.f10247c;
            if (iVar == null) {
                iVar = new androidx.datastore.preferences.protobuf.i(rm1Var);
            }
            a10.f(p10, iVar, wm1Var);
            a10.d(p10);
            return p10;
        } catch (pn1 e) {
            if (e.f9565u) {
                throw new IOException(e.getMessage(), e);
            }
            throw e;
        } catch (uo1 e8) {
            androidx.datastore.preferences.protobuf.s1.t(e8.getMessage());
            return null;
        } catch (IOException e10) {
            if (e10.getCause() instanceof pn1) {
                throw ((pn1) e10.getCause());
            }
            throw new IOException(e10.getMessage(), e10);
        } catch (RuntimeException e11) {
            if (e11.getCause() instanceof pn1) {
                throw ((pn1) e11.getCause());
            }
            throw e11;
        }
    }

    public static dn1 m(dn1 dn1Var, om1 om1Var, wm1 wm1Var) {
        rm1 v2 = om1Var.v();
        dn1 l10 = l(dn1Var, v2, wm1Var);
        v2.r(0);
        y(l10);
        return l10;
    }

    public static dn1 n(dn1 dn1Var, byte[] bArr, wm1 wm1Var) {
        dn1 x9 = x(dn1Var, bArr, bArr.length, wm1Var);
        y(x9);
        return x9;
    }

    public static dn1 s(Class cls) {
        Map<Class<?>, dn1> map = zzd;
        dn1 dn1Var = map.get(cls);
        if (dn1Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                dn1Var = map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (dn1Var == null) {
            dn1 dn1Var2 = (dn1) ((dn1) zo1.a(cls)).v(6, null);
            if (dn1Var2 != null) {
                map.put(cls, dn1Var2);
                return dn1Var2;
            }
            q.l();
            return null;
        }
        return dn1Var;
    }

    public static void t(Class cls, dn1 dn1Var) {
        dn1Var.i();
        zzd.put(cls, dn1Var);
    }

    public static final boolean w(dn1 dn1Var, boolean z3) {
        dn1 dn1Var2 = null;
        byte byteValue = ((Byte) dn1Var.v(1, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean c10 = ho1.f6854c.a(dn1Var.getClass()).c(dn1Var);
        if (z3) {
            if (true == c10) {
                dn1Var2 = dn1Var;
            }
            dn1Var.v(2, dn1Var2);
        }
        return c10;
    }

    public static dn1 x(dn1 dn1Var, byte[] bArr, int i, wm1 wm1Var) {
        if (i == 0) {
            return dn1Var;
        }
        dn1 p10 = dn1Var.p();
        try {
            oo1 a10 = ho1.f6854c.a(p10.getClass());
            a10.h(p10, bArr, 0, i, new fm1(wm1Var));
            a10.d(p10);
            return p10;
        } catch (pn1 e) {
            if (e.f9565u) {
                throw new IOException(e.getMessage(), e);
            }
            throw e;
        } catch (uo1 e8) {
            androidx.datastore.preferences.protobuf.s1.t(e8.getMessage());
            return null;
        } catch (IOException e10) {
            if (e10.getCause() instanceof pn1) {
                throw ((pn1) e10.getCause());
            }
            throw new IOException(e10.getMessage(), e10);
        } catch (IndexOutOfBoundsException unused) {
            androidx.datastore.preferences.protobuf.s1.t("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return null;
        }
    }

    public static void y(dn1 dn1Var) {
        if (dn1Var != null && !w(dn1Var, true)) {
            androidx.datastore.preferences.protobuf.s1.t(new uo1().getMessage());
        }
    }

    @Override // com.google.android.gms.internal.ads.cm1
    public final int d(oo1 oo1Var) {
        int j10;
        int j11;
        if (h()) {
            if (oo1Var == null) {
                j11 = ho1.f6854c.a(getClass()).j(this);
            } else {
                j11 = oo1Var.j(this);
            }
            if (j11 >= 0) {
                return j11;
            }
            x.o(a.f(j11, "serialized size must be non-negative, was ", new StringBuilder(String.valueOf(j11).length() + 42)));
            return 0;
        }
        int i = this.zzc;
        if ((i & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i & Integer.MAX_VALUE;
        }
        if (oo1Var == null) {
            j10 = ho1.f6854c.a(getClass()).j(this);
        } else {
            j10 = oo1Var.j(this);
        }
        g(j10);
        return j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return ho1.f6854c.a(getClass()).i(this, (dn1) obj);
    }

    public final void g(int i) {
        if (i >= 0) {
            this.zzc = i | (this.zzc & zza);
        } else {
            x.o(a.f(i, "serialized size must be non-negative, was ", new StringBuilder(String.valueOf(i).length() + 42)));
        }
    }

    public final boolean h() {
        return (this.zzc & zza) != 0;
    }

    public final int hashCode() {
        if (h()) {
            return ho1.f6854c.a(getClass()).k(this);
        }
        if (this.zzq == 0) {
            this.zzq = ho1.f6854c.a(getClass()).k(this);
        }
        return this.zzq;
    }

    public final void i() {
        this.zzc &= Integer.MAX_VALUE;
    }

    public final fo1 o() {
        return (fo1) v(7, null);
    }

    public final dn1 p() {
        return (dn1) v(4, null);
    }

    public final bn1 q() {
        return (bn1) v(5, null);
    }

    public final bn1 r() {
        bn1 bn1Var = (bn1) v(5, null);
        bn1Var.d(this);
        return bn1Var;
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = ao1.f4566a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(obj);
        ao1.b(this, sb2, 0);
        return sb2.toString();
    }

    public final void u(um1 um1Var) {
        oo1 a10 = ho1.f6854c.a(getClass());
        lt0 lt0Var = (lt0) um1Var.f11688u;
        if (lt0Var == null) {
            lt0Var = new lt0(um1Var);
        }
        a10.g(this, lt0Var);
    }

    public abstract Object v(int i, dn1 dn1Var);
}
