package t;
import v1.t;

/* loaded from: classes.dex */
public final class a0 extends kotlin.jvm.internal.m implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f25316u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.v f25317v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(kotlin.jvm.internal.v vVar, int i) {
        super(2);
        this.f25316u = i;
        this.f25317v = vVar;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f25316u) {
            case 0:
                float floatValue = ((Number) obj2).floatValue();
                ((t) obj).a();
                this.f25317v.f19784u = floatValue;
                return pe.z.f22715a;
            default:
                float floatValue2 = ((Number) obj2).floatValue();
                ((t) obj).a();
                this.f25317v.f19784u = floatValue2;
                return pe.z.f22715a;
        }
    }
}
