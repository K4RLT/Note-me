package eb;
import k0.y;
import n.a;
import n.b;
import n.e;
import n.r0;
import x2.q;
import x2.r;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class q3 extends d3 {
    public e A;
    public Long B;
    public Long C;

    /* renamed from: y, reason: collision with root package name */
    public String f16334y;

    /* renamed from: z, reason: collision with root package name */
    public HashSet f16335z;

    @Override // eb.d3
    public final boolean A() {
        return false;
    }

    public final r3 B(Integer num) {
        if (this.A.containsKey(num)) {
            return (r3) this.A.get(num);
        }
        r3 r3Var = new r3(this, this.f16334y);
        this.A.put(num, r3Var);
        return r3Var;
    }

    public final ArrayList C(String str, List list, List list2, Long l10, Long l11) {
        return D(str, list, list2, l10, l11, false);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:1|(2:2|(2:4|(2:6|7)(1:294))(2:295|296))|8|(3:10|11|12)|16|(6:19|20|21|22|23|(1:25)(9:(9:26|27|28|29|30|(3:32|(1:34)|35)|36|37|(1:40)(1:39))|41|42|43|44|45|46|47|(7:49|50|51|52|(5:54|(14:56|57|58|59|60|61|62|63|(5:65|66|67|(3:69|(6:72|(2:108|109)(2:76|(8:82|83|(4:86|(2:88|89)(1:91)|90|84)|92|93|(4:96|(3:98|99|100)(1:102)|101|94)|103|104)(4:78|79|80|81))|105|106|81|70)|111)|112)|(4:200|201|(1:203)|204)|207|67|(0)|112)(1:224)|113|(10:116|(3:120|(4:123|(4:125|(1:127)(1:131)|128|129)(2:132|133)|130|121)|134)|135|(3:139|(4:142|(2:149|150)(2:146|147)|148|140)|151)|152|(3:154|(6:157|(2:159|(3:161|162|163))(1:166)|164|165|163|155)|167)|168|(3:177|(8:180|(1:182)|183|(1:185)|186|(2:188|189)(1:191)|190|178)|192)|193|114)|199)|225|(2:227|(2:229|230)(2:231|232))(2:233|234))(7:235|(6:236|237|238|239|240|(1:243)(1:242))|244|52|(0)|225|(0)(0))))|293|42|43|44|45|46|47|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x01b1, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x01b2, code lost:
    
        r17 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0209, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x020a, code lost:
    
        r17 = r2;
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0205, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x0206, code lost:
    
        r12 = 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x05ce  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x05e1  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x01b5 A[Catch: all -> 0x01ad, SQLiteException -> 0x01b1, TRY_ENTER, TryCatch #5 {all -> 0x01ad, blocks: (B:47:0x019f, B:49:0x01a5, B:235:0x01b5, B:236:0x01bb, B:238:0x01c4, B:239:0x01d4, B:240:0x01f4, B:252:0x01df, B:255:0x01e9, B:247:0x020d), top: B:44:0x0187 }] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a5 A[Catch: all -> 0x01ad, SQLiteException -> 0x01b1, TRY_LEAVE, TryCatch #5 {all -> 0x01ad, blocks: (B:47:0x019f, B:49:0x01a5, B:235:0x01b5, B:236:0x01bb, B:238:0x01c4, B:239:0x01d4, B:240:0x01f4, B:252:0x01df, B:255:0x01e9, B:247:0x020d), top: B:44:0x0187 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02d1  */
    /* JADX WARN: Type inference failed for: r0v35, types: [r0] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r2v2, types: [e, r0] */
    /* JADX WARN: Type inference failed for: r2v35, types: [r0] */
    /* JADX WARN: Type inference failed for: r5v9, types: [r0] */
    /* JADX WARN: Type inference failed for: r6v0, types: [e, r0] */
    /* JADX WARN: Type inference failed for: r6v22, types: [r0] */
    /* JADX WARN: Type inference failed for: r7v0, types: [e, r0] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList D(java.lang.String r26, java.util.List r27, java.util.List r28, java.lang.Long r29, java.lang.Long r30, boolean r31) {
        /*
            Method dump skipped, instructions count: 1523
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eb.q3.D(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long, boolean):java.util.ArrayList");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x08d2 A[LOOP:3: B:61:0x0454->B:109:0x08d2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x08e9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0861  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x086e  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0864  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0916  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x042c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E(java.util.List r45, boolean r46) {
        /*
            Method dump skipped, instructions count: 2333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eb.q3.E(java.util.List, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0407 A[LOOP:3: B:54:0x0126->B:88:0x0407, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x041c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F(java.util.List r27) {
        /*
            Method dump skipped, instructions count: 1129
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eb.q3.F(java.util.List):void");
    }

    public final ArrayList G() {
        ArrayList arrayList;
        List list;
        ArrayList arrayList2 = new ArrayList();
        b bVar = (b) this.A.keySet();
        bVar.removeAll(this.f16335z);
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int intValue = num.intValue();
            r3 r3Var = (r3) this.A.get(num);
            fa.y.h(r3Var);
            e eVar = r3Var.f16361g;
            e eVar2 = r3Var.f16360f;
            com.google.android.gms.internal.measurement.u2 t3 = com.google.android.gms.internal.measurement.v2.t();
            t3.b();
            com.google.android.gms.internal.measurement.v2.q((com.google.android.gms.internal.measurement.v2) t3.f13639v, intValue);
            boolean z3 = r3Var.f16357b;
            t3.b();
            com.google.android.gms.internal.measurement.v2.s((com.google.android.gms.internal.measurement.v2) t3.f13639v, z3);
            com.google.android.gms.internal.measurement.k3 k3Var = r3Var.f16358c;
            if (k3Var != null) {
                t3.b();
                com.google.android.gms.internal.measurement.v2.u((com.google.android.gms.internal.measurement.v2) t3.f13639v, k3Var);
            }
            com.google.android.gms.internal.measurement.j3 B = com.google.android.gms.internal.measurement.k3.B();
            ArrayList O = m0.O(r3Var.f16359d);
            B.b();
            com.google.android.gms.internal.measurement.k3.t((com.google.android.gms.internal.measurement.k3) B.f13639v, O);
            ArrayList O2 = m0.O(r3Var.e);
            B.b();
            com.google.android.gms.internal.measurement.k3.q((com.google.android.gms.internal.measurement.k3) B.f13639v, O2);
            if (eVar2 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(eVar2.f20934w);
                Iterator it2 = ((b) eVar2.keySet()).iterator();
                while (it2.hasNext()) {
                    Integer num2 = (Integer) it2.next();
                    int intValue2 = num2.intValue();
                    Long l10 = (Long) eVar2.get(num2);
                    if (l10 != null) {
                        com.google.android.gms.internal.measurement.w2 t10 = com.google.android.gms.internal.measurement.x2.t();
                        t10.b();
                        com.google.android.gms.internal.measurement.q((com.google.android.gms.internal.measurement.x2) t10.f13639v, intValue2);
                        long longValue = l10.longValue();
                        t10.b();
                        com.google.android.gms.internal.measurement.r((com.google.android.gms.internal.measurement.x2) t10.f13639v, longValue);
                        arrayList.add((com.google.android.gms.internal.measurement.x2) t10.a());
                    }
                }
            }
            if (arrayList != null) {
                B.b();
                com.google.android.gms.internal.measurement.k3.x((com.google.android.gms.internal.measurement.k3) B.f13639v, arrayList);
            }
            if (eVar == null) {
                list = Collections.EMPTY_LIST;
            } else {
                ArrayList arrayList3 = new ArrayList(eVar.f20934w);
                Iterator it3 = ((b) eVar.keySet()).iterator();
                while (true) {
                    a aVar = (a) it3;
                    if (!aVar.hasNext()) {
                        break;
                    }
                    Integer num3 = (Integer) aVar.next();
                    com.google.android.gms.internal.measurement.l3 u9 = com.google.android.gms.internal.measurement.m3.u();
                    int intValue3 = num3.intValue();
                    u9.b();
                    com.google.android.gms.internal.measurement.m3.r((com.google.android.gms.internal.measurement.m3) u9.f13639v, intValue3);
                    List list2 = (List) eVar.get(num3);
                    if (list2 != null) {
                        Collections.sort(list2);
                        u9.b();
                        com.google.android.gms.internal.measurement.m3.s((com.google.android.gms.internal.measurement.m3) u9.f13639v, list2);
                    }
                    arrayList3.add((com.google.android.gms.internal.measurement.m3) u9.a());
                }
                list = arrayList3;
            }
            B.b();
            com.google.android.gms.internal.measurement.k3.A((com.google.android.gms.internal.measurement.k3) B.f13639v, list);
            t3.b();
            com.google.android.gms.internal.measurement.v2.r((com.google.android.gms.internal.measurement.v2) t3.f13639v, (com.google.android.gms.internal.measurement.k3) B.a());
            com.google.android.gms.internal.measurement.v2 v2Var = (com.google.android.gms.internal.measurement.v2) t3.a();
            arrayList2.add(v2Var);
            i w10 = w();
            String str = this.f16334y;
            com.google.android.gms.internal.measurement.k3 v2 = v2Var.v();
            w10.y();
            w10.u();
            fa.y.e(str);
            fa.y.h(v2);
            byte[] c10 = v2.c();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("audience_id", num);
            contentValues.put("current_results", c10);
            try {
                if (w10.B().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                    w10.f().A.f(y(str), "Failed to insert filter results (got -1). appId");
                }
            } catch (SQLiteException e) {
                w10.f().A.h("Error storing filter results. appId", y(str), e);
            }
        }
        return arrayList2;
    }
}
