package m6;

import android.os.Handler;
import android.os.Looper;
import eb.z1;
import g5.d0;
import java.util.concurrent.ExecutorService;
import pf.b0;
import pf.v;

/* loaded from: classes.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f20613a;

    /* renamed from: b, reason: collision with root package name */
    public final v f20614b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f20615c = new Handler(Looper.getMainLooper());

    /* renamed from: d, reason: collision with root package name */
    public final z1 f20616d = new z1(2, this);

    public b(ExecutorService executorService) {
        d0 d0Var = new d0(executorService, 1);
        this.f20613a = d0Var;
        this.f20614b = b0.m(d0Var);
    }
}
