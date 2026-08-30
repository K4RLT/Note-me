package x4;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.o0;
import androidx.lifecycle.z0;
import r0.c0;
import r0.m;
import r0.r;
import u7.c2;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final c0 f30080a = new c0(new c2(27));

    public static z0 a(m mVar) {
        r rVar = (r) mVar;
        z0 z0Var = (z0) rVar.j(f30080a);
        if (z0Var == null) {
            rVar.a0(1260197609);
            z0Var = o0.f((View) rVar.j(AndroidCompositionLocals_androidKt.f645f));
        } else {
            rVar.a0(1260196493);
        }
        rVar.p(false);
        return z0Var;
    }
}
