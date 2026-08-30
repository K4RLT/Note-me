package c3;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class k extends kotlin.jvm.internal.m implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f3784u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ x f3785v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(x xVar, int i) {
        super(1);
        this.f3784u = i;
        this.f3785v = xVar;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        Looper looper;
        switch (this.f3784u) {
            case 0:
                z1.x J = ((z1.x) obj).J();
                J.getClass();
                this.f3785v.l(J);
                return pe.z.f22715a;
            case 1:
                y2.l lVar = new y2.l(((y2.l) obj).f30813a);
                x xVar = this.f3785v;
                xVar.m200setPopupContentSizefhxjrPA(lVar);
                xVar.m();
                return pe.z.f22715a;
            default:
                df.a aVar = (df.a) obj;
                x xVar2 = this.f3785v;
                Handler handler = xVar2.getHandler();
                if (handler != null) {
                    looper = handler.getLooper();
                } else {
                    looper = null;
                }
                if (looper == Looper.myLooper()) {
                    aVar.invoke();
                } else {
                    Handler handler2 = xVar2.getHandler();
                    if (handler2 != null) {
                        handler2.post(new b3.a(3, aVar));
                    }
                }
                return pe.z.f22715a;
        }
    }
}
