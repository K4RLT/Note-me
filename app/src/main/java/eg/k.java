package eg;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class k extends s0 {

    /* renamed from: a, reason: collision with root package name */
    public char[] f16533a;

    /* renamed from: b, reason: collision with root package name */
    public int f16534b;

    @Override // eg.s0
    public final Object a() {
        return Arrays.copyOf(this.f16533a, this.f16534b);
    }

    @Override // eg.s0
    public final void b(int i) {
        char[] cArr = this.f16533a;
        if (cArr.length < i) {
            int length = cArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f16533a = Arrays.copyOf(cArr, i);
        }
    }

    @Override // eg.s0
    public final int d() {
        return this.f16534b;
    }
}
