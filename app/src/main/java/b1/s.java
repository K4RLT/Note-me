package b1;

import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class s implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f1396u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Collection f1397v;

    public /* synthetic */ s(int i, Collection collection) {
        this.f1396u = i;
        this.f1397v = collection;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        boolean retainAll;
        switch (this.f1396u) {
            case 0:
                retainAll = ((List) obj).retainAll(this.f1397v);
                break;
            case 1:
                retainAll = this.f1397v.contains(obj);
                break;
            default:
                retainAll = this.f1397v.contains(obj);
                break;
        }
        return Boolean.valueOf(retainAll);
    }
}
