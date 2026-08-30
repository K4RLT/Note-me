package ic;
import r.a;

import com.google.android.gms.internal.ads.yh0;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import wa.j8;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f18386a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f18387b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f18388c;

    /* renamed from: d, reason: collision with root package name */
    public final int f18389d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final d f18390f;

    /* renamed from: g, reason: collision with root package name */
    public final Set f18391g;

    public a(String str, Set set, Set set2, int i, int i10, d dVar, Set set3) {
        this.f18386a = str;
        this.f18387b = Collections.unmodifiableSet(set);
        this.f18388c = Collections.unmodifiableSet(set2);
        this.f18389d = i;
        this.e = i10;
        this.f18390f = dVar;
        this.f18391g = Collections.unmodifiableSet(set3);
    }

    public static yh0 a(r rVar) {
        return new yh0(rVar, new r[0]);
    }

    public static yh0 b(Class cls) {
        return new yh0(cls, new Class[0]);
    }

    public static a c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(r.a(cls));
        for (Class cls2 : clsArr) {
            j8.a(cls2, "Null interface");
            hashSet.add(r.a(cls2));
        }
        return new a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new b1.h(10, obj), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f18387b.toArray()) + ">{" + this.f18389d + ", type=" + this.e + ", deps=" + Arrays.toString(this.f18388c.toArray()) + "}";
    }
}
