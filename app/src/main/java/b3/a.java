package b3;

import androidx.graphics.lowlatency.CanvasFrontBufferedRenderer;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f1639u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ df.a f1640v;

    public /* synthetic */ a(int i, df.a aVar) {
        this.f1639u = i;
        this.f1640v = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1639u) {
            case 0:
                this.f1640v.invoke();
                return;
            case 1:
                this.f1640v.invoke();
                return;
            case 2:
                this.f1640v.invoke();
                return;
            case 3:
                this.f1640v.invoke();
                return;
            case 4:
                this.f1640v.invoke();
                return;
            default:
                CanvasFrontBufferedRenderer.b(this.f1640v);
                return;
        }
    }
}
