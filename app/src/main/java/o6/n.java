package o6;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final a f21832a;

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f21833b;

    public n(a aVar) {
        this.f21832a = aVar;
        this.f21833b = null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof n) {
                n nVar = (n) obj;
                a aVar = this.f21832a;
                if (aVar != null && aVar.equals(nVar.f21832a)) {
                    return true;
                }
                Throwable th = this.f21833b;
                if (th != null && nVar.f21833b != null) {
                    return th.toString().equals(th.toString());
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f21832a, this.f21833b});
    }

    public n(Throwable th) {
        this.f21833b = th;
        this.f21832a = null;
    }
}
