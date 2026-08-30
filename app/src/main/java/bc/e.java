package bc;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class e implements ea.b {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReference f3172a = new AtomicReference();

    @Override // ea.b
    public final void a(boolean z3) {
        synchronized (g.f3175k) {
            try {
                ArrayList arrayList = new ArrayList(g.f3176l.values());
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    g gVar = (g) obj;
                    if (gVar.e.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        Iterator it = gVar.i.iterator();
                        while (it.hasNext()) {
                            g gVar2 = ((d) it.next()).f3171a;
                            if (!z3) {
                                ((ed.d) gVar2.f3183h.get()).b();
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
