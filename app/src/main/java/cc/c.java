package cc;
import c.c;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.f1;
import eb.q1;
import fa.y;
import java.util.ArrayList;
import zb.e;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final gd.b f4080a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f4081b = null;

    public c(gd.b bVar) {
        this.f4080a = bVar;
    }

    public static boolean a(ArrayList arrayList, b bVar) {
        String str = bVar.f4075a;
        String str2 = bVar.f4076b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            b bVar2 = (b) obj;
            if (bVar2.f4075a.equals(str) && bVar2.f4076b.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, fc.a] */
    public final ArrayList b() {
        fc.c cVar = (fc.c) ((fc.b) this.f4080a.get());
        cVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : ((f1) cVar.f16949a.f31922v).c("frc", "")) {
            e eVar = gc.a.f17737a;
            y.h(bundle);
            Object obj = new Object();
            String str = (String) q1.a(bundle, "origin", String.class, null);
            y.h(str);
            obj.f16935a = str;
            String str2 = (String) q1.a(bundle, "name", String.class, null);
            y.h(str2);
            obj.f16936b = str2;
            obj.f16937c = q1.a(bundle, "value", Object.class, null);
            obj.f16938d = (String) q1.a(bundle, "trigger_event_name", String.class, null);
            obj.e = ((Long) q1.a(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            obj.f16939f = (String) q1.a(bundle, "timed_out_event_name", String.class, null);
            obj.f16940g = (Bundle) q1.a(bundle, "timed_out_event_params", Bundle.class, null);
            obj.f16941h = (String) q1.a(bundle, "triggered_event_name", String.class, null);
            obj.i = (Bundle) q1.a(bundle, "triggered_event_params", Bundle.class, null);
            obj.f16942j = ((Long) q1.a(bundle, "time_to_live", Long.class, 0L)).longValue();
            obj.f16943k = (String) q1.a(bundle, "expired_event_name", String.class, null);
            obj.f16944l = (Bundle) q1.a(bundle, "expired_event_params", Bundle.class, null);
            obj.f16946n = ((Boolean) q1.a(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            obj.f16945m = ((Long) q1.a(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            obj.f16947o = ((Long) q1.a(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
            arrayList.add(obj);
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x02b1, code lost:
    
        if (gc.a.c(r9, r7.f16944l, r7.f16943k) == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x02c9, code lost:
    
        if (gc.a.c(r9, r7.i, r7.f16941h) == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x02e3, code lost:
    
        if (gc.a.c(r9, r7.f16940g, r7.f16939f) == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0289, code lost:
    
        if (r0 != null) goto L97;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.util.ArrayList r24) {
        /*
            Method dump skipped, instructions count: 905
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cc.c.c(java.util.ArrayList):void");
    }
}