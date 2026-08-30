package i3;

import android.content.res.Resources;
import java.util.Objects;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f18191a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources.Theme f18192b;

    public i(Resources resources, Resources.Theme theme) {
        this.f18191a = resources;
        this.f18192b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (this.f18191a.equals(iVar.f18191a) && Objects.equals(this.f18192b, iVar.f18192b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f18191a, this.f18192b);
    }
}
