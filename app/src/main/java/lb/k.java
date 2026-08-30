package lb;
import z.a;

import android.os.Bundle;
import com.google.android.play.core.assetpacks.bn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class k extends i {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f20173x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ o f20174y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(o oVar, ib.h hVar, int i) {
        super(oVar, hVar);
        this.f20173x = i;
        this.f20174y = oVar;
    }

    @Override // lb.i
    public void T1(List list) {
        switch (this.f20173x) {
            case 0:
                super.T1(list);
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Bundle bundle = (Bundle) it.next();
                    o oVar = this.f20174y;
                    bn bnVar = (bn) a(bundle, oVar.f20216b, oVar.f20217c, t.f20275w).f20316b.values().iterator().next();
                    if (bnVar == null) {
                        o.f20213g.c("onGetSessionStates: Bundle contained no pack.", new Object[0]);
                    }
                    int i = bnVar.f15576b;
                    if (i == 1 || i == 7 || i == 2 || i == 9 || i == 3) {
                        arrayList.add(bnVar.f15575a);
                    }
                }
                this.f20157v.d(arrayList);
                return;
            default:
                super.T1(list);
                return;
        }
    }

    @Override // lb.i
    public void g2(Bundle bundle, Bundle bundle2) {
        switch (this.f20173x) {
            case 1:
                super.g2(bundle, bundle2);
                o oVar = this.f20174y;
                if (!oVar.f20219f.compareAndSet(true, false)) {
                    o.f20213g.g("Expected keepingAlive to be true, but was false.", new Object[0]);
                }
                if (bundle.getBoolean("keep_alive")) {
                    oVar.f();
                    return;
                }
                return;
            default:
                super.g2(bundle, bundle2);
                return;
        }
    }

    @Override // lb.i
    public void v1(Bundle bundle) {
        switch (this.f20173x) {
            case 1:
                mb.n nVar = this.f20174y.e;
                ib.h hVar = this.f20157v;
                nVar.d(hVar);
                int i = bundle.getInt("error_code");
                o.f20213g.c("onError(%d)", Integer.valueOf(i));
                hVar.c(new da.k(i, 1));
                return;
            default:
                super.v1(bundle);
                return;
        }
    }
}
