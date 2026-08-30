package a0;
import a0.a;
import a0.i0;
import a0.l0;
import a0.z;
import b0.e;
import b0.f0;
import b0.k0;
import b0.m0;
import b0.n0;
import q.x;
import r.u0;
import t.b;
import t.l;
import v.i;

import com.google.android.gms.internal.ads.x90;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import r0.a1;
import r0.i1;
import r0.v0;
import t.s1;
import t.z0;
import ya.mc;

/* loaded from: classes.dex */
public final class l0 implements s1 {

    /* renamed from: w, reason: collision with root package name */
    public static final x90 f85w = a1.b(i.f64w, w.f150w);

    /* renamed from: a, reason: collision with root package name */
    public final a f86a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f87b;

    /* renamed from: c, reason: collision with root package name */
    public z f88c;

    /* renamed from: d, reason: collision with root package name */
    public final c0 f89d;
    public final i1 e;

    /* renamed from: f, reason: collision with root package name */
    public final i f90f;

    /* renamed from: g, reason: collision with root package name */
    public float f91g;

    /* renamed from: h, reason: collision with root package name */
    public final l f92h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public b2.i0 f93j;

    /* renamed from: k, reason: collision with root package name */
    public final h0 f94k;

    /* renamed from: l, reason: collision with root package name */
    public final e f95l;

    /* renamed from: m, reason: collision with root package name */
    public final androidx.compose.foundation.lazy.layout.b f96m;

    /* renamed from: n, reason: collision with root package name */
    public final pd.c f97n;

    /* renamed from: o, reason: collision with root package name */
    public final n0 f98o;

    /* renamed from: p, reason: collision with root package name */
    public final pd.c f99p;

    /* renamed from: q, reason: collision with root package name */
    public final k0 f100q;

    /* renamed from: r, reason: collision with root package name */
    public final a1 f101r;

    /* renamed from: s, reason: collision with root package name */
    public final a1 f102s;

    /* renamed from: t, reason: collision with root package name */
    public final i1 f103t;

    /* renamed from: u, reason: collision with root package name */
    public final i1 f104u;

