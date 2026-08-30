package eg;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class f1 extends s0 {

    /* renamed from: a, reason: collision with root package name */
    public int[] f16514a;

    /* renamed from: b, reason: collision with root package name */
    public int f16515b;

    @Override // eg.s0
    public final Object a() {
        return new pe.t(Arrays.copyOf(this.f16514a, this.f16515b));
    }

    @Override // eg.s0
    public final void b(int i) {
        int[] iArr = this.f16514a;
        if (iArr.length < i) {
            int length = iArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f16514a = Arrays.copyOf(iArr, i);
        }
    }

    @Override // eg.s0
    public final int d() {
        return this.f16515b;
    }
}
