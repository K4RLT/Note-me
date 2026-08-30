package a6;

/* loaded from: classes.dex */
public final class m extends o {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return m.class.getName().hashCode();
    }

    public final String toString() {
        return "Retry";
    }
}
