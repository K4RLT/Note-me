package d;

import kotlin.jvm.internal.m;
import sf.d0;
import sf.z;

/* loaded from: classes.dex */
public final class c extends m implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f15637u = 0;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f15638v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f15639w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, boolean z3) {
        super(0);
        this.f15639w = eVar;
        this.f15638v = z3;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [df.a, kotlin.jvm.internal.j] */
    @Override // df.a
    public final Object invoke() {
        z i;
        switch (this.f15637u) {
            case 0:
                e eVar = (e) this.f15639w;
                eVar.f3274a = this.f15638v;
                Object r02 = eVar.f3276c;
                if (r02 != 0) {
                    r02.invoke();
                }
                return pe.z.f22715a;
            default:
                boolean z3 = this.f15638v;
                pe.z zVar = pe.z.f22715a;
                if (z3 && (i = ((i0.c) this.f15639w).i()) != null) {
                    ((d0) i).q(zVar);
                }
                return zVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(boolean z3, i0.c cVar) {
        super(0);
        this.f15638v = z3;
        this.f15639w = cVar;
    }
}