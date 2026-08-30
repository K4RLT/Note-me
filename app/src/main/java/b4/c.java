package b4;

import df.p;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import pe.z;
import q.x;
import ve.i;

/* loaded from: classes.dex */
public final class c extends i implements p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f1701u;

    /* renamed from: v, reason: collision with root package name */
    public int f1702v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f1703w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ i f1704x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(p pVar, te.c cVar, int i) {
        super(2, cVar);
        this.f1701u = i;
        switch (i) {
            case 1:
                this.f1704x = (i) pVar;
                super(2, cVar);
                return;
            default:
                this.f1704x = (i) pVar;
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [df.p, ve.i] */
    /* JADX WARN: Type inference failed for: r1v1, types: [df.p, ve.i] */
    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f1701u) {
            case 0:
                c cVar2 = new c(this.f1704x, cVar, 0);
                cVar2.f1703w = obj;
                return cVar2;
            default:
                c cVar3 = new c(this.f1704x, cVar, 1);
                cVar3.f1703w = obj;
                return cVar3;
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        b bVar = (b) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f1701u) {
            case 0:
                return ((c) create(bVar, cVar)).invokeSuspend(z.f22715a);
            default:
                return ((c) create(bVar, cVar)).invokeSuspend(z.f22715a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [df.p, ve.i] */
    /* JADX WARN: Type inference failed for: r4v14, types: [df.p, ve.i] */
    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f1701u) {
            case 0:
                int i = this.f1702v;
                if (i != 0) {
                    if (i == 1) {
                        pe.a.e(obj);
                    } else {
                        x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    b bVar = (b) this.f1703w;
                    this.f1702v = 1;
                    obj = this.f1704x.invoke(bVar, this);
                    ue.a aVar = ue.a.f27192u;
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                b bVar2 = (b) obj;
                bVar2.f1700b.set(true);
                return bVar2;
            default:
                int i10 = this.f1702v;
                if (i10 != 0) {
                    if (i10 == 1) {
                        b bVar3 = (b) this.f1703w;
                        pe.a.e(obj);
                        return bVar3;
                    }
                    x.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pe.a.e(obj);
                Map unmodifiableMap = Collections.unmodifiableMap(((b) this.f1703w).f1699a);
                unmodifiableMap.getClass();
                b bVar4 = new b(new LinkedHashMap(unmodifiableMap), false);
                this.f1703w = bVar4;
                this.f1702v = 1;
                Object invoke = this.f1704x.invoke(bVar4, this);
                ue.a aVar2 = ue.a.f27192u;
                if (invoke == aVar2) {
                    return aVar2;
                }
                return bVar4;
        }
    }
}
