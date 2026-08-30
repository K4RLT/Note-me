package rf;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import pe.z;
import q.x;

/* loaded from: classes.dex */
public final /* synthetic */ class d extends kotlin.jvm.internal.j implements df.q {

    /* renamed from: u, reason: collision with root package name */
    public static final d f24776u = new kotlin.jvm.internal.j(3, h.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // df.q
    public final Object b(Object obj, Object obj2, Object obj3) {
        p pVar;
        h hVar = (h) obj;
        xf.e eVar = (xf.e) obj2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = h.f24784v;
        hVar.getClass();
        p pVar2 = (p) h.A.get(hVar);
        while (true) {
            if (hVar.w()) {
                eVar.f30784y = j.f24800l;
                break;
            }
            long andIncrement = h.f24785w.getAndIncrement(hVar);
            long j10 = j.f24792b;
            long j11 = andIncrement / j10;
            int i = (int) (andIncrement % j10);
            if (pVar2.f27239w != j11) {
                p p10 = hVar.p(j11, pVar2);
                if (p10 == null) {
                    continue;
                } else {
                    pVar = p10;
                }
            } else {
                pVar = pVar2;
            }
            Object H = hVar.H(pVar, i, andIncrement, eVar);
            p pVar3 = pVar;
            if (H == j.f24801m) {
                if (eVar == null) {
                    eVar = null;
                }
                if (eVar != null) {
                    eVar.f30782w = pVar3;
                    eVar.f30783x = i;
                }
            } else if (H == j.f24803o) {
                if (andIncrement < hVar.t()) {
                    pVar3.a();
                }
                pVar2 = pVar3;
            } else if (H != j.f24802n) {
                pVar3.a();
                eVar.f30784y = H;
            } else {
                x.o("unexpected");
                return null;
            }
        }
        return z.f22715a;
    }
}
