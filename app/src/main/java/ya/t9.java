package ya;
import q1.b0;
import q1.b;
import q1.d0;
import q1.h;
import q1.z;

import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class t9 {
    public static final void a(b bVar, z zVar) {
        ArrayList arrayList = zVar.f23322v;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            b0 b0Var = (b0) arrayList.get(i);
            if (b0Var instanceof d0) {
                h hVar = new h();
                d0 d0Var = (d0) b0Var;
                hVar.f23265c = d0Var.f23244u;
                hVar.f23271k = true;
                hVar.c();
                hVar.f23276p.l(d0Var.f23245v);
                hVar.c();
                hVar.c();
                hVar.f23264b = d0Var.f23246w;
                hVar.c();
                hVar.c();
                hVar.f23267f = d0Var.f23247x;
                hVar.c();
                hVar.f23266d = 1.0f;
                hVar.c();
                hVar.e = d0Var.f23248y;
                hVar.f23272l = true;
                hVar.c();
                hVar.f23268g = d0Var.f23249z;
                hVar.f23272l = true;
                hVar.c();
                hVar.f23269h = d0Var.A;
                hVar.f23272l = true;
                hVar.c();
                hVar.i = d0Var.B;
                hVar.f23272l = true;
                hVar.c();
                hVar.f23273m = true;
                hVar.c();
                hVar.f23270j = 1.0f;
                hVar.f23273m = true;
                hVar.c();
                hVar.f23273m = true;
                hVar.c();
                bVar.e(i, hVar);
            } else if (b0Var instanceof z) {
                b bVar2 = new b();
                z zVar2 = (z) b0Var;
                bVar2.f23224k = "";
                bVar2.c();
                bVar2.f23227n = true;
                bVar2.c();
                bVar2.f23225l = 1.0f;
                bVar2.f23227n = true;
                bVar2.c();
                bVar2.f23226m = 1.0f;
                bVar2.f23227n = true;
                bVar2.c();
                bVar2.f23227n = true;
                bVar2.c();
                bVar2.f23227n = true;
                bVar2.c();
                bVar2.f23227n = true;
                bVar2.c();
                bVar2.f23227n = true;
                bVar2.c();
                bVar2.f23220f = zVar2.f23321u;
                bVar2.f23221g = true;
                bVar2.c();
                a(bVar2, zVar2);
                bVar.e(i, bVar2);
            }
        }
    }
}
