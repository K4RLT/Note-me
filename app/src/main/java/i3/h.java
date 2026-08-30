package i3;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f18188a;

    /* renamed from: b, reason: collision with root package name */
    public final Configuration f18189b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18190c;

    public h(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        int hashCode;
        this.f18188a = colorStateList;
        this.f18189b = configuration;
        if (theme == null) {
            hashCode = 0;
        } else {
            hashCode = theme.hashCode();
        }
        this.f18190c = hashCode;
    }
}
