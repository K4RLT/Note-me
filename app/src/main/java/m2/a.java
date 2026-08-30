package m2;
import b.a;
import d.a;
import d.b;
import g0.b;
import i0.j;
import q.d;
import q.x;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.SegmentFinder;
import android.text.TextPaint;
import android.text.TextUtils;
import b0.e1;
import com.google.android.gms.internal.ads.x90;
import com.google.android.gms.internal.mlkit_vision_digital_ink.u0;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import okio.BufferedSource;
import ya.i1;

/* loaded from: classes.dex */
public final class a implements mg.b {

    /* renamed from: a, reason: collision with root package name */
    public int f20434a;

    /* renamed from: b, reason: collision with root package name */
    public long f20435b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f20436c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f20437d;
    public final Object e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f20438f;

    /* JADX WARN: Removed duplicated region for block: B:108:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x024d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(u2.c r22, int r23, int r24, long r25) {
        /*
            Method dump skipped, instructions count: 868
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.a.<init>(u2.c, int, int, long):void");
    }

    @Override // mg.b
    public void a() {
        ((sg.g) this.f20438f).flush();
    }

    @Override // mg.b
    public ig.x b(ig.w wVar) {
        lg.e eVar = (lg.e) this.f20437d;
        eVar.f20391f.getClass();
        wVar.f("Content-Type");
        if (!mg.b(wVar)) {
            return new ig.x(0L, new sg.n(k(0L)), 1);
        }
        long j10 = -1;
        if ("chunked".equalsIgnoreCase(wVar.f("Transfer-Encoding"))) {
            ig.n nVar = (ig.n) wVar.f18596u.f240c;
            if (this.f20434a == 4) {
                this.f20434a = 5;
                return new ig.x(j10, new sg.n(new ng.c(this, nVar)), 1);
            }
            g5.d(this.f20434a, "state: ");
            return null;
        }
        long a10 = mg.d.a(wVar);
        if (a10 != -1) {
            return new ig.x(a10, new sg.n(k(a10)), 1);
        }
        if (this.f20434a == 4) {
            this.f20434a = 5;
            eVar.e();
            return new ig.x(j10, new sg.n(new ng.a(this)), 1);
        }
        g5.d(this.f20434a, "state: ");
        return null;
    }

    @Override // mg.b
    public sg.r c(a4.b bVar, long j10) {
        if ("chunked".equalsIgnoreCase(((ig.l) bVar.f241d).c("Transfer-Encoding"))) {
            if (this.f20434a == 1) {
                this.f20434a = 2;
                return new ng.b(this);
            }
            g5.d(this.f20434a, "state: ");
            return null;
        }
        if (j10 != -1) {
            if (this.f20434a == 1) {
                this.f20434a = 2;
                return new ng.d(this, j10);
            }
            g5.d(this.f20434a, "state: ");
            return null;
        }
        x.o("Cannot stream a request body without chunked encoding or a known content length!");
        return null;
    }

    @Override // mg.b
    public void cancel() {
        lg.b a10 = ((lg.e) this.f20437d).a();
        if (a10 != null) {
            jg.b.e(a10.f20374d);
        }
    }

    @Override // mg.b
    public ig.v d(boolean z3) {
        int i = this.f20434a;
        if (i != 1 && i != 3) {
            g5.d(this.f20434a, "state: ");
            return null;
        }
        try {
            String t3 = ((BufferedSource) this.e).t(this.f20435b);
            this.f20435b -= t3.length();
            e1 h3 = e1.h(t3);
            int i10 = h3.f1179b;
            ig.v vVar = new ig.v();
            vVar.f18587b = (ig.r) h3.f1180c;
            vVar.f18588c = i10;
            vVar.f18589d = (String) h3.f1181d;
            vVar.f18590f = o().e();
            if (z3 && i10 == 100) {
                return null;
            }
            if (i10 == 100) {
                this.f20434a = 3;
                return vVar;
            }
            this.f20434a = 4;
            return vVar;
        } catch (EOFException e) {
            IOException iOException = new IOException("unexpected end of stream on " + ((lg.e) this.f20437d));
            iOException.initCause(e);
            throw iOException;
        }
    }

    @Override // mg.b
    public void e(a4.b bVar) {
        Proxy.Type type = ((lg.e) this.f20437d).a().f20373c.f18606b.type();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(bVar.f239b);
        sb2.append(' ');
        ig.n nVar = (ig.n) bVar.f240c;
        if (!nVar.f18535a.equals("https") && type == Proxy.Type.HTTP) {
            sb2.append(nVar);
        } else {
            String str = nVar.f18541h;
            int indexOf = str.indexOf(47, nVar.f18535a.length() + 3);
            String substring = str.substring(indexOf, jg.b.i(str, indexOf, str.length(), "?#"));
            String e = nVar.e();
            if (e != null) {
                substring = substring + '?' + e;
            }
            sb2.append(substring);
        }
        sb2.append(" HTTP/1.1");
        p((ig.l) bVar.f241d, sb2.toString());
    }

    @Override // mg.b
    public void f() {
        ((sg.g) this.f20438f).flush();
    }

    public n2.h g(int i, int i10, TextUtils.TruncateAt truncateAt, int i11, int i12, int i13, int i14, int i15, CharSequence charSequence) {
        boolean z3;
        x xVar;
        float j10 = j();
        u2.c cVar = (u2.c) this.f20436c;
        u2.e eVar = cVar.A;
        int i16 = cVar.F;
        n2.e eVar2 = cVar.C;
        q0 q0Var = cVar.f25824v;
        u2.a aVar = u2.b.f25822a;
        z zVar = q0Var.f20557c;
        if (zVar != null && (xVar = zVar.f20584b) != null) {
            z3 = xVar.f20581a;
        } else {
            z3 = false;
        }
        return new n2.h(charSequence, j10, eVar, i, truncateAt, i16, z3, i11, i13, i14, i15, i12, i10, eVar2);
    }

    public float h() {
        return ((n2.h) this.f20437d).a();
    }

    /* JADX WARN: Type inference failed for: r13v26, types: [n2.a] */
    public long i(j1.c cVar, int i, l4.a aVar) {
        boolean z3;
        o2.d cVar2;
        int i10;
        int[] iArr;
        SegmentFinder h3;
        n2.h hVar = (n2.h) this.f20437d;
        RectF D = k1.l0.D(cVar);
        if (i != 0 && i == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        final a1.a aVar2 = new a1.a(5, aVar);
        TextPaint textPaint = hVar.f21127a;
        Layout layout = hVar.f21131f;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 34) {
            if (z3) {
                h3 = new o2.a(new x90(layout.getText(), 18, hVar.j()));
            } else {
                j.o();
                h3 = j.h(j.g(layout.getText(), textPaint));
            }
            iArr = layout.getRangeForRect(D, h3, new Layout.TextInclusionStrategy() { // from class: n2.a
                @Override // android.text.Layout.TextInclusionStrategy
                public final boolean isSegmentInside(RectF rectF, RectF rectF2) {
                    return ((Boolean) a1.a.this.invoke(rectF, rectF2)).booleanValue();
                }
            });
        } else {
            u0 c10 = hVar.c();
            if (z3) {
                cVar2 = new x90(layout.getText(), 18, hVar.j());
            } else {
                CharSequence text = layout.getText();
                if (i11 >= 29) {
                    cVar2 = new o2.b(text, textPaint);
                } else {
                    cVar2 = new o2.c(text);
                }
            }
            o2.d dVar = cVar2;
            int lineForVertical = layout.getLineForVertical((int) D.top);
            if (D.top <= hVar.e(lineForVertical) || (lineForVertical = lineForVertical + 1) < hVar.f21132g) {
                int i12 = lineForVertical;
                int lineForVertical2 = layout.getLineForVertical((int) D.bottom);
                if (lineForVertical2 != 0 || D.bottom >= hVar.g(0)) {
                    int b10 = i1.b(hVar, layout, c10, i12, D, dVar, aVar2, true);
                    while (true) {
                        i10 = i12;
                        if (b10 != -1 || i10 >= lineForVertical2) {
                            break;
                        }
                        i12 = i10 + 1;
                        b10 = i1.b(hVar, layout, c10, i12, D, dVar, aVar2, true);
                    }
                    if (b10 != -1) {
                        int i13 = lineForVertical2;
                        int b11 = i1.b(hVar, layout, c10, i13, D, dVar, aVar2, false);
                        while (b11 == -1 && i10 < i13) {
                            i13--;
                            b11 = i1.b(hVar, layout, c10, i13, D, dVar, aVar2, false);
                        }
                        if (b11 != -1) {
                            iArr = new int[]{dVar.i(b10 + 1), dVar.j(b11 - 1)};
                        }
                    }
                }
            }
            iArr = null;
        }
        if (iArr == null) {
            return p0.f20544b;
        }
        return b(iArr[0], iArr[1]);
    }

