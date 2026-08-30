package ya;
import ad.a;
import j6.c;
import z0.h;
import z0.i;
import z0.j;
import zc.d;

import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class y implements a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f31590u;

    /* renamed from: v, reason: collision with root package name */
    public Object f31591v;

    /* renamed from: w, reason: collision with root package name */
    public Object f31592w;

    /* renamed from: x, reason: collision with root package name */
    public Object f31593x;

    public y(int i) {
        this.f31590u = i;
        switch (i) {
            case 6:
                this.f31591v = new AtomicReference(h.f31763b);
                this.f31592w = new Object();
                return;
            default:
                this.f31591v = new HashMap();
                this.f31592w = new HashMap();
                this.f31593x = w.f31544c;
                return;
        }
    }

    @Override // a
    public /* bridge */ /* synthetic */ a a(Class cls, d dVar) {
        ((HashMap) this.f31591v).put(cls, dVar);
        ((HashMap) this.f31592w).remove(cls);
        return this;
    }

    public Object b() {
        long b10 = h.b();
        if (b10 == j.f31767a) {
            return this.f31593x;
        }
        i iVar = (i) ((AtomicReference) this.f31591v).get();
        int a10 = iVar.a(b10);
        if (a10 >= 0) {
            return iVar.f31766c[a10];
        }
        return null;
    }

    public void c(Object obj) {
        long b10 = h.b();
        if (b10 == j.f31767a) {
            this.f31593x = obj;
            return;
        }
        synchronized (this.f31592w) {
            i iVar = (i) ((AtomicReference) this.f31591v).get();
            int a10 = iVar.a(b10);
            if (a10 < 0) {
                ((AtomicReference) this.f31591v).set(iVar.b(b10, obj));
            } else {
                iVar.f31766c[a10] = obj;
            }
        }
    }

    public String toString() {
        switch (this.f31590u) {
            case 5:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.f31591v);
                sb2.append('{');
                c cVar = (c) ((c) this.f31592w).f18915w;
                String str = "";
                while (cVar != null) {
                    Object obj = cVar.f18914v;
                    sb2.append(str);
                    if (obj != null && obj.getClass().isArray()) {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        sb2.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                    } else {
                        sb2.append(obj);
                    }
                    cVar = (c) cVar.f18915w;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public y(String str) {
        this.f31590u = 5;
        c cVar = new c(18);
        this.f31592w = cVar;
        this.f31593x = cVar;
        this.f31591v = str;
    }
}
