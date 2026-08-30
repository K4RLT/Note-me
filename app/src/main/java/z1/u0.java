package z1;
import h1.d;
import n.t0;

/* loaded from: classes.dex */
public final class u0 implements m1 {

    /* renamed from: v, reason: collision with root package name */
    public static final u0 f31896v = new u0(0);

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f31897u;

    public /* synthetic */ u0(int i) {
        this.f31897u = i;
    }

    @Override // z1.m1
    public boolean a(Object obj, Object obj2) {
        return false;
    }

    public long b(long j10, long j11) {
        switch (this.f31897u) {
            case 1:
                float max = Math.max(Float.intBitsToFloat((int) (j11 >> 32)) / Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)) / Float.intBitsToFloat((int) (j10 & 4294967295L)));
                long floatToRawIntBits = (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max) & 4294967295L);
                int i = g1.f31816a;
                return floatToRawIntBits;
            case 2:
                float d2 = d(j10, j11);
                long floatToRawIntBits2 = (Float.floatToRawIntBits(d2) << 32) | (Float.floatToRawIntBits(d2) & 4294967295L);
                int i10 = g1.f31816a;
                return floatToRawIntBits2;
            default:
                if (Float.intBitsToFloat((int) (j10 >> 32)) <= Float.intBitsToFloat((int) (j11 >> 32)) && Float.intBitsToFloat((int) (j10 & 4294967295L)) <= Float.intBitsToFloat((int) (j11 & 4294967295L))) {
                    long floatToRawIntBits3 = (Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & 4294967295L);
                    int i11 = g1.f31816a;
                    return floatToRawIntBits3;
                }
                float d10 = d(j10, j11);
                long floatToRawIntBits4 = (Float.floatToRawIntBits(d10) << 32) | (Float.floatToRawIntBits(d10) & 4294967295L);
                int i12 = g1.f31816a;
                return floatToRawIntBits4;
        }
    }

    @Override // z1.m1
    public void c(t0 t0Var) {
        t0Var.clear();
    }

    public String toString() {
        switch (this.f31897u) {
            case 4:
                return "ReusedSlotId";
            default:
                return super.toString();
        }
    }
}
