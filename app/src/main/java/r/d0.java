package r;

import android.content.Context;
import android.widget.EdgeEffect;
import ya.pd;

/* loaded from: classes.dex */
public final class d0 extends EdgeEffect {

    /* renamed from: a, reason: collision with root package name */
    public final float f24053a;

    /* renamed from: b, reason: collision with root package name */
    public float f24054b;

    public d0(Context context) {
        super(context);
        this.f24053a = pd.a(context).f30802u * 1;
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i) {
        this.f24054b = 0.0f;
        super.onAbsorb(i);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f10, float f11) {
        this.f24054b = 0.0f;
        super.onPull(f10, f11);
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        this.f24054b = 0.0f;
        super.onRelease();
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f10) {
        this.f24054b = 0.0f;
        super.onPull(f10);
    }
}
