package c2;
import a0.o;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* loaded from: classes.dex */
public final class e0 extends kotlin.jvm.internal.m implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f3509u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ f0 f3510v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(f0 f0Var, int i) {
        super(1);
        this.f3509u = i;
        this.f3510v = f0Var;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        switch (this.f3509u) {
            case 0:
                View view = this.f3510v.f3516d;
                return Boolean.valueOf(view.getParent().requestSendAccessibilityEvent(view, (AccessibilityEvent) obj));
            default:
                l2 l2Var = (l2) obj;
                if (l2Var.f3570v.contains(l2Var)) {
                    f0 f0Var = this.f3510v;
                    f0Var.f3516d.getSnapshotObserver().a(l2Var, f0Var.P, new o(l2Var, 8, f0Var));
                }
                return pe.z.f22715a;
        }
    }
}
