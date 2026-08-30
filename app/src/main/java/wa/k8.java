package wa;
import fa.y;
import ra.e;

import java.util.List;

/* loaded from: classes.dex */
public abstract class k8 {
    public static e a(je.h hVar) {
        y.h(hVar);
        List list = hVar.f19184a;
        float[] fArr = new float[list.size()];
        float[] fArr2 = new float[list.size()];
        long[] jArr = new long[list.size()];
        for (int i = 0; i < list.size(); i++) {
            fArr[i] = ((je.g) list.get(i)).f19181a;
            fArr2[i] = ((je.g) list.get(i)).f19182b;
            Long l10 = ((je.g) list.get(i)).f19183c;
            jArr[i] = ((je.g) list.get(i)).f19183c.longValue();
        }
        return new e(fArr, fArr2, jArr);
    }
}
