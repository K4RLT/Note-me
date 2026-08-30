package t;
import a0.g;
import q.e;
import q.k;
import q.x;

/* loaded from: classes.dex */
public final class e1 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public int f25381u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f25382v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ float f25383w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ k f25384x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.v f25385y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(float f10, k kVar, kotlin.jvm.internal.v vVar, te.c cVar) {
        super(2, cVar);
        this.f25383w = f10;
        this.f25384x = kVar;
        this.f25385y = vVar;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        e1 e1Var = new e1(this.f25383w, this.f25384x, this.f25385y, cVar);
        e1Var.f25382v = obj;
        return e1Var;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        return ((e1) create((f1) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f25381u;
        if (i != 0) {
            if (i == 1) {
                pe.a.e(obj);
            } else {
                x.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            pe.a.e(obj);
            g gVar = new g(this.f25385y, 14, (f1) this.f25382v);
            this.f25381u = 1;
            Object d2 = e.d(0.0f, this.f25383w, this.f25384x, gVar, this, 4);
            ue.a aVar = ue.a.f27192u;
            if (d2 == aVar) {
                return aVar;
            }
        }
        return pe.z.f22715a;
    }
}
