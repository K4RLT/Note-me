package i0;

import k1.d0;
import pe.z;
import z1.x;

/* loaded from: classes.dex */
public final /* synthetic */ class b extends kotlin.jvm.internal.j implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ n f18035u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(n nVar) {
        super(1, kotlin.jvm.internal.k.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.f18035u = nVar;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        float[] fArr = ((d0) obj).f19471a;
        x xVar = (x) this.f18035u.L.getValue();
        if (xVar != null) {
            if (!xVar.i()) {
                xVar = null;
            }
            if (xVar != null) {
                xVar.j(fArr);
            }
        }
        return z.f22715a;
    }
}
