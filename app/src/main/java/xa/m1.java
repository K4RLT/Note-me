package xa;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* loaded from: classes.dex */
public final class m1 implements c1 {

    /* renamed from: v, reason: collision with root package name */
    public static final m1 f30464v = new m1(0);

    /* renamed from: w, reason: collision with root package name */
    public static volatile m1 f30465w;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f30466u;

    public /* synthetic */ m1(int i) {
        this.f30466u = i;
    }

    @Override // xa.c1
    public Object zza() {
        switch (this.f30466u) {
            case 1:
                return new b1(true);
            case 2:
                return new LinkedHashMap();
            case 3:
                return new TreeMap();
            case 4:
                return new ConcurrentHashMap();
            case 5:
                return new ConcurrentSkipListMap();
            case 6:
                return new ArrayList();
            case 7:
                return new LinkedHashSet();
            case 8:
                return new TreeSet();
            default:
                return new ArrayDeque();
        }
    }
}
