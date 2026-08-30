package u7;
import z.e;
import z0.c;

import android.content.Context;

/* loaded from: classes.dex */
public final /* synthetic */ class y implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f27046u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ v7.d f27047v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Context f27048w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ m3 f27049x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f27050y;

    public /* synthetic */ y(v7.d dVar, Context context, m3 m3Var, int i) {
        this.f27046u = 1;
        this.f27047v = dVar;
        this.f27048w = context;
        this.f27049x = m3Var;
        this.f27050y = i;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        e eVar = (e) obj;
        switch (this.f27046u) {
            case 0:
                eVar.getClass();
                v7.d dVar = this.f27047v;
                e.p(eVar, dVar.f27418o.size(), null, new c(-865043662, new e0(dVar, this.f27049x, this.f27050y, this.f27048w, 0), true), 6);
                break;
            case 1:
                eVar.getClass();
                e.p(eVar, w0.f26985b.size(), null, new c(1345309793, new e0(this.f27047v, this.f27048w, this.f27049x, this.f27050y), true), 6);
                break;
            default:
                eVar.getClass();
                e.p(eVar, z0.f27082b.size() + 1, null, new c(-841392546, new e0(this.f27047v, this.f27049x, this.f27050y, this.f27048w, 1), true), 6);
                break;
        }
        return pe.z.f22715a;
    }

    public /* synthetic */ y(v7.d dVar, m3 m3Var, int i, Context context, int i10) {
        this.f27046u = i10;
        this.f27047v = dVar;
        this.f27049x = m3Var;
        this.f27050y = i;
        this.f27048w = context;
    }
}
