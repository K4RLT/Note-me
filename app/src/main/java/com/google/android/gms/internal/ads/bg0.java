package com.google.android.gms.internal.ads;
import c7.f0;

import android.os.Handler;
import android.os.Message;
import java.util.Iterator;

/* loaded from: classes.dex */
public final /* synthetic */ class bg0 implements Handler.Callback {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f4789u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f4790v;

    public /* synthetic */ bg0(int i, Object obj) {
        this.f4789u = i;
        this.f4790v = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f4789u) {
            case 0:
                ig0 ig0Var = (ig0) this.f4790v;
                re0 re0Var = ig0Var.f7133c;
                re0Var.getClass();
                Iterator it = ig0Var.f7134d.iterator();
                while (it.hasNext()) {
                    df0 df0Var = (df0) it.next();
                    if (!df0Var.f5417d && df0Var.f5416c) {
                        jv1 u9 = df0Var.f5415b.u();
                        df0Var.f5415b = new c7.f0(4);
                        df0Var.f5416c = false;
                        re0Var.f(df0Var.f5414a, u9);
                    }
                    io0 io0Var = ig0Var.f7132b;
                    io0Var.getClass();
                    if (io0Var.f7185a.hasMessages(1)) {
                        return true;
                    }
                }
                return true;
            default:
                com.google.android.gms.internal.mlkit_vision_digital_ink.lw lwVar = (com.google.android.gms.internal.mlkit_vision_digital_ink.lw) this.f4790v;
                int i = message.what;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                return false;
                            }
                            ((gn0) lwVar.C).a();
                            return true;
                        }
                        ((an0) lwVar.B).a();
                        return true;
                    }
                    ((wm0) lwVar.A).a();
                    return true;
                }
                ((qm0) lwVar.f14648z).a();
                return true;
        }
    }
}
