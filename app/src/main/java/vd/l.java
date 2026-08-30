package vd;
import b0.b;
import b0.x;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import t.m1;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final bc.g f27618a;

    /* renamed from: b, reason: collision with root package name */
    public final xd.g f27619b;

    public l(bc.g gVar, xd.g gVar2, te.g gVar3, l0 l0Var) {
        this.f27618a = gVar;
        this.f27619b = gVar2;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions SDK.");
        gVar.a();
        Context applicationContext = gVar.f3177a.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(n0.f27623u);
            pf.x(pf.b(gVar3), null, new m1(this, gVar3, l0Var, (te.c) null, 14), 3);
        } else {
            Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
        }
    }
}
