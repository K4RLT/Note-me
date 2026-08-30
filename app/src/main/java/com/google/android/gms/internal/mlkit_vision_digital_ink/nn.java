package com.google.android.gms.internal.mlkit_vision_digital_ink;
import g3.a;
import g5.q;
import l4.a;
import q.x;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class nn extends km {
    private static final Map zza = new ConcurrentHashMap();
    public static final /* synthetic */ int zzd = 0;
    protected yo zzc;
    private int zze;

    public nn() {
        this.zzb = 0;
        this.zze = -1;
        this.zzc = yo.f15293f;
    }

    public static nn h(Class cls) {
        Map map = zza;
        nn nnVar = (nn) map.get(cls);
        if (nnVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                nnVar = (nn) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (nnVar == null) {
            nn nnVar2 = (nn) ((nn) dp.g(cls)).q(6, null);
            if (nnVar2 != null) {
                map.put(cls, nnVar2);
                return nnVar2;
            }
            q.l();
            return null;
        }
        return nnVar;
    }

    public static Object j(Method method, nn nnVar, Object... objArr) {
        try {
            return method.invoke(nnVar, objArr);
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

    public static void m(Class cls, nn nnVar) {
        nnVar.l();
        zza.put(cls, nnVar);
    }

    public static nn r(nn nnVar, byte[] bArr, int i, bn bnVar) {
        if (i == 0) {
            return nnVar;
        }
        nn i10 = nnVar.i();
        try {
            ro a10 = oo.f14756c.a(i10.getClass());
            a10.k(i10, bArr, 0, i, new pm(bnVar));
            a10.b(i10);
            return i10;
        } catch (xn e) {
            if (e.f15243u) {
                throw new IOException(e.getMessage(), e);
            }
            throw e;
        } catch (xo e8) {
            androidx.datastore.preferences.protobuf.s1.u(e8.getMessage());
            return null;
        } catch (IOException e10) {
            if (e10.getCause() instanceof xn) {
                throw ((xn) e10.getCause());
            }
            throw new IOException(e10.getMessage(), e10);
        } catch (IndexOutOfBoundsException unused) {
            androidx.datastore.preferences.protobuf.s1.u("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return null;
        }
    }

    public static final boolean s(nn nnVar, boolean z3) {
        nn nnVar2 = null;
        byte byteValue = ((Byte) nnVar.q(1, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean c10 = oo.f14756c.a(nnVar.getClass()).c(nnVar);
        if (z3) {
            if (true == c10) {
                nnVar2 = nnVar;
            }
            nnVar.q(2, nnVar2);
        }
        return c10;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ho
    public final boolean a() {
        return s(this, true);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.km
    public final int b(ro roVar) {
        if (o()) {
            int j10 = roVar.j(this);
            if (j10 >= 0) {
                return j10;
            }
            x.o(a.g(j10, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.zze & Integer.MAX_VALUE;
        if (i == Integer.MAX_VALUE) {
            int j11 = roVar.j(this);
            if (j11 >= 0) {
                this.zze = (this.zze & Integer.MIN_VALUE) | j11;
                return j11;
            }
            x.o(a.g(j11, "serialized size must be non-negative, was "));
            return 0;
        }
        return i;
    }

    public final int e() {
        if (o()) {
            int j10 = oo.f14756c.a(getClass()).j(this);
            if (j10 >= 0) {
                return j10;
            }
            x.o(a.g(j10, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.zze & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int j11 = oo.f14756c.a(getClass()).j(this);
        if (j11 >= 0) {
            this.zze = (this.zze & Integer.MIN_VALUE) | j11;
            return j11;
        }
        x.o(a.g(j11, "serialized size must be non-negative, was "));
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return oo.f14756c.a(getClass()).g(this, (nn) obj);
    }

    public final hn f() {
        return (hn) q(5, null);
    }

    public final hn g() {
        hn hnVar = (hn) q(5, null);
        hnVar.h(this);
        return hnVar;
    }

    public final int hashCode() {
        if (!o()) {
            int i = this.zzb;
            if (i == 0) {
                int h3 = oo.f14756c.a(getClass()).h(this);
                this.zzb = h3;
                return h3;
            }
            return i;
        }
        return oo.f14756c.a(getClass()).h(this);
    }

    public final nn i() {
        return (nn) q(4, null);
    }

    public final void k() {
        oo.f14756c.a(getClass()).b(this);
        l();
    }

    public final void l() {
        this.zze &= Integer.MAX_VALUE;
    }

    public final void n() {
        this.zze = (this.zze & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final boolean o() {
        return (this.zze & Integer.MIN_VALUE) != 0;
    }

    public final void p(ym ymVar) {
        ro a10 = oo.f14756c.a(getClass());
        s5 s5Var = ymVar.f15286a;
        if (s5Var == null) {
            s5Var = new s5(ymVar);
        }
        a10.f(this, s5Var);
    }

    public abstract Object q(int i, nn nnVar);

    public final String toString() {
        String obj = super.toString();
        char[] cArr = io.f14477a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(obj);
        io.c(this, sb2, 0);
        return sb2.toString();
    }
}
