package r;
import r.b1;

import android.widget.Magnifier;

/* loaded from: classes.dex */
public class d1 implements b1 {

    /* renamed from: a, reason: collision with root package name */
    public final Magnifier f24055a;

    public d1(Magnifier magnifier) {
        this.f24055a = magnifier;
    }

    @Override // b1
    public void a(long j10, long j11) {
        this.f24055a.show(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)));
    }

    public final void b() {
        this.f24055a.dismiss();
    }

    public final long c() {
        return (this.f24055a.getHeight() & 4294967295L) | (this.f24055a.getWidth() << 32);
    }

    public final void d() {
        this.f24055a.update();
    }
}
