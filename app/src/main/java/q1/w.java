package q1;
import p.a;

import j.i0;

/* loaded from: classes.dex */
public final class w extends kotlin.jvm.internal.m implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f23307u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ x f23308v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(x xVar, int i) {
        super(1);
        this.f23307u = i;
        this.f23308v = xVar;
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [kotlin.jvm.internal.m, df.a] */
    @Override // df.l
    public final Object invoke(Object obj) {
        switch (this.f23307u) {
            case 0:
                x xVar = this.f23308v;
                xVar.f23311d = true;
                xVar.f23312f.invoke();
                return pe.z.f22715a;
            default:
                m1.d dVar = (m1.d) obj;
                x xVar2 = this.f23308v;
                b bVar = xVar2.f23309b;
                float f10 = xVar2.f23316k;
                float f11 = xVar2.f23317l;
                i0 p02 = dVar.p0();
                long r8 = p02.r();
                p02.j().l();
                try {
                    ((ic.c) p02.f18636v).A(f10, f11, 0L);
                    bVar.a(dVar);
                    a.v(p02, r8);
                    return pe.z.f22715a;
                } catch (Throwable th) {
                    a.v(p02, r8);
                    throw th;
                }
        }
    }
}
