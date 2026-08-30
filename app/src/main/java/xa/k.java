package xa;
import q.x;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f30441a;

    /* renamed from: b, reason: collision with root package name */
    public int f30442b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f30443c;

    /* renamed from: d, reason: collision with root package name */
    public Object[] f30444d;
    public int e;

    public static int b(int i, int i10) {
        if (i10 >= 0) {
            if (i10 <= i) {
                return i;
            }
            int i11 = i + (i >> 1) + 1;
            if (i11 < i10) {
                int highestOneBit = Integer.highestOneBit(i10 - 1);
                i11 = highestOneBit + highestOneBit;
            }
            if (i11 < 0) {
                return Integer.MAX_VALUE;
            }
            return i11;
        }
        x.n("cannot store more than Integer.MAX_VALUE elements");
        return 0;
    }

    public final void a(Object obj) {
        int length = this.f30441a.length;
        int b10 = b(length, this.f30442b + 1);
        if (b10 > length || this.f30443c) {
            this.f30441a = Arrays.copyOf(this.f30441a, b10);
            this.f30443c = false;
        }
        Object[] objArr = this.f30441a;
        int i = this.f30442b;
        this.f30442b = i + 1;
        objArr[i] = obj;
    }
}
