package v1;
import l.a;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* loaded from: classes.dex */
public final /* synthetic */ class c0 implements PointerInputEventHandler, kotlin.jvm.internal.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ df.p f27289a;

    public c0(df.p pVar) {
        this.f27289a = pVar;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof PointerInputEventHandler) && (obj instanceof kotlin.jvm.internal.g)) {
            return kotlin.jvm.internal.a(this.f27289a, ((kotlin.jvm.internal.g) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.g
    public final pe.d getFunctionDelegate() {
        return this.f27289a;
    }

    public final int hashCode() {
        return this.f27289a.hashCode();
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final /* synthetic */ Object invoke(w wVar, te.c cVar) {
        return this.f27289a.invoke(wVar, cVar);
    }
}
