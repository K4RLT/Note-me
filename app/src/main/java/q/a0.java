package q;
import q.k;

/* loaded from: classes.dex */
public interface a0 extends k {
    @Override // k
    default n1 a(l1 l1Var) {
        return new j6.i(this);
    }

    float b(long j10, float f10, float f11, float f12);

    long c(float f10, float f11, float f12);

    default float d(float f10, float f11, float f12) {
        return b(c(f10, f11, f12), f10, f11, f12);
    }

    float e(long j10, float f10, float f11, float f12);
}
