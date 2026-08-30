package d;
import f.g;

import pe.z;
import q.x;
import wa.j6;

/* loaded from: classes.dex */
public final class i extends j6 {

    /* renamed from: a, reason: collision with root package name */
    public final a f15648a;

    public i(a aVar) {
        this.f15648a = aVar;
    }

    @Override // wa.j6
    public final void a(Object obj) {
        z zVar;
        g gVar = this.f15648a.f15632a;
        if (gVar != null) {
            gVar.a(obj);
            zVar = z.f22715a;
        } else {
            zVar = null;
        }
        if (zVar != null) {
            return;
        }
        x.o("Launcher has not been initialized");
    }
}
