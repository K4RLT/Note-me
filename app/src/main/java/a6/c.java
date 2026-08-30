package a6;

import android.net.Uri;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f256a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f257b;

    public c(boolean z3, Uri uri) {
        this.f256a = uri;
        this.f257b = z3;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this != obj) {
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (c.class.equals(cls)) {
                obj.getClass();
                c cVar = (c) obj;
                if (!this.f256a.equals(cVar.f256a) || this.f257b != cVar.f257b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f257b) + (this.f256a.hashCode() * 31);
    }
}
