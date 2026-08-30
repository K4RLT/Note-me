package k0;
import j1.b;

/* loaded from: classes.dex */
public final class x0 extends kotlin.jvm.internal.m implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f19451u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ df.a f19452v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0(int i, df.a aVar) {
        super(1);
        this.f19451u = i;
        this.f19452v = aVar;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        int i = this.f19451u;
        pe.z zVar = pe.z.f22715a;
        df.a aVar = this.f19452v;
        switch (i) {
            case 0:
                return new b(((b) aVar.invoke()).f18762a);
            case 1:
                return new b(((b) aVar.invoke()).f18762a);
            case 2:
                j2.f fVar = new j2.f(((Number) aVar.invoke()).floatValue(), new jf.a(0.0f, 1.0f));
                kf.g[] gVarArr = j2.u.f18865a;
                j2.v vVar = j2.s.f18841c;
                kf.g gVar = j2.u.f18865a[1];
                ((j2.j) obj).k(vVar, fVar);
                return zVar;
            case 3:
                j2.f fVar2 = new j2.f(((Number) aVar.invoke()).floatValue(), new jf.a(0.0f, 1.0f));
                kf.g[] gVarArr2 = j2.u.f18865a;
                j2.v vVar2 = j2.s.f18841c;
                kf.g gVar2 = j2.u.f18865a[1];
                ((j2.j) obj).k(vVar2, fVar2);
                return zVar;
            default:
                aVar.invoke();
                return zVar;
        }
    }
}
