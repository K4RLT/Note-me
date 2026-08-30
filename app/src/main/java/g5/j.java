package g5;

import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    public final long[] f17462b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f17463c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f17464d;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f17465f;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f17461a = new ReentrantLock();
    public final ReentrantLock e = new ReentrantLock();

    public j(int i) {
        this.f17462b = new long[i];
        this.f17463c = new boolean[i];
    }
}
