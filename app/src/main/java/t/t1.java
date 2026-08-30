package t;
import t1.c;
import b.b;
import b.c;
import t1.d;
import x.o;
import g0.j1;
import q.k1;
import q.x;
import r.u0;
import t.d1;
import t.e1;
import t.o0;
import t.s1;
import t.t1;
import v1.g0;
import v1.h0;
import v1.k;
import v1.l;
import v1.t;
import v1.w;

import java.util.Collection;

/* loaded from: classes.dex */
public abstract class t1 {

    /* renamed from: a, reason: collision with root package name */
    public static final StackTraceElement[] f25522a = new StackTraceElement[0];

    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.List, java.lang.Object] */
    public static final boolean a(b bVar) {
        Object r52 = ((g0) bVar).f27313z.N.f27327a;
        int size = ((Collection) r52).size();
        boolean z3 = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            if (((t) r52.get(i)).f27344d) {
                z3 = true;
                break;
            }
            i++;
        }
        return !z3;
    }

    public static final float b(long j10) {
        if (Float.intBitsToFloat((int) (j10 >> 32)) == 0.0f && Float.intBitsToFloat((int) (j10 & 4294967295L)) == 0.0f) {
            return 0.0f;
        }
        return ((-((float) Math.atan2(Float.intBitsToFloat(r0), Float.intBitsToFloat((int) (j10 & 4294967295L))))) * 180.0f) / 3.1415927f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r7v2, types: [kotlin.jvm.internal.v, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(s1 r4, float r5, k1 r6, ve.c r7) {
        /*
            boolean r0 = r7 instanceof d1
            if (r0 == 0) goto L13
            r0 = r7
            d1 r0 = (d1) r0
            int r1 = r0.f25365w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25365w = r1
            goto L18
        L13:
            d1 r0 = new d1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f25364v
            int r1 = r0.f25365w
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            kotlin.jvm.internal.v r4 = r0.f25363u
            pe.a.e(r7)
            goto L4c
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r4)
            r4 = 0
            return r4
        L2e:
            pe.a.e(r7)
            kotlin.jvm.internal.v r7 = new kotlin.jvm.internal.v
            r7.<init>()
            e1 r1 = new e1
            r3 = 0
            r1.<init>(r5, r6, r7, r3)
            r0.f25363u = r7
            r0.f25365w = r2
            u0 r5 = u0.f24148u
            java.lang.Object r4 = r4.e(r5, r1, r0)
            ue.a r5 = ue.a.f27192u
            if (r4 != r5) goto L4b
            return r5
        L4b:
            r4 = r7
        L4c:
            float r4 = r4.f19784u
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: t.t1.c(s1, float, k1, ve.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x003a, code lost:
    
        if (a(r6) == false) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004a -> B:10:0x004d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(b r6, l r7, ve.a r8) {
        /*
            boolean r0 = r8 instanceof o0
            if (r0 == 0) goto L13
            r0 = r8
            o0 r0 = (o0) r0
            int r1 = r0.f25484x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25484x = r1
            goto L18
        L13:
            o0 r0 = new o0
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f25483w
            int r1 = r0.f25484x
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2c
            l r6 = r0.f25482v
            b r7 = r0.f25481u
            pe.a.e(r8)
            r5 = r7
            r7 = r6
            r6 = r5
            goto L4d
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r6)
            r6 = 0
            return r6
        L33:
            pe.a.e(r8)
            boolean r8 = a(r6)
            if (r8 != 0) goto L69
        L3c:
            r0.f25481u = r6
            r0.f25482v = r7
            r0.f25484x = r2
            g0 r6 = (g0) r6
            java.lang.Object r8 = r6.b(r7, r0)
            ue.a r1 = ue.a.f27192u
            if (r8 != r1) goto L4d
            return r1
        L4d:
            k r8 = (k) r8
            java.lang.Object r8 = r8.f27327a
            r1 = r8
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
            r3 = 0
        L59:
            if (r3 >= r1) goto L69
            java.lang.Object r4 = r8.get(r3)
            t r4 = (t) r4
            boolean r4 = r4.f27344d
            if (r4 == 0) goto L66
            goto L3c
        L66:
            int r3 = r3 + 1
            goto L59
        L69:
            pe.z r6 = pe.z.f22715a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: t.t1.d(b, l, ve.a):java.lang.Object");
    }

    public static final Object e(w wVar, df.p pVar, te.c cVar) {
        Object Y0 = ((h0) wVar).Y0(new j1(cVar.getContext(), pVar, (te.c) null), cVar);
        if (Y0 == ue.a.f27192u) {
            return Y0;
        }
        return pe.z.f22715a;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List, java.lang.Object] */
    public static final long f(k kVar, boolean z3) {
        long j10;
        Object r72 = kVar.f27327a;
        int size = ((Collection) r72).size();
        long j11 = 0;
        int i = 0;
        for (int i10 = 0; i10 < size; i10++) {
            t tVar = (t) r72.get(i10);
            if (tVar.f27344d && tVar.f27347h) {
                if (z3) {
                    j10 = tVar.f27343c;
                } else {
                    j10 = tVar.f27346g;
                }
                j11 = b.h(j11, j10);
                i++;
            }
        }
        if (i == 0) {
            return 9205357640488583168L;
        }
        return b.b(j11, i);
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.List, java.lang.Object] */
    public static final float g(k kVar, boolean z3) {
        long j10;
        long f10 = f(kVar, z3);
        float f11 = 0.0f;
        if (b.c(f10, 9205357640488583168L)) {
            return 0.0f;
        }
        Object r8 = kVar.f27327a;
        int size = ((Collection) r8).size();
        int i = 0;
        for (int i10 = 0; i10 < size; i10++) {
            t tVar = (t) r8.get(i10);
            if (tVar.f27344d && tVar.f27347h) {
                if (z3) {
                    j10 = tVar.f27343c;
                } else {
                    j10 = tVar.f27346g;
                }
                i++;
                f11 = b.d(b.g(j10, f10)) + f11;
            }
        }
        return f11 / i;
    }

    public static final long h(k kVar) {
        long f10 = f(kVar, true);
        if (b.c(f10, 9205357640488583168L)) {
            return 0L;
        }
        return b.g(f10, f(kVar, false));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    public static final float i(k kVar) {
        Object r02 = kVar.f27327a;
        int size = ((Collection) r02).size();
        int i = 0;
        int i10 = 0;
        while (true) {
            int i11 = 1;
            if (i >= size) {
                break;
            }
            t tVar = (t) r02.get(i);
            if (!tVar.f27347h || !tVar.f27344d) {
                i11 = 0;
            }
            i10 += i11;
            i++;
        }
        if (i10 >= 2) {
            long f10 = f(kVar, true);
            long f11 = f(kVar, false);
            int size2 = ((Collection) r02).size();
            float f12 = 0.0f;
            float f13 = 0.0f;
            for (int i12 = 0; i12 < size2; i12++) {
                t tVar2 = (t) r02.get(i12);
                if (tVar2.f27344d && tVar2.f27347h) {
                    long j10 = tVar2.f27343c;
                    long g8 = b.g(tVar2.f27346g, f11);
                    long g10 = b.g(j10, f10);
                    float b10 = b(g10) - b(g8);
                    float d2 = b.d(b.h(g10, g8)) / 2.0f;
                    if (b10 > 180.0f) {
                        b10 -= 360.0f;
                    } else if (b10 < -180.0f) {
                        b10 += 360.0f;
                    }
                    f13 += b10 * d2;
                    f12 += d2;
                }
            }
            if (f12 != 0.0f) {
                return f13 / f12;
            }
        }
        return 0.0f;
    }

    public static final float j(k kVar) {
        float g8 = g(kVar, true);
        float g10 = g(kVar, false);
        if (g8 == 0.0f || g10 == 0.0f) {
            return 1.0f;
        }
        return g8 / g10;
    }
}