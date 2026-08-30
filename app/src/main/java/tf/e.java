package tf;
import l.a;

import java.util.ArrayList;
import pe.z;
import pf.b0;
import t.m1;

/* loaded from: classes.dex */
public abstract class e implements p {

    /* renamed from: u, reason: collision with root package name */
    public final te.g f25719u;

    /* renamed from: v, reason: collision with root package name */
    public final int f25720v;

    /* renamed from: w, reason: collision with root package name */
    public final rf.a f25721w;

    public e(te.g gVar, int i, rf.a aVar) {
        this.f25719u = gVar;
        this.f25720v = i;
        this.f25721w = aVar;
    }

    @Override // tf.p
    public final sf.g a(te.g gVar, int i, rf.a aVar) {
        te.g gVar2 = this.f25719u;
        te.g V = gVar.V(gVar2);
        rf.a aVar2 = rf.a.f24769u;
        rf.a aVar3 = this.f25721w;
        int i10 = this.f25720v;
        if (aVar == aVar2) {
            if (i10 != -3) {
                if (i != -3) {
                    if (i10 != -2) {
                        if (i != -2) {
                            i += i10;
                            if (i < 0) {
                                i = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i = i10;
            }
            aVar = aVar3;
        }
        if (kotlin.jvm.internal.a(V, gVar2) && i == i10 && aVar == aVar3) {
            return this;
        }
        return d(V, i, aVar);
    }

    @Override // sf.g
    public Object b(sf.h hVar, te.c cVar) {
        Object i = b0.i(new m1(hVar, this, (te.c) null, 4), cVar);
        if (i == ue.a.f27192u) {
            return i;
        }
        return z.f22715a;
    }

    public abstract Object c(rf.t tVar, te.c cVar);

    public abstract e d(te.g gVar, int i, rf.a aVar);

    public sf.g e() {
        return null;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        te.h hVar = te.h.f25707u;
        te.g gVar = this.f25719u;
        if (gVar != hVar) {
            arrayList.add("context=" + gVar);
        }
        int i = this.f25720v;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        rf.a aVar = rf.a.f24769u;
        rf.a aVar2 = this.f25721w;
        if (aVar2 != aVar) {
            arrayList.add("onBufferOverflow=" + aVar2);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append('[');
        return a.n(sb2, qe.l.B(arrayList, ", ", null, null, null, 62), ']');
    }
}
