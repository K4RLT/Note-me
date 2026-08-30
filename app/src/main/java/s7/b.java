package s7;
import c.d;

import pe.z;
import r0.a1;
import w7.n4;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f24992u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ a1 f24993v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a1 f24994w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ a1 f24995x;

    public /* synthetic */ b(int i, a1 a1Var, a1 a1Var2, a1 a1Var3) {
        this.f24992u = i;
        this.f24993v = a1Var;
        this.f24994w = a1Var2;
        this.f24995x = a1Var3;
    }

    @Override // df.a
    public final Object invoke() {
        switch (this.f24992u) {
            case 0:
                f7.d("bee_tapped");
                Boolean bool = Boolean.FALSE;
                this.f24993v.setValue(bool);
                this.f24994w.setValue(Boolean.TRUE);
                this.f24995x.setValue(bool);
                break;
            case 1:
                n4.f(this.f24993v, this.f24994w, this.f24995x);
                break;
            default:
                n4.f(this.f24993v, this.f24994w, this.f24995x);
                break;
        }
        return z.f22715a;
    }
}
