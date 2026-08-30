package b0;

import java.util.Comparator;
import ya.ac;

/* loaded from: classes.dex */
public final class t implements Comparator {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f1256u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ e1 f1257v;

    public /* synthetic */ t(e1 e1Var, int i) {
        this.f1256u = i;
        this.f1257v = e1Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f1256u) {
            case 0:
                Object key = ((d0) obj).getKey();
                e1 e1Var = this.f1257v;
                return ac.a(Integer.valueOf(e1Var.d(key)), Integer.valueOf(e1Var.d(((d0) obj2).getKey())));
            case 1:
                Object key2 = ((d0) obj).getKey();
                e1 e1Var2 = this.f1257v;
                return ac.a(Integer.valueOf(e1Var2.d(key2)), Integer.valueOf(e1Var2.d(((d0) obj2).getKey())));
            case 2:
                Object key3 = ((d0) obj2).getKey();
                e1 e1Var3 = this.f1257v;
                return ac.a(Integer.valueOf(e1Var3.d(key3)), Integer.valueOf(e1Var3.d(((d0) obj).getKey())));
            default:
                Object key4 = ((d0) obj2).getKey();
                e1 e1Var4 = this.f1257v;
                return ac.a(Integer.valueOf(e1Var4.d(key4)), Integer.valueOf(e1Var4.d(((d0) obj).getKey())));
        }
    }
}
