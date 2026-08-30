package j0;
import b.a;
import b.b;

import m2.g0;
import m2.q0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: h, reason: collision with root package name */
    public static b f18687h;

    /* renamed from: a, reason: collision with root package name */
    public final y2.m f18688a;

    /* renamed from: b, reason: collision with root package name */
    public final q0 f18689b;

    /* renamed from: c, reason: collision with root package name */
    public final y2.d f18690c;

    /* renamed from: d, reason: collision with root package name */
    public final q2.h f18691d;
    public final q0 e;

    /* renamed from: f, reason: collision with root package name */
    public float f18692f = Float.NaN;

    /* renamed from: g, reason: collision with root package name */
    public float f18693g = Float.NaN;

    public b(y2.m mVar, q0 q0Var, y2.d dVar, q2.h hVar) {
        this.f18688a = mVar;
        this.f18689b = q0Var;
        this.f18690c = dVar;
        this.f18691d = hVar;
        this.e = g0.i(q0Var, mVar);
    }

    public final long a(int i, long j10) {
        float f10 = this.f18693g;
        float f11 = this.f18692f;
        int i10 = 0;
        if (Float.isNaN(f10) || Float.isNaN(f11)) {
            String str = c.f18694a;
            long b10 = y2.b.b(0, 0, 15);
            q0 q0Var = this.e;
            y2.d dVar = this.f18690c;
            float h3 = g0.a(str, q0Var, b10, dVar, this.f18691d, 1, 96).h();
            float h10 = g0.a(c.f18695b, this.e, y2.b.b(0, 0, 15), dVar, this.f18691d, 2, 96).h() - h3;
            this.f18693g = h3;
            this.f18692f = h10;
            f11 = h10;
            f10 = h3;
        }
        if (i != 1) {
            int round = Math.round((f11 * (i - 1)) + f10);
            if (round >= 0) {
                i10 = round;
            }
            int g8 = y2.a.g(j10);
            if (i10 > g8) {
                i10 = g8;
            }
        } else {
            i10 = y2.a.i(j10);
        }
        return y2.a(y2.a.j(j10), y2.a.h(j10), i10, y2.a.g(j10));
    }
}
