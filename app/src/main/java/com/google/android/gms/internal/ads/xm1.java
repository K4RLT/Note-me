package com.google.android.gms.internal.ads;
import g5.q;
import q.b;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class xm1 {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f12593c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final qo1 f12594a = new qo1();

    /* renamed from: b, reason: collision with root package name */
    public boolean f12595b;

    static {
        new xm1(0);
    }

    public xm1(int i) {
        a();
        a();
    }

    public static void b(um1 um1Var, dp1 dp1Var, int i, Object obj) {
        if (dp1Var != dp1.f5475x) {
            um1Var.a0(i, dp1Var.f5479v);
            ep1 ep1Var = ep1.f5745u;
            switch (dp1Var.ordinal()) {
                case 0:
                    um1Var.R1(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                    return;
                case 1:
                    um1Var.O1(Float.floatToRawIntBits(((Float) obj).floatValue()));
                    return;
                case 2:
                    um1Var.Q1(((Long) obj).longValue());
                    return;
                case 3:
                    um1Var.Q1(((Long) obj).longValue());
                    return;
                case 4:
                    um1Var.K1(((Integer) obj).intValue());
                    return;
                case 5:
                    um1Var.R1(((Long) obj).longValue());
                    return;
                case 6:
                    um1Var.O1(((Integer) obj).intValue());
                    return;
                case 7:
                    um1Var.I1(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                    return;
                case 8:
                    if (obj instanceof om1) {
                        um1Var.D1((om1) obj);
                        return;
                    } else {
                        um1Var.S1((String) obj);
                        return;
                    }
                case 9:
                    ((dn1) ((cm1) obj)).u(um1Var);
                    return;
                case 10:
                    um1Var.H1((cm1) obj);
                    return;
                case 11:
                    if (obj instanceof om1) {
                        um1Var.D1((om1) obj);
                        return;
                    } else {
                        byte[] bArr = (byte[]) obj;
                        um1Var.F1(bArr, bArr.length);
                        return;
                    }
                case 12:
                    um1Var.M1(((Integer) obj).intValue());
                    return;
                case 13:
                    if (obj instanceof fn1) {
                        um1Var.K1(((fn1) obj).zza());
                        return;
                    } else {
                        um1Var.K1(((Integer) obj).intValue());
                        return;
                    }
                case 14:
                    um1Var.O1(((Integer) obj).intValue());
                    return;
                case 15:
                    um1Var.R1(((Long) obj).longValue());
                    return;
                case 16:
                    int intValue = ((Integer) obj).intValue();
                    um1Var.M1((intValue >> 31) ^ (intValue + intValue));
                    return;
                case 17:
                    long longValue = ((Long) obj).longValue();
                    um1Var.Q1((longValue >> 63) ^ (longValue + longValue));
                    return;
                default:
                    return;
            }
        }
        um1Var.a0(i, 3);
        ((dn1) ((cm1) obj)).u(um1Var);
        um1Var.a0(i, 4);
    }

    public final void a() {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        if (this.f12595b) {
            return;
        }
        qo1 qo1Var = this.f12594a;
        int i = qo1Var.f9918v;
        for (int i10 = 0; i10 < i; i10++) {
            Object obj = qo1Var.a(i10).f10265u;
            if (obj instanceof dn1) {
                dn1 dn1Var = (dn1) obj;
                ho1.f6854c.a(dn1Var.getClass()).d(dn1Var);
                dn1Var.i();
            }
        }
        Iterator it = qo1Var.b().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof dn1) {
                dn1 dn1Var2 = (dn1) value;
                ho1.f6854c.a(dn1Var2.getClass()).d(dn1Var2);
                dn1Var2.i();
            }
        }
        if (!qo1Var.f9920x) {
            if (qo1Var.f9918v <= 0) {
                Iterator it2 = qo1Var.b().iterator();
                if (it2.hasNext()) {
                    ((Map.Entry) it2.next()).getKey().getClass();
                    g5.q.b();
                    return;
                }
            } else {
                qo1Var.a(0).getClass();
                throw null;
            }
        }
        if (!qo1Var.f9920x) {
            if (qo1Var.f9919w.isEmpty()) {
                unmodifiableMap = Collections.EMPTY_MAP;
            } else {
                unmodifiableMap = Collections.unmodifiableMap(qo1Var.f9919w);
            }
            qo1Var.f9919w = unmodifiableMap;
            if (qo1Var.f9922z.isEmpty()) {
                unmodifiableMap2 = Collections.EMPTY_MAP;
            } else {
                unmodifiableMap2 = Collections.unmodifiableMap(qo1Var.f9922z);
            }
            qo1Var.f9922z = unmodifiableMap2;
            qo1Var.f9920x = true;
        }
        this.f12595b = true;
    }

    public final Object clone() {
        xm1 xm1Var = new xm1();
        qo1 qo1Var = this.f12594a;
        if (qo1Var.f9918v <= 0) {
            Iterator it = qo1Var.b().iterator();
            if (!it.hasNext()) {
                return xm1Var;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (entry.getKey() != null) {
                g5.q.b();
                return null;
            }
            entry.getValue();
            throw null;
        }
        qo1Var.a(0).getClass();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xm1)) {
            return false;
        }
        return this.f12594a.equals(((xm1) obj).f12594a);
    }

    public final int hashCode() {
        return this.f12594a.hashCode();
    }

    public xm1() {
    }
}
