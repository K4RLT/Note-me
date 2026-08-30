package r0;
import b0.f;
import r0.u;
import z0.g;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class p extends u {

    /* renamed from: a, reason: collision with root package name */
    public final long f24311a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f24312b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f24313c;

    /* renamed from: d, reason: collision with root package name */
    public HashSet f24314d;
    public final LinkedHashSet e = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public final i1 f24315f = new i1(g.f31761x, v0.f24419x);

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r f24316g;

    public p(r rVar, long j10, boolean z3, boolean z9, ic.c cVar) {
        this.f24316g = rVar;
        this.f24311a = j10;
        this.f24312b = z3;
        this.f24313c = z9;
    }

    @Override // u
    public final void a(x xVar, df.p pVar) {
        this.f24316g.f24336b.a(xVar, pVar);
    }

    @Override // u
    public final void b() {
        r rVar = this.f24316g;
        rVar.A--;
    }

    @Override // u
    public final boolean c() {
        return this.f24316g.f24336b.c();
    }

    @Override // u
    public final boolean d() {
        return this.f24312b;
    }

    @Override // u
    public final boolean e() {
        return this.f24313c;
    }

    @Override // u
    public final long f() {
        return this.f24311a;
    }

    @Override // u
    public final t g() {
        return this.f24316g.f24341h;
    }

    @Override // u
    public final g h() {
        return (g) this.f24315f.getValue();
    }

    @Override // u
    public final te.g i() {
        return this.f24316g.f24336b.i();
    }

    @Override // u
    public final void j(x xVar) {
        r rVar = this.f24316g;
        rVar.f24336b.j(rVar.f24341h);
        rVar.f24336b.j(xVar);
    }

    @Override // u
    public final y0 k(z0 z0Var) {
        return this.f24316g.f24336b.k(z0Var);
    }

    @Override // u
    public final void l(Set set) {
        HashSet hashSet = this.f24314d;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.f24314d = hashSet;
        }
        hashSet.add(set);
    }

    @Override // u
    public final void m(r rVar) {
        this.e.add(rVar);
    }

    @Override // u
    public final void n(x xVar) {
        this.f24316g.f24336b.n(xVar);
    }

    @Override // u
    public final void o() {
        this.f24316g.A++;
    }

    @Override // u
    public final void p(m mVar) {
        HashSet hashSet = this.f24314d;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                Set set = (Set) it.next();
                mVar.getClass();
                set.remove(((r) mVar).f24337c);
            }
        }
        LinkedHashSet linkedHashSet = this.e;
        if ((linkedHashSet instanceof ef.a) && !(linkedHashSet instanceof ef.b)) {
            kotlin.jvm.internal.f(linkedHashSet, "kotlin.collections.MutableCollection");
            throw null;
        }
        linkedHashSet.remove(mVar);
    }

    @Override // u
    public final void q(x xVar) {
        this.f24316g.f24336b.q(xVar);
    }

    public final void r() {
        LinkedHashSet<r> linkedHashSet = this.e;
        if (!linkedHashSet.isEmpty()) {
            HashSet hashSet = this.f24314d;
            if (hashSet != null) {
                for (r rVar : linkedHashSet) {
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        ((Set) it.next()).remove(rVar.f24337c);
                    }
                }
            }
            linkedHashSet.clear();
        }
    }
}
