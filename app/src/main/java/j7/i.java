package j7;

import b8.x7;
import pe.z;
import q.x;
import ya.c0;

/* loaded from: classes.dex */
public final class i extends ve.i implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public int f19008u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ l f19009v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f19010w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(int i, l lVar, te.c cVar) {
        super(1, cVar);
        this.f19009v = lVar;
        this.f19010w = i;
    }

    @Override // ve.a
    public final te.c create(te.c cVar) {
        return new i(this.f19010w, this.f19009v, cVar);
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        return ((i) create((te.c) obj)).invokeSuspend(z.f22715a);
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f19008u;
        z zVar = z.f22715a;
        if (i != 0) {
            if (i == 1) {
                pe.a.e(obj);
                return zVar;
            }
            x.o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        pe.a.e(obj);
        this.f19008u = 1;
        Object c10 = c0.c(new x7(this.f19010w, 4), this.f19009v.f19018a, this, false, true);
        ue.a aVar = ue.a.f27192u;
        if (c10 != aVar) {
            c10 = zVar;
        }
        if (c10 == aVar) {
            return aVar;
        }
        return zVar;
    }
}
