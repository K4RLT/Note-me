package q2;
import l.a;
import p.a;
import q.b;
import q.n;
import q.x;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f23363a;

    public r(q... qVarArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (qVarArr.length <= 0) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str = (String) entry.getKey();
                List list = (List) entry.getValue();
                if (list.size() == 1) {
                    qe.n(arrayList, list);
                } else {
                    StringBuilder sb2 = new StringBuilder("'");
                    sb2.append(str);
                    sb2.append("' must be unique. Actual [ [");
                    x.j(a.n(sb2, qe.l.B(list, null, null, null, null, 63), ']'));
                    throw null;
                }
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            this.f23363a = arrayList2;
            if (arrayList2.size() <= 0) {
                return;
            }
            arrayList2.get(0).getClass();
            g5.b();
            throw null;
        }
        q qVar = qVarArr[0];
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof r) {
                if (!kotlin.jvm.internal.a(this.f23363a, ((r) obj).f23363a)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f23363a.hashCode();
    }
}
