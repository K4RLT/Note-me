package u7;
import l.a;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class m2 {

    /* renamed from: a, reason: collision with root package name */
    public final List f26527a;

    /* renamed from: b, reason: collision with root package name */
    public final List f26528b;

    /* renamed from: c, reason: collision with root package name */
    public final int f26529c;

    public m2(List list, List list2, int i) {
        list.getClass();
        list2.getClass();
        this.f26527a = list;
        this.f26528b = list2;
        this.f26529c = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    public static m2 a(m2 m2Var, List list, ArrayList arrayList, int i, int i10) {
        if ((i10 & 1) != 0) {
            list = m2Var.f26527a;
        }
        ArrayList arrayList2 = arrayList;
        if ((i10 & 2) != 0) {
            arrayList2 = m2Var.f26528b;
        }
        if ((i10 & 4) != 0) {
            i = m2Var.f26529c;
        }
        m2Var.getClass();
        list.getClass();
        arrayList2.getClass();
        return new m2(list, arrayList2, i);
    }

    public final List b() {
        return this.f26528b;
    }

    public final List c() {
        return this.f26527a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m2)) {
            return false;
        }
        m2 m2Var = (m2) obj;
        if (kotlin.jvm.internal.a(this.f26527a, m2Var.f26527a) && kotlin.jvm.internal.a(this.f26528b, m2Var.f26528b) && this.f26529c == m2Var.f26529c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f26529c) + ((this.f26528b.hashCode() + (this.f26527a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NotebookUiState(notebooks=");
        sb2.append(this.f26527a);
        sb2.append(", bookColors=");
        sb2.append(this.f26528b);
        sb2.append(", activeBook=");
        return a.j(this.f26529c, ")", sb2);
    }
}
