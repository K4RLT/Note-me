package a6;
import x.n;
import q.x;

import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.work.WorkerParameters;
import com.google.android.gms.internal.consent_sdk.g7;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: u, reason: collision with root package name */
    public final Context f282u;

    /* renamed from: v, reason: collision with root package name */
    public final WorkerParameters f283v;

    /* renamed from: w, reason: collision with root package name */
    public volatile int f284w = -256;

    /* renamed from: x, reason: collision with root package name */
    public boolean f285x;

    public p(Context context, WorkerParameters workerParameters) {
        if (context != null) {
            if (workerParameters != null) {
                this.f282u = context;
                this.f283v = workerParameters;
                return;
            } else {
                x.n("WorkerParameters is null");
                throw null;
            }
        }
        x.n("Application Context is null");
        throw null;
    }

    public final Context getApplicationContext() {
        return this.f282u;
    }

    public Executor getBackgroundExecutor() {
        return this.f283v.f1105f;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l6.j, java.lang.Object, ac.b] */
    public ac.b getForegroundInfoAsync() {
        Object obj = new Object();
        obj.l(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return obj;
    }

    public final UUID getId() {
        return this.f283v.f1101a;
    }

    public final g getInputData() {
        return this.f283v.f1102b;
    }

    public final Network getNetwork() {
        return (Network) this.f283v.f1104d.f24677x;
    }

    public final int getRunAttemptCount() {
        return this.f283v.e;
    }

    public final int getStopReason() {
        return this.f284w;
    }

    public final Set<String> getTags() {
        return this.f283v.f1103c;
    }

    public m6.a getTaskExecutor() {
        return this.f283v.f1106g;
    }

    public final List<String> getTriggeredContentAuthorities() {
        return (List) this.f283v.f1104d.f24675v;
    }

    public final List<Uri> getTriggeredContentUris() {
        return (List) this.f283v.f1104d.f24676w;
    }

    public z getWorkerFactory() {
        return this.f283v.f1107h;
    }

    public final boolean isStopped() {
        if (this.f284w != -256) {
            return true;
        }
        return false;
    }

    public final boolean isUsed() {
        return this.f285x;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, ac.b] */
    public final ac.b setForegroundAsync(h hVar) {
        k6.r rVar = this.f283v.f1108j;
        Context applicationContext = getApplicationContext();
        UUID id2 = getId();
        rVar.getClass();
        Object obj = new Object();
        rVar.f19581a.a(new g7(rVar, obj, id2, hVar, applicationContext, 5, false));
        return obj;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, ac.b] */
    public ac.b setProgressAsync(g gVar) {
        k6.s sVar = this.f283v.i;
        getApplicationContext();
        UUID id2 = getId();
        sVar.getClass();
        Object obj = new Object();
        sVar.f19586b.a(new b9.a(sVar, id2, gVar, obj, 7, false));
        return obj;
    }

    public final void setUsed() {
        this.f285x = true;
    }

    public abstract ac.b startWork();

    public final void stop(int i) {
        this.f284w = i;
        onStopped();
    }

    public void onStopped() {
    }
}