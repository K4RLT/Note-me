package eg;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class i1 extends s0 {

    /* renamed from: a, reason: collision with root package name */
    public long[] f16529a;

    /* renamed from: b, reason: collision with root package name */
    public int f16530b;

    @Override // eg.s0
    public final Object a() {
        return new pe.v(Arrays.copyOf(this.f16529a, this.f16530b));
    }

    @Override // eg.s0
    public final void b(int i) {
        long[] jArr = this.f16529a;
        if (jArr.length < i) {
            int length = jArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f16529a = Arrays.copyOf(jArr, i);
        }
    }

    @Override // eg.s0
    public final int d() {
        return this.f16530b;
    }
}
