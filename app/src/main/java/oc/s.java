package oc;

import android.util.Log;
import com.google.android.gms.internal.mlkit_vision_digital_ink.lw;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class s implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final k6.i f21937a;

    /* renamed from: b, reason: collision with root package name */
    public final lw f21938b;

    /* renamed from: c, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f21939c;

    /* renamed from: d, reason: collision with root package name */
    public final lc.b f21940d;
    public final AtomicBoolean e = new AtomicBoolean(false);

    public s(k6.i iVar, lw lwVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, lc.b bVar) {
        this.f21937a = iVar;
        this.f21938b = lwVar;
        this.f21939c = uncaughtExceptionHandler;
        this.f21940d = bVar;
    }

    public final boolean a(Thread thread, Throwable th) {
        if (thread == null) {
            Log.e("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null thread", null);
            return false;
        }
        if (th == null) {
            Log.e("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null throwable", null);
            return false;
        }
        if (this.f21940d.b()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; native crash exists for session.", null);
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
    
        r0.uncaughtException(r10, r11);
        r4.set(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
    
        if (android.util.Log.isLoggable("FirebaseCrashlytics", 3) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0030, code lost:
    
        if (android.util.Log.isLoggable("FirebaseCrashlytics", 3) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0032, code lost:
    
        android.util.Log.d("FirebaseCrashlytics", "Completed exception processing. Invoking default exception handler.", null);
     */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void uncaughtException(java.lang.Thread r10, java.lang.Throwable r11) {
        /*
            r9 = this;
            java.lang.Thread$UncaughtExceptionHandler r0 = r9.f21939c
            java.lang.String r1 = "Completed exception processing. Invoking default exception handler."
            java.lang.String r2 = "FirebaseCrashlytics"
            r3 = 1
            java.util.concurrent.atomic.AtomicBoolean r4 = r9.e
            r4.set(r3)
            r3 = 3
            r5 = 0
            r6 = 0
            boolean r7 = r9.a(r10, r11)     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L1f
            if (r7 == 0) goto L21
            k6.i r7 = r9.f21937a     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L1f
            com.google.android.gms.internal.mlkit_vision_digital_ink.lw r8 = r9.f21938b     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L1f
            r7.w(r8, r10, r11)     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L1f
            goto L2c
        L1d:
            r7 = move-exception
            goto L48
        L1f:
            r7 = move-exception
            goto L3c
        L21:
            java.lang.String r7 = "Uncaught exception will not be recorded by Crashlytics."
            boolean r8 = android.util.Log.isLoggable(r2, r3)     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L1f
            if (r8 == 0) goto L2c
            android.util.Log.d(r2, r7, r5)     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L1f
        L2c:
            boolean r3 = android.util.Log.isLoggable(r2, r3)
            if (r3 == 0) goto L35
        L32:
            android.util.Log.d(r2, r1, r5)
        L35:
            r0.uncaughtException(r10, r11)
            r4.set(r6)
            return
        L3c:
            java.lang.String r8 = "An error occurred in the uncaught exception handler"
            android.util.Log.e(r2, r8, r7)     // Catch: java.lang.Throwable -> L1d
            boolean r3 = android.util.Log.isLoggable(r2, r3)
            if (r3 == 0) goto L35
            goto L32
        L48:
            boolean r3 = android.util.Log.isLoggable(r2, r3)
            if (r3 == 0) goto L51
            android.util.Log.d(r2, r1, r5)
        L51:
            r0.uncaughtException(r10, r11)
            r4.set(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: oc.s.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }
}
