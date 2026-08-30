package y3;
import q.x;

/* loaded from: classes.dex */
public final class e extends ve.i implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public int f30830u;

    @Override // ve.a
    public final te.c create(te.c cVar) {
        return new ve.i(1, cVar);
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        e eVar = (e) create((te.c) obj);
        pe.z zVar = pe.z.f22715a;
        eVar.invokeSuspend(zVar);
        return zVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f30830u;
        if (i != 0) {
            if (i == 1) {
                pe.a.e(obj);
                return pe.z.f22715a;
            }
            x.o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        pe.a.e(obj);
        this.f30830u = 1;
        throw null;
    }
}
