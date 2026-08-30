package n8;

import java.util.Set;

/* loaded from: classes.dex */
public final class o implements k8.f {

    /* renamed from: a, reason: collision with root package name */
    public final Set f21194a;

    /* renamed from: b, reason: collision with root package name */
    public final i f21195b;

    /* renamed from: c, reason: collision with root package name */
    public final q f21196c;

    public o(Set set, i iVar, q qVar) {
        this.f21194a = set;
        this.f21195b = iVar;
        this.f21196c = qVar;
    }

    public final p a(String str, k8.c cVar, k8.e eVar) {
        Set set = this.f21194a;
        if (set.contains(cVar)) {
            return new p(this.f21195b, str, cVar, eVar, this.f21196c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
    }
}
