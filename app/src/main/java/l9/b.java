package l9;

import com.google.android.gms.internal.ads.vx;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadPoolExecutor f20034a = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10, TimeUnit.SECONDS, new SynchronousQueue(), new vx("ClientDefault", 1));

    /* renamed from: b, reason: collision with root package name */
    public static final ExecutorService f20035b = Executors.newSingleThreadExecutor(new vx("ClientSingle", 1));
}
