package w7;
import r0.e1;
import r0.l;
import r0.m;
import r0.r;
import z.b;

import android.content.Context;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class g6 extends kotlin.jvm.internal.m implements df.r {
    public final /* synthetic */ k0 A;
    public final /* synthetic */ df.l B;
    public final /* synthetic */ e1 C;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ArrayList f28295u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Context f28296v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ pf.z f28297w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ u7.m3 f28298x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f28299y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f28300z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6(ArrayList arrayList, Context context, pf.z zVar, u7.m3 m3Var, int i, int i10, k0 k0Var, df.l lVar, e1 e1Var) {
        super(4);
        this.f28295u = arrayList;
        this.f28296v = context;
        this.f28297w = zVar;
        this.f28298x = m3Var;
        this.f28299y = i;
        this.f28300z = i10;
        this.A = k0Var;
        this.B = lVar;
        this.C = e1Var;
    }

    @Override // df.r
    public final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z3;
        int i10;
        int i11;
        b bVar = (b) obj;
        int intValue = ((Number) obj2).intValue();
        m mVar = (m) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            if (((r) mVar).f(bVar)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i = i11 | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            if (((r) mVar).d(intValue)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i |= i10;
        }
        if ((i & 147) != 146) {
            z3 = true;
        } else {
            z3 = false;
        }
        r rVar = (r) mVar;
        if (rVar.R(i & 1, z3)) {
            u4 u4Var = (u4) this.f28295u.get(intValue);
            rVar.a0(-592884675);
            boolean h3 = rVar.h(this.f28296v) | rVar.f(u4Var) | rVar.h(this.f28297w);
            u7.m3 m3Var = this.f28298x;
            boolean h10 = h3 | rVar.h(m3Var) | rVar.d(this.f28299y) | rVar.d(this.f28300z);
            k0 k0Var = this.A;
            boolean f10 = h10 | rVar.f(k0Var);
            Object O = rVar.O();
            if (f10 || O == l.f24285a) {
                d6 d6Var = new d6(this.f28296v, u4Var, this.f28297w, m3Var, this.f28299y, this.f28300z, k0Var);
                rVar.k0(d6Var);
                O = d6Var;
            }
            n4.D0(u4Var, (df.a) O, this.B, this.C.h(), rVar, 0);
            rVar.p(false);
        } else {
            rVar.U();
        }
        return pe.z.f22715a;
    }
}
