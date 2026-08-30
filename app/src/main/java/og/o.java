package og;

import java.io.IOException;

/* loaded from: classes.dex */
public final class o extends jg.a {

    /* renamed from: w, reason: collision with root package name */
    public final boolean f22030w;

    /* renamed from: x, reason: collision with root package name */
    public final int f22031x;

    /* renamed from: y, reason: collision with root package name */
    public final int f22032y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ r f22033z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(r rVar, boolean z3, int i, int i10) {
        super("OkHttp %s ping %08x%08x", new Object[]{rVar.f22041x, Integer.valueOf(i), Integer.valueOf(i10)});
        this.f22033z = rVar;
        this.f22030w = z3;
        this.f22031x = i;
        this.f22032y = i10;
    }

    @Override // jg.a
    public final void b() {
        boolean z3;
        r rVar = this.f22033z;
        boolean z9 = this.f22030w;
        int i = this.f22031x;
        int i10 = this.f22032y;
        if (!z9) {
            synchronized (rVar) {
                z3 = rVar.E;
                rVar.E = true;
            }
            if (z3) {
                rVar.j();
                return;
            }
        }
        try {
            rVar.L.p(i, i10, z9);
        } catch (IOException unused) {
            rVar.j();
        }
    }
}
