package xf;

import com.google.android.gms.internal.ads.pu1;
import df.q;
import kotlin.jvm.internal.j;
import pe.z;
import pf.b0;

/* loaded from: classes.dex */
public final /* synthetic */ class a extends j implements q {

    /* renamed from: u, reason: collision with root package name */
    public static final a f30766u = new j(3, b.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // df.q
    public final Object b(Object obj, Object obj2, Object obj3) {
        b bVar = (b) obj;
        e eVar = (e) obj2;
        long j10 = bVar.f30767a;
        z zVar = z.f22715a;
        if (j10 <= 0) {
            eVar.f30784y = zVar;
            return zVar;
        }
        pu1 pu1Var = new pu1(eVar, 28, bVar);
        eVar.getClass();
        te.g gVar = eVar.f30780u;
        eVar.f30782w = b0.n(gVar).A(j10, pu1Var, gVar);
        return zVar;
    }
}
