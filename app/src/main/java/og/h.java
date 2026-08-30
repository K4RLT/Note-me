package og;
import d.a;

import b0.e1;
import com.google.android.gms.internal.mlkit_vision_digital_ink.er;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import ya.dc;

/* loaded from: classes.dex */
public final class h implements mg.b {

    /* renamed from: f, reason: collision with root package name */
    public static final List f22010f = jg.b.l("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: g, reason: collision with root package name */
    public static final List f22011g = jg.b.l("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a, reason: collision with root package name */
    public final mg.e f22012a;

    /* renamed from: b, reason: collision with root package name */
    public final lg.e f22013b;

    /* renamed from: c, reason: collision with root package name */
    public final r f22014c;

    /* renamed from: d, reason: collision with root package name */
    public w f22015d;
    public final ig.r e;

    public h(ig.q qVar, mg.e eVar, lg.e eVar2, r rVar) {
        this.f22012a = eVar;
        this.f22013b = eVar2;
        this.f22014c = rVar;
        List list = qVar.f18566w;
        ig.r rVar2 = ig.r.H2_PRIOR_KNOWLEDGE;
        this.e = list.contains(rVar2) ? rVar2 : ig.r.HTTP_2;
    }

    @Override // mg.b
    public final void a() {
        this.f22015d.e().close();
    }

    @Override // mg.b
    public final ig.x b(ig.w wVar) {
        this.f22013b.f20391f.getClass();
        wVar.f("Content-Type");
        return new ig.x(mg.a(wVar), new sg.n(new g(this, this.f22015d.f22070g)), 1);
    }

    @Override // mg.b
    public final sg.r c(a4.b bVar, long j10) {
        return this.f22015d.e();
    }

    @Override // mg.b
    public final void cancel() {
        w wVar = this.f22015d;
        if (wVar != null && wVar.d(6)) {
            wVar.f22068d.B(wVar.f22067c, 6);
        }
    }

    @Override // mg.b
    public final ig.v d(boolean z3) {
        ig.l lVar;
        w wVar = this.f22015d;
        synchronized (wVar) {
            wVar.i.j();
            while (wVar.e.isEmpty() && wVar.f22073k == 0) {
                try {
                    try {
                        wVar.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    wVar.i.o();
                    throw th;
                }
            }
            wVar.i.o();
            if (!wVar.e.isEmpty()) {
                lVar = (ig.l) wVar.e.removeFirst();
            } else {
                throw new a0(wVar.f22073k);
            }
        }
        ig.r rVar = this.e;
        ArrayList arrayList = new ArrayList(20);
        int f10 = lVar.f();
        e1 e1Var = null;
        for (int i = 0; i < f10; i++) {
            String d2 = lVar.d(i);
            String g8 = lVar.g(i);
            if (d2.equals(":status")) {
                e1Var = e1.h("HTTP/1.1 " + g8);
            } else if (!f22011g.contains(d2)) {
                ig.b.e.getClass();
                arrayList.add(d2);
                arrayList.add(g8.trim());
            }
        }
        if (e1Var != null) {
            ig.v vVar = new ig.v();
            vVar.f18587b = rVar;
            vVar.f18588c = e1Var.f1179b;
            vVar.f18589d = (String) e1Var.f1181d;
            String[] strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
            f4.h hVar = new f4.h(1);
            Collections.addAll(hVar.f16717a, strArr);
            vVar.f18590f = hVar;
            if (z3) {
                ig.b.e.getClass();
                if (vVar.f18588c == 100) {
                    return null;
                }
            }
            return vVar;
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    @Override // mg.b
    public final void e(a4.b bVar) {
        boolean z3;
        int i;
        w wVar;
        if (this.f22015d != null) {
            return;
        }
        boolean z9 = false;
        if (((er) bVar.e) != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        ig.l lVar = (ig.l) bVar.f241d;
        ArrayList arrayList = new ArrayList(lVar.f() + 4);
        arrayList.add(new b(b.f21980f, bVar.f239b));
        sg.h hVar = b.f21981g;
        ig.n nVar = (ig.n) bVar.f240c;
        String str = nVar.f18541h;
        int indexOf = str.indexOf(47, nVar.f18535a.length() + 3);
        String substring = str.substring(indexOf, jg.b.i(str, indexOf, str.length(), "?#"));
        String e = nVar.e();
        if (e != null) {
            substring = substring + '?' + e;
        }
        arrayList.add(new b(hVar, substring));
        String c10 = ((ig.l) bVar.f241d).c("Host");
        if (c10 != null) {
            arrayList.add(new b(b.i, c10));
        }
        arrayList.add(new b(b.f21982h, nVar.f18535a));
        int f10 = lVar.f();
        for (int i10 = 0; i10 < f10; i10++) {
            String lowerCase = lVar.d(i10).toLowerCase(Locale.US);
            char[] cArr = sg.h.f25275x;
            sg.h a10 = dc.a(lowerCase);
            if (!f22010f.contains(a10.i())) {
                arrayList.add(new b(a10, lVar.g(i10)));
            }
        }
        r rVar = this.f22014c;
        boolean z10 = !z3;
        synchronized (rVar.L) {
            synchronized (rVar) {
                try {
                    if (rVar.f22043z > 1073741823) {
                        rVar.r(5);
                    }
                    if (!rVar.A) {
                        i = rVar.f22043z;
                        rVar.f22043z = i + 2;
                        wVar = new w(i, rVar, z10, false, null);
                        if (!z3 || rVar.G == 0 || wVar.f22066b == 0) {
                            z9 = true;
                        }
                        if (wVar.g()) {
                            rVar.f22040w.put(Integer.valueOf(i), wVar);
                        }
                    } else {
                        throw new IOException();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            x xVar = rVar.L;
            synchronized (xVar) {
                if (!xVar.f22078y) {
                    xVar.o(z10, i, arrayList);
                } else {
                    throw new IOException("closed");
                }
            }
        }
        if (z9) {
            rVar.L.flush();
        }
        this.f22015d = wVar;
        wVar.i.g(this.f22012a.f20823j);
        this.f22015d.f22072j.g(this.f22012a.f20824k);
    }

    @Override // mg.b
    public final void f() {
        this.f22014c.flush();
    }
}
