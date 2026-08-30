package z7;
import c.o;

import pf.z;

/* loaded from: classes.dex */
public final class j extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f31960u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(boolean z3, te.c cVar) {
        super(2, cVar);
        this.f31960u = z3;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        return new j(this.f31960u, cVar);
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        j jVar = (j) create((z) obj, (te.c) obj2);
        pe.z zVar = pe.z.f22715a;
        jVar.invokeSuspend(zVar);
        return zVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        pe.a.e(obj);
        if (this.f31960u) {
            f7.o("help");
        }
        return pe.z.f22715a;
    }
}
