package pd;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f22678a;

    /* renamed from: b, reason: collision with root package name */
    public final c f22679b;

    public b(Set set, c cVar) {
        this.f22678a = b(set);
        this.f22679b = cVar;
    }

    public static String b(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb2.append(aVar.f22676a);
            sb2.append('/');
            sb2.append(aVar.f22677b);
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        Set unmodifiableSet2;
        c cVar = this.f22679b;
        synchronized (((HashSet) cVar.f22681u)) {
            unmodifiableSet = Collections.unmodifiableSet((HashSet) cVar.f22681u);
        }
        boolean isEmpty = unmodifiableSet.isEmpty();
        String str = this.f22678a;
        if (isEmpty) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(' ');
        synchronized (((HashSet) cVar.f22681u)) {
            unmodifiableSet2 = Collections.unmodifiableSet((HashSet) cVar.f22681u);
        }
        sb2.append(b(unmodifiableSet2));
        return sb2.toString();
    }
}
