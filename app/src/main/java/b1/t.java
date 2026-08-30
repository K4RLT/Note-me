package b1;

import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class t implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f1398u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f1399v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f1400w;

    public /* synthetic */ t(int i, Collection collection) {
        this.f1398u = 0;
        this.f1399v = i;
        this.f1400w = collection;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        switch (this.f1398u) {
            case 0:
                return Boolean.valueOf(((List) obj).addAll(this.f1399v, (Collection) this.f1400w));
            case 1:
                ((df.p) this.f1400w).invoke(Integer.valueOf(this.f1399v), (j1.c) obj);
                return pe.z.f22715a;
            default:
                y yVar = (y) this.f1400w;
                z1.x xVar = (z1.x) obj;
                xVar.getClass();
                yVar.put(Integer.valueOf(this.f1399v), xVar);
                return pe.z.f22715a;
        }
    }

    public /* synthetic */ t(Object obj, int i, int i10) {
        this.f1398u = i10;
        this.f1400w = obj;
        this.f1399v = i;
    }
}
