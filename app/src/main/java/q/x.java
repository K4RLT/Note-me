package q;
import x.b;
import j.i0;
import l.a;
import q.w;
import q.x;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.ads.gl;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import qc.m2;
import wa.h8;

/* loaded from: classes.dex */
public final /* synthetic */ class x implements w, ib.g, r2.e0, c7.l, c7.j, c7.k, ib.c, u8.d, k8.e, ic.d {

    /* renamed from: u */
    public final /* synthetic */ int f23024u;

    public /* synthetic */ x(int i) {
        this.f23024u = i;
    }

    public static /* synthetic */ void h() {
        throw new UnsupportedOperationException();
    }

    public static /* synthetic */ void i(int i, StringBuilder sb2) {
        sb2.append(i);
        throw new IllegalArgumentException(sb2.toString().toString());
    }

    public static /* synthetic */ void j(Object obj) {
        throw new IllegalArgumentException(obj.toString());
    }

    public static /* synthetic */ void k(Object obj, String str) {
        throw new IllegalArgumentException((str + obj).toString());
    }

    public static /* synthetic */ void l(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    public static /* synthetic */ void m() {
        throw new IllegalArgumentException();
    }

    public static /* synthetic */ void n(String str) {
        throw new IllegalArgumentException(str);
    }

    public static /* synthetic */ void o(String str) {
        throw new IllegalStateException(str);
    }

    public static /* synthetic */ void p(String str) {
        throw new IOException(str);
    }

    @Override // w
    public float a(float f10) {
        return f10;
    }

    @Override // u8.d
    public Object apply(Object obj) {
        byte[] decode;
        switch (this.f23024u) {
            case 23:
                Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
                try {
                    ArrayList arrayList = new ArrayList();
                    while (rawQuery.moveToNext()) {
                        i0 a10 = n8.i.a();
                        a10.E(rawQuery.getString(1));
                        a10.f18638x = x8.a.b(rawQuery.getInt(2));
                        String string = rawQuery.getString(3);
                        if (string == null) {
                            decode = null;
                        } else {
                            decode = Base64.decode(string, 0);
                        }
                        a10.f18637w = decode;
                        arrayList.add(a10.d());
                    }
                    return arrayList;
                } finally {
                    rawQuery.close();
                }
            case 24:
                uc.a.f27159b.getClass();
                return rc.a.f24679a.g((m2) obj).getBytes(Charset.forName("UTF-8"));
            default:
                String g8 = vd.c0.f27557b.g((vd.b0) obj);
                g8.getClass();
                Log.d("EventGDTLogger", "Session Event: ".concat(g8));
                byte[] bytes = g8.getBytes(mf.a.f20798a);
                bytes.getClass();
                return bytes;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0071, code lost:
    
        if (r4 == null) goto L120;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [r7.g] */
    @Override // c7.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(c7.f r11, c7.n r12) {
        /*
            r10 = this;
            sf.n0 r0 = r7.h.f24629a
            r11.getClass()
            int r11 = r11.f3946a
            if (r11 == 0) goto Ld
            r7.h.e()
            return
        Ld:
            java.util.List r11 = r12.f3974a
            r11.getClass()
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r11 = r11.iterator()
        L1d:
            boolean r0 = r11.hasNext()
            r1 = 0
            if (r0 == 0) goto La9
            java.lang.Object r0 = r11.next()
            r5 = r0
            c7.i r5 = (c7.i) r5
            we.a r0 = r7.n.getEntries()
            java.util.Iterator r0 = r0.iterator()
        L33:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L4d
            java.lang.Object r2 = r0.next()
            r3 = r2
            r7.n r3 = (r7.n) r3
            java.lang.String r3 = r3.getProductId()
            java.lang.String r4 = r5.f3963c
            boolean r3 = kotlin.jvm.internal.a(r3, r4)
            if (r3 == 0) goto L33
            goto L4e
        L4d:
            r2 = r1
        L4e:
            r3 = r2
            r7.n r3 = (r7.n) r3
            if (r3 != 0) goto L55
            goto La2
        L55:
            java.util.ArrayList r0 = r5.i
            if (r0 == 0) goto L60
            java.lang.Object r0 = qe.l.x(r0)
            c7.h r0 = (c7.h) r0
            goto L61
        L60:
            r0 = r1
        L61:
            c7.h r2 = r5.a()
            if (r0 == 0) goto L6b
            java.lang.String r4 = r0.f3953a
            if (r4 != 0) goto L74
        L6b:
            if (r2 == 0) goto L70
            java.lang.String r4 = r2.f3953a
            goto L71
        L70:
            r4 = r1
        L71:
            if (r4 != 0) goto L74
            goto La2
        L74:
            if (r0 == 0) goto L7a
            long r6 = r0.f3954b
        L78:
            r7 = r6
            goto L82
        L7a:
            if (r2 == 0) goto L7f
            long r6 = r2.f3954b
            goto L78
        L7f:
            r6 = 0
            goto L78
        L82:
            if (r0 == 0) goto L8b
            java.lang.String r6 = r0.f3955c
            if (r6 != 0) goto L89
            goto L8b
        L89:
            r9 = r6
            goto L97
        L8b:
            if (r2 == 0) goto L91
            java.lang.String r2 = r2.f3955c
            r6 = r2
            goto L92
        L91:
            r6 = r1
        L92:
            if (r6 != 0) goto L89
            java.lang.String r6 = ""
            goto L89
        L97:
            r7.g r2 = new r7.g
            if (r0 == 0) goto L9d
            java.lang.String r1 = r0.f3956d
        L9d:
            r6 = r1
            r2.<init>(r3, r4, r5, r6, r7, r9)
            r1 = r2
        La2:
            if (r1 == 0) goto L1d
            r12.add(r1)
            goto L1d
        La9:
            eb.u1 r11 = new eb.u1
            r0 = 7
            r11.<init>(r0)
            java.util.List r11 = qe.l.K(r12, r11)
            boolean r12 = r11.isEmpty()
            if (r12 == 0) goto Lbd
            r7.h.e()
            return
        Lbd:
            sf.n0 r12 = r7.h.f24631c
            r12.getClass()
            r12.k(r1, r11)
            sf.n0 r11 = r7.h.f24629a
            r7.f r12 = r7.f.READY
            r11.j(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q.x.b(c7.f, c7.n):void");
    }

    @Override // c7.k
    public void c(c7.f fVar, List list) {
        fVar.getClass();
        list.getClass();
        if (fVar.f3946a == 0) {
            r7.h.d(list, false);
        }
    }

    @Override // c7.l
    public void d(c7.f fVar, List list) {
        fVar.getClass();
        if (fVar.f3946a == 0 && list != null) {
            r7.h.d(list, true);
        }
    }

    @Override // ic.d
    public Object e(g9.n nVar) {
        vd.l components$lambda$0;
        vd.h0 components$lambda$1;
        vd.d0 components$lambda$2;
        switch (this.f23024u) {
            case 27:
                components$lambda$0 = FirebaseSessionsRegistrar.getComponents$lambda$0(nVar);
                return components$lambda$0;
            case 28:
                components$lambda$1 = FirebaseSessionsRegistrar.getComponents$lambda$1(nVar);
                return components$lambda$1;
            default:
                components$lambda$2 = FirebaseSessionsRegistrar.getComponents$lambda$2(nVar);
                return components$lambda$2;
        }
    }

    @Override // ib.c
    public void f(ib.o oVar) {
        String str;
        switch (this.f23024u) {
            case gl.zzm /* 21 */:
                sf.n0 n0Var = t7.b.f25651a;
                oVar.getClass();
                t7.b.f25655f = false;
                if (oVar.l()) {
                    t7.b.e = (ub.a) oVar.j();
                    t7.b.f("② Flujo PRECALENTADO (listo para lanzar)");
                    return;
                }
                Exception i = oVar.i();
                if (i != null) {
                    str = i.getMessage();
                } else {
                    str = null;
                }
                t7.b.f("② Play NO dio flujo: " + str);
                sf.n0 n0Var2 = t7.b.f25651a;
                Boolean bool = Boolean.FALSE;
                n0Var2.getClass();
                n0Var2.k(null, bool);
                return;
            default:
                oVar.getClass();
                t7.b.f("④ Flujo TERMINADO. Si no viste diálogo: el APK no viene de Play (o ya se gastó la cuota). Es lo esperado en debug sideloaded.");
                return;
        }
    }

    @Override // r2.e0
    public r2.c0 g(m2.g gVar) {
        return new r2.c0(gVar, r2.p.f24501a);
    }

    @Override // ib.g
    public ib.o q(Object obj) {
        return h8.e(null);
    }

    public /* synthetic */ x(int i, Object obj) {
        this.f23024u = i;
    }
}
