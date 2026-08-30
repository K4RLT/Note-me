package l3;

import android.os.LocaleList;
import java.util.Locale;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final d f19885a;

    static {
        new LocaleList(new Locale[0]);
    }

    public c(d dVar) {
        this.f19885a = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            if (this.f19885a.equals(((c) obj).f19885a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f19885a.f19886a.hashCode();
    }

    public final String toString() {
        return this.f19885a.f19886a.toString();
    }
}
