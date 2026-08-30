package mg;

import ig.n;
import ig.o;
import ig.u;
import ig.w;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f20816a;

    /* renamed from: b, reason: collision with root package name */
    public final lg.e f20817b;

    /* renamed from: c, reason: collision with root package name */
    public final b f20818c;

    /* renamed from: d, reason: collision with root package name */
    public final lg.b f20819d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final a4.b f20820f;

    /* renamed from: g, reason: collision with root package name */
    public final u f20821g;

    /* renamed from: h, reason: collision with root package name */
    public final ig.b f20822h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final int f20823j;

    /* renamed from: k, reason: collision with root package name */
    public final int f20824k;

    /* renamed from: l, reason: collision with root package name */
    public int f20825l;

    public e(ArrayList arrayList, lg.e eVar, b bVar, lg.b bVar2, int i, a4.b bVar3, u uVar, ig.b bVar4, int i10, int i11, int i12) {
        this.f20816a = arrayList;
        this.f20819d = bVar2;
        this.f20817b = eVar;
        this.f20818c = bVar;
        this.e = i;
        this.f20820f = bVar3;
        this.f20821g = uVar;
        this.f20822h = bVar4;
        this.i = i10;
        this.f20823j = i11;
        this.f20824k = i12;
    }

    public final w a(a4.b bVar) {
        return b(bVar, this.f20817b, this.f20818c, this.f20819d);
    }

    public final w b(a4.b bVar, lg.e eVar, b bVar2, lg.b bVar3) {
        ArrayList arrayList = this.f20816a;
        int size = arrayList.size();
        int i = this.e;
        if (i < size) {
            this.f20825l++;
            b bVar4 = this.f20818c;
            if (bVar4 != null) {
                if (!this.f20819d.j((n) bVar.f240c)) {
                    throw new IllegalStateException("network interceptor " + arrayList.get(i - 1) + " must retain the same host and port");
                }
            }
            if (bVar4 != null && this.f20825l > 1) {
                throw new IllegalStateException("network interceptor " + arrayList.get(i - 1) + " must call proceed() exactly once");
            }
            int i10 = i + 1;
            e eVar2 = new e(arrayList, eVar, bVar2, bVar3, i10, bVar, this.f20821g, this.f20822h, this.i, this.f20823j, this.f20824k);
            o oVar = (o) arrayList.get(i);
            w a10 = oVar.a(eVar2);
            if (bVar2 != null && i10 < arrayList.size() && eVar2.f20825l != 1) {
                l4.a.j("network interceptor ", oVar, " must call proceed() exactly once");
                return null;
            }
            if (a10 != null) {
                if (a10.A != null) {
                    return a10;
                }
                l4.a.j("interceptor ", oVar, " returned a response with no body");
                return null;
            }
            throw new NullPointerException("interceptor " + oVar + " returned null");
        }
        throw new AssertionError();
    }
}
