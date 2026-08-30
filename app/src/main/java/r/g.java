package r;
import k1.r;
import l.a;
import x.j0;

import android.content.Context;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final Context f24074a;

    /* renamed from: b, reason: collision with root package name */
    public final y2.c f24075b;

    /* renamed from: c, reason: collision with root package name */
    public final long f24076c;

    /* renamed from: d, reason: collision with root package name */
    public final j0 f24077d;

    public g(Context context, y2.c cVar, long j10, j0 j0Var) {
        this.f24074a = context;
        this.f24075b = cVar;
        this.f24076c = j10;
        this.f24077d = j0Var;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this != obj) {
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (g.class.equals(cls)) {
                obj.getClass();
                g gVar = (g) obj;
                if (kotlin.jvm.internal.a(this.f24074a, gVar.f24074a) && kotlin.jvm.internal.a(this.f24075b, gVar.f24075b)) {
                    long j10 = gVar.f24076c;
                    int i = r.f19522m;
                    if (!pe.a(this.f24076c, j10) || !kotlin.jvm.internal.a(this.f24077d, gVar.f24077d)) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = (this.f24075b.hashCode() + (this.f24074a.hashCode() * 31)) * 31;
        int i = r.f19522m;
        return this.f24077d.hashCode() + a.d(this.f24076c, hashCode, 31);
    }
}