    public float j() {
        return y2.a.h(this.f20435b);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [ng.e, ng.a] */
    public ng.e k(long j10) {
        if (this.f20434a == 4) {
            this.f20434a = 5;
            ng.a aVar = new ng.a(this);
            aVar.f21369y = j10;
            if (j10 == 0) {
                aVar.f(true, null);
            }
            return aVar;
        }
        g5.d(this.f20434a, "state: ");
        return null;
    }

    public void l(k1.p pVar) {
        Canvas a10 = k1.b.a(pVar);
        n2.h hVar = (n2.h) this.f20437d;
        if (hVar.f21130d) {
            a10.save();
            a10.clipRect(0.0f, 0.0f, j(), h());
        }
        int i = hVar.f21133h;
        if (a10.getClipBounds(hVar.f21140p)) {
            if (i != 0) {
                a10.translate(0.0f, i);
            }
            n2.g gVar = n2.i.f21142a;
            gVar.f21126a = a10;
            hVar.f21131f.draw(gVar);
            if (i != 0) {
                a10.translate(0.0f, (-1) * i);
            }
        }
        if (hVar.f21130d) {
            a10.restore();
        }
    }

    public void m(k1.p pVar, long j10, k1.o0 o0Var, x2.l lVar, m1.e eVar) {
        u2.e eVar2 = ((u2.c) this.f20436c).A;
        int i = eVar2.f25834c;
        eVar2.d(j10);
        eVar2.f(o0Var);
        eVar2.g(lVar);
        eVar2.e(eVar);
        eVar2.b(3);
        l(pVar);
        eVar2.b(i);
    }

    public void n(k1.p pVar, k1.n nVar, float f10, k1.o0 o0Var, x2.l lVar, m1.e eVar) {
        u2.e eVar2 = ((u2.c) this.f20436c).A;
        int i = eVar2.f25834c;
        float j10 = j();
        float h3 = h();
        eVar2.c(nVar, (Float.floatToRawIntBits(h3) & 4294967295L) | (Float.floatToRawIntBits(j10) << 32), f10);
        eVar2.f(o0Var);
        eVar2.g(lVar);
        eVar2.e(eVar);
        eVar2.b(3);
        l(pVar);
        eVar2.b(i);
    }

    public ig.l o() {
        f4.h hVar = new f4.h(1);
        while (true) {
            String t3 = ((BufferedSource) this.e).t(this.f20435b);
            this.f20435b -= t3.length();
            if (t3.length() != 0) {
                ig.b.e.getClass();
                int indexOf = t3.indexOf(":", 1);
                if (indexOf != -1) {
                    hVar.a(t3.substring(0, indexOf), t3.substring(indexOf + 1));
                } else if (t3.startsWith(":")) {
                    hVar.a("", t3.substring(1));
                } else {
                    hVar.a("", t3);
                }
            } else {
                return new ig.l(hVar);
            }
        }
    }

    public void p(ig.l lVar, String str) {
        sg.g gVar = (sg.g) this.f20438f;
        if (this.f20434a == 0) {
            gVar.x(str).x("\r\n");
            int f10 = lVar.f();
            for (int i = 0; i < f10; i++) {
                gVar.x(lVar.d(i)).x(": ").x(lVar.g(i)).x("\r\n");
            }
            gVar.x("\r\n");
            this.f20434a = 1;
            return;
        }
        g5.d(this.f20434a, "state: ");
    }

    public a(ig.q qVar, lg.e eVar, sg.n nVar, sg.m mVar) {
        this.f20434a = 0;
        this.f20435b = 262144L;
        this.f20436c = qVar;
        this.f20437d = eVar;
        this.e = nVar;
        this.f20438f = mVar;
    }
}