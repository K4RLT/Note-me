package i1;
import d.a;
import f.a;
import f.g;
import j.e;
import j.i;
import l.a;
import l.e;
import n.p0;
import q.x;

import a0.g0;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillManager;
import androidx.compose.ui.focus.FocusOwnerImpl$modifier$1;
import androidx.datastore.preferences.protobuf.s1;
import b2.b1;
import b2.f1;
import b2.g2;
import b2.i0;
import b2.k0;
import c2.n0;
import c2.v1;
import c2.x;
import d1.q;
import i1.j;
import java.util.ArrayList;
import k1.l0;
import n.b0;
import n.d0;

/* loaded from: classes.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    public final x f18106a;

    /* renamed from: b, reason: collision with root package name */
    public final x f18107b;

    /* renamed from: d, reason: collision with root package name */
    public final g f18109d;

    /* renamed from: f, reason: collision with root package name */
    public b0 f18110f;

    /* renamed from: h, reason: collision with root package name */
    public s f18112h;

    /* renamed from: c, reason: collision with root package name */
    public final s f18108c = new s(2, null, 6);
    public final FocusOwnerImpl$modifier$1 e = new b1() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$1
        public final boolean equals(Object obj) {
            return obj == this;
        }

        @Override // b2.b1
        public final q f() {
            return j.this.f18108c;
        }

        @Override // b2.b1
        public final /* bridge */ /* synthetic */ void g(q qVar) {
        }

        public final int hashCode() {
            return j.this.f18108c.hashCode();
        }
    };

    /* renamed from: g, reason: collision with root package name */
    public final d0 f18111g = new d0(1);

    /* JADX WARN: Type inference failed for: r4v3, types: [androidx.compose.ui.focus.FocusOwnerImpl$modifier$1] */
    public j(x xVar, x xVar2) {
        this.f18106a = xVar;
        this.f18107b = xVar2;
        this.f18109d = new g(this, xVar2);
    }

    public final boolean b(boolean z3) {
        f1 f1Var;
        s sVar = this.f18112h;
        if (sVar != null) {
            h(null);
            r rVar = r.f18130u;
            r rVar2 = r.f18133x;
            sVar.Y0(rVar, rVar2);
            if (!sVar.f15688u.H) {
                y1.a.b("visitAncestors called on an unattached node");
            }
            d1.q qVar = sVar.f15688u.f15692y;
            i0 u9 = b2.l.u(sVar);
            while (u9 != null) {
                if ((((d1.q) u9.Z.A).f15691x & 1024) != 0) {
                    while (qVar != null) {
                        if ((qVar.f15690w & 1024) != 0) {
                            t0.e eVar = null;
                            d1.q qVar2 = qVar;
                            while (qVar2 != null) {
                                if (qVar2 instanceof s) {
                                    ((s) qVar2).Y0(r.f18131v, rVar2);
                                } else if ((qVar2.f15690w & 1024) != 0 && (qVar2 instanceof b2.k)) {
                                    int i = 0;
                                    for (d1.q qVar3 = ((b2.k) qVar2).J; qVar3 != null; qVar3 = qVar3.f15693z) {
                                        if ((qVar3.f15690w & 1024) != 0) {
                                            i++;
                                            if (i == 1) {
                                                qVar2 = qVar3;
                                            } else {
                                                if (eVar == null) {
                                                    eVar = new t0.e(new d1.q[16]);
                                                }
                                                if (qVar2 != null) {
                                                    eVar.b(qVar2);
                                                    qVar2 = null;
                                                }
                                                eVar.b(qVar3);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                qVar2 = b2.e(eVar);
                            }
                        }
                        qVar = qVar.f15692y;
                    }
                }
                u9 = u9.v();
                if (u9 != null && (f1Var = u9.Z) != null) {
                    qVar = (g2) f1Var.f1460z;
                } else {
                    qVar = null;
                }
            }
        }
        return true;
    }

    public final boolean c(int i, boolean z3, boolean z9) {
        boolean z10 = true;
        if (!z3) {
            int ordinal = f.s(this.f18108c, i).ordinal();
            if (ordinal != 0) {
                if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
                    l4.a.o();
                    return false;
                }
                z10 = false;
            } else {
                b(z3);
            }
        } else {
            b(z3);
        }
        if (z10 && z9) {
            d();
        }
        return z10;
    }

    public final void d() {
        x xVar = this.f18106a;
        if (!xVar.isFocused() && !xVar.hasFocus()) {
            if (xVar.hasFocus()) {
                View findFocus = xVar.findFocus();
                if (findFocus != null) {
                    findFocus.clearFocus();
                }
                xVar.clearFocus();
                return;
            }
            return;
        }
        xVar.clearFocus();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005a, code lost:
    
        if (r8 == null) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0172 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:9:0x001c, B:13:0x0026, B:16:0x0032, B:18:0x0038, B:19:0x003d, B:21:0x0045, B:23:0x004a, B:25:0x0050, B:29:0x0056, B:34:0x0172, B:36:0x0178, B:37:0x017b, B:39:0x0186, B:42:0x0194, B:46:0x019e, B:81:0x01a4, B:82:0x01a9, B:75:0x01e3, B:48:0x01ad, B:50:0x01b3, B:52:0x01b7, B:54:0x01bf, B:56:0x01c5, B:62:0x01cd, B:64:0x01d6, B:65:0x01da, B:60:0x01dd, B:84:0x01e8, B:87:0x01eb, B:89:0x01f1, B:96:0x01f5, B:101:0x01fe, B:103:0x0206, B:111:0x021d, B:113:0x0222, B:147:0x0226, B:142:0x0268, B:115:0x0232, B:117:0x0238, B:119:0x023c, B:121:0x0244, B:123:0x024a, B:129:0x0252, B:131:0x025b, B:132:0x025f, B:127:0x0262, B:153:0x026d, B:157:0x027d, B:159:0x0282, B:193:0x0286, B:188:0x02c8, B:161:0x0292, B:163:0x0298, B:165:0x029c, B:167:0x02a4, B:169:0x02aa, B:175:0x02b2, B:177:0x02bb, B:178:0x02bf, B:173:0x02c2, B:200:0x02cf, B:202:0x02d6, B:215:0x005e, B:217:0x0064, B:218:0x0067, B:220:0x006f, B:223:0x007d, B:227:0x0087, B:262:0x00dc, B:264:0x00e0, B:229:0x008c, B:231:0x0092, B:233:0x0096, B:235:0x009e, B:237:0x00a4, B:243:0x00ac, B:245:0x00b5, B:246:0x00b9, B:241:0x00bc, B:252:0x00c2, B:266:0x00c7, B:269:0x00ca, B:271:0x00d0, B:278:0x00d4, B:283:0x00e6, B:285:0x00ec, B:286:0x00ef, B:288:0x00f9, B:291:0x0107, B:295:0x0111, B:330:0x0166, B:332:0x016a, B:297:0x0116, B:299:0x011c, B:301:0x0120, B:303:0x0128, B:305:0x012e, B:311:0x0136, B:313:0x013f, B:314:0x0143, B:309:0x0146, B:320:0x014c, B:335:0x0151, B:338:0x0154, B:340:0x015a, B:347:0x015e), top: B:2:0x0007 }] */
    /* JADX WARN: Type inference failed for: r0v10, types: [d1.q] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v16, types: [t0.e] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [t0.e] */
    /* JADX WARN: Type inference failed for: r0v24, types: [d1.q] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v9, types: [d1.q] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v4, types: [d1.q] */
    /* JADX WARN: Type inference failed for: r15v5, types: [d1.q] */
    /* JADX WARN: Type inference failed for: r15v9, types: [d1.q] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v36, types: [t0.e] */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v40, types: [t0.e] */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r1v47 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(android.view.KeyEvent r14, df.a r15) {
        /*
            Method dump skipped, instructions count: 753
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.e(android.view.KeyEvent, df.a):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v13, types: [b2.g2] */
    /* JADX WARN: Type inference failed for: r3v7, types: [d1.q] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11, types: [d1.q] */
    /* JADX WARN: Type inference failed for: r5v12, types: [i1.s] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14, types: [d1.q] */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v11, types: [kotlin.jvm.internal.m, df.l] */
    /* JADX WARN: Type inference failed for: r6v17, types: [kotlin.jvm.internal.m, df.l] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v4, types: [t0.e] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [t0.e] */
    public final Boolean f(int i, j1.c cVar, df.l lVar) {
        Boolean bool;
        boolean a10;
        Boolean bool2;
        f1 f1Var;
        s sVar = this.f18108c;
        s g8 = g(sVar);
        int i10 = 4;
        x xVar = this.f18107b;
        if (g8 != null) {
            y2.m layoutDirection = xVar.getLayoutDirection();
            bool = null;
            m Z0 = g8.Z0();
            o oVar = Z0.f18123h;
            o oVar2 = Z0.i;
            if (i == 1) {
                oVar = Z0.f18118b;
            } else if (i == 2) {
                oVar = Z0.f18119c;
            } else if (i == 5) {
                oVar = Z0.f18120d;
            } else if (i == 6) {
                oVar = Z0.e;
            } else if (i == 3) {
                int ordinal = layoutDirection.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        oVar = oVar2;
                    } else {
                        l4.a.o();
                        return null;
                    }
                }
                if (oVar == o.f18126b) {
                    oVar = null;
                }
                if (oVar == null) {
                    oVar = Z0.f18121f;
                }
            } else if (i == 4) {
                int ordinal2 = layoutDirection.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        l4.a.o();
                        return null;
                    }
                } else {
                    oVar = oVar2;
                }
                if (oVar == o.f18126b) {
                    oVar = null;
                }
                if (oVar == null) {
                    oVar = Z0.f18122g;
                }
            } else if (i == 7 || i == 8) {
                a aVar = new a(i);
                j jVar = (j) ((x) b2.l.v(g8)).getFocusOwner();
                s sVar2 = jVar.f18112h;
                if (i == 7) {
                    Z0.f18124j.invoke(aVar);
                } else {
                    Z0.f18125k.invoke(aVar);
                }
                if (aVar.f18094b) {
                    oVar = o.f18127c;
                } else if (sVar2 != jVar.f18112h) {
                    oVar = o.f18128d;
                } else {
                    oVar = o.f18126b;
                }
            } else {
                x.o("invalid FocusDirection");
                return null;
            }
            if (!kotlin.jvm.internal.a(oVar, o.f18127c)) {
                if (kotlin.jvm.internal.a(oVar, o.f18128d)) {
                    s g10 = g(sVar);
                    if (g10 != null) {
                        return (Boolean) lVar.invoke(g10);
                    }
                } else if (!kotlin.jvm.internal.a(oVar, o.f18126b)) {
                    return Boolean.valueOf(oVar.a(lVar));
                }
            }
            return bool;
        }
        bool = null;
        g8 = null;
        y2.m layoutDirection2 = xVar.getLayoutDirection();
        k0 k0Var = new k0(g8, this, lVar);
        if (i == 1 || i == 2) {
            if (i == 1) {
                a10 = f.k(sVar, k0Var);
            } else if (i == 2) {
                a10 = a(sVar, k0Var);
            } else {
                x.o("This function should only be used for 1-D focus search");
                return null;
            }
            return Boolean.valueOf(a10);
        }
        if (i == 3 || i == 4 || i == 5 || i == 6) {
            return f.E(i, k0Var, sVar, cVar);
        }
        if (i == 7) {
            int ordinal3 = layoutDirection2.ordinal();
            if (ordinal3 != 0) {
                if (ordinal3 == 1) {
                    i10 = 3;
                } else {
                    l4.a.o();
                    return null;
                }
            }
            s g11 = g(sVar);
            if (g11 != null) {
                return f.E(i10, k0Var, g11, cVar);
            }
            return bool;
        }
        if (i == 8) {
            s g12 = g(sVar);
            boolean z3 = false;
            if (g12 != null) {
                if (!g12.f15688u.H) {
                    y1.a.b("visitAncestors called on an unattached node");
                }
                Object r32 = g12.f15688u.f15692y;
                i0 u9 = b2.l.u(g12);
                loop0: while (u9 != null) {
                    if ((((d1.q) u9.Z.A).f15691x & 1024) != 0) {
                        for (d1.q qVar = r32; qVar != null; qVar = qVar.f15692y) {
                            if ((qVar.f15690w & 1024) != 0) {
                                b2.k kVar = qVar;
                                Object r62 = bool;
                                while (kVar != 0) {
                                    if (kVar instanceof s) {
                                        Object r52 = (s) kVar;
                                        if (r52.Z0().f18117a) {
                                            bool2 = r52;
                                            break loop0;
                                        }
                                    } else if ((kVar.f15690w & 1024) != 0 && (kVar instanceof b2.k)) {
                                        d1.q qVar2 = kVar.J;
                                        int i11 = 0;
                                        kVar = kVar;
                                        r62 = r62;
                                        while (qVar2 != null) {
                                            if ((qVar2.f15690w & 1024) != 0) {
                                                i11++;
                                                r62 = r62;
                                                if (i11 == 1) {
                                                    kVar = qVar2;
                                                } else {
                                                    if (r62 == 0) {
                                                        r62 = new t0.e(new d1.q[16]);
                                                    }
                                                    if (kVar != 0) {
                                                        r62.b(kVar);
                                                        kVar = bool;
                                                    }
                                                    r62.b(qVar2);
                                                }
                                            }
                                            qVar2 = qVar2.f15693z;
                                            kVar = kVar;
                                            r62 = r62;
                                        }
                                        if (i11 == 1) {
                                        }
                                    }
                                    kVar = b2.e(r62);
                                }
                            }
                        }
                    }
                    u9 = u9.v();
                    if (u9 != null && (f1Var = u9.Z) != null) {
                        r32 = (g2) f1Var.f1460z;
                    } else {
                        r32 = bool;
                    }
                }
            }
            bool2 = bool;
            if (bool2 != null && !bool2.equals(sVar)) {
                z3 = ((Boolean) k0Var.invoke(bool2)).booleanValue();
            }
            return Boolean.valueOf(z3);
        }
        s1.j(a(i), "Focus search invoked with invalid FocusDirection ");
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.jvm.internal.y] */
    public final boolean g(int i) {
        boolean z3;
        boolean z9;
        Rect rect;
        Object obj = new Object();
        obj.f19787u = Boolean.FALSE;
        s sVar = this.f18112h;
        x xVar = this.f18106a;
        Boolean f10 = f(i, xVar.getEmbeddedViewFocusRect(), new g0(obj, i, 1));
        if (!kotlin.jvm.internal.a(f10, Boolean.TRUE) || sVar == this.f18112h) {
            if (f10 != null && obj.f19787u != null) {
                if (!f10.booleanValue() || !((Boolean) obj.f19787u).booleanValue()) {
                    View view = null;
                    if (i == 1 || i == 2) {
                        if (c(i, false, false)) {
                            Boolean f11 = f(i, null, new c2.u(i, 2));
                            if (f11 != null) {
                                z3 = f11.booleanValue();
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                            }
                        }
                    } else {
                        if (i != 7 && i != 8) {
                            Integer C = f.C(i);
                            if (C != null) {
                                int intValue = C.intValue();
                                j1.c embeddedViewFocusRect = xVar.getEmbeddedViewFocusRect();
                                if (embeddedViewFocusRect != null) {
                                    rect = l0.B(embeddedViewFocusRect);
                                } else {
                                    rect = null;
                                }
                                Object obj2 = v1.f3667f.get();
                                obj2.getClass();
                                v1 v1Var = (v1) obj2;
                                if (rect == null) {
                                    view = v1Var.b(intValue, xVar.findFocus(), xVar);
                                } else {
                                    v1Var.f3668a.set(rect);
                                    Rect rect2 = v1Var.f3668a;
                                    ArrayList<View> arrayList = v1Var.e;
                                    try {
                                        arrayList.clear();
                                        if (Build.VERSION.SDK_INT < 26) {
                                            n0.d(xVar, arrayList, xVar.isInTouchMode());
                                        } else {
                                            xVar.addFocusables(arrayList, intValue, xVar.isInTouchMode() ? 1 : 0);
                                        }
                                        if (!arrayList.isEmpty()) {
                                            view = v1Var.a(intValue, rect2, null, xVar, arrayList);
                                        }
                                        arrayList.clear();
                                    } catch (Throwable th) {
                                        arrayList.clear();
                                        throw th;
                                    }
                                }
                                if (view != null) {
                                    z9 = f.y(view, Integer.valueOf(intValue), rect);
                                    if (!z9) {
                                    }
                                }
                            } else {
                                x.o("Invalid focus direction");
                                return false;
                            }
                        }
                        z9 = false;
                        if (!z9) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void h(s sVar) {
        i0 u9;
        j2.j x9;
        i0 u10;
        j2.j x10;
        s sVar2 = this.f18112h;
        this.f18112h = sVar;
        d0 d0Var = this.f18111g;
        Object[] objArr = d0Var.f20855a;
        int i = d0Var.f20856b;
        for (int i10 = 0; i10 < i; i10++) {
            e1.c cVar = (e1.c) objArr[i10];
            cVar.getClass();
            if (sVar2 != null && (u10 = b2.l.u(sVar2)) != null && (x10 = u10.x()) != null && x10.f18813u.b(j2.i.f18794g)) {
                ((AutofillManager) cVar.f15875a.f22681u).notifyViewExited(cVar.f15877c, u10.f1490v);
            }
            if (sVar != null && (u9 = b2.l.u(sVar)) != null && (x9 = u9.x()) != null && x9.f18813u.b(j2.i.f18794g)) {
                int i11 = u9.f1490v;
                cVar.f15878d.f19536a.j(i11, new e1.a(cVar, i11));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0349, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x034b, code lost:
    
        r11 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009b, code lost:
    
        r36 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a5, code lost:
    
        if (((r9 & ((~r9) << 6)) & (-9187201950435737472L)) == r36) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a7, code lost:
    
        r3 = r4.b(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ad, code lost:
    
        if (r4.e != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00be, code lost:
    
        if (((r4.f20841a[r3 >> 3] >> ((r3 & 7) << 3)) & 255) != 254) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c6, code lost:
    
        r3 = r4.f20843c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c8, code lost:
    
        if (r3 <= r5) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ca, code lost:
    
        r15 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e1, code lost:
    
        if (java.lang.Long.compare((r4.f20844d * 32) ^ Long.MIN_VALUE, (r3 * 25) ^ Long.MIN_VALUE) > 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e3, code lost:
    
        r3 = r4.f20841a;
        r8 = r4.f20843c;
        r9 = r4.f20842b;
        r10 = (r8 + 7) >> 3;
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ef, code lost:
    
        if (r13 >= r10) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f1, code lost:
    
        r14 = r5;
        r5 = r3[r13] & (-9187201950435737472L);
        r3[r13] = (-72340172838076674L) & ((~r5) + (r5 >>> 7));
        r13 = r13 + 1;
        r5 = r14;
        r15 = r15;
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0111, code lost:
    
        r32 = r6;
        r22 = r15;
        r5 = qe.k.n(r3);
        r6 = r5 - 1;
        r3[r6] = (r3[r6] & 72057594037927935L) | (-72057594037927936L);
        r3[r5] = r3[0];
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0132, code lost:
    
        if (r5 == r8) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0134, code lost:
    
        r6 = r5 >> 3;
        r10 = (r5 & 7) << 3;
        r13 = (r3[r6] >> r10) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0141, code lost:
    
        if (r13 != r22) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0148, code lost:
    
        if (r13 == 254) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x014b, code lost:
    
        r13 = java.lang.Long.hashCode(r9[r5]) * r31;
        r14 = (r13 ^ (r13 << 16)) >>> 7;
        r15 = r4.b(r14);
        r14 = r14 & r8;
        r33 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x016a, code lost:
    
        if ((((r15 - r14) & r8) / 8) != (((r5 - r14) & r8) / 8)) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x016c, code lost:
    
        r3[r6] = (r3[r6] & (~(255 << r10))) | ((r13 & 127) << r10);
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x018a, code lost:
    
        r7 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x018d, code lost:
    
        r7 = r5;
        r5 = r15 >> 3;
        r34 = r3[r5];
        r6 = (r15 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x019e, code lost:
    
        if (((r34 >> r6) & 255) != r22) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01a0, code lost:
    
        r3[r5] = (r34 & (~(255 << r6))) | ((r13 & 127) << r6);
        r3[r6] = (r3[r6] & (~(255 << r10))) | (r22 << r10);
        r9[r15] = r9[r7];
        r9[r7] = r36;
        r5 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01df, code lost:
    
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01c4, code lost:
    
        r3[r5] = ((r13 & 127) << r6) | (r34 & (~(255 << r6)));
        r5 = r9[r15];
        r9[r15] = r9[r7];
        r9[r7] = r5;
        r5 = r7 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0143, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01ed, code lost:
    
        r33 = r7;
        r4.e = p0.a(r4.f20843c) - r4.f20844d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x027d, code lost:
    
        r3 = r4.b(r32);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0281, code lost:
    
        r32 = r3;
        r4.f20844d++;
        r3 = r4.e;
        r5 = r4.f20841a;
        r6 = r32 >> 3;
        r7 = r5[r6];
        r9 = (r32 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x029b, code lost:
    
        if (((r7 >> r9) & 255) != r22) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x029d, code lost:
    
        r21 = r33 ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x029f, code lost:
    
        r4.e = r3 - r21;
        r3 = r4.f20843c;
        r7 = (r7 & (~(255 << r9))) | (r11 << r9);
        r5[r6] = r7;
        r5[(((r32 - 7) & r3) + (r3 & 7)) >> 3] = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01fe, code lost:
    
        r22 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0200, code lost:
    
        r32 = r6;
        r33 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0208, code lost:
    
        r3 = p0.b(r4.f20843c);
        r5 = r4.f20841a;
        r6 = r4.f20842b;
        r7 = r4.f20843c;
        r4.c(r3);
        r3 = r4.f20841a;
        r8 = r4.f20842b;
        r9 = r4.f20843c;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x021f, code lost:
    
        if (r10 >= r7) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x022e, code lost:
    
        if (((r5[r10 >> 3] >> ((r10 & 7) << 3)) & 255) >= r22) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0230, code lost:
    
        r13 = r6[r10];
        r15 = java.lang.Long.hashCode(r13) * r31;
        r15 = r15 ^ (r15 << 16);
        r16 = r3;
        r3 = r4.b(r15 >>> 7);
        r17 = r5;
        r18 = r6;
        r5 = r15 & 127;
        r15 = r3 >> 3;
        r19 = (r3 & 7) << 3;
        r5 = (r16[r15] & (~(255 << r19))) | (r5 << r19);
        r16[r15] = r5;
        r16[(((r3 - 7) & r9) + (r9 & 7)) >> 3] = r5;
        r8[r3] = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0274, code lost:
    
        r10 = r10 + 1;
        r3 = r16;
        r5 = r17;
        r6 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x026e, code lost:
    
        r16 = r3;
        r17 = r5;
        r18 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0205, code lost:
    
        r22 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00c0, code lost:
    
        r33 = true;
        r22 = 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(android.view.KeyEvent r41) {
        /*
            Method dump skipped, instructions count: 905
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.i(android.view.KeyEvent):boolean");
    }
}