package qb;
import b.a;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.SystemClock;
import com.google.android.gms.internal.mlkit_vision_digital_ink.ml;
import java.util.concurrent.ConcurrentHashMap;
import q.x;

/* loaded from: classes.dex */
public final class d implements q {

    /* renamed from: a, reason: collision with root package name */
    public final Context f23626a;

    /* renamed from: b, reason: collision with root package name */
    public final l f23627b;

    /* renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f23628c = new ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public c f23629d;

    /* JADX WARN: Type inference failed for: r1v0, types: [qb.j, java.lang.Object] */
    public d(Context context, Intent intent) {
        this.f23626a = context;
        if (za.a(context)) {
            this.f23627b = new l(context.getApplicationContext(), "HsdpService", intent, new Object());
        } else {
            x.o("HSDP service is not available.");
            throw null;
        }
    }

    public static void b(d dVar, String str, int i, Runnable runnable) {
        ((Handler) dVar.f23627b.f23647a.zza()).post(new ml(i, 4, dVar, runnable, str));
    }

    public final void a(String str, String str2, IBinder iBinder, int i, int i10, boolean z3, a aVar) {
        i iVar = (i) this.f23628c.putIfAbsent(str, new i(str, aVar));
        if (iVar != null) {
            iVar.f23643b = aVar;
        }
        Bundle bundle = new Bundle();
        bundle.putBinder("windowToken", iBinder);
        bundle.putInt("clientWindowWidthPx", i);
        bundle.putInt("clientWindowHeightPx", i10);
        bundle.putString("sdkVersion", "2.0.0");
        bundle.putLong("requestTimestampMs", SystemClock.elapsedRealtime());
        bundle.putBoolean("autoTrigger", z3);
        this.f23627b.a(new b9.a(this, str, str2, bundle, 12));
    }
}
