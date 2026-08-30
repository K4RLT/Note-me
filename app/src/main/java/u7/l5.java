package u7;
import q.d;
import q.x;

import wa.b9;

/* loaded from: classes.dex */
public final class l5 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public int f26490u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ d f26491v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ float f26492w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ float f26493x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ float f26494y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(d dVar, float f10, float f11, float f12, te.c cVar) {
        super(2, cVar);
        this.f26491v = dVar;
        this.f26492w = f10;
        this.f26493x = f11;
        this.f26494y = f12;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        return new l5(this.f26491v, this.f26492w, this.f26493x, this.f26494y, cVar);
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        return ((l5) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f26490u;
        if (i != 0) {
            if (i == 1) {
                pe.a.e(obj);
            } else {
                x.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            pe.a.e(obj);
            d dVar = this.f26491v;
            Float f10 = new Float(b9.d(((Number) dVar.e()).floatValue() - (this.f26492w * this.f26493x), 0.0f, this.f26494y));
            this.f26490u = 1;
            Object g8 = dVar.g(f10, this);
            ue.a aVar = ue.a.f27192u;
            if (g8 == aVar) {
                return aVar;
            }
        }
        return pe.z.f22715a;
    }
}
