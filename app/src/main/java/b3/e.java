package b3;

import android.view.MotionEvent;
import b2.i0;
import b2.v1;
import c2.x;
import java.util.HashMap;
import kotlin.jvm.internal.b0;
import pe.z;

/* loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.m implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f1651u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ s f1652v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(s sVar, int i) {
        super(1);
        this.f1651u = i;
        this.f1652v = sVar;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        x xVar;
        boolean dispatchTouchEvent;
        switch (this.f1651u) {
            case 0:
                v1 v1Var = (v1) obj;
                if (v1Var instanceof x) {
                    xVar = (x) v1Var;
                } else {
                    xVar = null;
                }
                s sVar = this.f1652v;
                if (xVar != null) {
                    xVar.getAndroidViewsHandler$ui_release().removeViewInLayout(sVar);
                    HashMap<i0, k> layoutNodeToHolder = xVar.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder();
                    b0.a(layoutNodeToHolder).remove(xVar.getAndroidViewsHandler$ui_release().getHolderToLayoutNode().remove(sVar));
                    sVar.setImportantForAccessibility(0);
                }
                sVar.removeAllViewsInLayout();
                return z.f22715a;
            default:
                MotionEvent motionEvent = (MotionEvent) obj;
                int actionMasked = motionEvent.getActionMasked();
                s sVar2 = this.f1652v;
                switch (actionMasked) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        dispatchTouchEvent = sVar2.dispatchTouchEvent(motionEvent);
                        break;
                    default:
                        dispatchTouchEvent = sVar2.dispatchGenericMotionEvent(motionEvent);
                        break;
                }
                return Boolean.valueOf(dispatchTouchEvent);
        }
    }
}
