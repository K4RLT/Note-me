package k6;
import q.f;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.internal.ads.iv1;

/* loaded from: classes.dex */
public final class q implements Runnable {
    public static final String A = a6.f("WorkForegroundRunnable");

    /* renamed from: u, reason: collision with root package name */
    public final l6.j f19575u = new Object();

    /* renamed from: v, reason: collision with root package name */
    public final Context f19576v;

    /* renamed from: w, reason: collision with root package name */
    public final j6.p f19577w;

    /* renamed from: x, reason: collision with root package name */
    public final a6.p f19578x;

    /* renamed from: y, reason: collision with root package name */
    public final r f19579y;

    /* renamed from: z, reason: collision with root package name */
    public final m6.a f19580z;

    /* JADX WARN: Type inference failed for: r0v0, types: [l6.j, java.lang.Object] */
    public q(Context context, j6.p pVar, a6.p pVar2, r rVar, m6.b bVar) {
        this.f19576v = context;
        this.f19577w = pVar;
        this.f19578x = pVar2;
        this.f19579y = rVar;
        this.f19580z = bVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [l6.h, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        if (this.f19577w.f18958q && Build.VERSION.SDK_INT < 31) {
            Object obj = new Object();
            m6.b bVar = (m6.b) this.f19580z;
            bVar.f20616d.execute(new b6.g(this, 15, obj));
            obj.a(new iv1(19, this, obj, false), bVar.f20616d);
            return;
        }
        this.f19575u.j(null);
    }
}