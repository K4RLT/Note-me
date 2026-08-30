package eg;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class i0 extends s0 {

    /* renamed from: a, reason: collision with root package name */
    public long[] f16527a;

    /* renamed from: b, reason: collision with root package name */
    public int f16528b;

    @Override // eg.s0
    public final Object a() {
        return Arrays.copyOf(this.f16527a, this.f16528b);
    }

    @Override // eg.s0
    public final void b(int i) {
        long[] jArr = this.f16527a;
        if (jArr.length < i) {
            int length = jArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f16527a = Arrays.copyOf(jArr, i);
        }
    }

    @Override // eg.s0
    public final int d() {
        return this.f16528b;
    }
}
