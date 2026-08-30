package ne;

import com.google.android.gms.internal.ads.xe;
import de.j;
import ib.o;
import wa.h8;

/* loaded from: classes.dex */
public final class c extends ge.a implements me.b {
    @Override // da.j
    public final ca.d[] j() {
        return new ca.d[]{j.f15849a};
    }

    public final o p(fe.a aVar) {
        synchronized (this) {
            if (this.f17745u.get()) {
                return h8.d(new zd.a("This detector is already closed!"));
            }
            if (aVar.f16953b >= 32 && aVar.f16954c >= 32) {
                return this.f17746v.b(this.f17748x, new xe(this, 21, aVar), (pd.c) this.f17747w.f22681u);
            }
            return h8.d(new zd.a("InputImage width and height should be at least 32!"));
        }
    }
}
