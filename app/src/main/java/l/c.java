package l;

import java.util.Map;

/* loaded from: classes.dex */
public final class c implements Map.Entry {

    /* renamed from: u, reason: collision with root package name */
    public final Object f19793u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f19794v;

    /* renamed from: w, reason: collision with root package name */
    public c f19795w;

    /* renamed from: x, reason: collision with root package name */
    public c f19796x;

    public c(Object obj, Object obj2) {
        this.f19793u = obj;
        this.f19794v = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (this.f19793u.equals(cVar.f19793u) && this.f19794v.equals(cVar.f19794v)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f19793u;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f19794v;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f19793u.hashCode() ^ this.f19794v.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f19793u + "=" + this.f19794v;
    }
}
