package wa;
import q.x;

/* loaded from: classes.dex */
public abstract class y {
    public static cg.e a(String str, z zVar, cg.d[] dVarArr) {
        if (!mf.f.u(str)) {
            if (!zVar.equals(cg.i.f4134b)) {
                cg.a aVar = new cg.a(str);
                return new cg.e(str, zVar, aVar.f4106b.size(), qe.k.t(dVarArr), aVar);
            }
            x.n("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
        x.n("Blank serial names are prohibited");
        return null;
    }
}
