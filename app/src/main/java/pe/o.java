package pe;
import l.a;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class o implements Serializable {

    /* renamed from: u, reason: collision with root package name */
    public final Object f22703u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f22704v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f22705w;

    public o(Object obj, Object obj2, Object obj3) {
        this.f22703u = obj;
        this.f22704v = obj2;
        this.f22705w = obj3;
    }

    public final Object a() {
        return this.f22703u;
    }

    public final Object b() {
        return this.f22704v;
    }

    public final Object c() {
        return this.f22705w;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (kotlin.jvm.internal.a(this.f22703u, oVar.f22703u) && kotlin.jvm.internal.a(this.f22704v, oVar.f22704v) && kotlin.jvm.internal.a(this.f22705w, oVar.f22705w)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i = 0;
        Object obj = this.f22703u;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i10 = hashCode * 31;
        Object obj2 = this.f22704v;
        if (obj2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = obj2.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        Object obj3 = this.f22705w;
        if (obj3 != null) {
            i = obj3.hashCode();
        }
        return i11 + i;
    }

    public final String toString() {
        return "(" + this.f22703u + ", " + this.f22704v + ", " + this.f22705w + ')';
    }
}
