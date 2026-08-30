package l5;

import eb.u1;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.l;
import qe.s;
import ya.h0;
import ya.i0;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f19936a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f19937b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f19938c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f19939d;

    public i(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        abstractSet.getClass();
        this.f19936a = str;
        this.f19937b = map;
        this.f19938c = abstractSet;
        this.f19939d = abstractSet2;
    }

    public static final i a(r5.c cVar, String str) {
        return h0.a(new s5.a(cVar), str);
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this != obj) {
            if (obj instanceof i) {
                i iVar = (i) obj;
                if (!this.f19936a.equals(iVar.f19936a) || !this.f19937b.equals(iVar.f19937b) || !l.a(this.f19938c, iVar.f19938c)) {
                    return false;
                }
                Set set2 = this.f19939d;
                if (set2 != null && (set = iVar.f19939d) != null) {
                    return set2.equals(set);
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f19938c.hashCode() + ((this.f19937b.hashCode() + (this.f19936a.hashCode() * 31)) * 31);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.Map, java.lang.Object] */
    public final String toString() {
        Collection collection;
        StringBuilder sb2 = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb2.append(this.f19936a);
        sb2.append("',\n            |    columns = {");
        sb2.append(i0.b(qe.l.K(this.f19937b.values(), new u1(5))));
        sb2.append("\n            |    foreignKeys = {");
        sb2.append(i0.b(this.f19938c));
        sb2.append("\n            |    indices = {");
        Set set = this.f19939d;
        if (set != null) {
            collection = qe.l.K(set, new u1(6));
        } else {
            collection = s.f24023u;
        }
        sb2.append(i0.b(collection));
        sb2.append("\n            |}\n        ");
        return mf.g.d(sb2.toString());
    }
}
