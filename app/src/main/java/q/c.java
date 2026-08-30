package q;
import d.b;

/* loaded from: classes.dex */
public final class c extends ve.i implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ d f22855u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, te.c cVar) {
        super(1, cVar);
        this.f22855u = dVar;
    }

    @Override // ve.a
    public final te.c create(te.c cVar) {
        return new c(this.f22855u, cVar);
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        c cVar = (c) create((te.c) obj);
        pe.z zVar = pe.z.f22715a;
        cVar.invokeSuspend(zVar);
        return zVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        pe.a.e(obj);
        b(this.f22855u);
        return pe.z.f22715a;
    }
}
