package uf;
import l.a;

/* loaded from: classes.dex */
public final class w implements te.f {

    /* renamed from: u, reason: collision with root package name */
    public final ThreadLocal f27246u;

    public w(ThreadLocal threadLocal) {
        this.f27246u = threadLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof w) && kotlin.jvm.internal.a(this.f27246u, ((w) obj).f27246u)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f27246u.hashCode();
    }

    public final String toString() {
        return "ThreadLocalKey(threadLocal=" + this.f27246u + ')';
    }
}
