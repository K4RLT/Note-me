package b8;
import o0.b;
import b8.p5;
import b8.r4;
import d1.c;
import d1.j;
import d1.o;
import d1.r;
import eb.w;
import j6.e;
import k1.c0;
import k1.l0;
import kb.b;
import l.a;
import m.h;
import m2.g;
import m2.o0;
import m2.q0;
import q2.i;
import q2.s;
import r0.a1;
import r0.l;
import r0.m;
import r0.q1;
import r0.y;

import androidx.compose.foundation.layout.FillElement;
import java.util.Map;
import ya.ae;

/* loaded from: classes.dex */
public abstract class r4 {
    public static final long A;
    public static final long B;

    /* renamed from: b, reason: collision with root package name */
    public static final float f2636b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f2637c;

    /* renamed from: d, reason: collision with root package name */
    public static final float f2638d;

    /* renamed from: g, reason: collision with root package name */
    public static final float f2640g;

    /* renamed from: k, reason: collision with root package name */
    public static final long f2643k;

    /* renamed from: l, reason: collision with root package name */
    public static final long f2644l;

    /* renamed from: m, reason: collision with root package name */
    public static final long f2645m;

    /* renamed from: n, reason: collision with root package name */
    public static final c0 f2646n;

    /* renamed from: o, reason: collision with root package name */
    public static final c0 f2647o;

    /* renamed from: p, reason: collision with root package name */
    public static final long f2648p;

    /* renamed from: q, reason: collision with root package name */
    public static final long f2649q;

    /* renamed from: r, reason: collision with root package name */
    public static final long f2650r;

    /* renamed from: s, reason: collision with root package name */
    public static final long f2651s;

    /* renamed from: t, reason: collision with root package name */
    public static final float f2652t;

    /* renamed from: u, reason: collision with root package name */
    public static final long f2653u;

    /* renamed from: v, reason: collision with root package name */
    public static final float[] f2654v;

    /* renamed from: w, reason: collision with root package name */
    public static final c0 f2655w;

    /* renamed from: x, reason: collision with root package name */
    public static final long f2656x;

    /* renamed from: y, reason: collision with root package name */
    public static final c0 f2657y;

    /* renamed from: z, reason: collision with root package name */
    public static final long f2658z;

    /* renamed from: a, reason: collision with root package name */
    public static final float f2635a = 28;
    public static final float e = 9;

    /* renamed from: f, reason: collision with root package name */
    public static final float f2639f = (float) 8.5d;

    /* renamed from: h, reason: collision with root package name */
    public static final float f2641h = (float) 6.2d;
    public static final float i = (float) 2.8d;

    /* renamed from: j, reason: collision with root package name */
    public static final float f2642j = (float) 1.35d;

    static {
        float f10 = 41;
        f2636b = f10;
        float f11 = 10;
        f2637c = f11;
        f2638d = f11 + f10;
        float f12 = (float) 1.5d;
        f2640g = f12;
        long d2 = l0.d(4292257653L);
        f2643k = d2;
        long d10 = l0.d(4291270499L);
        f2644l = d10;
        long d11 = l0.d(4290085968L);
        f2645m = d11;
        f2646n = w.k(qe.h(new r(d2), new r(d10), new r(d11)), 0.0f, 0.0f, 14);
        f2647o = w.k(qe.h(new r(l0.d(4290414418L)), new r(l0.d(4289032766L)), new r(l0.d(4287519788L))), 0.0f, 0.0f, 14);
        f2648p = l0.d(4280818706L);
        f2649q = l0.d(4292853911L);
        f2650r = l0.d(4291074668L);
        f2651s = l0.d(4287127092L);
        f2652t = f12;
        f2653u = ae.c(0.02d);
        f2654v = new float[]{-4.5f, -3.0f, -1.5f, 1.5f, 3.0f, 4.5f};
        f2655w = w.k(qe.h(new r(l0.d(4289237503L)), new r(e), new r(l0.d(4285814760L))), 0.0f, 0.0f, 14);
        long d12 = l0.d(4294768360L);
        long d13 = l0.d(4294240980L);
        f2656x = d13;
        f2657y = w.k(qe.h(new r(d12), new r(d13), new r(l0.d(4293384894L))), 0.0f, 0.0f, 14);
        f2658z = l0.d(4292895325L);
        A = l0.d(4291381830L);
        B = l0.d(4287836462L);
    }

