package d1;

/* loaded from: classes.dex */
public interface p extends r {
    @Override // d1.r
    default boolean a(df.l lVar) {
        return ((Boolean) lVar.invoke(this)).booleanValue();
    }

    @Override // d1.r
    default Object b(df.p pVar, Object obj) {
        return pVar.invoke(obj, this);
    }
}
