package eb;

import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.internal.ads.d6;

/* loaded from: classes.dex */
public final class v2 extends z {
    public final d6 A;
    public final j6.c B;

    /* renamed from: x, reason: collision with root package name */
    public bb.a f16440x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f16441y;

    /* renamed from: z, reason: collision with root package name */
    public final pd.c f16442z;

    /* JADX WARN: Type inference failed for: r4v3, types: [com.google.android.gms.internal.ads.d6, java.lang.Object] */
    public v2(d1 d1Var) {
        super(d1Var);
        this.f16441y = true;
        this.f16442z = new pd.c(this);
        Object obj = new Object();
        obj.f5318x = this;
        d1 d1Var2 = (d1) this.f3443v;
        obj.f5317w = new z2(obj, d1Var2, 0);
        d1Var2.H.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        obj.f5315u = elapsedRealtime;
        obj.f5316v = elapsedRealtime;
        this.A = obj;
        this.B = new j6.c(this);
    }

    @Override // eb.z
    public final boolean A() {
        return false;
    }

    public final void B() {
        u();
        if (this.f16440x == null) {
            this.f16440x = new bb.a(Looper.getMainLooper(), 2);
        }
    }
}