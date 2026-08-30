package r;
import j1.c;
import k1.f;
import k1.l;
import k1.s;
import m1.b;
import m1.d;

/* loaded from: classes.dex */
public final class l extends kotlin.jvm.internal.m implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ c f24110u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.y f24111v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ long f24112w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ s f24113x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(c cVar, kotlin.jvm.internal.y yVar, long j10, k1.l lVar) {
        super(1);
        this.f24110u = cVar;
        this.f24111v = yVar;
        this.f24112w = j10;
        this.f24113x = lVar;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        float f10;
        float f11;
        b bVar;
        b2.l0 l0Var = (b2.l0) obj;
        l0Var.b();
        c cVar = this.f24110u;
        float f12 = cVar.f18763a;
        float f13 = cVar.f18764b;
        kotlin.jvm.internal.y yVar = this.f24111v;
        long j10 = this.f24112w;
        s sVar = this.f24113x;
        b bVar2 = l0Var.f1533u;
        ((ic.c) bVar2.f20424v.f18636v).D(f12, f13);
        try {
            bVar = bVar2;
            try {
                d.I0(l0Var, (f) yVar.f19787u, 0L, j10, 0L, 0L, 0.0f, sVar, 0, 890);
                ((ic.c) bVar.f20424v.f18636v).D(-f12, -f13);
                return pe.z.f22715a;
            } catch (Throwable th) {
                th = th;
                f10 = f12;
                f11 = f13;
                ((ic.c) bVar.f20424v.f18636v).D(-f10, -f11);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            f10 = f12;
            f11 = f13;
            bVar = bVar2;
        }
    }
}
