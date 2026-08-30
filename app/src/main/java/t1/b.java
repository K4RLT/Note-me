package t1;

import android.view.KeyEvent;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final KeyEvent f25635a;

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            if (!l.a(this.f25635a, ((b) obj).f25635a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f25635a.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.f25635a + ')';
    }
}
