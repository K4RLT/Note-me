package b8;
import b2.i0;
import j2.n;
import n.y;

import java.util.Comparator;
import java.util.LinkedHashMap;
import ya.ac;

/* loaded from: classes.dex */
public final class n3 implements Comparator {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2441u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f2442v;

    public n3(Comparator comparator) {
        this.f2441u = 2;
        this.f2442v = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i;
        switch (this.f2441u) {
            case 0:
                int compare = ((m3) this.f2442v).compare(obj, obj2);
                if (compare == 0) {
                    return ac.a(Long.valueOf(((ca) obj2).f1945m), Long.valueOf(((ca) obj).f1945m));
                }
                return compare;
            case 1:
                int compare2 = ((m3) this.f2442v).compare(obj, obj2);
                if (compare2 == 0) {
                    return ac.a(Long.valueOf(((ca) obj2).f1945m), Long.valueOf(((ca) obj).f1945m));
                }
                return compare2;
            case 2:
                int compare3 = ((Comparator) this.f2442v).compare(obj, obj2);
                if (compare3 == 0) {
                    return i0.f1477n0.compare(((n) obj).f18822c, ((n) obj2).f18822c);
                }
                return compare3;
            case 3:
                int compare4 = ((n3) this.f2442v).compare(obj, obj2);
                if (compare4 == 0) {
                    return ac.a(Integer.valueOf(((n) obj).f18825g), Integer.valueOf(((n) obj2).f18825g));
                }
                return compare4;
            case 4:
                long longValue = ((Number) obj).longValue();
                y yVar = (y) this.f2442v;
                return ac.a(Integer.valueOf(yVar.c(longValue)), Integer.valueOf(yVar.c(((Number) obj2).longValue())));
            default:
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.f2442v;
                Integer num = (Integer) linkedHashMap.get(((w7.t9) obj).f29155a.f29080a);
                int i10 = Integer.MAX_VALUE;
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = Integer.MAX_VALUE;
                }
                Integer valueOf = Integer.valueOf(i);
                Integer num2 = (Integer) linkedHashMap.get(((w7.t9) obj2).f29155a.f29080a);
                if (num2 != null) {
                    i10 = num2.intValue();
                }
                return ac.a(valueOf, Integer.valueOf(i10));
        }
    }

    public /* synthetic */ n3(int i, Object obj) {
        this.f2441u = i;
        this.f2442v = obj;
    }
}
