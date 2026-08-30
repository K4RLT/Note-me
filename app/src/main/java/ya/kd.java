package ya;
import k1.r;

/* loaded from: classes.dex */
public abstract class kd {
    public static final long a(long j10, float f10) {
        if (!Float.isNaN(f10) && f10 < 1.0f) {
            return r.c(j10, r.d(j10) * f10);
        }
        return j10;
    }
}
