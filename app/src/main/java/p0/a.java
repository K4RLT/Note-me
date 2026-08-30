package p0;
import a.a;
import p.a;

/* loaded from: classes.dex */
public final class a implements f {

    /* renamed from: a, reason: collision with root package name */
    public final d1.h f22299a;

    /* renamed from: b, reason: collision with root package name */
    public final d1.h f22300b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22301c;

    public a(d1.h hVar, d1.h hVar2, int i) {
        this.f22299a = hVar;
        this.f22300b = hVar2;
        this.f22301c = i;
    }

    @Override // p0.f
    public final int a(y2.k kVar, long j10, int i, y2.m mVar) {
        int a10 = this.f22300b.a(0, kVar.d(), mVar);
        int i10 = -this.f22299a.a(0, i, mVar);
        y2.m mVar2 = y2.m.f30814u;
        int i11 = this.f22301c;
        if (mVar != mVar2) {
            i11 = -i11;
        }
        return kVar.f30809a + a10 + i10 + i11;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (!this.f22299a.equals(aVar.f22299a) || !this.f22300b.equals(aVar.f22300b) || this.f22301c != aVar.f22301c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f22301c) + p.a.a(Float.hashCode(this.f22299a.f15678a) * 31, 31, this.f22300b.f15678a);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Horizontal(menuAlignment=");
        sb2.append(this.f22299a);
        sb2.append(", anchorAlignment=");
        sb2.append(this.f22300b);
        sb2.append(", offset=");
        return a5.a.i(sb2, this.f22301c, ')');
    }
}
