package b0;
import d1.r;
import g0.a1;
import g0.h;
import k0.j1;
import q.g1;
import r0.m;
import r0.r;
import r0.y;
import z0.c;

import java.util.List;
import o0.x1;
import ya.ta;

/* loaded from: classes.dex */
public final class x extends kotlin.jvm.internal.m implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f1276u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f1277v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f1278w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f1279x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(int i, z zVar, Object obj) {
        super(2);
        this.f1276u = 0;
        this.f1278w = zVar;
        this.f1277v = i;
        this.f1279x = obj;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        boolean z3;
        switch (this.f1276u) {
            case 0:
                m mVar = (m) obj;
                int intValue = ((Number) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                r rVar = (r) mVar;
                if (rVar.R(intValue & 1, z3)) {
                    ((z) this.f1278w).e(this.f1277v, this.f1279x, rVar);
                } else {
                    rVar.U();
                }
                return pe.z.f22715a;
            case 1:
                ((Number) obj2).intValue();
                h.a((m2.g) this.f1278w, (List) this.f1279x, (m) obj, y.L(this.f1277v | 1));
                return pe.z.f22715a;
            case 2:
                ((Number) obj2).intValue();
                a1.f((j1) this.f1278w, (c) this.f1279x, (m) obj, y.L(this.f1277v | 1));
                return pe.z.f22715a;
            case 3:
                ((Number) obj2).intValue();
                x1.a((m2.q0) this.f1278w, (c) this.f1279x, (m) obj, y.L(this.f1277v | 1));
                return pe.z.f22715a;
            case 4:
                ((Number) obj2).intValue();
                ((g1) this.f1278w).a(this.f1279x, (m) obj, y.L(this.f1277v | 1));
                return pe.z.f22715a;
            default:
                ((Number) obj2).intValue();
                ta.a((r) this.f1278w, (df.l) this.f1279x, (m) obj, y.L(this.f1277v | 1));
                return pe.z.f22715a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(int i, int i10, Object obj, Object obj2) {
        super(2);
        this.f1276u = i10;
        this.f1278w = obj;
        this.f1279x = obj2;
        this.f1277v = i;
    }
}
