package lb;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final /* synthetic */ class s1 implements ThreadFactory {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ s1 f20271b = new s1(0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ s1 f20272c = new s1(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20273a;

    public /* synthetic */ s1(int i) {
        this.f20273a = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f20273a) {
            case 0:
                return new Thread(runnable, "UpdateListenerExecutor");
            default:
                return new Thread(runnable, "AssetPackBackgroundExecutor");
        }
    }
}
