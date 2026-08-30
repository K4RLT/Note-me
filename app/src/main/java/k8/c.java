package k8;

import g5.q;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f19625a;

    public c(String str) {
        if (str != null) {
            this.f19625a = str;
        } else {
            q.h("name is null");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return this.f19625a.equals(((c) obj).f19625a);
    }

    public final int hashCode() {
        return this.f19625a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return a5.a.k(new StringBuilder("Encoding{name=\""), this.f19625a, "\"}");
    }
}
