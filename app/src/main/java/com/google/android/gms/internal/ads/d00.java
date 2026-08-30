package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* loaded from: classes.dex */
public final class d00 implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5239a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ JsResult f5240b;

    public /* synthetic */ d00(JsResult jsResult, int i) {
        this.f5239a = i;
        this.f5240b = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f5239a) {
            case 0:
                this.f5240b.cancel();
                return;
            default:
                this.f5240b.confirm();
                return;
        }
    }
}
