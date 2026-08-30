package s7;

import b8.c0;
import b8.fa;
import df.p;
import pf.b0;
import pf.z;

/* loaded from: classes.dex */
public final class g extends ve.i implements p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f25012u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f25013v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q.d f25014w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ float f25015x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ q.d f25016y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(q.d dVar, float f10, q.d dVar2, te.c cVar, int i) {
        super(2, cVar);
        this.f25012u = i;
        this.f25014w = dVar;
        this.f25015x = f10;
        this.f25016y = dVar2;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f25012u) {
            case 0:
                g gVar = new g(this.f25014w, this.f25015x, this.f25016y, cVar, 0);
                gVar.f25013v = obj;
                return gVar;
            default:
                g gVar2 = new g(this.f25014w, this.f25015x, this.f25016y, cVar, 1);
                gVar2.f25013v = obj;
                return gVar2;
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f25012u) {
            case 0:
                return ((g) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            default:
                return ((g) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f25012u) {
            case 0:
                z zVar = (z) this.f25013v;
                pe.a.e(obj);
                b0.x(zVar, null, new fa(this.f25015x, 1, this.f25014w, null), 3);
                return b0.x(zVar, null, new c0(9, this.f25016y, null), 3);
            default:
                z zVar2 = (z) this.f25013v;
                pe.a.e(obj);
                b0.x(zVar2, null, new fa(this.f25015x, 8, this.f25014w, null), 3);
                return b0.x(zVar2, null, new c0(24, this.f25016y, null), 3);
        }
    }
}
