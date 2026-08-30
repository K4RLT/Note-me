package tf;

import sf.d0;
import sf.l0;

/* loaded from: classes.dex */
public final class x extends d0 implements l0 {
    @Override // sf.l0
    public final Object getValue() {
        Integer valueOf;
        synchronized (this) {
            Object[] objArr = this.B;
            objArr.getClass();
            valueOf = Integer.valueOf(((Number) objArr[((int) ((this.C + ((int) ((o() + this.E) - this.C))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return valueOf;
    }

    public final void w(int i) {
        synchronized (this) {
            Object[] objArr = this.B;
            objArr.getClass();
            q(Integer.valueOf(((Number) objArr[((int) ((this.C + ((int) ((o() + this.E) - this.C))) - 1)) & (objArr.length - 1)]).intValue() + i));
        }
    }
}
