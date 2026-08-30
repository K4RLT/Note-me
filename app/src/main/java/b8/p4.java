package b8;
import d1.r;
import j6.e;
import r0.m;
import r0.y;
import z0.c;

import android.net.Uri;
import android.util.LruCache;

/* loaded from: classes.dex */
public final /* synthetic */ class p4 implements df.p {
    public final /* synthetic */ pe.d A;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2517u = 1;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ float f2518v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f2519w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Comparable f2520x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f2521y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f2522z;

    public /* synthetic */ p4(Uri uri, LruCache lruCache, df.p pVar, df.l lVar, float f10, int i) {
        this.f2520x = uri;
        this.f2521y = lruCache;
        this.f2522z = pVar;
        this.A = lVar;
        this.f2518v = f10;
        this.f2519w = i;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2517u) {
            case 0:
                ((Integer) obj2).getClass();
                r4.c((p5) this.f2520x, this.f2518v, (r) this.f2521y, (e) this.f2522z, (c) this.A, (m) obj, y.L(this.f2519w | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                w7.n4.F0((Uri) this.f2520x, (LruCache) this.f2521y, (df.p) this.f2522z, (df.l) this.A, this.f2518v, (m) obj, y.L(this.f2519w | 1));
                break;
        }
        return pe.z.f22715a;
    }

    public /* synthetic */ p4(p5 p5Var, float f10, r rVar, e eVar, c cVar, int i) {
        this.f2520x = p5Var;
        this.f2518v = f10;
        this.f2521y = rVar;
        this.f2522z = eVar;
        this.A = cVar;
        this.f2519w = i;
    }
}
