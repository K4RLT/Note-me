package n8;
import q.h;

import b2.f1;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final i f21197a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21198b;

    /* renamed from: c, reason: collision with root package name */
    public final k8.c f21199c;

    /* renamed from: d, reason: collision with root package name */
    public final k8.e f21200d;
    public final q e;

    public p(i iVar, String str, k8.c cVar, k8.e eVar, q qVar) {
        this.f21197a = iVar;
        this.f21198b = str;
        this.f21199c = cVar;
        this.f21200d = eVar;
        this.e = qVar;
    }

    public final void a(k8.a aVar, k8.g gVar) {
        k8.e eVar = this.f21200d;
        if (eVar != null) {
            q qVar = this.e;
            s8.a aVar2 = qVar.f21203c;
            i b10 = this.f21197a.b(aVar.f19622b);
            f1 f1Var = new f1();
            f1Var.A = new HashMap();
            f1Var.f1459y = Long.valueOf(qVar.f21201a.e());
            f1Var.f1460z = Long.valueOf(qVar.f21202b.e());
            f1Var.f1456v = this.f21198b;
            f1Var.f1458x = new k(this.f21199c, (byte[]) eVar.apply(aVar.f19621a));
            f1Var.f1457w = null;
            k8.b bVar = aVar.f19623c;
            if (bVar != null) {
                f1Var.B = bVar.f19624a;
            }
            aVar2.f25033b.execute(new b6.l(aVar2, b10, gVar, f1Var.e(), 4));
            return;
        }
        g5.h("Null transformer");
    }
}
