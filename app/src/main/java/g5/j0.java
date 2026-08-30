package g5;
import x.o;
import o0.a;
import q.x;

import android.database.SQLException;
import java.util.Set;

/* loaded from: classes.dex */
public final class j0 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f17466u;

    /* renamed from: v, reason: collision with root package name */
    public int f17467v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f17468w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ o0 f17469x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(o0 o0Var, te.c cVar, int i) {
        super(2, cVar);
        this.f17466u = i;
        this.f17469x = o0Var;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f17466u) {
            case 0:
                j0 j0Var = new j0(this.f17469x, cVar, 0);
                j0Var.f17468w = obj;
                return j0Var;
            default:
                j0 j0Var2 = new j0(this.f17469x, cVar, 1);
                j0Var2.f17468w = obj;
                return j0Var2;
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f17466u) {
            case 0:
                return ((j0) create((i5.l) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            default:
                return ((j0) create((f0) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        f0 f0Var;
        switch (this.f17466u) {
            case 0:
                int i = this.f17467v;
                if (i != 0) {
                    if (i == 1) {
                        pe.a.e(obj);
                        return obj;
                    }
                    x.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pe.a.e(obj);
                i5.l lVar = (i5.l) this.f17468w;
                this.f17467v = 1;
                Object a10 = a(this.f17469x, lVar, this);
                ue.a aVar = ue.a.f27192u;
                if (a10 == aVar) {
                    return aVar;
                }
                return a10;
            default:
                int i10 = this.f17467v;
                ue.a aVar2 = ue.a.f27192u;
                try {
                    if (i10 != 0) {
                        if (i10 != 1) {
                            if (i10 == 2) {
                                pe.a.e(obj);
                                return (Set) obj;
                            }
                            x.o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        f0Var = (f0) this.f17468w;
                        pe.a.e(obj);
                    } else {
                        pe.a.e(obj);
                        f0Var = (f0) this.f17468w;
                        this.f17468w = f0Var;
                        this.f17467v = 1;
                        obj = f0Var.a(this);
                        if (obj == aVar2) {
                            return aVar2;
                        }
                    }
                    if (!((Boolean) obj).booleanValue()) {
                        e0 e0Var = e0.f17435v;
                        j0 j0Var = new j0(this.f17469x, null, 0);
                        this.f17468w = null;
                        this.f17467v = 2;
                        obj = f0Var.d(e0Var, j0Var, this);
                        if (obj == aVar2) {
                            return aVar2;
                        }
                        return (Set) obj;
                    }
                } catch (SQLException unused) {
                }
                return qe.u.f24025u;
        }
    }
}
