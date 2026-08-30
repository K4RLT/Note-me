package c2;
import i1.s;

import android.view.View;

/* loaded from: classes.dex */
public final class u extends kotlin.jvm.internal.m implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f3650u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f3651v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(int i, int i10) {
        super(1);
        this.f3650u = i10;
        this.f3651v = i;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        boolean z3;
        switch (this.f3650u) {
            case 0:
                return Boolean.valueOf(((s) obj).c1(this.f3651v));
            case 1:
                if (((View) obj).getId() == this.f3651v) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                return Boolean.valueOf(z3);
            default:
                return Boolean.valueOf(((s) obj).c1(this.f3651v));
        }
    }
}
