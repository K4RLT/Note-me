package le;

import com.google.android.gms.internal.mlkit_vision_digital_ink.ac;
import com.google.android.gms.internal.mlkit_vision_digital_ink.i2;
import com.google.android.gms.internal.mlkit_vision_digital_ink.ib;
import com.google.android.gms.internal.mlkit_vision_digital_ink.jb;
import com.google.android.gms.internal.mlkit_vision_digital_ink.kb;
import com.google.android.gms.internal.mlkit_vision_digital_ink.lf;
import com.google.android.gms.internal.mlkit_vision_digital_ink.mf;
import com.google.android.gms.internal.mlkit_vision_digital_ink.ml;
import com.google.android.gms.internal.mlkit_vision_digital_ink.nl;
import com.google.android.gms.internal.mlkit_vision_digital_ink.ob;
import com.google.android.gms.internal.mlkit_vision_digital_ink.pb;
import com.google.android.gms.internal.mlkit_vision_digital_ink.qb;
import com.google.android.gms.internal.mlkit_vision_digital_ink.rb;
import com.google.android.gms.internal.mlkit_vision_digital_ink.s5;
import com.google.android.gms.internal.mlkit_vision_digital_ink.sb;
import com.google.android.gms.internal.mlkit_vision_digital_ink.tb;
import com.google.android.gms.internal.mlkit_vision_digital_ink.ub;
import com.google.android.gms.internal.mlkit_vision_digital_ink.vb;
import com.google.android.gms.internal.mlkit_vision_digital_ink.wb;
import com.google.android.gms.internal.mlkit_vision_digital_ink.y2;
import com.google.android.gms.internal.mlkit_vision_digital_ink.zb;
import com.google.mlkit.vision.digitalink.common.RecognitionCandidate;
import de.m;
import fa.j;
import fa.y;
import ib.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import je.h;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final kb f20338a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f20339b;

    /* renamed from: c, reason: collision with root package name */
    public int f20340c;

    /* renamed from: d, reason: collision with root package name */
    public final y2 f20341d;
    public long e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f20342f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d f20343g;

    /* renamed from: h, reason: collision with root package name */
    public final int f20344h;

    public c(d dVar, int i) {
        Objects.requireNonNull(dVar);
        this.f20343g = dVar;
        this.f20339b = new ArrayList();
        this.f20340c = 0;
        this.e = 30L;
        this.f20342f = false;
        this.f20344h = i;
        this.f20338a = ac.t();
        this.f20341d = y2.b(i2.f14454a);
    }

    public static final tb h(je.f fVar) {
        List<h> list = fVar.f19180a;
        int i = 0;
        for (h hVar : list) {
            y.h(hVar);
            i += hVar.f19184a.size();
        }
        tb t3 = ub.t();
        int size = list.size();
        t3.b();
        ub.u((ub) t3.f14430v, size);
        t3.b();
        ub.v((ub) t3.f14430v, i);
        return t3;
    }

    public final synchronized void a(je.f fVar, he.a aVar, long j10) {
        int i = this.f20340c;
        int i10 = i + 1;
        this.f20340c = i10;
        if (i >= 30) {
            i = d.f20345b.nextInt(i10);
        }
        if (i >= 30) {
            return;
        }
        ob t3 = pb.t();
        tb h3 = h(fVar);
        t3.b();
        pb.v((pb) t3.f14430v, (ub) h3.i());
        Iterator it = aVar.f18029a.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            String str = ((RecognitionCandidate) it.next()).f15624a;
            i11 += str.codePointCount(0, str.length());
        }
        vb t10 = wb.t();
        int size = aVar.f18029a.size();
        t10.b();
        wb.u((wb) t10.f14430v, size);
        t10.b();
        wb.v((wb) t10.f14430v, i11);
        t3.b();
        pb.w((pb) t3.f14430v, (wb) t10.i());
        t3.b();
        pb.u((pb) t3.f14430v, j10);
        pb pbVar = (pb) t3.i();
        ArrayList arrayList = this.f20339b;
        if (i < arrayList.size()) {
            arrayList.set(i, pbVar);
        } else {
            arrayList.add(pbVar);
        }
        this.f20342f = true;
    }

    public final synchronized void b() {
        if (this.f20342f) {
            g();
            synchronized (this) {
                try {
                    if (this.f20342f) {
                        this.f20339b.clear();
                        this.f20340c = 0;
                        kb kbVar = this.f20338a;
                        kbVar.b();
                        ac.w((ac) kbVar.f14430v);
                    }
                    this.f20342f = false;
                    y2 y2Var = this.f20341d;
                    y2Var.f15269b = false;
                    y2Var.f15269b = true;
                    y2Var.f15270c = y2Var.f15268a.c();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void c(long j10) {
        kb kbVar = this.f20338a;
        kbVar.b();
        ac.y((ac) kbVar.f14430v, j10);
    }

    public final void d(je.b bVar) {
        sb t3 = sb.t();
        kb kbVar = this.f20338a;
        kbVar.b();
        ac.A((ac) kbVar.f14430v, t3);
        je.c cVar = bVar.f19173c;
        qb t10 = rb.t();
        String str = cVar.f18438a;
        t10.b();
        rb.u((rb) t10.f14430v, str);
        kbVar.b();
        ac.z((ac) kbVar.f14430v, (rb) t10.i());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(le.g r4) {
        /*
            r3 = this;
            com.google.android.gms.internal.mlkit_vision_digital_ink.mb r0 = com.google.android.gms.internal.mlkit_vision_digital_ink.nb.t()
            int r1 = r4.f20352u
            r0.b()
            com.google.android.gms.internal.mlkit_vision_digital_ink.nn r2 = r0.f14430v
            com.google.android.gms.internal.mlkit_vision_digital_ink.nb r2 = (com.google.android.gms.internal.mlkit_vision_digital_ink.nb) r2
            com.google.android.gms.internal.mlkit_vision_digital_ink.nb.w(r2, r1)
            java.util.regex.Pattern r1 = le.g.f20351w
            java.lang.String r4 = r4.f20353v
            java.util.regex.Matcher r4 = r1.matcher(r4)
            boolean r1 = r4.matches()
            if (r1 != 0) goto L1f
            goto L4b
        L1f:
            java.io.File r1 = new java.io.File     // Catch: java.lang.NumberFormatException -> L4b
            r2 = 1
            java.lang.String r2 = r4.group(r2)     // Catch: java.lang.NumberFormatException -> L4b
            fa.y.h(r2)     // Catch: java.lang.NumberFormatException -> L4b
            r1.<init>(r2)     // Catch: java.lang.NumberFormatException -> L4b
            java.lang.String r1 = r1.getName()     // Catch: java.lang.NumberFormatException -> L4b
            r2 = 2
            java.lang.String r4 = r4.group(r2)     // Catch: java.lang.NumberFormatException -> L4b
            fa.y.h(r4)     // Catch: java.lang.NumberFormatException -> L4b
            int r4 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.NumberFormatException -> L4b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.NumberFormatException -> L4b
            com.google.android.gms.internal.mlkit_vision_digital_ink.r2 r2 = new com.google.android.gms.internal.mlkit_vision_digital_ink.r2     // Catch: java.lang.NumberFormatException -> L4b
            r2.<init>(r1, r4)     // Catch: java.lang.NumberFormatException -> L4b
            com.google.android.gms.internal.mlkit_vision_digital_ink.s2 r4 = new com.google.android.gms.internal.mlkit_vision_digital_ink.s2     // Catch: java.lang.NumberFormatException -> L4b
            r4.<init>(r2)     // Catch: java.lang.NumberFormatException -> L4b
            goto L4d
        L4b:
            com.google.android.gms.internal.mlkit_vision_digital_ink.j2 r4 = com.google.android.gms.internal.mlkit_vision_digital_ink.j2.f14494u
        L4d:
            boolean r1 = r4.c()
            if (r1 == 0) goto L7d
            java.lang.Object r1 = r4.a()
            com.google.android.gms.internal.mlkit_vision_digital_ink.r2 r1 = (com.google.android.gms.internal.mlkit_vision_digital_ink.r2) r1
            java.lang.Object r1 = r1.f14888u
            java.lang.String r1 = (java.lang.String) r1
            r0.b()
            com.google.android.gms.internal.mlkit_vision_digital_ink.nn r2 = r0.f14430v
            com.google.android.gms.internal.mlkit_vision_digital_ink.nb r2 = (com.google.android.gms.internal.mlkit_vision_digital_ink.nb) r2
            com.google.android.gms.internal.mlkit_vision_digital_ink.nb.u(r2, r1)
            java.lang.Object r4 = r4.a()
            com.google.android.gms.internal.mlkit_vision_digital_ink.r2 r4 = (com.google.android.gms.internal.mlkit_vision_digital_ink.r2) r4
            java.lang.Integer r4 = r4.f14889v
            int r4 = r4.intValue()
            r0.b()
            com.google.android.gms.internal.mlkit_vision_digital_ink.nn r1 = r0.f14430v
            com.google.android.gms.internal.mlkit_vision_digital_ink.nb r1 = (com.google.android.gms.internal.mlkit_vision_digital_ink.nb) r1
            com.google.android.gms.internal.mlkit_vision_digital_ink.nb.v(r1, r4)
        L7d:
            com.google.android.gms.internal.mlkit_vision_digital_ink.kb r4 = r3.f20338a
            r4.b()
            com.google.android.gms.internal.mlkit_vision_digital_ink.nn r4 = r4.f14430v
            com.google.android.gms.internal.mlkit_vision_digital_ink.ac r4 = (com.google.android.gms.internal.mlkit_vision_digital_ink.ac) r4
            com.google.android.gms.internal.mlkit_vision_digital_ink.nn r0 = r0.i()
            com.google.android.gms.internal.mlkit_vision_digital_ink.nb r0 = (com.google.android.gms.internal.mlkit_vision_digital_ink.nb) r0
            com.google.android.gms.internal.mlkit_vision_digital_ink.ac.B(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: le.c.e(le.g):void");
    }

    public final void f(zb zbVar) {
        kb kbVar = this.f20338a;
        kbVar.b();
        ac.E((ac) kbVar.f14430v, zbVar);
    }

    public final synchronized void g() {
        String a10;
        ib t3 = jb.t();
        int i = this.f20340c;
        t3.b();
        jb.v((jb) t3.f14430v, i);
        ArrayList arrayList = this.f20339b;
        t3.b();
        jb.u((jb) t3.f14430v, arrayList);
        kb kbVar = this.f20338a;
        kbVar.b();
        ac.x((ac) kbVar.f14430v, (jb) t3.i());
        nl nlVar = this.f20343g.f20346a;
        lf u9 = mf.u();
        u9.b();
        mf.y((mf) u9.f14430v);
        u9.l(ac.zza, (ac) kbVar.i());
        s5 s5Var = new s5(u9);
        int i10 = this.f20344h;
        o oVar = nlVar.e;
        if (oVar.l()) {
            a10 = (String) oVar.j();
        } else {
            a10 = j.f16877c.a(nlVar.f14713g);
        }
        m.f15854u.execute(new ml(nlVar, s5Var, i10, a10));
    }
}
