package qc;

import java.util.List;

/* loaded from: classes.dex */
public final class v0 extends z1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f23950a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23951b;

    /* renamed from: c, reason: collision with root package name */
    public final List f23952c;

    public v0(int i, String str, List list) {
        this.f23950a = str;
        this.f23951b = i;
        this.f23952c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof z1) {
            v0 v0Var = (v0) ((z1) obj);
            if (this.f23950a.equals(v0Var.f23950a) && this.f23951b == v0Var.f23951b && this.f23952c.equals(v0Var.f23952c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f23950a.hashCode() ^ 1000003) * 1000003) ^ this.f23951b) * 1000003) ^ this.f23952c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f23950a + ", importance=" + this.f23951b + ", frames=" + this.f23952c + "}";
    }
}
