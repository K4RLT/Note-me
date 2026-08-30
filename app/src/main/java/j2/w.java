package j2;

import c0.d0;
import java.util.Comparator;
import ya.ac;

/* loaded from: classes.dex */
public final /* synthetic */ class w implements Comparator {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f18869u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f18870v;

    public /* synthetic */ w(int i, Object obj) {
        this.f18869u = i;
        this.f18870v = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f18869u) {
            case 0:
                return ((Number) ((df.p) this.f18870v).invoke(obj, obj2)).intValue();
            case 1:
                return ((Number) ((d0) this.f18870v).invoke(obj, obj2)).intValue();
            default:
                for (df.l lVar : (df.l[]) this.f18870v) {
                    int a10 = ac.a((Comparable) lVar.invoke(obj), (Comparable) lVar.invoke(obj2));
                    if (a10 != 0) {
                        return a10;
                    }
                }
                return 0;
        }
    }
}
