package m2;
import a.a;
import g0.b;

import wa.b9;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final a f20561a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20562b;

    /* renamed from: c, reason: collision with root package name */
    public final int f20563c;

    /* renamed from: d, reason: collision with root package name */
    public final int f20564d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final float f20565f;

    /* renamed from: g, reason: collision with root package name */
    public final float f20566g;

    public s(a aVar, int i, int i10, int i11, int i12, float f10, float f11) {
        this.f20561a = aVar;
        this.f20562b = i;
        this.f20563c = i10;
        this.f20564d = i11;
        this.e = i12;
        this.f20565f = f10;
        this.f20566g = f11;
    }

    public final j1.c a(j1.c cVar) {
        return cVar.i((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(this.f20565f) & 4294967295L));
    }

    public final long b(long j10, boolean z3) {
        if (z3) {
            long j11 = p0.f20544b;
            if (a(j10, j11)) {
                return j11;
            }
        }
        int i = p0.f20545c;
        int i10 = (int) (j10 >> 32);
        int i11 = this.f20562b;
        return b(i10 + i11, ((int) (j10 & 4294967295L)) + i11);
    }

    public final j1.c c(j1.c cVar) {
        float f10 = -this.f20565f;
        return cVar.i((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L));
    }

    public final int d(int i) {
        int i10 = this.f20563c;
        int i11 = this.f20562b;
        return b9.e(i, i11, i10) - i11;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof s) {
                s sVar = (s) obj;
                if (!this.f20561a.equals(sVar.f20561a) || this.f20562b != sVar.f20562b || this.f20563c != sVar.f20563c || this.f20564d != sVar.f20564d || this.e != sVar.e || Float.compare(this.f20565f, sVar.f20565f) != 0 || Float.compare(this.f20566g, sVar.f20566g) != 0) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.f20566g) + p.a(p.a.b(this.e, p.a.b(this.f20564d, p.a.b(this.f20563c, p.a.b(this.f20562b, this.f20561a.hashCode() * 31, 31), 31), 31), 31), 31, this.f20565f);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ParagraphInfo(paragraph=");
        sb2.append(this.f20561a);
        sb2.append(", startIndex=");
        sb2.append(this.f20562b);
        sb2.append(", endIndex=");
        sb2.append(this.f20563c);
        sb2.append(", startLineIndex=");
        sb2.append(this.f20564d);
        sb2.append(", endLineIndex=");
        sb2.append(this.e);
        sb2.append(", top=");
        sb2.append(this.f20565f);
        sb2.append(", bottom=");
        return p.a.m(sb2, this.f20566g, ')');
    }
}
