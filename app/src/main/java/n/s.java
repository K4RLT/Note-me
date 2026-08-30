package n;
import l.a;

import java.util.Map;

/* loaded from: classes.dex */
public class s implements Map.Entry, ef.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f20935u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f20936v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f20937w;

    public /* synthetic */ s(Object obj, int i, Object obj2) {
        this.f20935u = i;
        this.f20936v = obj;
        this.f20937w = obj2;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        Map.Entry entry;
        switch (this.f20935u) {
            case 1:
                if (obj instanceof Map.Entry) {
                    entry = (Map.Entry) obj;
                } else {
                    entry = null;
                }
                if (entry != null && kotlin.jvm.internal.a(entry.getKey(), this.f20936v) && kotlin.jvm.internal.a(entry.getValue(), getValue())) {
                    return true;
                }
                return false;
            default:
                return super.equals(obj);
        }
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        switch (this.f20935u) {
            case 0:
                return this.f20936v;
            default:
                return this.f20936v;
        }
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        switch (this.f20935u) {
            case 0:
                return this.f20937w;
            default:
                return this.f20937w;
        }
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        int i;
        switch (this.f20935u) {
            case 1:
                int i10 = 0;
                Object obj = this.f20936v;
                if (obj != null) {
                    i = obj.hashCode();
                } else {
                    i = 0;
                }
                Object value = getValue();
                if (value != null) {
                    i10 = value.hashCode();
                }
                return i10 ^ i;
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        switch (this.f20935u) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public String toString() {
        switch (this.f20935u) {
            case 1:
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f20936v);
                sb2.append('=');
                sb2.append(getValue());
                return sb2.toString();
            default:
                return super.toString();
        }
    }
}
