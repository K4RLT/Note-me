package j7;
import p.a;

import java.util.Iterator;
import java.util.List;
import pe.z;
import w7.a5;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f18995u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f18996v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ List f18997w;

    public /* synthetic */ d(int i, String str, List list) {
        this.f18995u = i;
        this.f18996v = str;
        this.f18997w = list;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        switch (this.f18995u) {
            case 0:
                List list = this.f18997w;
                p5.a aVar = (p5.a) obj;
                aVar.getClass();
                p5.c T = aVar.T(this.f18996v);
                try {
                    Iterator it = list.iterator();
                    int i = 1;
                    while (it.hasNext()) {
                        T.s(i, (String) it.next());
                        i++;
                    }
                    T.P();
                    T.close();
                    return z.f22715a;
                } catch (Throwable th) {
                    T.close();
                    throw th;
                }
            default:
                return a.l("frame_", this.f18996v, "_", ((a5) this.f18997w.get(((Integer) obj).intValue())).f27868a);
        }
    }
}
