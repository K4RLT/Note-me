package q;

/* loaded from: classes.dex */
public interface g {
    boolean a();

    long b();

    l1 c();

    q d(long j10);

    default boolean e(long j10) {
        if (j10 >= b()) {
            return true;
        }
        return false;
    }

    Object f(long j10);

    Object g();
}
