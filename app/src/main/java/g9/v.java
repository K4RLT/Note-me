package g9;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.oh;
import com.google.android.gms.internal.ads.qh;

/* loaded from: classes.dex */
public final class v extends oh implements x {
    public v(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener", 0);
    }

    @Override // g9.x
    public final void F(y1 y1Var) {
        Parcel g22 = g2();
        qh.c(g22, y1Var);
        v2(g22, 8);
    }

    @Override // g9.x
    public final void a() {
        v2(g2(), 4);
    }

    @Override // g9.x
    public final void b() {
        v2(g2(), 5);
    }

    @Override // g9.x
    public final void d() {
        v2(g2(), 9);
    }

    @Override // g9.x
    public final void e() {
        v2(g2(), 6);
    }

    @Override // g9.x
    public final void g() {
        v2(g2(), 7);
    }

    @Override // g9.x
    public final void k() {
        v2(g2(), 3);
    }

    @Override // g9.x
    public final void l() {
        v2(g2(), 1);
    }

    @Override // g9.x
    public final void w(int i) {
        Parcel g22 = g2();
        g22.writeInt(i);
        v2(g22, 2);
    }
}
