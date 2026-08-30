package r7;
import j.n;
import m.a;
import m.b;
import m.h;

import df.p;
import fg.o;
import java.util.List;
import k1.c0;
import k1.l0;
import k1.r;
import pe.z;
import r0.q1;
import r0.y;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final long f24654a = l0.d(4062323239L);

    /* renamed from: b, reason: collision with root package name */
    public static final long f24655b;

    /* renamed from: c, reason: collision with root package name */
    public static final c0 f24656c;

    /* renamed from: d, reason: collision with root package name */
    public static final pe.n f24657d;

    static {
        long d2 = l0.d(4294551589L);
        f24655b = d2;
        f24656c = new c0(qe.h(new r(d2), new r(l0.d(4293880832L))), null, 0L, 9187343241974906880L);
        f24657d = new pe.n(new o(25));
    }

    public static final void a(final boolean z3, df.a aVar, final df.a aVar2, final df.a aVar3, final d1.r rVar, final boolean z9, r0.m mVar, final int i) {
        int i10;
        int i11;
        int i12;
        boolean z10;
        df.a aVar4;
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        r0.r rVar2 = (r0.r) mVar;
        rVar2.c0(-1945077147);
        if (rVar2.g(z3)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i13 = i | i10;
        if (rVar2.h(aVar3)) {
            i11 = 2048;
        } else {
            i11 = 1024;
        }
        int i14 = i13 | i11;
        if (rVar2.f(rVar)) {
            i12 = 16384;
        } else {
            i12 = 8192;
        }
        int i15 = i14 | i12;
        if ((74899 & i15) != 74898) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar2.R(i15 & 1, z10)) {
            aVar4 = aVar;
            long j10 = f24654a;
            x7.n(z3, j10, rVar, z9, 0.0f, z0.h.d(-119769752, new j(0, aVar4, aVar3, aVar2), rVar2), rVar2, ((i15 >> 6) & 896) | (i15 & 14) | 196656 | 3072, 16);
        } else {
            aVar4 = aVar;
            rVar2.U();
        }
        q1 t3 = rVar2.t();
        if (t3 != null) {
            final df.a aVar5 = aVar4;
            t3.f24332d = new p(z3, aVar5, aVar2, aVar3, rVar, z9, i) { // from class: r7.k

                /* renamed from: u, reason: collision with root package name */
                public final /* synthetic */ boolean f24647u;

                /* renamed from: v, reason: collision with root package name */
                public final /* synthetic */ df.a f24648v;

                /* renamed from: w, reason: collision with root package name */
                public final /* synthetic */ df.a f24649w;

                /* renamed from: x, reason: collision with root package name */
                public final /* synthetic */ df.a f24650x;

                /* renamed from: y, reason: collision with root package name */
                public final /* synthetic */ d1.r f24651y;

                /* renamed from: z, reason: collision with root package name */
                public final /* synthetic */ boolean f24652z;

                @Override // df.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int L = y.L(197041);
                    a(this.f24647u, this.f24648v, this.f24649w, this.f24650x, this.f24651y, this.f24652z, (r0.m) obj, L);
                    return z.f22715a;
                }
            };
        }
    }

    public static final void b(final boolean z3, final List list, final df.l lVar, final df.a aVar, r0.m mVar, final int i) {
        int i10;
        int i11;
        int i12;
        boolean z9;
        boolean z10;
        List list2;
        df.l lVar2;
        df.a aVar2;
        r0.r rVar;
        int i13;
        list.getClass();
        lVar.getClass();
        aVar.getClass();
        r0.r rVar2 = (r0.r) mVar;
        rVar2.c0(-10153034);
        if (rVar2.g(z3)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i14 = i10 | i;
        if (rVar2.h(list)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i15 = i14 | i11;
        if (rVar2.h(lVar)) {
            i12 = 256;
        } else {
            i12 = 128;
        }
        int i16 = i15 | i12;
        if ((i16 & 1171) != 1170) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (rVar2.R(i16 & 1, z9)) {
            if (!z3) {
                q1 t3 = rVar2.t();
                if (t3 != null) {
                    final int i17 = 0;
                    t3.f24332d = new p(z3, list, lVar, aVar, i, i17) { // from class: r7.i

                        /* renamed from: u, reason: collision with root package name */
                        public final /* synthetic */ int f24638u;

                        /* renamed from: v, reason: collision with root package name */
                        public final /* synthetic */ boolean f24639v;

                        /* renamed from: w, reason: collision with root package name */
                        public final /* synthetic */ List f24640w;

                        /* renamed from: x, reason: collision with root package name */
                        public final /* synthetic */ df.l f24641x;

                        /* renamed from: y, reason: collision with root package name */
                        public final /* synthetic */ df.a f24642y;

                        {
                            this.f24638u = i17;
                        }

                        @Override // df.p
                        public final Object invoke(Object obj, Object obj2) {
                            switch (this.f24638u) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int L = y.L(3073);
                                    b(this.f24639v, this.f24640w, this.f24641x, this.f24642y, (r0.m) obj, L);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int L2 = y.L(3073);
                                    b(this.f24639v, this.f24640w, this.f24641x, this.f24642y, (r0.m) obj, L2);
                                    break;
                            }
                            return z.f22715a;
                        }
                    };
                    return;
                }
                return;
            }
            z10 = z3;
            list2 = list;
            lVar2 = lVar;
            aVar2 = aVar;
            i13 = i;
            rVar = rVar2;
            wa.p.a(aVar2, null, z0.h.d(2016986559, new b8.g(list2, aVar2, lVar2, 2), rVar2), rVar, 390, 2);
        } else {
            z10 = z3;
            list2 = list;
            lVar2 = lVar;
            aVar2 = aVar;
            rVar = rVar2;
            i13 = i;
            rVar.U();
        }
        q1 t10 = rVar.t();
        if (t10 != null) {
            final df.l lVar3 = lVar2;
            final List list3 = list2;
            final boolean z11 = z10;
            final int i18 = 1;
            final int i19 = i13;
            final df.a aVar3 = aVar2;
            t10.f24332d = new p(z11, list3, lVar3, aVar3, i19, i18) { // from class: r7.i

                /* renamed from: u, reason: collision with root package name */
                public final /* synthetic */ int f24638u;

                /* renamed from: v, reason: collision with root package name */
                public final /* synthetic */ boolean f24639v;

                /* renamed from: w, reason: collision with root package name */
                public final /* synthetic */ List f24640w;

                /* renamed from: x, reason: collision with root package name */
                public final /* synthetic */ df.l f24641x;

                /* renamed from: y, reason: collision with root package name */
                public final /* synthetic */ df.a f24642y;

                {
                    this.f24638u = i18;
                }

                @Override // df.p
                public final Object invoke(Object obj, Object obj2) {
                    switch (this.f24638u) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int L = y.L(3073);
                            b(this.f24639v, this.f24640w, this.f24641x, this.f24642y, (r0.m) obj, L);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int L2 = y.L(3073);
                            b(this.f24639v, this.f24640w, this.f24641x, this.f24642y, (r0.m) obj, L2);
                            break;
                    }
                    return z.f22715a;
                }
            };
        }
    }
}
