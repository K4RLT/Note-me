package o0;
import a0.m;
import k1.r;
import k1.u;

/* loaded from: classes.dex */
public final /* synthetic */ class t1 implements u, kotlin.jvm.internal.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f21689a;

    public t1(m mVar) {
        this.f21689a = mVar;
    }

    @Override // u
    public final long a() {
        return ((r) this.f21689a.get()).f19523a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof u) && (obj instanceof kotlin.jvm.internal.g)) {
            return this.f21689a.equals(((kotlin.jvm.internal.g) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.g
    public final pe.d getFunctionDelegate() {
        return this.f21689a;
    }

    public final int hashCode() {
        return this.f21689a.hashCode();
    }
}
