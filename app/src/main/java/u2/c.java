package u2;

import android.text.Layout;
import android.text.TextPaint;
import b0.e0;
import j.i0;
import java.text.BreakIterator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import m2.q0;
import m2.u;
import m2.z;
import r0.n2;

/* loaded from: classes.dex */
public final class c implements u {
    public final e A;
    public final CharSequence B;
    public final n2.e C;
    public i0 D;
    public final boolean E;
    public final int F;

    /* renamed from: u, reason: collision with root package name */
    public final String f25823u;

    /* renamed from: v, reason: collision with root package name */
    public final q0 f25824v;

    /* renamed from: w, reason: collision with root package name */
    public final List f25825w;

    /* renamed from: x, reason: collision with root package name */
    public final List f25826x;

    /* renamed from: y, reason: collision with root package name */
    public final q2.h f25827y;

    /* renamed from: z, reason: collision with root package name */
    public final y2.c f25828z;

    /* JADX WARN: Code restructure failed: missing block: B:107:0x038d, code lost:
    
        if ((r6.f20556b.f20573c & 1095216660480L) != 0) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x0099, code lost:
    
        if (r8 == 1) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x066b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x07c9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0846  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0870 A[LOOP:6: B:281:0x086e->B:282:0x0870, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0884  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x05ce  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0155 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:355:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x00fe A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:422:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0349  */
    /* JADX WARN: Type inference failed for: r4v3, types: [u2.e, android.text.TextPaint, android.graphics.Paint] */
    /* JADX WARN: Type inference failed for: r5v46, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v24, types: [android.text.Spannable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c(java.lang.String r41, m2.q0 r42, java.util.List r43, java.util.List r44, q2.h r45, y2.c r46) {
        /*
            Method dump skipped, instructions count: 2249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.c.<init>(java.lang.String, m2.q0, java.util.List, java.util.List, q2.h, y2.c):void");
    }

    @Override // m2.u
    public final boolean a() {
        boolean z3;
        i0 i0Var = this.D;
        if (i0Var != null) {
            z3 = i0Var.y();
        } else {
            z3 = false;
        }
        if (!z3) {
            if (!this.E) {
                z zVar = this.f25824v.f20557c;
                t.a aVar = i.f25843a;
                t.a aVar2 = i.f25843a;
                n2 n2Var = (n2) aVar2.f25315v;
                if (n2Var == null) {
                    if (c4.k.d()) {
                        n2Var = aVar2.e();
                        aVar2.f25315v = n2Var;
                    } else {
                        n2Var = j.f25844a;
                    }
                }
                if (((Boolean) n2Var.getValue()).booleanValue()) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    @Override // m2.u
    public final float c() {
        float f10;
        n2.e eVar = this.C;
        float f11 = eVar.e;
        TextPaint textPaint = eVar.f21118b;
        if (!Float.isNaN(f11)) {
            return eVar.e;
        }
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = eVar.f21117a;
        lineInstance.setText(new n2.b(charSequence, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, new e0(5));
        int i = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new pe.j(Integer.valueOf(i), Integer.valueOf(next)));
            } else {
                pe.j jVar = (pe.j) priorityQueue.peek();
                if (jVar != null && ((Number) jVar.f22694v).intValue() - ((Number) jVar.f22693u).intValue() < next - i) {
                    priorityQueue.poll();
                    priorityQueue.add(new pe.j(Integer.valueOf(i), Integer.valueOf(next)));
                }
            }
            i = next;
        }
        if (priorityQueue.isEmpty()) {
            f10 = 0.0f;
        } else {
            Iterator it = priorityQueue.iterator();
            if (it.hasNext()) {
                pe.j jVar2 = (pe.j) it.next();
                float desiredWidth = Layout.getDesiredWidth(eVar.b(), ((Number) jVar2.f22693u).intValue(), ((Number) jVar2.f22694v).intValue(), textPaint);
                while (it.hasNext()) {
                    pe.j jVar3 = (pe.j) it.next();
                    desiredWidth = Math.max(desiredWidth, Layout.getDesiredWidth(eVar.b(), ((Number) jVar3.f22693u).intValue(), ((Number) jVar3.f22694v).intValue(), textPaint));
                }
                f10 = desiredWidth;
            } else {
                l4.a.c();
                return 0.0f;
            }
        }
        eVar.e = f10;
        return f10;
    }

    @Override // m2.u
    public final float d() {
        return this.C.c();
    }
}
