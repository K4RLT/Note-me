package s7;
import d.c;

import df.p;
import pf.z;
import q.k1;
import q.r0;
import q.x;
import q.y;
import u7.v1;

/* loaded from: classes.dex */
public final class e extends ve.i implements p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f25001u;

    /* renamed from: v, reason: collision with root package name */
    public int f25002v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q.d f25003w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ float f25004x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f25005y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(float f10, int i, q.d dVar, te.c cVar) {
        super(2, cVar);
        this.f25001u = 2;
        this.f25003w = dVar;
        this.f25005y = i;
        this.f25004x = f10;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f25001u) {
            case 0:
                return new e(this.f25003w, this.f25004x, this.f25005y, cVar, 0);
            case 1:
                return new e(this.f25003w, this.f25004x, this.f25005y, cVar, 1);
            default:
                return new e(this.f25004x, this.f25005y, this.f25003w, cVar);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f25001u) {
            case 0:
                return ((e) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            case 1:
                return ((e) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            default:
                return ((e) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f25001u) {
            case 0:
                int i = this.f25002v;
                if (i != 0) {
                    if (i == 1) {
                        pe.a.e(obj);
                    } else {
                        x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    Float f10 = new Float(this.f25004x);
                    k1 s10 = q.e.s(this.f25005y, 0, y.f23031a, 2);
                    this.f25002v = 1;
                    Object c10 = q.c(this.f25003w, f10, s10, this);
                    ue.a aVar = ue.a.f27192u;
                    if (c10 == aVar) {
                        return aVar;
                    }
                }
                return pe.z.f22715a;
            case 1:
                int i10 = this.f25002v;
                if (i10 != 0) {
                    if (i10 == 1) {
                        pe.a.e(obj);
                    } else {
                        x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    Float f11 = new Float(this.f25004x);
                    k1 s11 = q.e.s((int) (this.f25005y * 0.8f), 0, y.f23034d, 2);
                    this.f25002v = 1;
                    Object c11 = q.c(this.f25003w, f11, s11, this);
                    ue.a aVar2 = ue.a.f27192u;
                    if (c11 == aVar2) {
                        return aVar2;
                    }
                }
                return pe.z.f22715a;
            default:
                int i11 = this.f25002v;
                if (i11 != 0) {
                    if (i11 == 1) {
                        pe.a.e(obj);
                    } else {
                        x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    Float f12 = new Float(this.f25005y);
                    r0 f13 = v1.f(this.f25004x);
                    this.f25002v = 1;
                    Object c12 = q.c(this.f25003w, f12, f13, this);
                    ue.a aVar3 = ue.a.f27192u;
                    if (c12 == aVar3) {
                        return aVar3;
                    }
                }
                return pe.z.f22715a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(q.d dVar, float f10, int i, te.c cVar, int i10) {
        super(2, cVar);
        this.f25001u = i10;
        this.f25003w = dVar;
        this.f25004x = f10;
        this.f25005y = i;
    }
}
