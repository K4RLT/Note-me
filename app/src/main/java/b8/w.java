package b8;
import d8.f;
import e0.b;
import g7.c;
import g7.f;
import g7.i;
import j2.j;
import j2.u;
import k1.a;
import k1.b;
import k1.p;
import k7.c;
import k7.f;
import k7.i;
import m1.d;
import p5.a;
import p5.c;
import u7.b;
import u7.c;
import u7.d;
import u7.q1;
import y8.b;
import y8.c;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class w implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2907u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f2908v;

    public /* synthetic */ w(String str, int i) {
        this.f2907u = i;
        this.f2908v = str;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        Object value;
        Map map;
        c T;
        f fVar;
        String D;
        String D2;
        String D3;
        String D4;
        i iVar;
        int i = this.f2907u;
        int i10 = 0;
        pe.z zVar = pe.z.f22715a;
        String str = this.f2908v;
        switch (i) {
            case 0:
                j jVar = (j) obj;
                jVar.getClass();
                u.b(jVar, str);
                return zVar;
            case 1:
                j jVar2 = (j) obj;
                jVar2.getClass();
                u.b(jVar2, str);
                return zVar;
            case 2:
                float floatValue = ((Float) obj).floatValue();
                fg.s sVar = f.f15790a;
                float f10 = 0.0f;
                if (floatValue >= 0.0f) {
                    f10 = 0.9f * floatValue;
                }
                f.e(str, new c(f10));
                return zVar;
            case 3:
                sf.n0 n0Var = i.f17566a;
                do {
                    value = n0Var.getValue();
                    Map map2 = (Map) value;
                    pe.j jVar3 = new pe.j(str, f.f17564a);
                    map2.getClass();
                    boolean isEmpty = map2.isEmpty();
                    Object obj2 = jVar3.f22694v;
                    Object obj3 = jVar3.f22693u;
                    if (isEmpty) {
                        map = Collections.singletonMap(obj3, obj2);
                        map.getClass();
                    } else {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(map2);
                        linkedHashMap.put(obj3, obj2);
                        map = linkedHashMap;
                    }
                } while (!n0Var.i(value, map));
                return zVar;
            case 4:
                a aVar = (a) obj;
                aVar.getClass();
                T = aVar.T("SELECT * FROM canvas_elements WHERE notebookId = ? ORDER BY zIndex ASC, createdAt ASC");
                try {
                    T.s(1, str);
                    int b10 = ya.b(T, FacebookMediationAdapter.KEY_ID);
                    int b11 = ya.b(T, "notebookId");
                    int b12 = ya.b(T, "spreadIndex");
                    int b13 = ya.b(T, "pageSide");
                    int b14 = ya.b(T, "type");
                    int b15 = ya.b(T, "zIndex");
                    int b16 = ya.b(T, "x");
                    int b17 = ya.b(T, "y");
                    int b18 = ya.b(T, "scale");
                    int b19 = ya.b(T, "rotation");
                    int b20 = ya.b(T, "payload");
                    int b21 = ya.b(T, "createdAt");
                    ArrayList arrayList = new ArrayList();
                    while (T.P()) {
                        int i11 = b10;
                        arrayList.add(new c(T.D(b10), T.D(b11), (int) T.getLong(b12), (int) T.getLong(b13), T.D(b14), (int) T.getLong(b15), (float) T.getDouble(b16), (float) T.getDouble(b17), (float) T.getDouble(b18), (float) T.getDouble(b19), T.D(b20), T.getLong(b21)));
                        b10 = i11;
                    }
                    return arrayList;
                } finally {
                }
            case 5:
                a aVar2 = (a) obj;
                aVar2.getClass();
                T = aVar2.T("DELETE FROM canvas_elements WHERE notebookId = ?");
                try {
                    T.s(1, str);
                    T.P();
                    return zVar;
                } finally {
                }
            case 6:
                a aVar3 = (a) obj;
                aVar3.getClass();
                T = aVar3.T("SELECT COUNT(*) FROM canvas_elements WHERE notebookId = ?");
                try {
                    T.s(1, str);
                    if (T.P()) {
                        i10 = (int) T.getLong(0);
                    }
                    T.close();
                    return Integer.valueOf(i10);
                } finally {
                }
            case 7:
                a aVar4 = (a) obj;
                aVar4.getClass();
                T = aVar4.T("UPDATE notebooks SET stackId = ? WHERE stackId IS NULL OR stackId NOT IN (SELECT id FROM stacks)");
                try {
                    T.s(1, str);
                    T.P();
                    return zVar;
                } finally {
                }
            case 8:
                a aVar5 = (a) obj;
                aVar5.getClass();
                T = aVar5.T("DELETE FROM notebooks WHERE id = ?");
                try {
                    T.s(1, str);
                    T.P();
                    return zVar;
                } finally {
                }
            case 9:
                a aVar6 = (a) obj;
                aVar6.getClass();
                T = aVar6.T("SELECT COUNT(*) FROM notebooks WHERE stackId = ?");
                try {
                    T.s(1, str);
                    if (T.P()) {
                        i10 = (int) T.getLong(0);
                    }
                    T.close();
                    return Integer.valueOf(i10);
                } finally {
                }
            case 10:
                a aVar7 = (a) obj;
                aVar7.getClass();
                T = aVar7.T("SELECT * FROM notebooks WHERE id = ?");
                try {
                    T.s(1, str);
                    int b22 = ya.b(T, FacebookMediationAdapter.KEY_ID);
                    int b23 = ya.b(T, "title");
                    int b24 = ya.b(T, "pageCount");
                    int b25 = ya.b(T, "colorR");
                    int b26 = ya.b(T, "colorG");
                    int b27 = ya.b(T, "colorB");
                    int b28 = ya.b(T, "orderIndex");
                    int b29 = ya.b(T, "coverConfig");
                    int b30 = ya.b(T, "backgroundConfig");
                    int b31 = ya.b(T, "sizeId");
                    int b32 = ya.b(T, "stackId");
                    int b33 = ya.b(T, "createdAt");
                    int b34 = ya.b(T, "updatedAt");
                    if (T.P()) {
                        String D5 = T.D(b22);
                        String D6 = T.D(b23);
                        int i12 = (int) T.getLong(b24);
                        float f11 = (float) T.getDouble(b25);
                        float f12 = (float) T.getDouble(b26);
                        float f13 = (float) T.getDouble(b27);
                        int i13 = (int) T.getLong(b28);
                        if (T.isNull(b29)) {
                            D = null;
                        } else {
                            D = T.D(b29);
                        }
                        if (T.isNull(b30)) {
                            D2 = null;
                        } else {
                            D2 = T.D(b30);
                        }
                        if (T.isNull(b31)) {
                            D3 = null;
                        } else {
                            D3 = T.D(b31);
                        }
                        if (T.isNull(b32)) {
                            D4 = null;
                        } else {
                            D4 = T.D(b32);
                        }
                        fVar = new f(D5, D6, i12, f11, f12, f13, i13, D, D2, D3, D4, T.getLong(b33), T.getLong(b34));
                    } else {
                        fVar = null;
                    }
                    return fVar;
                } finally {
                }
            case 11:
                a aVar8 = (a) obj;
                aVar8.getClass();
                T = aVar8.T("SELECT * FROM stacks WHERE id = ?");
                try {
                    T.s(1, str);
                    int b35 = ya.b(T, FacebookMediationAdapter.KEY_ID);
                    int b36 = ya.b(T, "title");
                    int b37 = ya.b(T, "orderIndex");
                    int b38 = ya.b(T, "createdAt");
                    int b39 = ya.b(T, "updatedAt");
                    if (T.P()) {
                        iVar = new i((int) T.getLong(b37), T.getLong(b38), T.getLong(b39), T.D(b35), T.D(b36));
                    } else {
                        iVar = null;
                    }
                    return iVar;
                } finally {
                }
            case 12:
                a aVar9 = (a) obj;
                aVar9.getClass();
                T = aVar9.T("DELETE FROM stacks WHERE id = ?");
                try {
                    T.s(1, str);
                    T.P();
                    return zVar;
                } finally {
                }
            case 13:
                q1 q1Var = (q1) obj;
                q1Var.getClass();
                return q1.a(q1Var, 0, false, false, this.f2908v, 15);
            case 14:
                b bVar = (b) obj;
                bVar.getClass();
                return b.a(bVar, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0, false, false, this.f2908v, null, null, false, 0.0f, 0.0f, 0.0f, 0.0f, null, 4193279);
            case 15:
                c cVar = (c) obj;
                cVar.getClass();
                return c.a(cVar, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, false, false, this.f2908v, 32767);
            case 16:
                d dVar = (d) obj;
                dVar.getClass();
                return d.a(dVar, null, null, null, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0, false, false, this.f2908v, false, false, null, null, 0, 0.0f, 520191);
            case 17:
                b bVar2 = (b) obj;
                bVar2.getClass();
                return b.a(bVar2, null, this.f2908v, 0.0f, 0.0f, 0.0f, 0.0f, 0, false, false, null, null, null, false, 0.0f, 0.0f, 0.0f, 0.0f, null, 4194301);
            case 18:
                j jVar4 = (j) obj;
                jVar4.getClass();
                u.b(jVar4, str);
                return zVar;
            case 19:
                d dVar2 = (d) obj;
                dVar2.getClass();
                List list = w7.y8.f29503a;
                String str2 = this.f2908v;
                pe.j b40 = w7.b(str2);
                float floatValue2 = ((Number) b40.f22693u).floatValue();
                float floatValue3 = ((Number) b40.f22694v).floatValue();
                float min = Math.min(Float.intBitsToFloat((int) (dVar2.e() >> 32)) / floatValue2, Float.intBitsToFloat((int) (dVar2.e() & 4294967295L)) / floatValue3);
                p j10 = dVar2.p0().j();
                b.a(j10).save();
                a aVar10 = (a) j10;
                aVar10.f19463a.translate(Float.intBitsToFloat((int) (dVar2.e() >> 32)) / 2.0f, Float.intBitsToFloat((int) (4294967295L & dVar2.e())) / 2.0f);
                w7.c(aVar10.f19463a, str2, floatValue2 * min, floatValue3 * min, -11245448, null, 0.0f, 0.08f);
                aVar10.f19463a.restore();
                return zVar;
            default:
                j jVar5 = (j) obj;
                jVar5.getClass();
                u.b(jVar5, str);
                return zVar;
        }
    }
}
