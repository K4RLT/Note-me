package com.google.android.gms.internal.ads;
import j9.d;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;

/* loaded from: classes.dex */
public final class c00 implements DialogInterface.OnCancelListener {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f4931u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f4932v;

    public /* synthetic */ c00(int i, Object obj) {
        this.f4931u = i;
        this.f4932v = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f4931u) {
            case 0:
                ((JsResult) this.f4932v).cancel();
                return;
            case 1:
                ((JsPromptResult) this.f4932v).cancel();
                return;
            default:
                j9.d dVar = (j9.d) this.f4932v;
                if (dVar != null) {
                    dVar.l();
                    return;
                }
                return;
        }
    }
}
