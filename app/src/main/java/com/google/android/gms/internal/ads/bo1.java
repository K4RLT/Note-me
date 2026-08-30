package com.google.android.gms.internal.ads;
import a5.a;
import g3.a;
import l4.a;
import n.b;
import q.x;
import vd.n;

import androidx.ink.brush.color.colorspace.ColorSpace;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class bo1 implements oo1 {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f4848k = new int[0];

    /* renamed from: l, reason: collision with root package name */
    public static final Unsafe f4849l = zo1.h();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f4850a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f4851b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4852c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4853d;
    public final cm1 e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f4854f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f4855g;

    /* renamed from: h, reason: collision with root package name */
    public final int f4856h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final s6 f4857j;

    public bo1(int[] iArr, Object[] objArr, int i, int i10, cm1 cm1Var, int[] iArr2, int i11, int i12, s6 s6Var, ck1 ck1Var) {
        this.f4850a = iArr;
        this.f4851b = objArr;
        this.f4852c = i;
        this.f4853d = i10;
        this.f4854f = cm1Var instanceof dn1;
        this.f4855g = iArr2;
        this.f4856h = i11;
        this.i = i12;
        this.f4857j = s6Var;
        this.e = cm1Var;
    }

    public static int b(int i) {
        return (i >>> 20) & 255;
    }

    public static boolean l(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof dn1) {
            return ((dn1) obj).h();
        }
        return true;
    }

    public static void m(Object obj) {
        if (l(obj)) {
            return;
        }
        q.x.n("Mutating immutable message: ".concat(String.valueOf(obj)));
    }

    public static int n(long j10, Object obj) {
        return ((Integer) zo1.f(j10, obj)).intValue();
    }

    public static long o(long j10, Object obj) {
        return ((Long) zo1.f(j10, obj)).longValue();
    }

    public static final int w(byte[] bArr, int i, int i10, dp1 dp1Var, Class cls, fm1 fm1Var) {
        dp1 dp1Var2 = dp1.f5474w;
        boolean z3 = false;
        switch (dp1Var.ordinal()) {
            case 0:
                int i11 = i + 8;
                fm1Var.f6125c = Double.valueOf(Double.longBitsToDouble(gm1.f(bArr, i)));
                return i11;
            case 1:
                int i12 = i + 4;
                fm1Var.f6125c = Float.valueOf(Float.intBitsToFloat(gm1.e(bArr, i)));
                return i12;
            case 2:
            case 3:
                int c10 = gm1.c(bArr, i, fm1Var);
                fm1Var.f6125c = Long.valueOf(fm1Var.f6124b);
                return c10;
            case 4:
            case 12:
            case 13:
                int a10 = gm1.a(bArr, i, fm1Var);
                fm1Var.f6125c = Integer.valueOf(fm1Var.f6123a);
                return a10;
            case 5:
            case 15:
                int i13 = i + 8;
                fm1Var.f6125c = Long.valueOf(gm1.f(bArr, i));
                return i13;
            case 6:
            case 14:
                int i14 = i + 4;
                fm1Var.f6125c = Integer.valueOf(gm1.e(bArr, i));
                return i14;
            case 7:
                int c11 = gm1.c(bArr, i, fm1Var);
                if (fm1Var.f6124b != 0) {
                    z3 = true;
                }
                fm1Var.f6125c = Boolean.valueOf(z3);
                return c11;
            case 8:
                return gm1.g(bArr, i, fm1Var);
            case 9:
            default:
                vd.n.b("unsupported field type.");
                return 0;
            case 10:
                oo1 a11 = ho1.f6854c.a(cls);
                dn1 zza = a11.zza();
                int i15 = gm1.i(zza, a11, bArr, i, i10, fm1Var);
                a11.d(zza);
                fm1Var.f6125c = zza;
                return i15;
            case 11:
                return gm1.h(bArr, i, fm1Var);
            case 16:
                int a12 = gm1.a(bArr, i, fm1Var);
                fm1Var.f6125c = Integer.valueOf(rm1.n(fm1Var.f6123a));
                return a12;
            case 17:
                int c12 = gm1.c(bArr, i, fm1Var);
                fm1Var.f6125c = Long.valueOf(rm1.o(fm1Var.f6124b));
                return c12;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x03cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.bo1 y(com.google.android.gms.internal.ads.jo1 r36, com.google.android.gms.internal.ads.s6 r37, com.google.android.gms.internal.ads.ck1 r38) {
        /*
            Method dump skipped, instructions count: 1049
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bo1.y(com.google.android.gms.internal.ads.jo1, com.google.android.gms.internal.ads.s6, com.google.android.gms.internal.ads.ck1):com.google.android.gms.internal.ads.bo1");
    }

    public static Field z(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 11 + name.length() + 29 + String.valueOf(arrays).length());
            g3.a.t(sb2, "Field ", str, " for ", name);
            l4.a.k(a5.a.k(sb2, " not found. Known fields are ", arrays), e);
            return null;
        }
    }

    public final void A(Object obj, int i, Object obj2) {
        if (!r(i, obj2)) {
            return;
        }
        int a10 = a(i) & 1048575;
        Unsafe unsafe = f4849l;
        long j10 = a10;
        Object object = unsafe.getObject(obj2, j10);
        if (object != null) {
            oo1 C = C(i);
            if (!r(i, obj)) {
                if (!l(object)) {
                    unsafe.putObject(obj, j10, object);
                } else {
                    dn1 zza = C.zza();
                    C.e(zza, object);
                    unsafe.putObject(obj, j10, zza);
                }
                s(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!l(object2)) {
                dn1 zza2 = C.zza();
                C.e(zza2, object2);
                unsafe.putObject(obj, j10, zza2);
                object2 = zza2;
            }
            C.e(object2, object);
            return;
        }
        int i10 = this.f4850a[i];
        String obj3 = obj2.toString();
        StringBuilder sb2 = new StringBuilder(g3.a.d(i10, 38) + obj3.length());
        sb2.append("Source subfield ");
        sb2.append(i10);
        sb2.append(" is present but null: ");
        sb2.append(obj3);
        throw new IllegalStateException(sb2.toString());
    }

    public final void B(Object obj, int i, Object obj2) {
        int[] iArr = this.f4850a;
        int i10 = iArr[i];
        if (!t(i10, obj2, i)) {
            return;
        }
        int a10 = a(i) & 1048575;
        Unsafe unsafe = f4849l;
        long j10 = a10;
        Object object = unsafe.getObject(obj2, j10);
        if (object != null) {
            oo1 C = C(i);
            if (!t(i10, obj, i)) {
                if (!l(object)) {
                    unsafe.putObject(obj, j10, object);
                } else {
                    dn1 zza = C.zza();
                    C.e(zza, object);
                    unsafe.putObject(obj, j10, zza);
                }
                u(i10, obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!l(object2)) {
                dn1 zza2 = C.zza();
                C.e(zza2, object2);
                unsafe.putObject(obj, j10, zza2);
                object2 = zza2;
            }
            C.e(object2, object);
            return;
        }
        int i11 = iArr[i];
        String obj3 = obj2.toString();
        StringBuilder sb2 = new StringBuilder(g3.a.d(i11, 38) + obj3.length());
        sb2.append("Source subfield ");
        sb2.append(i11);
        sb2.append(" is present but null: ");
        sb2.append(obj3);
        throw new IllegalStateException(sb2.toString());
    }

    public final oo1 C(int i) {
        int i10 = i / 3;
        int i11 = i10 + i10;
        Object[] objArr = this.f4851b;
        oo1 oo1Var = (oo1) objArr[i11];
        if (oo1Var != null) {
            return oo1Var;
        }
        oo1 a10 = ho1.f6854c.a((Class) objArr[i11 + 1]);
        objArr[i11] = a10;
        return a10;
    }

    public final Object D(int i) {
        int i10 = i / 3;
        return this.f4851b[i10 + i10];
    }

    public final gn1 E(int i) {
        int i10 = i / 3;
        return (gn1) this.f4851b[i10 + i10 + 1];
    }

    public final Object F(int i, Object obj) {
        oo1 C = C(i);
        int a10 = a(i) & 1048575;
        if (!r(i, obj)) {
            return C.zza();
        }
        Object object = f4849l.getObject(obj, a10);
        if (l(object)) {
            return object;
        }
        dn1 zza = C.zza();
        if (object != null) {
            C.e(zza, object);
        }
        return zza;
    }

    public final void G(Object obj, int i, Object obj2) {
        f4849l.putObject(obj, a(i) & 1048575, obj2);
        s(i, obj);
    }

    public final Object H(int i, Object obj, int i10) {
        oo1 C = C(i10);
        if (!t(i, obj, i10)) {
            return C.zza();
        }
        Object object = f4849l.getObject(obj, a(i10) & 1048575);
        if (l(object)) {
            return object;
        }
        dn1 zza = C.zza();
        if (object != null) {
            C.e(zza, object);
        }
        return zza;
    }

    public final void I(int i, int i10, Object obj, Object obj2) {
        f4849l.putObject(obj, a(i10) & 1048575, obj2);
        u(i, obj, i10);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x0080. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x01ad. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01b0 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J(int r24, java.lang.Object r25, java.lang.Object r26, java.lang.Object r27) {
        /*
            Method dump skipped, instructions count: 826
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bo1.J(int, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final void K(int i, androidx.datastore.preferences.protobuf.i iVar, Object obj) {
        boolean z3;
        rm1 rm1Var = (rm1) iVar.f737y;
        if ((536870912 & i) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        long j10 = i & 1048575;
        if (z3) {
            iVar.G0(2);
            zo1.g(obj, j10, rm1Var.K());
        } else if (this.f4854f) {
            iVar.G0(2);
            zo1.g(obj, j10, rm1Var.I());
        } else {
            zo1.g(obj, j10, iVar.d1());
        }
    }

    public final int a(int i) {
        return this.f4850a[i + 1];
    }

    @Override // com.google.android.gms.internal.ads.oo1
    public final boolean c(Object obj) {
        int i;
        int i10;
        int i11 = 0;
        int i12 = 0;
        int i13 = 1048575;
        while (i11 < this.f4856h) {
            int i14 = this.f4855g[i11];
            int a10 = a(i14);
            int[] iArr = this.f4850a;
            int i15 = iArr[i14 + 2];
            int i16 = i15 & 1048575;
            int i17 = 1 << (i15 >>> 20);
            if (i16 != i13) {
                if (i16 != 1048575) {
                    i12 = f4849l.getInt(obj, i16);
                }
                i10 = i12;
                i = i16;
            } else {
                i = i13;
                i10 = i12;
            }
            Object obj2 = obj;
            if ((268435456 & a10) == 0 || q(obj2, i14, i, i10, i17)) {
                int b10 = b(a10);
                if (b10 != 9 && b10 != 17) {
                    if (b10 != 27) {
                        if (b10 != 60 && b10 != 68) {
                            if (b10 != 49) {
                                if (b10 != 50) {
                                    continue;
                                } else {
                                    xn1 xn1Var = (xn1) zo1.f(a10 & 1048575, obj2);
                                    if (!xn1Var.isEmpty() && ((dp1) ((wn1) D(i14)).f12310a.f13143w).f5478u == ep1.C) {
                                        oo1 oo1Var = null;
                                        for (Object obj3 : xn1Var.values()) {
                                            if (oo1Var == null) {
                                                oo1Var = ho1.f6854c.a(obj3.getClass());
                                            }
                                            if (!oo1Var.c(obj3)) {
                                            }
                                        }
                                    }
                                }
                                i11++;
                                obj = obj2;
                                i13 = i;
                                i12 = i10;
                            }
                        } else {
                            if (t(iArr[i14], obj2, i14) && !C(i14).c(zo1.f(a10 & 1048575, obj2))) {
                            }
                            i11++;
                            obj = obj2;
                            i13 = i;
                            i12 = i10;
                        }
                    }
                    List list = (List) zo1.f(a10 & 1048575, obj2);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        oo1 C = C(i14);
                        for (int i18 = 0; i18 < list.size(); i18++) {
                            if (C.c(list.get(i18))) {
                            }
                        }
                    }
                    i11++;
                    obj = obj2;
                    i13 = i;
                    i12 = i10;
                } else {
                    if (q(obj2, i14, i, i10, i17) && !C(i14).c(zo1.f(a10 & 1048575, obj2))) {
                    }
                    i11++;
                    obj = obj2;
                    i13 = i;
                    i12 = i10;
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.oo1
    public final void d(Object obj) {
        if (l(obj)) {
            if (obj instanceof dn1) {
                dn1 dn1Var = (dn1) obj;
                dn1Var.g(Integer.MAX_VALUE);
                dn1Var.zzq = 0;
                dn1Var.i();
            }
            int i = 0;
            while (true) {
                int[] iArr = this.f4850a;
                if (i < iArr.length) {
                    int a10 = a(i);
                    int i10 = 1048575 & a10;
                    int b10 = b(a10);
                    long j10 = i10;
                    if (b10 != 9) {
                        if (b10 != 60 && b10 != 68) {
                            switch (b10) {
                                case 18:
                                case 19:
                                case 20:
                                case gl.zzm /* 21 */:
                                case 22:
                                case 23:
                                case 24:
                                case 25:
                                case 26:
                                case 27:
                                case 28:
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                case 33:
                                case 34:
                                case 35:
                                case 36:
                                case 37:
                                case 38:
                                case 39:
                                case 40:
                                case 41:
                                case 42:
                                case 43:
                                case 44:
                                case 45:
                                case 46:
                                case 47:
                                case 48:
                                case 49:
                                    dm1 dm1Var = (dm1) ((kn1) zo1.f(j10, obj));
                                    if (!dm1Var.f5462u) {
                                        break;
                                    } else {
                                        dm1Var.f5462u = false;
                                        break;
                                    }
                                case 50:
                                    Unsafe unsafe = f4849l;
                                    Object object = unsafe.getObject(obj, j10);
                                    if (object == null) {
                                        break;
                                    } else {
                                        ((xn1) object).f12599u = false;
                                        unsafe.putObject(obj, j10, object);
                                        break;
                                    }
                            }
                        } else if (t(iArr[i], obj, i)) {
                            C(i).d(f4849l.getObject(obj, j10));
                        }
                        i += 3;
                    }
                    if (r(i, obj)) {
                        C(i).d(f4849l.getObject(obj, j10));
                    }
                    i += 3;
                } else {
                    vo1 vo1Var = ((dn1) obj).zzt;
                    if (vo1Var.e) {
                        vo1Var.e = false;
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.oo1
    public final void e(Object obj, Object obj2) {
        Object obj3;
        m(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.f4850a;
            if (i < iArr.length) {
                int a10 = a(i);
                int i10 = 1048575 & a10;
                int b10 = b(a10);
                int i11 = iArr[i];
                long j10 = i10;
                switch (b10) {
                    case 0:
                        if (r(i, obj2)) {
                            um1 um1Var = zo1.f13221c;
                            obj3 = obj;
                            um1Var.v1(obj3, j10, um1Var.r1(j10, obj2));
                            s(i, obj3);
                            break;
                        }
                        break;
                    case 1:
                        if (r(i, obj2)) {
                            um1 um1Var2 = zo1.f13221c;
                            um1Var2.g0(obj, j10, um1Var2.c0(j10, obj2));
                            s(i, obj);
                            break;
                        }
                        break;
                    case 2:
                        if (r(i, obj2)) {
                            zo1.e(j10, obj, zo1.d(j10, obj2));
                            s(i, obj);
                            break;
                        }
                        break;
                    case 3:
                        if (r(i, obj2)) {
                            zo1.e(j10, obj, zo1.d(j10, obj2));
                            s(i, obj);
                            break;
                        }
                        break;
                    case 4:
                        if (r(i, obj2)) {
                            zo1.c(j10, obj, zo1.b(j10, obj2));
                            s(i, obj);
                            break;
                        }
                        break;
                    case 5:
                        if (r(i, obj2)) {
                            zo1.e(j10, obj, zo1.d(j10, obj2));
                            s(i, obj);
                            break;
                        }
                        break;
                    case 6:
                        if (r(i, obj2)) {
                            zo1.c(j10, obj, zo1.b(j10, obj2));
                            s(i, obj);
                            break;
                        }
                        break;
                    case 7:
                        if (r(i, obj2)) {
                            um1 um1Var3 = zo1.f13221c;
                            um1Var3.b0(obj, j10, um1Var3.Y(j10, obj2));
                            s(i, obj);
                            break;
                        }
                        break;
                    case 8:
                        if (r(i, obj2)) {
                            zo1.g(obj, j10, zo1.f(j10, obj2));
                            s(i, obj);
                            break;
                        }
                        break;
                    case 9:
                        A(obj, i, obj2);
                        break;
                    case 10:
                        if (r(i, obj2)) {
                            zo1.g(obj, j10, zo1.f(j10, obj2));
                            s(i, obj);
                            break;
                        }
                        break;
                    case 11:
                        if (r(i, obj2)) {
                            zo1.c(j10, obj, zo1.b(j10, obj2));
                            s(i, obj);
                            break;
                        }
                        break;
                    case 12:
                        if (r(i, obj2)) {
                            zo1.c(j10, obj, zo1.b(j10, obj2));
                            s(i, obj);
                            break;
                        }
                        break;
                    case 13:
                        if (r(i, obj2)) {
                            zo1.c(j10, obj, zo1.b(j10, obj2));
                            s(i, obj);
                            break;
                        }
                        break;
                    case 14:
                        if (r(i, obj2)) {
                            zo1.e(j10, obj, zo1.d(j10, obj2));
                            s(i, obj);
                            break;
                        }
                        break;
                    case 15:
                        if (r(i, obj2)) {
                            zo1.c(j10, obj, zo1.b(j10, obj2));
                            s(i, obj);
                            break;
                        }
                        break;
                    case 16:
                        if (r(i, obj2)) {
                            zo1.e(j10, obj, zo1.d(j10, obj2));
                            s(i, obj);
                            break;
                        }
                        break;
                    case 17:
                        A(obj, i, obj2);
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case gl.zzm /* 21 */:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        kn1 kn1Var = (kn1) zo1.f(j10, obj);
                        kn1 kn1Var2 = (kn1) zo1.f(j10, obj2);
                        int size = kn1Var.size();
                        int size2 = kn1Var2.size();
                        if (size > 0 && size2 > 0) {
                            if (!((dm1) kn1Var).f5462u) {
                                kn1Var = kn1Var.B(size2 + size);
                            }
                            kn1Var.addAll(kn1Var2);
                        }
                        if (size > 0) {
                            kn1Var2 = kn1Var;
                        }
                        zo1.g(obj, j10, kn1Var2);
                        break;
                    case 50:
                        s6 s6Var = po1.f9572a;
                        zo1.g(obj, j10, tn1.d(zo1.f(j10, obj), zo1.f(j10, obj2)));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        if (t(i11, obj2, i)) {
                            zo1.g(obj, j10, zo1.f(j10, obj2));
                            u(i11, obj, i);
                            break;
                        }
                        break;
                    case 60:
                        B(obj, i, obj2);
                        break;
                    case 61:
                    case 62:
                    case ColorSpace.MAX_ID /* 63 */:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (t(i11, obj2, i)) {
                            zo1.g(obj, j10, zo1.f(j10, obj2));
                            u(i11, obj, i);
                            break;
                        }
                        break;
                    case 68:
                        B(obj, i, obj2);
                        break;
                }
                obj3 = obj;
                i += 3;
                obj = obj3;
            } else {
                po1.d(obj, obj2);
                return;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x006e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:40:0x05fb A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.oo1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(java.lang.Object r19, androidx.datastore.preferences.protobuf.i r20, com.google.android.gms.internal.ads.wm1 r21) {
        /*
            Method dump skipped, instructions count: 1702
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bo1.f(java.lang.Object, androidx.datastore.preferences.protobuf.i, com.google.android.gms.internal.ads.wm1):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0041. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:84:0x022d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:91:0x0363. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0366 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x038d  */
    @Override // com.google.android.gms.internal.ads.oo1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(java.lang.Object r27, com.google.android.gms.internal.ads.lt0 r28) {
        /*
            Method dump skipped, instructions count: 2554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bo1.g(java.lang.Object, com.google.android.gms.internal.ads.lt0):void");
    }

    @Override // com.google.android.gms.internal.ads.oo1
    public final void h(Object obj, byte[] bArr, int i, int i10, fm1 fm1Var) {
        x(obj, bArr, i, i10, 0, fm1Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:153:0x01d1, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x001e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:24:0x021d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01d1 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.oo1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(com.google.android.gms.internal.ads.dn1 r10, com.google.android.gms.internal.ads.dn1 r11) {
        /*
            Method dump skipped, instructions count: 686
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bo1.i(com.google.android.gms.internal.ads.dn1, com.google.android.gms.internal.ads.dn1):boolean");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:125:0x0254. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:132:0x038c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x004e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x038f A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.oo1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int j(com.google.android.gms.internal.ads.dn1 r30) {
        /*
            Method dump skipped, instructions count: 2922
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bo1.j(com.google.android.gms.internal.ads.dn1):int");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x0021. Please report as an issue. */
    @Override // com.google.android.gms.internal.ads.oo1
    public final int k(dn1 dn1Var) {
        int i;
        long doubleToLongBits;
        int i10;
        int floatToIntBits;
        int i11;
        int i12;
        int i13 = 0;
        for (int i14 = 0; i14 < this.f4850a.length; i14 += 3) {
            int a10 = a(i14);
            int b10 = b(a10);
            if (b10 <= 50 || b10 >= 69) {
                long j10 = a10 & 1048575;
                int i15 = 37;
                switch (b10) {
                    case 0:
                        i = i13 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zo1.f13221c.r1(j10, dn1Var));
                        byte[] bArr = ln1.f8074a;
                        i11 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i13 = i + i11;
                        break;
                    case 1:
                        i10 = i13 * 53;
                        floatToIntBits = Float.floatToIntBits(zo1.f13221c.c0(j10, dn1Var));
                        i13 = i10 + floatToIntBits;
                        break;
                    case 2:
                        i = i13 * 53;
                        doubleToLongBits = zo1.d(j10, dn1Var);
                        byte[] bArr2 = ln1.f8074a;
                        i11 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i13 = i + i11;
                        break;
                    case 3:
                        i = i13 * 53;
                        doubleToLongBits = zo1.d(j10, dn1Var);
                        byte[] bArr3 = ln1.f8074a;
                        i11 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i13 = i + i11;
                        break;
                    case 4:
                        i10 = i13 * 53;
                        floatToIntBits = zo1.b(j10, dn1Var);
                        i13 = i10 + floatToIntBits;
                        break;
                    case 5:
                        i = i13 * 53;
                        doubleToLongBits = zo1.d(j10, dn1Var);
                        byte[] bArr4 = ln1.f8074a;
                        i11 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i13 = i + i11;
                        break;
                    case 6:
                        i10 = i13 * 53;
                        floatToIntBits = zo1.b(j10, dn1Var);
                        i13 = i10 + floatToIntBits;
                        break;
                    case 7:
                        i = i13 * 53;
                        boolean Y = zo1.f13221c.Y(j10, dn1Var);
                        byte[] bArr5 = ln1.f8074a;
                        if (Y) {
                            i11 = 1231;
                        } else {
                            i11 = 1237;
                        }
                        i13 = i + i11;
                        break;
                    case 8:
                        i10 = i13 * 53;
                        floatToIntBits = ((String) zo1.f(j10, dn1Var)).hashCode();
                        i13 = i10 + floatToIntBits;
                        break;
                    case 9:
                        i12 = i13 * 53;
                        Object f10 = zo1.f(j10, dn1Var);
                        if (f10 != null) {
                            i15 = f10.hashCode();
                        }
                        i13 = i12 + i15;
                        break;
                    case 10:
                        i10 = i13 * 53;
                        floatToIntBits = zo1.f(j10, dn1Var).hashCode();
                        i13 = i10 + floatToIntBits;
                        break;
                    case 11:
                        i10 = i13 * 53;
                        floatToIntBits = zo1.b(j10, dn1Var);
                        i13 = i10 + floatToIntBits;
                        break;
                    case 12:
                        i10 = i13 * 53;
                        floatToIntBits = zo1.b(j10, dn1Var);
                        i13 = i10 + floatToIntBits;
                        break;
                    case 13:
                        i10 = i13 * 53;
                        floatToIntBits = zo1.b(j10, dn1Var);
                        i13 = i10 + floatToIntBits;
                        break;
                    case 14:
                        i = i13 * 53;
                        doubleToLongBits = zo1.d(j10, dn1Var);
                        byte[] bArr6 = ln1.f8074a;
                        i11 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i13 = i + i11;
                        break;
                    case 15:
                        i10 = i13 * 53;
                        floatToIntBits = zo1.b(j10, dn1Var);
                        i13 = i10 + floatToIntBits;
                        break;
                    case 16:
                        i = i13 * 53;
                        doubleToLongBits = zo1.d(j10, dn1Var);
                        byte[] bArr7 = ln1.f8074a;
                        i11 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i13 = i + i11;
                        break;
                    case 17:
                        i12 = i13 * 53;
                        Object f11 = zo1.f(j10, dn1Var);
                        if (f11 != null) {
                            i15 = f11.hashCode();
                        }
                        i13 = i12 + i15;
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case gl.zzm /* 21 */:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        i10 = i13 * 53;
                        floatToIntBits = zo1.f(j10, dn1Var).hashCode();
                        i13 = i10 + floatToIntBits;
                        break;
                    case 50:
                        i10 = i13 * 53;
                        floatToIntBits = zo1.f(j10, dn1Var).hashCode();
                        i13 = i10 + floatToIntBits;
                        break;
                }
            }
        }
        int i16 = this.i;
        while (true) {
            int[] iArr = this.f4855g;
            if (i16 < iArr.length) {
                if (!t(0, dn1Var, iArr[i16])) {
                    i13 = zo1.f(a(r3) & 1048575, dn1Var).hashCode() + (i13 * 53);
                }
                i16++;
            } else {
                return dn1Var.zzt.hashCode() + (i13 * 53);
            }
        }
    }

    public final boolean p(dn1 dn1Var, dn1 dn1Var2, int i) {
        if (r(i, dn1Var) == r(i, dn1Var2)) {
            return true;
        }
        return false;
    }

    public final boolean q(Object obj, int i, int i10, int i11, int i12) {
        if (i10 == 1048575) {
            return r(i, obj);
        }
        if ((i11 & i12) != 0) {
            return true;
        }
        return false;
    }

    public final boolean r(int i, Object obj) {
        int i10 = this.f4850a[i + 2];
        long j10 = i10 & 1048575;
        if (j10 == 1048575) {
            int a10 = a(i);
            long j11 = a10 & 1048575;
            switch (b(a10)) {
                case 0:
                    if (Double.doubleToRawLongBits(zo1.f13221c.r1(j11, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(zo1.f13221c.c0(j11, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (zo1.d(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (zo1.d(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (zo1.b(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (zo1.d(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (zo1.b(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return zo1.f13221c.Y(j11, obj);
                case 8:
                    Object f10 = zo1.f(j11, obj);
                    if (f10 instanceof String) {
                        if (((String) f10).isEmpty()) {
                            return false;
                        }
                    } else if (f10 instanceof om1) {
                        if (om1.f9167v.equals(f10)) {
                            return false;
                        }
                    } else {
                        q.x.m();
                        return false;
                    }
                    break;
                case 9:
                    if (zo1.f(j11, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (om1.f9167v.equals(zo1.f(j11, obj))) {
                        return false;
                    }
                    break;
                case 11:
                    if (zo1.b(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (zo1.b(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (zo1.b(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (zo1.d(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (zo1.b(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (zo1.d(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (zo1.f(j11, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    q.x.m();
                    return false;
            }
        } else if (((1 << (i10 >>> 20)) & zo1.b(j10, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final void s(int i, Object obj) {
        int i10 = this.f4850a[i + 2];
        long j10 = 1048575 & i10;
        if (j10 == 1048575) {
            return;
        }
        zo1.c(j10, obj, (1 << (i10 >>> 20)) | zo1.b(j10, obj));
    }

    public final boolean t(int i, Object obj, int i10) {
        if (zo1.b(this.f4850a[i10 + 2] & 1048575, obj) == i) {
            return true;
        }
        return false;
    }

    public final void u(int i, Object obj, int i10) {
        zo1.c(this.f4850a[i10 + 2] & 1048575, obj, i);
    }

    public final int v(int i, int i10) {
        int[] iArr = this.f4850a;
        int length = (iArr.length / 3) - 1;
        while (i10 <= length) {
            int i11 = (length + i10) >>> 1;
            int i12 = i11 * 3;
            int i13 = iArr[i12];
            if (i == i13) {
                return i12;
            }
            if (i < i13) {
                length = i11 - 1;
            } else {
                i10 = i11 + 1;
            }
        }
        return -1;
    }

    /*  JADX ERROR: Type inference failed
//         jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final int x(java.lang.Object r37, byte[] r38, int r39, int r40, int r41, com.google.android.gms.internal.ads.fm1 r42) {
        /*
            Method dump skipped, instructions count: 3920
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bo1.x(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.fm1):int");
    }

    @Override // com.google.android.gms.internal.ads.oo1
    public final dn1 zza() {
        return ((dn1) this.e).p();
    }
}
