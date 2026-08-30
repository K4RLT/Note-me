package e5;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final List f15912a;

    public b(List list) {
        list.getClass();
        this.f15912a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        List list = this.f15912a;
        int size = list.size();
        List list2 = ((b) obj).f15912a;
        if (size != list2.size()) {
            return false;
        }
        return new HashSet(list).equals(new HashSet(list2));
    }

    public final int hashCode() {
        return Objects.hash(this.f15912a);
    }

    public final String toString() {
        return "Topics=" + this.f15912a;
    }
}
