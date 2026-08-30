package c2;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Build;

/* loaded from: classes.dex */
public final class h implements k1 {

    /* renamed from: a, reason: collision with root package name */
    public final i f3547a;

    public h(i iVar) {
        this.f3547a = iVar;
    }

    public final void a(j1 j1Var) {
        ClipboardManager clipboardManager = this.f3547a.f3553a;
        if (j1Var == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                clipboardManager.clearPrimaryClip();
                return;
            } else {
                clipboardManager.setPrimaryClip(ClipData.newPlainText("", ""));
                return;
            }
        }
        clipboardManager.setPrimaryClip(j1Var.f3561a);
    }
}
