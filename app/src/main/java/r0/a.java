package r0;
import p.a;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f24176a;

    public a(int i) {
        this.f24176a = i;
    }

    public final boolean a() {
        if (this.f24176a != Integer.MIN_VALUE) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("{ location = ");
        return p.a.j(this.f24176a, " }", sb2);
    }
}