    /* renamed from: v, reason: collision with root package name */
    public final z5.h f105v;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, a] */
    /* JADX WARN: Type inference failed for: r5v6, types: [e, java.lang.Object] */
    public l0(int i, int i10) {
        Object obj = new Object();
        obj.f0a = -1;
        obj.f2c = new t0.e(new m0[16]);
        this.f86a = obj;
        this.f89d = new c0(i, i10, 0);
        this.e = new i1(o0.f113a, v0.f24418w);
        this.f90f = new i();
        this.f92h = new l(new k0(0, this));
        this.i = true;
        this.f94k = new h0(this, 0);
        this.f95l = new Object();
        this.f96m = new androidx.compose.foundation.lazy.layout.b();
        this.f97n = new pd.c(2, false);
        this.f98o = new n0(new g0(this, i, 0));
        this.f99p = new pd.c(this);
        this.f100q = new k0();
        this.f101r = f0.h();
        this.f102s = f0.h();
        Boolean bool = Boolean.FALSE;
        this.f103t = r0.y.B(bool);
        this.f104u = r0.y.B(bool);
        this.f105v = new z5.h(2);
    }

    @Override // s1
    public final boolean a() {
        return this.f92h.a();
    }

    @Override // s1
    public final boolean b() {
        return ((Boolean) this.f104u.getValue()).booleanValue();
    }

    @Override // s1
    public final boolean c() {
        return ((Boolean) this.f103t.getValue()).booleanValue();
    }

    @Override // s1
    public final float d(float f10) {
        return this.f92h.d(f10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0065, code lost:
    
        if (r8.e(r6, r7, r0) != r4) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // s1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(u0 r6, df.p r7, te.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof i0
            if (r0 == 0) goto L13
            r0 = r8
            i0 r0 = (i0) r0
            int r1 = r0.f71z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f71z = r1
            goto L18
        L13:
            i0 r0 = new i0
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f69x
            int r1 = r0.f71z
            r2 = 2
            r3 = 1
            ue.a r4 = ue.a.f27192u
            if (r1 == 0) goto L3e
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2a
            pe.a.e(r8)
            goto L68
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r6)
            r6 = 0
            return r6
        L31:
            ve.i r6 = r0.f68w
            r7 = r6
            df.p r7 = (df.p) r7
            u0 r6 = r0.f67v
            a0.l0 r1 = r0.f66u
            pe.a.e(r8)
            goto L56
        L3e:
            pe.a.e(r8)
            r0.f66u = r5
            r0.f67v = r6
            r8 = r7
            ve.i r8 = (ve.i) r8
            r0.f68w = r8
            r0.f71z = r3
            e r8 = r5.f95l
            java.lang.Object r8 = r8.f(r0)
            if (r8 != r4) goto L55
            goto L67
        L55:
            r1 = r5
        L56:
            l r8 = r1.f92h
            r1 = 0
            r0.f66u = r1
            r0.f67v = r1
            r0.f68w = r1
            r0.f71z = r2
            java.lang.Object r6 = r8.e(r6, r7, r0)
            if (r6 != r4) goto L68
        L67:
            return r4
        L68:
            pe.z r6 = pe.z.f22715a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.l0.e(u0, df.p, te.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0088  */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(z r10, boolean r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.l0.f(z, boolean, boolean):void");
    }

    public final z g() {
        return (z) this.e.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v5, types: [kotlin.jvm.internal.m, df.l] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    public final void h(float f10, z zVar) {
        boolean z3;
        int i;
        int i10;
        int i11;
        List list;
        boolean z9;
        long j10;
        df.l lVar;
        z zVar2;
        int i12;
        if (this.i) {
            a aVar = this.f86a;
            t0.e eVar = (t0.e) aVar.f2c;
            Object r52 = zVar.f170l;
            z0 z0Var = zVar.f174p;
            if (!((Collection) r52).isEmpty()) {
                if (f10 < 0.0f) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z0 z0Var2 = z0.f25597u;
                if (z3) {
                    a0 a0Var = (a0) qe.l.C(r52);
                    if (z0Var == z0Var2) {
                        i12 = a0Var.f16p;
                    } else {
                        i12 = a0Var.f17q;
                    }
                    i10 = i12 + 1;
                    i11 = ((a0) qe.l.C(r52)).f3a + 1;
                } else {
                    a0 a0Var2 = (a0) qe.l.w(r52);
                    if (z0Var == z0Var2) {
                        i = a0Var2.f16p;
                    } else {
                        i = a0Var2.f17q;
                    }
                    i10 = i - 1;
                    i11 = ((a0) qe.l.w(r52)).f3a - 1;
                }
                if (i11 >= 0 && i11 < zVar.f173o) {
                    if (i10 != aVar.f0a && i10 >= 0) {
                        if (aVar.f1b != z3) {
                            Object[] objArr = eVar.f25617u;
                            int i13 = eVar.f25619w;
                            for (int i14 = 0; i14 < i13; i14++) {
                                ((m0) objArr[i14]).cancel();
                            }
                        }
                        aVar.f1b = z3;
                        aVar.f0a = i10;
                        eVar.j();
                        pd.c cVar = this.f99p;
                        cVar.getClass();
                        ArrayList arrayList = new ArrayList();
                        l0 l0Var = (l0) cVar.f22681u;
                        b1.i d2 = b1.w.d();
                        if (d2 != null) {
                            lVar = d2.e();
                        } else {
                            lVar = null;
                        }
                        b1.i g8 = b1.w.g(d2);
                        try {
                            if (l0Var.f87b) {
                                zVar2 = l0Var.f88c;
                            } else {
                                zVar2 = (z) l0Var.e.getValue();
                            }
                            if (zVar2 != null) {
                                List list2 = (List) zVar2.f169k.invoke(Integer.valueOf(i10));
                                int size = list2.size();
                                int i15 = 0;
                                r52 = r52;
                                while (i15 < size) {
                                    pe.j jVar = (pe.j) list2.get(i15);
                                    Object obj = r52;
                                    l0 l0Var2 = l0Var;
                                    boolean z10 = z3;
                                    int i16 = i15;
                                    arrayList.add(l0Var.f98o.a(((Number) jVar.f22693u).intValue(), ((y2.a) jVar.f22694v).f30799a));
                                    i15 = i16 + 1;
                                    r52 = obj;
                                    l0Var = l0Var2;
                                    z3 = z10;
                                }
                            }
                            list = r52;
                            z9 = z3;
                            b1.w.j(d2, g8, lVar);
                            eVar.c(eVar.f25619w, arrayList);
                        } catch (Throwable th) {
                            b1.w.j(d2, g8, lVar);
                            throw th;
                        }
                    } else {
                        list = r52;
                        z9 = z3;
                    }
                    if (z9) {
                        a0 a0Var3 = (a0) qe.l.C(list);
                        if (z0Var == z0Var2) {
                            j10 = a0Var3.f14n & 4294967295L;
                        } else {
                            j10 = a0Var3.f14n >> 32;
                        }
                        int i17 = (int) j10;
                        if (((mc.a(a0Var3, z0Var) + i17) + zVar.f176r) - zVar.f172n < (-f10)) {
                            Object[] objArr2 = eVar.f25617u;
                            int i18 = eVar.f25619w;
                            for (int i19 = 0; i19 < i18; i19++) {
                                ((m0) objArr2[i19]).a();
                            }
                            return;
                        }
                        return;
                    }
                    if (zVar.f171m - mc.a((a0) qe.l.w(list), z0Var) < f10) {
                        Object[] objArr3 = eVar.f25617u;
                        int i20 = eVar.f25619w;
                        for (int i21 = 0; i21 < i20; i21++) {
                            ((m0) objArr3[i21]).a();
                        }
                    }
                }
            }
        }
    }
}