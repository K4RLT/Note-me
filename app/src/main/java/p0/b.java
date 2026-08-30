package p0;
import a.a;
import p.a;

/* loaded from: classes.dex */
public final class b implements g {

    /* renamed from: a, reason: collision with root package name */
    public final d1.i f22302a;

    /* renamed from: b, reason: collision with root package name */
    public final d1.i f22303b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22304c;

    public b(d1.i iVar, d1.i iVar2, int i) {
        this.f22302a = iVar;
        this.f22303b = iVar2;
        this.f22304c = i;
    }

    @Override // p0.g
    public final int a(y2.k kVar, long j10, int i) {
        int a10 = this.f22303b.a(0, kVar.b());
        return kVar.f30810b + a10 + (-this.f22302a.a(0, i)) + this.f22304c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (!this.f22302a.equals(bVar.f22302a) || !this.f22303b.equals(bVar.f22303b) || this.f22304c != bVar.f22304c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f22304c) + a.a(Float.hashCode(this.f22302a.f15679a) * 31, 31, this.f22303b.f15679a);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Vertical(menuAlignment=");
        sb2.append(this.f22302a);
        sb2.append(", anchorAlignment=");
        sb2.append(this.f22303b);
        sb2.append(", offset=");
        return a5.a.i(sb2, this.f22304c, ')');
    }
}
