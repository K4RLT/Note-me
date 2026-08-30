package p5;

/* loaded from: classes.dex */
public interface c extends AutoCloseable {
    String D(int i);

    boolean P();

    void b(int i, long j10);

    void c(double d2, int i);

    void g(int i);

    int getColumnCount();

    String getColumnName(int i);

    double getDouble(int i);

    long getLong(int i);

    void h();

    boolean isNull(int i);

    void reset();

    void s(int i, String str);

    default boolean u() {
        if (getLong(0) == 0) {
            return false;
        }
        return true;
    }
}
