package com.google.android.gms.internal.ads;
import m.i;
import j6.i;
import k9.f0;
import m.h;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class zr1 extends m.i {

    /* renamed from: v, reason: collision with root package name */
    public final WeakReference f13256v;

    public zr1(cm cmVar) {
        this.f13256v = new WeakReference(cmVar);
    }

    @Override // m.i
    public final void a(m.h hVar) {
        cm cmVar = (cm) this.f13256v.get();
        if (cmVar != null) {
            cmVar.f5119b = hVar;
            try {
                hVar.f20412a.warmup(0L);
            } catch (RemoteException unused) {
            }
            j6.i iVar = cmVar.f5121d;
            if (iVar != null) {
                cm cmVar2 = (cm) iVar.f18924u;
                m.h hVar2 = cmVar2.f5119b;
                if (hVar2 == null) {
                    cmVar2.f5118a = null;
                } else if (cmVar2.f5118a == null) {
                    cmVar2.f5118a = hVar2.c(null);
                }
                d dVar = new d(cmVar2.f5118a);
                k9.f0.z(dVar, (Bundle) iVar.f18925v);
                com.google.android.gms.internal.mlkit_vision_digital_ink.iw a10 = dVar.a();
                Intent intent = (Intent) a10.f14489v;
                Context context = (Context) iVar.f18926w;
                intent.setPackage(so1.a(context));
                intent.setData((Uri) iVar.f18927x);
                context.startActivity(intent, (Bundle) a10.f14490w);
                Activity activity = (Activity) context;
                zr1 zr1Var = cmVar2.f5120c;
                if (zr1Var != null) {
                    activity.unbindService(zr1Var);
                    cmVar2.f5119b = null;
                    cmVar2.f5118a = null;
                    cmVar2.f5120c = null;
                }
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        cm cmVar = (cm) this.f13256v.get();
        if (cmVar != null) {
            cmVar.f5119b = null;
            cmVar.f5118a = null;
        }
    }
}
