package s7;

import df.p;
import pf.b0;
import pf.z;

/* loaded from: classes.dex */
public final class f extends ve.i implements p {

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f25006u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ q.d f25007v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ float f25008w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f25009x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ q.d f25010y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ float f25011z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(q.d dVar, float f10, int i, q.d dVar2, float f11, te.c cVar) {
        super(2, cVar);
        this.f25007v = dVar;
        this.f25008w = f10;
        this.f25009x = i;
        this.f25010y = dVar2;
        this.f25011z = f11;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        f fVar = new f(this.f25007v, this.f25008w, this.f25009x, this.f25010y, this.f25011z, cVar);
        fVar.f25006u = obj;
        return fVar;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        z zVar = (z) this.f25006u;
        pe.a.e(obj);
        q.d dVar = this.f25007v;
        float f10 = this.f25008w;
        int i = this.f25009x;
        b0.x(zVar, null, new e(dVar, f10, i, null, 0), 3);
        return b0.x(zVar, null, new e(this.f25010y, this.f25011z, i, null, 1), 3);
    }
}
