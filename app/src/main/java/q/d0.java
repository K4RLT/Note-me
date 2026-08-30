package q;
import q.k;
import q.n1;

/* loaded from: classes.dex */
public final class d0 implements k {

    /* renamed from: a, reason: collision with root package name */
    public final v f22871a;

    /* renamed from: b, reason: collision with root package name */
    public final o0 f22872b;

    /* renamed from: c, reason: collision with root package name */
    public final long f22873c;

    public d0(v vVar, o0 o0Var, long j10) {
        this.f22871a = vVar;
        this.f22872b = o0Var;
        this.f22873c = j10;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [n1, com.google.android.gms.internal.ads.d6, java.lang.Object] */
    @Override // k
    public final n1 a(l1 l1Var) {
        p1 a10 = this.f22871a.a(l1Var);
        Object obj = new Object();
        obj.f5317w = a10;
        obj.f5318x = this.f22872b;
        obj.f5315u = (a10.s() + a10.q()) * 1000000;
        obj.f5316v = this.f22873c * 1000000;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d0) {
            d0 d0Var = (d0) obj;
            if (d0Var.f22871a.equals(this.f22871a) && d0Var.f22872b == this.f22872b && d0Var.f22873c == this.f22873c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f22873c) + ((this.f22872b.hashCode() + (this.f22871a.hashCode() * 31)) * 31);
    }
}