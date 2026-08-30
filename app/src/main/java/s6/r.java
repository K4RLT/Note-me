package s6;

import pe.z;

/* loaded from: classes.dex */
public final class r extends ve.i implements df.q {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f24983u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i, te.c cVar, int i10) {
        super(i, cVar);
        this.f24983u = i10;
    }

    @Override // df.q
    public final Object b(Object obj, Object obj2, Object obj3) {
        switch (this.f24983u) {
            case 0:
                ((Number) obj).intValue();
                new r(3, (te.c) obj3, 0).invokeSuspend(z.f22715a);
                return Boolean.FALSE;
            case 1:
                long j10 = ((j1.b) obj2).f18762a;
                r rVar = new r(3, (te.c) obj3, 1);
                z zVar = z.f22715a;
                rVar.invokeSuspend(zVar);
                return zVar;
            case 2:
                ((Number) obj2).floatValue();
                r rVar2 = new r(3, (te.c) obj3, 2);
                z zVar2 = z.f22715a;
                rVar2.invokeSuspend(zVar2);
                return zVar2;
            default:
                long j11 = ((j1.b) obj2).f18762a;
                r rVar3 = new r(3, (te.c) obj3, 3);
                z zVar3 = z.f22715a;
                rVar3.invokeSuspend(zVar3);
                return zVar3;
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f24983u;
        z zVar = z.f22715a;
        switch (i) {
            case 0:
                pe.a.e(obj);
                return Boolean.FALSE;
            case 1:
                pe.a.e(obj);
                return zVar;
            case 2:
                pe.a.e(obj);
                return zVar;
            default:
                pe.a.e(obj);
                return zVar;
        }
    }
}
