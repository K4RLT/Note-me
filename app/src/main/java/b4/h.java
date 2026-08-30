package b4;
import d.b;

import androidx.datastore.preferences.protobuf.b0;
import androidx.datastore.preferences.protobuf.k;
import androidx.datastore.preferences.protobuf.w;
import androidx.datastore.preferences.protobuf.y;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import kotlin.jvm.internal.l;
import q.x;
import y3.i;
import y3.m;

/* loaded from: classes.dex */
public final class h implements i {

    /* renamed from: a, reason: collision with root package name */
    public static final h f1708a = new Object();

    @Override // y3.i
    public final Object a() {
        return new b(true);
    }

    @Override // y3.i
    public final void b(Object obj, m mVar) {
        w a10;
        Map unmodifiableMap = Collections.unmodifiableMap(((b) obj).f1699a);
        unmodifiableMap.getClass();
        a4.c k3 = a4.e.k();
        for (Map.Entry entry : unmodifiableMap.entrySet()) {
            e eVar = (e) entry.getKey();
            Object value = entry.getValue();
            String str = eVar.f1706a;
            if (value instanceof Boolean) {
                a4.h y10 = a4.i.y();
                boolean booleanValue = ((Boolean) value).booleanValue();
                y10.c();
                a4.i.m((a4.i) y10.f809v, booleanValue);
                a10 = y10.a();
            } else if (value instanceof Float) {
                a4.h y11 = a4.i.y();
                float floatValue = ((Number) value).floatValue();
                y11.c();
                a4.i.n((a4.i) y11.f809v, floatValue);
                a10 = y11.a();
            } else if (value instanceof Double) {
                a4.h y12 = a4.i.y();
                double doubleValue = ((Number) value).doubleValue();
                y12.c();
                a4.i.l((a4.i) y12.f809v, doubleValue);
                a10 = y12.a();
            } else if (value instanceof Integer) {
                a4.h y13 = a4.i.y();
                int intValue = ((Number) value).intValue();
                y13.c();
                a4.i.o((a4.i) y13.f809v, intValue);
                a10 = y13.a();
            } else if (value instanceof Long) {
                a4.h y14 = a4.i.y();
                long longValue = ((Number) value).longValue();
                y14.c();
                a4.i.i((a4.i) y14.f809v, longValue);
                a10 = y14.a();
            } else if (value instanceof String) {
                a4.h y15 = a4.i.y();
                y15.c();
                a4.i.j((a4.i) y15.f809v, (String) value);
                a10 = y15.a();
            } else if (value instanceof Set) {
                a4.h y16 = a4.i.y();
                a4.f l10 = a4.g.l();
                l10.c();
                a4.g.i((a4.g) l10.f809v, (Set) value);
                y16.c();
                a4.i.k((a4.i) y16.f809v, l10);
                a10 = y16.a();
            } else {
                x.o(l.f(value.getClass().getName(), "PreferencesSerializer does not support type: "));
                return;
            }
            k3.getClass();
            k3.c();
            a4.e.i((a4.e) k3.f809v).put(str, (a4.i) a10);
        }
        a4.e eVar2 = (a4.e) k3.a();
        int a11 = eVar2.a();
        Logger logger = k.f744f;
        if (a11 > 4096) {
            a11 = 4096;
        }
        k kVar = new k(mVar, a11);
        eVar2.c(kVar);
        if (kVar.f749d > 0) {
            kVar.p();
        }
    }

    @Override // y3.i
    public final Object c(FileInputStream fileInputStream) {
        int i;
        try {
            a4.e l10 = a4.e.l(fileInputStream);
            b bVar = new b(false);
            f[] fVarArr = (f[]) Arrays.copyOf(new f[0], 0);
            if (!bVar.f1700b.get()) {
                if (fVarArr.length <= 0) {
                    Map j10 = l10.j();
                    j10.getClass();
                    for (Map.Entry entry : j10.entrySet()) {
                        String str = (String) entry.getKey();
                        a4.i iVar = (a4.i) entry.getValue();
                        str.getClass();
                        iVar.getClass();
                        int x9 = iVar.x();
                        if (x9 == 0) {
                            i = -1;
                        } else {
                            i = g.f1707a[q0.b(x9)];
                        }
                        switch (i) {
                            case -1:
                                throw new IOException("Value case is null.", null);
                            case 0:
                            default:
                                l4.a.o();
                                return null;
                            case 1:
                                bVar.b(new e(str), Boolean.valueOf(iVar.p()));
                                break;
                            case 2:
                                bVar.b(new e(str), Float.valueOf(iVar.s()));
                                break;
                            case 3:
                                bVar.b(new e(str), Double.valueOf(iVar.r()));
                                break;
                            case 4:
                                bVar.b(new e(str), Integer.valueOf(iVar.t()));
                                break;
                            case 5:
                                bVar.b(new e(str), Long.valueOf(iVar.u()));
                                break;
                            case 6:
                                e eVar = new e(str);
                                String v2 = iVar.v();
                                v2.getClass();
                                bVar.b(eVar, v2);
                                break;
                            case 7:
                                e eVar2 = new e(str);
                                y k3 = iVar.w().k();
                                k3.getClass();
                                bVar.b(eVar2, qe.l.U(k3));
                                break;
                            case 8:
                                throw new IOException("Value not set.", null);
                        }
                    }
                    Map unmodifiableMap = Collections.unmodifiableMap(bVar.f1699a);
                    unmodifiableMap.getClass();
                    return new b(new LinkedHashMap(unmodifiableMap), true);
                }
                f fVar = fVarArr[0];
                throw null;
            }
            x.o("Do mutate preferences once returned to DataStore.");
            return null;
        } catch (b0 e) {
            throw new IOException("Unable to parse preferences proto.", e);
        }
    }
}
