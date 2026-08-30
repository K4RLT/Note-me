package ja;

import java.util.Comparator;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Comparator {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ b f19097u = new Object();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        ca.d dVar = (ca.d) obj;
        ca.d dVar2 = (ca.d) obj2;
        if (!dVar.f4029u.equals(dVar2.f4029u)) {
            return dVar.f4029u.compareTo(dVar2.f4029u);
        }
        return (dVar.a() > dVar2.a() ? 1 : (dVar.a() == dVar2.a() ? 0 : -1));
    }
}
