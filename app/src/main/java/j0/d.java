package j0;
import f.a;
import o.a;

import m2.m0;
import m2.q0;
import q.x;

/* loaded from: classes.dex */
public final class d implements y2.c {

    /* renamed from: u, reason: collision with root package name */
    public m0 f18696u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ e f18697v;

    public d(e eVar) {
        this.f18697v = eVar;
    }

    @Override // y2.c
    public final float D0(long j10) {
        if (y2.o.d(j10)) {
            e eVar = this.f18697v;
            if (!y2.o.d(eVar.f18707l.f20555a.f20485b)) {
                if (!y2.a(eVar.f18707l.f20555a.f20485b, y2.o.f30819c)) {
                    return y2.o.c(j10) * D0(eVar.f18707l.f20555a.f20485b);
                }
                x.o("InternalAutoSize -> toPx(): Cannot convert Em to Px when style.fontSize is not set. Please specify a font size.");
                return 0.0f;
            }
            x.o("InternalAutoSize -> toPx(): Cannot convert Em to Px when style.fontSize is Em\nDeclare the composable's style.fontSize with Sp units instead.");
            return 0.0f;
        }
        return a() * x(j10);
    }

    @Override // y2.c
    public final float a() {
        y2.c cVar = this.f18697v.f18706k;
        cVar.getClass();
        return cVar.a();
    }

    public final m0 b(long j10, long j11) {
        long j12;
        long j13;
        e eVar = this.f18697v;
        q0 q0Var = eVar.f18707l;
        if (y2.o.d(j11)) {
            j12 = a(eVar.f18707l.f20555a.f20485b, j11);
        } else {
            j12 = j11;
        }
        if (!y2.a(j12, eVar.f18707l.f20555a.f20485b)) {
            eVar.e(q0.a(eVar.f18707l, 0L, j12, null, null, 0L, 0L, null, null, 16777213));
        }
        if (eVar.f18702f > 1) {
            y2.m mVar = eVar.f18709n;
            mVar.getClass();
            j13 = eVar.g(j10, mVar);
        } else {
            j13 = j10;
        }
        y2.m mVar2 = eVar.f18709n;
        mVar2.getClass();
        m2.q b10 = eVar.b(j13, mVar2);
        y2.m mVar3 = eVar.f18709n;
        mVar3.getClass();
        m0 f10 = eVar.f(mVar3, j13, b10);
        this.f18696u = f10;
        eVar.e(q0Var);
        return f10;
    }

    @Override // y2.c
    public final float i0() {
        y2.c cVar = this.f18697v.f18706k;
        cVar.getClass();
        return cVar.i0();
    }
}
