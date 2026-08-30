package oc;
import n.a;

import android.util.Log;
import com.google.android.gms.internal.mlkit_vision_digital_ink.gw;
import com.google.android.gms.internal.mlkit_vision_digital_ink.lw;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import wa.h8;

/* loaded from: classes.dex */
public final class k implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f21889a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Throwable f21890b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Thread f21891c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lw f21892d;
    public final /* synthetic */ n e;

    public k(n nVar, long j10, Throwable th, Thread thread, lw lwVar) {
        this.e = nVar;
        this.f21889a = j10;
        this.f21890b = th;
        this.f21891c = thread;
        this.f21892d = lwVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        tc.c cVar;
        String str;
        long j10 = this.f21889a;
        long j11 = j10 / 1000;
        n nVar = this.e;
        String e = nVar.e();
        if (e == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return h8.e(null);
        }
        nVar.f21901c.g();
        g9.n nVar2 = nVar.f21909m;
        nVar2.getClass();
        String concat = "Persisting fatal event for session ".concat(e);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", concat, null);
        }
        nVar2.t(this.f21890b, this.f21891c, e, "crash", j11, true);
        try {
            cVar = nVar.f21904g;
            str = ".ae" + j10;
            cVar.getClass();
        } catch (IOException e8) {
            Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e8);
        }
        if (!new File((File) cVar.f25699w, str).createNewFile()) {
            throw new IOException("Create new file failed.");
        }
        lw lwVar = this.f21892d;
        nVar.c(false, lwVar);
        new e(nVar.f21903f);
        a(nVar, e.f21877b, Boolean.FALSE);
        if (!nVar.f21900b.b()) {
            return h8.e(null);
        }
        Executor executor = (Executor) nVar.e.f21271u;
        return ((ib.h) ((AtomicReference) lwVar.C).get()).f18363a.n(executor, new gw(this, executor, e));
    }
}
