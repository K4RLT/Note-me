package j2;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class e implements Comparator {

    /* renamed from: v, reason: collision with root package name */
    public static final e f18779v = new e(0);

    /* renamed from: w, reason: collision with root package name */
    public static final e f18780w = new e(1);

    /* renamed from: x, reason: collision with root package name */
    public static final e f18781x = new e(2);

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f18782u;

    public /* synthetic */ e(int i) {
        this.f18782u = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f18782u) {
            case 0:
                j1.c h3 = ((n) obj).h();
                j1.c h10 = ((n) obj2).h();
                int compare = Float.compare(h3.f18763a, h10.f18763a);
                if (compare == 0) {
                    int compare2 = Float.compare(h3.f18764b, h10.f18764b);
                    if (compare2 == 0) {
                        int compare3 = Float.compare(h3.f18766d, h10.f18766d);
                        if (compare3 == 0) {
                            return Float.compare(h3.f18765c, h10.f18765c);
                        }
                        return compare3;
                    }
                    return compare2;
                }
                return compare;
            case 1:
                j1.c h11 = ((n) obj).h();
                j1.c h12 = ((n) obj2).h();
                int compare4 = Float.compare(h12.f18765c, h11.f18765c);
                if (compare4 == 0) {
                    int compare5 = Float.compare(h11.f18764b, h12.f18764b);
                    if (compare5 == 0) {
                        int compare6 = Float.compare(h11.f18766d, h12.f18766d);
                        if (compare6 == 0) {
                            return Float.compare(h12.f18763a, h11.f18763a);
                        }
                        return compare6;
                    }
                    return compare5;
                }
                return compare4;
            default:
                pe.j jVar = (pe.j) obj;
                pe.j jVar2 = (pe.j) obj2;
                int compare7 = Float.compare(((j1.c) jVar.f22693u).f18764b, ((j1.c) jVar2.f22693u).f18764b);
                if (compare7 == 0) {
                    return Float.compare(((j1.c) jVar.f22693u).f18766d, ((j1.c) jVar2.f22693u).f18766d);
                }
                return compare7;
        }
    }
}
