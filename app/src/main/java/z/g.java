package z;
import b.b;

import b0.c0;
import b0.g0;
import java.util.List;

/* loaded from: classes.dex */
public final class g implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final f f31674a;

    /* renamed from: b, reason: collision with root package name */
    public final c0 f31675b;

    /* renamed from: c, reason: collision with root package name */
    public final long f31676c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f31677d;
    public final /* synthetic */ c0 e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f31678f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f31679g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ d1.d f31680h;
    public final /* synthetic */ d1.i i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f31681j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f31682k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f31683l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ m f31684m;

    public g(long j10, boolean z3, f fVar, c0 c0Var, int i, int i10, d1.d dVar, d1.i iVar, int i11, int i12, long j11, m mVar) {
        int i13;
        this.f31677d = z3;
        this.e = c0Var;
        this.f31678f = i;
        this.f31679g = i10;
        this.f31680h = dVar;
        this.i = iVar;
        this.f31681j = i11;
        this.f31682k = i12;
        this.f31683l = j11;
        this.f31684m = mVar;
        this.f31674a = fVar;
        this.f31675b = c0Var;
        if (z3) {
            i13 = y2.a.h(j10);
        } else {
            i13 = Integer.MAX_VALUE;
        }
        this.f31676c = y2.b(i13, z3 ? Integer.MAX_VALUE : y2.a.g(j10), 5);
    }

    public final j a(int i, long j10) {
        int i10;
        f fVar = this.f31674a;
        Object b10 = fVar.b(i);
        Object j11 = fVar.f31671b.j(i);
        List b11 = this.f31675b.b(i, j10);
        if (i == this.f31678f - 1) {
            i10 = 0;
        } else {
            i10 = this.f31679g;
        }
        return new j(i, b11, this.f31677d, this.f31680h, this.i, this.e.f1163v.getLayoutDirection(), this.f31681j, this.f31682k, i10, this.f31683l, b10, j11, this.f31684m.f31738m, j10);
    }
}
