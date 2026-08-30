package c2;

import android.content.ClipboardManager;
import android.content.Context;

/* loaded from: classes.dex */
public final class i implements l1 {

    /* renamed from: a, reason: collision with root package name */
    public final ClipboardManager f3553a;

    public i(Context context) {
        Object systemService = context.getSystemService("clipboard");
        systemService.getClass();
        this.f3553a = (ClipboardManager) systemService;
    }
}
