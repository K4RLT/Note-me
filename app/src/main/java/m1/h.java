package m1;
import a.a;

import k1.i;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class h extends e {

    /* renamed from: a, reason: collision with root package name */
    public final float f20430a;

    /* renamed from: b, reason: collision with root package name */
    public final float f20431b;

    /* renamed from: c, reason: collision with root package name */
    public final int f20432c;

    /* renamed from: d, reason: collision with root package name */
    public final int f20433d;
    public final i e;

    public h(float f10, float f11, int i, int i10, i iVar, int i11) {
        f11 = (i11 & 2) != 0 ? 4.0f : f11;
        i = (i11 & 4) != 0 ? 0 : i;
        i10 = (i11 & 8) != 0 ? 0 : i10;
        iVar = (i11 & 16) != 0 ? null : iVar;
        this.f20430a = f10;
        this.f20431b = f11;
        this.f20432c = i;
        this.f20433d = i10;
        this.e = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f20430a == hVar.f20430a && this.f20431b == hVar.f20431b && this.f20432c == hVar.f20432c && this.f20433d == hVar.f20433d && l.a(this.e, hVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int b10 = p.a.b(this.f20433d, p.a.b(this.f20432c, p.a(Float.hashCode(this.f20430a) * 31, 31, this.f20431b), 31), 31);
        i iVar = this.e;
        if (iVar != null) {
            i = iVar.hashCode();
        } else {
            i = 0;
        }
        return b10 + i;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Stroke(width=");
        sb2.append(this.f20430a);
        sb2.append(", miter=");
        sb2.append(this.f20431b);
        sb2.append(", cap=");
        String str2 = "Unknown";
        int i = this.f20432c;
        if (i == 0) {
            str = "Butt";
        } else if (i == 1) {
            str = "Round";
        } else if (i != 2) {
            str = "Unknown";
        } else {
            str = "Square";
        }
        sb2.append((Object) str);
        sb2.append(", join=");
        int i10 = this.f20433d;
        if (i10 == 0) {
            str2 = "Miter";
        } else if (i10 == 1) {
            str2 = "Round";
        } else if (i10 == 2) {
            str2 = "Bevel";
        }
        sb2.append((Object) str2);
        sb2.append(", pathEffect=");
        sb2.append(this.e);
        sb2.append(')');
        return sb2.toString();
    }
}
