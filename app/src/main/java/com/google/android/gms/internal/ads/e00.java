package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.Intent;
import android.webkit.JsPromptResult;
import android.widget.EditText;

/* loaded from: classes.dex */
public final class e00 implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5567a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5568b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5569c;

    public /* synthetic */ e00(Object obj, int i, Object obj2) {
        this.f5567a = i;
        this.f5568b = obj;
        this.f5569c = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f5567a) {
            case 0:
                ((JsPromptResult) this.f5568b).confirm(((EditText) this.f5569c).getText().toString());
                return;
            default:
                k9.g gVar = (k9.g) this.f5568b;
                String str = (String) this.f5569c;
                k9.f0 f0Var = f9.k.C.f16813c;
                k9.f0.s(gVar.f19686a, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str), "Share via"));
                return;
        }
    }
}
