package eg;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class y0 extends s0 {

    /* renamed from: a, reason: collision with root package name */
    public short[] f16599a;

    /* renamed from: b, reason: collision with root package name */
    public int f16600b;

    @Override // eg.s0
    public final Object a() {
        return Arrays.copyOf(this.f16599a, this.f16600b);
    }

    @Override // eg.s0
    public final void b(int i) {
        short[] sArr = this.f16599a;
        if (sArr.length < i) {
            int length = sArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f16599a = Arrays.copyOf(sArr, i);
        }
    }

    @Override // eg.s0
    public final int d() {
        return this.f16600b;
    }
}
