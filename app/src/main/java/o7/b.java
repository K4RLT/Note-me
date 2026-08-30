package o7;
import a.a;

import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f21848a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21849b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21850c;

    /* renamed from: d, reason: collision with root package name */
    public final float f21851d;
    public final float e;

    /* renamed from: f, reason: collision with root package name */
    public final float f21852f;

    /* renamed from: g, reason: collision with root package name */
    public final String f21853g;

    public b(String str, String str2, int i, float f10, float f11, float f12, String str3) {
        str.getClass();
        str2.getClass();
        this.f21848a = str;
        this.f21849b = str2;
        this.f21850c = i;
        this.f21851d = f10;
        this.e = f11;
        this.f21852f = f12;
        this.f21853g = str3;
    }

    public static b a(b bVar, String str, int i, int i10) {
        String str2 = bVar.f21848a;
        if ((i10 & 2) != 0) {
            str = bVar.f21849b;
        }
        String str3 = str;
        if ((i10 & 4) != 0) {
            i = bVar.f21850c;
        }
        float f10 = bVar.f21851d;
        float f11 = bVar.e;
        float f12 = bVar.f21852f;
        String str4 = bVar.f21853g;
        str2.getClass();
        str3.getClass();
        return new b(str2, str3, i, f10, f11, f12, str4);
    }

    public final int b() {
        return this.f21850c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (l.a(this.f21848a, bVar.f21848a) && l.a(this.f21849b, bVar.f21849b) && this.f21850c == bVar.f21850c && Float.compare(this.f21851d, bVar.f21851d) == 0 && Float.compare(this.e, bVar.e) == 0 && Float.compare(this.f21852f, bVar.f21852f) == 0 && l.a(this.f21853g, bVar.f21853g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int a10 = p.a(p.a(p.a(p.a.b(this.f21850c, g3.a.e(this.f21849b, this.f21848a.hashCode() * 31, 31), 31), 31, this.f21851d), 31, this.e), 31, this.f21852f);
        String str = this.f21853g;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return a10 + hashCode;
    }

    public final String toString() {
        StringBuilder q10 = p.a.q("Notebook(id=", this.f21848a, ", title=", this.f21849b, ", pageCount=");
        q10.append(this.f21850c);
        q10.append(", colorR=");
        q10.append(this.f21851d);
        q10.append(", colorG=");
        a5.a.s(q10, this.e, ", colorB=", this.f21852f, ", stackId=");
        return a5.a.k(q10, this.f21853g, ")");
    }
}
