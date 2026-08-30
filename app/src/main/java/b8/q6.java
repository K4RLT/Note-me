package b8;
import eb.x;
import j1.b;
import k1.r;
import k7.f;
import r0.a1;
import y2.c;
import y2.j;

/* loaded from: classes.dex */
public final /* synthetic */ class q6 implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2591u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ a1 f2592v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a1 f2593w;

    public /* synthetic */ q6(int i, a1 a1Var, a1 a1Var2) {
        this.f2591u = i;
        this.f2592v = a1Var;
        this.f2593w = a1Var2;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        int i = this.f2591u;
        pe.z zVar = pe.z.f22715a;
        a1 a1Var = this.f2593w;
        a1 a1Var2 = this.f2592v;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                a1Var2.setValue(str);
                a1Var.setValue(null);
                return zVar;
            case 1:
                String str2 = (String) obj;
                str2.getClass();
                a1Var2.setValue(str2);
                a1Var.setValue(null);
                return zVar;
            case 2:
                f fVar = (f) obj;
                fVar.getClass();
                a1Var2.setValue(fVar);
                a1Var.setValue(la.PUBLISH_FORM);
                return zVar;
            case 3:
                ca caVar = (ca) obj;
                caVar.getClass();
                a1Var2.setValue(caVar);
                a1Var.setValue(la.DETAIL);
                return zVar;
            case 4:
                a1Var2.getClass();
                a1Var.getClass();
                long g8 = b.g(((b) obj).f18762a, ((b) a1Var2.getValue()).f18762a);
                float atan2 = (float) Math.atan2(b.f(g8), b.e(g8));
                float f10 = ((-(57.295776f * atan2)) + 360.0f) % 360.0f;
                float min = Math.min(((float) Math.sqrt((b.f(g8) * b.f(g8)) + (b.e(g8) * b.e(g8)))) / ((Number) a1Var.getValue()).floatValue(), 1.0f);
                float floatValue = ((Number) a1Var.getValue()).floatValue() * min;
                double d2 = atan2;
                long h3 = b.h(wa.r8.a(((float) Math.cos(d2)) * floatValue, ((float) Math.sin(d2)) * floatValue), ((b) a1Var2.getValue()).f18762a);
                try {
                    int i10 = r.f19522m;
                    return new pe.j(new r(x.h(f10, min, 1.0f, 0.0f, 24)), new b(h3));
                } catch (IllegalArgumentException unused) {
                    int i11 = r.f19522m;
                    return new pe.j(new r(x.h(0.0f, 0.0f, 0.0f, 0.0f, 24)), new b(h3));
                }
            default:
                ((c) obj).getClass();
                return new j((ff.a.b(Float.intBitsToFloat((int) (((b) a1Var.getValue()).f18762a & 4294967295L)) + Float.intBitsToFloat((int) (((b) a1Var2.getValue()).f18762a & 4294967295L))) & 4294967295L) | (ff.a.b(Float.intBitsToFloat((int) (w7.n4.e(a1Var) >> 32)) + Float.intBitsToFloat((int) (((b) a1Var2.getValue()).f18762a >> 32))) << 32));
        }
    }
}
