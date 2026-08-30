package eg;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class d extends s0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean[] f16501a;

    /* renamed from: b, reason: collision with root package name */
    public int f16502b;

    @Override // eg.s0
    public final Object a() {
        return Arrays.copyOf(this.f16501a, this.f16502b);
    }

    @Override // eg.s0
    public final void b(int i) {
        boolean[] zArr = this.f16501a;
        if (zArr.length < i) {
            int length = zArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f16501a = Arrays.copyOf(zArr, i);
        }
    }

    @Override // eg.s0
    public final int d() {
        return this.f16502b;
    }
}
