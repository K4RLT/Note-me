package q;
import d1.c;
import d1.t;
import k0.w;
import n0.b;
import q.e;
import q.g;
import q.l;
import q.v0;
import r0.m;
import r0.r;
import r0.w0;
import r0.y;

import c2.a2;
import com.google.android.gms.internal.ads.fv0;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final m f22874a = new m(Float.POSITIVE_INFINITY);

    /* renamed from: b, reason: collision with root package name */
    public static final n f22875b = new n(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: c, reason: collision with root package name */
    public static final o f22876c = new o(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: d, reason: collision with root package name */
    public static final p f22877d = new p(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final m e = new m(Float.NEGATIVE_INFINITY);

    /* renamed from: f, reason: collision with root package name */
    public static final n f22878f = new n(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* renamed from: g, reason: collision with root package name */
    public static final o f22879g = new o(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* renamed from: h, reason: collision with root package name */
    public static final p f22880h = new p(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final float[] i = new float[91];

    public static d a(float f10) {
        return new d(Float.valueOf(f10), m1.f22948a, Float.valueOf(0.01f), 8);
    }

    public static l b(int i10, float f10, float f11) {
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        return new l(m1.f22948a, Float.valueOf(f10), new m(f11), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00fa A[Catch: CancellationException -> 0x0039, TRY_LEAVE, TryCatch #3 {CancellationException -> 0x0039, blocks: (B:16:0x0034, B:18:0x00e5, B:20:0x00fa, B:25:0x011d, B:27:0x012d, B:33:0x0132), top: B:15:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x014c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Type inference failed for: r0v11, types: [w0] */
    /* JADX WARN: Type inference failed for: r0v35, types: [w0] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [kotlin.jvm.internal.y] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19, types: [kotlin.jvm.internal.y] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21, types: [kotlin.jvm.internal.y] */
    /* JADX WARN: Type inference failed for: r1v22, types: [kotlin.jvm.internal.y] */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.jvm.internal.y] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [te.c, v0, ve.c] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(l r22, g r23, long r24, df.l r26, ve.c r27) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q.e.c(l, g, long, df.l, ve.c):java.lang.Object");
    }

    public static Object d(float f10, float f11, k kVar, df.p pVar, ve.i iVar, int i10) {
        k kVar2;
        if ((i10 & 8) != 0) {
            kVar2 = r(0.0f, 0.0f, null, 7);
        } else {
            kVar2 = kVar;
        }
        l1 l1Var = m1.f22948a;
        Float f12 = new Float(f10);
        Float f13 = new Float(f11);
        m mVar = new m(new Float(0.0f).floatValue());
        Object c10 = c(new l(l1Var, f12, mVar, 56), new a1(kVar2, l1Var, f12, f13, mVar), Long.MIN_VALUE, new u0(pVar), iVar);
        pe.z zVar = pe.z.f22715a;
        ue.a aVar = ue.a.f27192u;
        if (c10 != aVar) {
            c10 = zVar;
        }
        if (c10 == aVar) {
            return c10;
        }
        return zVar;
    }

    public static final Object e(l lVar, u uVar, boolean z3, df.l lVar2, ve.c cVar) {
        long j10;
        fv0 fv0Var = new fv0(uVar, lVar.f22936u, lVar.f22937v.getValue(), lVar.f22938w);
        if (z3) {
            j10 = lVar.f22939x;
        } else {
            j10 = Long.MIN_VALUE;
        }
        Object c10 = c(lVar, fv0Var, j10, lVar2, cVar);
        if (c10 == ue.a.f27192u) {
            return c10;
        }
        return pe.z.f22715a;
    }

    public static final e0 f(f0 f0Var, float f10, float f11, d0 d0Var, String str, m mVar, int i10, int i11) {
        if ((i11 & 8) != 0) {
            str = "FloatAnimation";
        }
        Float valueOf = Float.valueOf(f10);
        Float valueOf2 = Float.valueOf(f11);
        int i12 = i10 << 3;
        return i(f0Var, valueOf, valueOf2, m1.f22948a, d0Var, str, mVar, (i10 & 1022) | (57344 & i12) | (i12 & 458752), 0);
    }

    public static final Object g(l lVar, Float f10, k kVar, boolean z3, df.l lVar2, ve.c cVar) {
        long j10;
        a1 a1Var = new a1(kVar, lVar.f22936u, lVar.f22937v.getValue(), f10, lVar.f22938w);
        if (z3) {
            j10 = lVar.f22939x;
        } else {
            j10 = Long.MIN_VALUE;
        }
        Object c10 = c(lVar, a1Var, j10, lVar2, cVar);
        if (c10 == ue.a.f27192u) {
            return c10;
        }
        return pe.z.f22715a;
    }

    public static /* synthetic */ Object h(l lVar, Float f10, r0 r0Var, boolean z3, df.l lVar2, ve.c cVar, int i10) {
        if ((i10 & 2) != 0) {
            r0Var = r(0.0f, 0.0f, null, 7);
        }
        r0 r0Var2 = r0Var;
        if ((i10 & 8) != 0) {
            lVar2 = z0.f23040v;
        }
        return g(lVar, f10, r0Var2, z3, lVar2, cVar);
    }

    public static final e0 i(f0 f0Var, Number number, Number number2, l1 l1Var, d0 d0Var, String str, m mVar, int i10, int i11) {
        f0 f0Var2;
        Number number3;
        boolean z3;
        boolean z9;
        r rVar = (r) mVar;
        Object O = rVar.O();
        v0 v0Var = l.f24285a;
        if (O == v0Var) {
            f0Var2 = f0Var;
            e0 e0Var = new e0(f0Var2, number, number2, l1Var, d0Var);
            number3 = number2;
            rVar.k0(e0Var);
            O = e0Var;
        } else {
            f0Var2 = f0Var;
            number3 = number2;
        }
        e0 e0Var2 = (e0) O;
        boolean z10 = true;
        if ((((i10 & 112) ^ 48) > 32 && rVar.h(number)) || (i10 & 48) == 32) {
            z3 = true;
        } else {
            z3 = false;
        }
        if ((((i10 & 896) ^ 384) > 256 && rVar.h(number3)) || (i10 & 384) == 256) {
            z9 = true;
        } else {
            z9 = false;
        }
        boolean z11 = z3 | z9;
        if ((((57344 & i10) ^ 24576) <= 16384 || !rVar.h(d0Var)) && (i10 & 24576) != 16384) {
            z10 = false;
        }
        boolean z12 = z11 | z10;
        Object O2 = rVar.O();
        if (z12 || O2 == v0Var) {
            c3.b bVar = new c3.b(number, e0Var2, number3, d0Var, 1);
            rVar.k0(bVar);
            O2 = bVar;
        }
        y.j((df.a) O2, rVar);
        boolean h3 = rVar.h(f0Var2);
        Object O3 = rVar.O();
        if (h3 || O3 == v0Var) {
            O3 = new w(f0Var2, 9, e0Var2);
            rVar.k0(O3);
        }
        y.c(e0Var2, (df.l) O3, rVar);
        return e0Var2;
    }

    public static final q j(q qVar) {
        q c10 = qVar.c();
        int b10 = c10.b();
        for (int i10 = 0; i10 < b10; i10++) {
            c10.e(i10, qVar.a(i10));
        }
        return c10;
    }

    public static l k(l lVar, float f10, float f11, int i10) {
        if ((i10 & 1) != 0) {
            f10 = ((Number) lVar.f22937v.getValue()).floatValue();
        }
        if ((i10 & 2) != 0) {
            f11 = ((m) lVar.f22938w).f22945a;
        }
        return new l(lVar.f22936u, Float.valueOf(f10), new m(f11), lVar.f22939x, lVar.f22940y, lVar.f22941z);
    }

    public static final void l(j jVar, long j10, float f10, g gVar, l lVar, df.l lVar2) {
        long j11;
        if (f10 == 0.0f) {
            j11 = gVar.b();
        } else {
            j11 = ((float) (j10 - jVar.f22925c)) / f10;
        }
        jVar.f22928g = j10;
        jVar.e.setValue(gVar.f(j11));
        jVar.f22927f = gVar.d(j11);
        if (gVar.e(j11)) {
            jVar.f22929h = jVar.f22928g;
            jVar.i.setValue(Boolean.FALSE);
        }
        t(jVar, lVar);
        lVar2.invoke(jVar);
    }

    public static final float m(te.g gVar) {
        float f10;
        t tVar = (t) gVar.L(c.J);
        if (tVar != null) {
            f10 = tVar.w();
        } else {
            f10 = 1.0f;
        }
        if (f10 >= 0.0f) {
            return f10;
        }
        b("negative scale factor");
        return f10;
    }

    public static d0 n(v vVar, int i10) {
        o0 o0Var;
        if ((i10 & 2) != 0) {
            o0Var = o0.f22960u;
        } else {
            o0Var = o0.f22961v;
        }
        return new d0(vVar, o0Var, 0);
    }

    public static final f0 o(String str, m mVar, int i10) {
        r rVar = (r) mVar;
        Object O = rVar.O();
        if (O == l.f24285a) {
            O = new f0();
            rVar.k0(O);
        }
        f0 f0Var = (f0) O;
        f0Var.a(0, rVar);
        return f0Var;
    }

    public static p0 p() {
        return new p0(0);
    }

    public static final r0 q(y2.l lVar) {
        return new r0(0.9f, 400.0f, lVar);
    }

    public static r0 r(float f10, float f11, Object obj, int i10) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 1500.0f;
        }
        if ((i10 & 4) != 0) {
            obj = null;
        }
        return new r0(f10, f11, obj);
    }

    public static k1 s(int i10, int i11, w wVar, int i12) {
        if ((i12 & 1) != 0) {
            i10 = 300;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            wVar = y.f23031a;
        }
        return new k1(i10, i11, wVar);
    }

    public static final void t(j jVar, l lVar) {
        lVar.f22937v.setValue(jVar.e.getValue());
        q qVar = lVar.f22938w;
        q qVar2 = jVar.f22927f;
        int b10 = qVar.b();
        for (int i10 = 0; i10 < b10; i10++) {
            qVar.e(i10, qVar2.a(i10));
        }
        lVar.f22940y = jVar.f22929h;
        lVar.f22939x = jVar.f22928g;
        lVar.f22941z = ((Boolean) jVar.i.getValue()).booleanValue();
    }

    public static final Object u(df.l lVar, ve.c cVar) {
        if (cVar.getContext().L(a2.f3463u) == null) {
            return y.u(cVar.getContext()).R(lVar, cVar);
        }
        g5.b();
        return null;
    }
}
