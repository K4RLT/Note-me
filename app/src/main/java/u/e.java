package u;

import kotlin.jvm.internal.v;
import pe.z;

/* loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.m implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f25769u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ v f25770v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ df.l f25771w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(v vVar, df.l lVar, int i) {
        super(1);
        this.f25769u = i;
        this.f25770v = vVar;
        this.f25771w = lVar;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        switch (this.f25769u) {
            case 0:
                float floatValue = ((Number) obj).floatValue();
                v vVar = this.f25770v;
                float f10 = vVar.f19784u - floatValue;
                vVar.f19784u = f10;
                this.f25771w.invoke(Float.valueOf(f10));
                return z.f22715a;
            default:
                float floatValue2 = ((Number) obj).floatValue();
                v vVar2 = this.f25770v;
                float f11 = vVar2.f19784u - floatValue2;
                vVar2.f19784u = f11;
                this.f25771w.invoke(Float.valueOf(f11));
                return z.f22715a;
        }
    }
}
