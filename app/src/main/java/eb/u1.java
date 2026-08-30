package eb;

import java.util.Comparator;
import java.util.Map;
import ya.ac;

/* loaded from: classes.dex */
public final /* synthetic */ class u1 implements Comparator {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f16386u;

    public /* synthetic */ u1(int i) {
        this.f16386u = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f16386u) {
            case 0:
                return Long.compare(((Long) obj).longValue(), ((Long) obj2).longValue());
            case 1:
                return ac.a(Long.valueOf(((j4.d) obj2).f18905b), Long.valueOf(((j4.d) obj).f18905b));
            case 2:
                return ((String) obj).compareTo((String) obj2);
            case 3:
                return ac.a((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 4:
                return ac.a((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 5:
                return ac.a(((l5.f) obj).f19922a, ((l5.f) obj2).f19922a);
            case 6:
                return ac.a(((l5.h) obj).f19932a, ((l5.h) obj2).f19932a);
            default:
                return ac.a(Long.valueOf(((r7.g) obj).e), Long.valueOf(((r7.g) obj2).e));
        }
    }
}
