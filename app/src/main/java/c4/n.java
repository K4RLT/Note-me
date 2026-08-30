package c4;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;
import com.google.android.play.core.hsdp.service.HsdpDeepLinkServiceFactory;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class n implements j, za.c {

    /* renamed from: u, reason: collision with root package name */
    public final Context f3851u;

    public n(Context context, int i) {
        switch (i) {
            case 1:
                fa.y.h(context);
                Context applicationContext = context.getApplicationContext();
                fa.y.h(applicationContext);
                this.f3851u = applicationContext;
                return;
            default:
                this.f3851u = context.getApplicationContext();
                return;
        }
    }

    @Override // c4.j
    public void a(wa.r rVar) {
        a aVar = new a("EmojiCompatInitializer");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), aVar);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new b6.f(1, this, rVar, threadPoolExecutor));
    }

    public ApplicationInfo b(int i, String str) {
        return this.f3851u.getPackageManager().getApplicationInfo(str, i);
    }

    public PackageInfo c(int i, String str) {
        return this.f3851u.getPackageManager().getPackageInfo(str, i);
    }

    public boolean d() {
        String nameForUid;
        boolean isInstantApp;
        int callingUid = Binder.getCallingUid();
        int myUid = Process.myUid();
        Context context = this.f3851u;
        if (callingUid == myUid) {
            return na.a.c(context);
        }
        if (la.b.h() && (nameForUid = context.getPackageManager().getNameForUid(Binder.getCallingUid())) != null) {
            isInstantApp = context.getPackageManager().isInstantApp(nameForUid);
            return isInstantApp;
        }
        return false;
    }

    @Override // za.c
    public Object zza() {
        return HsdpDeepLinkServiceFactory.lambda$createInternal$1(this.f3851u);
    }

    public /* synthetic */ n(Context context, byte b10) {
        this.f3851u = context;
    }
}
