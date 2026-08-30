package i0;

import com.google.android.gms.internal.ads.l3;
import java.util.function.IntConsumer;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f18040u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f18041v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f18042w;

    public /* synthetic */ d(Object obj, int i, int i10) {
        this.f18040u = i10;
        this.f18042w = obj;
        this.f18041v = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18040u) {
            case 0:
                ((IntConsumer) this.f18042w).accept(this.f18041v);
                return;
            default:
                ((l3) this.f18042w).k(this.f18041v);
                return;
        }
    }
}
