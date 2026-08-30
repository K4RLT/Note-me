package k0;
import n.n;
import n.y;

import b8.n3;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f19366a;

    /* renamed from: b, reason: collision with root package name */
    public final long f19367b;

    /* renamed from: c, reason: collision with root package name */
    public final z1.x f19368c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f19369d;
    public final r e;

    /* renamed from: f, reason: collision with root package name */
    public final n3 f19370f;

    /* renamed from: g, reason: collision with root package name */
    public final y f19371g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f19372h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f19373j;

    /* renamed from: k, reason: collision with root package name */
    public int f19374k;

    public n0(long j10, long j11, z1.x xVar, boolean z3, r rVar, n3 n3Var) {
        this.f19366a = j10;
        this.f19367b = j11;
        this.f19368c = xVar;
        this.f19369d = z3;
        this.e = rVar;
        this.f19370f = n3Var;
        int i = n.f20917a;
        this.f19371g = new y(6);
        this.f19372h = new ArrayList();
        this.i = -1;
        this.f19373j = -1;
        this.f19374k = -1;
    }

    public final int a(int i, j jVar, j jVar2) {
        if (i == -1) {
            int ordinal = v0.x(jVar, jVar2).ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        l4.a.o();
                        return 0;
                    }
                } else {
                    return this.f19374k;
                }
            } else {
                return this.f19374k - 1;
            }
        }
        return i;
    }
}
