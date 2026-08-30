package w7;
import k0.w;
import r0.a1;
import r0.e1;
import r0.l;
import r0.m;
import r0.n2;
import r0.r;
import r0.v0;
import z.b;
import z.e;
import z0.c;
import z0.h;

import android.content.Context;
import android.util.LruCache;
import com.daren.scraply.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class m5 implements df.l {
    public final /* synthetic */ Object A;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f28720u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f28721v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f28722w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ a1 f28723x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f28724y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f28725z;

    public /* synthetic */ m5(pf.z zVar, a1 a1Var, b1.v vVar, Context context, LruCache lruCache, a1 a1Var2) {
        this.f28720u = 3;
        this.f28724y = zVar;
        this.f28725z = a1Var;
        this.f28721v = vVar;
        this.A = context;
        this.f28722w = lruCache;
        this.f28723x = a1Var2;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        switch (this.f28720u) {
            case 0:
                final List list = (List) this.f28724y;
                final String str = (String) this.f28725z;
                final Context context = (Context) this.A;
                final df.q qVar = (df.q) this.f28721v;
                final df.l lVar = (df.l) this.f28722w;
                final e1 e1Var = (e1) this.f28723x;
                e eVar = (e) obj;
                eVar.getClass();
                e.p(eVar, list.size(), new j7.d(1, str, list), new c(-1897089125, new df.r() { // from class: w7.n5
                    @Override // df.r
                    public final Object d(Object obj2, Object obj3, Object obj4, Object obj5) {
                        boolean z3;
                        df.a aVar;
                        int i;
                        int intValue = ((Integer) obj3).intValue();
                        m mVar = (m) obj4;
                        int intValue2 = ((Integer) obj5).intValue();
                        ((b) obj2).getClass();
                        if ((intValue2 & 48) == 0) {
                            if (((r) mVar).d(intValue)) {
                                i = 32;
                            } else {
                                i = 16;
                            }
                            intValue2 |= i;
                        }
                        if ((intValue2 & 145) != 144) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        r rVar = (r) mVar;
                        if (rVar.R(intValue2 & 1, z3)) {
                            a5 a5Var = (a5) list.get(intValue);
                            boolean f10 = rVar.f(a5Var);
                            Object O = rVar.O();
                            Context context2 = context;
                            Object obj6 = l.f24285a;
                            if (f10 || O == obj6) {
                                O = x4.c(context2, a5Var);
                                rVar.k0(O);
                            }
                            d5 d5Var = (d5) O;
                            if (d5Var != null) {
                                rVar.a0(1293088802);
                                String k12 = n4.k1(a5Var, rVar);
                                boolean h3 = rVar.h(a5Var) | rVar.h(context2);
                                df.q qVar2 = qVar;
                                boolean f11 = h3 | rVar.f(qVar2);
                                Object O2 = rVar.O();
                                if (f11 || O2 == obj6) {
                                    O2 = new b8.g(a5Var, context2, qVar2, 4);
                                    rVar.k0(O2);
                                }
                                df.p pVar = (df.p) O2;
                                float h10 = e1Var.h();
                                if (str.equals("frames_anadidos") && !mf.f.u(a5Var.f27869b) && !mf.f.u(a5Var.f27870c)) {
                                    rVar.a0(1294800684);
                                    boolean h11 = rVar.h(context2) | rVar.h(a5Var);
                                    Object O3 = rVar.O();
                                    if (h11 || O3 == obj6) {
                                        O3 = new androidx.ink.brush.b(context2, 13, a5Var);
                                        rVar.k0(O3);
                                    }
                                    aVar = (df.a) O3;
                                    rVar.p(false);
                                } else {
                                    rVar.a0(1295847522);
                                    rVar.p(false);
                                    aVar = null;
                                }
                                n4.E0(d5Var, k12, pVar, lVar, h10, aVar, rVar, 0, 0);
                            } else {
                                rVar.a0(1227199015);
                            }
                            rVar.p(false);
                        } else {
                            rVar.U();
                        }
                        return pe.z.f22715a;
                    }
                }, true), 4);
                break;
            case 1:
                b1.v vVar = (b1.v) this.f28724y;
                df.a aVar = (df.a) this.f28725z;
                LruCache lruCache = (LruCache) this.A;
                df.q qVar2 = (df.q) this.f28721v;
                df.l lVar2 = (df.l) this.f28722w;
                e1 e1Var2 = (e1) this.f28723x;
                e eVar2 = (e) obj;
                eVar2.getClass();
                e.n(eVar2, "sys_picker", new c(2127234478, new b8.e8(3, aVar), true), 2);
                if (vVar.isEmpty()) {
                    e.p(eVar2, 8, new f3(8), n4.i, 4);
                } else {
                    eVar2.o(vVar.size(), new w(new r5(0), 23, vVar), new b8.d9(3, vVar), new c(-1091073711, new f6(vVar, lruCache, qVar2, lVar2, e1Var2, 1), true));
                }
                return pe.z.f22715a;
            case 2:
                n2 n2Var = (n2) this.f28724y;
                final df.l lVar3 = (df.l) this.f28722w;
                LruCache lruCache2 = (LruCache) this.f28725z;
                final a1 a1Var = (a1) this.A;
                final a1 a1Var2 = (a1) this.f28721v;
                e eVar3 = (e) obj;
                eVar3.getClass();
                if (!((List) n2Var.getValue()).isEmpty()) {
                    e.n(eVar3, "entry_recents", new c(617522257, new r7.j(3, lVar3, lruCache2, n2Var), true), 2);
                }
                final int i = 0;
                e.n(eVar3, "entry_gallery", new c(-1358182474, new df.q() { // from class: w7.p5
                    @Override // df.q
                    public final Object b(Object obj2, Object obj3, Object obj4) {
                        int i10 = i;
                        pe.z zVar = pe.z.f22715a;
                        Object obj5 = l.f24285a;
                        boolean z3 = false;
                        a1 a1Var3 = a1Var;
                        df.l lVar4 = lVar3;
                        switch (i10) {
                            case 0:
                                m mVar = (m) obj3;
                                int intValue = ((Integer) obj4).intValue();
                                ((b) obj2).getClass();
                                if ((intValue & 17) != 16) {
                                    z3 = true;
                                }
                                r rVar = (r) mVar;
                                if (rVar.R(intValue & 1, z3)) {
                                    String b10 = wa.n7.b(R.string.panel_gallery, rVar);
                                    boolean f10 = rVar.f(lVar4);
                                    Object O = rVar.O();
                                    if (f10 || O == obj5) {
                                        O = new b8.b8(9, lVar4);
                                        rVar.k0(O);
                                    }
                                    n4.w0(b10, (df.a) O, null, h.d(-213957308, new u(a1Var3, 3), rVar), rVar, 3072, 4);
                                } else {
                                    rVar.U();
                                }
                                return zVar;
                            case 1:
                                m mVar2 = (m) obj3;
                                int intValue2 = ((Integer) obj4).intValue();
                                ((b) obj2).getClass();
                                if ((intValue2 & 17) != 16) {
                                    z3 = true;
                                }
                                r rVar2 = (r) mVar2;
                                if (rVar2.R(intValue2 & 1, z3)) {
                                    String b11 = wa.n7.b(R.string.panel_stickers, rVar2);
                                    boolean f11 = rVar2.f(lVar4);
                                    Object O2 = rVar2.O();
                                    if (f11 || O2 == obj5) {
                                        O2 = new b8.b8(10, lVar4);
                                        rVar2.k0(O2);
                                    }
                                    n4.w0(b11, (df.a) O2, null, h.d(-1480386820, new u(a1Var3, 4), rVar2), rVar2, 3072, 4);
                                } else {
                                    rVar2.U();
                                }
                                return zVar;
                            default:
                                m mVar3 = (m) obj3;
                                int intValue3 = ((Integer) obj4).intValue();
                                ((b) obj2).getClass();
                                if ((intValue3 & 17) != 16) {
                                    z3 = true;
                                }
                                r rVar3 = (r) mVar3;
                                if (rVar3.R(intValue3 & 1, z3)) {
                                    List list2 = (List) a1Var3.getValue();
                                    ArrayList arrayList = new ArrayList();
                                    for (Object obj6 : list2) {
                                        if (((t9) obj6).f29155a.f29083d) {
                                            arrayList.add(obj6);
                                        }
                                    }
                                    String b12 = wa.n7.b(R.string.panel_tapes, rVar3);
                                    boolean h3 = rVar3.h(arrayList) | rVar3.f(lVar4);
                                    Object O3 = rVar3.O();
                                    if (h3 || O3 == obj5) {
                                        O3 = new androidx.ink.brush.b(arrayList, 14, lVar4);
                                        rVar3.k0(O3);
                                    }
                                    n4.w0(b12, (df.a) O3, null, n4.f28768f, rVar3, 3072, 4);
                                } else {
                                    rVar3.U();
                                }
                                return zVar;
                        }
                    }
                }, true), 2);
                final int i10 = 0;
                e.n(eVar3, "entry_frames", new c(-1026286803, new df.q() { // from class: w7.q5
                    @Override // df.q
                    public final Object b(Object obj2, Object obj3, Object obj4) {
                        int i11 = i10;
                        pe.z zVar = pe.z.f22715a;
                        v0 v0Var = l.f24285a;
                        boolean z3 = false;
                        df.l lVar4 = lVar3;
                        switch (i11) {
                            case 0:
                                m mVar = (m) obj3;
                                int intValue = ((Integer) obj4).intValue();
                                ((b) obj2).getClass();
                                if ((intValue & 17) != 16) {
                                    z3 = true;
                                }
                                r rVar = (r) mVar;
                                if (rVar.R(intValue & 1, z3)) {
                                    String b10 = wa.n7.b(R.string.panel_frames, rVar);
                                    boolean f10 = rVar.f(lVar4);
                                    Object O = rVar.O();
                                    if (f10 || O == v0Var) {
                                        O = new b8.b8(5, lVar4);
                                        rVar.k0(O);
                                    }
                                    n4.w0(b10, (df.a) O, null, n4.e, rVar, 3072, 4);
                                } else {
                                    rVar.U();
                                }
                                return zVar;
                            case 1:
                                m mVar2 = (m) obj3;
                                int intValue2 = ((Integer) obj4).intValue();
                                ((b) obj2).getClass();
                                if ((intValue2 & 17) != 16) {
                                    z3 = true;
                                }
                                r rVar2 = (r) mVar2;
                                if (rVar2.R(intValue2 & 1, z3)) {
                                    String b11 = wa.n7.b(R.string.panel_shapes, rVar2);
                                    boolean f11 = rVar2.f(lVar4);
                                    Object O2 = rVar2.O();
                                    if (f11 || O2 == v0Var) {
                                        O2 = new b8.b8(7, lVar4);
                                        rVar2.k0(O2);
                                    }
                                    n4.w0(b11, (df.a) O2, null, n4.f28769g, rVar2, 3072, 4);
                                } else {
                                    rVar2.U();
                                }
                                return zVar;
                            default:
                                m mVar3 = (m) obj3;
                                int intValue3 = ((Integer) obj4).intValue();
                                ((b) obj2).getClass();
                                if ((intValue3 & 17) != 16) {
                                    z3 = true;
                                }
                                r rVar3 = (r) mVar3;
                                if (rVar3.R(intValue3 & 1, z3)) {
                                    String b12 = wa.n7.b(R.string.panel_backgrounds, rVar3);
                                    boolean f12 = rVar3.f(lVar4);
                                    Object O3 = rVar3.O();
                                    if (f12 || O3 == v0Var) {
                                        O3 = new b8.b8(6, lVar4);
                                        rVar3.k0(O3);
                                    }
                                    n4.w0(b12, (df.a) O3, null, n4.f28770h, rVar3, 3072, 4);
                                } else {
                                    rVar3.U();
                                }
                                return zVar;
                        }
                    }
                }, true), 2);
                final int i11 = 1;
                e.n(eVar3, "entry_stickers", new c(-1569143570, new df.q() { // from class: w7.p5
                    @Override // df.q
                    public final Object b(Object obj2, Object obj3, Object obj4) {
                        int i102 = i11;
                        pe.z zVar = pe.z.f22715a;
                        Object obj5 = l.f24285a;
                        boolean z3 = false;
                        a1 a1Var3 = a1Var2;
                        df.l lVar4 = lVar3;
                        switch (i102) {
                            case 0:
                                m mVar = (m) obj3;
                                int intValue = ((Integer) obj4).intValue();
                                ((b) obj2).getClass();
                                if ((intValue & 17) != 16) {
                                    z3 = true;
                                }
                                r rVar = (r) mVar;
                                if (rVar.R(intValue & 1, z3)) {
                                    String b10 = wa.n7.b(R.string.panel_gallery, rVar);
                                    boolean f10 = rVar.f(lVar4);
                                    Object O = rVar.O();
                                    if (f10 || O == obj5) {
                                        O = new b8.b8(9, lVar4);
                                        rVar.k0(O);
                                    }
                                    n4.w0(b10, (df.a) O, null, h.d(-213957308, new u(a1Var3, 3), rVar), rVar, 3072, 4);
                                } else {
                                    rVar.U();
                                }
                                return zVar;
                            case 1:
                                m mVar2 = (m) obj3;
                                int intValue2 = ((Integer) obj4).intValue();
                                ((b) obj2).getClass();
                                if ((intValue2 & 17) != 16) {
                                    z3 = true;
                                }
                                r rVar2 = (r) mVar2;
                                if (rVar2.R(intValue2 & 1, z3)) {
                                    String b11 = wa.n7.b(R.string.panel_stickers, rVar2);
                                    boolean f11 = rVar2.f(lVar4);
                                    Object O2 = rVar2.O();
                                    if (f11 || O2 == obj5) {
                                        O2 = new b8.b8(10, lVar4);
                                        rVar2.k0(O2);
                                    }
                                    n4.w0(b11, (df.a) O2, null, h.d(-1480386820, new u(a1Var3, 4), rVar2), rVar2, 3072, 4);
                                } else {
                                    rVar2.U();
                                }
                                return zVar;
                            default:
                                m mVar3 = (m) obj3;
                                int intValue3 = ((Integer) obj4).intValue();
                                ((b) obj2).getClass();
                                if ((intValue3 & 17) != 16) {
                                    z3 = true;
                                }
                                r rVar3 = (r) mVar3;
                                if (rVar3.R(intValue3 & 1, z3)) {
                                    List list2 = (List) a1Var3.getValue();
                                    ArrayList arrayList = new ArrayList();
                                    for (Object obj6 : list2) {
                                        if (((t9) obj6).f29155a.f29083d) {
                                            arrayList.add(obj6);
                                        }
                                    }
                                    String b12 = wa.n7.b(R.string.panel_tapes, rVar3);
                                    boolean h3 = rVar3.h(arrayList) | rVar3.f(lVar4);
                                    Object O3 = rVar3.O();
                                    if (h3 || O3 == obj5) {
                                        O3 = new androidx.ink.brush.b(arrayList, 14, lVar4);
                                        rVar3.k0(O3);
                                    }
                                    n4.w0(b12, (df.a) O3, null, n4.f28768f, rVar3, 3072, 4);
                                } else {
                                    rVar3.U();
                                }
                                return zVar;
                        }
                    }
                }, true), 2);
                final int i12 = 2;
                final a1 a1Var3 = this.f28723x;
                e.n(eVar3, "entry_tapes", new c(-2112000337, new df.q() { // from class: w7.p5
                    @Override // df.q
                    public final Object b(Object obj2, Object obj3, Object obj4) {
                        int i102 = i12;
                        pe.z zVar = pe.z.f22715a;
                        Object obj5 = l.f24285a;
                        boolean z3 = false;
                        a1 a1Var32 = a1Var3;
                        df.l lVar4 = lVar3;
                        switch (i102) {
                            case 0:
                                m mVar = (m) obj3;
                                int intValue = ((Integer) obj4).intValue();
                                ((b) obj2).getClass();
                                if ((intValue & 17) != 16) {
                                    z3 = true;
                                }
                                r rVar = (r) mVar;
                                if (rVar.R(intValue & 1, z3)) {
                                    String b10 = wa.n7.b(R.string.panel_gallery, rVar);
                                    boolean f10 = rVar.f(lVar4);
                                    Object O = rVar.O();
                                    if (f10 || O == obj5) {
                                        O = new b8.b8(9, lVar4);
                                        rVar.k0(O);
                                    }
                                    n4.w0(b10, (df.a) O, null, h.d(-213957308, new u(a1Var32, 3), rVar), rVar, 3072, 4);
                                } else {
                                    rVar.U();
                                }
                                return zVar;
                            case 1:
                                m mVar2 = (m) obj3;
                                int intValue2 = ((Integer) obj4).intValue();
                                ((b) obj2).getClass();
                                if ((intValue2 & 17) != 16) {
                                    z3 = true;
                                }
                                r rVar2 = (r) mVar2;
                                if (rVar2.R(intValue2 & 1, z3)) {
                                    String b11 = wa.n7.b(R.string.panel_stickers, rVar2);
                                    boolean f11 = rVar2.f(lVar4);
                                    Object O2 = rVar2.O();
                                    if (f11 || O2 == obj5) {
                                        O2 = new b8.b8(10, lVar4);
                                        rVar2.k0(O2);
                                    }
                                    n4.w0(b11, (df.a) O2, null, h.d(-1480386820, new u(a1Var32, 4), rVar2), rVar2, 3072, 4);
                                } else {
                                    rVar2.U();
                                }
                                return zVar;
                            default:
                                m mVar3 = (m) obj3;
                                int intValue3 = ((Integer) obj4).intValue();
                                ((b) obj2).getClass();
                                if ((intValue3 & 17) != 16) {
                                    z3 = true;
                                }
                                r rVar3 = (r) mVar3;
                                if (rVar3.R(intValue3 & 1, z3)) {
                                    List list2 = (List) a1Var32.getValue();
                                    ArrayList arrayList = new ArrayList();
                                    for (Object obj6 : list2) {
                                        if (((t9) obj6).f29155a.f29083d) {
                                            arrayList.add(obj6);
                                        }
                                    }
                                    String b12 = wa.n7.b(R.string.panel_tapes, rVar3);
                                    boolean h3 = rVar3.h(arrayList) | rVar3.f(lVar4);
                                    Object O3 = rVar3.O();
                                    if (h3 || O3 == obj5) {
                                        O3 = new androidx.ink.brush.b(arrayList, 14, lVar4);
                                        rVar3.k0(O3);
                                    }
                                    n4.w0(b12, (df.a) O3, null, n4.f28768f, rVar3, 3072, 4);
                                } else {
                                    rVar3.U();
                                }
                                return zVar;
                        }
                    }
                }, true), 2);
                final int i13 = 1;
                e.n(eVar3, "entry_shapes", new c(1640110192, new df.q() { // from class: w7.q5
                    @Override // df.q
                    public final Object b(Object obj2, Object obj3, Object obj4) {
                        int i112 = i13;
                        pe.z zVar = pe.z.f22715a;
                        v0 v0Var = l.f24285a;
                        boolean z3 = false;
                        df.l lVar4 = lVar3;
                        switch (i112) {
                            case 0:
                                m mVar = (m) obj3;
                                int intValue = ((Integer) obj4).intValue();
                                ((b) obj2).getClass();
                                if ((intValue & 17) != 16) {
                                    z3 = true;
                                }
                                r rVar = (r) mVar;
                                if (rVar.R(intValue & 1, z3)) {
                                    String b10 = wa.n7.b(R.string.panel_frames, rVar);
                                    boolean f10 = rVar.f(lVar4);
                                    Object O = rVar.O();
                                    if (f10 || O == v0Var) {
                                        O = new b8.b8(5, lVar4);
                                        rVar.k0(O);
                                    }
                                    n4.w0(b10, (df.a) O, null, n4.e, rVar, 3072, 4);
                                } else {
                                    rVar.U();
                                }
                                return zVar;
                            case 1:
                                m mVar2 = (m) obj3;
                                int intValue2 = ((Integer) obj4).intValue();
                                ((b) obj2).getClass();
                                if ((intValue2 & 17) != 16) {
                                    z3 = true;
                                }
                                r rVar2 = (r) mVar2;
                                if (rVar2.R(intValue2 & 1, z3)) {
                                    String b11 = wa.n7.b(R.string.panel_shapes, rVar2);
                                    boolean f11 = rVar2.f(lVar4);
                                    Object O2 = rVar2.O();
                                    if (f11 || O2 == v0Var) {
                                        O2 = new b8.b8(7, lVar4);
                                        rVar2.k0(O2);
                                    }
                                    n4.w0(b11, (df.a) O2, null, n4.f28769g, rVar2, 3072, 4);
                                } else {
                                    rVar2.U();
                                }
                                return zVar;
                            default:
                                m mVar3 = (m) obj3;
                                int intValue3 = ((Integer) obj4).intValue();
                                ((b) obj2).getClass();
                                if ((intValue3 & 17) != 16) {
                                    z3 = true;
                                }
                                r rVar3 = (r) mVar3;
                                if (rVar3.R(intValue3 & 1, z3)) {
                                    String b12 = wa.n7.b(R.string.panel_backgrounds, rVar3);
                                    boolean f12 = rVar3.f(lVar4);
                                    Object O3 = rVar3.O();
                                    if (f12 || O3 == v0Var) {
                                        O3 = new b8.b8(6, lVar4);
                                        rVar3.k0(O3);
                                    }
                                    n4.w0(b12, (df.a) O3, null, n4.f28770h, rVar3, 3072, 4);
                                } else {
                                    rVar3.U();
                                }
                                return zVar;
                        }
                    }
                }, true), 2);
                final int i14 = 2;
                e.n(eVar3, "entry_fills", new c(1097253425, new df.q() { // from class: w7.q5
                    @Override // df.q
                    public final Object b(Object obj2, Object obj3, Object obj4) {
                        int i112 = i14;
                        pe.z zVar = pe.z.f22715a;
                        v0 v0Var = l.f24285a;
                        boolean z3 = false;
                        df.l lVar4 = lVar3;
                        switch (i112) {
                            case 0:
                                m mVar = (m) obj3;
                                int intValue = ((Integer) obj4).intValue();
                                ((b) obj2).getClass();
                                if ((intValue & 17) != 16) {
                                    z3 = true;
                                }
                                r rVar = (r) mVar;
                                if (rVar.R(intValue & 1, z3)) {
                                    String b10 = wa.n7.b(R.string.panel_frames, rVar);
                                    boolean f10 = rVar.f(lVar4);
                                    Object O = rVar.O();
                                    if (f10 || O == v0Var) {
                                        O = new b8.b8(5, lVar4);
                                        rVar.k0(O);
                                    }
                                    n4.w0(b10, (df.a) O, null, n4.e, rVar, 3072, 4);
                                } else {
                                    rVar.U();
                                }
                                return zVar;
                            case 1:
                                m mVar2 = (m) obj3;
                                int intValue2 = ((Integer) obj4).intValue();
                                ((b) obj2).getClass();
                                if ((intValue2 & 17) != 16) {
                                    z3 = true;
                                }
                                r rVar2 = (r) mVar2;
                                if (rVar2.R(intValue2 & 1, z3)) {
                                    String b11 = wa.n7.b(R.string.panel_shapes, rVar2);
                                    boolean f11 = rVar2.f(lVar4);
                                    Object O2 = rVar2.O();
                                    if (f11 || O2 == v0Var) {
                                        O2 = new b8.b8(7, lVar4);
                                        rVar2.k0(O2);
                                    }
                                    n4.w0(b11, (df.a) O2, null, n4.f28769g, rVar2, 3072, 4);
                                } else {
                                    rVar2.U();
                                }
                                return zVar;
                            default:
                                m mVar3 = (m) obj3;
                                int intValue3 = ((Integer) obj4).intValue();
                                ((b) obj2).getClass();
                                if ((intValue3 & 17) != 16) {
                                    z3 = true;
                                }
                                r rVar3 = (r) mVar3;
                                if (rVar3.R(intValue3 & 1, z3)) {
                                    String b12 = wa.n7.b(R.string.panel_backgrounds, rVar3);
                                    boolean f12 = rVar3.f(lVar4);
                                    Object O3 = rVar3.O();
                                    if (f12 || O3 == v0Var) {
                                        O3 = new b8.b8(6, lVar4);
                                        rVar3.k0(O3);
                                    }
                                    n4.w0(b12, (df.a) O3, null, n4.f28770h, rVar3, 3072, 4);
                                } else {
                                    rVar3.U();
                                }
                                return zVar;
                        }
                    }
                }, true), 2);
                break;
            default:
                pf.z zVar = (pf.z) this.f28724y;
                a1 a1Var4 = (a1) this.f28725z;
                b1.v vVar2 = (b1.v) this.f28721v;
                Context context2 = (Context) this.A;
                LruCache lruCache3 = (LruCache) this.f28722w;
                if (((Boolean) obj).booleanValue() && !((Boolean) a1Var4.getValue()).booleanValue()) {
                    a1Var4.setValue(Boolean.TRUE);
                    pf.b0.x(zVar, null, new z5(vVar2, context2, lruCache3, this.f28723x, null, 1), 3);
                }
                return pe.z.f22715a;
        }
        return pe.z.f22715a;
    }

    public /* synthetic */ m5(List list, Object obj, Object obj2, df.q qVar, df.l lVar, e1 e1Var, int i) {
        this.f28720u = i;
        this.f28724y = list;
        this.f28725z = obj;
        this.A = obj2;
        this.f28721v = qVar;
        this.f28722w = lVar;
        this.f28723x = e1Var;
    }

    public /* synthetic */ m5(n2 n2Var, df.l lVar, LruCache lruCache, a1 a1Var, a1 a1Var2, a1 a1Var3) {
        this.f28720u = 2;
        this.f28724y = n2Var;
        this.f28722w = lVar;
        this.f28725z = lruCache;
        this.A = a1Var;
        this.f28721v = a1Var2;
        this.f28723x = a1Var3;
    }
}
