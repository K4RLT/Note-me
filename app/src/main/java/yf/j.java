package yf;

import java.util.concurrent.atomic.AtomicReferenceArray;
import uf.r;

/* loaded from: classes.dex */
public final class j extends r {

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f31656y;

    public j(long j10, j jVar, int i) {
        super(j10, jVar, i);
        this.f31656y = new AtomicReferenceArray(i.f31655f);
    }

    @Override // uf.r
    public final int g() {
        return i.f31655f;
    }

    @Override // uf.r
    public final void h(int i, te.g gVar) {
        this.f31656y.set(i, i.e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f27239w + ", hashCode=" + hashCode() + ']';
    }
}
