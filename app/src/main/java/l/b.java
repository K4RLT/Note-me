package l;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class b extends e implements Iterator {

    /* renamed from: u, reason: collision with root package name */
    public c f19790u;

    /* renamed from: v, reason: collision with root package name */
    public c f19791v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f19792w;

    public b(c cVar, c cVar2, int i) {
        this.f19792w = i;
        this.f19790u = cVar2;
        this.f19791v = cVar;
    }

    @Override // l.e
    public final void a(c cVar) {
        c cVar2;
        c cVar3 = null;
        if (this.f19790u == cVar && cVar == this.f19791v) {
            this.f19791v = null;
            this.f19790u = null;
        }
        c cVar4 = this.f19790u;
        if (cVar4 == cVar) {
            switch (this.f19792w) {
                case 0:
                    cVar2 = cVar4.f19796x;
                    break;
                default:
                    cVar2 = cVar4.f19795w;
                    break;
            }
            this.f19790u = cVar2;
        }
        c cVar5 = this.f19791v;
        if (cVar5 == cVar) {
            c cVar6 = this.f19790u;
            if (cVar5 != cVar6 && cVar6 != null) {
                cVar3 = b(cVar5);
            }
            this.f19791v = cVar3;
        }
    }

    public final c b(c cVar) {
        switch (this.f19792w) {
            case 0:
                return cVar.f19795w;
            default:
                return cVar.f19796x;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f19791v != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar;
        c cVar2 = this.f19791v;
        c cVar3 = this.f19790u;
        if (cVar2 != cVar3 && cVar3 != null) {
            cVar = b(cVar2);
        } else {
            cVar = null;
        }
        this.f19791v = cVar;
        return cVar2;
    }
}
