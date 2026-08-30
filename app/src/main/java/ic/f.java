package ic;

import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements gd.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18395a;

    public /* synthetic */ f(int i) {
        this.f18395a = i;
    }

    @Override // gd.b
    public final Object get() {
        switch (this.f18395a) {
            case 0:
                return Collections.EMPTY_SET;
            case 1:
                return null;
            case 2:
                n nVar = ExecutorsRegistrar.f15588a;
                StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                detectNetwork.detectResourceMismatches();
                if (Build.VERSION.SDK_INT >= 26) {
                    detectNetwork.detectUnbufferedIo();
                }
                return new jc.f(Executors.newFixedThreadPool(4, new jc.a("Firebase Background", 10, detectNetwork.penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f15591d.get());
            case 3:
                n nVar2 = ExecutorsRegistrar.f15588a;
                return new jc.f(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new jc.a("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f15591d.get());
            case 4:
                n nVar3 = ExecutorsRegistrar.f15588a;
                return new jc.f(Executors.newCachedThreadPool(new jc.a("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.f15591d.get());
            case 5:
                n nVar4 = ExecutorsRegistrar.f15588a;
                return Executors.newSingleThreadScheduledExecutor(new jc.a("Firebase Scheduler", 0, null));
            default:
                Random random = qd.h.f23991j;
                return null;
        }
    }
}
