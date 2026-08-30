package ya;
import b1.c0;
import df.l;
import g5.c0;
import g5.v;
import l5.b;
import l5.c;
import l5.d;
import mf.m;
import n9.a;
import p5.a;
import p5.c;
import pe.a;
import pf.b0;
import q.x;
import q5.d;
import qe.m;
import r0.w;
import re.b;
import te.c;
import te.g;
import te.h;
import ue.a;
import ve.c;
import ya.c0;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.MatrixCursor;
import java.util.ListIterator;

/* loaded from: classes.dex */
public abstract class c0 {
    public static final void a(a aVar) {
        aVar.getClass();
        b e = m.e();
        c T = aVar.T("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (T.P()) {
            try {
                e.add(T.D(0));
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    ug.a.b(T, th);
                    throw th2;
                }
            }
        }
        ug.a.b(T, null);
        ListIterator listIterator = m.c(e).listIterator(0);
        while (true) {
            b1.c0 c0Var = (b1.c0) listIterator;
            if (c0Var.hasNext()) {
                String str = (String) c0Var.next();
                if (m.j(str, "room_fts_content_sync_")) {
                    a(aVar, "DROP TRIGGER IF EXISTS ".concat(str));
                }
            } else {
                return;
            }
        }
    }

    public static final g b(v vVar, boolean z3, c cVar) {
        g gVar;
        g5.c0 c0Var = (g5.c0) cVar.getContext().L(g5.c0.f17425v);
        if (c0Var != null) {
            gVar = c0Var.f17426u;
        } else {
            gVar = null;
        }
        if (vVar.q()) {
            if (gVar != null) {
                return vVar.l().V(gVar);
            }
            if (z3) {
                g gVar2 = vVar.f17536b;
                if (gVar2 != null) {
                    return gVar2;
                }
                kotlin.jvm.internal.l.h("transactionContext");
                throw null;
            }
            return vVar.l();
        }
        g l10 = vVar.l();
        if (gVar == null) {
            gVar = h.f25707u;
        }
        return l10.V(gVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(l r15, v r16, c r17, boolean r18, boolean r19) {
        /*
            r0 = r17
            boolean r1 = r0 instanceof c
            if (r1 == 0) goto L16
            r1 = r0
            c r1 = (c) r1
            int r2 = r1.f19911z
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.f19911z = r2
        L14:
            r6 = r1
            goto L1c
        L16:
            c r1 = new c
            r1.<init>(r0)
            goto L14
        L1c:
            java.lang.Object r0 = r6.f19910y
            int r1 = r6.f19911z
            r2 = 3
            r3 = 2
            r7 = 1
            a r8 = a.f27192u
            if (r1 == 0) goto L4c
            if (r1 == r7) goto L48
            if (r1 == r3) goto L38
            if (r1 != r2) goto L31
            a.e(r0)
            return r0
        L31:
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r15)
            r15 = 0
            return r15
        L38:
            boolean r15 = r6.f19909x
            boolean r1 = r6.f19908w
            l r3 = r6.f19907v
            v r4 = r6.f19906u
            a.e(r0)
            r14 = r15
            r13 = r1
            r10 = r3
            r11 = r4
            goto L96
        L48:
            a.e(r0)
            return r0
        L4c:
            a.e(r0)
            boolean r0 = r16.q()
            if (r0 == 0) goto L7a
            boolean r0 = r16.t()
            if (r0 == 0) goto L7a
            boolean r0 = r16.r()
            if (r0 == 0) goto L7a
            d r0 = new d
            r3 = 0
            r1 = r15
            r2 = r16
            r5 = r18
            r4 = r19
            r0.<init>(r1, r2, r3, r4, r5)
            r15 = r0
            r0 = r2
            r6.f19911z = r7
            java.lang.Object r15 = w(r5, r15, r6)
            if (r15 != r8) goto L79
            goto Lab
        L79:
            return r15
        L7a:
            r0 = r16
            r5 = r18
            r4 = r19
            r6.f19906u = r0
            r6.f19907v = r15
            r6.f19908w = r5
            r6.f19909x = r4
            r6.f19911z = r3
            g r3 = b(r0, r4, r6)
            if (r3 != r8) goto L91
            goto Lab
        L91:
            r10 = r15
            r11 = r0
            r0 = r3
            r14 = r4
            r13 = r5
        L96:
            g r0 = (g) r0
            b r9 = new b
            r12 = 0
            r9.<init>(r10, r11, r12, r13, r14)
            r15 = 0
            r6.f19906u = r15
            r6.f19907v = r15
            r6.f19911z = r2
            java.lang.Object r15 = b0.J(r0, r9, r6)
            if (r15 != r8) goto Lac
        Lab:
            return r8
        Lac:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: ya.c0.c(l, v, c, boolean, boolean):java.lang.Object");
    }

    public static final Cursor d(v vVar, d dVar, boolean z3) {
        int i;
        vVar.getClass();
        vVar.a();
        vVar.b();
        Cursor r8 = vVar.k().y().r(dVar);
        if (z3 && (r8 instanceof AbstractWindowedCursor)) {
            AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) r8;
            int count = abstractWindowedCursor.getCount();
            if (abstractWindowedCursor.hasWindow()) {
                i = abstractWindowedCursor.getWindow().getNumRows();
            } else {
                i = count;
            }
            if (i < count) {
                try {
                    MatrixCursor matrixCursor = new MatrixCursor(r8.getColumnNames(), r8.getCount());
                    while (r8.moveToNext()) {
                        Object[] objArr = new Object[r8.getColumnCount()];
                        int columnCount = r8.getColumnCount();
                        for (int i10 = 0; i10 < columnCount; i10++) {
                            int type = r8.getType(i10);
                            if (type != 0) {
                                if (type != 1) {
                                    if (type != 2) {
                                        if (type != 3) {
                                            if (type == 4) {
                                                objArr[i10] = r8.getBlob(i10);
                                            } else {
                                                throw new IllegalStateException();
                                            }
                                        } else {
                                            objArr[i10] = r8.getString(i10);
                                        }
                                    } else {
                                        objArr[i10] = Double.valueOf(r8.getDouble(i10));
                                    }
                                } else {
                                    objArr[i10] = Long.valueOf(r8.getLong(i10));
                                }
                            } else {
                                objArr[i10] = null;
                            }
                        }
                        matrixCursor.addRow(objArr);
                    }
                    r8.close();
                    return matrixCursor;
                } finally {
                }
            }
        }
        return r8;
    }
}
