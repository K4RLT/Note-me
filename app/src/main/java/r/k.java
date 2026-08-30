package r;
import r0.y;
import z0.g;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.p1;
import r0.o2;

/* loaded from: classes.dex */
public final class k extends kotlin.jvm.internal.m implements df.l {
    public static final k A;

    /* renamed from: v, reason: collision with root package name */
    public static final k f24101v;

    /* renamed from: w, reason: collision with root package name */
    public static final k f24102w;

    /* renamed from: x, reason: collision with root package name */
    public static final k f24103x;

    /* renamed from: y, reason: collision with root package name */
    public static final k f24104y;

    /* renamed from: z, reason: collision with root package name */
    public static final k f24105z;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f24106u;

    static {
        int i = 1;
        f24101v = new k(i, 0);
        f24102w = new k(i, 1);
        f24103x = new k(i, 2);
        f24104y = new k(i, 3);
        f24105z = new k(i, 4);
        A = new k(i, 5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i, int i10) {
        super(i);
        this.f24106u = i10;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        int i = this.f24106u;
        pe.z zVar = pe.z.f22715a;
        switch (i) {
            case 0:
                ((b2.l0) obj).b();
                return zVar;
            case 1:
                return zVar;
            case 2:
                ((Number) obj).longValue();
                return zVar;
            case 3:
                g gVar = (g) obj;
                int i10 = h.f24085a;
                o2 o2Var = AndroidCompositionLocals_androidKt.f642b;
                gVar.getClass();
                Context context = (Context) y.E(gVar, o2Var);
                y2.c cVar = (y2.c) y.E(gVar, p1.f3606h);
                y0 y0Var = (y0) y.E(gVar, z0.f24175a);
                if (y0Var == null) {
                    return null;
                }
                return new g(context, cVar, y0Var.f24164a, y0Var.f24165b);
            case 4:
                j2.f fVar = j2.f.f18783c;
                kf.g[] gVarArr = j2.u.f18865a;
                j2.v vVar = j2.s.f18841c;
                kf.g gVar2 = j2.u.f18865a[1];
                ((j2.j) obj).k(vVar, fVar);
                return zVar;
            default:
                return new l1(((Number) obj).intValue());
        }
    }
}
