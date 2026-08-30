package com.google.android.gms.internal.measurement;
import a4.g;
import a4.h;
import e6.b;
import e6.c;
import e6.e;
import g5.q;
import g6.a;
import g6.b;
import h5.a;
import o0.c;
import p.a;
import q.x;
import r5.a;
import r5.h;
import r5.i;
import r5.j;

import androidx.ink.brush.color.colorspace.ColorSpace;
import com.google.android.gms.internal.ads.gl;
import com.google.android.gms.internal.ads.wd0;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class t5 implements a6 {
    public static final int[] i = new int[0];

    /* renamed from: j, reason: collision with root package name */
    public static final Unsafe f13920j = e();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f13921a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f13922b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13923c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13924d;
    public final m4 e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f13925f;

    /* renamed from: g, reason: collision with root package name */
    public final int f13926g;

    /* renamed from: h, reason: collision with root package name */
    public final int f13927h;

    public t5(int[] iArr, Object[] objArr, int i10, int i11, m4 m4Var, int[] iArr2, int i12, int i13, c5 c5Var) {
        this.f13921a = iArr;
        this.f13922b = objArr;
        this.f13923c = i10;
        this.f13924d = i11;
        this.f13925f = iArr2;
        this.f13926g = i12;
        this.f13927h = i13;
        this.e = m4Var;
    }

    public static boolean D(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof b5) {
            return ((b5) obj).o();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0266  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.measurement.t5 k(com.google.android.gms.internal.measurement.z5 r34, com.google.android.gms.internal.measurement.c5 r35) {
        /*
            Method dump skipped, instructions count: 1036
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.t5.k(com.google.android.gms.internal.measurement.z5, com.google.android.gms.internal.measurement.c5):com.google.android.gms.internal.measurement.t5");
    }

    public static Field n(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder q10 = a.q("Field ", str, " for ", name, " not found. Known fields are ");
            q10.append(arrays);
            throw new RuntimeException(q10.toString());
        }
    }

    public static int v(long j10, Object obj) {
        return ((Integer) e6.j(j10, obj)).intValue();
    }

    public static long z(long j10, Object obj) {
        return ((Long) e6.j(j10, obj)).longValue();
    }

    public final a2 A(int i10) {
        return (a2) this.f13922b[((i10 / 3) << 1) + 1];
    }

    public final a6 B(int i10) {
        int i11 = (i10 / 3) << 1;
        Object[] objArr = this.f13922b;
        a6 a6Var = (a6) objArr[i11];
        if (a6Var != null) {
            return a6Var;
        }
        a6 a10 = y5.f13983c.a((Class) objArr[i11 + 1]);
        objArr[i11] = a10;
        return a10;
    }

    public final Object C(int i10) {
        return this.f13922b[(i10 / 3) << 1];
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public final boolean a(Object obj) {
        int i10;
        int i11;
        int i12;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        while (i15 < this.f13926g) {
            int i16 = this.f13925f[i15];
            int[] iArr = this.f13921a;
            int i17 = iArr[i16];
            int u9 = u(i16);
            int i18 = iArr[i16 + 2];
            int i19 = i18 & 1048575;
            int i20 = 1 << (i18 >>> 20);
            if (i19 != i13) {
                if (i19 != 1048575) {
                    i14 = f13920j.getInt(obj, i19);
                }
                i11 = i16;
                i12 = i14;
                i10 = i19;
            } else {
                int i21 = i14;
                i10 = i13;
                i11 = i16;
                i12 = i21;
            }
            if ((268435456 & u9) == 0 || r(obj, i11, i10, i12, i20)) {
                int i22 = (267386880 & u9) >>> 20;
                if (i22 != 9 && i22 != 17) {
                    if (i22 != 27) {
                        if (i22 != 60 && i22 != 68) {
                            if (i22 != 49) {
                                if (i22 == 50 && !((q5) e6.j(u9 & 1048575, obj)).isEmpty()) {
                                    if (C(i11) != null) {
                                        q.b();
                                        return false;
                                    }
                                    throw new NoSuchMethodError();
                                }
                            }
                        } else if (x(i17, obj, i11) && !B(i11).a(e6.j(u9 & 1048575, obj))) {
                        }
                        i15++;
                        i13 = i10;
                        i14 = i12;
                    }
                    List list = (List) e6.j(u9 & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        a6 B = B(i11);
                        for (int i23 = 0; i23 < list.size(); i23++) {
                            if (B.a(list.get(i23))) {
                            }
                        }
                    }
                    i15++;
                    i13 = i10;
                    i14 = i12;
                } else {
                    if (r(obj, i11, i10, i12, i20) && !B(i11).a(e6.j(u9 & 1048575, obj))) {
                    }
                    i15++;
                    i13 = i10;
                    i14 = i12;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006d, code lost:
    
        if (com.google.android.gms.internal.measurement.a4.j(com.google.android.gms.internal.measurement.e6.j(r7, r12), com.google.android.gms.internal.measurement.e6.j(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0082, code lost:
    
        if (r5.k(r7, r12) != r5.k(r7, r13)) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0095, code lost:
    
        if (j(r7, r12) != j(r7, r13)) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00aa, code lost:
    
        if (r5.k(r7, r12) != r5.k(r7, r13)) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bd, code lost:
    
        if (j(r7, r12) != j(r7, r13)) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d1, code lost:
    
        if (j(r7, r12) != j(r7, r13)) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e5, code lost:
    
        if (j(r7, r12) != j(r7, r13)) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00fb, code lost:
    
        if (com.google.android.gms.internal.measurement.a4.j(com.google.android.gms.internal.measurement.e6.j(r7, r12), com.google.android.gms.internal.measurement.e6.j(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0111, code lost:
    
        if (com.google.android.gms.internal.measurement.a4.j(com.google.android.gms.internal.measurement.e6.j(r7, r12), com.google.android.gms.internal.measurement.e6.j(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0127, code lost:
    
        if (com.google.android.gms.internal.measurement.a4.j(com.google.android.gms.internal.measurement.e6.j(r7, r12), com.google.android.gms.internal.measurement.e6.j(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x013b, code lost:
    
        if (i(r7, r12) != i(r7, r13)) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x014f, code lost:
    
        if (j(r7, r12) != j(r7, r13)) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0165, code lost:
    
        if (r5.k(r7, r12) != r5.k(r7, r13)) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0179, code lost:
    
        if (j(r7, r12) != j(r7, r13)) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x018f, code lost:
    
        if (r5.k(r7, r12) != r5.k(r7, r13)) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01a5, code lost:
    
        if (r5.k(r7, r12) != r5.k(r7, r13)) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01c1, code lost:
    
        if (java.lang.Float.floatToIntBits(h(r7, r12)) != java.lang.Float.floatToIntBits(h(r7, r13))) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01df, code lost:
    
        if (java.lang.Double.doubleToLongBits(a(r7, r12)) != java.lang.Double.doubleToLongBits(a(r7, r13))) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003a, code lost:
    
        if (com.google.android.gms.internal.measurement.a4.j(com.google.android.gms.internal.measurement.e6.j(r7, r12), com.google.android.gms.internal.measurement.e6.j(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0017. Please report as an issue. */
    @Override // com.google.android.gms.internal.measurement.a6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(com.google.android.gms.internal.measurement.b5 r12, com.google.android.gms.internal.measurement.b5 r13) {
        /*
            Method dump skipped, instructions count: 644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.t5.b(com.google.android.gms.internal.measurement.b5, com.google.android.gms.internal.measurement.b5):boolean");
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public final void c(Object obj) {
        if (D(obj)) {
            if (obj instanceof b5) {
                b5 b5Var = (b5) obj;
                b5Var.j(Integer.MAX_VALUE);
                b5Var.zza = 0;
                b5Var.n();
            }
            int[] iArr = this.f13921a;
            int length = iArr.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int u9 = u(i10);
                long j10 = 1048575 & u9;
                int i11 = (u9 & 267386880) >>> 20;
                if (i11 != 9) {
                    if (i11 != 60 && i11 != 68) {
                        switch (i11) {
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
                                o4 o4Var = (o4) ((i5) e6.j(j10, obj));
                                if (o4Var.f13871u) {
                                    o4Var.f13871u = false;
                                    break;
                                } else {
                                    break;
                                }
                            case 50:
                                Unsafe unsafe = f13920j;
                                Object object = unsafe.getObject(obj, j10);
                                if (object != null) {
                                    ((q5) object).f13890u = false;
                                    unsafe.putObject(obj, j10, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (x(iArr[i10], obj, i10)) {
                        B(i10).c(f13920j.getObject(obj, j10));
                    }
                }
                if (w(i10, obj)) {
                    B(i10).c(f13920j.getObject(obj, j10));
                }
            }
            b6 b6Var = ((b5) obj).zzb;
            if (b6Var.e) {
                b6Var.e = false;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x004c. Please report as an issue. */
    @Override // com.google.android.gms.internal.measurement.a6
    public final int d(b5 b5Var) {
        int i10;
        int t3;
        int r8;
        int t10;
        int r10;
        int m4;
        int t11;
        int a10;
        int t12;
        int i11;
        int size;
        int t13;
        int size2;
        int t14;
        int s10;
        int size3;
        int C;
        int s11;
        int t15;
        int s12;
        int i12;
        int i13;
        int size4;
        int s13;
        int t16;
        int i14;
        int t17;
        int r11;
        int t18;
        int r12;
        t5 t5Var = this;
        b5 b5Var2 = b5Var;
        Unsafe unsafe = f13920j;
        int i15 = 1048575;
        int i16 = 1048575;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (true) {
            int[] iArr = t5Var.f13921a;
            if (i17 < iArr.length) {
                int u9 = t5Var.u(i17);
                int i20 = (267386880 & u9) >>> 20;
                int i21 = iArr[i17];
                int i22 = iArr[i17 + 2];
                int i23 = i22 & i15;
                if (i20 <= 17) {
                    if (i23 != i16) {
                        if (i23 == i15) {
                            i18 = 0;
                        } else {
                            i18 = unsafe.getInt(b5Var2, i23);
                        }
                        i16 = i23;
                    }
                    i10 = 1 << (i22 >>> 20);
                } else {
                    i10 = 0;
                }
                long j10 = u9 & i15;
                if (i20 >= w4.f13954v.f13958u) {
                    int i24 = w4.f13955w.f13958u;
                }
                switch (i20) {
                    case 0:
                        if (t5Var.r(b5Var2, i17, i16, i18, i10)) {
                            i19 = wd0.t(i21 << 3, 8, i19);
                        }
                        i17 += 3;
                        i15 = 1048575;
                        t5Var = this;
                    case 1:
                        if (t5Var.r(b5Var2, i17, i16, i18, i10)) {
                            i19 = wd0.t(i21 << 3, 4, i19);
                        }
                        b5Var2 = b5Var;
                        i17 += 3;
                        i15 = 1048575;
                        t5Var = this;
                    case 2:
                        if (t5Var.r(b5Var2, i17, i16, i18, i10)) {
                            long j11 = unsafe.getLong(b5Var2, j10);
                            t3 = t4.t(i21 << 3);
                            r8 = t4.r(j11);
                            i11 = r8 + t3;
                            i19 += i11;
                            i17 += 3;
                            i15 = 1048575;
                            t5Var = this;
                        } else {
                            i17 += 3;
                            i15 = 1048575;
                            t5Var = this;
                        }
                    case 3:
                        if (t5Var.r(b5Var2, i17, i16, i18, i10)) {
                            long j12 = unsafe.getLong(b5Var2, j10);
                            t3 = t4.t(i21 << 3);
                            r8 = t4.r(j12);
                            i11 = r8 + t3;
                            i19 += i11;
                            i17 += 3;
                            i15 = 1048575;
                            t5Var = this;
                        } else {
                            i17 += 3;
                            i15 = 1048575;
                            t5Var = this;
                        }
                    case 4:
                        if (t5Var.r(b5Var2, i17, i16, i18, i10)) {
                            int i25 = unsafe.getInt(b5Var2, j10);
                            t10 = t4.t(i21 << 3);
                            r10 = t4.r(i25);
                            m4 = r10 + t10;
                            i19 += m4;
                            i17 += 3;
                            i15 = 1048575;
                            t5Var = this;
                        } else {
                            i17 += 3;
                            i15 = 1048575;
                            t5Var = this;
                        }
                    case 5:
                        if (t5Var.r(b5Var2, i17, i16, i18, i10)) {
                            i19 = wd0.t(i21 << 3, 8, i19);
                        }
                        b5Var2 = b5Var;
                        i17 += 3;
                        i15 = 1048575;
                        t5Var = this;
                    case 6:
                        if (t5Var.r(b5Var2, i17, i16, i18, i10)) {
                            i19 = wd0.t(i21 << 3, 4, i19);
                        }
                        b5Var2 = b5Var;
                        i17 += 3;
                        i15 = 1048575;
                        t5Var = this;
                    case 7:
                        if (t5Var.r(b5Var2, i17, i16, i18, i10)) {
                            i19 = wd0.t(i21 << 3, 1, i19);
                        }
                        b5Var2 = b5Var;
                        i17 += 3;
                        i15 = 1048575;
                        t5Var = this;
                    case 8:
                        if (t5Var.r(b5Var2, i17, i16, i18, i10)) {
                            Object object = unsafe.getObject(b5Var2, j10);
                            if (object instanceof s4) {
                                m4 = t4.m(i21, (s4) object);
                                i19 += m4;
                                i17 += 3;
                                i15 = 1048575;
                                t5Var = this;
                            } else {
                                t10 = t4.t(i21 << 3);
                                r10 = t4.h((String) object);
                                m4 = r10 + t10;
                                i19 += m4;
                                i17 += 3;
                                i15 = 1048575;
                                t5Var = this;
                            }
                        } else {
                            i17 += 3;
                            i15 = 1048575;
                            t5Var = this;
                        }
                    case 9:
                        if (t5Var.r(b5Var2, i17, i16, i18, i10)) {
                            Object object2 = unsafe.getObject(b5Var2, j10);
                            a6 B = t5Var.B(i17);
                            t11 = t4.t(i21 << 3);
                            a10 = ((m4) object2).a(B);
                            t12 = t4.t(a10);
                            i13 = t12 + a10 + t11;
                            i19 += i13;
                            i17 += 3;
                            i15 = 1048575;
                            t5Var = this;
                        } else {
                            i17 += 3;
                            i15 = 1048575;
                            t5Var = this;
                        }
                    case 10:
                        if (t5Var.r(b5Var2, i17, i16, i18, i10)) {
                            m4 = t4.m(i21, (s4) unsafe.getObject(b5Var2, j10));
                            i19 += m4;
                            i17 += 3;
                            i15 = 1048575;
                            t5Var = this;
                        } else {
                            i17 += 3;
                            i15 = 1048575;
                            t5Var = this;
                        }
                    case 11:
                        if (t5Var.r(b5Var2, i17, i16, i18, i10)) {
                            i19 = wd0.t(unsafe.getInt(b5Var2, j10), t4.t(i21 << 3), i19);
                        }
                        i17 += 3;
                        i15 = 1048575;
                        t5Var = this;
                    case 12:
                        if (t5Var.r(b5Var2, i17, i16, i18, i10)) {
                            int i26 = unsafe.getInt(b5Var2, j10);
                            t10 = t4.t(i21 << 3);
                            r10 = t4.r(i26);
                            m4 = r10 + t10;
                            i19 += m4;
                            i17 += 3;
                            i15 = 1048575;
                            t5Var = this;
                        } else {
                            i17 += 3;
                            i15 = 1048575;
                            t5Var = this;
                        }
                    case 13:
                        if (t5Var.r(b5Var2, i17, i16, i18, i10)) {
                            i19 = wd0.t(i21 << 3, 4, i19);
                        }
                        b5Var2 = b5Var;
                        i17 += 3;
                        i15 = 1048575;
                        t5Var = this;
                    case 14:
                        if (t5Var.r(b5Var2, i17, i16, i18, i10)) {
                            i19 = wd0.t(i21 << 3, 8, i19);
                        }
                        b5Var2 = b5Var;
                        i17 += 3;
                        i15 = 1048575;
                        t5Var = this;
                    case 15:
                        if (t5Var.r(b5Var2, i17, i16, i18, i10)) {
                            int i27 = unsafe.getInt(b5Var2, j10);
                            i19 = wd0.t((i27 >> 31) ^ (i27 << 1), t4.t(i21 << 3), i19);
                        }
                        i17 += 3;
                        i15 = 1048575;
                        t5Var = this;
                    case 16:
                        if (t5Var.r(b5Var2, i17, i16, i18, i10)) {
                            long j13 = unsafe.getLong(b5Var2, j10);
                            t3 = t4.t(i21 << 3);
                            r8 = t4.r((j13 >> 63) ^ (j13 << 1));
                            i11 = r8 + t3;
                            i19 += i11;
                            i17 += 3;
                            i15 = 1048575;
                            t5Var = this;
                        } else {
                            i17 += 3;
                            i15 = 1048575;
                            t5Var = this;
                        }
                    case 17:
                        if (t5Var.r(b5Var2, i17, i16, i18, i10)) {
                            i11 = t4.g(i21, (m4) unsafe.getObject(b5Var2, j10), t5Var.B(i17));
                            i19 += i11;
                            i17 += 3;
                            i15 = 1048575;
                            t5Var = this;
                        } else {
                            i17 += 3;
                            i15 = 1048575;
                            t5Var = this;
                        }
                    case 18:
                        size = ((List) unsafe.getObject(b5Var2, j10)).size();
                        if (size != 0) {
                            t13 = t4.t(i21 << 3);
                            i13 = (t13 + 8) * size;
                            i19 += i13;
                            i17 += 3;
                            i15 = 1048575;
                            t5Var = this;
                        }
                        i13 = 0;
                        i19 += i13;
                        i17 += 3;
                        i15 = 1048575;
                        t5Var = this;
                    case 19:
                        size2 = ((List) unsafe.getObject(b5Var2, j10)).size();
                        if (size2 != 0) {
                            t14 = t4.t(i21 << 3);
                            i12 = (t14 + 4) * size2;
                            i19 += i12;
                            i17 += 3;
                            i15 = 1048575;
                            t5Var = this;
                        }
                        i12 = 0;
                        i19 += i12;
                        i17 += 3;
                        i15 = 1048575;
                        t5Var = this;
                    case 20:
                        List list = (List) unsafe.getObject(b5Var2, j10);
                        if (list.size() != 0) {
                            s10 = (t4.s(i21) * list.size()) + a4.u(list);
                            i19 += s10;
                            i17 += 3;
                            i15 = 1048575;
                            t5Var = this;
                        }
                        s10 = 0;
                        i19 += s10;
                        i17 += 3;
                        i15 = 1048575;
                        t5Var = this;
                    case gl.zzm /* 21 */:
                        List list2 = (List) unsafe.getObject(b5Var2, j10);
                        size3 = list2.size();
                        if (size3 != 0) {
                            C = a4.C(list2);
                            s11 = t4.s(i21);
                            s10 = (s11 * size3) + C;
                            i19 += s10;
                            i17 += 3;
                            i15 = 1048575;
                            t5Var = this;
                        }
                        s10 = 0;
                        i19 += s10;
                        i17 += 3;
                        i15 = 1048575;
                        t5Var = this;
                    case 22:
                        List list3 = (List) unsafe.getObject(b5Var2, j10);
                        size3 = list3.size();
                        if (size3 != 0) {
                            C = a4.s(list3);
                            s11 = t4.s(i21);
                            s10 = (s11 * size3) + C;
                            i19 += s10;
                            i17 += 3;
                            i15 = 1048575;
                            t5Var = this;
                        }
                        s10 = 0;
                        i19 += s10;
                        i17 += 3;
                        i15 = 1048575;
                        t5Var = this;
                    case 23:
                        size = ((List) unsafe.getObject(b5Var2, j10)).size();
                        if (size != 0) {
                            t13 = t4.t(i21 << 3);
                            i13 = (t13 + 8) * size;
                            i19 += i13;
                            i17 += 3;
                            i15 = 1048575;
                            t5Var = this;
                        }
                        i13 = 0;
                        i19 += i13;
                        i17 += 3;
                        i15 = 1048575;
                        t5Var = this;
                    case 24:
                        size2 = ((List) unsafe.getObject(b5Var2, j10)).size();
                        if (size2 != 0) {
                            t14 = t4.t(i21 << 3);
                            i12 = (t14 + 4) * size2;
                            i19 += i12;
                            i17 += 3;
                            i15 = 1048575;
                            t5Var = this;
                        }
                        i12 = 0;
                        i19 += i12;
                        i17 += 3;
                        i15 = 1048575;
                        t5Var = this;
                    case 25:
                        int size5 = ((List) unsafe.getObject(b5Var2, j10)).size();
                        if (size5 == 0) {
                            t15 = 0;
                        } else {
                            t15 = (t4.t(i21 << 3) + 1) * size5;
                        }
                        i19 += t15;
                        i17 += 3;
                        i15 = 1048575;
                        t5Var = this;
                    case 26:
                        List list4 = (List) unsafe.getObject(b5Var2, j10);
                        int size6 = list4.size();
                        if (size6 != 0) {
                            s10 = t4.s(i21) * size6;
                            if (list4 instanceof m5) {
                                m5 m5Var = (m5) list4;
                                for (int i28 = 0; i28 < size6; i28++) {
                                    Object zza = m5Var.zza();
                                    if (zza instanceof s4) {
                                        int k3 = ((s4) zza).k();
                                        s10 = wd0.t(k3, k3, s10);
                                    } else {
                                        s10 = t4.h((String) zza) + s10;
                                    }
                                }
                            } else {
                                for (int i29 = 0; i29 < size6; i29++) {
                                    Object obj = list4.get(i29);
                                    if (obj instanceof s4) {
                                        int k4 = ((s4) obj).k();
                                        s10 = wd0.t(k4, k4, s10);
                                    } else {
                                        s10 = t4.h((String) obj) + s10;
                                    }
                                }
                            }
                            i19 += s10;
                            i17 += 3;
                            i15 = 1048575;
                            t5Var = this;
                        }
                        s10 = 0;
                        i19 += s10;
                        i17 += 3;
                        i15 = 1048575;
                        t5Var = this;
                    case 27:
                        List list5 = (List) unsafe.getObject(b5Var2, j10);
                        a6 B2 = t5Var.B(i17);
                        int size7 = list5.size();
                        if (size7 == 0) {
                            s12 = 0;
                        } else {
                            s12 = t4.s(i21) * size7;
                            for (int i30 = 0; i30 < size7; i30++) {
                                int a11 = ((m4) list5.get(i30)).a(B2);
                                s12 = wd0.t(a11, a11, s12);
                            }
                        }
                        i19 += s12;
                        i17 += 3;
                        i15 = 1048575;
                        t5Var = this;
                    case 28:
                        List list6 = (List) unsafe.getObject(b5Var2, j10);
                        int size8 = list6.size();
                        if (size8 != 0) {
                            s10 = t4.s(i21) * size8;
                            for (int i31 = 0; i31 < list6.size(); i31++) {
                                int k10 = ((s4) list6.get(i31)).k();
                                s10 = wd0.t(k10, k10, s10);
                            }
                            i19 += s10;
                            i17 += 3;
                            i15 = 1048575;
                            t5Var = this;
                        }
                        s10 = 0;
                        i19 += s10;
                        i17 += 3;
                        i15 = 1048575;
                        t5Var = this;
                    case 29:
                        List list7 = (List) unsafe.getObject(b5Var2, j10);
                        size3 = list7.size();
                        if (size3 != 0) {
                            C = a4.A(list7);
                            s11 = t4.s(i21);
                            s10 = (s11 * size3) + C;
                            i19 += s10;
                            i17 += 3;
                            i15 = 1048575;
                            t5Var = this;
                        }
                        s10 = 0;
                        i19 += s10;
                        i17 += 3;
                        i15 = 1048575;
                        t5Var = this;
                    case 30:
                        List list8 = (List) unsafe.getObject(b5Var2, j10);
                        size3 = list8.size();
                        if (size3 != 0) {
                            C = a4.k(list8);
                            s11 = t4.s(i21);
                            s10 = (s11 * size3) + C;
                            i19 += s10;
                            i17 += 3;
                            i15 = 1048575;
                            t5Var = this;
                        }
                        s10 = 0;
                        i19 += s10;
                        i17 += 3;
                        i15 = 1048575;
                        t5Var = this;
                    case 31:
                        size2 = ((List) unsafe.getObject(b5Var2, j10)).size();
                        if (size2 != 0) {
                            t14 = t4.t(i21 << 3);
                            i12 = (t14 + 4) * size2;
                            i19 += i12;
                            i17 += 3;
                            i15 = 1048575;
                            t5Var = this;
                        }
                        i12 = 0;
                        i19 += i12;
                        i17 += 3;
                        i15 = 1048575;
                        t5Var = this;
                    case 32:
                        size = ((List) unsafe.getObject(b5Var2, j10)).size();
                        if (size != 0) {
                            t13 = t4.t(i21 << 3);
                            i13 = (t13 + 8) * size;
                            i19 += i13;
                            i17 += 3;
                            i15 = 1048575;
                            t5Var = this;
                        }
                        i13 = 0;
                        i19 += i13;
                        i17 += 3;
                        i15 = 1048575;
                        t5Var = this;
                    case 33:
                        List list9 = (List) unsafe.getObject(b5Var2, j10);
                        size3 = list9.size();
                        if (size3 != 0) {
                            C = a4.w(list9);
                            s11 = t4.s(i21);
                            s10 = (s11 * size3) + C;
                            i19 += s10;
                            i17 += 3;
                            i15 = 1048575;
                            t5Var = this;
                        }
                        s10 = 0;
                        i19 += s10;
                        i17 += 3;
                        i15 = 1048575;
                        t5Var = this;
                    case 34:
                        List list10 = (List) unsafe.getObject(b5Var2, j10);
                        size3 = list10.size();
                        if (size3 != 0) {
                            C = a4.y(list10);
                            s11 = t4.s(i21);
                            s10 = (s11 * size3) + C;
                            i19 += s10;
                            i17 += 3;
                            i15 = 1048575;
                            t5Var = this;
                        }
                        s10 = 0;
                        i19 += s10;
                        i17 += 3;
                        i15 = 1048575;
                        t5Var = this;
                    case 35:
                        size4 = ((List) unsafe.getObject(b5Var2, j10)).size() << 3;
                        if (size4 > 0) {
                            s13 = t4.s(i21);
                            t16 = t4.t(size4);
                            i12 = t16 + s13 + size4;
                            i19 += i12;
                            i17 += 3;
                            i15 = 1048575;
                            t5Var = this;
                        } else {
                            i17 += 3;
                            i15 = 1048575;
                            t5Var = this;
                        }
                    case 36:
                        size4 = ((List) unsafe.getObject(b5Var2, j10)).size() << 2;
                        if (size4 > 0) {
                            s13 = t4.s(i21);
                            t16 = t4.t(size4);
                            i12 = t16 + s13 + size4;
                            i19 += i12;
                            i17 += 3;
                            i15 = 1048575;
                            t5Var = this;
                        } else {
                            i17 += 3;
                            i15 = 1048575;
                            t5Var = this;
                        }
                    case 37:
                        size4 = a4.u((List) unsafe.getObject(b5Var2, j10));
                        if (size4 > 0) {
                            s13 = t4.s(i21);
                            t16 = t4.t(size4);
                            i12 = t16 + s13 + size4;
                            i19 += i12;
                            i17 += 3;
                            i15 = 1048575;
                            t5Var = this;
                        } else {
                            i17 += 3;
                            i15 = 1048575;
                            t5Var = this;
                        }
                    case 38:
                        size4 = a4.C((List) unsafe.getObject(b5Var2, j10));
                        if (size4 > 0) {
                            s13 = t4.s(i21);
                            t16 = t4.t(size4);
                            i12 = t16 + s13 + size4;
                            i19 += i12;
                            i17 += 3;
                            i15 = 1048575;
                            t5Var = this;
                        } else {
                            i17 += 3;
                            i15 = 1048575;
                            t5Var = this;
                        }
                    case 39:
                        size4 = a4.s((List) unsafe.getObject(b5Var2, j10));
                        if (size4 > 0) {
                            s13 = t4.s(i21);
                            t16 = t4.t(size4);
                            i12 = t16 + s13 + size4;
                            i19 += i12;
                            i17 += 3;
                            i15 = 1048575;
                            t5Var = this;
                        } else {
                            i17 += 3;
                            i15 = 1048575;
                            t5Var = this;
                        }
                    case 40:
                        size4 = ((List) unsafe.getObject(b5Var2, j10)).size() << 3;
                        if (size4 > 0) {
                            s13 = t4.s(i21);
                            t16 = t4.t(size4);
                            i12 = t16 + s13 + size4;
                            i19 += i12;
                            i17 += 3;
                            i15 = 1048575;
                            t5Var = this;
                        } else {
                            i17 += 3;
                            i15 = 1048575;
                            t5Var = this;
                        }
                    case 41:
                        size4 = ((List) unsafe.getObject(b5Var2, j10)).size() << 2;
                        if (size4 > 0) {
                            s13 = t4.s(i21);
                            t16 = t4.t(size4);
                            i12 = t16 + s13 + size4;
                            i19 += i12;
                            i17 += 3;
                            i15 = 1048575;
                            t5Var = this;
                        } else {
                            i17 += 3;
                            i15 = 1048575;
                            t5Var = this;
                        }
                    case 42:
                        size4 = ((List) unsafe.getObject(b5Var2, j10)).size();
                        if (size4 > 0) {
                            s13 = t4.s(i21);
                            t16 = t4.t(size4);
                            i12 = t16 + s13 + size4;
                            i19 += i12;
                            i17 += 3;
                            i15 = 1048575;
                            t5Var = this;
                        } else {
                            i17 += 3;
                            i15 = 1048575;
                            t5Var = this;
                        }
                    case 43:
                        size4 = a4.A((List) unsafe.getObject(b5Var2, j10));
                        if (size4 > 0) {
                            s13 = t4.s(i21);
                            t16 = t4.t(size4);
                            i12 = t16 + s13 + size4;
                            i19 += i12;
                            i17 += 3;
                            i15 = 1048575;
                            t5Var = this;
                        } else {
                            i17 += 3;
                            i15 = 1048575;
                            t5Var = this;
                        }
                    case 44:
                        size4 = a4.k((List) unsafe.getObject(b5Var2, j10));
                        if (size4 > 0) {
                            s13 = t4.s(i21);
                            t16 = t4.t(size4);
                            i12 = t16 + s13 + size4;
                            i19 += i12;
                            i17 += 3;
                            i15 = 1048575;
                            t5Var = this;
                        } else {
                            i17 += 3;
                            i15 = 1048575;
                            t5Var = this;
                        }
                    case 45:
                        size4 = ((List) unsafe.getObject(b5Var2, j10)).size() << 2;
                        if (size4 > 0) {
                            s13 = t4.s(i21);
                            t16 = t4.t(size4);
                            i12 = t16 + s13 + size4;
                            i19 += i12;
                            i17 += 3;
                            i15 = 1048575;
                            t5Var = this;
                        } else {
                            i17 += 3;
                            i15 = 1048575;
                            t5Var = this;
                        }
                    case 46:
                        size4 = ((List) unsafe.getObject(b5Var2, j10)).size() << 3;
                        if (size4 > 0) {
                            s13 = t4.s(i21);
                            t16 = t4.t(size4);
                            i12 = t16 + s13 + size4;
                            i19 += i12;
                            i17 += 3;
                            i15 = 1048575;
                            t5Var = this;
                        } else {
                            i17 += 3;
                            i15 = 1048575;
                            t5Var = this;
                        }
                    case 47:
                        size4 = a4.w((List) unsafe.getObject(b5Var2, j10));
                        if (size4 > 0) {
                            s13 = t4.s(i21);
                            t16 = t4.t(size4);
                            i12 = t16 + s13 + size4;
                            i19 += i12;
                            i17 += 3;
                            i15 = 1048575;
                            t5Var = this;
                        } else {
                            i17 += 3;
                            i15 = 1048575;
                            t5Var = this;
                        }
                    case 48:
                        size4 = a4.y((List) unsafe.getObject(b5Var2, j10));
                        if (size4 > 0) {
                            s13 = t4.s(i21);
                            t16 = t4.t(size4);
                            i12 = t16 + s13 + size4;
                            i19 += i12;
                            i17 += 3;
                            i15 = 1048575;
                            t5Var = this;
                        } else {
                            i17 += 3;
                            i15 = 1048575;
                            t5Var = this;
                        }
                    case 49:
                        List list11 = (List) unsafe.getObject(b5Var2, j10);
                        a6 B3 = t5Var.B(i17);
                        int size9 = list11.size();
                        if (size9 == 0) {
                            i14 = 0;
                        } else {
                            i14 = 0;
                            for (int i32 = 0; i32 < size9; i32++) {
                                i14 += t4.g(i21, (m4) list11.get(i32), B3);
                            }
                        }
                        i19 += i14;
                        i17 += 3;
                        i15 = 1048575;
                        t5Var = this;
                    case 50:
                        q5 q5Var = (q5) unsafe.getObject(b5Var2, j10);
                        if (t5Var.C(i17) == null) {
                            if (q5Var.isEmpty()) {
                                continue;
                            } else {
                                Iterator it = q5Var.entrySet().iterator();
                                if (it.hasNext()) {
                                    Map.Entry entry = (Map.Entry) it.next();
                                    entry.getKey();
                                    entry.getValue();
                                    throw new NoSuchMethodError();
                                }
                            }
                            i17 += 3;
                            i15 = 1048575;
                            t5Var = this;
                        } else {
                            q.b();
                            return 0;
                        }
                    case 51:
                        if (t5Var.x(i21, b5Var2, i17)) {
                            i19 = wd0.t(i21 << 3, 8, i19);
                        }
                        i17 += 3;
                        i15 = 1048575;
                        t5Var = this;
                    case 52:
                        if (t5Var.x(i21, b5Var2, i17)) {
                            i19 = wd0.t(i21 << 3, 4, i19);
                        }
                        i17 += 3;
                        i15 = 1048575;
                        t5Var = this;
                    case 53:
                        if (t5Var.x(i21, b5Var2, i17)) {
                            long z3 = z(j10, b5Var2);
                            t17 = t4.t(i21 << 3);
                            r11 = t4.r(z3);
                            i13 = r11 + t17;
                            i19 += i13;
                            i17 += 3;
                            i15 = 1048575;
                            t5Var = this;
                        } else {
                            i17 += 3;
                            i15 = 1048575;
                            t5Var = this;
                        }
                    case 54:
                        if (t5Var.x(i21, b5Var2, i17)) {
                            long z9 = z(j10, b5Var2);
                            t17 = t4.t(i21 << 3);
                            r11 = t4.r(z9);
                            i13 = r11 + t17;
                            i19 += i13;
                            i17 += 3;
                            i15 = 1048575;
                            t5Var = this;
                        } else {
                            i17 += 3;
                            i15 = 1048575;
                            t5Var = this;
                        }
                    case 55:
                        if (t5Var.x(i21, b5Var2, i17)) {
                            int v2 = v(j10, b5Var2);
                            t18 = t4.t(i21 << 3);
                            r12 = t4.r(v2);
                            i11 = r12 + t18;
                            i19 += i11;
                            i17 += 3;
                            i15 = 1048575;
                            t5Var = this;
                        } else {
                            i17 += 3;
                            i15 = 1048575;
                            t5Var = this;
                        }
                    case 56:
                        if (t5Var.x(i21, b5Var2, i17)) {
                            i19 = wd0.t(i21 << 3, 8, i19);
                        }
                        i17 += 3;
                        i15 = 1048575;
                        t5Var = this;
                    case 57:
                        if (t5Var.x(i21, b5Var2, i17)) {
                            i19 = wd0.t(i21 << 3, 4, i19);
                        }
                        i17 += 3;
                        i15 = 1048575;
                        t5Var = this;
                    case 58:
                        if (t5Var.x(i21, b5Var2, i17)) {
                            i19 = wd0.t(i21 << 3, 1, i19);
                        }
                        i17 += 3;
                        i15 = 1048575;
                        t5Var = this;
                    case 59:
                        if (t5Var.x(i21, b5Var2, i17)) {
                            Object object3 = unsafe.getObject(b5Var2, j10);
                            if (object3 instanceof s4) {
                                i11 = t4.m(i21, (s4) object3);
                                i19 += i11;
                                i17 += 3;
                                i15 = 1048575;
                                t5Var = this;
                            } else {
                                t18 = t4.t(i21 << 3);
                                r12 = t4.h((String) object3);
                                i11 = r12 + t18;
                                i19 += i11;
                                i17 += 3;
                                i15 = 1048575;
                                t5Var = this;
                            }
                        } else {
                            i17 += 3;
                            i15 = 1048575;
                            t5Var = this;
                        }
                    case 60:
                        if (t5Var.x(i21, b5Var2, i17)) {
                            Object object4 = unsafe.getObject(b5Var2, j10);
                            a6 B4 = t5Var.B(i17);
                            t11 = t4.t(i21 << 3);
                            a10 = ((m4) object4).a(B4);
                            t12 = t4.t(a10);
                            i13 = t12 + a10 + t11;
                            i19 += i13;
                            i17 += 3;
                            i15 = 1048575;
                            t5Var = this;
                        } else {
                            i17 += 3;
                            i15 = 1048575;
                            t5Var = this;
                        }
                    case 61:
                        if (t5Var.x(i21, b5Var2, i17)) {
                            i11 = t4.m(i21, (s4) unsafe.getObject(b5Var2, j10));
                            i19 += i11;
                            i17 += 3;
                            i15 = 1048575;
                            t5Var = this;
                        } else {
                            i17 += 3;
                            i15 = 1048575;
                            t5Var = this;
                        }
                    case 62:
                        if (t5Var.x(i21, b5Var2, i17)) {
                            i19 = wd0.t(v(j10, b5Var2), t4.t(i21 << 3), i19);
                        }
                        i17 += 3;
                        i15 = 1048575;
                        t5Var = this;
                    case ColorSpace.MAX_ID /* 63 */:
                        if (t5Var.x(i21, b5Var2, i17)) {
                            int v4 = v(j10, b5Var2);
                            t18 = t4.t(i21 << 3);
                            r12 = t4.r(v4);
                            i11 = r12 + t18;
                            i19 += i11;
                            i17 += 3;
                            i15 = 1048575;
                            t5Var = this;
                        } else {
                            i17 += 3;
                            i15 = 1048575;
                            t5Var = this;
                        }
                    case 64:
                        if (t5Var.x(i21, b5Var2, i17)) {
                            i19 = wd0.t(i21 << 3, 4, i19);
                        }
                        i17 += 3;
                        i15 = 1048575;
                        t5Var = this;
                    case 65:
                        if (t5Var.x(i21, b5Var2, i17)) {
                            i19 = wd0.t(i21 << 3, 8, i19);
                        }
                        i17 += 3;
                        i15 = 1048575;
                        t5Var = this;
                    case 66:
                        if (t5Var.x(i21, b5Var2, i17)) {
                            int v10 = v(j10, b5Var2);
                            i19 = wd0.t((v10 >> 31) ^ (v10 << 1), t4.t(i21 << 3), i19);
                        }
                        i17 += 3;
                        i15 = 1048575;
                        t5Var = this;
                    case 67:
                        if (t5Var.x(i21, b5Var2, i17)) {
                            long z10 = z(j10, b5Var2);
                            t17 = t4.t(i21 << 3);
                            r11 = t4.r((z10 >> 63) ^ (z10 << 1));
                            i13 = r11 + t17;
                            i19 += i13;
                            i17 += 3;
                            i15 = 1048575;
                            t5Var = this;
                        } else {
                            i17 += 3;
                            i15 = 1048575;
                            t5Var = this;
                        }
                    case 68:
                        if (t5Var.x(i21, b5Var2, i17)) {
                            i11 = t4.g(i21, (m4) unsafe.getObject(b5Var2, j10), t5Var.B(i17));
                            i19 += i11;
                            i17 += 3;
                            i15 = 1048575;
                            t5Var = this;
                        } else {
                            i17 += 3;
                            i15 = 1048575;
                            t5Var = this;
                        }
                    default:
                        i17 += 3;
                        i15 = 1048575;
                        t5Var = this;
                }
            } else {
                return b5Var2.zzb.a() + i19;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0060. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [long] */
    /* JADX WARN: Type inference failed for: r16v3 */
    @Override // com.google.android.gms.internal.measurement.a6
    public final void e(Object obj, o5 o5Var) {
        int i10;
        boolean z3;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z9;
        int i15;
        int i16;
        int i17;
        int i18;
        t5 t5Var = this;
        o5Var.getClass();
        t4 t4Var = (t4) o5Var.f13873u;
        int[] iArr = t5Var.f13921a;
        int length = iArr.length;
        Unsafe unsafe = f13920j;
        int i19 = 1048575;
        int i20 = 1048575;
        int i21 = 0;
        int i22 = 0;
        while (i21 < length) {
            int u9 = t5Var.u(i21);
            int i23 = iArr[i21];
            int i24 = (267386880 & u9) >>> 20;
            if (i24 <= 17) {
                int i25 = iArr[i21 + 2];
                z3 = 1;
                int i26 = i25 & i19;
                if (i26 != i20) {
                    if (i26 == i19) {
                        i10 = u9;
                        i22 = 0;
                    } else {
                        i10 = u9;
                        i22 = unsafe.getInt(obj, i26);
                    }
                    i20 = i26;
                } else {
                    i10 = u9;
                }
                int i27 = i22;
                i12 = i20;
                i13 = i24;
                i14 = 1 << (i25 >>> 20);
                i11 = i27;
            } else {
                i10 = u9;
                z3 = 1;
                i11 = i22;
                i12 = i20;
                i13 = i24;
                i14 = 0;
            }
            long j10 = i10 & i19;
            int i28 = 2;
            switch (i13) {
                case 0:
                    if (t5Var.r(obj, i21, i12, i11, i14)) {
                        double a10 = e6.f13735c.a(j10, obj);
                        t4Var.getClass();
                        t4Var.d(i23, Double.doubleToRawLongBits(a10));
                    }
                    i21 += 3;
                    i19 = 1048575;
                    t5Var = this;
                    i20 = i12;
                    i22 = i11;
                case 1:
                    if (t5Var.r(obj, i21, i12, i11, i14)) {
                        float h3 = e6.f13735c.h(j10, obj);
                        t4Var.getClass();
                        t4Var.c(i23, Float.floatToRawIntBits(h3));
                    }
                    i21 += 3;
                    i19 = 1048575;
                    t5Var = this;
                    i20 = i12;
                    i22 = i11;
                case 2:
                    if (t5Var.r(obj, i21, i12, i11, i14)) {
                        t4Var.k(i23, unsafe.getLong(obj, j10));
                    }
                    i21 += 3;
                    i19 = 1048575;
                    t5Var = this;
                    i20 = i12;
                    i22 = i11;
                case 3:
                    if (t5Var.r(obj, i21, i12, i11, i14)) {
                        t4Var.k(i23, unsafe.getLong(obj, j10));
                    }
                    i21 += 3;
                    i19 = 1048575;
                    t5Var = this;
                    i20 = i12;
                    i22 = i11;
                case 4:
                    if (t5Var.r(obj, i21, i12, i11, i14)) {
                        t4Var.j(i23, unsafe.getInt(obj, j10));
                    }
                    i21 += 3;
                    i19 = 1048575;
                    t5Var = this;
                    i20 = i12;
                    i22 = i11;
                case 5:
                    if (t5Var.r(obj, i21, i12, i11, i14)) {
                        t4Var.d(i23, unsafe.getLong(obj, j10));
                    }
                    i21 += 3;
                    i19 = 1048575;
                    t5Var = this;
                    i20 = i12;
                    i22 = i11;
                case 6:
                    if (t5Var.r(obj, i21, i12, i11, i14)) {
                        t4Var.c(i23, unsafe.getInt(obj, j10));
                    }
                    i21 += 3;
                    i19 = 1048575;
                    t5Var = this;
                    i20 = i12;
                    i22 = i11;
                case 7:
                    if (t5Var.r(obj, i21, i12, i11, i14)) {
                        boolean i29 = e6.f13735c.i(j10, obj);
                        t4Var.o(i23, 0);
                        t4Var.a(i29 ? (byte) 1 : (byte) 0);
                        i21 += 3;
                        i19 = 1048575;
                        t5Var = this;
                        i20 = i12;
                        i22 = i11;
                    }
                    i21 += 3;
                    i19 = 1048575;
                    t5Var = this;
                    i20 = i12;
                    i22 = i11;
                case 8:
                    if (t5Var.r(obj, i21, i12, i11, i14)) {
                        Object object = unsafe.getObject(obj, j10);
                        if (object instanceof String) {
                            String str = (String) object;
                            t4Var.o(i23, 2);
                            byte[] bArr = t4Var.f13917b;
                            int i30 = t4Var.f13919d;
                            try {
                                int t3 = t4.t(str.length() * 3);
                                int t10 = t4.t(str.length());
                                if (t10 == t3) {
                                    int i31 = i30 + t10;
                                    t4Var.f13919d = i31;
                                    int b10 = b(str, bArr, i31, t4Var.f());
                                    t4Var.f13919d = i30;
                                    t4Var.n((b10 - i30) - t10);
                                    t4Var.f13919d = b10;
                                } else {
                                    t4Var.n(a(str));
                                    t4Var.f13919d = b(str, bArr, t4Var.f13919d, t4Var.f());
                                }
                            } catch (h6 e) {
                                t4Var.f13919d = i30;
                                t4.e.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e);
                                byte[] bytes = str.getBytes(d5.f13686a);
                                try {
                                    t4Var.n(bytes.length);
                                    t4Var.p(bytes, 0, bytes.length);
                                } catch (IndexOutOfBoundsException e8) {
                                    throw new af.c(e8);
                                }
                            } catch (IndexOutOfBoundsException e10) {
                                throw new af.c(e10);
                            }
                        } else {
                            s4 s4Var = (s4) object;
                            t4Var.o(i23, 2);
                            t4Var.n(s4Var.k());
                            t4Var.p(s4Var.f13910v, s4Var.n(), s4Var.k());
                        }
                    }
                    i21 += 3;
                    i19 = 1048575;
                    t5Var = this;
                    i20 = i12;
                    i22 = i11;
                case 9:
                    if (t5Var.r(obj, i21, i12, i11, i14)) {
                        o5Var.e(i23, unsafe.getObject(obj, j10), t5Var.B(i21));
                    }
                    i21 += 3;
                    i19 = 1048575;
                    t5Var = this;
                    i20 = i12;
                    i22 = i11;
                case 10:
                    if (t5Var.r(obj, i21, i12, i11, i14)) {
                        s4 s4Var2 = (s4) unsafe.getObject(obj, j10);
                        t4Var.o(i23, 2);
                        t4Var.n(s4Var2.k());
                        t4Var.p(s4Var2.f13910v, s4Var2.n(), s4Var2.k());
                    }
                    i21 += 3;
                    i19 = 1048575;
                    t5Var = this;
                    i20 = i12;
                    i22 = i11;
                case 11:
                    if (t5Var.r(obj, i21, i12, i11, i14)) {
                        t4Var.q(i23, unsafe.getInt(obj, j10));
                    }
                    i21 += 3;
                    i19 = 1048575;
                    t5Var = this;
                    i20 = i12;
                    i22 = i11;
                case 12:
                    if (t5Var.r(obj, i21, i12, i11, i14)) {
                        t4Var.j(i23, unsafe.getInt(obj, j10));
                    }
                    i21 += 3;
                    i19 = 1048575;
                    t5Var = this;
                    i20 = i12;
                    i22 = i11;
                case 13:
                    if (t5Var.r(obj, i21, i12, i11, i14)) {
                        t4Var.c(i23, unsafe.getInt(obj, j10));
                    }
                    i21 += 3;
                    i19 = 1048575;
                    t5Var = this;
                    i20 = i12;
                    i22 = i11;
                case 14:
                    if (t5Var.r(obj, i21, i12, i11, i14)) {
                        t4Var.d(i23, unsafe.getLong(obj, j10));
                    }
                    i21 += 3;
                    i19 = 1048575;
                    t5Var = this;
                    i20 = i12;
                    i22 = i11;
                case 15:
                    if (t5Var.r(obj, i21, i12, i11, i14)) {
                        int i32 = unsafe.getInt(obj, j10);
                        t4Var.q(i23, (i32 >> 31) ^ (i32 << 1));
                    }
                    i21 += 3;
                    i19 = 1048575;
                    t5Var = this;
                    i20 = i12;
                    i22 = i11;
                case 16:
                    if (t5Var.r(obj, i21, i12, i11, i14)) {
                        long j11 = unsafe.getLong(obj, j10);
                        t4Var.k(i23, (j11 >> 63) ^ (j11 << 1));
                    }
                    i21 += 3;
                    i19 = 1048575;
                    t5Var = this;
                    i20 = i12;
                    i22 = i11;
                case 17:
                    if (t5Var.r(obj, i21, i12, i11, i14)) {
                        o5Var.d(i23, unsafe.getObject(obj, j10), t5Var.B(i21));
                    }
                    i21 += 3;
                    i19 = 1048575;
                    t5Var = this;
                    i20 = i12;
                    i22 = i11;
                case 18:
                    z9 = false;
                    a4.l(iArr[i21], (List) unsafe.getObject(obj, j10), o5Var, false);
                    i21 += 3;
                    i19 = 1048575;
                    t5Var = this;
                    i20 = i12;
                    i22 = i11;
                case 19:
                    z9 = false;
                    a4.v(iArr[i21], (List) unsafe.getObject(obj, j10), o5Var, false);
                    i21 += 3;
                    i19 = 1048575;
                    t5Var = this;
                    i20 = i12;
                    i22 = i11;
                case 20:
                    z9 = false;
                    a4.z(iArr[i21], (List) unsafe.getObject(obj, j10), o5Var, false);
                    i21 += 3;
                    i19 = 1048575;
                    t5Var = this;
                    i20 = i12;
                    i22 = i11;
                case gl.zzm /* 21 */:
                    z9 = false;
                    a4.H(iArr[i21], (List) unsafe.getObject(obj, j10), o5Var, false);
                    i21 += 3;
                    i19 = 1048575;
                    t5Var = this;
                    i20 = i12;
                    i22 = i11;
                case 22:
                    z9 = false;
                    a4.x(iArr[i21], (List) unsafe.getObject(obj, j10), o5Var, false);
                    i21 += 3;
                    i19 = 1048575;
                    t5Var = this;
                    i20 = i12;
                    i22 = i11;
                case 23:
                    z9 = false;
                    a4.t(iArr[i21], (List) unsafe.getObject(obj, j10), o5Var, false);
                    i21 += 3;
                    i19 = 1048575;
                    t5Var = this;
                    i20 = i12;
                    i22 = i11;
                case 24:
                    z9 = false;
                    a4.r(iArr[i21], (List) unsafe.getObject(obj, j10), o5Var, false);
                    i21 += 3;
                    i19 = 1048575;
                    t5Var = this;
                    i20 = i12;
                    i22 = i11;
                case 25:
                    z9 = false;
                    g(iArr[i21], (List) unsafe.getObject(obj, j10), o5Var, false);
                    i21 += 3;
                    i19 = 1048575;
                    t5Var = this;
                    i20 = i12;
                    i22 = i11;
                case 26:
                    int i33 = iArr[i21];
                    List list = (List) unsafe.getObject(obj, j10);
                    if (list != null && !list.isEmpty()) {
                        if (list instanceof m5) {
                            m5 m5Var = (m5) list;
                            int i34 = 0;
                            while (i34 < list.size()) {
                                Object zza = m5Var.zza();
                                if (zza instanceof String) {
                                    String str2 = (String) zza;
                                    t4Var.o(i33, 2);
                                    byte[] bArr2 = t4Var.f13917b;
                                    int i35 = t4Var.f13919d;
                                    try {
                                        try {
                                            i17 = i21;
                                        } catch (IndexOutOfBoundsException e11) {
                                            throw new af.c(e11);
                                        }
                                    } catch (h6 e12) {
                                        e = e12;
                                        i17 = i21;
                                    }
                                    try {
                                        int t11 = t4.t(str2.length() * 3);
                                        i18 = i12;
                                        try {
                                            int t12 = t4.t(str2.length());
                                            if (t12 == t11) {
                                                int i36 = i35 + t12;
                                                t4Var.f13919d = i36;
                                                int b11 = b(str2, bArr2, i36, t4Var.f());
                                                t4Var.f13919d = i35;
                                                t4Var.n((b11 - i35) - t12);
                                                t4Var.f13919d = b11;
                                            } else {
                                                t4Var.n(a(str2));
                                                t4Var.f13919d = b(str2, bArr2, t4Var.f13919d, t4Var.f());
                                            }
                                        } catch (h6 e13) {
                                            e = e13;
                                            h6 h6Var = e;
                                            t4Var.f13919d = i35;
                                            t4.e.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) h6Var);
                                            byte[] bytes2 = str2.getBytes(d5.f13686a);
                                            try {
                                                t4Var.n(bytes2.length);
                                                t4Var.p(bytes2, 0, bytes2.length);
                                                i34++;
                                                i21 = i17;
                                                i12 = i18;
                                            } catch (IndexOutOfBoundsException e14) {
                                                throw new af.c(e14);
                                            }
                                        }
                                    } catch (h6 e15) {
                                        e = e15;
                                        i18 = i12;
                                        h6 h6Var2 = e;
                                        t4Var.f13919d = i35;
                                        t4.e.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) h6Var2);
                                        byte[] bytes22 = str2.getBytes(d5.f13686a);
                                        t4Var.n(bytes22.length);
                                        t4Var.p(bytes22, 0, bytes22.length);
                                        i34++;
                                        i21 = i17;
                                        i12 = i18;
                                    }
                                } else {
                                    i17 = i21;
                                    i18 = i12;
                                    s4 s4Var3 = (s4) zza;
                                    t4Var.o(i33, 2);
                                    t4Var.n(s4Var3.k());
                                    t4Var.p(s4Var3.f13910v, s4Var3.n(), s4Var3.k());
                                }
                                i34++;
                                i21 = i17;
                                i12 = i18;
                            }
                        } else {
                            i15 = i21;
                            i16 = i12;
                            for (int i37 = 0; i37 < list.size(); i37++) {
                                String str3 = (String) list.get(i37);
                                t4Var.o(i33, 2);
                                byte[] bArr3 = t4Var.f13917b;
                                int i38 = t4Var.f13919d;
                                try {
                                    int t13 = t4.t(str3.length() * 3);
                                    int t14 = t4.t(str3.length());
                                    if (t14 == t13) {
                                        int i39 = i38 + t14;
                                        t4Var.f13919d = i39;
                                        int b12 = b(str3, bArr3, i39, t4Var.f());
                                        t4Var.f13919d = i38;
                                        t4Var.n((b12 - i38) - t14);
                                        t4Var.f13919d = b12;
                                    } else {
                                        t4Var.n(a(str3));
                                        t4Var.f13919d = b(str3, bArr3, t4Var.f13919d, t4Var.f());
                                    }
                                } catch (h6 e16) {
                                    t4Var.f13919d = i38;
                                    t4.e.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e16);
                                    byte[] bytes3 = str3.getBytes(d5.f13686a);
                                    try {
                                        t4Var.n(bytes3.length);
                                        t4Var.p(bytes3, 0, bytes3.length);
                                    } catch (IndexOutOfBoundsException e17) {
                                        throw new af.c(e17);
                                    }
                                } catch (IndexOutOfBoundsException e18) {
                                    throw new af.c(e18);
                                }
                            }
                            i21 = i15;
                            i12 = i16;
                            i21 += 3;
                            i19 = 1048575;
                            t5Var = this;
                            i20 = i12;
                            i22 = i11;
                        }
                    }
                    i15 = i21;
                    i16 = i12;
                    i21 = i15;
                    i12 = i16;
                    i21 += 3;
                    i19 = 1048575;
                    t5Var = this;
                    i20 = i12;
                    i22 = i11;
                    break;
                case 27:
                    int i40 = iArr[i21];
                    List list2 = (List) unsafe.getObject(obj, j10);
                    a6 B = t5Var.B(i21);
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i41 = 0; i41 < list2.size(); i41++) {
                            o5Var.e(i40, list2.get(i41), B);
                        }
                    }
                    i21 += 3;
                    i19 = 1048575;
                    t5Var = this;
                    i20 = i12;
                    i22 = i11;
                    break;
                case 28:
                    int i42 = iArr[i21];
                    List list3 = (List) unsafe.getObject(obj, j10);
                    if (list3 != null && !list3.isEmpty()) {
                        int i43 = 0;
                        while (i43 < list3.size()) {
                            s4 s4Var4 = (s4) list3.get(i43);
                            t4Var.o(i42, i28);
                            t4Var.n(s4Var4.k());
                            t4Var.p(s4Var4.f13910v, s4Var4.n(), s4Var4.k());
                            i43++;
                            i28 = 2;
                        }
                    }
                    i21 += 3;
                    i19 = 1048575;
                    t5Var = this;
                    i20 = i12;
                    i22 = i11;
                    break;
                case 29:
                    z9 = false;
                    a4.G(iArr[i21], (List) unsafe.getObject(obj, j10), o5Var, false);
                    i21 += 3;
                    i19 = 1048575;
                    t5Var = this;
                    i20 = i12;
                    i22 = i11;
                case 30:
                    z9 = false;
                    a4.o(iArr[i21], (List) unsafe.getObject(obj, j10), o5Var, false);
                    i21 += 3;
                    i19 = 1048575;
                    t5Var = this;
                    i20 = i12;
                    i22 = i11;
                case 31:
                    z9 = false;
                    a4.B(iArr[i21], (List) unsafe.getObject(obj, j10), o5Var, false);
                    i21 += 3;
                    i19 = 1048575;
                    t5Var = this;
                    i20 = i12;
                    i22 = i11;
                case 32:
                    z9 = false;
                    a4.D(iArr[i21], (List) unsafe.getObject(obj, j10), o5Var, false);
                    i21 += 3;
                    i19 = 1048575;
                    t5Var = this;
                    i20 = i12;
                    i22 = i11;
                case 33:
                    z9 = false;
                    a4.E(iArr[i21], (List) unsafe.getObject(obj, j10), o5Var, false);
                    i21 += 3;
                    i19 = 1048575;
                    t5Var = this;
                    i20 = i12;
                    i22 = i11;
                case 34:
                    z9 = false;
                    a4.F(iArr[i21], (List) unsafe.getObject(obj, j10), o5Var, false);
                    i21 += 3;
                    i19 = 1048575;
                    t5Var = this;
                    i20 = i12;
                    i22 = i11;
                case 35:
                    a4.l(iArr[i21], (List) unsafe.getObject(obj, j10), o5Var, z3);
                    i21 += 3;
                    i19 = 1048575;
                    t5Var = this;
                    i20 = i12;
                    i22 = i11;
                case 36:
                    a4.v(iArr[i21], (List) unsafe.getObject(obj, j10), o5Var, z3);
                    i21 += 3;
                    i19 = 1048575;
                    t5Var = this;
                    i20 = i12;
                    i22 = i11;
                case 37:
                    a4.z(iArr[i21], (List) unsafe.getObject(obj, j10), o5Var, z3);
                    i21 += 3;
                    i19 = 1048575;
                    t5Var = this;
                    i20 = i12;
                    i22 = i11;
                case 38:
                    a4.H(iArr[i21], (List) unsafe.getObject(obj, j10), o5Var, z3);
                    i21 += 3;
                    i19 = 1048575;
                    t5Var = this;
                    i20 = i12;
                    i22 = i11;
                case 39:
                    a4.x(iArr[i21], (List) unsafe.getObject(obj, j10), o5Var, z3);
                    i21 += 3;
                    i19 = 1048575;
                    t5Var = this;
                    i20 = i12;
                    i22 = i11;
                case 40:
                    a4.t(iArr[i21], (List) unsafe.getObject(obj, j10), o5Var, z3);
                    i21 += 3;
                    i19 = 1048575;
                    t5Var = this;
                    i20 = i12;
                    i22 = i11;
                case 41:
                    a4.r(iArr[i21], (List) unsafe.getObject(obj, j10), o5Var, z3);
                    i21 += 3;
                    i19 = 1048575;
                    t5Var = this;
                    i20 = i12;
                    i22 = i11;
                case 42:
                    g(iArr[i21], (List) unsafe.getObject(obj, j10), o5Var, z3);
                    i21 += 3;
                    i19 = 1048575;
                    t5Var = this;
                    i20 = i12;
                    i22 = i11;
                case 43:
                    a4.G(iArr[i21], (List) unsafe.getObject(obj, j10), o5Var, z3);
                    i21 += 3;
                    i19 = 1048575;
                    t5Var = this;
                    i20 = i12;
                    i22 = i11;
                case 44:
                    a4.o(iArr[i21], (List) unsafe.getObject(obj, j10), o5Var, z3);
                    i21 += 3;
                    i19 = 1048575;
                    t5Var = this;
                    i20 = i12;
                    i22 = i11;
                case 45:
                    a4.B(iArr[i21], (List) unsafe.getObject(obj, j10), o5Var, z3);
                    i21 += 3;
                    i19 = 1048575;
                    t5Var = this;
                    i20 = i12;
                    i22 = i11;
                case 46:
                    a4.D(iArr[i21], (List) unsafe.getObject(obj, j10), o5Var, z3);
                    i21 += 3;
                    i19 = 1048575;
                    t5Var = this;
                    i20 = i12;
                    i22 = i11;
                case 47:
                    a4.E(iArr[i21], (List) unsafe.getObject(obj, j10), o5Var, z3);
                    i21 += 3;
                    i19 = 1048575;
                    t5Var = this;
                    i20 = i12;
                    i22 = i11;
                case 48:
                    a4.F(iArr[i21], (List) unsafe.getObject(obj, j10), o5Var, z3);
                    i21 += 3;
                    i19 = 1048575;
                    t5Var = this;
                    i20 = i12;
                    i22 = i11;
                case 49:
                    int i44 = iArr[i21];
                    List list4 = (List) unsafe.getObject(obj, j10);
                    a6 B2 = t5Var.B(i21);
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i45 = 0; i45 < list4.size(); i45++) {
                            o5Var.d(i44, list4.get(i45), B2);
                        }
                    }
                    i21 += 3;
                    i19 = 1048575;
                    t5Var = this;
                    i20 = i12;
                    i22 = i11;
                    break;
                case 50:
                    if (unsafe.getObject(obj, j10) != null) {
                        if (t5Var.C(i21) != null) {
                            q.b();
                            return;
                        }
                        throw new NoSuchMethodError();
                    }
                    i21 += 3;
                    i19 = 1048575;
                    t5Var = this;
                    i20 = i12;
                    i22 = i11;
                case 51:
                    if (t5Var.x(i23, obj, i21)) {
                        double doubleValue = ((Double) e6.j(j10, obj)).doubleValue();
                        t4Var.getClass();
                        t4Var.d(i23, Double.doubleToRawLongBits(doubleValue));
                    }
                    i21 += 3;
                    i19 = 1048575;
                    t5Var = this;
                    i20 = i12;
                    i22 = i11;
                case 52:
                    if (t5Var.x(i23, obj, i21)) {
                        float floatValue = ((Float) e6.j(j10, obj)).floatValue();
                        t4Var.getClass();
                        t4Var.c(i23, Float.floatToRawIntBits(floatValue));
                    }
                    i21 += 3;
                    i19 = 1048575;
                    t5Var = this;
                    i20 = i12;
                    i22 = i11;
                case 53:
                    if (t5Var.x(i23, obj, i21)) {
                        t4Var.k(i23, z(j10, obj));
                    }
                    i21 += 3;
                    i19 = 1048575;
                    t5Var = this;
                    i20 = i12;
                    i22 = i11;
                case 54:
                    if (t5Var.x(i23, obj, i21)) {
                        t4Var.k(i23, z(j10, obj));
                    }
                    i21 += 3;
                    i19 = 1048575;
                    t5Var = this;
                    i20 = i12;
                    i22 = i11;
                case 55:
                    if (t5Var.x(i23, obj, i21)) {
                        t4Var.j(i23, v(j10, obj));
                    }
                    i21 += 3;
                    i19 = 1048575;
                    t5Var = this;
                    i20 = i12;
                    i22 = i11;
                case 56:
                    if (t5Var.x(i23, obj, i21)) {
                        t4Var.d(i23, z(j10, obj));
                    }
                    i21 += 3;
                    i19 = 1048575;
                    t5Var = this;
                    i20 = i12;
                    i22 = i11;
                case 57:
                    if (t5Var.x(i23, obj, i21)) {
                        t4Var.c(i23, v(j10, obj));
                    }
                    i21 += 3;
                    i19 = 1048575;
                    t5Var = this;
                    i20 = i12;
                    i22 = i11;
                case 58:
                    if (t5Var.x(i23, obj, i21)) {
                        boolean booleanValue = ((Boolean) e6.j(j10, obj)).booleanValue();
                        t4Var.o(i23, 0);
                        t4Var.a(booleanValue ? (byte) 1 : (byte) 0);
                    }
                    i21 += 3;
                    i19 = 1048575;
                    t5Var = this;
                    i20 = i12;
                    i22 = i11;
                case 59:
                    if (t5Var.x(i23, obj, i21)) {
                        Object object2 = unsafe.getObject(obj, j10);
                        if (object2 instanceof String) {
                            String str4 = (String) object2;
                            t4Var.o(i23, 2);
                            byte[] bArr4 = t4Var.f13917b;
                            int i46 = t4Var.f13919d;
                            try {
                                int t15 = t4.t(str4.length() * 3);
                                int t16 = t4.t(str4.length());
                                if (t16 == t15) {
                                    int i47 = i46 + t16;
                                    t4Var.f13919d = i47;
                                    int b13 = b(str4, bArr4, i47, t4Var.f());
                                    t4Var.f13919d = i46;
                                    t4Var.n((b13 - i46) - t16);
                                    t4Var.f13919d = b13;
                                } else {
                                    t4Var.n(a(str4));
                                    t4Var.f13919d = b(str4, bArr4, t4Var.f13919d, t4Var.f());
                                }
                            } catch (h6 e19) {
                                t4Var.f13919d = i46;
                                t4.e.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e19);
                                byte[] bytes4 = str4.getBytes(d5.f13686a);
                                try {
                                    t4Var.n(bytes4.length);
                                    t4Var.p(bytes4, 0, bytes4.length);
                                } catch (IndexOutOfBoundsException e20) {
                                    throw new af.c(e20);
                                }
                            } catch (IndexOutOfBoundsException e21) {
                                throw new af.c(e21);
                            }
                        } else {
                            s4 s4Var5 = (s4) object2;
                            t4Var.o(i23, 2);
                            t4Var.n(s4Var5.k());
                            t4Var.p(s4Var5.f13910v, s4Var5.n(), s4Var5.k());
                        }
                    }
                    i21 += 3;
                    i19 = 1048575;
                    t5Var = this;
                    i20 = i12;
                    i22 = i11;
                case 60:
                    if (t5Var.x(i23, obj, i21)) {
                        o5Var.e(i23, unsafe.getObject(obj, j10), t5Var.B(i21));
                    }
                    i21 += 3;
                    i19 = 1048575;
                    t5Var = this;
                    i20 = i12;
                    i22 = i11;
                case 61:
                    if (t5Var.x(i23, obj, i21)) {
                        s4 s4Var6 = (s4) unsafe.getObject(obj, j10);
                        t4Var.o(i23, 2);
                        t4Var.n(s4Var6.k());
                        t4Var.p(s4Var6.f13910v, s4Var6.n(), s4Var6.k());
                    }
                    i21 += 3;
                    i19 = 1048575;
                    t5Var = this;
                    i20 = i12;
                    i22 = i11;
                case 62:
                    if (t5Var.x(i23, obj, i21)) {
                        t4Var.q(i23, v(j10, obj));
                    }
                    i21 += 3;
                    i19 = 1048575;
                    t5Var = this;
                    i20 = i12;
                    i22 = i11;
                case ColorSpace.MAX_ID /* 63 */:
                    if (t5Var.x(i23, obj, i21)) {
                        t4Var.j(i23, v(j10, obj));
                    }
                    i21 += 3;
                    i19 = 1048575;
                    t5Var = this;
                    i20 = i12;
                    i22 = i11;
                case 64:
                    if (t5Var.x(i23, obj, i21)) {
                        t4Var.c(i23, v(j10, obj));
                    }
                    i21 += 3;
                    i19 = 1048575;
                    t5Var = this;
                    i20 = i12;
                    i22 = i11;
                case 65:
                    if (t5Var.x(i23, obj, i21)) {
                        t4Var.d(i23, z(j10, obj));
                    }
                    i21 += 3;
                    i19 = 1048575;
                    t5Var = this;
                    i20 = i12;
                    i22 = i11;
                case 66:
                    if (t5Var.x(i23, obj, i21)) {
                        int v2 = v(j10, obj);
                        t4Var.q(i23, (v2 >> 31) ^ (v2 << 1));
                    }
                    i21 += 3;
                    i19 = 1048575;
                    t5Var = this;
                    i20 = i12;
                    i22 = i11;
                case 67:
                    if (t5Var.x(i23, obj, i21)) {
                        long z10 = z(j10, obj);
                        t4Var.k(i23, (z10 << z3) ^ (z10 >> 63));
                    }
                    i21 += 3;
                    i19 = 1048575;
                    t5Var = this;
                    i20 = i12;
                    i22 = i11;
                case 68:
                    if (t5Var.x(i23, obj, i21)) {
                        o5Var.d(i23, unsafe.getObject(obj, j10), t5Var.B(i21));
                    }
                    i21 += 3;
                    i19 = 1048575;
                    t5Var = this;
                    i20 = i12;
                    i22 = i11;
                default:
                    i21 += 3;
                    i19 = 1048575;
                    t5Var = this;
                    i20 = i12;
                    i22 = i11;
            }
        }
        ((b5) obj).zzb.d(o5Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x01fd, code lost:
    
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d6, code lost:
    
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d8, code lost:
    
        r8 = 1231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d9, code lost:
    
        r3 = r8 + r3;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001d. Please report as an issue. */
    @Override // com.google.android.gms.internal.measurement.a6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f(com.google.android.gms.internal.measurement.b5 r12) {
        /*
            Method dump skipped, instructions count: 764
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.t5.f(com.google.android.gms.internal.measurement.b5):int");
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public final void g(Object obj, Object obj2) {
        Object obj3;
        if (D(obj)) {
            obj2.getClass();
            int i10 = 0;
            while (true) {
                int[] iArr = this.f13921a;
                if (i10 < iArr.length) {
                    int u9 = u(i10);
                    long j10 = u9 & 1048575;
                    int i11 = iArr[i10];
                    switch ((u9 & 267386880) >>> 20) {
                        case 0:
                            obj3 = obj;
                            if (!w(i10, obj2)) {
                                break;
                            } else {
                                d6 d6Var = e6.f13735c;
                                d6Var.e(obj3, j10, d6Var.a(j10, obj2));
                                obj3 = obj3;
                                s(i10, obj3);
                                continue;
                            }
                        case 1:
                            obj3 = obj;
                            if (w(i10, obj2)) {
                                d6 d6Var2 = e6.f13735c;
                                d6Var2.f(obj3, j10, d6Var2.h(j10, obj2));
                                s(i10, obj3);
                                break;
                            } else {
                                continue;
                            }
                        case 2:
                            obj3 = obj;
                            if (w(i10, obj2)) {
                                d6 d6Var3 = e6.f13735c;
                                d6Var3.c(j10, obj3, d6Var3.k(j10, obj2));
                                s(i10, obj3);
                                break;
                            } else {
                                continue;
                            }
                        case 3:
                            obj3 = obj;
                            if (w(i10, obj2)) {
                                d6 d6Var4 = e6.f13735c;
                                d6Var4.c(j10, obj3, d6Var4.k(j10, obj2));
                                s(i10, obj3);
                                break;
                            } else {
                                continue;
                            }
                        case 4:
                            obj3 = obj;
                            if (w(i10, obj2)) {
                                b(j10, obj3, e6.f13735c.j(j10, obj2));
                                s(i10, obj3);
                                break;
                            } else {
                                continue;
                            }
                        case 5:
                            obj3 = obj;
                            if (w(i10, obj2)) {
                                d6 d6Var5 = e6.f13735c;
                                d6Var5.c(j10, obj3, d6Var5.k(j10, obj2));
                                s(i10, obj3);
                                break;
                            } else {
                                continue;
                            }
                        case 6:
                            obj3 = obj;
                            if (w(i10, obj2)) {
                                b(j10, obj3, e6.f13735c.j(j10, obj2));
                                s(i10, obj3);
                                break;
                            } else {
                                continue;
                            }
                        case 7:
                            obj3 = obj;
                            if (w(i10, obj2)) {
                                d6 d6Var6 = e6.f13735c;
                                d6Var6.g(obj3, j10, d6Var6.i(j10, obj2));
                                s(i10, obj3);
                                break;
                            } else {
                                continue;
                            }
                        case 8:
                            obj3 = obj;
                            if (w(i10, obj2)) {
                                c(obj3, j10, e6.j(j10, obj2));
                                s(i10, obj3);
                                break;
                            } else {
                                continue;
                            }
                        case 9:
                            obj3 = obj;
                            q(obj3, obj2, i10);
                            continue;
                        case 10:
                            obj3 = obj;
                            if (w(i10, obj2)) {
                                c(obj3, j10, e6.j(j10, obj2));
                                s(i10, obj3);
                                break;
                            } else {
                                continue;
                            }
                        case 11:
                            obj3 = obj;
                            if (w(i10, obj2)) {
                                b(j10, obj3, e6.f13735c.j(j10, obj2));
                                s(i10, obj3);
                                break;
                            } else {
                                continue;
                            }
                        case 12:
                            obj3 = obj;
                            if (w(i10, obj2)) {
                                b(j10, obj3, e6.f13735c.j(j10, obj2));
                                s(i10, obj3);
                                break;
                            } else {
                                continue;
                            }
                        case 13:
                            obj3 = obj;
                            if (w(i10, obj2)) {
                                b(j10, obj3, e6.f13735c.j(j10, obj2));
                                s(i10, obj3);
                                break;
                            } else {
                                continue;
                            }
                        case 14:
                            obj3 = obj;
                            if (w(i10, obj2)) {
                                d6 d6Var7 = e6.f13735c;
                                d6Var7.c(j10, obj3, d6Var7.k(j10, obj2));
                                s(i10, obj3);
                                break;
                            } else {
                                continue;
                            }
                        case 15:
                            obj3 = obj;
                            if (w(i10, obj2)) {
                                b(j10, obj3, e6.f13735c.j(j10, obj2));
                                s(i10, obj3);
                                break;
                            } else {
                                continue;
                            }
                        case 16:
                            if (w(i10, obj2)) {
                                d6 d6Var8 = e6.f13735c;
                                obj3 = obj;
                                d6Var8.c(j10, obj3, d6Var8.k(j10, obj2));
                                s(i10, obj3);
                                break;
                            }
                            break;
                        case 17:
                            q(obj, obj2, i10);
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
                            i5 i5Var = (i5) e6.j(j10, obj);
                            i5 i5Var2 = (i5) e6.j(j10, obj2);
                            int size = i5Var.size();
                            int size2 = i5Var2.size();
                            if (size > 0 && size2 > 0) {
                                if (!((o4) i5Var).f13871u) {
                                    i5Var = i5Var.e(size2 + size);
                                }
                                i5Var.addAll(i5Var2);
                            }
                            if (size > 0) {
                                i5Var2 = i5Var;
                            }
                            c(obj, j10, i5Var2);
                            break;
                        case 50:
                            c(obj, j10, c(e6.j(j10, obj), e6.j(j10, obj2)));
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
                            if (x(i11, obj2, i10)) {
                                c(obj, j10, e6.j(j10, obj2));
                                b(iArr[i10 + 2] & 1048575, obj, i11);
                                break;
                            }
                            break;
                        case 60:
                            t(obj, i10, obj2);
                            break;
                        case 61:
                        case 62:
                        case ColorSpace.MAX_ID /* 63 */:
                        case 64:
                        case 65:
                        case 66:
                        case 67:
                            if (x(i11, obj2, i10)) {
                                c(obj, j10, e6.j(j10, obj2));
                                b(iArr[i10 + 2] & 1048575, obj, i11);
                                break;
                            }
                            break;
                        case 68:
                            t(obj, i10, obj2);
                            break;
                    }
                    obj3 = obj;
                    i10 += 3;
                    obj = obj3;
                } else {
                    h(obj, obj2);
                    return;
                }
            }
        } else {
            x.n("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public final void h(Object obj, byte[] bArr, int i10, int i11, com.google.android.gms.internal.ads.r7 r7Var) {
        j(obj, bArr, i10, i11, 0, r7Var);
    }

    public final int i(int i10, int i11) {
        int[] iArr = this.f13921a;
        int length = (iArr.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = iArr[i13];
            if (i10 == i14) {
                return i13;
            }
            if (i10 < i14) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0e9b, code lost:
    
        if (r9 == 1048575) goto L634;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0e9d, code lost:
    
        r21.putInt(r2, r9, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0ea3, code lost:
    
        r3 = r32.f13926g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0ea9, code lost:
    
        if (r3 >= r32.f13927h) goto L768;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0eab, code lost:
    
        r6 = r32.f13925f[r3];
        r7 = r25[r6];
        r7 = com.google.android.gms.internal.measurement.e6.j(u(r6) & 1048575, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0ebf, code lost:
    
        if (r7 != null) goto L640;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0ec6, code lost:
    
        if (A(r6) != null) goto L767;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0ecb, code lost:
    
        r7 = (com.google.android.gms.internal.measurement.q5) r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0ed1, code lost:
    
        if (C(r6) == null) goto L648;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0ed3, code lost:
    
        q.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0ed6, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:599:0x0101, code lost:
    
        r6 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:600:0x0102, code lost:
    
        r3 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0edd, code lost:
    
        throw new java.lang.NoSuchMethodError();
     */
    /* JADX WARN: Code restructure failed: missing block: B:631:0x01ba, code lost:
    
        r5 = r36;
        r6 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0ec8, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0ede, code lost:
    
        if (r0 != 0) goto L655;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0ee0, code lost:
    
        if (r4 != r5) goto L653;
     */
    /* JADX WARN: Code restructure failed: missing block: B:684:0x02c1, code lost:
    
        throw com.google.android.gms.internal.measurement.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0ee7, code lost:
    
        throw com.google.android.gms.internal.measurement.h5.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:701:0x0312, code lost:
    
        throw com.google.android.gms.internal.measurement.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0eec, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0ee8, code lost:
    
        if (r4 > r5) goto L658;
     */
    /* JADX WARN: Code restructure failed: missing block: B:729:0x0374, code lost:
    
        throw com.google.android.gms.internal.measurement.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0eea, code lost:
    
        if (r15 != r0) goto L658;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0ef1, code lost:
    
        throw com.google.android.gms.internal.measurement.h5.c();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:182:0x05d5. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x0c1a. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:586:0x00bd. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0b86  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0b8e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0e77 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0e34 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:669:0x0274  */
    /* JADX WARN: Type inference failed for: r7v144, types: [java.util.LinkedHashMap, com.google.android.gms.internal.measurement.q5] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int j(java.lang.Object r33, byte[] r34, int r35, int r36, int r37, com.google.android.gms.internal.ads.r7 r38) {
        /*
            Method dump skipped, instructions count: 3990
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.t5.j(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.r7):int");
    }

    public final Object l(int i10, Object obj) {
        a6 B = B(i10);
        long u9 = u(i10) & 1048575;
        if (!w(i10, obj)) {
            return B.zza();
        }
        Object object = f13920j.getObject(obj, u9);
        if (D(object)) {
            return object;
        }
        b5 zza = B.zza();
        if (object != null) {
            B.g(zza, object);
        }
        return zza;
    }

    public final Object m(int i10, Object obj, int i11) {
        a6 B = B(i11);
        if (!x(i10, obj, i11)) {
            return B.zza();
        }
        Object object = f13920j.getObject(obj, u(i11) & 1048575);
        if (D(object)) {
            return object;
        }
        b5 zza = B.zza();
        if (object != null) {
            B.g(zza, object);
        }
        return zza;
    }

    public final void o(int i10, int i11, Object obj, Object obj2) {
        f13920j.putObject(obj, u(i11) & 1048575, obj2);
        b(this.f13921a[i11 + 2] & 1048575, obj, i10);
    }

    public final void p(Object obj, int i10, Object obj2) {
        f13920j.putObject(obj, u(i10) & 1048575, obj2);
        s(i10, obj);
    }

    public final void q(Object obj, Object obj2, int i10) {
        if (!w(i10, obj2)) {
            return;
        }
        long u9 = u(i10) & 1048575;
        Unsafe unsafe = f13920j;
        Object object = unsafe.getObject(obj2, u9);
        if (object != null) {
            a6 B = B(i10);
            if (!w(i10, obj)) {
                if (!D(object)) {
                    unsafe.putObject(obj, u9, object);
                } else {
                    b5 zza = B.zza();
                    B.g(zza, object);
                    unsafe.putObject(obj, u9, zza);
                }
                s(i10, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, u9);
            if (!D(object2)) {
                b5 zza2 = B.zza();
                B.g(zza2, object2);
                unsafe.putObject(obj, u9, zza2);
                object2 = zza2;
            }
            B.g(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.f13921a[i10] + " is present but null: " + String.valueOf(obj2));
    }

    public final boolean r(Object obj, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return w(i10, obj);
        }
        if ((i12 & i13) != 0) {
            return true;
        }
        return false;
    }

    public final void s(int i10, Object obj) {
        int i11 = this.f13921a[i10 + 2];
        long j10 = 1048575 & i11;
        if (j10 == 1048575) {
            return;
        }
        b(j10, obj, (1 << (i11 >>> 20)) | e6.f13735c.j(j10, obj));
    }

    public final void t(Object obj, int i10, Object obj2) {
        int[] iArr = this.f13921a;
        int i11 = iArr[i10];
        if (!x(i11, obj2, i10)) {
            return;
        }
        long u9 = u(i10) & 1048575;
        Unsafe unsafe = f13920j;
        Object object = unsafe.getObject(obj2, u9);
        if (object != null) {
            a6 B = B(i10);
            if (!x(i11, obj, i10)) {
                if (!D(object)) {
                    unsafe.putObject(obj, u9, object);
                } else {
                    b5 zza = B.zza();
                    B.g(zza, object);
                    unsafe.putObject(obj, u9, zza);
                }
                b(iArr[i10 + 2] & 1048575, obj, i11);
                return;
            }
            Object object2 = unsafe.getObject(obj, u9);
            if (!D(object2)) {
                b5 zza2 = B.zza();
                B.g(zza2, object2);
                unsafe.putObject(obj, u9, zza2);
                object2 = zza2;
            }
            B.g(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + iArr[i10] + " is present but null: " + String.valueOf(obj2));
    }

    public final int u(int i10) {
        return this.f13921a[i10 + 1];
    }

    public final boolean w(int i10, Object obj) {
        int i11 = this.f13921a[i10 + 2];
        long j10 = i11 & 1048575;
        if (j10 == 1048575) {
            int u9 = u(i10);
            long j11 = u9 & 1048575;
            switch ((u9 & 267386880) >>> 20) {
                case 0:
                    if (Double.doubleToRawLongBits(e6.f13735c.a(j11, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(e6.f13735c.h(j11, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (e6.f13735c.k(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (e6.f13735c.k(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (e6.f13735c.j(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (e6.f13735c.k(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (e6.f13735c.j(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return e6.f13735c.i(j11, obj);
                case 8:
                    Object j12 = e6.j(j11, obj);
                    if (j12 instanceof String) {
                        if (((String) j12).isEmpty()) {
                            return false;
                        }
                    } else if (j12 instanceof s4) {
                        if (s4.f13907w.equals(j12)) {
                            return false;
                        }
                    } else {
                        x.m();
                        return false;
                    }
                    break;
                case 9:
                    if (e6.j(j11, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (s4.f13907w.equals(e6.j(j11, obj))) {
                        return false;
                    }
                    break;
                case 11:
                    if (e6.f13735c.j(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (e6.f13735c.j(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (e6.f13735c.j(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (e6.f13735c.k(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (e6.f13735c.j(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (e6.f13735c.k(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (e6.j(j11, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    x.m();
                    return false;
            }
        } else if (((1 << (i11 >>> 20)) & e6.f13735c.j(j10, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean x(int i10, Object obj, int i11) {
        if (e6.f13735c.j(this.f13921a[i11 + 2] & 1048575, obj) == i10) {
            return true;
        }
        return false;
    }

    public final boolean y(b5 b5Var, b5 b5Var2, int i10) {
        if (w(i10, b5Var) == w(i10, b5Var2)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public final b5 zza() {
        return (b5) ((b5) this.e).g(4);
    }
}
