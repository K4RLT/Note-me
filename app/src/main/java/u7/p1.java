package u7;
import p.a;

import java.io.File;

/* loaded from: classes.dex */
public final class p1 {

    /* renamed from: a, reason: collision with root package name */
    public final File f26703a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26704b;

    /* renamed from: c, reason: collision with root package name */
    public final int f26705c;

    public p1(File file, int i, int i10) {
        this.f26703a = file;
        this.f26704b = i;
        this.f26705c = i10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof p1) {
                p1 p1Var = (p1) obj;
                if (!this.f26703a.equals(p1Var.f26703a) || this.f26704b != p1Var.f26704b || this.f26705c != p1Var.f26705c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f26705c) + a.b(this.f26704b, this.f26703a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImportedItem(file=");
        sb2.append(this.f26703a);
        sb2.append(", w=");
        sb2.append(this.f26704b);
        sb2.append(", h=");
        return a.j(this.f26705c, ")", sb2);
    }
}
