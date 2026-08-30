package r0;
import b1.v;
import k1.r;
import z0.a;

/* loaded from: classes.dex */
public final class e implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f24207u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f24208v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f24209w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f24210x;

    public /* synthetic */ e(int i, Object obj, Object obj2, Object obj3) {
        this.f24207u = i;
        this.f24208v = obj;
        this.f24209w = obj2;
        this.f24210x = obj3;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        int i;
        int i10;
        switch (this.f24207u) {
            case 0:
                d dVar = (d) this.f24208v;
                dVar.f24203a = null;
                dVar.f24204b = null;
                a aVar = ((f) this.f24209w).f24242x;
                int i11 = ((kotlin.jvm.internal.w) this.f24210x).f19785u;
                do {
                    i = aVar.get();
                    if (((i >>> 27) & 15) == i11) {
                        i10 = i - 1;
                    } else {
                        i10 = i;
                    }
                } while (!aVar.compareAndSet(i, i10));
                return pe.z.f22715a;
            default:
                long j10 = ((r) obj).f19523a;
                v vVar = (v) this.f24208v;
                int size = vVar.size();
                a1 a1Var = (a1) this.f24210x;
                int intValue = ((Number) a1Var.getValue()).intValue();
                if (intValue >= 0 && intValue < size) {
                    vVar.set(((Number) a1Var.getValue()).intValue(), new r(j10));
                }
                ((w7.o1) this.f24209w).invoke(new r(j10));
                return pe.z.f22715a;
        }
    }
}
