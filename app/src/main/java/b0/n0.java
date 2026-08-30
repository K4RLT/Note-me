package b0;

/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final kotlin.jvm.internal.m f1234a;

    /* renamed from: b, reason: collision with root package name */
    public final j6.i f1235b = new j6.i(1);

    /* renamed from: c, reason: collision with root package name */
    public ra.e f1236c;

    /* JADX WARN: Multi-variable type inference failed */
    public n0(df.l lVar) {
        this.f1234a = (kotlin.jvm.internal.m) lVar;
    }

    public final m0 a(int i, long j10) {
        ra.e eVar = this.f1236c;
        if (eVar != null) {
            i1 i1Var = new i1(eVar, i, j10, this.f1235b);
            ((j1) eVar.f24677x).c(i1Var);
            return i1Var;
        }
        return h.f1193a;
    }
}
