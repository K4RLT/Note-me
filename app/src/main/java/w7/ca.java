package w7;
import j1.b;
import lb.g;
import r0.a1;

/* loaded from: classes.dex */
public final class ca implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f28045u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ a1 f28046v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a1 f28047w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ a1 f28048x;

    public ca(int i, a1 a1Var, a1 a1Var2, a1 a1Var3) {
        this.f28045u = i;
        this.f28046v = a1Var;
        this.f28047w = a1Var2;
        this.f28048x = a1Var3;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        long j10 = ((b) obj).f18762a;
        this.f28046v.setValue(Integer.valueOf(this.f28045u));
        g(0.0f, this.f28047w);
        this.f28048x.setValue(Long.valueOf(System.currentTimeMillis()));
        return pe.z.f22715a;
    }
}
