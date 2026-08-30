package sf;

/* loaded from: classes.dex */
public final class t implements h {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f25237u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.y f25238v;

    public /* synthetic */ t(kotlin.jvm.internal.y yVar, int i) {
        this.f25237u = i;
        this.f25238v = yVar;
    }

    @Override // sf.h
    public final Object e(Object obj, te.c cVar) {
        switch (this.f25237u) {
            case 0:
                this.f25238v.f19787u = obj;
                throw new tf.a(this);
            default:
                this.f25238v.f19787u = obj;
                throw new tf.a(this);
        }
    }
}
