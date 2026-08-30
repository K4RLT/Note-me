package v1;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;

/* loaded from: classes.dex */
public abstract class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final k f27293a = new k(qe.s.f24023u, null);

    public static final d1.r b(d1.r rVar, Object obj, PointerInputEventHandler pointerInputEventHandler) {
        return rVar.d(new SuspendPointerInputElement(obj, null, null, pointerInputEventHandler, 6));
    }

    public static final d1.r c(d1.r rVar, Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler) {
        return rVar.d(new SuspendPointerInputElement(obj, obj2, null, pointerInputEventHandler, 4));
    }

    public static final d1.r d(d1.r rVar, Object[] objArr, PointerInputEventHandler pointerInputEventHandler) {
        return rVar.d(new SuspendPointerInputElement(null, null, objArr, pointerInputEventHandler, 3));
    }
}
