package f5;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import com.facebook.ads.AdError;
import java.util.Random;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements Choreographer.FrameCallback {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f16745u = 0;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f16746v;

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        Handler handler;
        switch (this.f16745u) {
            case 0:
                Context context = (Context) this.f16746v;
                if (Build.VERSION.SDK_INT >= 28) {
                    handler = Handler.createAsync(Looper.getMainLooper());
                } else {
                    handler = new Handler(Looper.getMainLooper());
                }
                handler.postDelayed(new e7.g(context, 1), new Random().nextInt(Math.max(AdError.NETWORK_ERROR_CODE, 1)) + 5000);
                return;
            default:
                ((Runnable) this.f16746v).run();
                return;
        }
    }
}
