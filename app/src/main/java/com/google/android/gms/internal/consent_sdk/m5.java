package com.google.android.gms.internal.consent_sdk;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class m5 {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f13491c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final o6 f13492a = new o6();

    /* renamed from: b, reason: collision with root package name */
    public boolean f13493b;

    static {
        new m5(0);
    }

    public m5(int i) {
        a();
        a();
    }

    public static void b(i5 i5Var, a7 a7Var, int i, Object obj) {
        if (a7Var != a7.f13357y) {
            i5Var.x(i, a7Var.f13360v);
            b7 b7Var = b7.f13364u;
            switch (a7Var.ordinal()) {
                case 0:
                    i5Var.t(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                    return;
                case 1:
                    i5Var.r(Float.floatToRawIntBits(((Float) obj).floatValue()));
                    return;
                case 2:
                    i5Var.B(((Long) obj).longValue());
                    return;
                case 3:
                    i5Var.B(((Long) obj).longValue());
                    return;
                case 4:
                    i5Var.v(((Integer) obj).intValue());
                    return;
                case 5:
                    i5Var.t(((Long) obj).longValue());
                    return;
                case 6:
                    i5Var.r(((Integer) obj).intValue());
                    return;
                case 7:
                    byte booleanValue = ((Boolean) obj).booleanValue();
                    if (i5Var.e == i5Var.f13444d) {
                        i5Var.j();
                    }
                    byte[] bArr = i5Var.f13443c;
                    int i10 = i5Var.e;
                    bArr[i10] = booleanValue;
                    i5Var.e = i10 + 1;
                    return;
                case 8:
                    if (obj instanceof h5) {
                        i5Var.p((h5) obj);
                        return;
                    } else {
                        i5Var.w((String) obj);
                        return;
                    }
                case 9:
                    ((c5) obj).a(i5Var);
                    return;
                case 10:
                    c5 c5Var = (c5) obj;
                    i5Var.z(c5Var.c());
                    c5Var.a(i5Var);
                    return;
                case 11:
                    if (obj instanceof h5) {
                        i5Var.p((h5) obj);
                        return;
                    }
                    byte[] bArr2 = (byte[]) obj;
                    int length = bArr2.length;
                    i5Var.z(length);
                    i5Var.C(bArr2, length);
                    return;
                case 12:
                    i5Var.z(((Integer) obj).intValue());
                    return;
                case 13:
                    i5Var.v(((Integer) obj).intValue());
                    return;
                case 14:
                    i5Var.r(((Integer) obj).intValue());
                    return;
                case 15:
                    i5Var.t(((Long) obj).longValue());
                    return;
                case 16:
                    int intValue = ((Integer) obj).intValue();
                    i5Var.z((intValue >> 31) ^ (intValue + intValue));
                    return;
                case 17:
                    long longValue = ((Long) obj).longValue();
                    i5Var.B((longValue >> 63) ^ (longValue + longValue));
                    return;
                default:
                    return;
            }
        }
        i5Var.x(i, 3);
        ((c5) obj).a(i5Var);
        i5Var.x(i, 4);
    }

    public final void a() {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        if (this.f13493b) {
            return;
        }
        o6 o6Var = this.f13492a;
        int i = o6Var.f13514v;
        for (int i10 = 0; i10 < i; i10++) {
            Object obj = o6Var.c(i10).f13525v;
            if (obj instanceof q5) {
                q5 q5Var = (q5) obj;
                j6.f13458c.a(q5Var.getClass()).a(q5Var);
                q5Var.j();
            }
        }
        Iterator it = o6Var.a().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof q5) {
                q5 q5Var2 = (q5) value;
                j6.f13458c.a(q5Var2.getClass()).a(q5Var2);
                q5Var2.j();
            }
        }
        if (!o6Var.f13516x) {
            if (o6Var.f13514v <= 0) {
                Iterator it2 = o6Var.a().iterator();
                if (it2.hasNext()) {
                    ((Map.Entry) it2.next()).getKey().getClass();
                    g5.q.b();
                    return;
                }
            } else {
                o6Var.c(0).f13524u.getClass();
                g5.q.b();
                return;
            }
        }
        if (!o6Var.f13516x) {
            if (o6Var.f13515w.isEmpty()) {
                unmodifiableMap = Collections.EMPTY_MAP;
            } else {
                unmodifiableMap = Collections.unmodifiableMap(o6Var.f13515w);
            }
            o6Var.f13515w = unmodifiableMap;
            if (o6Var.f13518z.isEmpty()) {
                unmodifiableMap2 = Collections.EMPTY_MAP;
            } else {
                unmodifiableMap2 = Collections.unmodifiableMap(o6Var.f13518z);
            }
            o6Var.f13518z = unmodifiableMap2;
            o6Var.f13516x = true;
        }
        this.f13493b = true;
    }

    public final Object clone() {
        m5 m5Var = new m5();
        o6 o6Var = this.f13492a;
        if (o6Var.f13514v <= 0) {
            Iterator it = o6Var.a().iterator();
            if (!it.hasNext()) {
                return m5Var;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (entry.getKey() != null) {
                g5.q.b();
                return null;
            }
            entry.getValue();
            throw null;
        }
        o6Var.c(0).f13524u.getClass();
        g5.q.b();
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m5)) {
            return false;
        }
        return this.f13492a.equals(((m5) obj).f13492a);
    }

    public final int hashCode() {
        return this.f13492a.hashCode();
    }

    public m5() {
    }
}
