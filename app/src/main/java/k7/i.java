package k7;

import eg.p0;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class i {
    public static final h Companion = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final String f19617a;

    /* renamed from: b, reason: collision with root package name */
    public final String f19618b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19619c;

    /* renamed from: d, reason: collision with root package name */
    public final long f19620d;
    public final long e;

    public /* synthetic */ i(int i, String str, String str2, int i10, long j10, long j11) {
        if (31 == (i & 31)) {
            this.f19617a = str;
            this.f19618b = str2;
            this.f19619c = i10;
            this.f19620d = j10;
            this.e = j11;
            return;
        }
        p0.e(i, 31, g.f19616a.d());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (l.a(this.f19617a, iVar.f19617a) && l.a(this.f19618b, iVar.f19618b) && this.f19619c == iVar.f19619c && this.f19620d == iVar.f19620d && this.e == iVar.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + p.a.d(this.f19620d, p.a.b(this.f19619c, g3.a.e(this.f19618b, this.f19617a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder q10 = p.a.q("StackEntity(id=", this.f19617a, ", title=", this.f19618b, ", orderIndex=");
        q10.append(this.f19619c);
        q10.append(", createdAt=");
        q10.append(this.f19620d);
        q10.append(", updatedAt=");
        q10.append(this.e);
        q10.append(")");
        return q10.toString();
    }

    public i(int i, long j10, long j11, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f19617a = str;
        this.f19618b = str2;
        this.f19619c = i;
        this.f19620d = j10;
        this.e = j11;
    }
}
