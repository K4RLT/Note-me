package q2;
import a.a;
import l.b;
import m.h;

/* loaded from: classes.dex */
public final class s implements Comparable {
    public static final s A;
    public static final s B;
    public static final s C;
    public static final s D;

    /* renamed from: v, reason: collision with root package name */
    public static final s f23364v;

    /* renamed from: w, reason: collision with root package name */
    public static final s f23365w;

    /* renamed from: x, reason: collision with root package name */
    public static final s f23366x;

    /* renamed from: y, reason: collision with root package name */
    public static final s f23367y;

    /* renamed from: z, reason: collision with root package name */
    public static final s f23368z;

    /* renamed from: u, reason: collision with root package name */
    public final int f23369u;

    static {
        s sVar = new s(100);
        s sVar2 = new s(200);
        s sVar3 = new s(300);
        s sVar4 = new s(400);
        f23364v = sVar4;
        s sVar5 = new s(500);
        f23365w = sVar5;
        s sVar6 = new s(600);
        f23366x = sVar6;
        s sVar7 = new s(700);
        s sVar8 = new s(800);
        s sVar9 = new s(900);
        f23367y = sVar4;
        f23368z = sVar5;
        A = sVar6;
        B = sVar7;
        C = sVar8;
        D = sVar9;
        qe.h(sVar, sVar2, sVar3, sVar4, sVar5, sVar6, sVar7, sVar8, sVar9);
    }

    public s(int i) {
        this.f23369u = i;
        boolean z3 = false;
        if (1 <= i && i < 1001) {
            z3 = true;
        }
        if (!z3) {
            s2.a("Font weight can be in range [1, 1000]. Current value: " + i);
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(s sVar) {
        return kotlin.jvm.internal.b(this.f23369u, sVar.f23369u);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        if (this.f23369u == ((s) obj).f23369u) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f23369u;
    }

    public final String toString() {
        return a5.a.i(new StringBuilder("FontWeight(weight="), this.f23369u, ')');
    }
}
