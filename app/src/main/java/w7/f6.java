package w7;
import r0.e1;
import r0.l;
import r0.m;
import r0.r;
import z.b;

import android.content.Context;
import android.net.Uri;
import android.util.LruCache;
import java.util.List;

/* loaded from: classes.dex */
public final class f6 extends kotlin.jvm.internal.m implements df.r {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f28226u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ List f28227v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ df.q f28228w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ df.l f28229x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ e1 f28230y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f28231z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f6(List list, Object obj, df.q qVar, df.l lVar, e1 e1Var, int i) {
        super(4);
        this.f28226u = i;
        this.f28227v = list;
        this.f28231z = obj;
        this.f28228w = qVar;
        this.f28229x = lVar;
        this.f28230y = e1Var;
    }

    @Override // df.r
    public final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z3;
        int i10;
        int i11;
        int i12;
        boolean z9;
        int i13;
        int i14;
        switch (this.f28226u) {
            case 0:
                b bVar = (b) obj;
                int intValue = ((Number) obj2).intValue();
                m mVar = (m) obj3;
                int intValue2 = ((Number) obj4).intValue();
                Context context = (Context) this.f28231z;
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
                    pe.j jVar = (pe.j) this.f28227v.get(intValue);
                    rVar.a0(1490261197);
                    String str = (String) jVar.f22693u;
                    boolean h3 = rVar.h(context) | rVar.f(jVar);
                    df.q qVar = this.f28228w;
                    boolean f10 = h3 | rVar.f(qVar);
                    Object O = rVar.O();
                    if (f10 || O == l.f24285a) {
                        O = new c6(context, jVar, qVar);
                        rVar.k0(O);
                    }
                    n4.G0(str, (df.p) O, this.f28229x, this.f28230y.h(), rVar, 0);
                    rVar.p(false);
                } else {
                    rVar.U();
                }
                return pe.z.f22715a;
            default:
                b bVar2 = (b) obj;
                int intValue3 = ((Number) obj2).intValue();
                m mVar2 = (m) obj3;
                int intValue4 = ((Number) obj4).intValue();
                if ((intValue4 & 6) == 0) {
                    if (((r) mVar2).f(bVar2)) {
                        i14 = 4;
                    } else {
                        i14 = 2;
                    }
                    i12 = i14 | intValue4;
                } else {
                    i12 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    if (((r) mVar2).d(intValue3)) {
                        i13 = 32;
                    } else {
                        i13 = 16;
                    }
                    i12 |= i13;
                }
                if ((i12 & 147) != 146) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                r rVar2 = (r) mVar2;
                if (rVar2.R(i12 & 1, z9)) {
                    Uri uri = (Uri) this.f28227v.get(intValue3);
                    rVar2.a0(457619922);
                    LruCache lruCache = (LruCache) this.f28231z;
                    df.q qVar2 = this.f28228w;
                    boolean f11 = rVar2.f(qVar2) | rVar2.h(uri);
                    Object O2 = rVar2.O();
                    if (f11 || O2 == l.f24285a) {
                        O2 = new e6(1, qVar2, uri);
                        rVar2.k0(O2);
                    }
                    n4.F0(uri, lruCache, (df.p) O2, this.f28229x, this.f28230y.h(), rVar2, 0);
                    rVar2.p(false);
                } else {
                    rVar2.U();
                }
                return pe.z.f22715a;
        }
    }
}
