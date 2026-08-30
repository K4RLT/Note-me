package a1;
import n.i0;
import p.p;

import b1.v;
import java.util.Map;

/* loaded from: classes.dex */
public final class k implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f206a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f207b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f208c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f209d;

    public /* synthetic */ k(int i, Object obj, Object obj2, Object obj3) {
        this.f206a = i;
        this.f208c = obj;
        this.f207b = obj2;
        this.f209d = obj3;
    }

    @Override // r0.i0
    public final void a() {
        switch (this.f206a) {
            case 0:
                l lVar = (l) this.f208c;
                i0 i0Var = lVar.f212v;
                Object obj = this.f207b;
                Object k3 = i0Var.k(obj);
                r rVar = (r) this.f209d;
                if (k3 == rVar) {
                    Map map = lVar.f211u;
                    Map c10 = rVar.c();
                    if (c10.isEmpty()) {
                        map.remove(obj);
                        return;
                    } else {
                        map.put(obj, c10);
                        return;
                    }
                }
                return;
            default:
                v vVar = (v) this.f208c;
                Object obj2 = this.f207b;
                vVar.remove(obj2);
                ((p) this.f209d).f22222c.k(obj2);
                return;
        }
    }
}
