package lg;
import d.b;
import d.d;

import com.google.android.gms.internal.mlkit_vision_digital_ink.er;
import com.google.android.gms.internal.mlkit_vision_digital_ink.u0;
import f4.h;
import ig.j;
import ig.l;
import ig.n;
import ig.o;
import ig.q;
import ig.v;
import ig.w;
import ig.x;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class a implements o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20370a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f20371b;

    public /* synthetic */ a(int i, Object obj) {
        this.f20370a = i;
        this.f20371b = obj;
    }

    @Override // ig.o
    public final w a(mg.e eVar) {
        boolean z3;
        boolean z9;
        switch (this.f20370a) {
            case 0:
                a4.b bVar = eVar.f20820f;
                e eVar2 = eVar.f20817b;
                boolean z10 = !bVar.f239b.equals("GET");
                q qVar = (q) this.f20371b;
                eVar2.getClass();
                try {
                    mg.b h3 = eVar2.d(eVar.i, eVar.f20823j, eVar.f20824k, qVar.O, z10).h(qVar, eVar, eVar2);
                    synchronized (eVar2.f20390d) {
                        eVar2.f20398n = h3;
                    }
                    return eVar.b(bVar, eVar2, h3, eVar2.a());
                } catch (IOException e) {
                    throw new c(e);
                }
            default:
                ig.b bVar2 = (ig.b) this.f20371b;
                a4.b bVar3 = eVar.f20820f;
                u0 b10 = bVar3.b();
                n nVar = (n) bVar3.f240c;
                l lVar = (l) bVar3.f241d;
                er erVar = (er) bVar3.e;
                if (erVar != null) {
                    long a10 = erVar.a();
                    if (a10 != -1) {
                        ((h) b10.f15038x).f("Content-Length", Long.toString(a10));
                        b10.n("Transfer-Encoding");
                    } else {
                        ((h) b10.f15038x).f("Transfer-Encoding", "chunked");
                        b10.n("Content-Length");
                    }
                }
                int i = 0;
                if (lVar.c("Host") == null) {
                    ((h) b10.f15038x).f("Host", jg.b.k(nVar, false));
                }
                if (lVar.c("Connection") == null) {
                    ((h) b10.f15038x).f("Connection", "Keep-Alive");
                }
                if (lVar.c("Accept-Encoding") == null && lVar.c("Range") == null) {
                    ((h) b10.f15038x).f("Accept-Encoding", "gzip");
                    z3 = true;
                } else {
                    z3 = false;
                }
                bVar2.getClass();
                List list = Collections.EMPTY_LIST;
                if (!list.isEmpty()) {
                    StringBuilder sb2 = new StringBuilder();
                    int size = list.size();
                    while (i < size) {
                        if (i > 0) {
                            sb2.append("; ");
                        }
                        j jVar = (j) list.get(i);
                        sb2.append(jVar.f18516a);
                        sb2.append('=');
                        sb2.append(jVar.f18517b);
                        i++;
                        z3 = z3;
                    }
                    z9 = z3;
                    ((h) b10.f15038x).f("Cookie", sb2.toString());
                } else {
                    z9 = z3;
                }
                if (lVar.c("User-Agent") == null) {
                    ((h) b10.f15038x).f("User-Agent", "okhttp/3.12.1");
                }
                w a11 = eVar.a(b10.f());
                l lVar2 = a11.f18601z;
                mg.d(bVar2, nVar, lVar2);
                v j10 = a11.j();
                j10.f18586a = bVar3;
                if (z9 && "gzip".equalsIgnoreCase(a11.f("Content-Encoding")) && mg.b(a11)) {
                    sg.j jVar2 = new sg.j(a11.A.j());
                    h e8 = lVar2.e();
                    e8.e("Content-Encoding");
                    e8.e("Content-Length");
                    ArrayList arrayList = e8.f16717a;
                    String[] strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
                    h hVar = new h(1);
                    Collections.addAll(hVar.f16717a, strArr);
                    j10.f18590f = hVar;
                    a11.f("Content-Type");
                    j10.f18591g = new x(-1L, new sg.n(jVar2), 1);
                }
                return j10.a();
        }
    }
}
