package ya;
import z.i;
import z.j;

import java.util.Collection;

/* loaded from: classes.dex */
public abstract class ye {
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    public static final int a(i iVar) {
        Object r02 = iVar.f31697k;
        int size = ((Collection) r02).size();
        int i = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i += ((j) r02.get(i10)).f31714m;
        }
        return (i / r02.size()) + iVar.f31703q;
    }
}