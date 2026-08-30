package sf;

/* loaded from: classes.dex */
public final class f implements g {

    /* renamed from: u, reason: collision with root package name */
    public final g f25168u;

    public f(g gVar) {
        this.f25168u = gVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.jvm.internal.y] */
    @Override // sf.g
    public final Object b(h hVar, te.c cVar) {
        Object obj = new Object();
        obj.f19787u = tf.c.f25716b;
        Object b10 = this.f25168u.b(new e(this, obj, hVar), cVar);
        if (b10 == ue.a.f27192u) {
            return b10;
        }
        return pe.z.f22715a;
    }
}