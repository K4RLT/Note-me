package eg;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class o extends s0 {

    /* renamed from: a, reason: collision with root package name */
    public double[] f16553a;

    /* renamed from: b, reason: collision with root package name */
    public int f16554b;

    @Override // eg.s0
    public final Object a() {
        return Arrays.copyOf(this.f16553a, this.f16554b);
    }

    @Override // eg.s0
    public final void b(int i) {
        double[] dArr = this.f16553a;
        if (dArr.length < i) {
            int length = dArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f16553a = Arrays.copyOf(dArr, i);
        }
    }

    @Override // eg.s0
    public final int d() {
        return this.f16554b;
    }
}
