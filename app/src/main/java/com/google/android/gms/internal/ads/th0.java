package com.google.android.gms.internal.ads;
import j9.d;

import android.content.DialogInterface;
import java.util.HashMap;

/* loaded from: classes.dex */
public final /* synthetic */ class th0 implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11345a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wh0 f11346b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f11347c;

    public /* synthetic */ th0(wh0 wh0Var, d dVar, int i) {
        this.f11345a = i;
        this.f11346b = wh0Var;
        this.f11347c = dVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f11345a) {
            case 0:
                wh0 wh0Var = this.f11346b;
                wh0Var.f12245y.j(wh0Var.f12246z);
                HashMap hashMap = new HashMap();
                hashMap.put("dialog_action", "dismiss");
                wh0Var.B4(wh0Var.f12246z, "dialog_click", hashMap);
                d dVar = this.f11347c;
                if (dVar != null) {
                    dVar.l();
                    return;
                }
                return;
            default:
                wh0 wh0Var2 = this.f11346b;
                wh0Var2.f12245y.j(wh0Var2.f12246z);
                HashMap hashMap2 = new HashMap();
                hashMap2.put("dialog_action", "dismiss");
                wh0Var2.B4(wh0Var2.f12246z, "rtsdc", hashMap2);
                d dVar2 = this.f11347c;
                if (dVar2 != null) {
                    dVar2.l();
                    return;
                }
                return;
        }
    }
}
