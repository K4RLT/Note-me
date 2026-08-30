package t;
import x.o;
import a.a;
import q.d;
import q.x;

import wa.b9;

/* loaded from: classes.dex */
public final class q1 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f25495u;

    /* renamed from: v, reason: collision with root package name */
    public int f25496v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ float f25497w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ float f25498x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f25499y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q1(Object obj, float f10, float f11, te.c cVar, int i) {
        super(2, cVar);
        this.f25495u = i;
        this.f25499y = obj;
        this.f25497w = f10;
        this.f25498x = f11;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f25495u) {
            case 0:
                return new q1((r1) this.f25499y, this.f25497w, this.f25498x, cVar, 0);
            default:
                return new q1((d) this.f25499y, this.f25497w, this.f25498x, cVar, 1);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        pf.z zVar = (pf.z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f25495u) {
            case 0:
                return ((q1) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            default:
                return ((q1) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f25495u) {
            case 0:
                int i = this.f25496v;
                if (i != 0) {
                    if (i == 1) {
                        pe.a.e(obj);
                    } else {
                        x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    this.f25496v = 1;
                    Object a10 = androidx.compose.foundation.gestures.a(((r1) this.f25499y).X, (Float.floatToRawIntBits(this.f25497w) << 32) | (Float.floatToRawIntBits(this.f25498x) & 4294967295L), this);
                    ue.a aVar = ue.a.f27192u;
                    if (a10 == aVar) {
                        return aVar;
                    }
                }
                return pe.z.f22715a;
            default:
                d dVar = (d) this.f25499y;
                int i10 = this.f25496v;
                if (i10 != 0) {
                    if (i10 == 1) {
                        pe.a.e(obj);
                    } else {
                        x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    Float f10 = new Float(b9.d(((Number) dVar.e()).floatValue() + this.f25497w, 0.0f, this.f25498x));
                    this.f25496v = 1;
                    Object g8 = dVar.g(f10, this);
                    ue.a aVar2 = ue.a.f27192u;
                    if (g8 == aVar2) {
                        return aVar2;
                    }
                }
                return pe.z.f22715a;
        }
    }
}
