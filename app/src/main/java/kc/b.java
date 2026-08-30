package kc;

import b6.f;
import com.google.android.gms.internal.ads.xe;
import com.google.android.gms.internal.mlkit_vision_digital_ink.lw;
import ib.h;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import oc.q;
import oc.y;

/* loaded from: classes.dex */
public final class b implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f19767a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f19768b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lw f19769c;

    public b(boolean z3, q qVar, lw lwVar) {
        this.f19767a = z3;
        this.f19768b = qVar;
        this.f19769c = lwVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (this.f19767a) {
            q qVar = this.f19768b;
            ExecutorService executorService = qVar.f21926l;
            xe xeVar = new xe(26, qVar, this.f19769c, false);
            ExecutorService executorService2 = y.f21955a;
            executorService.execute(new f(3, xeVar, executorService, new h()));
            return null;
        }
        return null;
    }
}
