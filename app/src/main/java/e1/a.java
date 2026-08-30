package e1;

import android.graphics.Rect;
import android.view.autofill.AutofillManager;
import df.r;
import pe.z;

/* loaded from: classes.dex */
public final class a extends kotlin.jvm.internal.m implements r {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ c f15870u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f15871v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, int i) {
        super(4);
        this.f15870u = cVar;
        this.f15871v = i;
    }

    @Override // df.r
    public final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        int intValue3 = ((Number) obj3).intValue();
        int intValue4 = ((Number) obj4).intValue();
        c cVar = this.f15870u;
        pd.c cVar2 = cVar.f15875a;
        ((AutofillManager) cVar2.f22681u).notifyViewEntered(cVar.f15877c, this.f15871v, new Rect(intValue, intValue2, intValue3, intValue4));
        return z.f22715a;
    }
}
