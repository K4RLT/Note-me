package c4;
import b.a;
import n.b;

import a0.e0;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import ya.m9;

/* loaded from: classes.dex */
public final class u implements j {
    public ThreadPoolExecutor A;
    public wa.r B;

    /* renamed from: u, reason: collision with root package name */
    public final Context f3864u;

    /* renamed from: v, reason: collision with root package name */
    public final m3.c f3865v;

    /* renamed from: w, reason: collision with root package name */
    public final ed.e f3866w;

    /* renamed from: x, reason: collision with root package name */
    public final Object f3867x = new Object();

    /* renamed from: y, reason: collision with root package name */
    public Handler f3868y;

    /* renamed from: z, reason: collision with root package name */
    public ThreadPoolExecutor f3869z;

    public u(Context context, m3.c cVar) {
        m9.a(context, "Context cannot be null");
        this.f3864u = context.getApplicationContext();
        this.f3865v = cVar;
        this.f3866w = v.f3870d;
    }

    @Override // c4.j
    public final void a(wa.r rVar) {
        synchronized (this.f3867x) {
            this.B = rVar;
        }
        synchronized (this.f3867x) {
            try {
                if (this.B == null) {
                    return;
                }
                if (this.f3869z == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.A = threadPoolExecutor;
                    this.f3869z = threadPoolExecutor;
                }
                this.f3869z.execute(new a6.e(7, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.f3867x) {
            try {
                this.B = null;
                Handler handler = this.f3868y;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f3868y = null;
                ThreadPoolExecutor threadPoolExecutor = this.A;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f3869z = null;
                this.A = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final m3.g c() {
        try {
            ed.e eVar = this.f3866w;
            Context context = this.f3864u;
            m3.c cVar = this.f3865v;
            eVar.getClass();
            Object[] objArr = {cVar};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            e0 a10 = m3.a(context, Collections.unmodifiableList(arrayList));
            int i = a10.f38a;
            if (i == 0) {
                m3.g[] gVarArr = (m3.g[]) a10.f39b.get(0);
                if (gVarArr != null && gVarArr.length != 0) {
                    return gVarArr[0];
                }
                vd.b("fetchFonts failed (empty result)");
                return null;
            }
            vd.b(g3.a.i("fetchFonts failed (", i, ")"));
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            l4.a.k("provider not found", e);
            return null;
        }
    }
}
