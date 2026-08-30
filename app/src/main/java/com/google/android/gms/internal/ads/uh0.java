package com.google.android.gms.internal.ads;
import j9.d;

import android.content.DialogInterface;
import java.util.HashMap;

/* loaded from: classes.dex */
public final /* synthetic */ class uh0 implements DialogInterface.OnCancelListener {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f11637u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ wh0 f11638v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f11639w;

    public /* synthetic */ uh0(wh0 wh0Var, d dVar, int i) {
        this.f11637u = i;
        this.f11638v = wh0Var;
        this.f11639w = dVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final /* synthetic */ void onCancel(DialogInterface dialogInterface) {
        switch (this.f11637u) {
            case 0:
                wh0 wh0Var = this.f11638v;
                wh0Var.f12245y.j(wh0Var.f12246z);
                HashMap hashMap = new HashMap();
                hashMap.put("dialog_action", "dismiss");
                wh0Var.B4(wh0Var.f12246z, "dialog_click", hashMap);
                d dVar = this.f11639w;
                if (dVar != null) {
                    dVar.l();
                    return;
                }
                return;
            default:
                wh0 wh0Var2 = this.f11638v;
                wh0Var2.f12245y.j(wh0Var2.f12246z);
                HashMap hashMap2 = new HashMap();
                hashMap2.put("dialog_action", "dismiss");
                wh0Var2.B4(wh0Var2.f12246z, "rtsdc", hashMap2);
                d dVar2 = this.f11639w;
                if (dVar2 != null) {
                    dVar2.l();
                    return;
                }
                return;
        }
    }
}
