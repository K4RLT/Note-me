package lb;
import j1.a;
import q.b;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.ads.hg;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import wa.h8;

/* loaded from: classes.dex */
public final class r1 {

    /* renamed from: k, reason: collision with root package name */
    public static final c7.a f20249k = new c7.a("AssetPackManager", 5);

    /* renamed from: a, reason: collision with root package name */
    public final v f20250a;

    /* renamed from: b, reason: collision with root package name */
    public final s f20251b;

    /* renamed from: c, reason: collision with root package name */
    public final mb.b f20252c;

    /* renamed from: d, reason: collision with root package name */
    public final n0 f20253d;
    public final e0 e;

    /* renamed from: f, reason: collision with root package name */
    public final f1 f20254f;

    /* renamed from: g, reason: collision with root package name */
    public final Handler f20255g = new Handler(Looper.getMainLooper());

    /* renamed from: h, reason: collision with root package name */
    public boolean f20256h;
    public final mb.e i;

    /* renamed from: j, reason: collision with root package name */
    public final mb.e f20257j;

    public r1(v vVar, mb.e eVar, s sVar, mb.b bVar, n0 n0Var, e0 e0Var, mb.e eVar2, f1 f1Var) {
        this.f20250a = vVar;
        this.i = eVar;
        this.f20251b = sVar;
        this.f20252c = bVar;
        this.f20253d = n0Var;
        this.e = e0Var;
        this.f20257j = eVar2;
        this.f20254f = f1Var;
    }

    public final ib.o a(List list) {
        HashMap p10 = this.f20250a.p();
        ArrayList arrayList = new ArrayList(list);
        if (arrayList.isEmpty()) {
            Bundle bundle = new Bundle();
            bundle.putInt("session_id", 0);
            bundle.putInt("error_code", 0);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                bundle.putInt(ya.a("status", str), 4);
                bundle.putInt(ya.a("error_code", str), 0);
                bundle.putLong(ya.a("total_bytes_to_download", str), 0L);
                bundle.putLong(ya.a("bytes_downloaded", str), 0L);
            }
            bundle.putStringArrayList("pack_names", new ArrayList<>(list));
            bundle.putLong("total_bytes_to_download", 0L);
            bundle.putLong("bytes_downloaded", 0L);
            return h8.e(a(bundle, this.f20253d, this.f20254f, t.f20275w));
        }
        return ((t1) this.i.b()).a(arrayList, p10);
    }

    public final void b(boolean z3) {
        hg hgVar;
        boolean z9;
        s sVar = this.f20251b;
        synchronized (sVar) {
            hgVar = sVar.e;
        }
        if (hgVar != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        synchronized (sVar) {
            sVar.f20262f = z3;
            sVar.a();
        }
        if (z3 && !z9) {
            ((Executor) this.f20257j.b()).execute(new e1(this, 0));
        }
    }

    public final y c(String str) {
        PackageInfo packageInfo;
        HashSet hashSet;
        if (!this.f20256h) {
            ((Executor) this.f20257j.b()).execute(new e1(this, 1));
            this.f20256h = true;
        }
        v vVar = this.f20250a;
        vVar.getClass();
        try {
            if (vVar.n(str) != null) {
                try {
                    return vVar.j(str);
                } catch (IOException unused) {
                    return null;
                }
            }
        } catch (IOException unused2) {
        }
        mb.b bVar = this.f20252c;
        bVar.getClass();
        c7.a aVar = mb.b.f20764c;
        try {
            packageInfo = bVar.f20765a.getPackageManager().getPackageInfo(bVar.f20766b, 128);
        } catch (PackageManager.NameNotFoundException unused3) {
            aVar.c("App is not found in PackageManager", new Object[0]);
            packageInfo = null;
        }
        if (packageInfo != null && packageInfo.applicationInfo != null) {
            hashSet = new HashSet();
            Bundle bundle = packageInfo.applicationInfo.metaData;
            HashSet hashSet2 = new HashSet();
            if (bundle != null) {
                String string = bundle.getString("com.android.dynamic.apk.fused.modules");
                if (string != null && !string.isEmpty()) {
                    Collections.addAll(hashSet2, string.split(",", -1));
                    hashSet2.remove("");
                    hashSet2.remove("base");
                } else {
                    aVar.a("App has no fused modules.", new Object[0]);
                }
            }
            String[] strArr = packageInfo.splitNames;
            if (strArr != null) {
                aVar.a("Adding splits from package manager: %s", Arrays.toString(strArr));
                Collections.addAll(hashSet2, strArr);
            } else {
                aVar.a("No splits are found or app cannot be found in package manager.", new Object[0]);
            }
            if (mb.a.f20763a.get() == null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    if (!str2.startsWith("config.") && !str2.contains(".config.")) {
                        hashSet.add(str2);
                    }
                }
            } else {
                g5.b();
                return null;
            }
        } else {
            hashSet = new HashSet();
        }
        if (!hashSet.contains(str)) {
            return null;
        }
        return y.f20304d;
    }

    public final ib.o d(Activity activity) {
        e0 e0Var = this.e;
        if (e0Var.f20122a == null) {
            return h8.d(new da.k(-12, 1));
        }
        Intent intent = new Intent(activity, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", e0Var.f20122a);
        ib.h hVar = new ib.h();
        intent.putExtra("result_receiver", new q1(this, this.f20255g, hVar));
        activity.startActivity(intent);
        return hVar.f18363a;
    }
}
