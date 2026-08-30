package y8;

import android.view.TextureView;
import b6.u;
import com.google.android.filament.Engine;
import com.google.android.filament.SwapChain;
import u7.l2;
import u7.q7;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public TextureView f30994a;

    /* renamed from: b, reason: collision with root package name */
    public u f30995b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f30996c;

    /* renamed from: d, reason: collision with root package name */
    public b f30997d;

    public final void a() {
        u uVar = this.f30995b;
        if (uVar != null) {
            Engine engine = (Engine) uVar.f1782v;
            ((q7) uVar.f1784x).a();
            l2 l2Var = (l2) uVar.f1781u;
            if (l2Var.f26441f != null) {
                engine.y();
                SwapChain swapChain = l2Var.f26441f;
                swapChain.getClass();
                engine.u(swapChain);
                l2Var.f26441f = null;
            }
        }
        this.f30996c = false;
    }

    public final boolean b() {
        return this.f30996c;
    }
}
