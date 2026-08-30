package ea;

/* loaded from: classes.dex */
public final class k implements b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f16015a;

    public k(d dVar) {
        this.f16015a = dVar;
    }

    @Override // ea.b
    public final void a(boolean z3) {
        bb.a aVar = this.f16015a.G;
        aVar.sendMessage(aVar.obtainMessage(1, Boolean.valueOf(z3)));
    }
}
