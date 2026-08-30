package fg;
import x.n;
import l.e;
import q.x;
import u.a;

import eg.v0;
import eg.w0;
import wa.o6;

/* loaded from: classes.dex */
public final class u implements ag.a {

    /* renamed from: a, reason: collision with root package name */
    public static final u f16997a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final v0 f16998b;

    /* JADX WARN: Type inference failed for: r0v0, types: [fg.u, java.lang.Object] */
    static {
        cg.c cVar = cg.c.f4117j;
        if (!mf.f.u("kotlinx.serialization.json.JsonLiteral")) {
            Object it = ((re.g) w0.f16593a.values()).iterator();
            while (((d4.c) it).hasNext()) {
                ag.a aVar = (ag.a) ((re.c) it).next();
                if ("kotlinx.serialization.json.JsonLiteral".equals(aVar.d().a())) {
                    x.n(mf.g.c("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name kotlinx.serialization.json.JsonLiteral there already exists " + kotlin.jvm.internal.a(aVar.getClass()).c() + ".\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
                    return;
                }
            }
            f16998b = new v0("kotlinx.serialization.json.JsonLiteral", cVar);
            return;
        }
        x.n("Blank serial names are prohibited");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // ag.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(gg.t r4, java.lang.Object r5) {
        /*
            r3 = this;
            fg.t r5 = (fg.t) r5
            r5.getClass()
            java.lang.String r0 = r5.f16996v
            wa.o6.a(r4)
            boolean r5 = r5.f16995u
            if (r5 == 0) goto L12
            r4.u(r0)
            return
        L12:
            java.lang.Long r5 = mf.m.l(r0)
            if (r5 == 0) goto L20
            long r0 = r5.longValue()
            r4.n(r0)
            return
        L20:
            pe.u r5 = ya.y0.b(r0)
            if (r5 == 0) goto L32
            long r0 = r5.f22710u
            eg.z r5 = eg.k1.f16538b
            gg.t r4 = r4.j(r5)
            r4.n(r0)
            return
        L32:
            r5 = 0
            boolean r1 = mf.e(r0)     // Catch: java.lang.NumberFormatException -> L42
            if (r1 == 0) goto L42
            double r1 = java.lang.Double.parseDouble(r0)     // Catch: java.lang.NumberFormatException -> L42
            java.lang.Double r1 = java.lang.Double.valueOf(r1)     // Catch: java.lang.NumberFormatException -> L42
            goto L43
        L42:
            r1 = r5
        L43:
            if (r1 == 0) goto L4d
            double r0 = r1.doubleValue()
            r4.f(r0)
            goto L6f
        L4d:
            java.lang.String r1 = "true"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L58
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            goto L62
        L58:
            java.lang.String r1 = "false"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L62
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
        L62:
            if (r5 == 0) goto L6c
            boolean r5 = r5.booleanValue()
            r4.b(r5)
            goto L6f
        L6c:
            r4.u(r0)
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fg.a(gg.t, java.lang.Object):void");
    }

    @Override // ag.a
    public final Object b(dg.b bVar) {
        m g8 = o6.b(bVar).g();
        if (g8 instanceof t) {
            return (t) g8;
        }
        throw gg.k.e(-1, "Unexpected JSON element, expected JsonLiteral, had " + kotlin.jvm.internal.a(g8.getClass()), g8.toString());
    }

    @Override // ag.a
    public final cg.d d() {
        return f16998b;
    }
}
