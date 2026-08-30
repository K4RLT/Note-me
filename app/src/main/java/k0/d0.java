package k0;
import j1.b;
import k0.o;
import l.a;

/* loaded from: classes.dex */
public final /* synthetic */ class d0 implements o, kotlin.jvm.internal.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ df.a f19253a;

    public d0(df.a aVar) {
        this.f19253a = aVar;
    }

    @Override // o
    public final /* synthetic */ long a() {
        return ((b) this.f19253a.invoke()).f18762a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof o) && (obj instanceof kotlin.jvm.internal.g)) {
            return kotlin.jvm.internal.a(this.f19253a, ((kotlin.jvm.internal.g) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.g
    public final pe.d getFunctionDelegate() {
        return this.f19253a;
    }

    public final int hashCode() {
        return this.f19253a.hashCode();
    }
}
