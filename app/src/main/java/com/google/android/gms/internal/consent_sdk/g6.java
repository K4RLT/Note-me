package com.google.android.gms.internal.consent_sdk;

import androidx.ink.brush.color.colorspace.ColorSpace;
import com.google.android.gms.internal.ads.gl;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class g6 implements m6 {

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f13414g = new int[0];

    /* renamed from: h, reason: collision with root package name */
    public static final Unsafe f13415h = x6.i();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f13416a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f13417b;

    /* renamed from: c, reason: collision with root package name */
    public final c5 f13418c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f13419d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final s6 f13420f;

    public g6(int[] iArr, Object[] objArr, c5 c5Var, int[] iArr2, int i, s6 s6Var, j4 j4Var) {
        this.f13416a = iArr;
        this.f13417b = objArr;
        this.f13419d = iArr2;
        this.e = i;
        this.f13420f = s6Var;
        this.f13418c = c5Var;
    }

    public static boolean i(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof q5) {
            return ((q5) obj).e();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x037d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.consent_sdk.g6 k(com.google.android.gms.internal.consent_sdk.l6 r32, com.google.android.gms.internal.consent_sdk.s6 r33, com.google.android.gms.internal.consent_sdk.j4 r34) {
        /*
            Method dump skipped, instructions count: 1004
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.consent_sdk.g6.k(com.google.android.gms.internal.consent_sdk.l6, com.google.android.gms.internal.consent_sdk.s6, com.google.android.gms.internal.consent_sdk.j4):com.google.android.gms.internal.consent_sdk.g6");
    }

    public static int l(long j10, Object obj) {
        return ((Integer) x6.h(j10, obj)).intValue();
    }

    public static int m(int i) {
        return (i >>> 20) & 255;
    }

    public static long o(long j10, Object obj) {
        return ((Long) x6.h(j10, obj)).longValue();
    }

    public static Field q(Class cls, String str) {
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

    @Override // com.google.android.gms.internal.consent_sdk.m6
    public final void a(Object obj) {
        if (i(obj)) {
            if (obj instanceof q5) {
                q5 q5Var = (q5) obj;
                q5Var.d();
                q5Var.zza = 0;
                q5Var.j();
            }
            int i = 0;
            while (true) {
                int[] iArr = this.f13416a;
                if (i < iArr.length) {
                    int n10 = n(i);
                    int i10 = 1048575 & n10;
                    int m4 = m(n10);
                    long j10 = i10;
                    if (m4 != 9) {
                        if (m4 != 60 && m4 != 68) {
                            switch (m4) {
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
                                    d5 d5Var = (d5) ((t5) x6.h(j10, obj));
                                    if (!d5Var.f13389u) {
                                        break;
                                    } else {
                                        d5Var.f13389u = false;
                                        break;
                                    }
                                case 50:
                                    Unsafe unsafe = f13415h;
                                    Object object = unsafe.getObject(obj, j10);
                                    if (object == null) {
                                        break;
                                    } else {
                                        ((c6) object).f13380u = false;
                                        unsafe.putObject(obj, j10, object);
                                        break;
                                    }
                            }
                        } else if (j(iArr[i], obj, i)) {
                            p(i).a(f13415h.getObject(obj, j10));
                        }
                        i += 3;
                    }
                    if (v(i, obj)) {
                        p(i).a(f13415h.getObject(obj, j10));
                    }
                    i += 3;
                } else {
                    this.f13420f.getClass();
                    r6 r6Var = ((q5) obj).zzc;
                    if (r6Var.f13542d) {
                        r6Var.f13542d = false;
                        return;
                    }
                    return;
                }
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
    @Override // com.google.android.gms.internal.consent_sdk.m6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(com.google.android.gms.internal.consent_sdk.q5 r11) {
        /*
            Method dump skipped, instructions count: 728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.consent_sdk.g6.b(com.google.android.gms.internal.consent_sdk.q5):int");
    }

    @Override // com.google.android.gms.internal.consent_sdk.m6
    public final q5 c() {
        return (q5) ((q5) this.f13418c).f(4);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0015. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01d5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01c7 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.consent_sdk.m6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(com.google.android.gms.internal.consent_sdk.q5 r8, com.google.android.gms.internal.consent_sdk.q5 r9) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.consent_sdk.g6.d(com.google.android.gms.internal.consent_sdk.q5, com.google.android.gms.internal.consent_sdk.q5):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x004e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:84:0x0212. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:91:0x0343. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0346 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x036d  */
    @Override // com.google.android.gms.internal.consent_sdk.m6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(java.lang.Object r29, com.google.android.gms.internal.consent_sdk.a6 r30) {
        /*
            Method dump skipped, instructions count: 2468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.consent_sdk.g6.e(java.lang.Object, com.google.android.gms.internal.consent_sdk.a6):void");
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.LinkedHashMap, com.google.android.gms.internal.consent_sdk.c6] */
    @Override // com.google.android.gms.internal.consent_sdk.m6
    public final void f(Object obj, Object obj2) {
        Object obj3;
        if (i(obj)) {
            obj2.getClass();
            int i = 0;
            while (true) {
                int[] iArr = this.f13416a;
                if (i < iArr.length) {
                    int n10 = n(i);
                    int i10 = n10 & 1048575;
                    int m4 = m(n10);
                    int i11 = iArr[i];
                    long j10 = i10;
                    switch (m4) {
                        case 0:
                            if (v(i, obj2)) {
                                w6 w6Var = x6.f13603c;
                                obj3 = obj;
                                w6Var.e(obj3, j10, w6Var.a(j10, obj2));
                                t(i, obj3);
                                break;
                            }
                            break;
                        case 1:
                            if (v(i, obj2)) {
                                w6 w6Var2 = x6.f13603c;
                                w6Var2.f(obj, j10, w6Var2.b(j10, obj2));
                                t(i, obj);
                                break;
                            }
                            break;
                        case 2:
                            if (v(i, obj2)) {
                                x6.k(j10, obj, x6.f(j10, obj2));
                                t(i, obj);
                                break;
                            }
                            break;
                        case 3:
                            if (v(i, obj2)) {
                                x6.k(j10, obj, x6.f(j10, obj2));
                                t(i, obj);
                                break;
                            }
                            break;
                        case 4:
                            if (v(i, obj2)) {
                                x6.j(j10, obj, x6.e(j10, obj2));
                                t(i, obj);
                                break;
                            }
                            break;
                        case 5:
                            if (v(i, obj2)) {
                                x6.k(j10, obj, x6.f(j10, obj2));
                                t(i, obj);
                                break;
                            }
                            break;
                        case 6:
                            if (v(i, obj2)) {
                                x6.j(j10, obj, x6.e(j10, obj2));
                                t(i, obj);
                                break;
                            }
                            break;
                        case 7:
                            if (v(i, obj2)) {
                                w6 w6Var3 = x6.f13603c;
                                w6Var3.c(obj, j10, w6Var3.g(j10, obj2));
                                t(i, obj);
                                break;
                            }
                            break;
                        case 8:
                            if (v(i, obj2)) {
                                x6.l(obj, j10, x6.h(j10, obj2));
                                t(i, obj);
                                break;
                            }
                            break;
                        case 9:
                            r(obj, i, obj2);
                            break;
                        case 10:
                            if (v(i, obj2)) {
                                x6.l(obj, j10, x6.h(j10, obj2));
                                t(i, obj);
                                break;
                            }
                            break;
                        case 11:
                            if (v(i, obj2)) {
                                x6.j(j10, obj, x6.e(j10, obj2));
                                t(i, obj);
                                break;
                            }
                            break;
                        case 12:
                            if (v(i, obj2)) {
                                x6.j(j10, obj, x6.e(j10, obj2));
                                t(i, obj);
                                break;
                            }
                            break;
                        case 13:
                            if (v(i, obj2)) {
                                x6.j(j10, obj, x6.e(j10, obj2));
                                t(i, obj);
                                break;
                            }
                            break;
                        case 14:
                            if (v(i, obj2)) {
                                x6.k(j10, obj, x6.f(j10, obj2));
                                t(i, obj);
                                break;
                            }
                            break;
                        case 15:
                            if (v(i, obj2)) {
                                x6.j(j10, obj, x6.e(j10, obj2));
                                t(i, obj);
                                break;
                            }
                            break;
                        case 16:
                            if (v(i, obj2)) {
                                x6.k(j10, obj, x6.f(j10, obj2));
                                t(i, obj);
                                break;
                            }
                            break;
                        case 17:
                            r(obj, i, obj2);
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
                            t5 t5Var = (t5) x6.h(j10, obj);
                            t5 t5Var2 = (t5) x6.h(j10, obj2);
                            int size = t5Var.size();
                            int size2 = t5Var2.size();
                            if (size > 0 && size2 > 0) {
                                if (!((d5) t5Var).f13389u) {
                                    t5Var = t5Var.f(size2 + size);
                                }
                                t5Var.addAll(t5Var2);
                            }
                            if (size > 0) {
                                t5Var2 = t5Var;
                            }
                            x6.l(obj, j10, t5Var2);
                            break;
                        case 50:
                            s6 s6Var = n6.f13506a;
                            c6 c6Var = (c6) x6.h(j10, obj);
                            c6 c6Var2 = (c6) x6.h(j10, obj2);
                            if (!c6Var2.isEmpty()) {
                                if (!c6Var.f13380u) {
                                    if (c6Var.isEmpty()) {
                                        c6Var = new c6();
                                    } else {
                                        ?? linkedHashMap = new LinkedHashMap(c6Var);
                                        linkedHashMap.f13380u = true;
                                        c6Var = linkedHashMap;
                                    }
                                }
                                c6Var.a();
                                if (!c6Var2.isEmpty()) {
                                    c6Var.putAll(c6Var2);
                                }
                            }
                            x6.l(obj, j10, c6Var);
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
                            if (j(i11, obj2, i)) {
                                x6.l(obj, j10, x6.h(j10, obj2));
                                x6.j(iArr[i + 2] & 1048575, obj, i11);
                                break;
                            }
                            break;
                        case 60:
                            s(obj, i, obj2);
                            break;
                        case 61:
                        case 62:
                        case ColorSpace.MAX_ID /* 63 */:
                        case 64:
                        case 65:
                        case 66:
                        case 67:
                            if (j(i11, obj2, i)) {
                                x6.l(obj, j10, x6.h(j10, obj2));
                                x6.j(iArr[i + 2] & 1048575, obj, i11);
                                break;
                            }
                            break;
                        case 68:
                            s(obj, i, obj2);
                            break;
                    }
                    obj3 = obj;
                    i += 3;
                    obj = obj3;
                } else {
                    n6.o(obj, obj2);
                    return;
                }
            }
        } else {
            q.x.n("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x004c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:91:0x0249. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:98:0x0369. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x036c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0370  */
    @Override // com.google.android.gms.internal.consent_sdk.m6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g(com.google.android.gms.internal.consent_sdk.c5 r29) {
        /*
            Method dump skipped, instructions count: 2908
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.consent_sdk.g6.g(com.google.android.gms.internal.consent_sdk.c5):int");
    }

    @Override // com.google.android.gms.internal.consent_sdk.m6
    public final boolean h(Object obj) {
        int i;
        int i10;
        int i11;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1048575;
        while (i13 < this.e) {
            int i15 = this.f13419d[i13];
            int[] iArr = this.f13416a;
            int i16 = iArr[i15];
            int n10 = n(i15);
            int i17 = iArr[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i14) {
                if (i18 != 1048575) {
                    i12 = f13415h.getInt(obj, i18);
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
            if ((268435456 & n10) == 0 || w(obj, i10, i, i11, i19)) {
                int m4 = m(n10);
                if (m4 != 9 && m4 != 17) {
                    if (m4 != 27) {
                        if (m4 != 60 && m4 != 68) {
                            if (m4 != 49) {
                                if (m4 != 50) {
                                    continue;
                                } else {
                                    c6 c6Var = (c6) x6.h(n10 & 1048575, obj);
                                    if (c6Var.isEmpty()) {
                                        continue;
                                    } else {
                                        int i21 = i10 / 3;
                                        if (((a7) ((b6) this.f13417b[i21 + i21]).f13363a.f13488v).f13359u == b7.C) {
                                            m6 m6Var = null;
                                            for (Object obj2 : c6Var.values()) {
                                                if (m6Var == null) {
                                                    m6Var = j6.f13458c.a(obj2.getClass());
                                                }
                                                if (!m6Var.h(obj2)) {
                                                }
                                            }
                                        } else {
                                            continue;
                                        }
                                    }
                                }
                                i13++;
                                i14 = i;
                                i12 = i11;
                            }
                        } else {
                            if (j(i16, obj, i10) && !p(i10).h(x6.h(n10 & 1048575, obj))) {
                            }
                            i13++;
                            i14 = i;
                            i12 = i11;
                        }
                    }
                    List list = (List) x6.h(n10 & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        m6 p10 = p(i10);
                        for (int i22 = 0; i22 < list.size(); i22++) {
                            if (p10.h(list.get(i22))) {
                            }
                        }
                    }
                    i13++;
                    i14 = i;
                    i12 = i11;
                } else {
                    if (w(obj, i10, i, i11, i19) && !p(i10).h(x6.h(n10 & 1048575, obj))) {
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

    public final boolean j(int i, Object obj, int i10) {
        if (x6.e(this.f13416a[i10 + 2] & 1048575, obj) == i) {
            return true;
        }
        return false;
    }

    public final int n(int i) {
        return this.f13416a[i + 1];
    }

    public final m6 p(int i) {
        int i10 = i / 3;
        int i11 = i10 + i10;
        Object[] objArr = this.f13417b;
        m6 m6Var = (m6) objArr[i11];
        if (m6Var != null) {
            return m6Var;
        }
        m6 a10 = j6.f13458c.a((Class) objArr[i11 + 1]);
        objArr[i11] = a10;
        return a10;
    }

    public final void r(Object obj, int i, Object obj2) {
        if (!v(i, obj2)) {
            return;
        }
        int n10 = n(i) & 1048575;
        Unsafe unsafe = f13415h;
        long j10 = n10;
        Object object = unsafe.getObject(obj2, j10);
        if (object != null) {
            m6 p10 = p(i);
            if (!v(i, obj)) {
                if (!i(object)) {
                    unsafe.putObject(obj, j10, object);
                } else {
                    q5 c10 = p10.c();
                    p10.f(c10, object);
                    unsafe.putObject(obj, j10, c10);
                }
                t(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!i(object2)) {
                q5 c11 = p10.c();
                p10.f(c11, object2);
                unsafe.putObject(obj, j10, c11);
                object2 = c11;
            }
            p10.f(object2, object);
            return;
        }
        androidx.datastore.preferences.protobuf.s1.g(this.f13416a[i], obj2);
    }

    public final void s(Object obj, int i, Object obj2) {
        int[] iArr = this.f13416a;
        int i10 = iArr[i];
        if (!j(i10, obj2, i)) {
            return;
        }
        int n10 = n(i) & 1048575;
        Unsafe unsafe = f13415h;
        long j10 = n10;
        Object object = unsafe.getObject(obj2, j10);
        if (object != null) {
            m6 p10 = p(i);
            if (!j(i10, obj, i)) {
                if (!i(object)) {
                    unsafe.putObject(obj, j10, object);
                } else {
                    q5 c10 = p10.c();
                    p10.f(c10, object);
                    unsafe.putObject(obj, j10, c10);
                }
                x6.j(iArr[i + 2] & 1048575, obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!i(object2)) {
                q5 c11 = p10.c();
                p10.f(c11, object2);
                unsafe.putObject(obj, j10, c11);
                object2 = c11;
            }
            p10.f(object2, object);
            return;
        }
        androidx.datastore.preferences.protobuf.s1.g(iArr[i], obj2);
    }

    public final void t(int i, Object obj) {
        int i10 = this.f13416a[i + 2];
        long j10 = 1048575 & i10;
        if (j10 == 1048575) {
            return;
        }
        x6.j(j10, obj, (1 << (i10 >>> 20)) | x6.e(j10, obj));
    }

    public final boolean u(q5 q5Var, q5 q5Var2, int i) {
        if (v(i, q5Var) == v(i, q5Var2)) {
            return true;
        }
        return false;
    }

    public final boolean v(int i, Object obj) {
        int i10 = this.f13416a[i + 2];
        long j10 = i10 & 1048575;
        if (j10 == 1048575) {
            int n10 = n(i);
            long j11 = n10 & 1048575;
            switch (m(n10)) {
                case 0:
                    if (Double.doubleToRawLongBits(x6.f13603c.a(j11, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(x6.f13603c.b(j11, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (x6.f(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (x6.f(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (x6.e(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (x6.f(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (x6.e(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return x6.f13603c.g(j11, obj);
                case 8:
                    Object h3 = x6.h(j11, obj);
                    if (h3 instanceof String) {
                        if (((String) h3).isEmpty()) {
                            return false;
                        }
                    } else if (h3 instanceof h5) {
                        if (h5.f13430w.equals(h3)) {
                            return false;
                        }
                    } else {
                        q.x.m();
                        return false;
                    }
                    break;
                case 9:
                    if (x6.h(j11, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (h5.f13430w.equals(x6.h(j11, obj))) {
                        return false;
                    }
                    break;
                case 11:
                    if (x6.e(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (x6.e(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (x6.e(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (x6.f(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (x6.e(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (x6.f(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (x6.h(j11, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    q.x.m();
                    return false;
            }
        } else if (((1 << (i10 >>> 20)) & x6.e(j10, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean w(Object obj, int i, int i10, int i11, int i12) {
        if (i10 == 1048575) {
            return v(i, obj);
        }
        if ((i11 & i12) != 0) {
            return true;
        }
        return false;
    }
}
