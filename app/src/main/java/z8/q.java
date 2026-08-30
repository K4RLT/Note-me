package z8;
import q.a;
import r.e;

import android.os.RemoteException;
import g9.e3;
import g9.v1;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final v1 f31997a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f31998b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final j f31999c;

    public q(v1 v1Var) {
        j jVar;
        this.f31997a = v1Var;
        if (v1Var != null) {
            try {
                List<e3> e = v1Var.e();
                if (e != null) {
                    for (e3 e3Var : e) {
                        if (e3Var != null) {
                            jVar = new j(e3Var);
                        } else {
                            jVar = null;
                        }
                        if (jVar != null) {
                            this.f31998b.add(jVar);
                        }
                    }
                }
            } catch (RemoteException e8) {
                l9.i.d("Could not forward getAdapterResponseInfo to ResponseInfo.", e8);
            }
        }
        v1 v1Var2 = this.f31997a;
        if (v1Var2 != null) {
            try {
                e3 d2 = v1Var2.d();
                if (d2 != null) {
                    this.f31999c = new j(d2);
                }
            } catch (RemoteException e10) {
                l9.i.d("Could not forward getLoadedAdapterResponse to ResponseInfo.", e10);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0049 A[LOOP:0: B:12:0x0047->B:13:0x0049, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0025 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject a() {
        /*
            r7 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            r1 = 0
            g9.v1 r2 = r7.f31997a
            if (r2 == 0) goto L15
            java.lang.String r3 = r2.b()     // Catch: android.os.RemoteException -> Lf
            goto L16
        Lf:
            r3 = move-exception
            java.lang.String r4 = "Could not forward getResponseId to ResponseInfo."
            l9.i.d(r4, r3)
        L15:
            r3 = r1
        L16:
            java.lang.String r4 = "null"
            java.lang.String r5 = "Response ID"
            if (r3 != 0) goto L20
            r0.put(r5, r4)
            goto L23
        L20:
            r0.put(r5, r3)
        L23:
            if (r2 == 0) goto L30
            java.lang.String r1 = r2.a()     // Catch: android.os.RemoteException -> L2a
            goto L30
        L2a:
            r3 = move-exception
            java.lang.String r5 = "Could not forward getMediationAdapterClassName to ResponseInfo."
            l9.i.d(r5, r3)
        L30:
            java.lang.String r3 = "Mediation Adapter Class Name"
            if (r1 != 0) goto L38
            r0.put(r3, r4)
            goto L3b
        L38:
            r0.put(r3, r1)
        L3b:
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            java.util.ArrayList r3 = r7.f31998b
            int r4 = r3.size()
            r5 = 0
        L47:
            if (r5 >= r4) goto L59
            java.lang.Object r6 = r3.get(r5)
            int r5 = r5 + 1
            z8.j r6 = (z8.j) r6
            org.json.JSONObject r6 = r6.a()
            r1.put(r6)
            goto L47
        L59:
            java.lang.String r3 = "Adapter Responses"
            r0.put(r3, r1)
            z8.j r1 = r7.f31999c
            if (r1 == 0) goto L6b
            java.lang.String r3 = "Loaded Adapter Response"
            org.json.JSONObject r1 = r1.a()
            r0.put(r3, r1)
        L6b:
            if (r2 == 0) goto L93
            android.os.Bundle r1 = r2.g()     // Catch: android.os.BadParcelableException -> L89 java.lang.IllegalArgumentException -> L8b android.os.RemoteException -> L8d
            if (r1 == 0) goto L98
            com.google.android.gms.internal.ads.nl r2 = com.google.android.gms.internal.ads.sl.f10976v     // Catch: android.os.BadParcelableException -> L89 java.lang.IllegalArgumentException -> L8b android.os.RemoteException -> L8d
            g9.r r3 = g9.e     // Catch: android.os.BadParcelableException -> L89 java.lang.IllegalArgumentException -> L8b android.os.RemoteException -> L8d
            com.google.android.gms.internal.ads.ql r3 = r3.f17698c     // Catch: android.os.BadParcelableException -> L89 java.lang.IllegalArgumentException -> L8b android.os.RemoteException -> L8d
            java.lang.Object r2 = r3.a(r2)     // Catch: android.os.BadParcelableException -> L89 java.lang.IllegalArgumentException -> L8b android.os.RemoteException -> L8d
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: android.os.BadParcelableException -> L89 java.lang.IllegalArgumentException -> L8b android.os.RemoteException -> L8d
            boolean r2 = r2.booleanValue()     // Catch: android.os.BadParcelableException -> L89 java.lang.IllegalArgumentException -> L8b android.os.RemoteException -> L8d
            if (r2 == 0) goto L98
            r1.keySet()     // Catch: android.os.BadParcelableException -> L89 java.lang.IllegalArgumentException -> L8b android.os.RemoteException -> L8d
            goto L98
        L89:
            r1 = move-exception
            goto L8e
        L8b:
            r1 = move-exception
            goto L8e
        L8d:
            r1 = move-exception
        L8e:
            java.lang.String r2 = "Could not forward getResponseExtras to ResponseInfo."
            l9.i.d(r2, r1)
        L93:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
        L98:
            if (r1 == 0) goto La7
            g9.p r2 = g9.p.f17688g
            l9.d r2 = r2.f17689a
            org.json.JSONObject r1 = r2.m(r1)
            java.lang.String r2 = "Response Extras"
            r0.put(r2, r1)
        La7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z8.a():org.json.JSONObject");
    }

    public final String toString() {
        try {
            return a().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
