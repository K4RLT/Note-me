package com.google.android.gms.internal.play_billing;
import i1.o;
import i1.p;
import j2.f;
import j2.i;
import j2.t;
import j2.u;
import p.a;
import q.b;
import q.x;
import q2.a;
import q2.b;
import q2.c;
import q2.d;
import q2.e;
import q2.g;
import q2.h;
import q2.i;
import q2.j;
import q2.k;
import q2.l;
import q2.m;
import q2.n;
import q2.o;
import q2.p;
import q2.q;
import q2.r;
import q2.s;
import q2.t;
import q2.u;
import q2.v;
import q2.w;
import q2.x;
import q2.y;
import x.m;
import x.n;
import x2.e;
import x2.f;
import x2.h;
import x2.i;
import x2.j;
import x2.k;
import x2.l;
import z2.a;
import z2.b;

import androidx.ink.brush.color.colorspace.ColorSpace;
import com.google.android.gms.internal.ads.fm1;
import com.google.android.gms.internal.ads.gl;
import com.google.android.gms.internal.ads.wd0;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class j2 implements p2 {

    /* renamed from: j, reason: collision with root package name */
    public static final int[] f15460j = new int[0];

    /* renamed from: k, reason: collision with root package name */
    public static final Unsafe f15461k = x2.i();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f15462a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f15463b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15464c;

    /* renamed from: d, reason: collision with root package name */
    public final int f15465d;
    public final b1 e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f15466f;

    /* renamed from: g, reason: collision with root package name */
    public final int f15467g;

    /* renamed from: h, reason: collision with root package name */
    public final int f15468h;
    public final p1 i;

    public j2(int[] iArr, Object[] objArr, int i, int i10, b1 b1Var, int[] iArr2, int i11, int i12, p1 p1Var, p1 p1Var2) {
        this.f15462a = iArr;
        this.f15463b = objArr;
        this.f15464c = i;
        this.f15465d = i10;
        this.f15466f = iArr2;
        this.f15467g = i11;
        this.f15468h = i12;
        this.i = p1Var;
        this.e = b1Var;
    }

    public static Field E(Class cls, String str) {
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
            StringBuilder q10 = p.a.q("Field ", str, " for ", name, " not found. Known fields are ");
            q10.append(arrays);
            throw new RuntimeException(q10.toString(), e);
        }
    }

    public static boolean r(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof r1) {
            return ((r1) obj).h();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.play_billing.j2 u(com.google.android.gms.internal.play_billing.o2 r36, com.google.android.gms.internal.play_billing.p1 r37, com.google.android.gms.internal.play_billing.p1 r38) {
        /*
            Method dump skipped, instructions count: 1075
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.j2.u(com.google.android.gms.internal.play_billing.o2, com.google.android.gms.internal.play_billing.p1, com.google.android.gms.internal.play_billing.p1):com.google.android.gms.internal.play_billing.j2");
    }

    public static int v(long j10, Object obj) {
        return ((Integer) x2.h(j10, obj)).intValue();
    }

    public static int x(int i) {
        return (i >>> 20) & 255;
    }

    public static long z(long j10, Object obj) {
        return ((Long) x2.h(j10, obj)).longValue();
    }

    public final a1 A(int i) {
        int i10 = i / 3;
        return (a1) this.f15463b[i10 + i10 + 1];
    }

    public final p2 B(int i) {
        int i10 = i / 3;
        int i11 = i10 + i10;
        Object[] objArr = this.f15463b;
        p2 p2Var = (p2) objArr[i11];
        if (p2Var != null) {
            return p2Var;
        }
        p2 a10 = m2.f15489c.a((Class) objArr[i11 + 1]);
        objArr[i11] = a10;
        return a10;
    }

    public final Object C(int i, Object obj) {
        p2 B = B(i);
        int y10 = y(i) & 1048575;
        if (!p(i, obj)) {
            return B.a();
        }
        Object object = f15461k.getObject(obj, y10);
        if (r(object)) {
            return object;
        }
        r1 a10 = B.a();
        if (object != null) {
            B.e(a10, object);
        }
        return a10;
    }

    public final Object D(int i, Object obj, int i10) {
        p2 B = B(i10);
        if (!s(i, obj, i10)) {
            return B.a();
        }
        Object object = f15461k.getObject(obj, y(i10) & 1048575);
        if (r(object)) {
            return object;
        }
        r1 a10 = B.a();
        if (object != null) {
            B.e(a10, object);
        }
        return a10;
    }

    @Override // com.google.android.gms.internal.play_billing.p2
    public final r1 a() {
        return ((r1) this.e).n();
    }

    @Override // com.google.android.gms.internal.play_billing.p2
    public final void b(Object obj) {
        if (r(obj)) {
            if (obj instanceof r1) {
                r1 r1Var = (r1) obj;
                r1Var.g();
                r1Var.zza = 0;
                r1Var.e();
            }
            int i = 0;
            while (true) {
                int[] iArr = this.f15462a;
                if (i < iArr.length) {
                    int y10 = y(i);
                    int i10 = 1048575 & y10;
                    int x9 = x(y10);
                    long j10 = i10;
                    if (x9 != 9) {
                        if (x9 != 60 && x9 != 68) {
                            switch (x9) {
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
                                    c1 c1Var = (c1) ((v1) x2.h(j10, obj));
                                    if (!c1Var.f15394u) {
                                        break;
                                    } else {
                                        c1Var.f15394u = false;
                                        break;
                                    }
                                case 50:
                                    Unsafe unsafe = f15461k;
                                    Object object = unsafe.getObject(obj, j10);
                                    if (object == null) {
                                        break;
                                    } else {
                                        ((e2) object).f15413u = false;
                                        unsafe.putObject(obj, j10, object);
                                        break;
                                    }
                            }
                        } else if (s(iArr[i], obj, i)) {
                            B(i).b(f15461k.getObject(obj, j10));
                        }
                        i += 3;
                    }
                    if (p(i, obj)) {
                        B(i).b(f15461k.getObject(obj, j10));
                    }
                    i += 3;
                } else {
                    this.i.getClass();
                    s2 s2Var = ((r1) obj).zzc;
                    if (s2Var.e) {
                        s2Var.e = false;
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.p2
    public final void c(Object obj, byte[] bArr, int i, int i10, fm1 fm1Var) {
        t(obj, bArr, i, i10, 0, fm1Var);
    }

    @Override // com.google.android.gms.internal.play_billing.p2
    public final boolean d(Object obj) {
        int i;
        int i10;
        int i11;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1048575;
        while (i13 < this.f15467g) {
            int i15 = this.f15466f[i13];
            int[] iArr = this.f15462a;
            int i16 = iArr[i15];
            int y10 = y(i15);
            int i17 = iArr[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i14) {
                if (i18 != 1048575) {
                    i12 = f15461k.getInt(obj, i18);
                }
                i10 = i15;
                i11 = i12;
                i = i18;
            } else {
                int i20 = i12;
                i = i14;
                i10 = i15;
                i11 = i20;
            }
            if ((268435456 & y10) == 0 || q(obj, i10, i, i11, i19)) {
                int x9 = x(y10);
                if (x9 != 9 && x9 != 17) {
                    if (x9 != 27) {
                        if (x9 != 60 && x9 != 68) {
                            if (x9 != 49) {
                                if (x9 == 50 && !((e2) x2.h(y10 & 1048575, obj)).isEmpty()) {
                                    int i21 = i10 / 3;
                                    throw p.a.f(this.f15463b[i21 + i21]);
                                }
                            }
                        } else if (s(i16, obj, i10) && !B(i10).d(x2.h(y10 & 1048575, obj))) {
                        }
                        i13++;
                        i14 = i;
                        i12 = i11;
                    }
                    List list = (List) x2.h(y10 & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        p2 B = B(i10);
                        for (int i22 = 0; i22 < list.size(); i22++) {
                            if (B.d(list.get(i22))) {
                            }
                        }
                    }
                    i13++;
                    i14 = i;
                    i12 = i11;
                } else {
                    if (q(obj, i10, i, i11, i19) && !B(i10).d(x2.h(y10 & 1048575, obj))) {
                    }
                    i13++;
                    i14 = i;
                    i12 = i11;
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.p2
    public final void e(Object obj, Object obj2) {
        Object obj3;
        if (r(obj)) {
            obj2.getClass();
            int i = 0;
            while (true) {
                int[] iArr = this.f15462a;
                if (i < iArr.length) {
                    int y10 = y(i);
                    int i10 = y10 & 1048575;
                    int x9 = x(y10);
                    int i11 = iArr[i];
                    long j10 = i10;
                    switch (x9) {
                        case 0:
                            if (p(i, obj2)) {
                                w2 w2Var = x2.f15547c;
                                obj3 = obj;
                                w2Var.e(obj3, j10, w2Var.a(j10, obj2));
                                l(i, obj3);
                                break;
                            }
                            break;
                        case 1:
                            if (p(i, obj2)) {
                                w2 w2Var2 = x2.f15547c;
                                w2Var2.f(obj, j10, w2Var2.b(j10, obj2));
                                l(i, obj);
                                break;
                            }
                            break;
                        case 2:
                            if (p(i, obj2)) {
                                x2.k(j10, obj, x2.f(j10, obj2));
                                l(i, obj);
                                break;
                            }
                            break;
                        case 3:
                            if (p(i, obj2)) {
                                x2.k(j10, obj, x2.f(j10, obj2));
                                l(i, obj);
                                break;
                            }
                            break;
                        case 4:
                            if (p(i, obj2)) {
                                x2.j(j10, obj, x2.e(j10, obj2));
                                l(i, obj);
                                break;
                            }
                            break;
                        case 5:
                            if (p(i, obj2)) {
                                x2.k(j10, obj, x2.f(j10, obj2));
                                l(i, obj);
                                break;
                            }
                            break;
                        case 6:
                            if (p(i, obj2)) {
                                x2.j(j10, obj, x2.e(j10, obj2));
                                l(i, obj);
                                break;
                            }
                            break;
                        case 7:
                            if (p(i, obj2)) {
                                w2 w2Var3 = x2.f15547c;
                                w2Var3.c(obj, j10, w2Var3.g(j10, obj2));
                                l(i, obj);
                                break;
                            }
                            break;
                        case 8:
                            if (p(i, obj2)) {
                                x2.l(obj, j10, x2.h(j10, obj2));
                                l(i, obj);
                                break;
                            }
                            break;
                        case 9:
                            j(obj, i, obj2);
                            break;
                        case 10:
                            if (p(i, obj2)) {
                                x2.l(obj, j10, x2.h(j10, obj2));
                                l(i, obj);
                                break;
                            }
                            break;
                        case 11:
                            if (p(i, obj2)) {
                                x2.j(j10, obj, x2.e(j10, obj2));
                                l(i, obj);
                                break;
                            }
                            break;
                        case 12:
                            if (p(i, obj2)) {
                                x2.j(j10, obj, x2.e(j10, obj2));
                                l(i, obj);
                                break;
                            }
                            break;
                        case 13:
                            if (p(i, obj2)) {
                                x2.j(j10, obj, x2.e(j10, obj2));
                                l(i, obj);
                                break;
                            }
                            break;
                        case 14:
                            if (p(i, obj2)) {
                                x2.k(j10, obj, x2.f(j10, obj2));
                                l(i, obj);
                                break;
                            }
                            break;
                        case 15:
                            if (p(i, obj2)) {
                                x2.j(j10, obj, x2.e(j10, obj2));
                                l(i, obj);
                                break;
                            }
                            break;
                        case 16:
                            if (p(i, obj2)) {
                                x2.k(j10, obj, x2.f(j10, obj2));
                                l(i, obj);
                                break;
                            }
                            break;
                        case 17:
                            j(obj, i, obj2);
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
                            v1 v1Var = (v1) x2.h(j10, obj);
                            v1 v1Var2 = (v1) x2.h(j10, obj2);
                            int size = v1Var.size();
                            int size2 = v1Var2.size();
                            if (size > 0 && size2 > 0) {
                                if (!((c1) v1Var).f15394u) {
                                    v1Var = v1Var.f(size2 + size);
                                }
                                v1Var.addAll(v1Var2);
                            }
                            if (size > 0) {
                                v1Var2 = v1Var;
                            }
                            x2.l(obj, j10, v1Var2);
                            break;
                        case 50:
                            p1 p1Var = q2.f15517a;
                            x2.l(obj, j10, p1.c(x2.h(j10, obj), x2.h(j10, obj2)));
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
                            if (s(i11, obj2, i)) {
                                x2.l(obj, j10, x2.h(j10, obj2));
                                x2.j(iArr[i + 2] & 1048575, obj, i11);
                                break;
                            }
                            break;
                        case 60:
                            k(obj, i, obj2);
                            break;
                        case 61:
                        case 62:
                        case ColorSpace.MAX_ID /* 63 */:
                        case 64:
                        case 65:
                        case 66:
                        case 67:
                            if (s(i11, obj2, i)) {
                                x2.l(obj, j10, x2.h(j10, obj2));
                                x2.j(iArr[i + 2] & 1048575, obj, i11);
                                break;
                            }
                            break;
                        case 68:
                            k(obj, i, obj2);
                            break;
                    }
                    obj3 = obj;
                    i += 3;
                    obj = obj3;
                } else {
                    q2.p(obj, obj2);
                    return;
                }
            }
        } else {
            q.x.n("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0015. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01d5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01c7 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.play_billing.p2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(com.google.android.gms.internal.play_billing.r1 r8, com.google.android.gms.internal.play_billing.r1 r9) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.j2.f(com.google.android.gms.internal.play_billing.r1, com.google.android.gms.internal.play_billing.r1):boolean");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x004e. Please report as an issue. */
    @Override // com.google.android.gms.internal.play_billing.p2
    public final int g(b1 b1Var) {
        int i;
        int o10;
        int p10;
        int i10;
        int i11;
        int c10;
        int o11;
        int size;
        int o12;
        int o13;
        int o14;
        int o15;
        int i12;
        int o16;
        int p11;
        j2 j2Var = this;
        b1 b1Var2 = b1Var;
        Unsafe unsafe = f15461k;
        int i13 = 1048575;
        int i14 = 1048575;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (true) {
            int[] iArr = j2Var.f15462a;
            if (i15 < iArr.length) {
                int y10 = j2Var.y(i15);
                int x9 = x(y10);
                int i18 = iArr[i15];
                int i19 = iArr[i15 + 2];
                int i20 = i19 & i13;
                if (x9 <= 17) {
                    if (i20 != i14) {
                        if (i20 == i13) {
                            i16 = 0;
                        } else {
                            i16 = unsafe.getInt(b1Var2, i20);
                        }
                        i14 = i20;
                    }
                    i = 1 << (i19 >>> 20);
                } else {
                    i = 0;
                }
                int i21 = y10 & i13;
                if (x9 >= m1.f15484v.f15488u) {
                    m1.f15485w.getClass();
                }
                long j10 = i21;
                switch (x9) {
                    case 0:
                        if (j2Var.q(b1Var2, i15, i14, i16, i)) {
                            i17 = wd0.w(i18 << 3, 8, i17);
                        }
                        i15 += 3;
                        j2Var = this;
                        b1Var2 = b1Var;
                        i13 = 1048575;
                    case 1:
                        if (j2Var.q(b1Var2, i15, i14, i16, i)) {
                            i17 = wd0.w(i18 << 3, 4, i17);
                        }
                        i15 += 3;
                        j2Var = this;
                        b1Var2 = b1Var;
                        i13 = 1048575;
                    case 2:
                        if (j2Var.q(b1Var2, i15, i14, i16, i)) {
                            long j11 = unsafe.getLong(b1Var2, j10);
                            o10 = i1.o(i18 << 3);
                            p10 = i1.p(j11);
                            i10 = p10 + o10;
                            i17 += i10;
                            i15 += 3;
                            j2Var = this;
                            b1Var2 = b1Var;
                            i13 = 1048575;
                        } else {
                            i15 += 3;
                            j2Var = this;
                            b1Var2 = b1Var;
                            i13 = 1048575;
                        }
                    case 3:
                        if (j2Var.q(b1Var2, i15, i14, i16, i)) {
                            long j12 = unsafe.getLong(b1Var2, j10);
                            o10 = i1.o(i18 << 3);
                            p10 = i1.p(j12);
                            i10 = p10 + o10;
                            i17 += i10;
                            i15 += 3;
                            j2Var = this;
                            b1Var2 = b1Var;
                            i13 = 1048575;
                        } else {
                            i15 += 3;
                            j2Var = this;
                            b1Var2 = b1Var;
                            i13 = 1048575;
                        }
                    case 4:
                        if (j2Var.q(b1Var2, i15, i14, i16, i)) {
                            long j13 = unsafe.getInt(b1Var2, j10);
                            o10 = i1.o(i18 << 3);
                            p10 = i1.p(j13);
                            i10 = p10 + o10;
                            i17 += i10;
                            i15 += 3;
                            j2Var = this;
                            b1Var2 = b1Var;
                            i13 = 1048575;
                        } else {
                            i15 += 3;
                            j2Var = this;
                            b1Var2 = b1Var;
                            i13 = 1048575;
                        }
                    case 5:
                        if (j2Var.q(b1Var2, i15, i14, i16, i)) {
                            i17 = wd0.w(i18 << 3, 8, i17);
                        }
                        i15 += 3;
                        j2Var = this;
                        b1Var2 = b1Var;
                        i13 = 1048575;
                    case 6:
                        if (j2Var.q(b1Var2, i15, i14, i16, i)) {
                            i17 = wd0.w(i18 << 3, 4, i17);
                        }
                        i15 += 3;
                        j2Var = this;
                        b1Var2 = b1Var;
                        i13 = 1048575;
                    case 7:
                        if (j2Var.q(b1Var2, i15, i14, i16, i)) {
                            i17 = wd0.w(i18 << 3, 1, i17);
                        }
                        i15 += 3;
                        j2Var = this;
                        b1Var2 = b1Var;
                        i13 = 1048575;
                    case 8:
                        if (j2Var.q(b1Var2, i15, i14, i16, i)) {
                            int i22 = i18 << 3;
                            Object object = unsafe.getObject(b1Var2, j10);
                            if (object instanceof g1) {
                                int o17 = i1.o(i22);
                                int g8 = ((g1) object).g();
                                i17 = wd0.u(g8, g8, o17, i17);
                            } else {
                                int o18 = i1.o(i22);
                                int b10 = z2.b((String) object);
                                i17 = wd0.u(b10, b10, o18, i17);
                            }
                        }
                        i15 += 3;
                        j2Var = this;
                        b1Var2 = b1Var;
                        i13 = 1048575;
                    case 9:
                        if (j2Var.q(b1Var2, i15, i14, i16, i)) {
                            Object object2 = unsafe.getObject(b1Var2, j10);
                            p2 B = j2Var.B(i15);
                            p1 p1Var = q2.f15517a;
                            int o19 = i1.o(i18 << 3);
                            int c11 = ((b1) object2).c(B);
                            i17 = wd0.u(c11, c11, o19, i17);
                        }
                        i15 += 3;
                        j2Var = this;
                        b1Var2 = b1Var;
                        i13 = 1048575;
                    case 10:
                        if (j2Var.q(b1Var2, i15, i14, i16, i)) {
                            g1 g1Var = (g1) unsafe.getObject(b1Var2, j10);
                            int o20 = i1.o(i18 << 3);
                            int g10 = g1Var.g();
                            i17 = wd0.u(g10, g10, o20, i17);
                        }
                        i15 += 3;
                        j2Var = this;
                        b1Var2 = b1Var;
                        i13 = 1048575;
                    case 11:
                        if (j2Var.q(b1Var2, i15, i14, i16, i)) {
                            i17 = wd0.w(unsafe.getInt(b1Var2, j10), i1.o(i18 << 3), i17);
                        }
                        i15 += 3;
                        j2Var = this;
                        b1Var2 = b1Var;
                        i13 = 1048575;
                    case 12:
                        if (j2Var.q(b1Var2, i15, i14, i16, i)) {
                            long j14 = unsafe.getInt(b1Var2, j10);
                            o10 = i1.o(i18 << 3);
                            p10 = i1.p(j14);
                            i10 = p10 + o10;
                            i17 += i10;
                            i15 += 3;
                            j2Var = this;
                            b1Var2 = b1Var;
                            i13 = 1048575;
                        } else {
                            i15 += 3;
                            j2Var = this;
                            b1Var2 = b1Var;
                            i13 = 1048575;
                        }
                    case 13:
                        if (j2Var.q(b1Var2, i15, i14, i16, i)) {
                            i17 = wd0.w(i18 << 3, 4, i17);
                        }
                        i15 += 3;
                        j2Var = this;
                        b1Var2 = b1Var;
                        i13 = 1048575;
                    case 14:
                        if (j2Var.q(b1Var2, i15, i14, i16, i)) {
                            i17 = wd0.w(i18 << 3, 8, i17);
                        }
                        i15 += 3;
                        j2Var = this;
                        b1Var2 = b1Var;
                        i13 = 1048575;
                    case 15:
                        if (j2Var.q(b1Var2, i15, i14, i16, i)) {
                            int i23 = unsafe.getInt(b1Var2, j10);
                            i17 = wd0.w((i23 >> 31) ^ (i23 + i23), i1.o(i18 << 3), i17);
                        }
                        i15 += 3;
                        j2Var = this;
                        b1Var2 = b1Var;
                        i13 = 1048575;
                    case 16:
                        if (j2Var.q(b1Var2, i15, i14, i16, i)) {
                            long j15 = unsafe.getLong(b1Var2, j10);
                            o10 = i1.o(i18 << 3);
                            p10 = i1.p((j15 >> 63) ^ (j15 + j15));
                            i10 = p10 + o10;
                            i17 += i10;
                            i15 += 3;
                            j2Var = this;
                            b1Var2 = b1Var;
                            i13 = 1048575;
                        } else {
                            i15 += 3;
                            j2Var = this;
                            b1Var2 = b1Var;
                            i13 = 1048575;
                        }
                    case 17:
                        if (j2Var.q(b1Var2, i15, i14, i16, i)) {
                            b1 b1Var3 = (b1) unsafe.getObject(b1Var2, j10);
                            p2 B2 = j2Var.B(i15);
                            p1 p1Var2 = q2.f15517a;
                            int o21 = i1.o(i18 << 3);
                            i11 = o21 + o21;
                            c10 = b1Var3.c(B2);
                            i10 = c10 + i11;
                            i17 += i10;
                            i15 += 3;
                            j2Var = this;
                            b1Var2 = b1Var;
                            i13 = 1048575;
                        } else {
                            i15 += 3;
                            j2Var = this;
                            b1Var2 = b1Var;
                            i13 = 1048575;
                        }
                    case 18:
                        i10 = q2.i(i18, (List) unsafe.getObject(b1Var2, j10));
                        i17 += i10;
                        i15 += 3;
                        j2Var = this;
                        b1Var2 = b1Var;
                        i13 = 1048575;
                    case 19:
                        i10 = q2.h(i18, (List) unsafe.getObject(b1Var2, j10));
                        i17 += i10;
                        i15 += 3;
                        j2Var = this;
                        b1Var2 = b1Var;
                        i13 = 1048575;
                    case 20:
                        List list = (List) unsafe.getObject(b1Var2, j10);
                        p1 p1Var3 = q2.f15517a;
                        if (list.size() != 0) {
                            o11 = (i1.o(i18 << 3) * list.size()) + q2.k(list);
                            i17 += o11;
                            i15 += 3;
                            j2Var = this;
                            b1Var2 = b1Var;
                            i13 = 1048575;
                        }
                        o11 = 0;
                        i17 += o11;
                        i15 += 3;
                        j2Var = this;
                        b1Var2 = b1Var;
                        i13 = 1048575;
                    case gl.zzm /* 21 */:
                        List list2 = (List) unsafe.getObject(b1Var2, j10);
                        p1 p1Var4 = q2.f15517a;
                        size = list2.size();
                        if (size != 0) {
                            o12 = q2.o(list2);
                            o13 = i1.o(i18 << 3);
                            o14 = (o13 * size) + o12;
                            i17 += o14;
                            i15 += 3;
                            j2Var = this;
                            b1Var2 = b1Var;
                            i13 = 1048575;
                        }
                        o14 = 0;
                        i17 += o14;
                        i15 += 3;
                        j2Var = this;
                        b1Var2 = b1Var;
                        i13 = 1048575;
                    case 22:
                        List list3 = (List) unsafe.getObject(b1Var2, j10);
                        p1 p1Var5 = q2.f15517a;
                        size = list3.size();
                        if (size != 0) {
                            o12 = q2.j(list3);
                            o13 = i1.o(i18 << 3);
                            o14 = (o13 * size) + o12;
                            i17 += o14;
                            i15 += 3;
                            j2Var = this;
                            b1Var2 = b1Var;
                            i13 = 1048575;
                        }
                        o14 = 0;
                        i17 += o14;
                        i15 += 3;
                        j2Var = this;
                        b1Var2 = b1Var;
                        i13 = 1048575;
                    case 23:
                        i10 = q2.i(i18, (List) unsafe.getObject(b1Var2, j10));
                        i17 += i10;
                        i15 += 3;
                        j2Var = this;
                        b1Var2 = b1Var;
                        i13 = 1048575;
                    case 24:
                        i10 = q2.h(i18, (List) unsafe.getObject(b1Var2, j10));
                        i17 += i10;
                        i15 += 3;
                        j2Var = this;
                        b1Var2 = b1Var;
                        i13 = 1048575;
                    case 25:
                        List list4 = (List) unsafe.getObject(b1Var2, j10);
                        p1 p1Var6 = q2.f15517a;
                        int size2 = list4.size();
                        if (size2 != 0) {
                            o11 = (i1.o(i18 << 3) + 1) * size2;
                            i17 += o11;
                            i15 += 3;
                            j2Var = this;
                            b1Var2 = b1Var;
                            i13 = 1048575;
                        }
                        o11 = 0;
                        i17 += o11;
                        i15 += 3;
                        j2Var = this;
                        b1Var2 = b1Var;
                        i13 = 1048575;
                    case 26:
                        List list5 = (List) unsafe.getObject(b1Var2, j10);
                        p1 p1Var7 = q2.f15517a;
                        int size3 = list5.size();
                        if (size3 != 0) {
                            o14 = i1.o(i18 << 3) * size3;
                            if (list5 instanceof a2) {
                                a2 a2Var = (a2) list5;
                                for (int i24 = 0; i24 < size3; i24++) {
                                    Object zza = a2Var.zza();
                                    if (zza instanceof g1) {
                                        int g11 = ((g1) zza).g();
                                        o14 = wd0.w(g11, g11, o14);
                                    } else {
                                        int b11 = z2.b((String) zza);
                                        o14 = wd0.w(b11, b11, o14);
                                    }
                                }
                            } else {
                                for (int i25 = 0; i25 < size3; i25++) {
                                    Object obj = list5.get(i25);
                                    if (obj instanceof g1) {
                                        int g12 = ((g1) obj).g();
                                        o14 = wd0.w(g12, g12, o14);
                                    } else {
                                        int b12 = z2.b((String) obj);
                                        o14 = wd0.w(b12, b12, o14);
                                    }
                                }
                            }
                            i17 += o14;
                            i15 += 3;
                            j2Var = this;
                            b1Var2 = b1Var;
                            i13 = 1048575;
                        }
                        o14 = 0;
                        i17 += o14;
                        i15 += 3;
                        j2Var = this;
                        b1Var2 = b1Var;
                        i13 = 1048575;
                    case 27:
                        List list6 = (List) unsafe.getObject(b1Var2, j10);
                        p2 B3 = j2Var.B(i15);
                        p1 p1Var8 = q2.f15517a;
                        int size4 = list6.size();
                        if (size4 == 0) {
                            o15 = 0;
                        } else {
                            o15 = i1.o(i18 << 3) * size4;
                            for (int i26 = 0; i26 < size4; i26++) {
                                int c12 = ((b1) list6.get(i26)).c(B3);
                                o15 = wd0.w(c12, c12, o15);
                            }
                        }
                        i17 += o15;
                        i15 += 3;
                        j2Var = this;
                        b1Var2 = b1Var;
                        i13 = 1048575;
                    case 28:
                        List list7 = (List) unsafe.getObject(b1Var2, j10);
                        p1 p1Var9 = q2.f15517a;
                        int size5 = list7.size();
                        if (size5 != 0) {
                            o14 = i1.o(i18 << 3) * size5;
                            for (int i27 = 0; i27 < list7.size(); i27++) {
                                int g13 = ((g1) list7.get(i27)).g();
                                o14 = wd0.w(g13, g13, o14);
                            }
                            i17 += o14;
                            i15 += 3;
                            j2Var = this;
                            b1Var2 = b1Var;
                            i13 = 1048575;
                        }
                        o14 = 0;
                        i17 += o14;
                        i15 += 3;
                        j2Var = this;
                        b1Var2 = b1Var;
                        i13 = 1048575;
                    case 29:
                        List list8 = (List) unsafe.getObject(b1Var2, j10);
                        p1 p1Var10 = q2.f15517a;
                        size = list8.size();
                        if (size != 0) {
                            o12 = q2.n(list8);
                            o13 = i1.o(i18 << 3);
                            o14 = (o13 * size) + o12;
                            i17 += o14;
                            i15 += 3;
                            j2Var = this;
                            b1Var2 = b1Var;
                            i13 = 1048575;
                        }
                        o14 = 0;
                        i17 += o14;
                        i15 += 3;
                        j2Var = this;
                        b1Var2 = b1Var;
                        i13 = 1048575;
                    case 30:
                        List list9 = (List) unsafe.getObject(b1Var2, j10);
                        p1 p1Var11 = q2.f15517a;
                        size = list9.size();
                        if (size != 0) {
                            o12 = q2.g(list9);
                            o13 = i1.o(i18 << 3);
                            o14 = (o13 * size) + o12;
                            i17 += o14;
                            i15 += 3;
                            j2Var = this;
                            b1Var2 = b1Var;
                            i13 = 1048575;
                        }
                        o14 = 0;
                        i17 += o14;
                        i15 += 3;
                        j2Var = this;
                        b1Var2 = b1Var;
                        i13 = 1048575;
                    case 31:
                        i10 = q2.h(i18, (List) unsafe.getObject(b1Var2, j10));
                        i17 += i10;
                        i15 += 3;
                        j2Var = this;
                        b1Var2 = b1Var;
                        i13 = 1048575;
                    case 32:
                        i10 = q2.i(i18, (List) unsafe.getObject(b1Var2, j10));
                        i17 += i10;
                        i15 += 3;
                        j2Var = this;
                        b1Var2 = b1Var;
                        i13 = 1048575;
                    case 33:
                        List list10 = (List) unsafe.getObject(b1Var2, j10);
                        p1 p1Var12 = q2.f15517a;
                        size = list10.size();
                        if (size != 0) {
                            o12 = q2.l(list10);
                            o13 = i1.o(i18 << 3);
                            o14 = (o13 * size) + o12;
                            i17 += o14;
                            i15 += 3;
                            j2Var = this;
                            b1Var2 = b1Var;
                            i13 = 1048575;
                        }
                        o14 = 0;
                        i17 += o14;
                        i15 += 3;
                        j2Var = this;
                        b1Var2 = b1Var;
                        i13 = 1048575;
                    case 34:
                        List list11 = (List) unsafe.getObject(b1Var2, j10);
                        p1 p1Var13 = q2.f15517a;
                        size = list11.size();
                        if (size != 0) {
                            o12 = q2.m(list11);
                            o13 = i1.o(i18 << 3);
                            o14 = (o13 * size) + o12;
                            i17 += o14;
                            i15 += 3;
                            j2Var = this;
                            b1Var2 = b1Var;
                            i13 = 1048575;
                        }
                        o14 = 0;
                        i17 += o14;
                        i15 += 3;
                        j2Var = this;
                        b1Var2 = b1Var;
                        i13 = 1048575;
                    case 35:
                        List list12 = (List) unsafe.getObject(b1Var2, j10);
                        p1 p1Var14 = q2.f15517a;
                        int size6 = list12.size() * 8;
                        if (size6 > 0) {
                            i17 = wd0.u(size6, i1.o(i18 << 3), size6, i17);
                        }
                        i15 += 3;
                        j2Var = this;
                        b1Var2 = b1Var;
                        i13 = 1048575;
                    case 36:
                        List list13 = (List) unsafe.getObject(b1Var2, j10);
                        p1 p1Var15 = q2.f15517a;
                        int size7 = list13.size() * 4;
                        if (size7 > 0) {
                            i17 = wd0.u(size7, i1.o(i18 << 3), size7, i17);
                        }
                        i15 += 3;
                        j2Var = this;
                        b1Var2 = b1Var;
                        i13 = 1048575;
                    case 37:
                        int k3 = q2.k((List) unsafe.getObject(b1Var2, j10));
                        if (k3 > 0) {
                            i17 = wd0.u(k3, i1.o(i18 << 3), k3, i17);
                        }
                        i15 += 3;
                        j2Var = this;
                        b1Var2 = b1Var;
                        i13 = 1048575;
                    case 38:
                        int o22 = q2.o((List) unsafe.getObject(b1Var2, j10));
                        if (o22 > 0) {
                            i17 = wd0.u(o22, i1.o(i18 << 3), o22, i17);
                        }
                        i15 += 3;
                        j2Var = this;
                        b1Var2 = b1Var;
                        i13 = 1048575;
                    case 39:
                        int j16 = q2.j((List) unsafe.getObject(b1Var2, j10));
                        if (j16 > 0) {
                            i17 = wd0.u(j16, i1.o(i18 << 3), j16, i17);
                        }
                        i15 += 3;
                        j2Var = this;
                        b1Var2 = b1Var;
                        i13 = 1048575;
                    case 40:
                        List list14 = (List) unsafe.getObject(b1Var2, j10);
                        p1 p1Var16 = q2.f15517a;
                        int size8 = list14.size() * 8;
                        if (size8 > 0) {
                            i17 = wd0.u(size8, i1.o(i18 << 3), size8, i17);
                        }
                        i15 += 3;
                        j2Var = this;
                        b1Var2 = b1Var;
                        i13 = 1048575;
                    case 41:
                        List list15 = (List) unsafe.getObject(b1Var2, j10);
                        p1 p1Var17 = q2.f15517a;
                        int size9 = list15.size() * 4;
                        if (size9 > 0) {
                            i17 = wd0.u(size9, i1.o(i18 << 3), size9, i17);
                        }
                        i15 += 3;
                        j2Var = this;
                        b1Var2 = b1Var;
                        i13 = 1048575;
                    case 42:
                        List list16 = (List) unsafe.getObject(b1Var2, j10);
                        p1 p1Var18 = q2.f15517a;
                        int size10 = list16.size();
                        if (size10 > 0) {
                            i17 = wd0.u(size10, i1.o(i18 << 3), size10, i17);
                        }
                        i15 += 3;
                        j2Var = this;
                        b1Var2 = b1Var;
                        i13 = 1048575;
                    case 43:
                        int n10 = q2.n((List) unsafe.getObject(b1Var2, j10));
                        if (n10 > 0) {
                            i17 = wd0.u(n10, i1.o(i18 << 3), n10, i17);
                        }
                        i15 += 3;
                        j2Var = this;
                        b1Var2 = b1Var;
                        i13 = 1048575;
                    case 44:
                        int g14 = q2.g((List) unsafe.getObject(b1Var2, j10));
                        if (g14 > 0) {
                            i17 = wd0.u(g14, i1.o(i18 << 3), g14, i17);
                        }
                        i15 += 3;
                        j2Var = this;
                        b1Var2 = b1Var;
                        i13 = 1048575;
                    case 45:
                        List list17 = (List) unsafe.getObject(b1Var2, j10);
                        p1 p1Var19 = q2.f15517a;
                        int size11 = list17.size() * 4;
                        if (size11 > 0) {
                            i17 = wd0.u(size11, i1.o(i18 << 3), size11, i17);
                        }
                        i15 += 3;
                        j2Var = this;
                        b1Var2 = b1Var;
                        i13 = 1048575;
                    case 46:
                        List list18 = (List) unsafe.getObject(b1Var2, j10);
                        p1 p1Var20 = q2.f15517a;
                        int size12 = list18.size() * 8;
                        if (size12 > 0) {
                            i17 = wd0.u(size12, i1.o(i18 << 3), size12, i17);
                        }
                        i15 += 3;
                        j2Var = this;
                        b1Var2 = b1Var;
                        i13 = 1048575;
                    case 47:
                        int l10 = q2.l((List) unsafe.getObject(b1Var2, j10));
                        if (l10 > 0) {
                            i17 = wd0.u(l10, i1.o(i18 << 3), l10, i17);
                        }
                        i15 += 3;
                        j2Var = this;
                        b1Var2 = b1Var;
                        i13 = 1048575;
                    case 48:
                        int m4 = q2.m((List) unsafe.getObject(b1Var2, j10));
                        if (m4 > 0) {
                            i17 = wd0.u(m4, i1.o(i18 << 3), m4, i17);
                        }
                        i15 += 3;
                        j2Var = this;
                        b1Var2 = b1Var;
                        i13 = 1048575;
                    case 49:
                        List list19 = (List) unsafe.getObject(b1Var2, j10);
                        p2 B4 = j2Var.B(i15);
                        p1 p1Var21 = q2.f15517a;
                        int size13 = list19.size();
                        if (size13 == 0) {
                            i12 = 0;
                        } else {
                            i12 = 0;
                            for (int i28 = 0; i28 < size13; i28++) {
                                b1 b1Var4 = (b1) list19.get(i28);
                                int o23 = i1.o(i18 << 3);
                                i12 += b1Var4.c(B4) + o23 + o23;
                            }
                        }
                        i17 += i12;
                        i15 += 3;
                        j2Var = this;
                        b1Var2 = b1Var;
                        i13 = 1048575;
                    case 50:
                        int i29 = i15 / 3;
                        e2 e2Var = (e2) unsafe.getObject(b1Var2, j10);
                        if (j2Var.f15463b[i29 + i29] == null) {
                            if (e2Var.isEmpty()) {
                                continue;
                            } else {
                                Iterator it = e2Var.entrySet().iterator();
                                if (it.hasNext()) {
                                    Map.Entry entry = (Map.Entry) it.next();
                                    entry.getKey();
                                    entry.getValue();
                                    throw null;
                                }
                            }
                            i15 += 3;
                            j2Var = this;
                            b1Var2 = b1Var;
                            i13 = 1048575;
                        } else {
                            g5.q.b();
                            return 0;
                        }
                    case 51:
                        if (j2Var.s(i18, b1Var2, i15)) {
                            i17 = wd0.w(i18 << 3, 8, i17);
                        }
                        i15 += 3;
                        j2Var = this;
                        b1Var2 = b1Var;
                        i13 = 1048575;
                    case 52:
                        if (j2Var.s(i18, b1Var2, i15)) {
                            i17 = wd0.w(i18 << 3, 4, i17);
                        }
                        i15 += 3;
                        j2Var = this;
                        b1Var2 = b1Var;
                        i13 = 1048575;
                    case 53:
                        if (j2Var.s(i18, b1Var2, i15)) {
                            long z3 = z(j10, b1Var2);
                            o16 = i1.o(i18 << 3);
                            p11 = i1.p(z3);
                            i17 += p11 + o16;
                            i15 += 3;
                            j2Var = this;
                            b1Var2 = b1Var;
                            i13 = 1048575;
                        } else {
                            i15 += 3;
                            j2Var = this;
                            b1Var2 = b1Var;
                            i13 = 1048575;
                        }
                    case 54:
                        if (j2Var.s(i18, b1Var2, i15)) {
                            long z9 = z(j10, b1Var2);
                            o16 = i1.o(i18 << 3);
                            p11 = i1.p(z9);
                            i17 += p11 + o16;
                            i15 += 3;
                            j2Var = this;
                            b1Var2 = b1Var;
                            i13 = 1048575;
                        } else {
                            i15 += 3;
                            j2Var = this;
                            b1Var2 = b1Var;
                            i13 = 1048575;
                        }
                    case 55:
                        if (j2Var.s(i18, b1Var2, i15)) {
                            long v2 = v(j10, b1Var2);
                            o16 = i1.o(i18 << 3);
                            p11 = i1.p(v2);
                            i17 += p11 + o16;
                            i15 += 3;
                            j2Var = this;
                            b1Var2 = b1Var;
                            i13 = 1048575;
                        } else {
                            i15 += 3;
                            j2Var = this;
                            b1Var2 = b1Var;
                            i13 = 1048575;
                        }
                    case 56:
                        if (j2Var.s(i18, b1Var2, i15)) {
                            i17 = wd0.w(i18 << 3, 8, i17);
                        }
                        i15 += 3;
                        j2Var = this;
                        b1Var2 = b1Var;
                        i13 = 1048575;
                    case 57:
                        if (j2Var.s(i18, b1Var2, i15)) {
                            i17 = wd0.w(i18 << 3, 4, i17);
                        }
                        i15 += 3;
                        j2Var = this;
                        b1Var2 = b1Var;
                        i13 = 1048575;
                    case 58:
                        if (j2Var.s(i18, b1Var2, i15)) {
                            i17 = wd0.w(i18 << 3, 1, i17);
                        }
                        i15 += 3;
                        j2Var = this;
                        b1Var2 = b1Var;
                        i13 = 1048575;
                    case 59:
                        if (j2Var.s(i18, b1Var2, i15)) {
                            int i30 = i18 << 3;
                            Object object3 = unsafe.getObject(b1Var2, j10);
                            if (object3 instanceof g1) {
                                int o24 = i1.o(i30);
                                int g15 = ((g1) object3).g();
                                i17 = wd0.u(g15, g15, o24, i17);
                            } else {
                                int o25 = i1.o(i30);
                                int b13 = z2.b((String) object3);
                                i17 = wd0.u(b13, b13, o25, i17);
                            }
                        }
                        i15 += 3;
                        j2Var = this;
                        b1Var2 = b1Var;
                        i13 = 1048575;
                    case 60:
                        if (j2Var.s(i18, b1Var2, i15)) {
                            Object object4 = unsafe.getObject(b1Var2, j10);
                            p2 B5 = j2Var.B(i15);
                            p1 p1Var22 = q2.f15517a;
                            int o26 = i1.o(i18 << 3);
                            int c13 = ((b1) object4).c(B5);
                            i17 = wd0.u(c13, c13, o26, i17);
                        }
                        i15 += 3;
                        j2Var = this;
                        b1Var2 = b1Var;
                        i13 = 1048575;
                    case 61:
                        if (j2Var.s(i18, b1Var2, i15)) {
                            g1 g1Var2 = (g1) unsafe.getObject(b1Var2, j10);
                            int o27 = i1.o(i18 << 3);
                            int g16 = g1Var2.g();
                            i17 = wd0.u(g16, g16, o27, i17);
                        }
                        i15 += 3;
                        j2Var = this;
                        b1Var2 = b1Var;
                        i13 = 1048575;
                    case 62:
                        if (j2Var.s(i18, b1Var2, i15)) {
                            i17 = wd0.w(v(j10, b1Var2), i1.o(i18 << 3), i17);
                        }
                        i15 += 3;
                        j2Var = this;
                        b1Var2 = b1Var;
                        i13 = 1048575;
                    case ColorSpace.MAX_ID /* 63 */:
                        if (j2Var.s(i18, b1Var2, i15)) {
                            long v4 = v(j10, b1Var2);
                            o16 = i1.o(i18 << 3);
                            p11 = i1.p(v4);
                            i17 += p11 + o16;
                            i15 += 3;
                            j2Var = this;
                            b1Var2 = b1Var;
                            i13 = 1048575;
                        } else {
                            i15 += 3;
                            j2Var = this;
                            b1Var2 = b1Var;
                            i13 = 1048575;
                        }
                    case 64:
                        if (j2Var.s(i18, b1Var2, i15)) {
                            i17 = wd0.w(i18 << 3, 4, i17);
                        }
                        i15 += 3;
                        j2Var = this;
                        b1Var2 = b1Var;
                        i13 = 1048575;
                    case 65:
                        if (j2Var.s(i18, b1Var2, i15)) {
                            i17 = wd0.w(i18 << 3, 8, i17);
                        }
                        i15 += 3;
                        j2Var = this;
                        b1Var2 = b1Var;
                        i13 = 1048575;
                    case 66:
                        if (j2Var.s(i18, b1Var2, i15)) {
                            int v10 = v(j10, b1Var2);
                            i17 = wd0.w((v10 >> 31) ^ (v10 + v10), i1.o(i18 << 3), i17);
                        }
                        i15 += 3;
                        j2Var = this;
                        b1Var2 = b1Var;
                        i13 = 1048575;
                    case 67:
                        if (j2Var.s(i18, b1Var2, i15)) {
                            long z10 = z(j10, b1Var2);
                            o16 = i1.o(i18 << 3);
                            p11 = i1.p((z10 >> 63) ^ (z10 + z10));
                            i17 += p11 + o16;
                            i15 += 3;
                            j2Var = this;
                            b1Var2 = b1Var;
                            i13 = 1048575;
                        } else {
                            i15 += 3;
                            j2Var = this;
                            b1Var2 = b1Var;
                            i13 = 1048575;
                        }
                    case 68:
                        if (j2Var.s(i18, b1Var2, i15)) {
                            b1 b1Var5 = (b1) unsafe.getObject(b1Var2, j10);
                            p2 B6 = j2Var.B(i15);
                            p1 p1Var23 = q2.f15517a;
                            int o28 = i1.o(i18 << 3);
                            i11 = o28 + o28;
                            c10 = b1Var5.c(B6);
                            i10 = c10 + i11;
                            i17 += i10;
                            i15 += 3;
                            j2Var = this;
                            b1Var2 = b1Var;
                            i13 = 1048575;
                        } else {
                            i15 += 3;
                            j2Var = this;
                            b1Var2 = b1Var;
                            i13 = 1048575;
                        }
                    default:
                        i15 += 3;
                        j2Var = this;
                        b1Var2 = b1Var;
                        i13 = 1048575;
                }
            } else {
                return ((r1) b1Var).zzc.a() + i17;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x004d. Please report as an issue. */
    @Override // com.google.android.gms.internal.play_billing.p2
    public final void h(Object obj, d2 d2Var) {
        int[] iArr;
        int i;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        char c10;
        j2 j2Var = this;
        i1 i1Var = (i1) d2Var.f15404a;
        Unsafe unsafe = f15461k;
        int i15 = 1048575;
        int i16 = 1048575;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            int[] iArr2 = j2Var.f15462a;
            if (i17 < iArr2.length) {
                int y10 = j2Var.y(i17);
                int x9 = x(y10);
                int i19 = iArr2[i17];
                if (x9 <= 17) {
                    int i20 = iArr2[i17 + 2];
                    int i21 = i20 & i15;
                    if (i21 != i16) {
                        if (i21 == i15) {
                            i18 = 0;
                        } else {
                            i18 = unsafe.getInt(obj, i21);
                        }
                        i16 = i21;
                    }
                    iArr = iArr2;
                    i = 1 << (i20 >>> 20);
                } else {
                    iArr = iArr2;
                    i = 0;
                }
                long j10 = y10 & i15;
                char c11 = 3;
                switch (x9) {
                    case 0:
                        if (j2Var.q(obj, i17, i16, i18, i)) {
                            i1Var.f(i19, Double.doubleToRawLongBits(x2.f15547c.a(j10, obj)));
                        }
                        i17 += 3;
                        i15 = 1048575;
                        j2Var = this;
                    case 1:
                        if (j2Var.q(obj, i17, i16, i18, i)) {
                            i1Var.d(i19, Float.floatToRawIntBits(x2.f15547c.b(j10, obj)));
                        }
                        i17 += 3;
                        i15 = 1048575;
                        j2Var = this;
                    case 2:
                        if (j2Var.q(obj, i17, i16, i18, i)) {
                            i1Var.m(i19, unsafe.getLong(obj, j10));
                        }
                        i17 += 3;
                        i15 = 1048575;
                        j2Var = this;
                    case 3:
                        if (j2Var.q(obj, i17, i16, i18, i)) {
                            i1Var.m(i19, unsafe.getLong(obj, j10));
                        }
                        i17 += 3;
                        i15 = 1048575;
                        j2Var = this;
                    case 4:
                        if (j2Var.q(obj, i17, i16, i18, i)) {
                            i1Var.h(i19, unsafe.getInt(obj, j10));
                        }
                        i17 += 3;
                        i15 = 1048575;
                        j2Var = this;
                    case 5:
                        if (j2Var.q(obj, i17, i16, i18, i)) {
                            i1Var.f(i19, unsafe.getLong(obj, j10));
                        }
                        i17 += 3;
                        i15 = 1048575;
                        j2Var = this;
                    case 6:
                        if (j2Var.q(obj, i17, i16, i18, i)) {
                            i1Var.d(i19, unsafe.getInt(obj, j10));
                        }
                        i17 += 3;
                        i15 = 1048575;
                        j2Var = this;
                    case 7:
                        if (j2Var.q(obj, i17, i16, i18, i)) {
                            boolean g8 = x2.f15547c.g(j10, obj);
                            i1Var.l(i19 << 3);
                            i1Var.a(g8 ? (byte) 1 : (byte) 0);
                        }
                        i17 += 3;
                        i15 = 1048575;
                        j2Var = this;
                    case 8:
                        if (j2Var.q(obj, i17, i16, i18, i)) {
                            Object object = unsafe.getObject(obj, j10);
                            if (object instanceof String) {
                                String str = (String) object;
                                i1Var.l((i19 << 3) | 2);
                                int i22 = i1Var.f15447c;
                                byte[] bArr = i1Var.f15446b;
                                int i23 = i1Var.f15448d;
                                try {
                                    int o10 = i1.o(str.length() * 3);
                                    int o11 = i1.o(str.length());
                                    if (o11 == o10) {
                                        int i24 = i23 + o11;
                                        i1Var.f15448d = i24;
                                        int a10 = z2.a(str, bArr, i24, i22 - i24);
                                        i1Var.f15448d = i23;
                                        i1Var.l((a10 - i23) - o11);
                                        i1Var.f15448d = a10;
                                    } else {
                                        i1Var.l(z2.b(str));
                                        int i25 = i1Var.f15448d;
                                        i1Var.f15448d = z2.a(str, bArr, i25, i22 - i25);
                                    }
                                } catch (IndexOutOfBoundsException e) {
                                    throw new IOException("CodedOutputStream was writing to a flat byte array and ran out of space.", e);
                                }
                            } else {
                                i1Var.c(i19, (g1) object);
                            }
                        } else {
                            continue;
                        }
                        i17 += 3;
                        i15 = 1048575;
                        j2Var = this;
                    case 9:
                        if (j2Var.q(obj, i17, i16, i18, i)) {
                            d2Var.c(i19, unsafe.getObject(obj, j10), j2Var.B(i17));
                        }
                        i17 += 3;
                        i15 = 1048575;
                        j2Var = this;
                    case 10:
                        if (j2Var.q(obj, i17, i16, i18, i)) {
                            i1Var.c(i19, (g1) unsafe.getObject(obj, j10));
                        }
                        i17 += 3;
                        i15 = 1048575;
                        j2Var = this;
                    case 11:
                        if (j2Var.q(obj, i17, i16, i18, i)) {
                            i1Var.k(i19, unsafe.getInt(obj, j10));
                        }
                        i17 += 3;
                        i15 = 1048575;
                        j2Var = this;
                    case 12:
                        if (j2Var.q(obj, i17, i16, i18, i)) {
                            i1Var.h(i19, unsafe.getInt(obj, j10));
                        }
                        i17 += 3;
                        i15 = 1048575;
                        j2Var = this;
                    case 13:
                        if (j2Var.q(obj, i17, i16, i18, i)) {
                            i1Var.d(i19, unsafe.getInt(obj, j10));
                        }
                        i17 += 3;
                        i15 = 1048575;
                        j2Var = this;
                    case 14:
                        if (j2Var.q(obj, i17, i16, i18, i)) {
                            i1Var.f(i19, unsafe.getLong(obj, j10));
                        }
                        i17 += 3;
                        i15 = 1048575;
                        j2Var = this;
                    case 15:
                        if (j2Var.q(obj, i17, i16, i18, i)) {
                            int i26 = unsafe.getInt(obj, j10);
                            i1Var.k(i19, (i26 >> 31) ^ (i26 + i26));
                        }
                        i17 += 3;
                        i15 = 1048575;
                        j2Var = this;
                    case 16:
                        if (j2Var.q(obj, i17, i16, i18, i)) {
                            long j11 = unsafe.getLong(obj, j10);
                            i1Var.m(i19, (j11 >> 63) ^ (j11 + j11));
                        }
                        i17 += 3;
                        i15 = 1048575;
                        j2Var = this;
                    case 17:
                        if (j2Var.q(obj, i17, i16, i18, i)) {
                            Object object2 = unsafe.getObject(obj, j10);
                            i1Var.j(i19, 3);
                            j2Var.B(i17).h((b1) object2, d2Var);
                            i1Var.j(i19, 4);
                        }
                        i17 += 3;
                        i15 = 1048575;
                        j2Var = this;
                    case 18:
                        i10 = i17;
                        q2.r(iArr[i10], (List) unsafe.getObject(obj, j10), d2Var, false);
                        i17 = i10;
                        i17 += 3;
                        i15 = 1048575;
                        j2Var = this;
                    case 19:
                        i10 = i17;
                        q2.v(iArr[i10], (List) unsafe.getObject(obj, j10), d2Var, false);
                        i17 = i10;
                        i17 += 3;
                        i15 = 1048575;
                        j2Var = this;
                    case 20:
                        i10 = i17;
                        q2.x(iArr[i10], (List) unsafe.getObject(obj, j10), d2Var, false);
                        i17 = i10;
                        i17 += 3;
                        i15 = 1048575;
                        j2Var = this;
                    case gl.zzm /* 21 */:
                        i10 = i17;
                        q2.e(iArr[i10], (List) unsafe.getObject(obj, j10), d2Var, false);
                        i17 = i10;
                        i17 += 3;
                        i15 = 1048575;
                        j2Var = this;
                    case 22:
                        i10 = i17;
                        q2.w(iArr[i10], (List) unsafe.getObject(obj, j10), d2Var, false);
                        i17 = i10;
                        i17 += 3;
                        i15 = 1048575;
                        j2Var = this;
                    case 23:
                        i10 = i17;
                        q2.u(iArr[i10], (List) unsafe.getObject(obj, j10), d2Var, false);
                        i17 = i10;
                        i17 += 3;
                        i15 = 1048575;
                        j2Var = this;
                    case 24:
                        i10 = i17;
                        q2.t(iArr[i10], (List) unsafe.getObject(obj, j10), d2Var, false);
                        i17 = i10;
                        i17 += 3;
                        i15 = 1048575;
                        j2Var = this;
                    case 25:
                        i10 = i17;
                        q2.q(iArr[i10], (List) unsafe.getObject(obj, j10), d2Var, false);
                        i17 = i10;
                        i17 += 3;
                        i15 = 1048575;
                        j2Var = this;
                    case 26:
                        int i27 = iArr[i17];
                        List list = (List) unsafe.getObject(obj, j10);
                        p1 p1Var = q2.f15517a;
                        if (list != null && !list.isEmpty()) {
                            if (list instanceof a2) {
                                a2 a2Var = (a2) list;
                                int i28 = 0;
                                while (i28 < list.size()) {
                                    Object zza = a2Var.zza();
                                    if (zza instanceof String) {
                                        String str2 = (String) zza;
                                        i1Var.l((i27 << 3) | 2);
                                        int i29 = i1Var.f15447c;
                                        c10 = c11;
                                        byte[] bArr2 = i1Var.f15446b;
                                        int i30 = i1Var.f15448d;
                                        try {
                                            i13 = i17;
                                            int o12 = i1.o(str2.length() * 3);
                                            i14 = i16;
                                            int o13 = i1.o(str2.length());
                                            if (o13 == o12) {
                                                int i31 = i30 + o13;
                                                i1Var.f15448d = i31;
                                                int a11 = z2.a(str2, bArr2, i31, i29 - i31);
                                                i1Var.f15448d = i30;
                                                i1Var.l((a11 - i30) - o13);
                                                i1Var.f15448d = a11;
                                            } else {
                                                i1Var.l(z2.b(str2));
                                                int i32 = i1Var.f15448d;
                                                i1Var.f15448d = z2.a(str2, bArr2, i32, i29 - i32);
                                            }
                                        } catch (IndexOutOfBoundsException e8) {
                                            throw new IOException("CodedOutputStream was writing to a flat byte array and ran out of space.", e8);
                                        }
                                    } else {
                                        i13 = i17;
                                        i14 = i16;
                                        c10 = c11;
                                        i1Var.c(i27, (g1) zza);
                                    }
                                    i28++;
                                    c11 = c10;
                                    i17 = i13;
                                    i16 = i14;
                                }
                                i11 = i17;
                                i12 = i16;
                            } else {
                                i11 = i17;
                                i12 = i16;
                                for (int i33 = 0; i33 < list.size(); i33++) {
                                    String str3 = (String) list.get(i33);
                                    i1Var.l((i27 << 3) | 2);
                                    int i34 = i1Var.f15447c;
                                    byte[] bArr3 = i1Var.f15446b;
                                    int i35 = i1Var.f15448d;
                                    try {
                                        int o14 = i1.o(str3.length() * 3);
                                        int o15 = i1.o(str3.length());
                                        if (o15 == o14) {
                                            int i36 = i35 + o15;
                                            i1Var.f15448d = i36;
                                            int a12 = z2.a(str3, bArr3, i36, i34 - i36);
                                            i1Var.f15448d = i35;
                                            i1Var.l((a12 - i35) - o15);
                                            i1Var.f15448d = a12;
                                        } else {
                                            i1Var.l(z2.b(str3));
                                            int i37 = i1Var.f15448d;
                                            i1Var.f15448d = z2.a(str3, bArr3, i37, i34 - i37);
                                        }
                                    } catch (IndexOutOfBoundsException e10) {
                                        throw new IOException("CodedOutputStream was writing to a flat byte array and ran out of space.", e10);
                                    }
                                }
                            }
                            i17 = i11;
                            i16 = i12;
                        }
                        i17 += 3;
                        i15 = 1048575;
                        j2Var = this;
                        break;
                    case 27:
                        int i38 = iArr[i17];
                        List list2 = (List) unsafe.getObject(obj, j10);
                        p2 B = j2Var.B(i17);
                        p1 p1Var2 = q2.f15517a;
                        if (list2 != null && !list2.isEmpty()) {
                            for (int i39 = 0; i39 < list2.size(); i39++) {
                                d2Var.c(i38, list2.get(i39), B);
                            }
                        }
                        i17 += 3;
                        i15 = 1048575;
                        j2Var = this;
                        break;
                    case 28:
                        int i40 = iArr[i17];
                        List list3 = (List) unsafe.getObject(obj, j10);
                        p1 p1Var3 = q2.f15517a;
                        if (list3 != null && !list3.isEmpty()) {
                            for (int i41 = 0; i41 < list3.size(); i41++) {
                                i1Var.c(i40, (g1) list3.get(i41));
                            }
                        }
                        i17 += 3;
                        i15 = 1048575;
                        j2Var = this;
                        break;
                    case 29:
                        q2.d(iArr[i17], (List) unsafe.getObject(obj, j10), d2Var, false);
                        i17 += 3;
                        i15 = 1048575;
                        j2Var = this;
                    case 30:
                        q2.s(iArr[i17], (List) unsafe.getObject(obj, j10), d2Var, false);
                        i17 += 3;
                        i15 = 1048575;
                        j2Var = this;
                    case 31:
                        q2.y(iArr[i17], (List) unsafe.getObject(obj, j10), d2Var, false);
                        i17 += 3;
                        i15 = 1048575;
                        j2Var = this;
                    case 32:
                        q2.a(iArr[i17], (List) unsafe.getObject(obj, j10), d2Var, false);
                        i17 += 3;
                        i15 = 1048575;
                        j2Var = this;
                    case 33:
                        q2.b(iArr[i17], (List) unsafe.getObject(obj, j10), d2Var, false);
                        i17 += 3;
                        i15 = 1048575;
                        j2Var = this;
                    case 34:
                        q2.c(iArr[i17], (List) unsafe.getObject(obj, j10), d2Var, false);
                        i17 += 3;
                        i15 = 1048575;
                        j2Var = this;
                    case 35:
                        q2.r(iArr[i17], (List) unsafe.getObject(obj, j10), d2Var, true);
                        i17 += 3;
                        i15 = 1048575;
                        j2Var = this;
                    case 36:
                        q2.v(iArr[i17], (List) unsafe.getObject(obj, j10), d2Var, true);
                        i17 += 3;
                        i15 = 1048575;
                        j2Var = this;
                    case 37:
                        q2.x(iArr[i17], (List) unsafe.getObject(obj, j10), d2Var, true);
                        i17 += 3;
                        i15 = 1048575;
                        j2Var = this;
                    case 38:
                        q2.e(iArr[i17], (List) unsafe.getObject(obj, j10), d2Var, true);
                        i17 += 3;
                        i15 = 1048575;
                        j2Var = this;
                    case 39:
                        q2.w(iArr[i17], (List) unsafe.getObject(obj, j10), d2Var, true);
                        i17 += 3;
                        i15 = 1048575;
                        j2Var = this;
                    case 40:
                        q2.u(iArr[i17], (List) unsafe.getObject(obj, j10), d2Var, true);
                        i17 += 3;
                        i15 = 1048575;
                        j2Var = this;
                    case 41:
                        q2.t(iArr[i17], (List) unsafe.getObject(obj, j10), d2Var, true);
                        i17 += 3;
                        i15 = 1048575;
                        j2Var = this;
                    case 42:
                        q2.q(iArr[i17], (List) unsafe.getObject(obj, j10), d2Var, true);
                        i17 += 3;
                        i15 = 1048575;
                        j2Var = this;
                    case 43:
                        q2.d(iArr[i17], (List) unsafe.getObject(obj, j10), d2Var, true);
                        i17 += 3;
                        i15 = 1048575;
                        j2Var = this;
                    case 44:
                        q2.s(iArr[i17], (List) unsafe.getObject(obj, j10), d2Var, true);
                        i17 += 3;
                        i15 = 1048575;
                        j2Var = this;
                    case 45:
                        q2.y(iArr[i17], (List) unsafe.getObject(obj, j10), d2Var, true);
                        i17 += 3;
                        i15 = 1048575;
                        j2Var = this;
                    case 46:
                        q2.a(iArr[i17], (List) unsafe.getObject(obj, j10), d2Var, true);
                        i17 += 3;
                        i15 = 1048575;
                        j2Var = this;
                    case 47:
                        q2.b(iArr[i17], (List) unsafe.getObject(obj, j10), d2Var, true);
                        i17 += 3;
                        i15 = 1048575;
                        j2Var = this;
                    case 48:
                        q2.c(iArr[i17], (List) unsafe.getObject(obj, j10), d2Var, true);
                        i17 += 3;
                        i15 = 1048575;
                        j2Var = this;
                    case 49:
                        int i42 = iArr[i17];
                        List list4 = (List) unsafe.getObject(obj, j10);
                        p2 B2 = j2Var.B(i17);
                        p1 p1Var4 = q2.f15517a;
                        if (list4 != null && !list4.isEmpty()) {
                            for (int i43 = 0; i43 < list4.size(); i43++) {
                                b1 b1Var = (b1) list4.get(i43);
                                i1Var.j(i42, 3);
                                B2.h(b1Var, d2Var);
                                i1Var.j(i42, 4);
                            }
                        }
                        i17 += 3;
                        i15 = 1048575;
                        j2Var = this;
                        break;
                    case 50:
                        if (unsafe.getObject(obj, j10) != null) {
                            int i44 = i17 / 3;
                            throw p.a.f(j2Var.f15463b[i44 + i44]);
                        }
                        i17 += 3;
                        i15 = 1048575;
                        j2Var = this;
                    case 51:
                        if (j2Var.s(i19, obj, i17)) {
                            i1Var.f(i19, Double.doubleToRawLongBits(((Double) x2.h(j10, obj)).doubleValue()));
                        }
                        i17 += 3;
                        i15 = 1048575;
                        j2Var = this;
                    case 52:
                        if (j2Var.s(i19, obj, i17)) {
                            i1Var.d(i19, Float.floatToRawIntBits(((Float) x2.h(j10, obj)).floatValue()));
                        }
                        i17 += 3;
                        i15 = 1048575;
                        j2Var = this;
                    case 53:
                        if (j2Var.s(i19, obj, i17)) {
                            i1Var.m(i19, z(j10, obj));
                        }
                        i17 += 3;
                        i15 = 1048575;
                        j2Var = this;
                    case 54:
                        if (j2Var.s(i19, obj, i17)) {
                            i1Var.m(i19, z(j10, obj));
                        }
                        i17 += 3;
                        i15 = 1048575;
                        j2Var = this;
                    case 55:
                        if (j2Var.s(i19, obj, i17)) {
                            i1Var.h(i19, v(j10, obj));
                        }
                        i17 += 3;
                        i15 = 1048575;
                        j2Var = this;
                    case 56:
                        if (j2Var.s(i19, obj, i17)) {
                            i1Var.f(i19, z(j10, obj));
                        }
                        i17 += 3;
                        i15 = 1048575;
                        j2Var = this;
                    case 57:
                        if (j2Var.s(i19, obj, i17)) {
                            i1Var.d(i19, v(j10, obj));
                        }
                        i17 += 3;
                        i15 = 1048575;
                        j2Var = this;
                    case 58:
                        if (j2Var.s(i19, obj, i17)) {
                            boolean booleanValue = ((Boolean) x2.h(j10, obj)).booleanValue();
                            i1Var.l(i19 << 3);
                            i1Var.a(booleanValue ? (byte) 1 : (byte) 0);
                        }
                        i17 += 3;
                        i15 = 1048575;
                        j2Var = this;
                    case 59:
                        if (j2Var.s(i19, obj, i17)) {
                            Object object3 = unsafe.getObject(obj, j10);
                            if (object3 instanceof String) {
                                String str4 = (String) object3;
                                i1Var.l((i19 << 3) | 2);
                                int i45 = i1Var.f15447c;
                                byte[] bArr4 = i1Var.f15446b;
                                int i46 = i1Var.f15448d;
                                try {
                                    int o16 = i1.o(str4.length() * 3);
                                    int o17 = i1.o(str4.length());
                                    if (o17 == o16) {
                                        int i47 = i46 + o17;
                                        i1Var.f15448d = i47;
                                        int a13 = z2.a(str4, bArr4, i47, i45 - i47);
                                        i1Var.f15448d = i46;
                                        i1Var.l((a13 - i46) - o17);
                                        i1Var.f15448d = a13;
                                    } else {
                                        i1Var.l(z2.b(str4));
                                        int i48 = i1Var.f15448d;
                                        i1Var.f15448d = z2.a(str4, bArr4, i48, i45 - i48);
                                    }
                                } catch (IndexOutOfBoundsException e11) {
                                    throw new IOException("CodedOutputStream was writing to a flat byte array and ran out of space.", e11);
                                }
                            } else {
                                i1Var.c(i19, (g1) object3);
                            }
                        }
                        i17 += 3;
                        i15 = 1048575;
                        j2Var = this;
                    case 60:
                        if (j2Var.s(i19, obj, i17)) {
                            d2Var.c(i19, unsafe.getObject(obj, j10), j2Var.B(i17));
                        }
                        i17 += 3;
                        i15 = 1048575;
                        j2Var = this;
                    case 61:
                        if (j2Var.s(i19, obj, i17)) {
                            i1Var.c(i19, (g1) unsafe.getObject(obj, j10));
                        }
                        i17 += 3;
                        i15 = 1048575;
                        j2Var = this;
                    case 62:
                        if (j2Var.s(i19, obj, i17)) {
                            i1Var.k(i19, v(j10, obj));
                        }
                        i17 += 3;
                        i15 = 1048575;
                        j2Var = this;
                    case ColorSpace.MAX_ID /* 63 */:
                        if (j2Var.s(i19, obj, i17)) {
                            i1Var.h(i19, v(j10, obj));
                        }
                        i17 += 3;
                        i15 = 1048575;
                        j2Var = this;
                    case 64:
                        if (j2Var.s(i19, obj, i17)) {
                            i1Var.d(i19, v(j10, obj));
                        }
                        i17 += 3;
                        i15 = 1048575;
                        j2Var = this;
                    case 65:
                        if (j2Var.s(i19, obj, i17)) {
                            i1Var.f(i19, z(j10, obj));
                        }
                        i17 += 3;
                        i15 = 1048575;
                        j2Var = this;
                    case 66:
                        if (j2Var.s(i19, obj, i17)) {
                            int v2 = v(j10, obj);
                            i1Var.k(i19, (v2 >> 31) ^ (v2 + v2));
                        }
                        i17 += 3;
                        i15 = 1048575;
                        j2Var = this;
                    case 67:
                        if (j2Var.s(i19, obj, i17)) {
                            long z3 = z(j10, obj);
                            i1Var.m(i19, (z3 >> 63) ^ (z3 + z3));
                        }
                        i17 += 3;
                        i15 = 1048575;
                        j2Var = this;
                    case 68:
                        if (j2Var.s(i19, obj, i17)) {
                            Object object4 = unsafe.getObject(obj, j10);
                            i1Var.j(i19, 3);
                            j2Var.B(i17).h((b1) object4, d2Var);
                            i1Var.j(i19, 4);
                        }
                        i17 += 3;
                        i15 = 1048575;
                        j2Var = this;
                    default:
                        i17 += 3;
                        i15 = 1048575;
                        j2Var = this;
                }
            } else {
                ((r1) obj).zzc.d(d2Var);
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x01ea, code lost:
    
        if (r2 != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d9, code lost:
    
        if (r2 != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00db, code lost:
    
        r6 = 1231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00dc, code lost:
    
        r1 = r6 + r1;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001e. Please report as an issue. */
    @Override // com.google.android.gms.internal.play_billing.p2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(com.google.android.gms.internal.play_billing.r1 r11) {
        /*
            Method dump skipped, instructions count: 726
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.j2.i(com.google.android.gms.internal.play_billing.r1):int");
    }

    public final void j(Object obj, int i, Object obj2) {
        if (!p(i, obj2)) {
            return;
        }
        int y10 = y(i) & 1048575;
        Unsafe unsafe = f15461k;
        long j10 = y10;
        Object object = unsafe.getObject(obj2, j10);
        if (object != null) {
            p2 B = B(i);
            if (!p(i, obj)) {
                if (!r(object)) {
                    unsafe.putObject(obj, j10, object);
                } else {
                    r1 a10 = B.a();
                    B.e(a10, object);
                    unsafe.putObject(obj, j10, a10);
                }
                l(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!r(object2)) {
                r1 a11 = B.a();
                B.e(a11, object2);
                unsafe.putObject(obj, j10, a11);
                object2 = a11;
            }
            B.e(object2, object);
            return;
        }
        androidx.datastore.preferences.protobuf.s1.g(this.f15462a[i], obj2);
    }

    public final void k(Object obj, int i, Object obj2) {
        int[] iArr = this.f15462a;
        int i10 = iArr[i];
        if (!s(i10, obj2, i)) {
            return;
        }
        int y10 = y(i) & 1048575;
        Unsafe unsafe = f15461k;
        long j10 = y10;
        Object object = unsafe.getObject(obj2, j10);
        if (object != null) {
            p2 B = B(i);
            if (!s(i10, obj, i)) {
                if (!r(object)) {
                    unsafe.putObject(obj, j10, object);
                } else {
                    r1 a10 = B.a();
                    B.e(a10, object);
                    unsafe.putObject(obj, j10, a10);
                }
                x2.j(iArr[i + 2] & 1048575, obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!r(object2)) {
                r1 a11 = B.a();
                B.e(a11, object2);
                unsafe.putObject(obj, j10, a11);
                object2 = a11;
            }
            B.e(object2, object);
            return;
        }
        androidx.datastore.preferences.protobuf.s1.g(iArr[i], obj2);
    }

    public final void l(int i, Object obj) {
        int i10 = this.f15462a[i + 2];
        long j10 = 1048575 & i10;
        if (j10 == 1048575) {
            return;
        }
        x2.j(j10, obj, (1 << (i10 >>> 20)) | x2.e(j10, obj));
    }

    public final void m(Object obj, int i, Object obj2) {
        f15461k.putObject(obj, y(i) & 1048575, obj2);
        l(i, obj);
    }

    public final void n(int i, int i10, Object obj, Object obj2) {
        f15461k.putObject(obj, y(i10) & 1048575, obj2);
        x2.j(this.f15462a[i10 + 2] & 1048575, obj, i);
    }

    public final boolean o(r1 r1Var, r1 r1Var2, int i) {
        if (p(i, r1Var) == p(i, r1Var2)) {
            return true;
        }
        return false;
    }

    public final boolean p(int i, Object obj) {
        int i10 = this.f15462a[i + 2];
        long j10 = i10 & 1048575;
        if (j10 == 1048575) {
            int y10 = y(i);
            long j11 = y10 & 1048575;
            switch (x(y10)) {
                case 0:
                    if (Double.doubleToRawLongBits(x2.f15547c.a(j11, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(x2.f15547c.b(j11, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (x2.f(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (x2.f(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (x2.e(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (x2.f(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (x2.e(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return x2.f15547c.g(j11, obj);
                case 8:
                    Object h3 = x2.h(j11, obj);
                    if (h3 instanceof String) {
                        if (((String) h3).isEmpty()) {
                            return false;
                        }
                    } else if (h3 instanceof g1) {
                        if (g1.f15429v.equals(h3)) {
                            return false;
                        }
                    } else {
                        q.x.m();
                        return false;
                    }
                    break;
                case 9:
                    if (x2.h(j11, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (g1.f15429v.equals(x2.h(j11, obj))) {
                        return false;
                    }
                    break;
                case 11:
                    if (x2.e(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (x2.e(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (x2.e(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (x2.f(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (x2.e(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (x2.f(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (x2.h(j11, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    q.x.m();
                    return false;
            }
        } else if (((1 << (i10 >>> 20)) & x2.e(j10, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean q(Object obj, int i, int i10, int i11, int i12) {
        if (i10 == 1048575) {
            return p(i, obj);
        }
        if ((i11 & i12) != 0) {
            return true;
        }
        return false;
    }

    public final boolean s(int i, Object obj, int i10) {
        if (x2.e(this.f15462a[i10 + 2] & 1048575, obj) == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:137:0x0460, code lost:
    
        r8 = r10;
        r7 = r11;
        r9 = r12;
        r3 = r13;
        r6 = r15;
        r15 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x04de, code lost:
    
        r1 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x02fc, code lost:
    
        androidx.datastore.preferences.protobuf.s1.v("Protocol message had invalid UTF-8.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0301, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0366, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x02a5, code lost:
    
        androidx.datastore.preferences.protobuf.s1.v("Protocol message had invalid UTF-8.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x02aa, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x056e, code lost:
    
        r9 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0e11, code lost:
    
        r1 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0e52, code lost:
    
        if (r1 == 1048575) goto L644;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0e54, code lost:
    
        r12.putInt(r9, r1, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0e58, code lost:
    
        r2 = r37.f15467g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0e5e, code lost:
    
        if (r2 >= r37.f15468h) goto L770;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0e60, code lost:
    
        r3 = r37.f15466f[r2];
        r6 = r21[r3];
        r6 = com.google.android.gms.internal.play_billing.x2.h(y(r3) & 1048575, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0e74, code lost:
    
        if (r6 == null) goto L651;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0e7a, code lost:
    
        if (A(r3) != null) goto L769;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0e7e, code lost:
    
        r6 = (com.google.android.gms.internal.play_billing.e2) r6;
        r3 = r3 / 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0e89, code lost:
    
        throw p.a.f(r17[r3 + r3]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0e8a, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0e8f, code lost:
    
        if (r0 != 0) goto L661;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0e91, code lost:
    
        if (r4 != r5) goto L659;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0e94, code lost:
    
        androidx.datastore.preferences.protobuf.s1.v("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0e99, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0ea0, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0e9c, code lost:
    
        if (r4 > r5) goto L665;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0e9e, code lost:
    
        if (r15 != r0) goto L665;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0ea1, code lost:
    
        androidx.datastore.preferences.protobuf.s1.v("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0ea4, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00e4, code lost:
    
        r5 = r41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00e6, code lost:
    
        r3 = r9;
        r8 = r10;
        r7 = r11;
        r9 = r12;
        r6 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0155, code lost:
    
        r3 = r2;
        r2 = r1;
        r1 = r3;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x00b9. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:317:0x05a9. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:723:0x0be5. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:187:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0b62  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0b51 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0e0a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0e1e  */
    /* JADX WARN: Removed duplicated region for block: B:728:0x0e03  */
    /* JADX WARN: Removed duplicated region for block: B:729:0x0df4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:809:0x005d A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v37, types: [java.util.LinkedHashMap, com.google.android.gms.internal.play_billing.e2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int t(java.lang.Object r38, byte[] r39, int r40, int r41, int r42, com.google.android.gms.internal.ads.fm1 r43) {
        /*
            Method dump skipped, instructions count: 3912
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.j2.t(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.fm1):int");
    }

    public final int w(int i, int i10) {
        int[] iArr = this.f15462a;
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

    public final int y(int i) {
        return this.f15462a[i + 1];
    }
}
