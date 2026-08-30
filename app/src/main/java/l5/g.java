package l5;
import g.b;

import java.util.List;
import kotlin.jvm.internal.l;
import ya.i0;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f19928a;

    /* renamed from: b, reason: collision with root package name */
    public final String f19929b;

    /* renamed from: c, reason: collision with root package name */
    public final String f19930c;

    /* renamed from: d, reason: collision with root package name */
    public final List f19931d;
    public final List e;

    public g(String str, String str2, String str3, List list, List list2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        list2.getClass();
        this.f19928a = str;
        this.f19929b = str2;
        this.f19930c = str3;
        this.f19931d = list;
        this.e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (!l.a(this.f19928a, gVar.f19928a) || !l.a(this.f19929b, gVar.f19929b) || !l.a(this.f19930c, gVar.f19930c) || !l.a(this.f19931d, gVar.f19931d)) {
                return false;
            }
            return l.a(this.e, gVar.e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.f19931d.hashCode() + g3.a.e(this.f19930c, g3.a.e(this.f19929b, this.f19928a.hashCode() * 31, 31), 31)) * 31);
    }

    public final String toString() {
        return mf.b(mf.g.d("\n            |ForeignKey {\n            |   referenceTable = '" + this.f19928a + "',\n            |   onDelete = '" + this.f19929b + "',\n            |   onUpdate = '" + this.f19930c + "',\n            |   columnNames = {" + i0.d(qe.l.J(this.f19931d)) + "\n            |   referenceColumnNames = {" + i0.c(qe.l.J(this.e)) + "\n            |}\n        "));
    }
}
