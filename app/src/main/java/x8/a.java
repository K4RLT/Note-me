package x8;

import android.util.SparseArray;
import g5.q;
import java.util.HashMap;
import k8.d;
import q.x;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseArray f30350a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f30351b;

    static {
        HashMap hashMap = new HashMap();
        f30351b = hashMap;
        hashMap.put(d.f19626u, 0);
        hashMap.put(d.f19627v, 1);
        hashMap.put(d.f19628w, 2);
        for (d dVar : hashMap.keySet()) {
            f30350a.append(((Integer) f30351b.get(dVar)).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = (Integer) f30351b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        q.p(dVar, "PriorityMapping is missing known Priority value ");
        return 0;
    }

    public static d b(int i) {
        d dVar = (d) f30350a.get(i);
        if (dVar != null) {
            return dVar;
        }
        x.n(g3.a.g(i, "Unknown Priority for value "));
        return null;
    }
}
