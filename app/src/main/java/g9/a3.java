package g9;

import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class a3 implements Comparator {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ a3 f17570u = new Object();

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        List list = z8.p.f31995b;
        return list.indexOf((String) obj) - list.indexOf((String) obj2);
    }
}
