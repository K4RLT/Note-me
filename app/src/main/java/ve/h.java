package ve;

import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.z;

/* loaded from: classes.dex */
public abstract class h extends g implements kotlin.jvm.internal.h {
    private final int arity;

    public h(int i, te.c cVar) {
        super(cVar);
        this.arity = i;
    }

    @Override // kotlin.jvm.internal.h
    public int getArity() {
        return this.arity;
    }

    @Override // ve.a
    public String toString() {
        if (getCompletion() == null) {
            z.f19788a.getClass();
            return a0.a(this);
        }
        return super.toString();
    }
}
