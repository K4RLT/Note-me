package m2;

import java.util.Comparator;
import ya.ac;

/* loaded from: classes.dex */
public final class f implements Comparator {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f20474u;

    public /* synthetic */ f(int i) {
        this.f20474u = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f20474u) {
            case 0:
                return ac.a(Integer.valueOf(((e) obj).f20452b), Integer.valueOf(((e) obj2).f20452b));
            default:
                return ac.a(Integer.valueOf(((e) obj).f20452b), Integer.valueOf(((e) obj2).f20452b));
        }
    }
}
