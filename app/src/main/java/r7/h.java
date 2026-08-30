package r7;

import android.content.Context;
import com.android.billingclient.api.Purchase;
import java.util.Iterator;
import java.util.List;
import q.x;
import qe.s;
import sf.a0;
import sf.e0;
import sf.n0;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final n0 f24629a;

    /* renamed from: b, reason: collision with root package name */
    public static final a0 f24630b;

    /* renamed from: c, reason: collision with root package name */
    public static final n0 f24631c;

    /* renamed from: d, reason: collision with root package name */
    public static final a0 f24632d;
    public static final n0 e;

    /* renamed from: f, reason: collision with root package name */
    public static final a0 f24633f;

    /* renamed from: g, reason: collision with root package name */
    public static final n0 f24634g;

    /* renamed from: h, reason: collision with root package name */
    public static c7.c f24635h;
    public static Context i;

    /* renamed from: j, reason: collision with root package name */
    public static final x f24636j;

    /* renamed from: k, reason: collision with root package name */
    public static volatile long f24637k;

    static {
        n0 b10 = e0.b(f.IDLE);
        f24629a = b10;
        f24630b = new a0(b10);
        n0 b11 = e0.b(s.f24023u);
        f24631c = b11;
        f24632d = new a0(b11);
        n0 b12 = e0.b(null);
        e = b12;
        f24633f = new a0(b12);
        f24634g = e0.b(Boolean.FALSE);
        f24636j = new x(4);
    }

    public static a0 a() {
        return f24630b;
    }

    public static a0 b() {
        return f24633f;
    }

    public static a0 c() {
        return f24632d;
    }

    public static void d(List list, boolean z3) {
        Object obj;
        c7.c cVar = f24635h;
        if (cVar != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Purchase purchase = (Purchase) it.next();
                if (purchase.f4147c.optInt("purchaseState", 1) != 4) {
                    Iterator<E> it2 = n.getEntries().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj = it2.next();
                            if (purchase.a().contains(((n) obj).getProductId())) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    n nVar = (n) obj;
                    if (nVar != null) {
                        String b10 = purchase.b();
                        if (b10 != null) {
                            c7.a aVar = new c7.a(1, false);
                            aVar.f3896v = b10;
                            cVar.b(aVar, new nd.f(nVar, purchase, z3));
                        } else {
                            x.n("Purchase token must be set");
                            return;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
    }

    public static void e() {
        n0 n0Var = f24631c;
        n0Var.getClass();
        n0Var.k(null, s.f24023u);
        f24629a.j(f.UNAVAILABLE);
    }
}
