package oc;
import p.a;

import android.util.Log;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class u extends c {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f21942u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ ExecutorService f21943v;

    public u(String str, ExecutorService executorService) {
        this.f21942u = str;
        this.f21943v = executorService;
    }

    @Override // oc.c
    public final void a() {
        String str = this.f21942u;
        ExecutorService executorService = this.f21943v;
        try {
            String concat = "Executing shutdown hook for ".concat(str);
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", concat, null);
            }
            executorService.shutdown();
            if (!executorService.awaitTermination(2L, TimeUnit.SECONDS)) {
                String concat2 = str.concat(" did not shut down in the allocated time. Requesting immediate shutdown.");
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", concat2, null);
                }
                executorService.shutdownNow();
            }
        } catch (InterruptedException unused) {
            Locale locale = Locale.US;
            String k3 = a.k("Interrupted while waiting for ", str, " to shut down. Requesting immediate shutdown.");
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", k3, null);
            }
            executorService.shutdownNow();
        }
    }
}
