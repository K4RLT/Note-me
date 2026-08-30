package u7;
import q.d;
import r0.a1;
import t.t1;
import v1.w;
import w7.r4;
import z1.x;

import android.graphics.Bitmap;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.List;

/* loaded from: classes.dex */
public final class f5 implements PointerInputEventHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26181a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ df.l f26182b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a1 f26183c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f26184d;
    public final /* synthetic */ Object e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f26185f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f26186g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f26187h;

    public f5(df.l lVar, df.a aVar, a1 a1Var, Bitmap bitmap, x xVar, df.l lVar2, a1 a1Var2) {
        this.f26182b = lVar;
        this.f26184d = aVar;
        this.f26183c = a1Var;
        this.e = bitmap;
        this.f26185f = xVar;
        this.f26186g = lVar2;
        this.f26187h = a1Var2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(w wVar, te.c cVar) {
        switch (this.f26181a) {
            case 0:
                Object e = t1.e(wVar, new e5((d) this.f26184d, (d) this.e, (o1) this.f26185f, (pf.z) this.f26186g, this.f26183c, (List) this.f26187h, this.f26182b, null), cVar);
                if (e != ue.a.f27192u) {
                    return pe.z.f22715a;
                }
                return e;
            default:
                Object e8 = t1.e(wVar, new r4(this.f26182b, (df.a) this.f26184d, this.f26183c, (Bitmap) this.e, (x) this.f26185f, (df.l) this.f26186g, (a1) this.f26187h, null), cVar);
                if (e8 != ue.a.f27192u) {
                    return pe.z.f22715a;
                }
                return e8;
        }
    }

    public f5(d dVar, d dVar2, o1 o1Var, pf.z zVar, a1 a1Var, List list, df.l lVar) {
        this.f26184d = dVar;
        this.e = dVar2;
        this.f26185f = o1Var;
        this.f26186g = zVar;
        this.f26183c = a1Var;
        this.f26187h = list;
        this.f26182b = lVar;
    }
}
