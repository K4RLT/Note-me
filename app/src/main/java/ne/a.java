package ne;

import g9.n;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements ic.d {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ a f21312v = new a(0);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ a f21313w = new a(1);

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f21314u;

    public /* synthetic */ a(int i) {
        this.f21314u = i;
    }

    @Override // ic.d
    public final Object e(n nVar) {
        switch (this.f21314u) {
            case 0:
                return new d((de.f) nVar.a(de.f.class));
            default:
                return new b((d) nVar.a(d.class), (de.d) nVar.a(de.d.class));
        }
    }
}
