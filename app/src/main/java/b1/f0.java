package b1;
import q.l;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class f0 extends g0 implements Iterator, ef.a {

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f1336z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(y yVar, Iterator it, int i) {
        super(yVar, it);
        this.f1336z = i;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f1336z) {
            case 0:
                a();
                if (((Map.Entry) this.f1341x) != null) {
                    return new e0(this);
                }
                g5.l();
                return null;
            case 1:
                Map.Entry entry = (Map.Entry) this.f1342y;
                if (entry != null) {
                    a();
                    return entry.getKey();
                }
                g5.l();
                return null;
            default:
                Map.Entry entry2 = (Map.Entry) this.f1342y;
                if (entry2 != null) {
                    a();
                    return entry2.getValue();
                }
                g5.l();
                return null;
        }
    }
}
