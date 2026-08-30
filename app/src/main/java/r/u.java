package r;
import j1.b;

import c2.p1;

/* loaded from: classes.dex */
public final class u extends kotlin.jvm.internal.m implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f24146u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ v f24147v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(v vVar, int i) {
        super(1);
        this.f24146u = i;
        this.f24147v = vVar;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        switch (this.f24146u) {
            case 0:
                long j10 = ((b) obj).f18762a;
                v vVar = this.f24147v;
                df.a aVar = vVar.f24151b0;
                if (aVar != null) {
                    aVar.invoke();
                }
                if (vVar.f24152c0) {
                    ((r1.a) b2.l.h(vVar, p1.f3609l)).a(0);
                }
                return pe.z.f22715a;
            default:
                long j11 = ((b) obj).f18762a;
                v vVar2 = this.f24147v;
                if (vVar2.O) {
                    vVar2.P.invoke();
                }
                return pe.z.f22715a;
        }
    }
}
