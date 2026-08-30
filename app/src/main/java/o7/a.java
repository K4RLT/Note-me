package o7;
import a.a;

import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f21839a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21840b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21841c;

    /* renamed from: d, reason: collision with root package name */
    public final int f21842d;
    public final String e;

    /* renamed from: f, reason: collision with root package name */
    public final int f21843f;

    /* renamed from: g, reason: collision with root package name */
    public final float f21844g;

    /* renamed from: h, reason: collision with root package name */
    public final float f21845h;
    public final float i;

    /* renamed from: j, reason: collision with root package name */
    public final float f21846j;

    /* renamed from: k, reason: collision with root package name */
    public final String f21847k;

    public a(String str, String str2, int i, int i10, String str3, int i11, float f10, float f11, float f12, float f13, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.f21839a = str;
        this.f21840b = str2;
        this.f21841c = i;
        this.f21842d = i10;
        this.e = str3;
        this.f21843f = i11;
        this.f21844g = f10;
        this.f21845h = f11;
        this.i = f12;
        this.f21846j = f13;
        this.f21847k = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (l.a(this.f21839a, aVar.f21839a) && l.a(this.f21840b, aVar.f21840b) && this.f21841c == aVar.f21841c && this.f21842d == aVar.f21842d && l.a(this.e, aVar.e) && this.f21843f == aVar.f21843f && Float.compare(this.f21844g, aVar.f21844g) == 0 && Float.compare(this.f21845h, aVar.f21845h) == 0 && Float.compare(this.i, aVar.i) == 0 && Float.compare(this.f21846j, aVar.f21846j) == 0 && l.a(this.f21847k, aVar.f21847k)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f21847k.hashCode() + p.a.a(p.a.a(p.a.a(p.a.a(p.a.b(this.f21843f, g3.a.e(this.e, p.a.b(this.f21842d, p.a.b(this.f21841c, g3.a.e(this.f21840b, this.f21839a.hashCode() * 31, 31), 31), 31), 31), 31), 31, this.f21844g), 31, this.f21845h), 31, this.i), 31, this.f21846j);
    }

    public final String toString() {
        StringBuilder q10 = p.a.q("ElementRecord(id=", this.f21839a, ", notebookId=", this.f21840b, ", spreadIndex=");
        a5.a.n(this.f21841c, this.f21842d, ", pageSide=", ", type=", q10);
        q10.append(this.e);
        q10.append(", zIndex=");
        q10.append(this.f21843f);
        q10.append(", x=");
        a5.a.s(q10, this.f21844g, ", y=", this.f21845h, ", scale=");
        a5.a.s(q10, this.i, ", rotation=", this.f21846j, ", payloadJson=");
        return a5.a.k(q10, this.f21847k, ")");
    }
}
