package h4;

import androidx.graphics.CanvasBufferedRenderer;
import androidx.graphics.lowlatency.PreservedBufferContentsVerifier;
import androidx.graphics.lowlatency.SingleBufferedCanvasRenderer$mRenderQueue$1;
import df.p;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements p3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17845a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17846b;

    public /* synthetic */ d(int i, Object obj) {
        this.f17845a = i;
        this.f17846b = obj;
    }

    @Override // p3.a
    public final void accept(Object obj) {
        switch (this.f17845a) {
            case 0:
                PreservedBufferContentsVerifier.b((CountDownLatch) this.f17846b, (CanvasBufferedRenderer.RenderResult) obj);
                return;
            default:
                SingleBufferedCanvasRenderer$mRenderQueue$1.a((p) this.f17846b, (CanvasBufferedRenderer.RenderResult) obj);
                return;
        }
    }
}
