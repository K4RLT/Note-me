package o0;
import f0.d;
import k1.e;
import l.a;

/* loaded from: classes.dex */
public final class l1 {

    /* renamed from: a, reason: collision with root package name */
    public final d f21551a;

    /* renamed from: b, reason: collision with root package name */
    public final d f21552b;

    /* renamed from: c, reason: collision with root package name */
    public final d f21553c;

    /* renamed from: d, reason: collision with root package name */
    public final d f21554d;
    public final d e;

    public l1() {
        d dVar = k1.f21542a;
        d dVar2 = k1.f21543b;
        d dVar3 = k1.f21544c;
        d dVar4 = k1.f21545d;
        d dVar5 = e;
        this.f21551a = dVar;
        this.f21552b = dVar2;
        this.f21553c = dVar3;
        this.f21554d = dVar4;
        this.e = dVar5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj;
        if (kotlin.jvm.internal.a(this.f21551a, l1Var.f21551a) && kotlin.jvm.internal.a(this.f21552b, l1Var.f21552b) && kotlin.jvm.internal.a(this.f21553c, l1Var.f21553c) && kotlin.jvm.internal.a(this.f21554d, l1Var.f21554d) && kotlin.jvm.internal.a(this.e, l1Var.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.f21554d.hashCode() + ((this.f21553c.hashCode() + ((this.f21552b.hashCode() + (this.f21551a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.f21551a + ", small=" + this.f21552b + ", medium=" + this.f21553c + ", large=" + this.f21554d + ", extraLarge=" + this.e + ')';
    }
}
