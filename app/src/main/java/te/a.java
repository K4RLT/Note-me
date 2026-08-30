package te;

import df.p;
import ya.lc;

/* loaded from: classes.dex */
public abstract class a implements e {

    /* renamed from: u, reason: collision with root package name */
    public final f f25703u;

    public a(f fVar) {
        this.f25703u = fVar;
    }

    @Override // te.g
    public final Object H(p pVar, Object obj) {
        return pVar.invoke(obj, this);
    }

    @Override // te.g
    public /* bridge */ e L(f fVar) {
        return lc.a(this, fVar);
    }

    @Override // te.g
    public /* bridge */ g N(f fVar) {
        return lc.b(this, fVar);
    }

    @Override // te.g
    public final /* bridge */ g V(g gVar) {
        return lc.c(this, gVar);
    }

    @Override // te.e
    public final f getKey() {
        return this.f25703u;
    }
}
