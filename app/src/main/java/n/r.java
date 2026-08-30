package n;
import l.a;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f20929a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final long[] f20930b = new long[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Object f20931c = new Object();

    public static final int a(f fVar, Object obj, int i) {
        int i10 = fVar.f20867w;
        if (i10 == 0) {
            return -1;
        }
        try {
            int a10 = a.a(fVar.f20865u, i10, i);
            if (a10 < 0 || kotlin.jvm.internal.a(obj, fVar.f20866v[a10])) {
                return a10;
            }
            int i11 = a10 + 1;
            while (i11 < i10 && fVar.f20865u[i11] == i) {
                if (kotlin.jvm.internal.a(obj, fVar.f20866v[i11])) {
                    return i11;
                }
                i11++;
            }
            for (int i12 = a10 - 1; i12 >= 0 && fVar.f20865u[i12] == i; i12--) {
                if (kotlin.jvm.internal.a(obj, fVar.f20866v[i12])) {
                    return i12;
                }
            }
            return ~i11;
        } catch (IndexOutOfBoundsException unused) {
            l4.a.m();
            return 0;
        }
    }
}
