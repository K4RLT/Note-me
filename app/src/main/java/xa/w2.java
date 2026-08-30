package xa;

import java.util.BitSet;

/* loaded from: classes.dex */
public final class w2 extends u2 {

    /* renamed from: c, reason: collision with root package name */
    public final char[] f30697c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f30698d;
    public final long e;

    public w2(char[] cArr, long j10, boolean z3, String str) {
        super(str);
        this.f30697c = cArr;
        this.e = j10;
        this.f30698d = z3;
    }

    @Override // xa.u0
    public final void j(BitSet bitSet) {
        int i = 0;
        if (this.f30698d) {
            bitSet.set(0);
        }
        while (true) {
            char[] cArr = this.f30697c;
            if (i < cArr.length) {
                char c10 = cArr[i];
                if (c10 != 0) {
                    bitSet.set(c10);
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override // xa.u0
    public final boolean t(char c10) {
        if (c10 == 0) {
            return this.f30698d;
        }
        if (((this.e >> c10) & 1) == 1) {
            int rotateLeft = Integer.rotateLeft(11601 * c10, 15) * 461845907;
            char[] cArr = this.f30697c;
            int length = cArr.length - 1;
            int i = rotateLeft & length;
            int i10 = i;
            do {
                char c11 = cArr[i10];
                if (c11 != 0) {
                    if (c11 == c10) {
                        return true;
                    }
                    i10 = (i10 + 1) & length;
                } else {
                    return false;
                }
            } while (i10 != i);
            return false;
        }
        return false;
    }
}
