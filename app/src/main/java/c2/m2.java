package c2;
import n.j;
import j2.n;
import n.k;
import n.x;

import java.util.List;

/* loaded from: classes.dex */
public final class m2 {

    /* renamed from: a, reason: collision with root package name */
    public final j f3578a;

    /* renamed from: b, reason: collision with root package name */
    public final x f3579b;

    public m2(n nVar, k kVar) {
        this.f3578a = nVar.f18823d;
        this.f3579b = new x(n.j(4, nVar).size());
        List j10 = n.j(4, nVar);
        int size = j10.size();
        for (int i = 0; i < size; i++) {
            n nVar2 = (n) j10.get(i);
            if (kVar.a(nVar2.f18825g)) {
                this.f3579b.a(nVar2.f18825g);
            }
        }
    }
}