    public static final void a(x.p pVar, m mVar, int i10) {
        int i11;
        boolean z3;
        int i12;
        r rVar = (r) mVar;
        rVar.c0(1403930935);
        if ((i10 & 6) == 0) {
            if (rVar.f(pVar)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar.R(i11 & 1, z3)) {
            r l10 = androidx.compose.foundation.layout.d.l(androidx.compose.foundation.layout.a.o(pVar.a(o.f15687a, c.B), 0.0f, 0.0f, 0.0f, 7, 7), 15, 13);
            Object O = rVar.O();
            if (O == l.f24285a) {
                O = new n1(27);
                rVar.k0(O);
            }
            ya.a(l10, (df.l) O, rVar, 48);
        } else {
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new l4(pVar, i10, 1);
        }
    }

    public static final void b(final ca caVar, final r rVar, final e eVar, m mVar, final int i10) {
        int i11;
        int i12;
        int i13;
        boolean z3;
        final r rVar2;
        final e eVar2;
        ca caVar2;
        String str;
        String str2;
        int i14;
        p5 p5Var;
        caVar.getClass();
        String str3 = caVar.f1935a;
        r rVar3 = (r) mVar;
        rVar3.c0(-620138046);
        if (rVar3.f(caVar)) {
            i11 = 4;
        } else {
            i11 = 2;
        }
        int i15 = i11 | i10;
        if (rVar3.f(rVar)) {
            i12 = 32;
        } else {
            i12 = 16;
        }
        int i16 = i15 | i12;
        if (rVar3.h(eVar)) {
            i13 = 256;
        } else {
            i13 = 128;
        }
        int i17 = i16 | i13;
        if ((i17 & 147) != 146) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar3.R(i17 & 1, z3)) {
            a1 o10 = y.o(b.f24612b, rVar3);
            a1 o11 = y.o(s7.f2724g, rVar3);
            if (caVar.c()) {
                str = (String) ((Map) o11.getValue()).get(caVar.f1949q);
            } else {
                str = null;
            }
            if (caVar.c()) {
                if (str != null && !mf.f.u(str)) {
                    p5Var = p5.KRAFT;
                    rVar2 = rVar;
                    i14 = 0;
                    eVar2 = eVar;
                    caVar2 = caVar;
                    str2 = str;
                } else {
                    q1 t3 = rVar3.t();
                    if (t3 != null) {
                        final int i18 = 0;
                        t3.f24332d = new df.p(caVar, rVar, eVar, i10, i18) { // from class: b8.k4

                            /* renamed from: u, reason: collision with root package name */
                            public final /* synthetic */ int f2307u;

                            /* renamed from: v, reason: collision with root package name */
                            public final /* synthetic */ ca f2308v;

                            /* renamed from: w, reason: collision with root package name */
                            public final /* synthetic */ r f2309w;

                            /* renamed from: x, reason: collision with root package name */
                            public final /* synthetic */ e f2310x;

                            {
                                this.f2307u = i18;
                            }

                            @Override // df.p
                            public final Object invoke(Object obj, Object obj2) {
                                int i19 = this.f2307u;
                                m mVar2 = (m) obj;
                                ((Integer) obj2).getClass();
                                switch (i19) {
                                    case 0:
                                        r4.b(this.f2308v, this.f2309w, this.f2310x, mVar2, y.L(1));
                                        break;
                                    case 1:
                                        r4.b(this.f2308v, this.f2309w, this.f2310x, mVar2, y.L(1));
                                        break;
                                    default:
                                        r4.b(this.f2308v, this.f2309w, this.f2310x, mVar2, y.L(1));
                                        break;
                                }
                                return pe.z.f22715a;
                            }
                        };
                        return;
                    }
                    return;
                }
            } else {
                str2 = str;
                rVar2 = rVar;
                i14 = 0;
                eVar2 = eVar;
                if (kotlin.jvm.internal.a(caVar.d(), "ad") && !((Boolean) o10.getValue()).booleanValue()) {
                    p5Var = p5.AD;
                    caVar2 = caVar;
                    i10 = i10;
                } else if (kotlin.jvm.internal.a(caVar.d(), "free") || kotlin.jvm.internal.a(caVar.d(), "ad")) {
                    caVar2 = caVar;
                    i10 = i10;
                    p5Var = p5.GIFT;
                } else {
                    q1 t10 = rVar3.t();
                    if (t10 != null) {
                        final int i19 = 1;
                        t10.f24332d = new df.p(caVar, rVar2, eVar2, i10, i19) { // from class: b8.k4

                            /* renamed from: u, reason: collision with root package name */
                            public final /* synthetic */ int f2307u;

                            /* renamed from: v, reason: collision with root package name */
                            public final /* synthetic */ ca f2308v;

                            /* renamed from: w, reason: collision with root package name */
                            public final /* synthetic */ r f2309w;

                            /* renamed from: x, reason: collision with root package name */
                            public final /* synthetic */ e f2310x;

                            {
                                this.f2307u = i19;
                            }

                            @Override // df.p
                            public final Object invoke(Object obj, Object obj2) {
                                int i192 = this.f2307u;
                                m mVar2 = (m) obj;
                                ((Integer) obj2).getClass();
                                switch (i192) {
                                    case 0:
                                        r4.b(this.f2308v, this.f2309w, this.f2310x, mVar2, y.L(1));
                                        break;
                                    case 1:
                                        r4.b(this.f2308v, this.f2309w, this.f2310x, mVar2, y.L(1));
                                        break;
                                    default:
                                        r4.b(this.f2308v, this.f2309w, this.f2310x, mVar2, y.L(1));
                                        break;
                                }
                                return pe.z.f22715a;
                            }
                        };
                        return;
                    }
                    return;
                }
            }
            boolean f10 = rVar3.f(str3);
            Object O = rVar3.O();
            if (f10 || O == l.f24285a) {
                int hashCode = str3.hashCode();
                if (hashCode != Integer.MIN_VALUE) {
                    i14 = Math.abs(hashCode);
                }
                float[] fArr = f2654v;
                O = Float.valueOf(fArr[i14 % fArr.length]);
                rVar3.k0(O);
            }
            float floatValue = ((Number) O).floatValue();
            c d2 = h.d(2093159888, new m4(p5Var, 0, str2), rVar3);
            int i20 = i17 << 3;
            c(p5Var, floatValue, rVar2, eVar2, d2, rVar3, (i20 & 896) | 24576 | (i20 & 7168));
        } else {
            rVar2 = rVar;
            eVar2 = eVar;
            caVar2 = caVar;
            rVar3.U();
        }
        q1 t11 = rVar3.t();
        if (t11 != null) {
            final int i21 = 2;
            final ca caVar3 = caVar2;
            final int i22 = i10;
            t11.f24332d = new df.p(caVar3, rVar2, eVar2, i22, i21) { // from class: b8.k4

                /* renamed from: u, reason: collision with root package name */
                public final /* synthetic */ int f2307u;

                /* renamed from: v, reason: collision with root package name */
                public final /* synthetic */ ca f2308v;

                /* renamed from: w, reason: collision with root package name */
                public final /* synthetic */ r f2309w;

                /* renamed from: x, reason: collision with root package name */
                public final /* synthetic */ e f2310x;

                {
                    this.f2307u = i21;
                }

                @Override // df.p
                public final Object invoke(Object obj, Object obj2) {
                    int i192 = this.f2307u;
                    m mVar2 = (m) obj;
                    ((Integer) obj2).getClass();
                    switch (i192) {
                        case 0:
                            r4.b(this.f2308v, this.f2309w, this.f2310x, mVar2, y.L(1));
                            break;
                        case 1:
                            r4.b(this.f2308v, this.f2309w, this.f2310x, mVar2, y.L(1));
                            break;
                        default:
                            r4.b(this.f2308v, this.f2309w, this.f2310x, mVar2, y.L(1));
                            break;
                    }
                    return pe.z.f22715a;
                }
            };
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0141, code lost:
    
        if (kotlin.jvm.internal.a(r0.O(), java.lang.Integer.valueOf(r3)) == false) goto L82;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(p5 r25, float r26, r r27, e r28, c r29, m r30, int r31) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.r4.c(p5, float, r, e, c, m, int):void");
    }

    public static final void d(x.p pVar, m mVar, int i10) {
        int i11;
        boolean z3;
        int i12;
        r rVar = (r) mVar;
        rVar.c0(-1344194945);
        if ((i10 & 6) == 0) {
            if (rVar.f(pVar)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar.R(i11 & 1, z3)) {
            FillElement fillElement = androidx.compose.foundation.layout.d.f506c;
            Object O = rVar.O();
            if (O == l.f24285a) {
                O = new n1(26);
                rVar.k0(O);
            }
            ya.a(fillElement, (df.l) O, rVar, 54);
            float f10 = 10;
            long c10 = l0.c(1073741824);
            j jVar = c.B;
            o oVar = o.f15687a;
            b(f10, 54, 0, c10, androidx.compose.foundation.layout.a.o(pVar.a(oVar, jVar), (float) 1.4d, 0.0f, 0.0f, (float) 8.6d, 6), rVar);
            b(f10, 54, 0, r.f19515d, androidx.compose.foundation.layout.a.o(pVar.a(oVar, jVar), 1, 0.0f, 0.0f, 9, 6), rVar);
        } else {
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new l4(pVar, i10, 0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0090, code lost:
    
        if (r8 > 11.0f) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(x.p r29, java.lang.String r30, m r31, int r32) {
        /*
            Method dump skipped, instructions count: 503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.r4.e(x.p, java.lang.String, m, int):void");
    }

    public static final float f(o0 o0Var, String str) {
        return (int) (o0.b(o0Var, new g(str), new q0(0L, ae.f(4294967296L, 11.0f), s.B, null, i.f23347w, f2653u, 0, 0L, null, 16777049), 0, 2, 0L, null, null, null, 2020).f20526c >> 32);
    }

    public static final String g(String str) {
        int i10;
        boolean z3;
        int length = str.length() - 1;
        int i11 = 0;
        boolean z9 = false;
        while (i11 <= length) {
            if (!z9) {
                i10 = i11;
            } else {
                i10 = length;
            }
            char charAt = str.charAt(i10);
            if (!ya.x0.c(charAt) && charAt != 160 && charAt != 8239) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (!z9) {
                if (!z3) {
                    z9 = true;
                } else {
                    i11++;
                }
            } else {
                if (!z3) {
                    break;
                }
                length--;
            }
        }
        return str.subSequence(i11, length + 1).toString();
    }
}
