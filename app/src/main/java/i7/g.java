package i7;

import df.r;
import pe.z;
import pf.b0;
import q.x;
import ve.i;
import wa.f8;

/* loaded from: classes.dex */
public final class g extends i implements r {

    /* renamed from: u, reason: collision with root package name */
    public int f18337u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Throwable f18338v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ long f18339w;

    /* JADX WARN: Type inference failed for: r3v2, types: [i7.g, ve.i] */
    @Override // df.r
    public final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
        long longValue = ((Number) obj3).longValue();
        i iVar = new i(4, (te.c) obj4);
        iVar.f18338v = (Throwable) obj2;
        iVar.f18339w = longValue;
        return iVar.invokeSuspend(z.f22715a);
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        Throwable th = this.f18338v;
        long j10 = this.f18339w;
        int i = this.f18337u;
        boolean z3 = true;
        if (i != 0) {
            if (i == 1) {
                pe.a.e(obj);
            } else {
                x.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            pe.a.e(obj);
            if (j10 < 4 && f8.a(th)) {
                this.f18338v = null;
                this.f18339w = j10;
                this.f18337u = 1;
                Object j11 = b0.j((1 + j10) * 500, this);
                ue.a aVar = ue.a.f27192u;
                if (j11 == aVar) {
                    return aVar;
                }
            } else {
                z3 = false;
            }
        }
        return Boolean.valueOf(z3);
    }
}