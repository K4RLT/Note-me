package com.google.android.gms.internal.mlkit_vision_digital_ink;
import g5.q;
import p.a;
import q.k;
import q.x;
import ra.e;
import vd.n;
import x.m;
import x.n;
import x.o;

import androidx.ink.brush.color.colorspace.ColorSpace;
import com.google.android.gms.internal.ads.rm1;
import com.google.android.gms.internal.ads.wd0;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class jo implements ro {

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f14517m = new int[0];

    /* renamed from: n, reason: collision with root package name */
    public static final Unsafe f14518n = dp.i();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f14519a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f14520b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14521c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14522d;
    public final km e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f14523f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f14524g;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f14525h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final int f14526j;

    /* renamed from: k, reason: collision with root package name */
    public final jm f14527k;

    /* renamed from: l, reason: collision with root package name */
    public final jm f14528l;

    public jo(int[] iArr, Object[] objArr, int i, int i10, km kmVar, int[] iArr2, int i11, int i12, jm jmVar, jm jmVar2) {
        this.f14519a = iArr;
        this.f14520b = objArr;
        this.f14521c = i;
        this.f14522d = i10;
        this.f14524g = kmVar instanceof nn;
        boolean z3 = false;
        if (jmVar2 != null && (kmVar instanceof kn)) {
            z3 = true;
        }
        this.f14523f = z3;
        this.f14525h = iArr2;
        this.i = i11;
        this.f14526j = i12;
        this.f14527k = jmVar;
        this.f14528l = jmVar2;
        this.e = kmVar;
    }

    public static final int A(byte[] bArr, int i, int i10, gp gpVar, Class cls, pm pmVar) {
        gp gpVar2 = gp.f14373w;
        boolean z3 = false;
        switch (gpVar.ordinal()) {
            case 0:
                int i11 = i + 8;
                pmVar.f14799c = Double.valueOf(Double.longBitsToDouble(nw.F(bArr, i)));
                return i11;
            case 1:
                int i12 = i + 4;
                pmVar.f14799c = Float.valueOf(Float.intBitsToFloat(nw.j(bArr, i)));
                return i12;
            case 2:
            case 3:
                int B = nw.B(bArr, i, pmVar);
                pmVar.f14799c = Long.valueOf(pmVar.f14798b);
                return B;
            case 4:
            case 12:
            case 13:
                int y10 = nw.y(bArr, i, pmVar);
                pmVar.f14799c = Integer.valueOf(pmVar.f14797a);
                return y10;
            case 5:
            case 15:
                int i13 = i + 8;
                pmVar.f14799c = Long.valueOf(nw.F(bArr, i));
                return i13;
            case 6:
            case 14:
                int i14 = i + 4;
                pmVar.f14799c = Integer.valueOf(nw.j(bArr, i));
                return i14;
            case 7:
                int B2 = nw.B(bArr, i, pmVar);
                if (pmVar.f14798b != 0) {
                    z3 = true;
                }
                pmVar.f14799c = Boolean.valueOf(z3);
                return B2;
            case 8:
                return nw.w(bArr, i, pmVar);
            case 9:
            default:
                vd.n.b("unsupported field type.");
                return 0;
            case 10:
                return nw.p(oo.f14756c.a(cls), bArr, i, i10, pmVar);
            case 11:
                return nw.b(bArr, i, pmVar);
            case 16:
                int y11 = nw.y(bArr, i, pmVar);
                pmVar.f14799c = Integer.valueOf(rm1.h(pmVar.f14797a));
                return y11;
            case 17:
                int B3 = nw.B(bArr, i, pmVar);
                pmVar.f14799c = Long.valueOf(rm1.i(pmVar.f14798b));
                return B3;
        }
    }

    public static yo C(Object obj) {
        nn nnVar = (nn) obj;
        yo yoVar = nnVar.zzc;
        if (yoVar == yo.f15293f) {
            yo b10 = yo.b();
            nnVar.zzc = b10;
            return b10;
        }
        return yoVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.mlkit_vision_digital_ink.jo D(com.google.android.gms.internal.mlkit_vision_digital_ink.qo r36, com.google.android.gms.internal.mlkit_vision_digital_ink.jm r37, com.google.android.gms.internal.mlkit_vision_digital_ink.jm r38) {
        /*
            Method dump skipped, instructions count: 1075
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_digital_ink.jo.D(com.google.android.gms.internal.mlkit_vision_digital_ink.qo, com.google.android.gms.internal.mlkit_vision_digital_ink.jm, com.google.android.gms.internal.mlkit_vision_digital_ink.jm):com.google.android.gms.internal.mlkit_vision_digital_ink.jo");
    }

    public static int E(long j10, Object obj) {
        return ((Integer) dp.h(j10, obj)).intValue();
    }

    public static int G(int i) {
        return (i >>> 20) & 255;
    }

    public static long I(long j10, Object obj) {
        return ((Long) dp.h(j10, obj)).longValue();
    }

    public static Field m(Class cls, String str) {
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

    public static void n(Object obj) {
        if (y(obj)) {
            return;
        }
        q.x.n("Mutating immutable message: ".concat(String.valueOf(obj)));
    }

    public static boolean y(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof nn) {
            return ((nn) obj).o();
        }
        return true;
    }

    /*  JADX ERROR: Type inference failed
//         jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final int B(java.lang.Object r38, byte[] r39, int r40, int r41, int r42, com.google.android.gms.internal.mlkit_vision_digital_ink.pm r43) {
        /*
            Method dump skipped, instructions count: 4110
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_digital_ink.jo.B(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.mlkit_vision_digital_ink.pm):int");
    }

    public final int F(int i, int i10) {
        int[] iArr = this.f14519a;
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

    public final int H(int i) {
        return this.f14519a[i + 1];
    }

    public final rn J(int i) {
        int i10 = i / 3;
        return (rn) this.f14520b[i10 + i10 + 1];
    }

    public final ro K(int i) {
        int i10 = i / 3;
        int i11 = i10 + i10;
        Object[] objArr = this.f14520b;
        ro roVar = (ro) objArr[i11];
        if (roVar != null) {
            return roVar;
        }
        ro a10 = oo.f14756c.a((Class) objArr[i11 + 1]);
        objArr[i11] = a10;
        return a10;
    }

    public final Object L(Object obj, int i, Object obj2, jm jmVar, Object obj3) {
        rn J;
        int i10 = this.f14519a[i];
        Object h3 = dp.h(H(i) & 1048575, obj);
        if (h3 == null || (J = J(i)) == null) {
            return obj2;
        }
        ra.e eVar = ((co) M(i)).f14163a;
        Iterator it = ((eo) h3).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!J.e(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    jmVar.getClass();
                    obj2 = jm.g(obj3);
                }
                int a10 = co.a(eVar, entry.getKey(), entry.getValue());
                sm smVar = tm.f15012v;
                byte[] bArr = new byte[a10];
                Logger logger = ym.f15284b;
                wm wmVar = new wm(bArr, 0, a10);
                try {
                    co.c(wmVar, eVar, entry.getKey(), entry.getValue());
                    if (wmVar.B() == 0) {
                        sm smVar2 = new sm(bArr);
                        jmVar.getClass();
                        ((yo) obj2).c((i10 << 3) | 2, smVar2);
                        it.remove();
                    } else {
                        q.x.o("Did not write as much data as expected.");
                        return null;
                    }
                } catch (IOException e) {
                    g5.q.k(e);
                    return null;
                }
            }
        }
        return obj2;
    }

    public final Object M(int i) {
        int i10 = i / 3;
        return this.f14520b[i10 + i10];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ro
    public final Object a() {
        return ((nn) this.e).i();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ro
    public final void b(Object obj) {
        if (y(obj)) {
            if (obj instanceof nn) {
                nn nnVar = (nn) obj;
                nnVar.n();
                nnVar.zzb = 0;
                nnVar.l();
            }
            int i = 0;
            while (true) {
                int[] iArr = this.f14519a;
                if (i < iArr.length) {
                    int H = H(i);
                    int i10 = 1048575 & H;
                    int G = G(H);
                    long j10 = i10;
                    if (G != 9) {
                        if (G != 60 && G != 68) {
                            switch (G) {
                                case 18:
                                case 19:
                                case 20:
                                case com.google.android.gms.internal.ads.gl.zzm /* 21 */:
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
                                    mm mmVar = (mm) ((un) dp.h(j10, obj));
                                    if (!mmVar.f14670u) {
                                        break;
                                    } else {
                                        mmVar.f14670u = false;
                                        break;
                                    }
                                case 50:
                                    Unsafe unsafe = f14518n;
                                    Object object = unsafe.getObject(obj, j10);
                                    if (object == null) {
                                        break;
                                    } else {
                                        ((eo) object).f14267u = false;
                                        unsafe.putObject(obj, j10, object);
                                        break;
                                    }
                            }
                        } else if (z(iArr[i], obj, i)) {
                            K(i).b(f14518n.getObject(obj, j10));
                        }
                        i += 3;
                    }
                    if (w(i, obj)) {
                        K(i).b(f14518n.getObject(obj, j10));
                    }
                    i += 3;
                } else {
                    this.f14527k.getClass();
                    yo yoVar = ((nn) obj).zzc;
                    if (yoVar.e) {
                        yoVar.e = false;
                    }
                    if (this.f14523f) {
                        this.f14528l.getClass();
                        ((kn) obj).zza.d();
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ro
    public final boolean c(Object obj) {
        int i;
        int i10;
        int i11;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1048575;
        loop0: while (true) {
            if (i13 < this.i) {
                int i15 = this.f14525h[i13];
                int[] iArr = this.f14519a;
                int i16 = iArr[i15];
                int H = H(i15);
                int i17 = iArr[i15 + 2];
                int i18 = i17 & 1048575;
                int i19 = 1 << (i17 >>> 20);
                if (i18 != i14) {
                    if (i18 != 1048575) {
                        i12 = f14518n.getInt(obj, i18);
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
                if ((268435456 & H) != 0 && !x(obj, i10, i, i11, i19)) {
                    break;
                }
                int G = G(H);
                if (G != 9 && G != 17) {
                    if (G != 27) {
                        if (G != 60 && G != 68) {
                            if (G != 49) {
                                if (G == 50) {
                                    eo eoVar = (eo) dp.h(H & 1048575, obj);
                                    if (!eoVar.isEmpty() && ((gp) ((co) M(i10)).f14163a.f24676w).f14377u == hp.C) {
                                        ro roVar = null;
                                        for (Object obj2 : eoVar.values()) {
                                            if (roVar == null) {
                                                roVar = oo.f14756c.a(obj2.getClass());
                                            }
                                            if (!roVar.c(obj2)) {
                                                break loop0;
                                            }
                                        }
                                    }
                                } else {
                                    continue;
                                }
                                i13++;
                                i14 = i;
                                i12 = i11;
                            }
                        } else {
                            if (z(i16, obj, i10) && !K(i10).c(dp.h(H & 1048575, obj))) {
                                break;
                            }
                            i13++;
                            i14 = i;
                            i12 = i11;
                        }
                    }
                    List list = (List) dp.h(H & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        ro K = K(i10);
                        for (int i21 = 0; i21 < list.size(); i21++) {
                            if (!K.c(list.get(i21))) {
                                break loop0;
                            }
                        }
                    }
                    i13++;
                    i14 = i;
                    i12 = i11;
                } else {
                    if (x(obj, i10, i, i11, i19) && !K(i10).c(dp.h(H & 1048575, obj))) {
                        break;
                    }
                    i13++;
                    i14 = i;
                    i12 = i11;
                }
            } else if (!this.f14523f || ((kn) obj).zza.g()) {
                return true;
            }
        }
        return false;
    }

    public final Object d(int i, Object obj) {
        ro K = K(i);
        int H = H(i) & 1048575;
        if (!w(i, obj)) {
            return K.a();
        }
        Object object = f14518n.getObject(obj, H);
        if (y(object)) {
            return object;
        }
        Object a10 = K.a();
        if (object != null) {
            K.e(a10, object);
        }
        return a10;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ro
    public final void e(Object obj, Object obj2) {
        Object obj3;
        n(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.f14519a;
            if (i < iArr.length) {
                int H = H(i);
                int i10 = 1048575 & H;
                int G = G(H);
                int i11 = iArr[i];
                long j10 = i10;
                switch (G) {
                    case 0:
                        if (w(i, obj2)) {
                            cp cpVar = dp.f14199c;
                            obj3 = obj;
                            cpVar.j(obj3, j10, cpVar.a(j10, obj2));
                            r(i, obj3);
                            break;
                        }
                        break;
                    case 1:
                        if (w(i, obj2)) {
                            cp cpVar2 = dp.f14199c;
                            cpVar2.k(obj, j10, cpVar2.c(j10, obj2));
                            r(i, obj);
                            break;
                        }
                        break;
                    case 2:
                        if (w(i, obj2)) {
                            dp.l(j10, obj, dp.f(j10, obj2));
                            r(i, obj);
                            break;
                        }
                        break;
                    case 3:
                        if (w(i, obj2)) {
                            dp.l(j10, obj, dp.f(j10, obj2));
                            r(i, obj);
                            break;
                        }
                        break;
                    case 4:
                        if (w(i, obj2)) {
                            dp.k(j10, obj, dp.e(j10, obj2));
                            r(i, obj);
                            break;
                        }
                        break;
                    case 5:
                        if (w(i, obj2)) {
                            dp.l(j10, obj, dp.f(j10, obj2));
                            r(i, obj);
                            break;
                        }
                        break;
                    case 6:
                        if (w(i, obj2)) {
                            dp.k(j10, obj, dp.e(j10, obj2));
                            r(i, obj);
                            break;
                        }
                        break;
                    case 7:
                        if (w(i, obj2)) {
                            cp cpVar3 = dp.f14199c;
                            cpVar3.g(obj, j10, cpVar3.l(j10, obj2));
                            r(i, obj);
                            break;
                        }
                        break;
                    case 8:
                        if (w(i, obj2)) {
                            dp.m(obj, j10, dp.h(j10, obj2));
                            r(i, obj);
                            break;
                        }
                        break;
                    case 9:
                        o(obj, i, obj2);
                        break;
                    case 10:
                        if (w(i, obj2)) {
                            dp.m(obj, j10, dp.h(j10, obj2));
                            r(i, obj);
                            break;
                        }
                        break;
                    case 11:
                        if (w(i, obj2)) {
                            dp.k(j10, obj, dp.e(j10, obj2));
                            r(i, obj);
                            break;
                        }
                        break;
                    case 12:
                        if (w(i, obj2)) {
                            dp.k(j10, obj, dp.e(j10, obj2));
                            r(i, obj);
                            break;
                        }
                        break;
                    case 13:
                        if (w(i, obj2)) {
                            dp.k(j10, obj, dp.e(j10, obj2));
                            r(i, obj);
                            break;
                        }
                        break;
                    case 14:
                        if (w(i, obj2)) {
                            dp.l(j10, obj, dp.f(j10, obj2));
                            r(i, obj);
                            break;
                        }
                        break;
                    case 15:
                        if (w(i, obj2)) {
                            dp.k(j10, obj, dp.e(j10, obj2));
                            r(i, obj);
                            break;
                        }
                        break;
                    case 16:
                        if (w(i, obj2)) {
                            dp.l(j10, obj, dp.f(j10, obj2));
                            r(i, obj);
                            break;
                        }
                        break;
                    case 17:
                        o(obj, i, obj2);
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case com.google.android.gms.internal.ads.gl.zzm /* 21 */:
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
                        un unVar = (un) dp.h(j10, obj);
                        un unVar2 = (un) dp.h(j10, obj2);
                        int size = unVar.size();
                        int size2 = unVar2.size();
                        if (size > 0 && size2 > 0) {
                            if (!((mm) unVar).f14670u) {
                                unVar = unVar.f(size2 + size);
                            }
                            unVar.addAll(unVar2);
                        }
                        if (size > 0) {
                            unVar2 = unVar;
                        }
                        dp.m(obj, j10, unVar2);
                        break;
                    case 50:
                        jm jmVar = so.f14979a;
                        dp.m(obj, j10, jm.j(dp.h(j10, obj), dp.h(j10, obj2)));
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
                        if (z(i11, obj2, i)) {
                            dp.m(obj, j10, dp.h(j10, obj2));
                            s(i11, obj, i);
                            break;
                        }
                        break;
                    case 60:
                        p(obj, i, obj2);
                        break;
                    case 61:
                    case 62:
                    case ColorSpace.MAX_ID /* 63 */:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (z(i11, obj2, i)) {
                            dp.m(obj, j10, dp.h(j10, obj2));
                            s(i11, obj, i);
                            break;
                        }
                        break;
                    case 68:
                        p(obj, i, obj2);
                        break;
                }
                obj3 = obj;
                i += 3;
                obj = obj3;
            } else {
                Object obj4 = obj;
                so.s(obj4, obj2);
                if (this.f14523f) {
                    so.r(obj4, obj2);
                    return;
                }
                return;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:34:0x00b0. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0603 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0038  */
    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ro
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(java.lang.Object r23, com.google.android.gms.internal.mlkit_vision_digital_ink.s5 r24) {
        /*
            Method dump skipped, instructions count: 1716
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_digital_ink.jo.f(java.lang.Object, com.google.android.gms.internal.mlkit_vision_digital_ink.s5):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0015. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01d5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01c7 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ro
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(com.google.android.gms.internal.mlkit_vision_digital_ink.nn r8, com.google.android.gms.internal.mlkit_vision_digital_ink.nn r9) {
        /*
            Method dump skipped, instructions count: 632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_digital_ink.jo.g(com.google.android.gms.internal.mlkit_vision_digital_ink.nn, com.google.android.gms.internal.mlkit_vision_digital_ink.nn):boolean");
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
    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ro
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(com.google.android.gms.internal.mlkit_vision_digital_ink.nn r11) {
        /*
            Method dump skipped, instructions count: 744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_digital_ink.jo.h(com.google.android.gms.internal.mlkit_vision_digital_ink.nn):int");
    }

    /*  JADX ERROR: Type inference failed
//         jadx.core.utils.exceptions.JadxOverflowException: Type update terminated with stack overflow, arg: (r15v3 java.lang.Object), method size: 2664
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ro
    public final void i(java.lang.Object r23, androidx.datastore.preferences.protobuf.i r24, com.google.android.gms.internal.mlkit_vision_digital_ink.bn r25) {
        /*
            Method dump skipped, instructions count: 2664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_digital_ink.jo.i(java.lang.Object, androidx.datastore.preferences.protobuf.i, com.google.android.gms.internal.mlkit_vision_digital_ink.bn):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x004c. Please report as an issue. */
    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ro
    public final int j(km kmVar) {
        int i;
        int c10;
        int d2;
        int i10;
        int b10;
        int j10;
        int c11;
        int size;
        int p10;
        int c12;
        int c13;
        int c14;
        int i11;
        int c15;
        int d10;
        jo joVar = this;
        km kmVar2 = kmVar;
        Unsafe unsafe = f14518n;
        int i12 = 1048575;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            int[] iArr = joVar.f14519a;
            if (i14 < iArr.length) {
                int H = joVar.H(i14);
                int G = G(H);
                int i17 = iArr[i14];
                int i18 = iArr[i14 + 2];
                int i19 = i18 & i12;
                if (G <= 17) {
                    if (i19 != i13) {
                        if (i19 == i12) {
                            i15 = 0;
                        } else {
                            i15 = unsafe.getInt(kmVar2, i19);
                        }
                        i13 = i19;
                    }
                    i = 1 << (i18 >>> 20);
                } else {
                    i = 0;
                }
                int i20 = H & i12;
                if (G >= en.f14261v.f14265u) {
                    en.f14262w.getClass();
                }
                long j11 = i20;
                switch (G) {
                    case 0:
                        if (joVar.x(kmVar2, i14, i13, i15, i)) {
                            i16 = wd0.v(i17 << 3, 8, i16);
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (joVar.x(kmVar2, i14, i13, i15, i)) {
                            i16 = wd0.v(i17 << 3, 4, i16);
                        }
                        joVar = this;
                        break;
                    case 2:
                        if (joVar.x(kmVar2, i14, i13, i15, i)) {
                            long j12 = unsafe.getLong(kmVar2, j11);
                            c10 = ym.c(i17 << 3);
                            d2 = ym.d(j12);
                            i16 += d2 + c10;
                        }
                        joVar = this;
                        break;
                    case 3:
                        if (joVar.x(kmVar2, i14, i13, i15, i)) {
                            long j13 = unsafe.getLong(kmVar2, j11);
                            c10 = ym.c(i17 << 3);
                            d2 = ym.d(j13);
                            i16 += d2 + c10;
                        }
                        joVar = this;
                        break;
                    case 4:
                        if (joVar.x(kmVar2, i14, i13, i15, i)) {
                            long j14 = unsafe.getInt(kmVar2, j11);
                            c10 = ym.c(i17 << 3);
                            d2 = ym.d(j14);
                            i16 += d2 + c10;
                        }
                        joVar = this;
                        break;
                    case 5:
                        if (joVar.x(kmVar2, i14, i13, i15, i)) {
                            i16 = wd0.v(i17 << 3, 8, i16);
                        }
                        joVar = this;
                        break;
                    case 6:
                        if (joVar.x(kmVar2, i14, i13, i15, i)) {
                            i16 = wd0.v(i17 << 3, 4, i16);
                        }
                        joVar = this;
                        break;
                    case 7:
                        if (joVar.x(kmVar2, i14, i13, i15, i)) {
                            i16 = wd0.v(i17 << 3, 1, i16);
                        }
                        joVar = this;
                        break;
                    case 8:
                        if (joVar.x(kmVar2, i14, i13, i15, i)) {
                            int i21 = i17 << 3;
                            Object object = unsafe.getObject(kmVar2, j11);
                            if (object instanceof tm) {
                                int c16 = ym.c(i21);
                                int d11 = ((tm) object).d();
                                i16 = wd0.s(d11, d11, c16, i16);
                            } else {
                                c10 = ym.c(i21);
                                d2 = ym.b((String) object);
                                i16 += d2 + c10;
                            }
                        }
                        joVar = this;
                        break;
                    case 9:
                        if (joVar.x(kmVar2, i14, i13, i15, i)) {
                            Object object2 = unsafe.getObject(kmVar2, j11);
                            ro K = joVar.K(i14);
                            jm jmVar = so.f14979a;
                            int c17 = ym.c(i17 << 3);
                            int b11 = ((km) object2).b(K);
                            i16 = wd0.s(b11, b11, c17, i16);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (joVar.x(kmVar2, i14, i13, i15, i)) {
                            tm tmVar = (tm) unsafe.getObject(kmVar2, j11);
                            int c18 = ym.c(i17 << 3);
                            int d12 = tmVar.d();
                            i16 = wd0.s(d12, d12, c18, i16);
                        }
                        joVar = this;
                        break;
                    case 11:
                        if (joVar.x(kmVar2, i14, i13, i15, i)) {
                            i16 = wd0.v(unsafe.getInt(kmVar2, j11), ym.c(i17 << 3), i16);
                        }
                        joVar = this;
                        break;
                    case 12:
                        if (joVar.x(kmVar2, i14, i13, i15, i)) {
                            long j15 = unsafe.getInt(kmVar2, j11);
                            c10 = ym.c(i17 << 3);
                            d2 = ym.d(j15);
                            i16 += d2 + c10;
                        }
                        joVar = this;
                        break;
                    case 13:
                        if (joVar.x(kmVar2, i14, i13, i15, i)) {
                            i16 = wd0.v(i17 << 3, 4, i16);
                        }
                        joVar = this;
                        break;
                    case 14:
                        if (joVar.x(kmVar2, i14, i13, i15, i)) {
                            i16 = wd0.v(i17 << 3, 8, i16);
                        }
                        joVar = this;
                        break;
                    case 15:
                        if (joVar.x(kmVar2, i14, i13, i15, i)) {
                            int i22 = unsafe.getInt(kmVar2, j11);
                            i16 = wd0.v((i22 >> 31) ^ (i22 + i22), ym.c(i17 << 3), i16);
                        }
                        joVar = this;
                        break;
                    case 16:
                        if (joVar.x(kmVar2, i14, i13, i15, i)) {
                            long j16 = unsafe.getLong(kmVar2, j11);
                            c10 = ym.c(i17 << 3);
                            d2 = ym.d((j16 >> 63) ^ (j16 + j16));
                            i16 += d2 + c10;
                        }
                        joVar = this;
                        break;
                    case 17:
                        if (joVar.x(kmVar2, i14, i13, i15, i)) {
                            km kmVar3 = (km) unsafe.getObject(kmVar2, j11);
                            ro K2 = joVar.K(i14);
                            jm jmVar2 = so.f14979a;
                            int c19 = ym.c(i17 << 3);
                            i10 = c19 + c19;
                            b10 = kmVar3.b(K2);
                            j10 = b10 + i10;
                            i16 += j10;
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        j10 = so.j(i17, (List) unsafe.getObject(kmVar2, j11));
                        i16 += j10;
                        break;
                    case 19:
                        j10 = so.i(i17, (List) unsafe.getObject(kmVar2, j11));
                        i16 += j10;
                        break;
                    case 20:
                        List list = (List) unsafe.getObject(kmVar2, j11);
                        jm jmVar3 = so.f14979a;
                        if (list.size() != 0) {
                            c11 = (ym.c(i17 << 3) * list.size()) + so.l(list);
                            i16 += c11;
                            break;
                        }
                        c11 = 0;
                        i16 += c11;
                    case com.google.android.gms.internal.ads.gl.zzm /* 21 */:
                        List list2 = (List) unsafe.getObject(kmVar2, j11);
                        jm jmVar4 = so.f14979a;
                        size = list2.size();
                        if (size != 0) {
                            p10 = so.p(list2);
                            c12 = ym.c(i17 << 3);
                            c13 = (c12 * size) + p10;
                            i16 += c13;
                            break;
                        }
                        c13 = 0;
                        i16 += c13;
                    case 22:
                        List list3 = (List) unsafe.getObject(kmVar2, j11);
                        jm jmVar5 = so.f14979a;
                        size = list3.size();
                        if (size != 0) {
                            p10 = so.k(list3);
                            c12 = ym.c(i17 << 3);
                            c13 = (c12 * size) + p10;
                            i16 += c13;
                            break;
                        }
                        c13 = 0;
                        i16 += c13;
                    case 23:
                        j10 = so.j(i17, (List) unsafe.getObject(kmVar2, j11));
                        i16 += j10;
                        break;
                    case 24:
                        j10 = so.i(i17, (List) unsafe.getObject(kmVar2, j11));
                        i16 += j10;
                        break;
                    case 25:
                        List list4 = (List) unsafe.getObject(kmVar2, j11);
                        jm jmVar6 = so.f14979a;
                        int size2 = list4.size();
                        if (size2 != 0) {
                            c11 = (ym.c(i17 << 3) + 1) * size2;
                            i16 += c11;
                            break;
                        }
                        c11 = 0;
                        i16 += c11;
                    case 26:
                        List list5 = (List) unsafe.getObject(kmVar2, j11);
                        jm jmVar7 = so.f14979a;
                        int size3 = list5.size();
                        if (size3 != 0) {
                            c13 = ym.c(i17 << 3) * size3;
                            if (list5 instanceof zn) {
                                zn znVar = (zn) list5;
                                for (int i23 = 0; i23 < size3; i23++) {
                                    Object c20 = znVar.c();
                                    if (c20 instanceof tm) {
                                        int d13 = ((tm) c20).d();
                                        c13 = wd0.v(d13, d13, c13);
                                    } else {
                                        c13 = ym.b((String) c20) + c13;
                                    }
                                }
                            } else {
                                for (int i24 = 0; i24 < size3; i24++) {
                                    Object obj = list5.get(i24);
                                    if (obj instanceof tm) {
                                        int d14 = ((tm) obj).d();
                                        c13 = wd0.v(d14, d14, c13);
                                    } else {
                                        c13 = ym.b((String) obj) + c13;
                                    }
                                }
                            }
                            i16 += c13;
                            break;
                        }
                        c13 = 0;
                        i16 += c13;
                    case 27:
                        List list6 = (List) unsafe.getObject(kmVar2, j11);
                        ro K3 = joVar.K(i14);
                        jm jmVar8 = so.f14979a;
                        int size4 = list6.size();
                        if (size4 == 0) {
                            c14 = 0;
                        } else {
                            c14 = ym.c(i17 << 3) * size4;
                            for (int i25 = 0; i25 < size4; i25++) {
                                int b12 = ((km) list6.get(i25)).b(K3);
                                c14 = wd0.v(b12, b12, c14);
                            }
                        }
                        i16 += c14;
                        break;
                    case 28:
                        List list7 = (List) unsafe.getObject(kmVar2, j11);
                        jm jmVar9 = so.f14979a;
                        int size5 = list7.size();
                        if (size5 != 0) {
                            c13 = ym.c(i17 << 3) * size5;
                            for (int i26 = 0; i26 < list7.size(); i26++) {
                                int d15 = ((tm) list7.get(i26)).d();
                                c13 = wd0.v(d15, d15, c13);
                            }
                            i16 += c13;
                            break;
                        }
                        c13 = 0;
                        i16 += c13;
                    case 29:
                        List list8 = (List) unsafe.getObject(kmVar2, j11);
                        jm jmVar10 = so.f14979a;
                        size = list8.size();
                        if (size != 0) {
                            p10 = so.o(list8);
                            c12 = ym.c(i17 << 3);
                            c13 = (c12 * size) + p10;
                            i16 += c13;
                            break;
                        }
                        c13 = 0;
                        i16 += c13;
                    case 30:
                        List list9 = (List) unsafe.getObject(kmVar2, j11);
                        jm jmVar11 = so.f14979a;
                        size = list9.size();
                        if (size != 0) {
                            p10 = so.h(list9);
                            c12 = ym.c(i17 << 3);
                            c13 = (c12 * size) + p10;
                            i16 += c13;
                            break;
                        }
                        c13 = 0;
                        i16 += c13;
                    case 31:
                        j10 = so.i(i17, (List) unsafe.getObject(kmVar2, j11));
                        i16 += j10;
                        break;
                    case 32:
                        j10 = so.j(i17, (List) unsafe.getObject(kmVar2, j11));
                        i16 += j10;
                        break;
                    case 33:
                        List list10 = (List) unsafe.getObject(kmVar2, j11);
                        jm jmVar12 = so.f14979a;
                        size = list10.size();
                        if (size != 0) {
                            p10 = so.m(list10);
                            c12 = ym.c(i17 << 3);
                            c13 = (c12 * size) + p10;
                            i16 += c13;
                            break;
                        }
                        c13 = 0;
                        i16 += c13;
                    case 34:
                        List list11 = (List) unsafe.getObject(kmVar2, j11);
                        jm jmVar13 = so.f14979a;
                        size = list11.size();
                        if (size != 0) {
                            p10 = so.n(list11);
                            c12 = ym.c(i17 << 3);
                            c13 = (c12 * size) + p10;
                            i16 += c13;
                            break;
                        }
                        c13 = 0;
                        i16 += c13;
                    case 35:
                        List list12 = (List) unsafe.getObject(kmVar2, j11);
                        jm jmVar14 = so.f14979a;
                        int size6 = list12.size() * 8;
                        if (size6 > 0) {
                            i16 = wd0.s(size6, ym.c(i17 << 3), size6, i16);
                            break;
                        } else {
                            break;
                        }
                    case 36:
                        List list13 = (List) unsafe.getObject(kmVar2, j11);
                        jm jmVar15 = so.f14979a;
                        int size7 = list13.size() * 4;
                        if (size7 > 0) {
                            i16 = wd0.s(size7, ym.c(i17 << 3), size7, i16);
                            break;
                        } else {
                            break;
                        }
                    case 37:
                        int l10 = so.l((List) unsafe.getObject(kmVar2, j11));
                        if (l10 > 0) {
                            i16 = wd0.s(l10, ym.c(i17 << 3), l10, i16);
                            break;
                        } else {
                            break;
                        }
                    case 38:
                        int p11 = so.p((List) unsafe.getObject(kmVar2, j11));
                        if (p11 > 0) {
                            i16 = wd0.s(p11, ym.c(i17 << 3), p11, i16);
                            break;
                        } else {
                            break;
                        }
                    case 39:
                        int k3 = so.k((List) unsafe.getObject(kmVar2, j11));
                        if (k3 > 0) {
                            i16 = wd0.s(k3, ym.c(i17 << 3), k3, i16);
                            break;
                        } else {
                            break;
                        }
                    case 40:
                        List list14 = (List) unsafe.getObject(kmVar2, j11);
                        jm jmVar16 = so.f14979a;
                        int size8 = list14.size() * 8;
                        if (size8 > 0) {
                            i16 = wd0.s(size8, ym.c(i17 << 3), size8, i16);
                            break;
                        } else {
                            break;
                        }
                    case 41:
                        List list15 = (List) unsafe.getObject(kmVar2, j11);
                        jm jmVar17 = so.f14979a;
                        int size9 = list15.size() * 4;
                        if (size9 > 0) {
                            i16 = wd0.s(size9, ym.c(i17 << 3), size9, i16);
                            break;
                        } else {
                            break;
                        }
                    case 42:
                        List list16 = (List) unsafe.getObject(kmVar2, j11);
                        jm jmVar18 = so.f14979a;
                        int size10 = list16.size();
                        if (size10 > 0) {
                            i16 = wd0.s(size10, ym.c(i17 << 3), size10, i16);
                            break;
                        } else {
                            break;
                        }
                    case 43:
                        int o10 = so.o((List) unsafe.getObject(kmVar2, j11));
                        if (o10 > 0) {
                            i16 = wd0.s(o10, ym.c(i17 << 3), o10, i16);
                            break;
                        } else {
                            break;
                        }
                    case 44:
                        int h3 = so.h((List) unsafe.getObject(kmVar2, j11));
                        if (h3 > 0) {
                            i16 = wd0.s(h3, ym.c(i17 << 3), h3, i16);
                            break;
                        } else {
                            break;
                        }
                    case 45:
                        List list17 = (List) unsafe.getObject(kmVar2, j11);
                        jm jmVar19 = so.f14979a;
                        int size11 = list17.size() * 4;
                        if (size11 > 0) {
                            i16 = wd0.s(size11, ym.c(i17 << 3), size11, i16);
                            break;
                        } else {
                            break;
                        }
                    case 46:
                        List list18 = (List) unsafe.getObject(kmVar2, j11);
                        jm jmVar20 = so.f14979a;
                        int size12 = list18.size() * 8;
                        if (size12 > 0) {
                            i16 = wd0.s(size12, ym.c(i17 << 3), size12, i16);
                            break;
                        } else {
                            break;
                        }
                    case 47:
                        int m4 = so.m((List) unsafe.getObject(kmVar2, j11));
                        if (m4 > 0) {
                            i16 = wd0.s(m4, ym.c(i17 << 3), m4, i16);
                            break;
                        } else {
                            break;
                        }
                    case 48:
                        int n10 = so.n((List) unsafe.getObject(kmVar2, j11));
                        if (n10 > 0) {
                            i16 = wd0.s(n10, ym.c(i17 << 3), n10, i16);
                            break;
                        } else {
                            break;
                        }
                    case 49:
                        List list19 = (List) unsafe.getObject(kmVar2, j11);
                        ro K4 = joVar.K(i14);
                        jm jmVar21 = so.f14979a;
                        int size13 = list19.size();
                        if (size13 == 0) {
                            i11 = 0;
                        } else {
                            i11 = 0;
                            for (int i27 = 0; i27 < size13; i27++) {
                                km kmVar4 = (km) list19.get(i27);
                                int c21 = ym.c(i17 << 3);
                                i11 += kmVar4.b(K4) + c21 + c21;
                            }
                        }
                        i16 += i11;
                        break;
                    case 50:
                        eo eoVar = (eo) unsafe.getObject(kmVar2, j11);
                        co coVar = (co) joVar.M(i14);
                        if (!eoVar.isEmpty()) {
                            c13 = 0;
                            for (Map.Entry entry : eoVar.entrySet()) {
                                Object key = entry.getKey();
                                Object value = entry.getValue();
                                ra.e eVar = coVar.f14163a;
                                int c22 = ym.c(i17 << 3);
                                int a10 = co.a(eVar, key, value);
                                c13 = wd0.s(a10, a10, c22, c13);
                            }
                            i16 += c13;
                            break;
                        }
                        c13 = 0;
                        i16 += c13;
                    case 51:
                        if (joVar.z(i17, kmVar2, i14)) {
                            i16 = wd0.v(i17 << 3, 8, i16);
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (joVar.z(i17, kmVar2, i14)) {
                            i16 = wd0.v(i17 << 3, 4, i16);
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (joVar.z(i17, kmVar2, i14)) {
                            long I = I(j11, kmVar2);
                            c15 = ym.c(i17 << 3);
                            d10 = ym.d(I);
                            i16 += d10 + c15;
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (joVar.z(i17, kmVar2, i14)) {
                            long I2 = I(j11, kmVar2);
                            c15 = ym.c(i17 << 3);
                            d10 = ym.d(I2);
                            i16 += d10 + c15;
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (joVar.z(i17, kmVar2, i14)) {
                            long E = E(j11, kmVar2);
                            c15 = ym.c(i17 << 3);
                            d10 = ym.d(E);
                            i16 += d10 + c15;
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (joVar.z(i17, kmVar2, i14)) {
                            i16 = wd0.v(i17 << 3, 8, i16);
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (joVar.z(i17, kmVar2, i14)) {
                            i16 = wd0.v(i17 << 3, 4, i16);
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (joVar.z(i17, kmVar2, i14)) {
                            i16 = wd0.v(i17 << 3, 1, i16);
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (joVar.z(i17, kmVar2, i14)) {
                            int i28 = i17 << 3;
                            Object object3 = unsafe.getObject(kmVar2, j11);
                            if (object3 instanceof tm) {
                                int c23 = ym.c(i28);
                                int d16 = ((tm) object3).d();
                                i16 = wd0.s(d16, d16, c23, i16);
                                break;
                            } else {
                                c15 = ym.c(i28);
                                d10 = ym.b((String) object3);
                                i16 += d10 + c15;
                                break;
                            }
                        } else {
                            break;
                        }
                    case 60:
                        if (joVar.z(i17, kmVar2, i14)) {
                            Object object4 = unsafe.getObject(kmVar2, j11);
                            ro K5 = joVar.K(i14);
                            jm jmVar22 = so.f14979a;
                            int c24 = ym.c(i17 << 3);
                            int b13 = ((km) object4).b(K5);
                            i16 = wd0.s(b13, b13, c24, i16);
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (joVar.z(i17, kmVar2, i14)) {
                            tm tmVar2 = (tm) unsafe.getObject(kmVar2, j11);
                            int c25 = ym.c(i17 << 3);
                            int d17 = tmVar2.d();
                            i16 = wd0.s(d17, d17, c25, i16);
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (joVar.z(i17, kmVar2, i14)) {
                            i16 = wd0.v(E(j11, kmVar2), ym.c(i17 << 3), i16);
                            break;
                        } else {
                            break;
                        }
                    case ColorSpace.MAX_ID /* 63 */:
                        if (joVar.z(i17, kmVar2, i14)) {
                            long E2 = E(j11, kmVar2);
                            c15 = ym.c(i17 << 3);
                            d10 = ym.d(E2);
                            i16 += d10 + c15;
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (joVar.z(i17, kmVar2, i14)) {
                            i16 = wd0.v(i17 << 3, 4, i16);
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (joVar.z(i17, kmVar2, i14)) {
                            i16 = wd0.v(i17 << 3, 8, i16);
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (joVar.z(i17, kmVar2, i14)) {
                            int E3 = E(j11, kmVar2);
                            i16 = wd0.v((E3 >> 31) ^ (E3 + E3), ym.c(i17 << 3), i16);
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (joVar.z(i17, kmVar2, i14)) {
                            long I3 = I(j11, kmVar2);
                            c15 = ym.c(i17 << 3);
                            d10 = ym.d((I3 >> 63) ^ (I3 + I3));
                            i16 += d10 + c15;
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (joVar.z(i17, kmVar2, i14)) {
                            km kmVar5 = (km) unsafe.getObject(kmVar2, j11);
                            ro K6 = joVar.K(i14);
                            jm jmVar23 = so.f14979a;
                            int c26 = ym.c(i17 << 3);
                            i10 = c26 + c26;
                            b10 = kmVar5.b(K6);
                            j10 = b10 + i10;
                            i16 += j10;
                            break;
                        } else {
                            break;
                        }
                }
                i14 += 3;
                kmVar2 = kmVar;
                i12 = 1048575;
            } else {
                int a11 = ((nn) kmVar).zzc.a() + i16;
                if (joVar.f14523f) {
                    to toVar = ((kn) kmVar).zza.f14195a;
                    int i29 = toVar.f15015v;
                    int i30 = 0;
                    for (int i31 = 0; i31 < i29; i31++) {
                        uo c27 = toVar.c(i31);
                        ln lnVar = (ln) c27.f15065u;
                        i30 = dn.a(lnVar.f14605v, lnVar.f14604u, c27.f15066v) + i30;
                    }
                    for (Map.Entry entry2 : toVar.a()) {
                        ln lnVar2 = (ln) entry2.getKey();
                        i30 = dn.a(lnVar2.f14605v, lnVar2.f14604u, entry2.getValue()) + i30;
                    }
                    return a11 + i30;
                }
                return a11;
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ro
    public final void k(Object obj, byte[] bArr, int i, int i10, pm pmVar) {
        B(obj, bArr, i, i10, 0, pmVar);
    }

    public final Object l(int i, Object obj, int i10) {
        ro K = K(i10);
        if (!z(i, obj, i10)) {
            return K.a();
        }
        Object object = f14518n.getObject(obj, H(i10) & 1048575);
        if (y(object)) {
            return object;
        }
        Object a10 = K.a();
        if (object != null) {
            K.e(a10, object);
        }
        return a10;
    }

    public final void o(Object obj, int i, Object obj2) {
        if (!w(i, obj2)) {
            return;
        }
        int H = H(i) & 1048575;
        Unsafe unsafe = f14518n;
        long j10 = H;
        Object object = unsafe.getObject(obj2, j10);
        if (object != null) {
            ro K = K(i);
            if (!w(i, obj)) {
                if (!y(object)) {
                    unsafe.putObject(obj, j10, object);
                } else {
                    Object a10 = K.a();
                    K.e(a10, object);
                    unsafe.putObject(obj, j10, a10);
                }
                r(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!y(object2)) {
                Object a11 = K.a();
                K.e(a11, object2);
                unsafe.putObject(obj, j10, a11);
                object2 = a11;
            }
            K.e(object2, object);
            return;
        }
        androidx.datastore.preferences.protobuf.s1.g(this.f14519a[i], obj2);
    }

    public final void p(Object obj, int i, Object obj2) {
        int[] iArr = this.f14519a;
        int i10 = iArr[i];
        if (!z(i10, obj2, i)) {
            return;
        }
        int H = H(i) & 1048575;
        Unsafe unsafe = f14518n;
        long j10 = H;
        Object object = unsafe.getObject(obj2, j10);
        if (object != null) {
            ro K = K(i);
            if (!z(i10, obj, i)) {
                if (!y(object)) {
                    unsafe.putObject(obj, j10, object);
                } else {
                    Object a10 = K.a();
                    K.e(a10, object);
                    unsafe.putObject(obj, j10, a10);
                }
                s(i10, obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!y(object2)) {
                Object a11 = K.a();
                K.e(a11, object2);
                unsafe.putObject(obj, j10, a11);
                object2 = a11;
            }
            K.e(object2, object);
            return;
        }
        androidx.datastore.preferences.protobuf.s1.g(iArr[i], obj2);
    }

    public final void q(int i, androidx.datastore.preferences.protobuf.i iVar, Object obj) {
        boolean z3;
        rm1 rm1Var = (rm1) iVar.f737y;
        if ((536870912 & i) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        long j10 = i & 1048575;
        if (z3) {
            iVar.S0(2);
            dp.m(obj, j10, rm1Var.Z());
        } else if (this.f14524g) {
            iVar.S0(2);
            dp.m(obj, j10, rm1Var.Y());
        } else {
            dp.m(obj, j10, iVar.c1());
        }
    }

    public final void r(int i, Object obj) {
        int i10 = this.f14519a[i + 2];
        long j10 = 1048575 & i10;
        if (j10 == 1048575) {
            return;
        }
        dp.k(j10, obj, (1 << (i10 >>> 20)) | dp.e(j10, obj));
    }

    public final void s(int i, Object obj, int i10) {
        dp.k(this.f14519a[i10 + 2] & 1048575, obj, i);
    }

    public final void t(Object obj, int i, Object obj2) {
        f14518n.putObject(obj, H(i) & 1048575, obj2);
        r(i, obj);
    }

    public final void u(int i, int i10, Object obj, Object obj2) {
        f14518n.putObject(obj, H(i10) & 1048575, obj2);
        s(i, obj, i10);
    }

    public final boolean v(nn nnVar, nn nnVar2, int i) {
        if (w(i, nnVar) == w(i, nnVar2)) {
            return true;
        }
        return false;
    }

    public final boolean w(int i, Object obj) {
        int i10 = this.f14519a[i + 2];
        long j10 = i10 & 1048575;
        if (j10 == 1048575) {
            int H = H(i);
            long j11 = H & 1048575;
            switch (G(H)) {
                case 0:
                    if (Double.doubleToRawLongBits(dp.f14199c.a(j11, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(dp.f14199c.c(j11, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (dp.f(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (dp.f(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (dp.e(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (dp.f(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (dp.e(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return dp.f14199c.l(j11, obj);
                case 8:
                    Object h3 = dp.h(j11, obj);
                    if (h3 instanceof String) {
                        if (((String) h3).isEmpty()) {
                            return false;
                        }
                    } else if (h3 instanceof tm) {
                        if (tm.f15012v.equals(h3)) {
                            return false;
                        }
                    } else {
                        q.x.m();
                        return false;
                    }
                    break;
                case 9:
                    if (dp.h(j11, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (tm.f15012v.equals(dp.h(j11, obj))) {
                        return false;
                    }
                    break;
                case 11:
                    if (dp.e(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (dp.e(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (dp.e(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (dp.f(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (dp.e(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (dp.f(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (dp.h(j11, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    q.x.m();
                    return false;
            }
        } else if (((1 << (i10 >>> 20)) & dp.e(j10, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean x(Object obj, int i, int i10, int i11, int i12) {
        if (i10 == 1048575) {
            return w(i, obj);
        }
        if ((i11 & i12) != 0) {
            return true;
        }
        return false;
    }

    public final boolean z(int i, Object obj, int i10) {
        if (dp.e(this.f14519a[i10 + 2] & 1048575, obj) == i) {
            return true;
        }
        return false;
    }
}
