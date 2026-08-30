package w7;
import k1.f;
import r0.a1;
import x.o;

import android.content.Context;
import android.net.Uri;
import android.util.LruCache;

/* loaded from: classes.dex */
public final class v6 extends ve.i implements df.p {
    public final /* synthetic */ a1 A;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f29290u;

    /* renamed from: v, reason: collision with root package name */
    public a1 f29291v;

    /* renamed from: w, reason: collision with root package name */
    public int f29292w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Context f29293x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Uri f29294y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ LruCache f29295z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v6(Context context, Uri uri, LruCache lruCache, a1 a1Var, te.c cVar, int i) {
        super(2, cVar);
        this.f29290u = i;
        this.f29293x = context;
        this.f29294y = uri;
        this.f29295z = lruCache;
        this.A = a1Var;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f29290u) {
            case 0:
                return new v6(this.f29293x, this.f29294y, this.f29295z, this.A, cVar, 0);
            default:
                return new v6(this.f29293x, this.f29294y, this.f29295z, this.A, cVar, 1);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        pf.z zVar = (pf.z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f29290u) {
            case 0:
                return ((v6) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            default:
                return ((v6) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        a1 a1Var;
        a1 a1Var2;
        switch (this.f29290u) {
            case 0:
                int i = this.f29292w;
                pe.z zVar = pe.z.f22715a;
                if (i != 0) {
                    if (i == 1) {
                        a1Var = this.f29291v;
                        pe.a.e(obj);
                    } else {
                        q.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    a1Var = this.A;
                    if (((f) a1Var.getValue()) == null) {
                        this.f29291v = a1Var;
                        this.f29292w = 1;
                        obj = n4.n1(this.f29293x, this.f29294y, this.f29295z, this);
                        ue.a aVar = ue.a.f27192u;
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        return zVar;
                    }
                }
                a1Var.setValue((f) obj);
                return zVar;
            default:
                int i10 = this.f29292w;
                if (i10 != 0) {
                    if (i10 == 1) {
                        a1Var2 = this.f29291v;
                        pe.a.e(obj);
                    } else {
                        q.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    Uri uri = this.f29294y;
                    uri.getClass();
                    a1Var2 = this.A;
                    this.f29291v = a1Var2;
                    this.f29292w = 1;
                    obj = n4.n1(this.f29293x, uri, this.f29295z, this);
                    ue.a aVar2 = ue.a.f27192u;
                    if (obj == aVar2) {
                        return aVar2;
                    }
                }
                a1Var2.setValue((f) obj);
                return pe.z.f22715a;
        }
    }
}
