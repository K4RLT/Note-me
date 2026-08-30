package ie;

import fa.y;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f18438a;

    /* renamed from: b, reason: collision with root package name */
    public final a f18439b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f18440c;

    public b(String str, boolean z3) {
        this.f18440c = z3;
        this.f18438a = str;
        try {
            this.f18439b = new a(str);
            je.c cVar = (je.c) this;
            je.c.e.put(cVar.f18438a, cVar);
            HashMap hashMap = je.c.f19175f;
            a aVar = cVar.f18439b;
            a(aVar.f18433a, hashMap).add(cVar);
            String str2 = aVar.f18434b;
            if (str2 != null) {
                a(str2, je.c.f19176g).add(cVar);
            }
            String str3 = aVar.f18435c;
            if (str3 != null) {
                a(str3, je.c.f19177h).add(cVar);
            }
        } catch (zd.a e) {
            InternalError internalError = new InternalError(p.a.k("Constant initialization failed for languageTag '", str, "'."));
            internalError.initCause(e);
            throw internalError;
        }
    }

    public static synchronized Set a(String str, Map map) {
        Set set;
        synchronized (b.class) {
            try {
                if (!map.containsKey(str)) {
                    map.put(str, new HashSet());
                }
                set = (Set) map.get(str);
            } catch (Throwable th) {
                throw th;
            }
        }
        return set;
    }

    public boolean equals(Object obj) {
        if (obj != null) {
            if (this != obj) {
                if (obj instanceof b) {
                    b bVar = (b) obj;
                    if (this.f18440c != bVar.f18440c || !y.l(this.f18438a, bVar.f18438a) || !y.l(this.f18439b, bVar.f18439b)) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(super.hashCode()), this.f18438a, this.f18439b, Boolean.valueOf(this.f18440c)});
    }
}
