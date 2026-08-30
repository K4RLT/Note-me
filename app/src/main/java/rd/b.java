package rd;

import android.util.Log;
import ib.o;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import wa.h8;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final HashMap f24685d = new HashMap();
    public static final d5.c e = new d5.c(0);

    /* renamed from: a, reason: collision with root package name */
    public final Executor f24686a;

    /* renamed from: b, reason: collision with root package name */
    public final l f24687b;

    /* renamed from: c, reason: collision with root package name */
    public o f24688c = null;

    public b(Executor executor, l lVar) {
        this.f24686a = executor;
        this.f24687b = lVar;
    }

    public static Object a(o oVar) {
        ba.i iVar = new ba.i();
        Executor executor = e;
        oVar.f(executor, iVar);
        oVar.e(executor, iVar);
        oVar.a(executor, iVar);
        if (iVar.f3132u.await(5L, TimeUnit.SECONDS)) {
            if (oVar.l()) {
                return oVar.j();
            }
            throw new ExecutionException(oVar.i());
        }
        throw new TimeoutException("Task await timed out.");
    }

    public final synchronized o b() {
        try {
            o oVar = this.f24688c;
            if (oVar != null) {
                if (oVar.k() && !this.f24688c.l()) {
                }
            }
            this.f24688c = h8.c(new k6.g(3, this.f24687b), this.f24686a);
        } catch (Throwable th) {
            throw th;
        }
        return this.f24688c;
    }

    public final c c() {
        synchronized (this) {
            try {
                o oVar = this.f24688c;
                if (oVar != null && oVar.l()) {
                    return (c) this.f24688c.j();
                }
                try {
                    return (c) a(b());
                } catch (InterruptedException | ExecutionException | TimeoutException e8) {
                    Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", e8);
                    return null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
