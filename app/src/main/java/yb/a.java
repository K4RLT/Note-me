package yb;

/* loaded from: classes.dex */
public final class a extends b {

    /* renamed from: u, reason: collision with root package name */
    public static final a f31630u = new Object();

    @Override // yb.b
    public final Object a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // yb.b
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
