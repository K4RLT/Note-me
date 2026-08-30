package b8;
import m.d;
import n.b;
import n.c;
import r0.r1;

import android.util.Log;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class r7 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2671u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f2672v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r7(int i, te.c cVar, int i10) {
        super(i, cVar);
        this.f2671u = i10;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f2671u) {
            case 0:
                r7 r7Var = new r7(2, cVar, 0);
                r7Var.f2672v = obj;
                return r7Var;
            case 1:
                r7 r7Var2 = new r7(2, cVar, 1);
                r7Var2.f2672v = obj;
                return r7Var2;
            case 2:
                r7 r7Var3 = new r7(2, cVar, 2);
                r7Var3.f2672v = obj;
                return r7Var3;
            default:
                r7 r7Var4 = new r7(2, cVar, 3);
                r7Var4.f2672v = obj;
                return r7Var4;
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2671u) {
            case 0:
                return ((r7) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 1:
                return ((r7) create((r1) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 2:
                return ((r7) create((sf.g0) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            default:
                r7 r7Var = (r7) create((String) obj, (te.c) obj2);
                pe.z zVar = pe.z.f22715a;
                r7Var.invokeSuspend(zVar);
                return zVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [pe.k] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.ArrayList] */
    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        Object kVar;
        boolean z3 = false;
        switch (this.f2671u) {
            case 0:
                pe.a.e(obj);
                Serializable e = c8.a.e("price_tiers", qe.x.c(new pe.j("select", FacebookMediationAdapter.KEY_ID), new pe.j("active", "eq.true"), new pe.j("order", "sort_order.asc")));
                if (e instanceof pe.k) {
                    e = null;
                }
                String str = (String) e;
                qe.s sVar = qe.s.f24023u;
                if (str != null) {
                    try {
                        fg.m c10 = s7.f2720b.c(str);
                        c10.getClass();
                        fg.e eVar = (fg.e) c10;
                        kVar = new ArrayList(qe.d(eVar, 10));
                        Iterator it = eVar.f16968u.iterator();
                        while (it.hasNext()) {
                            Object obj2 = fg.b((fg.m) it.next()).get(FacebookMediationAdapter.KEY_ID);
                            obj2.getClass();
                            kVar.add(fg.c((fg.m) obj2).a());
                        }
                    } catch (Throwable th) {
                        kVar = new pe.k(th);
                    }
                    if (!(kVar instanceof pe.k)) {
                        return kVar;
                    }
                    return sVar;
                }
                return sVar;
            case 1:
                pe.a.e(obj);
                if (((r1) this.f2672v) == r1.f24361u) {
                    z3 = true;
                }
                return Boolean.valueOf(z3);
            case 2:
                pe.a.e(obj);
                if (((sf.g0) this.f2672v) != sf.g0.f25171u) {
                    z3 = true;
                }
                return Boolean.valueOf(z3);
            default:
                pe.a.e(obj);
                Log.e("SessionConfigFetcher", "Error failing to fetch the remote configs: " + ((String) this.f2672v));
                return pe.z.f22715a;
        }
    }
}
