package w7;
import r0.a1;
import r0.l;
import r0.m;
import r0.r;
import z.b;

import android.content.Context;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class f8 extends kotlin.jvm.internal.m implements df.r {
    public final /* synthetic */ a1 A;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ List f28238u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f28239v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Context f28240w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ u7.m3 f28241x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f28242y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f28243z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f8(List list, String str, Context context, u7.m3 m3Var, int i, int i10, a1 a1Var) {
        super(4);
        this.f28238u = list;
        this.f28239v = str;
        this.f28240w = context;
        this.f28241x = m3Var;
        this.f28242y = i;
        this.f28243z = i10;
        this.A = a1Var;
    }

    @Override // df.r
    public final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z3;
        boolean z9;
        u7.i7 i7Var;
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
            u7.i7 i7Var2 = (u7.i7) this.f28238u.get(intValue);
            rVar.a0(1072797322);
            boolean equals = i7Var2.f26339a.equals(this.f28239v);
            a1 a1Var = this.A;
            if (((i8) a1Var.getValue()) != i8.RIGHT) {
                z9 = true;
            } else {
                z9 = false;
            }
            Set set = x7.g0.f30195a;
            boolean a10 = x7.g0.a("paper:".concat(i7Var2.f26339a));
            boolean h3 = rVar.h(this.f28240w) | rVar.h(i7Var2);
            u7.m3 m3Var = this.f28241x;
            boolean h10 = h3 | rVar.h(m3Var) | rVar.d(this.f28242y) | rVar.d(this.f28243z);
            Object O = rVar.O();
            if (!h10 && O != l.f24285a) {
                i7Var = i7Var2;
            } else {
                i7Var = i7Var2;
                e8 e8Var = new e8(this.f28240w, i7Var, m3Var, this.f28242y, this.f28243z, a1Var);
                rVar.k0(e8Var);
                O = e8Var;
            }
            h8.a(i7Var, equals, z9, (df.a) O, a10, rVar, 0);
            rVar.p(false);
        } else {
            rVar.U();
        }
        return pe.z.f22715a;
    }
}
