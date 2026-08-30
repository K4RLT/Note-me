package ya;
import me.a;

import java.util.Map;

/* loaded from: classes.dex */
public final class c extends cg {

    /* renamed from: u, reason: collision with root package name */
    public final Object f31170u;

    /* renamed from: v, reason: collision with root package name */
    public int f31171v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f31172w;

    public c(d dVar, int i) {
        this.f31172w = dVar;
        Object[] objArr = dVar.f31191w;
        objArr.getClass();
        this.f31170u = objArr[i];
        this.f31171v = i;
    }

    public final void a() {
        int i = this.f31171v;
        Object obj = this.f31170u;
        d dVar = this.f31172w;
        if (i != -1 && i < dVar.size()) {
            int i10 = this.f31171v;
            Object[] objArr = dVar.f31191w;
            objArr.getClass();
            if (a(obj, objArr[i10])) {
                return;
            }
        }
        Object obj2 = d.D;
        this.f31171v = dVar.f(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f31170u;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        d dVar = this.f31172w;
        Map a10 = dVar.a();
        if (a10 != null) {
            return a10.get(this.f31170u);
        }
        a();
        int i = this.f31171v;
        if (i == -1) {
            return null;
        }
        Object[] objArr = dVar.f31192x;
        objArr.getClass();
        return objArr[i];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        d dVar = this.f31172w;
        Map a10 = dVar.a();
        Object obj2 = this.f31170u;
        if (a10 != null) {
            return a10.put(obj2, obj);
        }
        a();
        int i = this.f31171v;
        if (i == -1) {
            dVar.put(obj2, obj);
            return null;
        }
        Object[] objArr = dVar.f31192x;
        objArr.getClass();
        Object obj3 = objArr[i];
        objArr[i] = obj;
        return obj3;
    }
}
