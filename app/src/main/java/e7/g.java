package e7;
import l.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.google.android.gms.ads.MobileAds;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import pe.z;
import u7.f2;
import u7.v0;
import u7.w0;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f15948u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Context f15949v;

    public /* synthetic */ g(Context context, int i) {
        this.f15948u = i;
        this.f15949v = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object kVar;
        Bitmap bitmap;
        int i = this.f15948u;
        Context context = this.f15949v;
        switch (i) {
            case 0:
                o oVar = o.f15975a;
                try {
                    MobileAds.a(context, new h(context));
                    kVar = z.f22715a;
                } catch (Throwable th) {
                    kVar = new pe.k(th);
                }
                Throwable a10 = pe.a(kVar);
                if (a10 != null) {
                    Log.w("AdsManager", "MobileAds.initialize fallo: " + a10.getMessage());
                    context.getClass();
                    o.d(context);
                    return;
                }
                return;
            case 1:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new g(context, 2));
                return;
            case 2:
                f5.d.t(context, new d5.c(0), f5.d.f16737a, false);
                return;
            default:
                for (v0 v0Var : w0.f26985b) {
                    String str = v0Var.f26938a;
                    String str2 = v0Var.f26940c;
                    if (!str.equals("none")) {
                        ConcurrentHashMap concurrentHashMap = f2.e;
                        if (!concurrentHashMap.containsKey(str)) {
                            if (v0Var.e) {
                                bitmap = f2.c();
                            } else if (str2 != null) {
                                context.getClass();
                                bitmap = f2.e(context, str2);
                            } else {
                                bitmap = null;
                            }
                            if (bitmap != null) {
                                concurrentHashMap.put(str, bitmap);
                            }
                        }
                    }
                }
                return;
        }
    }
}
