package j7;

import pe.z;
import q.x;
import ya.c0;

/* loaded from: classes.dex */
public final class o extends ve.i implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public int f19028u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ q f19029v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f19030w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f19031x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ long f19032y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(q qVar, String str, String str2, long j10, te.c cVar) {
        super(1, cVar);
        this.f19029v = qVar;
        this.f19030w = str;
        this.f19031x = str2;
        this.f19032y = j10;
    }

    @Override // ve.a
    public final te.c create(te.c cVar) {
        return new o(this.f19029v, this.f19030w, this.f19031x, this.f19032y, cVar);
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        return ((o) create((te.c) obj)).invokeSuspend(z.f22715a);
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f19028u;
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
        this.f19028u = 1;
        Object c10 = c0.c(new h7.a(this.f19032y, this.f19031x, this.f19030w), this.f19029v.f19034a, this, false, true);
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
