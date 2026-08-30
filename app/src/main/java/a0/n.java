package a0;
import b0.z;
import n0.e;

import java.util.List;
import r0.a1;

/* loaded from: classes.dex */
public final class n extends kotlin.jvm.internal.m implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f108u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ a1 f109v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(a1 a1Var, int i) {
        super(0);
        this.f108u = i;
        this.f109v = a1Var;
    }

    @Override // df.a
    public final Object invoke() {
        switch (this.f108u) {
            case 0:
                return new j((df.l) this.f109v.getValue());
            case 1:
                return (z) ((df.a) this.f109v.getValue()).invoke();
            case 2:
                a1 a1Var = this.f109v;
                if (a1Var != null) {
                    return (List) a1Var.getValue();
                }
                return null;
            case 3:
                Boolean bool = (Boolean) this.f109v.getValue();
                bool.booleanValue();
                return bool;
            case 4:
                return (e) this.f109v.getValue();
            default:
                return new e((df.l) this.f109v.getValue());
        }
    }
}
