package ig;
import q.l;

import java.lang.ref.Reference;
import java.net.Socket;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f18460a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final b f18461b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final b f18462c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final b f18463d = new Object();
    public static b e;

    public static Socket a(g gVar, a aVar, lg.e eVar) {
        Iterator it = gVar.f18501d.iterator();
        while (it.hasNext()) {
            lg.b bVar = (lg.b) it.next();
            if (bVar.g(aVar, null) && bVar.f20377h != null && bVar != eVar.a()) {
                if (eVar.f20398n == null && eVar.f20394j.f20382n.size() == 1) {
                    Reference reference = (Reference) eVar.f20394j.f20382n.get(0);
                    Socket b10 = eVar.b(true, false, false);
                    eVar.f20394j = bVar;
                    bVar.f20382n.add(reference);
                    return b10;
                }
                g5.l();
                return null;
            }
        }
        return null;
    }

    public static void b(g gVar, a aVar, lg.e eVar, z zVar) {
        Iterator it = gVar.f18501d.iterator();
        while (it.hasNext()) {
            lg.b bVar = (lg.b) it.next();
            if (bVar.g(aVar, zVar)) {
                if (eVar.f20394j == null) {
                    eVar.f20394j = bVar;
                    eVar.f20395k = true;
                    bVar.f20382n.add(new lg.d(eVar, eVar.f20392g));
                    return;
                }
                g5.l();
                return;
            }
        }
    }
}
