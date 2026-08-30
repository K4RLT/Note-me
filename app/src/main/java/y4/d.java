package y4;

import g5.q;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import w7.i1;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final c f30909a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f30910b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f30911c = new LinkedHashSet();

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f30912d;

    public static void a(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                i1.j(autoCloseable);
            } catch (Exception e) {
                q.k(e);
            }
        }
    }
}
