package l5;
import g.b;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.l;
import mf.m;
import ya.i0;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f19932a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f19933b;

    /* renamed from: c, reason: collision with root package name */
    public final List f19934c;

    /* renamed from: d, reason: collision with root package name */
    public final List f19935d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList] */
    public h(String str, boolean z3, List list, List list2) {
        str.getClass();
        list.getClass();
        list2.getClass();
        this.f19932a = str;
        this.f19933b = z3;
        this.f19934c = list;
        this.f19935d = list2;
        List list3 = list2;
        if (list3.isEmpty()) {
            int size = list.size();
            list3 = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                list3.add("ASC");
            }
        }
        this.f19935d = (List) list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            String str = hVar.f19932a;
            if (this.f19933b != hVar.f19933b || !l.a(this.f19934c, hVar.f19934c) || !l.a(this.f19935d, hVar.f19935d)) {
                return false;
            }
            String str2 = this.f19932a;
            if (m.j(str2, "index_")) {
                return m.j(str, "index_");
            }
            return str2.equals(str);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.f19932a;
        if (m.j(str, "index_")) {
            hashCode = -1184239155;
        } else {
            hashCode = str.hashCode();
        }
        return this.f19935d.hashCode() + ((this.f19934c.hashCode() + (((hashCode * 31) + (this.f19933b ? 1 : 0)) * 31)) * 31);
    }

    public final String toString() {
        return mf.b(mf.g.d("\n            |Index {\n            |   name = '" + this.f19932a + "',\n            |   unique = '" + this.f19933b + "',\n            |   columns = {" + i0.d(this.f19934c) + "\n            |   orders = {" + i0.c(this.f19935d) + "\n            |}\n        "));
    }
}
