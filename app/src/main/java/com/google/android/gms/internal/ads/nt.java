package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* loaded from: classes.dex */
public final class nt implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8842a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8843b;

    public /* synthetic */ nt(int i, Object obj) {
        this.f8842a = i;
        this.f8843b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f8842a) {
            case 0:
                ((ot) this.f8843b).n("User canceled the download.");
                return;
            default:
                ((JsPromptResult) this.f8843b).cancel();
                return;
        }
    }
}
