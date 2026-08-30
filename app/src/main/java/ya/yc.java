package ya;

import com.google.android.gms.internal.ads.j61;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class yc extends j61 {

    /* renamed from: v, reason: collision with root package name */
    public final Map f31602v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ eg f31603w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yc(eg egVar, Map map) {
        super(2);
        this.f31603w = egVar;
        map.getClass();
        this.f31602v = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Iterator it = iterator();
        while (true) {
            com.google.android.gms.internal.mlkit_vision_digital_ink.e3 e3Var = (com.google.android.gms.internal.mlkit_vision_digital_ink.e3) it;
            if (e3Var.hasNext()) {
                e3Var.next();
                e3Var.remove();
            } else {
                return;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f31602v.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f31602v.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this != obj && !this.f31602v.keySet().equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f31602v.keySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f31602v.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new com.google.android.gms.internal.mlkit_vision_digital_ink.e3(this, this.f31602v.entrySet().iterator(), 4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.f31602v.remove(obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f31603w.getClass();
            if (size > 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f31602v.size();
    }
}
