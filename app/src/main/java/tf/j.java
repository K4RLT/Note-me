package tf;

import pe.z;
import pf.b0;

/* loaded from: classes.dex */
public final class j extends f {

    /* renamed from: y, reason: collision with root package name */
    public final ve.i f25733y;

    /* JADX WARN: Multi-variable type inference failed */
    public j(df.q qVar, sf.g gVar, te.g gVar2, int i, rf.a aVar) {
        super(gVar, gVar2, i, aVar);
        this.f25733y = (ve.i) qVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [df.q, ve.i] */
    @Override // tf.e
    public final e d(te.g gVar, int i, rf.a aVar) {
        return new j(this.f25733y, this.f25722x, gVar, i, aVar);
    }

    @Override // tf.f
    public final Object f(sf.h hVar, te.c cVar) {
        Object i = b0.i(new h(this, hVar, null), cVar);
        if (i == ue.a.f27192u) {
            return i;
        }
        return z.f22715a;
    }
}
