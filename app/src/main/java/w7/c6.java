package w7;

import android.content.Context;
import java.util.Set;

/* loaded from: classes.dex */
public final class c6 implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Context f28030u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ pe.j f28031v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ df.q f28032w;

    public c6(Context context, pe.j jVar, df.q qVar) {
        this.f28030u = context;
        this.f28031v = jVar;
        this.f28032w = qVar;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        Set set = x7.g0.f30195a;
        Object obj3 = this.f28031v.f22693u;
        x7.g0.c(this.f28030u, "shape:" + obj3);
        this.f28032w.b(obj3, (Float) obj, (Float) obj2);
        return pe.z.f22715a;
    }
}
