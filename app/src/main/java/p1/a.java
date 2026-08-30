package p1;

import b2.l0;
import k1.f;
import k1.s;
import kotlin.jvm.internal.l;
import m1.d;
import q.x;
import y2.j;
import ya.vd;

/* loaded from: classes.dex */
public final class a extends b {
    public final f e;

    /* renamed from: f, reason: collision with root package name */
    public final long f22355f;

    /* renamed from: g, reason: collision with root package name */
    public int f22356g = 1;

    /* renamed from: h, reason: collision with root package name */
    public final long f22357h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public s f22358j;

    public a(f fVar, long j10) {
        int i;
        int i10;
        this.e = fVar;
        this.f22355f = j10;
        if (((int) 0) >= 0 && ((int) 0) >= 0 && (i = (int) (j10 >> 32)) >= 0 && (i10 = (int) (4294967295L & j10)) >= 0 && i <= fVar.f19477a.getWidth() && i10 <= fVar.f19477a.getHeight()) {
            this.f22357h = j10;
            this.i = 1.0f;
        } else {
            x.n("Failed requirement.");
            throw null;
        }
    }

    @Override // p1.b
    public final void a(float f10) {
        this.i = f10;
    }

    @Override // p1.b
    public final void b(s sVar) {
        this.f22358j = sVar;
    }

    @Override // p1.b
    public final long d() {
        return vd.c(this.f22357h);
    }

    @Override // p1.b
    public final void e(l0 l0Var) {
        m1.b bVar = l0Var.f1533u;
        d.I0(l0Var, this.e, 0L, this.f22355f, 0L, (Math.round(Float.intBitsToFloat((int) (bVar.e() >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (bVar.e() & 4294967295L))) & 4294967295L), this.i, this.f22358j, this.f22356g, 328);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (l.a(this.e, aVar.e) && j.a(0L, 0L) && y2.l.c(this.f22355f, aVar.f22355f) && this.f22356g == aVar.f22356g) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f22356g) + p.a.d(this.f22355f, p.a.d(0L, this.e.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("BitmapPainter(image=");
        sb2.append(this.e);
        sb2.append(", srcOffset=");
        sb2.append((Object) j.d(0L));
        sb2.append(", srcSize=");
        sb2.append((Object) y2.l.d(this.f22355f));
        sb2.append(", filterQuality=");
        int i = this.f22356g;
        if (i == 0) {
            str = "None";
        } else if (i == 1) {
            str = "Low";
        } else if (i == 2) {
            str = "Medium";
        } else if (i == 3) {
            str = "High";
        } else {
            str = "Unknown";
        }
        sb2.append((Object) str);
        sb2.append(')');
        return sb2.toString();
    }
}
