package t6;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import java.util.Map;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final Object f25647d = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Context f25648a;

    /* renamed from: b, reason: collision with root package name */
    public final String f25649b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f25650c;

    public a(Drawable.Callback callback, Map map) {
        if (TextUtils.isEmpty(null)) {
            this.f25649b = null;
            this.f25650c = map;
            if (!(callback instanceof View)) {
                this.f25648a = null;
                return;
            } else {
                this.f25648a = ((View) callback).getContext().getApplicationContext();
                return;
            }
        }
        throw null;
    }
}
