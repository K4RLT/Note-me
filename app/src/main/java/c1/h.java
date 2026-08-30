package c1;

import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f3450a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f3451b;

    public h(int i, Integer num) {
        this.f3450a = i;
        this.f3451b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f3450a == hVar.f3450a && l.a(this.f3451b, hVar.f3451b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = Integer.hashCode(this.f3450a) * 31;
        Integer num = this.f3451b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "ObjectLocation(group=" + this.f3450a + ", dataOffset=" + this.f3451b + ')';
    }
}
