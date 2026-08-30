package c2;
import v1.a;
import v1.p;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;
import com.facebook.ads.AdError;

/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final l0 f3568a = new Object();

    public final void a(View view, p pVar) {
        PointerIcon systemIcon;
        Context context = view.getContext();
        if (pVar instanceof a) {
            systemIcon = PointerIcon.getSystemIcon(context, ((a) pVar).f27286b);
        } else {
            systemIcon = PointerIcon.getSystemIcon(context, AdError.NETWORK_ERROR_CODE);
        }
        if (!kotlin.jvm.internal.l.a(view.getPointerIcon(), systemIcon)) {
            view.setPointerIcon(systemIcon);
        }
    }
}
