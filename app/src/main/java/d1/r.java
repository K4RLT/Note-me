package d1;

/* loaded from: classes.dex */
public interface r {
    boolean a(df.l lVar);

    Object b(df.p pVar, Object obj);

    default r d(r rVar) {
        if (rVar == o.f15687a) {
            return this;
        }
        return new l(this, rVar);
    }
}
