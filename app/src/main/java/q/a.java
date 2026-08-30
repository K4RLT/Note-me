package q;
import d.b;
import x.o;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class a extends ve.i implements df.l {
    public final /* synthetic */ long A;

    /* renamed from: u, reason: collision with root package name */
    public l f22835u;

    /* renamed from: v, reason: collision with root package name */
    public kotlin.jvm.internal.u f22836v;

    /* renamed from: w, reason: collision with root package name */
    public int f22837w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ d f22838x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f22839y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ a1 f22840z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, Object obj, a1 a1Var, long j10, te.c cVar) {
        super(1, cVar);
        this.f22838x = dVar;
        this.f22839y = obj;
        this.f22840z = a1Var;
        this.A = j10;
    }

    @Override // ve.a
    public final te.c create(te.c cVar) {
        return new a(this.f22838x, this.f22839y, this.f22840z, this.A, cVar);
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        return ((a) create((te.c) obj)).invokeSuspend(pe.z.f22715a);
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [kotlin.jvm.internal.u, java.lang.Object] */
    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        l lVar;
        kotlin.jvm.internal.u uVar;
        h hVar;
        a1 a1Var = this.f22840z;
        int i = this.f22837w;
        d dVar = this.f22838x;
        try {
            if (i != 0) {
                if (i == 1) {
                    uVar = this.f22836v;
                    lVar = this.f22835u;
                    pe.a.e(obj);
                } else {
                    o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                pe.a.e(obj);
                dVar.f22865c.f22938w = (q) dVar.f22863a.f22943a.invoke(this.f22839y);
                dVar.e.setValue(a1Var.f22843w);
                dVar.f22866d.setValue(Boolean.TRUE);
                l lVar2 = dVar.f22865c;
                l lVar3 = new l(lVar2.f22936u, lVar2.f22937v.getValue(), e.j(lVar2.f22938w), lVar2.f22939x, Long.MIN_VALUE, lVar2.f22941z);
                Object obj2 = new Object();
                long j10 = this.A;
                b2.k0 k0Var = new b2.k0(17, dVar, lVar3, (Object) obj2);
                this.f22835u = lVar3;
                this.f22836v = obj2;
                this.f22837w = 1;
                Object c10 = e.c(lVar3, a1Var, j10, k0Var, this);
                ue.a aVar = ue.a.f27192u;
                if (c10 == aVar) {
                    return aVar;
                }
                lVar = lVar3;
                uVar = obj2;
            }
            if (uVar.f19783u) {
                hVar = h.f22911u;
            } else {
                hVar = h.f22912v;
            }
            b(dVar);
            return new i(lVar, hVar);
        } catch (CancellationException e) {
            b(dVar);
            throw e;
        }
    }
}