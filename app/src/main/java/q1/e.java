package q1;
import f.a;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: k, reason: collision with root package name */
    public static int f23250k;

    /* renamed from: l, reason: collision with root package name */
    public static final n8.m f23251l = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final String f23252a;

    /* renamed from: b, reason: collision with root package name */
    public final float f23253b;

    /* renamed from: c, reason: collision with root package name */
    public final float f23254c;

    /* renamed from: d, reason: collision with root package name */
    public final float f23255d;
    public final float e;

    /* renamed from: f, reason: collision with root package name */
    public final z f23256f;

    /* renamed from: g, reason: collision with root package name */
    public final long f23257g;

    /* renamed from: h, reason: collision with root package name */
    public final int f23258h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final int f23259j;

    public e(String str, float f10, float f11, float f12, float f13, z zVar, long j10, int i, boolean z3) {
        int i10;
        synchronized (f23251l) {
            i10 = f23250k;
            f23250k = i10 + 1;
        }
        this.f23252a = str;
        this.f23253b = f10;
        this.f23254c = f11;
        this.f23255d = f12;
        this.e = f13;
        this.f23256f = zVar;
        this.f23257g = j10;
        this.f23258h = i;
        this.i = z3;
        this.f23259j = i10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (kotlin.jvm.internal.a(this.f23252a, eVar.f23252a) && y2.a(this.f23253b, eVar.f23253b) && y2.a(this.f23254c, eVar.f23254c) && this.f23255d == eVar.f23255d && this.e == eVar.e && this.f23256f.equals(eVar.f23256f)) {
                    long j10 = eVar.f23257g;
                    int i = k1.r.f19522m;
                    if (pe.a(this.f23257g, j10) && this.f23258h == eVar.f23258h && this.i == eVar.i) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = (this.f23256f.hashCode() + a.a(a.a(a.a(a.a(this.f23252a.hashCode() * 31, 31, this.f23253b), 31, this.f23254c), 31, this.f23255d), 31, this.e)) * 31;
        int i = k1.r.f19522m;
        return Boolean.hashCode(this.i) + a.b(this.f23258h, a.d(this.f23257g, hashCode, 31), 31);
    }
}
