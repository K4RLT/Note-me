package ca;
import q.k;

/* loaded from: classes.dex */
public final class s extends t {
    public final o e;

    public /* synthetic */ s(o oVar) {
        super(false, null, null);
        this.e = oVar;
    }

    @Override // ca.t
    public final String a() {
        try {
            return (String) this.e.call();
        } catch (Exception e) {
            g5.k(e);
            return null;
        }
    }
}
