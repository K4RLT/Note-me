package m2;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: b, reason: collision with root package name */
    public static final x f20580b = new x(false);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f20581a;

    public x() {
        this.f20581a = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x) {
            if (this.f20581a == ((x) obj).f20581a) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + (Boolean.hashCode(this.f20581a) * 31);
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.f20581a + ", emojiSupportMatch=EmojiSupportMatch.Default)";
    }

    public x(boolean z3) {
        this.f20581a = z3;
    }
}
