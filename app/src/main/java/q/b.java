package q;
import d.a;
import d.b;

/* loaded from: classes.dex */
public final class b extends ve.i implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ d f22847u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f22848v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, Object obj, te.c cVar) {
        super(1, cVar);
        this.f22847u = dVar;
        this.f22848v = obj;
    }

    @Override // ve.a
    public final te.c create(te.c cVar) {
        return new b(this.f22847u, this.f22848v, cVar);
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        b bVar = (b) create((te.c) obj);
        pe.z zVar = pe.z.f22715a;
        bVar.invokeSuspend(zVar);
        return zVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        pe.a.e(obj);
        d dVar = this.f22847u;
        d.b(dVar);
        Object a10 = a(dVar, this.f22848v);
        dVar.f22865c.f22937v.setValue(a10);
        dVar.e.setValue(a10);
        return pe.z.f22715a;
    }
}
