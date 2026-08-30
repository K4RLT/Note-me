package u7;
import m3.e;
import q.x;

import android.content.Context;

/* loaded from: classes.dex */
public final class a3 extends ve.i implements df.p {
    public final /* synthetic */ Integer A;

    /* renamed from: u, reason: collision with root package name */
    public int f25896u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ m3 f25897v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f25898w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ long f25899x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f25900y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Context f25901z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(m3 m3Var, String str, long j10, String str2, Context context, Integer num, te.c cVar) {
        super(2, cVar);
        this.f25897v = m3Var;
        this.f25898w = str;
        this.f25899x = j10;
        this.f25900y = str2;
        this.f25901z = context;
        this.A = num;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        return new a3(this.f25897v, this.f25898w, this.f25899x, this.f25900y, this.f25901z, this.A, cVar);
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        return ((a3) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f25896u;
        if (i != 0) {
            if (i == 1) {
                pe.a.e(obj);
            } else {
                x.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            pe.a.e(obj);
            this.f25896u = 1;
            Object e = e(this.f25897v, this.f25898w, 1, this.f25899x, this.f25900y, this.f25901z, this.A, "none", null, this);
            ue.a aVar = ue.a.f27192u;
            if (e == aVar) {
                return aVar;
            }
        }
        return pe.z.f22715a;
    }
}
