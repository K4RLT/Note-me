package ve;

import q.x;

/* loaded from: classes.dex */
public abstract class g extends a {
    public g(te.c cVar) {
        super(cVar);
        if (cVar != null && cVar.getContext() != te.h.f25707u) {
            x.n("Coroutines with restricted suspension must have EmptyCoroutineContext");
            throw null;
        }
    }

    @Override // te.c
    public te.g getContext() {
        return te.h.f25707u;
    }
}
