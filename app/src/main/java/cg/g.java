package cg;

import af.j;
import eg.t;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class g implements Iterable, ef.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f4130u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f4131v;

    public /* synthetic */ g(int i, Object obj) {
        this.f4130u = i;
        this.f4131v = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f4130u) {
            case 0:
                return new f((t) this.f4131v);
            case 1:
                return new mf.b((j) this.f4131v);
            default:
                return new f((Iterator) ((df.a) this.f4131v).invoke());
        }
    }
}
