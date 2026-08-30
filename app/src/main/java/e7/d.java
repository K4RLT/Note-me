package e7;
import d.g;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import androidx.datastore.preferences.protobuf.s1;
import b2.f1;
import com.daren.scraply.MainActivity;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import wa.a9;
import wa.h8;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements ib.c, gd.a, ib.a, ic.d, ib.g, v8.b, u8.d {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f15941u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f15942v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f15943w;

    public /* synthetic */ d(Object obj, int i, Object obj2) {
        this.f15941u = i;
        this.f15942v = obj;
        this.f15943w = obj2;
    }

    @Override // u8.d
    public Object apply(Object obj) {
        u8.f fVar = (u8.f) this.f15942v;
        n8.i iVar = (n8.i) this.f15943w;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        u8.a aVar = fVar.f27125x;
        ArrayList m4 = fVar.m(sQLiteDatabase, iVar, aVar.f27111b);
        for (k8.d dVar : k8.d.values()) {
            if (dVar != iVar.f21183c) {
                int size = aVar.f27111b - m4.size();
                if (size <= 0) {
                    break;
                }
                m4.addAll(fVar.m(sQLiteDatabase, iVar.b(dVar), size));
            }
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i = 0; i < m4.size(); i++) {
            sb2.append(((u8.b) m4.get(i)).f27114a);
            if (i < m4.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        Cursor query = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb2.toString(), null, null, null, null);
        while (query.moveToNext()) {
            try {
                long j10 = query.getLong(0);
                Set set = (Set) hashMap.get(Long.valueOf(j10));
                if (set == null) {
                    set = new HashSet();
                    hashMap.put(Long.valueOf(j10), set);
                }
                set.add(new u8.e(query.getString(1), query.getString(2)));
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        }
        query.close();
        ListIterator listIterator = m4.listIterator();
        while (listIterator.hasNext()) {
            u8.b bVar = (u8.b) listIterator.next();
            long j11 = bVar.f27114a;
            if (hashMap.containsKey(Long.valueOf(j11))) {
                f1 c10 = bVar.f27116c.c();
                for (u8.e eVar : (Set) hashMap.get(Long.valueOf(j11))) {
                    c10.d(eVar.f27119a, eVar.f27120b);
                }
                listIterator.set(new u8.b(j11, bVar.f27115b, c10.e()));
            }
        }
        return m4;
    }

    @Override // ic.d
    public Object e(g9.n nVar) {
        String valueOf;
        switch (this.f15941u) {
            case 6:
                String str = (String) this.f15942v;
                s1 s1Var = (s1) this.f15943w;
                Context context = (Context) nVar.a(Context.class);
                switch (s1Var.f802u) {
                    case 10:
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        if (applicationInfo != null) {
                            valueOf = String.valueOf(applicationInfo.targetSdkVersion);
                            break;
                        }
                        valueOf = "";
                        break;
                    case 11:
                        ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                        if (applicationInfo2 != null) {
                            valueOf = String.valueOf(applicationInfo2.minSdkVersion);
                            break;
                        }
                        valueOf = "";
                        break;
                    case 12:
                        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                            valueOf = "tv";
                            break;
                        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                            valueOf = "watch";
                            break;
                        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                            valueOf = "auto";
                            break;
                        } else {
                            if (Build.VERSION.SDK_INT >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                                valueOf = "embedded";
                                break;
                            }
                            valueOf = "";
                            break;
                        }
                    default:
                        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                        if (installerPackageName != null) {
                            valueOf = FirebaseCommonRegistrar.a(installerPackageName);
                            break;
                        }
                        valueOf = "";
                        break;
                }
                return new pd.a(str, valueOf);
            default:
                String str2 = (String) this.f15942v;
                ic.a aVar = (ic.a) this.f15943w;
                try {
                    Trace.beginSection(str2);
                    return aVar.f18390f.e(nVar);
                } finally {
                    Trace.endSection();
                }
        }
    }

    @Override // v8.b
    public Object execute() {
        switch (this.f15941u) {
            case 11:
                com.google.android.gms.internal.consent_sdk.c cVar = (com.google.android.gms.internal.consent_sdk.c) this.f15942v;
                Iterable iterable = (Iterable) this.f15943w;
                u8.f fVar = (u8.f) cVar.f13373x;
                fVar.getClass();
                if (iterable.iterator().hasNext()) {
                    fVar.f().compileStatement("DELETE FROM events WHERE _id in ".concat(u8.f.r(iterable))).execute();
                    return null;
                }
                return null;
            default:
                com.google.android.gms.internal.consent_sdk.c cVar2 = (com.google.android.gms.internal.consent_sdk.c) this.f15942v;
                Iterator it = ((HashMap) this.f15943w).entrySet().iterator();
                while (it.hasNext()) {
                    ((u8.f) cVar2.D).o(((Integer) r2.getValue()).intValue(), q8.c.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
                }
                return null;
        }
    }

    @Override // ib.c
    public void f(ib.o oVar) {
        switch (this.f15941u) {
            case 1:
                qd.a aVar = (qd.a) this.f15942v;
                MainActivity mainActivity = (MainActivity) this.f15943w;
                oVar.getClass();
                if (oVar.l()) {
                    int b10 = (int) aVar.b("min_version_code");
                    Log.d("UpdateManager", "Current Version: 14, Min Required: " + b10);
                    if (14 < b10) {
                        jb.e a10 = a9.a(mainActivity);
                        a10.getClass();
                        ib.o a11 = a10.a();
                        a11.getClass();
                        a11.f(ib.i.f18364a, new b1.h(7, new f8.a(a10, mainActivity, 1)));
                        return;
                    }
                    return;
                }
                Log.e("UpdateManager", "Failed to fetch remote config");
                return;
            default:
                ((FirebaseMessagingService) this.f15942v).a((Intent) this.f15943w);
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v20, types: [rd.k] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r12v16, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r12v24, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r12v8, types: [ib.o] */
    @Override // ib.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(ib.o r12) {
        /*
            Method dump skipped, instructions count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.g(ib.o):java.lang.Object");
    }

    @Override // gd.a
    public void i(gd.b bVar) {
        gd.a aVar = (gd.a) this.f15942v;
        gd.a aVar2 = (gd.a) this.f15943w;
        aVar.i(bVar);
        aVar2.i(bVar);
    }

    @Override // ib.g
    public ib.o q(Object obj) {
        rd.b bVar = (rd.b) this.f15942v;
        rd.c cVar = (rd.c) this.f15943w;
        synchronized (bVar) {
            bVar.f24688c = h8.e(cVar);
        }
        return h8.e(cVar);
    }
}
