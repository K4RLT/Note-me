package xa;
import q.h;

import com.google.android.gms.internal.ads.wd0;
import java.util.Map;

/* loaded from: classes.dex */
public final class a1 implements Map.Entry {
    public final boolean A;
    public Object B;
    public int C;

    /* renamed from: u, reason: collision with root package name */
    public a1 f30353u;

    /* renamed from: v, reason: collision with root package name */
    public a1 f30354v;

    /* renamed from: w, reason: collision with root package name */
    public a1 f30355w;

    /* renamed from: x, reason: collision with root package name */
    public a1 f30356x;

    /* renamed from: y, reason: collision with root package name */
    public a1 f30357y;

    /* renamed from: z, reason: collision with root package name */
    public final Object f30358z;

    public a1(boolean z3, a1 a1Var, Object obj, a1 a1Var2, a1 a1Var3) {
        this.f30353u = a1Var;
        this.f30358z = obj;
        this.A = z3;
        this.C = 1;
        this.f30356x = a1Var2;
        this.f30357y = a1Var3;
        a1Var3.f30356x = this;
        a1Var2.f30357y = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f30358z;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.B;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f30358z;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.B;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        int i = 0;
        Object obj = this.f30358z;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Object obj2 = this.B;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return i ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.A) {
            g5.h("value == null");
            return null;
        }
        Object obj2 = this.B;
        this.B = obj;
        return obj2;
    }

    public final String toString() {
        return wd0.n(String.valueOf(this.f30358z), "=", String.valueOf(this.B));
    }

    public a1(boolean z3) {
        this.f30358z = null;
        this.A = z3;
        this.f30357y = this;
        this.f30356x = this;
    }
}
