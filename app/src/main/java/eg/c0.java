package eg;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class c0 extends s0 {

    /* renamed from: a, reason: collision with root package name */
    public int[] f16497a;

    /* renamed from: b, reason: collision with root package name */
    public int f16498b;

    @Override // eg.s0
    public final Object a() {
        return Arrays.copyOf(this.f16497a, this.f16498b);
    }

    @Override // eg.s0
    public final void b(int i) {
        int[] iArr = this.f16497a;
        if (iArr.length < i) {
            int length = iArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f16497a = Arrays.copyOf(iArr, i);
        }
    }

    @Override // eg.s0
    public final int d() {
        return this.f16498b;
    }
}
