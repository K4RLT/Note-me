package b2;
import z1.h;
import z1.q0;
import z1.r0;

import java.util.Map;

/* loaded from: classes.dex */
public final class q0 implements z1.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1581a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1582b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1583c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f1584d;
    public final df.l e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df.l f1585f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r0 f1586g;

    public /* synthetic */ q0(int i, int i10, Map map, df.l lVar, df.l lVar2, r0 r0Var, int i11) {
        this.f1581a = i11;
        this.f1582b = i;
        this.f1583c = i10;
        this.f1584d = map;
        this.e = lVar;
        this.f1585f = lVar2;
        this.f1586g = r0Var;
    }

    @Override // z1.q0
    public final void a() {
        switch (this.f1581a) {
            case 0:
                this.f1585f.invoke(((r0) this.f1586g).F);
                return;
            default:
                this.f1585f.invoke(((h) this.f1586g).f31817u.F);
                return;
        }
    }

    @Override // z1.q0
    public final Map b() {
        switch (this.f1581a) {
            case 0:
                return this.f1584d;
            default:
                return this.f1584d;
        }
    }

    @Override // z1.q0
    public final df.l c() {
        switch (this.f1581a) {
            case 0:
                return this.e;
            default:
                return this.e;
        }
    }

    @Override // z1.q0
    public final int getHeight() {
        switch (this.f1581a) {
            case 0:
                return this.f1583c;
            default:
                return this.f1583c;
        }
    }

    @Override // z1.q0
    public final int getWidth() {
        switch (this.f1581a) {
            case 0:
                return this.f1582b;
            default:
                return this.f1582b;
        }
    }
}
