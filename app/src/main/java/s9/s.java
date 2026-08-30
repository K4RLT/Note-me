package s9;

import android.util.Pair;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class s extends LinkedHashMap {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ u f25108u;

    public s(u uVar) {
        this.f25108u = uVar;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        u uVar = this.f25108u;
        synchronized (uVar) {
            try {
                boolean z3 = false;
                if (size() <= uVar.f25112a) {
                    return false;
                }
                uVar.f25116f.add(new Pair((String) entry.getKey(), ((t) entry.getValue()).f25110b));
                if (size() > uVar.f25112a) {
                    z3 = true;
                }
                return z3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
