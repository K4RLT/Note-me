package y7;

import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f30984a;

    /* renamed from: b, reason: collision with root package name */
    public final int f30985b;

    /* renamed from: c, reason: collision with root package name */
    public final String f30986c;

    /* renamed from: d, reason: collision with root package name */
    public final String f30987d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final float f30988f;

    public d(String str, int i, String str2, String str3, int i10, float f10) {
        this.f30984a = str;
        this.f30985b = i;
        this.f30986c = str2;
        this.f30987d = str3;
        this.e = i10;
        this.f30988f = f10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (!this.f30984a.equals(dVar.f30984a) || this.f30985b != dVar.f30985b || !l.a(this.f30986c, dVar.f30986c) || !l.a(this.f30987d, dVar.f30987d) || this.e != dVar.e || Float.compare(this.f30988f, dVar.f30988f) != 0) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int b10 = p.a.b(this.f30985b, this.f30984a.hashCode() * 31, 31);
        int i = 0;
        String str = this.f30986c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (b10 + hashCode) * 31;
        String str2 = this.f30987d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return Float.hashCode(this.f30988f) + p.a.b(this.e, (i10 + i) * 31, 31);
    }

    public final String toString() {
        StringBuilder m4 = a5.a.m("WorkspaceSurface(id=", this.f30984a, ", labelRes=", this.f30985b, ", colorAsset=");
        g3.a.t(m4, this.f30986c, ", normalAsset=", this.f30987d, ", swatchArgb=");
        m4.append(this.e);
        m4.append(", tile=");
        m4.append(this.f30988f);
        m4.append(")");
        return m4.toString();
    }
}
