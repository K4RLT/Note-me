package w7;
import r0.e1;
import r0.l;
import r0.m;
import r0.r;
import z.b;

import java.util.ArrayList;
import java.util.Locale;

/* loaded from: classes.dex */
public final class h6 extends kotlin.jvm.internal.m implements df.r {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ArrayList f28359u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ t9 f28360v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ df.l f28361w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ df.q f28362x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ df.l f28363y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ e1 f28364z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6(ArrayList arrayList, t9 t9Var, df.l lVar, df.q qVar, df.l lVar2, e1 e1Var) {
        super(4);
        this.f28359u = arrayList;
        this.f28360v = t9Var;
        this.f28361w = lVar;
        this.f28362x = qVar;
        this.f28363y = lVar2;
        this.f28364z = e1Var;
    }

    @Override // df.r
    public final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z3;
        String str;
        String valueOf;
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
            ma maVar = (ma) this.f28359u.get(intValue);
            rVar.a0(-2134842806);
            boolean z9 = this.f28360v.f29155a.f29083d;
            Object obj5 = l.f24285a;
            if (z9) {
                rVar.a0(-2134848821);
                if (maVar instanceof ka) {
                    String str2 = ((ka) maVar).f28586a;
                    str = mf.f.G(str2, "/", str2);
                } else if (maVar instanceof la) {
                    str = ((la) maVar).f28658b;
                } else {
                    l4.a.o();
                    return null;
                }
                String i12 = mf.m.i(mf.f.A(mf.f.z(str, "washi_")), "_", " ");
                if (i12.length() > 0) {
                    StringBuilder sb2 = new StringBuilder();
                    char charAt = i12.charAt(0);
                    if (Character.isLowerCase(charAt)) {
                        Locale locale = Locale.getDefault();
                        locale.getClass();
                        valueOf = ya.x0.d(charAt, locale);
                    } else {
                        valueOf = String.valueOf(charAt);
                    }
                    sb2.append((Object) valueOf);
                    sb2.append(i12.substring(1));
                    i12 = sb2.toString();
                }
                df.l lVar = this.f28361w;
                boolean f10 = rVar.f(lVar) | rVar.f(maVar);
                Object O = rVar.O();
                if (f10 || O == obj5) {
                    O = new b8.c9(lVar, maVar, 2);
                    rVar.k0(O);
                }
                n4.O0(maVar, i12, (df.a) O, rVar, 0);
                rVar.p(false);
            } else {
                rVar.a0(-2133856821);
                df.q qVar = this.f28362x;
                boolean f11 = rVar.f(qVar) | rVar.f(maVar);
                Object O2 = rVar.O();
                if (f11 || O2 == obj5) {
                    O2 = new e6(0, qVar, maVar);
                    rVar.k0(O2);
                }
                n4.H0(maVar, (df.p) O2, this.f28363y, this.f28364z.h(), rVar, 0);
                rVar.p(false);
            }
            rVar.p(false);
        } else {
            rVar.U();
        }
        return pe.z.f22715a;
    }
}
