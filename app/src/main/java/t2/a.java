package t2;

import java.util.Locale;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Locale f25636a;

    public a(Locale locale) {
        this.f25636a = locale;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return l.a(this.f25636a.toLanguageTag(), ((a) obj).f25636a.toLanguageTag());
    }

    public final int hashCode() {
        return this.f25636a.toLanguageTag().hashCode();
    }

    public final String toString() {
        return this.f25636a.toLanguageTag();
    }
}
