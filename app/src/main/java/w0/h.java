package w0;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class h extends qe.h implements u0.b {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f27676u;

    /* renamed from: v, reason: collision with root package name */
    public final b f27677v;

    public /* synthetic */ h(b bVar, int i) {
        this.f27676u = i;
        this.f27677v = bVar;
    }

    @Override // qe.a
    public final int a() {
        switch (this.f27676u) {
            case 0:
                b bVar = this.f27677v;
                bVar.getClass();
                return bVar.f27661v;
            default:
                b bVar2 = this.f27677v;
                bVar2.getClass();
                return bVar2.f27661v;
        }
    }

    @Override // qe.a, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f27676u) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                b bVar = this.f27677v;
                Object obj2 = bVar.get(key);
                if (obj2 != null) {
                    return obj2.equals(entry.getValue());
                }
                if (entry.getValue() != null || !bVar.containsKey(entry.getKey())) {
                    return false;
                }
                return true;
            default:
                return this.f27677v.containsKey(obj);
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f27676u) {
            case 0:
                k kVar = this.f27677v.f27660u;
                l[] lVarArr = new l[8];
                for (int i = 0; i < 8; i++) {
                    lVarArr[i] = new m(0);
                }
                return new c(kVar, lVarArr);
            default:
                k kVar2 = this.f27677v.f27660u;
                l[] lVarArr2 = new l[8];
                for (int i10 = 0; i10 < 8; i10++) {
                    lVarArr2[i10] = new m(1);
                }
                return new c(kVar2, lVarArr2);
        }
    }
}
