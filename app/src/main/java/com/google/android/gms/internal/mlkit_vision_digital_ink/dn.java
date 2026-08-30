package com.google.android.gms.internal.mlkit_vision_digital_ink;
import q.x;
import r0.a;
import r0.c;
import vd.n;
import x.n;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class dn {

    /* renamed from: c, reason: collision with root package name */
    public static final dn f14194c = new dn(0);

    /* renamed from: a, reason: collision with root package name */
    public final to f14195a = new to();

    /* renamed from: b, reason: collision with root package name */
    public boolean f14196b;

    public dn(int i) {
        d();
        d();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    public static int a(gp gpVar, int i, Object obj) {
        int d2;
        int c10;
        int c11 = ym.c(i << 3);
        if (gpVar == gp.f14374x) {
            Charset charset = vn.f15137a;
            c11 += c11;
        }
        hp hpVar = hp.f14431u;
        int i10 = 4;
        switch (gpVar.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                i10 = 8;
                return c11 + i10;
            case 1:
                ((Float) obj).getClass();
                return c11 + i10;
            case 2:
                i10 = ym.d(((Long) obj).longValue());
                return c11 + i10;
            case 3:
                i10 = ym.d(((Long) obj).longValue());
                return c11 + i10;
            case 4:
                i10 = ym.d(((Integer) obj).intValue());
                return c11 + i10;
            case 5:
                ((Long) obj).getClass();
                i10 = 8;
                return c11 + i10;
            case 6:
                ((Integer) obj).getClass();
                return c11 + i10;
            case 7:
                ((Boolean) obj).getClass();
                i10 = 1;
                return c11 + i10;
            case 8:
                if (obj instanceof tm) {
                    d2 = ((tm) obj).d();
                    c10 = ym.c(d2);
                    i10 = c10 + d2;
                    return c11 + i10;
                }
                i10 = ym.b((String) obj);
                return c11 + i10;
            case 9:
                i10 = ((nn) ((km) obj)).e();
                return c11 + i10;
            case 10:
                i10 = ym.a((km) obj);
                return c11 + i10;
            case 11:
                if (obj instanceof tm) {
                    d2 = ((tm) obj).d();
                    c10 = ym.c(d2);
                } else {
                    d2 = ((byte[]) obj).length;
                    c10 = ym.c(d2);
                }
                i10 = c10 + d2;
                return c11 + i10;
            case 12:
                i10 = ym.c(((Integer) obj).intValue());
                return c11 + i10;
            case 13:
                i10 = obj instanceof qn ? ym.d(((qn) obj).zza()) : ym.d(((Integer) obj).intValue());
                return c11 + i10;
            case 14:
                ((Integer) obj).getClass();
                return c11 + i10;
            case 15:
                ((Long) obj).getClass();
                i10 = 8;
                return c11 + i10;
            case 16:
                int intValue = ((Integer) obj).intValue();
                i10 = ym.c((intValue >> 31) ^ (intValue + intValue));
                return c11 + i10;
            case 17:
                long longValue = ((Long) obj).longValue();
                i10 = ym.d((longValue >> 63) ^ (longValue + longValue));
                return c11 + i10;
            default:
                vd.n.b("There is no way to get here, but the compiler thinks otherwise.");
                return 0;
        }
    }

    public static void f(ym ymVar, gp gpVar, int i, Object obj) {
        if (gpVar != gp.f14374x) {
            ymVar.w(i, gpVar.f14378v);
            hp hpVar = hp.f14431u;
            switch (gpVar.ordinal()) {
                case 0:
                    ymVar.o(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                    return;
                case 1:
                    ymVar.m(Float.floatToRawIntBits(((Float) obj).floatValue()));
                    return;
                case 2:
                    ymVar.A(((Long) obj).longValue());
                    return;
                case 3:
                    ymVar.A(((Long) obj).longValue());
                    return;
                case 4:
                    ymVar.q(((Integer) obj).intValue());
                    return;
                case 5:
                    ymVar.o(((Long) obj).longValue());
                    return;
                case 6:
                    ymVar.m(((Integer) obj).intValue());
                    return;
                case 7:
                    ymVar.f(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                    return;
                case 8:
                    if (obj instanceof tm) {
                        ymVar.k((tm) obj);
                        return;
                    } else {
                        ymVar.v((String) obj);
                        return;
                    }
                case 9:
                    ((nn) ((km) obj)).p(ymVar);
                    return;
                case 10:
                    ymVar.r((km) obj);
                    return;
                case 11:
                    if (obj instanceof tm) {
                        ymVar.k((tm) obj);
                        return;
                    } else {
                        byte[] bArr = (byte[]) obj;
                        ymVar.h(bArr, bArr.length);
                        return;
                    }
                case 12:
                    ymVar.y(((Integer) obj).intValue());
                    return;
                case 13:
                    if (obj instanceof qn) {
                        ymVar.q(((qn) obj).zza());
                        return;
                    } else {
                        ymVar.q(((Integer) obj).intValue());
                        return;
                    }
                case 14:
                    ymVar.m(((Integer) obj).intValue());
                    return;
                case 15:
                    ymVar.o(((Long) obj).longValue());
                    return;
                case 16:
                    int intValue = ((Integer) obj).intValue();
                    ymVar.y((intValue >> 31) ^ (intValue + intValue));
                    return;
                case 17:
                    long longValue = ((Long) obj).longValue();
                    ymVar.A((longValue >> 63) ^ (longValue + longValue));
                    return;
                default:
                    return;
            }
        }
        Charset charset = vn.f15137a;
        ymVar.w(i, 3);
        ((nn) ((km) obj)).p(ymVar);
        ymVar.w(i, 4);
    }

    public static boolean i(Map.Entry entry) {
        if (((ln) entry.getKey()).f14605v.f14377u == hp.C) {
            Object value = entry.getValue();
            if (value instanceof ho) {
                return ((ho) value).a();
            }
            q.x.n("Wrong object type used with protocol message reflection.");
            return false;
        }
        return true;
    }

    public static final int j(Map.Entry entry) {
        ln lnVar = (ln) entry.getKey();
        Object value = entry.getValue();
        gp gpVar = lnVar.f14605v;
        if (gpVar.f14377u == hp.C) {
            int i = ((ln) entry.getKey()).f14604u;
            int c10 = ym.c(8);
            int c11 = ym.c(i) + ym.c(16);
            return c10 + c10 + c11 + ym.a((km) value) + ym.c(24);
        }
        return a(gpVar, lnVar.f14604u, value);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final dn clone() {
        dn dnVar = new dn();
        to toVar = this.f14195a;
        int i = toVar.f15015v;
        for (int i10 = 0; i10 < i; i10++) {
            uo c10 = toVar.c(i10);
            dnVar.e((ln) c10.f15065u, c10.f15066v);
        }
        for (Map.Entry entry : toVar.a()) {
            dnVar.e((ln) entry.getKey(), entry.getValue());
        }
        return dnVar;
    }

    public final Iterator c() {
        to toVar = this.f14195a;
        if (toVar.isEmpty()) {
            return Collections.emptyIterator();
        }
        return ((androidx.datastore.preferences.protobuf.h1) toVar.entrySet()).iterator();
    }

    public final void d() {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        if (this.f14196b) {
            return;
        }
        to toVar = this.f14195a;
        int i = toVar.f15015v;
        for (int i10 = 0; i10 < i; i10++) {
            Object obj = toVar.c(i10).f15066v;
            if (obj instanceof nn) {
                ((nn) obj).k();
            }
        }
        Iterator it = toVar.a().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof nn) {
                ((nn) value).k();
            }
        }
        if (!toVar.f15017x) {
            for (int i11 = 0; i11 < toVar.f15015v; i11++) {
                ((ln) toVar.c(i11).f15065u).getClass();
            }
            Iterator it2 = toVar.a().iterator();
            while (it2.hasNext()) {
                ((ln) ((Map.Entry) it2.next()).getKey()).getClass();
            }
        }
        if (!toVar.f15017x) {
            if (toVar.f15016w.isEmpty()) {
                unmodifiableMap = Collections.EMPTY_MAP;
            } else {
                unmodifiableMap = Collections.unmodifiableMap(toVar.f15016w);
            }
            toVar.f15016w = unmodifiableMap;
            if (toVar.f15019z.isEmpty()) {
                unmodifiableMap2 = Collections.EMPTY_MAP;
            } else {
                unmodifiableMap2 = Collections.unmodifiableMap(toVar.f15019z);
            }
            toVar.f15019z = unmodifiableMap2;
            toVar.f15017x = true;
        }
        this.f14196b = true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if ((r4 instanceof com.google.android.gms.internal.mlkit_vision_digital_ink.qn) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        if ((r4 instanceof byte[]) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        if (r1 == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
    
        if ((r4 instanceof com.google.android.gms.internal.mlkit_vision_digital_ink.km) != false) goto L25;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0014. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(com.google.android.gms.internal.mlkit_vision_digital_ink.ln r3, java.lang.Object r4) {
        /*
            r2 = this;
            r3.getClass()
            com.google.android.gms.internal.mlkit_vision_digital_ink.gp r0 = r3.f14605v
            java.nio.charset.Charset r1 = com.google.android.gms.internal.mlkit_vision_digital_ink.vn.f15137a
            r4.getClass()
            com.google.android.gms.internal.mlkit_vision_digital_ink.gp r1 = com.google.android.gms.internal.mlkit_vision_digital_ink.gp.f14373w
            com.google.android.gms.internal.mlkit_vision_digital_ink.hp r1 = com.google.android.gms.internal.mlkit_vision_digital_ink.hp.f14431u
            com.google.android.gms.internal.mlkit_vision_digital_ink.hp r1 = r0.f14377u
            int r1 = r1.ordinal()
            switch(r1) {
                case 0: goto L3e;
                case 1: goto L3b;
                case 2: goto L38;
                case 3: goto L35;
                case 4: goto L32;
                case 5: goto L2f;
                case 6: goto L26;
                case 7: goto L1d;
                case 8: goto L18;
                default: goto L17;
            }
        L17:
            goto L48
        L18:
            boolean r1 = r4 instanceof com.google.android.gms.internal.mlkit_vision_digital_ink.km
            if (r1 == 0) goto L48
            goto L42
        L1d:
            boolean r1 = r4 instanceof java.lang.Integer
            if (r1 != 0) goto L42
            boolean r1 = r4 instanceof com.google.android.gms.internal.mlkit_vision_digital_ink.qn
            if (r1 == 0) goto L48
            goto L42
        L26:
            boolean r1 = r4 instanceof com.google.android.gms.internal.mlkit_vision_digital_ink.tm
            if (r1 != 0) goto L42
            boolean r1 = r4 instanceof byte[]
            if (r1 == 0) goto L48
            goto L42
        L2f:
            boolean r1 = r4 instanceof java.lang.String
            goto L40
        L32:
            boolean r1 = r4 instanceof java.lang.Boolean
            goto L40
        L35:
            boolean r1 = r4 instanceof java.lang.Double
            goto L40
        L38:
            boolean r1 = r4 instanceof java.lang.Float
            goto L40
        L3b:
            boolean r1 = r4 instanceof java.lang.Long
            goto L40
        L3e:
            boolean r1 = r4 instanceof java.lang.Integer
        L40:
            if (r1 == 0) goto L48
        L42:
            com.google.android.gms.internal.mlkit_vision_digital_ink.to r0 = r2.f14195a
            r0.put(r3, r4)
            return
        L48:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            int r3 = r3.f14604u
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.google.android.gms.internal.mlkit_vision_digital_ink.hp r0 = r0.f14377u
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r0, r4}
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            r1.<init>(r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_digital_ink.dn.e(com.google.android.gms.internal.mlkit_vision_digital_ink.ln, java.lang.Object):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dn)) {
            return false;
        }
        return this.f14195a.equals(((dn) obj).f14195a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0030, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g() {
        /*
            r5 = this;
            com.google.android.gms.internal.mlkit_vision_digital_ink.to r0 = r5.f14195a
            int r1 = r0.f15015v
            r2 = 0
            r3 = r2
        L6:
            if (r3 >= r1) goto L16
            com.google.android.gms.internal.mlkit_vision_digital_ink.uo r4 = r0.c(r3)
            boolean r4 = i(r4)
            if (r4 != 0) goto L13
            goto L30
        L13:
            int r3 = r3 + 1
            goto L6
        L16:
            java.util.Set r0 = r0.a()
            java.util.Iterator r0 = r0.iterator()
        L1e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L31
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            boolean r1 = i(r1)
            if (r1 != 0) goto L1e
        L30:
            return r2
        L31:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_digital_ink.dn.g():boolean");
    }

    public final void h(Map.Entry entry) {
        ln lnVar = (ln) entry.getKey();
        Object value = entry.getValue();
        lnVar.getClass();
        hp hpVar = lnVar.f14605v.f14377u;
        hp hpVar2 = hp.C;
        to toVar = this.f14195a;
        if (hpVar == hpVar2) {
            Object obj = toVar.get(lnVar);
            if (obj == null) {
                if (value instanceof byte[]) {
                    byte[] bArr = (byte[]) value;
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    System.arraycopy(bArr, 0, bArr2, 0, length);
                    value = bArr2;
                }
                toVar.put(lnVar, value);
                return;
            }
            if (obj instanceof km) {
                nn nnVar = (nn) ((km) obj);
                hn hnVar = (hn) nnVar.q(5, null);
                hnVar.h(nnVar);
                hnVar.h((nn) value);
                toVar.put(lnVar, hnVar.i());
                return;
            }
            ((hn) obj).h((nn) value);
            return;
        }
        if (value instanceof byte[]) {
            byte[] bArr3 = (byte[]) value;
            int length2 = bArr3.length;
            byte[] bArr4 = new byte[length2];
            System.arraycopy(bArr3, 0, bArr4, 0, length2);
            value = bArr4;
        }
        toVar.put(lnVar, value);
    }

    public final int hashCode() {
        return this.f14195a.hashCode();
    }

    public dn() {
    }
}
