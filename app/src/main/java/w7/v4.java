package w7;
import a5.a;
import l7.b;
import p.a;

/* loaded from: classes.dex */
public final class v4 {

    /* renamed from: a, reason: collision with root package name */
    public final b f29280a;

    /* renamed from: b, reason: collision with root package name */
    public final float f29281b;

    /* renamed from: c, reason: collision with root package name */
    public final float f29282c;

    /* renamed from: d, reason: collision with root package name */
    public final float f29283d;
    public final float e;

    public v4(b bVar, float f10, float f11, float f12, float f13) {
        bVar.getClass();
        this.f29280a = bVar;
        this.f29281b = f10;
        this.f29282c = f11;
        this.f29283d = f12;
        this.e = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v4)) {
            return false;
        }
        v4 v4Var = (v4) obj;
        if (this.f29280a == v4Var.f29280a && Float.compare(this.f29281b, v4Var.f29281b) == 0 && Float.compare(this.f29282c, v4Var.f29282c) == 0 && Float.compare(this.f29283d, v4Var.f29283d) == 0 && Float.compare(this.e, v4Var.e) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + a.a(a.a(a.a(this.f29280a.hashCode() * 31, 31, this.f29281b), 31, this.f29282c), 31, this.f29283d);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CoverPiece(shape=");
        sb2.append(this.f29280a);
        sb2.append(", ox=");
        sb2.append(this.f29281b);
        sb2.append(", oy=");
        a.s(sb2, this.f29282c, ", rot=", this.f29283d, ", scale=");
        sb2.append(this.e);
        sb2.append(")");
        return sb2.toString();
    }
}
