package eg;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class v extends s0 {

    /* renamed from: a, reason: collision with root package name */
    public float[] f16588a;

    /* renamed from: b, reason: collision with root package name */
    public int f16589b;

    @Override // eg.s0
    public final Object a() {
        return Arrays.copyOf(this.f16588a, this.f16589b);
    }

    @Override // eg.s0
    public final void b(int i) {
        float[] fArr = this.f16588a;
        if (fArr.length < i) {
            int length = fArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f16588a = Arrays.copyOf(fArr, i);
        }
    }

    @Override // eg.s0
    public final int d() {
        return this.f16589b;
    }
}
