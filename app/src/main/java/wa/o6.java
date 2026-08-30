package wa;
import g5.q;
import z.a;

/* loaded from: classes.dex */
public abstract class o6 {
    public static final void a(gg.t tVar) {
        gg.t tVar2;
        tVar.getClass();
        if (tVar instanceof gg.t) {
            tVar2 = tVar;
        } else {
            tVar2 = null;
        }
        if (tVar2 != null) {
            return;
        }
        q.m(kotlin.jvm.internal.a(tVar.getClass()), "This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got ");
    }

    public static final fg.k b(dg.b bVar) {
        fg.k kVar;
        bVar.getClass();
        if (bVar instanceof fg.k) {
            kVar = (fg.k) bVar;
        } else {
            kVar = null;
        }
        if (kVar != null) {
            return kVar;
        }
        q.m(kotlin.jvm.internal.a(bVar.getClass()), "This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got ");
        return null;
    }
}
