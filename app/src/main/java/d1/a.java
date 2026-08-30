package d1;

import androidx.compose.ui.ZIndexElement;
import c0.d0;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final g f15665a = new g(-1.0f);

    /* renamed from: b, reason: collision with root package name */
    public static final g f15666b = new g(1.0f);

    /* renamed from: c, reason: collision with root package name */
    public static final f f15667c = new f(-1.0f);

    /* renamed from: d, reason: collision with root package name */
    public static final f f15668d = new f(1.0f);

    public static final r a(r rVar, df.q qVar) {
        return rVar.d(new m(qVar));
    }

    public static final r b(r rVar, r0.m mVar) {
        if (rVar.a(n.f15686u)) {
            return rVar;
        }
        r0.r rVar2 = (r0.r) mVar;
        rVar2.b0(1219399079);
        r rVar3 = (r) rVar.b(new d0(5, rVar2), o.f15687a);
        rVar2.p(false);
        return rVar3;
    }

    public static final r c(r rVar, r0.m mVar) {
        r0.r rVar2 = (r0.r) mVar;
        rVar2.a0(439770924);
        r b10 = b(rVar, rVar2);
        rVar2.p(false);
        return b10;
    }

    public static final r d(r rVar, float f10) {
        return rVar.d(new ZIndexElement(f10));
    }
}
