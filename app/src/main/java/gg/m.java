package gg;

import q.x;

/* loaded from: classes.dex */
public final class m extends a {

    /* renamed from: f, reason: collision with root package name */
    public final fg.m f17775f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(fg.c cVar, fg.m mVar, String str) {
        super(cVar, str);
        cVar.getClass();
        mVar.getClass();
        this.f17775f = mVar;
        this.f17756a.add("primitive");
    }

    @Override // gg.a
    public final fg.m D(String str) {
        str.getClass();
        if (str == "primitive") {
            return this.f17775f;
        }
        x.n("This input can only handle primitives with 'primitive' tag");
        return null;
    }

    @Override // gg.a
    public final fg.m R() {
        return this.f17775f;
    }

    @Override // dg.a
    public final int t(cg.d dVar) {
        dVar.getClass();
        return 0;
    }
}
