package c;
import l.a;

import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.r0;

/* loaded from: classes.dex */
public final class n extends kotlin.jvm.internal.m implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f3261u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ o f3262v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(o oVar, int i) {
        super(0);
        this.f3261u = i;
        this.f3262v = oVar;
    }

    @Override // df.a
    public final Object invoke() {
        Bundle bundle;
        switch (this.f3261u) {
            case 0:
                o oVar = this.f3262v;
                Application application = oVar.getApplication();
                if (oVar.getIntent() != null) {
                    bundle = oVar.getIntent().getExtras();
                } else {
                    bundle = null;
                }
                return new r0(application, oVar, bundle);
            case 1:
                this.f3262v.reportFullyDrawn();
                return pe.z.f22715a;
            case 2:
                o oVar2 = this.f3262v;
                return new x(oVar2.f3267z, new n(oVar2, 1));
            default:
                o oVar3 = this.f3262v;
                g0 g0Var = new g0(new d(oVar3, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (!kotlin.jvm.internal.a(Looper.myLooper(), Looper.getMainLooper())) {
                        new Handler(Looper.getMainLooper()).post(new b6.g(oVar3, 2, g0Var));
                    } else {
                        oVar3.f16650u.a(new h(g0Var, 0, oVar3));
                    }
                }
                return g0Var;
        }
    }
}
