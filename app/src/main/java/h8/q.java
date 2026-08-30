package h8;

import kotlin.jvm.internal.y;
import pe.z;
import q.x;
import t.b0;
import t.f0;
import t.k2;
import t.t1;
import v1.w;

/* loaded from: classes.dex */
public final class q extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f17984u;

    /* renamed from: v, reason: collision with root package name */
    public int f17985v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f17986w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ y f17987x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ f f17988y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(y yVar, f fVar, te.c cVar, int i) {
        super(2, cVar);
        this.f17984u = i;
        switch (i) {
            case 1:
                b bVar = b.f17917u;
                this.f17987x = yVar;
                this.f17988y = fVar;
                super(2, cVar);
                return;
            default:
                b bVar2 = b.f17917u;
                this.f17987x = yVar;
                this.f17988y = fVar;
                return;
        }
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        int i = this.f17984u;
        f fVar = this.f17988y;
        y yVar = this.f17987x;
        switch (i) {
            case 0:
                b bVar = b.f17917u;
                q qVar = new q(yVar, fVar, cVar, 0);
                qVar.f17986w = obj;
                return qVar;
            default:
                b bVar2 = b.f17917u;
                q qVar2 = new q(yVar, fVar, cVar, 1);
                qVar2.f17986w = obj;
                return qVar2;
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        w wVar = (w) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f17984u) {
            case 0:
                return ((q) create(wVar, cVar)).invokeSuspend(z.f22715a);
            default:
                return ((q) create(wVar, cVar)).invokeSuspend(z.f22715a);
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f17984u;
        z zVar = z.f22715a;
        f fVar = this.f17988y;
        y yVar = this.f17987x;
        ue.a aVar = ue.a.f27192u;
        switch (i) {
            case 0:
                int i10 = this.f17985v;
                if (i10 != 0) {
                    if (i10 == 1) {
                        pe.a.e(obj);
                        return zVar;
                    }
                    x.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pe.a.e(obj);
                w wVar = (w) this.f17986w;
                b bVar = b.f17917u;
                b8.l lVar = new b8.l(yVar, fVar);
                this.f17985v = 1;
                float f10 = f0.f25388a;
                Object e = t1.e(wVar, new b0(t.e.f25371x, lVar, t.x.f25571y, t.x.f25572z, null, 0), this);
                if (e != aVar) {
                    e = zVar;
                }
                if (e == aVar) {
                    return aVar;
                }
                return zVar;
            default:
                int i11 = this.f17985v;
                if (i11 != 0) {
                    if (i11 == 1) {
                        pe.a.e(obj);
                        return zVar;
                    }
                    x.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pe.a.e(obj);
                w wVar2 = (w) this.f17986w;
                b bVar2 = b.f17917u;
                androidx.ink.authoring.compose.d dVar = new androidx.ink.authoring.compose.d(yVar, fVar);
                this.f17985v = 1;
                if (k2.e(wVar2, null, null, null, dVar, this, 7) == aVar) {
                    return aVar;
                }
                return zVar;
        }
    }
}
