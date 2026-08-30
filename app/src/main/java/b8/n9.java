package b8;
import d8.d;
import d8.f;
import j7.h;
import j7.l;

import android.content.Context;
import com.daren.scraply.data.local.ScraplyDatabase;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class n9 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2461u;

    /* renamed from: v, reason: collision with root package name */
    public int f2462v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Context f2463w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n9(int i, Context context, te.c cVar) {
        super(2, cVar);
        this.f2461u = i;
        this.f2463w = context;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f2461u) {
            case 0:
                return new n9(0, this.f2463w, cVar);
            case 1:
                return new n9(1, this.f2463w, cVar);
            case 2:
                return new n9(2, this.f2463w, cVar);
            case 3:
                return new n9(3, this.f2463w, cVar);
            default:
                return new n9(4, this.f2463w, cVar);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        pf.z zVar = (pf.z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f2461u) {
            case 0:
                return ((n9) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            case 1:
                return ((n9) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            case 2:
                return ((n9) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            case 3:
                return ((n9) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            default:
                return ((n9) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        sf.n0 n0Var;
        boolean z3;
        AtomicInteger atomicInteger;
        int i = this.f2461u;
        pe.z zVar = pe.z.f22715a;
        Context context = this.f2463w;
        ue.a aVar = ue.a.f27192u;
        boolean z9 = true;
        te.c cVar = null;
        switch (i) {
            case 0:
                int i10 = this.f2462v;
                if (i10 != 0) {
                    if (i10 == 1) {
                        pe.a.e(obj);
                        return zVar;
                    }
                    q.x.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pe.a.e(obj);
                fg.s sVar = f.f15790a;
                this.f2462v = 1;
                wf.e eVar = pf.l0.f22767a;
                Object J = pf.b0.J(wf.d.f29913w, new n9(4, context, cVar), this);
                if (J != aVar) {
                    J = zVar;
                }
                if (J == aVar) {
                    return aVar;
                }
                return zVar;
            case 1:
                int i11 = this.f2462v;
                if (i11 != 0) {
                    if (i11 == 1) {
                        pe.a.e(obj);
                        return obj;
                    }
                    q.x.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pe.a.e(obj);
                l y10 = ScraplyDatabase.f4148l.a(context).y();
                this.f2462v = 1;
                y10.getClass();
                Object a10 = wa.g8.a(new h(1, y10, null), this);
                if (a10 == aVar) {
                    return aVar;
                }
                return a10;
            case 2:
                int i12 = this.f2462v;
                if (i12 != 0) {
                    if (i12 == 1) {
                        pe.a.e(obj);
                        return obj;
                    }
                    q.x.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pe.a.e(obj);
                l y11 = ScraplyDatabase.f4148l.a(context).y();
                this.f2462v = 1;
                y11.getClass();
                Object a11 = wa.g8.a(new h(1, y11, null), this);
                if (a11 == aVar) {
                    return aVar;
                }
                return a11;
            case 3:
                int i13 = this.f2462v;
                if (i13 != 0) {
                    if (i13 == 1) {
                        pe.a.e(obj);
                        return zVar;
                    }
                    q.x.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pe.a.e(obj);
                e3 e3Var = e3.f2015a;
                this.f2462v = 1;
                wf.e eVar2 = pf.l0.f22767a;
                Object J2 = pf.b0.J(wf.d.f29913w, new androidx.lifecycle.q(context, (te.c) null, 5), this);
                if (J2 != aVar) {
                    J2 = zVar;
                }
                if (J2 == aVar) {
                    return aVar;
                }
                return zVar;
            default:
                int i14 = this.f2462v;
                try {
                    if (i14 != 0) {
                        if (i14 == 1) {
                            pe.a.e(obj);
                        } else {
                            q.x.o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        pe.a.e(obj);
                        sf.n0 n0Var2 = f.f15800m;
                        if (f.f15799l.incrementAndGet() > 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        Boolean valueOf = Boolean.valueOf(z3);
                        n0Var2.getClass();
                        n0Var2.k(null, valueOf);
                        this.f2462v = 1;
                        wf.e eVar3 = pf.l0.f22767a;
                        Object J3 = pf.b0.J(wf.d.f29913w, new d(context, null), this);
                        if (J3 != aVar) {
                            J3 = zVar;
                        }
                        if (J3 == aVar) {
                            return aVar;
                        }
                    }
                    if (atomicInteger.decrementAndGet() <= 0) {
                        z9 = false;
                    }
                    Boolean valueOf2 = Boolean.valueOf(z9);
                    n0Var.getClass();
                    n0Var.k(null, valueOf2);
                    sf.n0 n0Var3 = f.f15802o;
                    Boolean bool = Boolean.TRUE;
                    n0Var3.getClass();
                    n0Var3.k(null, bool);
                    return zVar;
                } finally {
                    n0Var = f.f15800m;
                    if (f.f15799l.decrementAndGet() <= 0) {
                        z9 = false;
                    }
                    Boolean valueOf3 = Boolean.valueOf(z9);
                    n0Var.getClass();
                    n0Var.k(null, valueOf3);
                    sf.n0 n0Var4 = f.f15802o;
                    Boolean bool2 = Boolean.TRUE;
                    n0Var4.getClass();
                    n0Var4.k(null, bool2);
                }
        }
    }
}
