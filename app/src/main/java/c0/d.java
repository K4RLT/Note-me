package c0;
import c0.i0;
import t.b;

import com.google.android.gms.internal.ads.x90;
import r0.i1;

/* loaded from: classes.dex */
public final class d extends i0 {
    public static final x90 J = a1.b(b.f3283u, c.f3284v);
    public final i1 I;

    public d(int i, float f10, df.a aVar) {
        super(i, f10);
        this.I = r0.y.B(aVar);
    }

    @Override // i0
    public final int m() {
        return ((Number) ((df.a) this.I.getValue()).invoke()).intValue();
    }
}
