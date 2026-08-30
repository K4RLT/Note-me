package b8;

import java.util.Comparator;
import ya.ac;

/* loaded from: classes.dex */
public final class m3 implements Comparator {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2412u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ long f2413v;

    public /* synthetic */ m3(long j10, int i) {
        this.f2412u = i;
        this.f2413v = j10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f2412u) {
            case 0:
                long j10 = this.f2413v;
                return ac.a(Double.valueOf(e1.D((ca) obj2, j10)), Double.valueOf(e1.D((ca) obj, j10)));
            default:
                long j11 = this.f2413v;
                return ac.a(Double.valueOf(e1.D((ca) obj2, j11)), Double.valueOf(e1.D((ca) obj, j11)));
        }
    }
}
