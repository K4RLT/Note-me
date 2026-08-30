package z7;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import pe.z;
import t.k2;
import v1.w;

/* loaded from: classes.dex */
public final class b implements PointerInputEventHandler {

    /* renamed from: b, reason: collision with root package name */
    public static final b f31941b = new b(0);

    /* renamed from: c, reason: collision with root package name */
    public static final b f31942c = new b(1);

    /* renamed from: d, reason: collision with root package name */
    public static final b f31943d = new b(2);
    public static final b e = new b(3);

    /* renamed from: f, reason: collision with root package name */
    public static final b f31944f = new b(4);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31945a;

    public /* synthetic */ b(int i) {
        this.f31945a = i;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(w wVar, te.c cVar) {
        switch (this.f31945a) {
            case 0:
                Object e8 = k2.e(wVar, null, null, null, null, cVar, 15);
                if (e8 != ue.a.f27192u) {
                    return z.f22715a;
                }
                return e8;
            case 1:
                Object e10 = k2.e(wVar, null, null, null, null, cVar, 15);
                if (e10 != ue.a.f27192u) {
                    return z.f22715a;
                }
                return e10;
            case 2:
                Object e11 = k2.e(wVar, null, null, null, null, cVar, 15);
                if (e11 != ue.a.f27192u) {
                    return z.f22715a;
                }
                return e11;
            case 3:
                Object e12 = k2.e(wVar, null, null, null, null, cVar, 15);
                if (e12 != ue.a.f27192u) {
                    return z.f22715a;
                }
                return e12;
            default:
                Object e13 = k2.e(wVar, null, null, null, null, cVar, 15);
                if (e13 != ue.a.f27192u) {
                    return z.f22715a;
                }
                return e13;
        }
    }
}
