package z5;
import b.a;
import d.b;
import j.a;
import j.i0;

import android.app.Service;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Region;
import android.os.BadParcelableException;
import android.os.NetworkOnMainThreadException;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import androidx.lifecycle.w;
import b0.q0;
import b2.f2;
import b2.i0;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.internal.ads.gl;
import com.google.android.gms.internal.ads.js;
import com.google.android.gms.internal.ads.p21;
import com.google.android.gms.internal.ads.sl;
import com.google.android.gms.internal.ads.x90;
import com.google.android.gms.internal.measurement.d1;
import com.google.android.gms.internal.measurement.f1;
import com.google.android.gms.internal.measurement.g1;
import com.google.android.gms.internal.play_billing.r;
import eb.k0;
import eb.n1;
import eb.u0;
import eb.x0;
import fa.l0;
import fa.n;
import g0.e1;
import g0.s0;
import i1.o;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import k0.j1;
import k0.s;
import m2.p0;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import pf.b0;
import pf.z;
import q.m1;
import q.x;
import r0.y;

/* loaded from: classes.dex */
public final class h implements WebMessageListenerBoundaryInterface, ea.h, ib.e, ib.d, ib.b, kb.c, k0.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f31921u;

    /* renamed from: v, reason: collision with root package name */
    public Object f31922v;

    public h(int i) {
        this.f31921u = i;
        switch (i) {
            case 2:
                this.f31922v = new q.l(m1.f22948a, Float.valueOf(0.0f), new q.m(0.0f), Long.MIN_VALUE, Long.MIN_VALUE, false);
                return;
            case 3:
                this.f31922v = new TreeSet(b2.l.f1532a);
                return;
            case 6:
                return;
            case 9:
                this.f31922v = new EnumMap(n1.class);
                return;
            case 16:
                this.f31922v = new LinkedHashMap();
                return;
            case 17:
                this.f31922v = new ConcurrentHashMap(16);
                return;
            case 20:
                this.f31922v = y.B(Boolean.FALSE);
                return;
            case 22:
                this.f31922v = new CountDownLatch(1);
                return;
            case 24:
                this.f31922v = new Region();
                return;
            default:
                this.f31922v = new HashMap();
                return;
        }
    }

    public static void f(r5.c cVar) {
        SQLiteDatabase sQLiteDatabase = cVar.f24554u;
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        sQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '7d73d21f1bd82c9e5268b6dcf9fde2cb')");
    }

    public static l0 k(r5.c cVar) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("work_spec_id", new l5.f(1, 1, "work_spec_id", "TEXT", null, true));
        hashMap.put("prerequisite_id", new l5.f(2, 1, "prerequisite_id", "TEXT", null, true));
        HashSet hashSet = new HashSet(2);
        hashSet.add(new l5.g("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(FacebookMediationAdapter.KEY_ID)));
        hashSet.add(new l5.g("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList(FacebookMediationAdapter.KEY_ID)));
        HashSet hashSet2 = new HashSet(2);
        hashSet2.add(new l5.h("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        hashSet2.add(new l5.h("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id"), Arrays.asList("ASC")));
        l5.i iVar = new l5.i("Dependency", hashMap, hashSet, hashSet2);
        l5.i a10 = l5.i.a(cVar, "Dependency");
        if (!iVar.equals(a10)) {
            return new l0(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + iVar + "\n Found:\n" + a10);
        }
        HashMap hashMap2 = new HashMap(30);
        hashMap2.put(FacebookMediationAdapter.KEY_ID, new l5.f(1, 1, FacebookMediationAdapter.KEY_ID, "TEXT", null, true));
        hashMap2.put("state", new l5.f(0, 1, "state", "INTEGER", null, true));
        hashMap2.put("worker_class_name", new l5.f(0, 1, "worker_class_name", "TEXT", null, true));
        hashMap2.put("input_merger_class_name", new l5.f(0, 1, "input_merger_class_name", "TEXT", null, true));
        hashMap2.put("input", new l5.f(0, 1, "input", "BLOB", null, true));
        hashMap2.put("output", new l5.f(0, 1, "output", "BLOB", null, true));
        hashMap2.put("initial_delay", new l5.f(0, 1, "initial_delay", "INTEGER", null, true));
        hashMap2.put("interval_duration", new l5.f(0, 1, "interval_duration", "INTEGER", null, true));
        hashMap2.put("flex_duration", new l5.f(0, 1, "flex_duration", "INTEGER", null, true));
        hashMap2.put("run_attempt_count", new l5.f(0, 1, "run_attempt_count", "INTEGER", null, true));
        hashMap2.put("backoff_policy", new l5.f(0, 1, "backoff_policy", "INTEGER", null, true));
        hashMap2.put("backoff_delay_duration", new l5.f(0, 1, "backoff_delay_duration", "INTEGER", null, true));
        hashMap2.put("last_enqueue_time", new l5.f(0, 1, "last_enqueue_time", "INTEGER", "-1", true));
        hashMap2.put("minimum_retention_duration", new l5.f(0, 1, "minimum_retention_duration", "INTEGER", null, true));
        hashMap2.put("schedule_requested_at", new l5.f(0, 1, "schedule_requested_at", "INTEGER", null, true));
        hashMap2.put("run_in_foreground", new l5.f(0, 1, "run_in_foreground", "INTEGER", null, true));
        hashMap2.put("out_of_quota_policy", new l5.f(0, 1, "out_of_quota_policy", "INTEGER", null, true));
        hashMap2.put("period_count", new l5.f(0, 1, "period_count", "INTEGER", "0", true));
        hashMap2.put("generation", new l5.f(0, 1, "generation", "INTEGER", "0", true));
        hashMap2.put("next_schedule_time_override", new l5.f(0, 1, "next_schedule_time_override", "INTEGER", "9223372036854775807", true));
        hashMap2.put("next_schedule_time_override_generation", new l5.f(0, 1, "next_schedule_time_override_generation", "INTEGER", "0", true));
        hashMap2.put("stop_reason", new l5.f(0, 1, "stop_reason", "INTEGER", "-256", true));
        hashMap2.put("required_network_type", new l5.f(0, 1, "required_network_type", "INTEGER", null, true));
        hashMap2.put("requires_charging", new l5.f(0, 1, "requires_charging", "INTEGER", null, true));
        hashMap2.put("requires_device_idle", new l5.f(0, 1, "requires_device_idle", "INTEGER", null, true));
        hashMap2.put("requires_battery_not_low", new l5.f(0, 1, "requires_battery_not_low", "INTEGER", null, true));
        hashMap2.put("requires_storage_not_low", new l5.f(0, 1, "requires_storage_not_low", "INTEGER", null, true));
        hashMap2.put("trigger_content_update_delay", new l5.f(0, 1, "trigger_content_update_delay", "INTEGER", null, true));
        hashMap2.put("trigger_max_content_delay", new l5.f(0, 1, "trigger_max_content_delay", "INTEGER", null, true));
        hashMap2.put("content_uri_triggers", new l5.f(0, 1, "content_uri_triggers", "BLOB", null, true));
        HashSet hashSet3 = new HashSet(0);
        HashSet hashSet4 = new HashSet(2);
        hashSet4.add(new l5.h("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at"), Arrays.asList("ASC")));
        hashSet4.add(new l5.h("index_WorkSpec_last_enqueue_time", false, Arrays.asList("last_enqueue_time"), Arrays.asList("ASC")));
        l5.i iVar2 = new l5.i("WorkSpec", hashMap2, hashSet3, hashSet4);
        l5.i a11 = l5.i.a(cVar, "WorkSpec");
        if (!iVar2.equals(a11)) {
            return new l0(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + iVar2 + "\n Found:\n" + a11);
        }
        HashMap hashMap3 = new HashMap(2);
        hashMap3.put("tag", new l5.f(1, 1, "tag", "TEXT", null, true));
        hashMap3.put("work_spec_id", new l5.f(2, 1, "work_spec_id", "TEXT", null, true));
        HashSet hashSet5 = new HashSet(1);
        hashSet5.add(new l5.g("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(FacebookMediationAdapter.KEY_ID)));
        HashSet hashSet6 = new HashSet(1);
        hashSet6.add(new l5.h("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        l5.i iVar3 = new l5.i("WorkTag", hashMap3, hashSet5, hashSet6);
        l5.i a12 = l5.i.a(cVar, "WorkTag");
        if (!iVar3.equals(a12)) {
            return new l0(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + iVar3 + "\n Found:\n" + a12);
        }
        HashMap hashMap4 = new HashMap(3);
        hashMap4.put("work_spec_id", new l5.f(1, 1, "work_spec_id", "TEXT", null, true));
        hashMap4.put("generation", new l5.f(2, 1, "generation", "INTEGER", "0", true));
        hashMap4.put("system_id", new l5.f(0, 1, "system_id", "INTEGER", null, true));
        HashSet hashSet7 = new HashSet(1);
        hashSet7.add(new l5.g("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(FacebookMediationAdapter.KEY_ID)));
        l5.i iVar4 = new l5.i("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
        l5.i a13 = l5.i.a(cVar, "SystemIdInfo");
        if (!iVar4.equals(a13)) {
            return new l0(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + iVar4 + "\n Found:\n" + a13);
        }
        HashMap hashMap5 = new HashMap(2);
        hashMap5.put("name", new l5.f(1, 1, "name", "TEXT", null, true));
        hashMap5.put("work_spec_id", new l5.f(2, 1, "work_spec_id", "TEXT", null, true));
        HashSet hashSet8 = new HashSet(1);
        hashSet8.add(new l5.g("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(FacebookMediationAdapter.KEY_ID)));
        HashSet hashSet9 = new HashSet(1);
        hashSet9.add(new l5.h("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        l5.i iVar5 = new l5.i("WorkName", hashMap5, hashSet8, hashSet9);
        l5.i a14 = l5.i.a(cVar, "WorkName");
        if (!iVar5.equals(a14)) {
            return new l0(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + iVar5 + "\n Found:\n" + a14);
        }
        HashMap hashMap6 = new HashMap(2);
        hashMap6.put("work_spec_id", new l5.f(1, 1, "work_spec_id", "TEXT", null, true));
        hashMap6.put("progress", new l5.f(0, 1, "progress", "BLOB", null, true));
        HashSet hashSet10 = new HashSet(1);
        hashSet10.add(new l5.g("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(FacebookMediationAdapter.KEY_ID)));
        l5.i iVar6 = new l5.i("WorkProgress", hashMap6, hashSet10, new HashSet(0));
        l5.i a15 = l5.i.a(cVar, "WorkProgress");
        if (!iVar6.equals(a15)) {
            return new l0(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + iVar6 + "\n Found:\n" + a15);
        }
        HashMap hashMap7 = new HashMap(2);
        hashMap7.put("key", new l5.f(1, 1, "key", "TEXT", null, true));
        hashMap7.put("long_value", new l5.f(0, 1, "long_value", "INTEGER", null, false));
        l5.i iVar7 = new l5.i("Preference", hashMap7, new HashSet(0), new HashSet(0));
        l5.i a16 = l5.i.a(cVar, "Preference");
        if (!iVar7.equals(a16)) {
            return new l0(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + iVar7 + "\n Found:\n" + a16);
        }
        return new l0(true, (String) null);
    }

    public static h r(String str) {
        eb.h hVar;
        EnumMap enumMap = new EnumMap(n1.class);
        if (str.length() >= n1.values().length && str.charAt(0) == '1') {
            n1[] values = n1.values();
            int length = values.length;
            int i = 1;
            int i10 = 0;
            while (i10 < length) {
                n1 n1Var = values[i10];
                int i11 = i + 1;
                char charAt = str.charAt(i);
                eb.h[] values2 = eb.h.values();
                int length2 = values2.length;
                int i12 = 0;
                while (true) {
                    if (i12 < length2) {
                        hVar = values2[i12];
                        if (hVar.f16157u == charAt) {
                            break;
                        }
                        i12++;
                    } else {
                        hVar = eb.h.UNSET;
                        break;
                    }
                }
                enumMap.put((EnumMap) n1Var, (n1) hVar);
                i10++;
                i = i11;
            }
            return new h(enumMap);
        }
        return new h(9);
    }

    @Override // ib.b
    public void a() {
        ((CountDownLatch) this.f31922v).countDown();
    }

    @Override // ea.h
    public void accept(Object obj, Object obj2) {
        switch (this.f31921u) {
            case 19:
                ib.h hVar = (ib.h) obj2;
                ha.a aVar = (ha.a) ((ha.c) obj).t();
                n nVar = (n) this.f31922v;
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(aVar.f9121w);
                sa.a.c(obtain, nVar);
                try {
                    aVar.f9120v.transact(1, obtain, null, 1);
                    obtain.recycle();
                    hVar.b(null);
                    return;
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            default:
                ja.e eVar = new ja.e((ib.h) obj2, 1);
                ja.d dVar = (ja.d) ((ja.g) obj).t();
                ja.a aVar2 = (ja.a) this.f31922v;
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken(dVar.f9121w);
                int i = sa.a.f25125a;
                obtain2.writeStrongBinder(eVar);
                sa.a.c(obtain2, aVar2);
                obtain2.writeStrongBinder(null);
                dVar.M0(obtain2, 2);
                return;
        }
    }

    public void c(i0 i0Var) {
        if (!i0Var.I()) {
            y1.a.b("DepthSortedSet.add called on an unattached node");
        }
        ((f2) this.f31922v).add(i0Var);
    }

    @Override // ib.e
    public void d(Object obj) {
        switch (this.f31921u) {
            case gl.zzm /* 21 */:
                ((ib.h) ((h) this.f31922v).f31922v).f18363a.q();
                return;
            default:
                ((CountDownLatch) this.f31922v).countDown();
                return;
        }
    }

    public void e(j5.a aVar) {
        aVar.getClass();
        int i = aVar.f18908a;
        int i10 = aVar.f18909b;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f31922v;
        Integer valueOf = Integer.valueOf(i);
        Object obj = linkedHashMap.get(valueOf);
        if (obj == null) {
            obj = new TreeMap();
            linkedHashMap.put(valueOf, obj);
        }
        TreeMap treeMap = (TreeMap) obj;
        if (treeMap.containsKey(Integer.valueOf(i10))) {
            Log.w("ROOM", "Overriding migration " + treeMap.get(Integer.valueOf(i10)) + " with " + aVar);
        }
        treeMap.put(Integer.valueOf(i10), aVar);
    }

    public String g(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            bd.d dVar = (bd.d) this.f31922v;
            bd.e eVar = new bd.e(stringWriter, dVar.f3201u, dVar.f3202v, dVar.f3203w, dVar.f3204x);
            eVar.h(obj);
            eVar.j();
            eVar.f3206b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    @Override // k0.l
    public boolean h(long j10, s sVar) {
        e1 e1Var;
        j1 j1Var = (j1) this.f31922v;
        if (j1Var.i() && j1Var.k().f24515a.f20477v.length() != 0 && (e1Var = j1Var.f19321d) != null && e1Var.d() != null) {
            p(j1Var.k(), j10, false, sVar);
            return true;
        }
        return false;
    }

    public void i(Object obj) {
        w wVar = (w) obj;
        f4.d dVar = (f4.d) this.f31922v;
        if (wVar != null && dVar.F) {
            dVar.getClass();
            throw new IllegalStateException("Fragment " + dVar + " did not return a View from onCreateView() or this was called before onCreateView().");
        }
    }

    @Override // k0.l
    public boolean j(long j10, s sVar) {
        e1 e1Var;
        j1 j1Var = (j1) this.f31922v;
        if (j1Var.i() && j1Var.k().f24515a.f20477v.length() != 0 && (e1Var = j1Var.f19321d) != null && e1Var.d() != null) {
            o oVar = j1Var.f19327l;
            if (oVar != null) {
                o.b(oVar);
            }
            j1Var.f19330o = j10;
            j1Var.f19335t = -1;
            j1Var.f(true);
            p(j1Var.k(), j1Var.f19330o, true, sVar);
            return true;
        }
        return false;
    }

    public void l(HashMap hashMap) {
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            HashMap hashMap2 = (HashMap) this.f31922v;
            if (value == null) {
                hashMap2.put(str, null);
            } else {
                Class<?> cls = value.getClass();
                if (cls != Boolean.class && cls != Byte.class && cls != Integer.class && cls != Long.class && cls != Float.class && cls != Double.class && cls != String.class && cls != Boolean[].class && cls != Byte[].class && cls != Integer[].class && cls != Long[].class && cls != Float[].class && cls != Double[].class && cls != String[].class) {
                    int i = 0;
                    if (cls == boolean[].class) {
                        boolean[] zArr = (boolean[]) value;
                        String str2 = a6.g.f272b;
                        Boolean[] boolArr = new Boolean[zArr.length];
                        while (i < zArr.length) {
                            boolArr[i] = Boolean.valueOf(zArr[i]);
                            i++;
                        }
                        hashMap2.put(str, boolArr);
                    } else if (cls == byte[].class) {
                        byte[] bArr = (byte[]) value;
                        String str3 = a6.g.f272b;
                        Byte[] bArr2 = new Byte[bArr.length];
                        while (i < bArr.length) {
                            bArr2[i] = Byte.valueOf(bArr[i]);
                            i++;
                        }
                        hashMap2.put(str, bArr2);
                    } else if (cls == int[].class) {
                        int[] iArr = (int[]) value;
                        String str4 = a6.g.f272b;
                        Integer[] numArr = new Integer[iArr.length];
                        while (i < iArr.length) {
                            numArr[i] = Integer.valueOf(iArr[i]);
                            i++;
                        }
                        hashMap2.put(str, numArr);
                    } else if (cls == long[].class) {
                        long[] jArr = (long[]) value;
                        String str5 = a6.g.f272b;
                        Long[] lArr = new Long[jArr.length];
                        while (i < jArr.length) {
                            lArr[i] = Long.valueOf(jArr[i]);
                            i++;
                        }
                        hashMap2.put(str, lArr);
                    } else if (cls == float[].class) {
                        float[] fArr = (float[]) value;
                        String str6 = a6.g.f272b;
                        Float[] fArr2 = new Float[fArr.length];
                        while (i < fArr.length) {
                            fArr2[i] = Float.valueOf(fArr[i]);
                            i++;
                        }
                        hashMap2.put(str, fArr2);
                    } else if (cls == double[].class) {
                        double[] dArr = (double[]) value;
                        String str7 = a6.g.f272b;
                        Double[] dArr2 = new Double[dArr.length];
                        while (i < dArr.length) {
                            dArr2[i] = Double.valueOf(dArr[i]);
                            i++;
                        }
                        hashMap2.put(str, dArr2);
                    } else {
                        throw new IllegalArgumentException("Key " + str + " has invalid type " + cls);
                    }
                } else {
                    hashMap2.put(str, value);
                }
            }
        }
    }

    public void m(gc.b bVar) {
        f1 f1Var = (f1) this.f31922v;
        synchronized (f1Var.e) {
            for (int i = 0; i < f1Var.e.size(); i++) {
                try {
                    if (bVar.equals(((Pair) f1Var.e.get(i)).first)) {
                        Log.w(f1Var.f13746a, "OnEventListener already registered.");
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            d1 d1Var = new d1(bVar);
            f1Var.e.add(new Pair(bVar, d1Var));
            if (f1Var.f13752h != null) {
                try {
                    f1Var.f13752h.registerOnMeasurementEventListener(d1Var);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w(f1Var.f13746a, "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            f1Var.e(new g1(f1Var, d1Var, 3));
        }
    }

    public boolean n(i0 i0Var) {
        if (!i0Var.I()) {
            y1.a.b("DepthSortedSet.remove called on an unattached node");
        }
        return ((f2) this.f31922v).remove(i0Var);
    }

    public void o(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            HashSet hashSet = new HashSet();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                c7.m mVar = (c7.m) obj;
                if (!"play_pass_subs".equals(mVar.f3973b)) {
                    hashSet.add(mVar.f3973b);
                }
            }
            if (hashSet.size() <= 1) {
                this.f31922v = r.q(arrayList);
                return;
            } else {
                x.n("All products should be of the same product type.");
                return;
            }
        }
        x.n("Product list cannot be empty.");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f2 A[ORIG_RETURN, RETURN] */
    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPostMessage(android.webkit.WebView r4, java.lang.reflect.InvocationHandler r5, android.net.Uri r6, boolean r7, java.lang.reflect.InvocationHandler r8) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z5.h.onPostMessage(android.webkit.WebView, java.lang.reflect.InvocationHandler, android.net.Uri, boolean, java.lang.reflect.InvocationHandler):void");
    }

    public void p(r2.x xVar, long j10, boolean z3, s sVar) {
        s0 s0Var;
        j1 j1Var = (j1) this.f31922v;
        if (p0.b(j1.a(j1Var, xVar, j10, z3, false, sVar, false))) {
            s0Var = s0.f17277w;
        } else {
            s0Var = s0.f17276v;
        }
        j1Var.o(s0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void q(float f10, y2.c cVar, z zVar) {
        df.l lVar;
        if (f10 <= cVar.l0(q0.f1243a)) {
            return;
        }
        b1.i d2 = b1.w.d();
        te.c cVar2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (d2 != null) {
            lVar = d2.e();
        } else {
            lVar = null;
        }
        b1.i g8 = b1.w.g(d2);
        try {
            float floatValue = ((Number) ((q.l) this.f31922v).f22937v.getValue()).floatValue();
            q.l lVar2 = (q.l) this.f31922v;
            if (lVar2.f22941z) {
                this.f31922v = q.e.k(lVar2, floatValue - f10, 0.0f, 30);
                b0.x(zVar, null, new b0.p0(this, cVar2, 0), 3);
            } else {
                this.f31922v = new q.l(m1.f22948a, Float.valueOf(-f10), objArr2 == true ? 1 : 0, 60);
                b0.x(zVar, null, new b0.p0(this, objArr == true ? 1 : 0, 1), 3);
            }
            b1.w.j(d2, g8, lVar);
        } catch (Throwable th) {
            b1.w.j(d2, g8, lVar);
            throw th;
        }
    }

    public void s(int i, String str, List list, boolean z3, boolean z9) {
        js jsVar;
        u0 u0Var = (u0) this.f31922v;
        int i10 = x0.f16450a[q0.b(i)];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        jsVar = u0Var.f().G;
                    } else {
                        jsVar = u0Var.f().I;
                    }
                } else if (z3) {
                    jsVar = u0Var.f().E;
                } else if (!z9) {
                    jsVar = u0Var.f().F;
                } else {
                    jsVar = u0Var.f().D;
                }
            } else if (z3) {
                jsVar = u0Var.f().B;
            } else if (!z9) {
                jsVar = u0Var.f().C;
            } else {
                jsVar = u0Var.f().A;
            }
        } else {
            jsVar = u0Var.f().H;
        }
        int size = list.size();
        if (size != 1) {
            if (size != 2) {
                if (size != 3) {
                    jsVar.g(str);
                    return;
                } else {
                    jsVar.i(str, list.get(0), list.get(1), list.get(2));
                    return;
                }
            }
            jsVar.h(str, list.get(0), list.get(1));
            return;
        }
        jsVar.f(list.get(0), str);
    }

    public void t(p21 p21Var) {
        c0.z zVar = (c0.z) this.f31922v;
        zVar.getClass();
        String str = p21Var.f9333b;
        int i = p21Var.f9332a;
        if (!TextUtils.isEmpty(str)) {
            if (!((Boolean) g9.r.e.f17698c.a(sl.Vc)).booleanValue()) {
                zVar.f3437v = str;
            }
        }
        switch (i) {
            case 8152:
                zVar.h(new HashMap(), "onLMDOverlayOpened");
                return;
            case 8153:
                zVar.h(new HashMap(), "onLMDOverlayClicked");
                return;
            case 8154:
            case 8156:
            case 8158:
            case 8159:
            default:
                return;
            case 8155:
                zVar.h(new HashMap(), "onLMDOverlayClose");
                return;
            case 8157:
                zVar.f3437v = null;
                zVar.f3438w = null;
                zVar.f3436u = false;
                return;
            case 8160:
            case 8161:
            case 8162:
                HashMap hashMap = new HashMap();
                hashMap.put("error", String.valueOf(i));
                zVar.h(hashMap, "onLMDOverlayFailedToOpen");
                return;
        }
    }

    public String toString() {
        switch (this.f31921u) {
            case 3:
                return ((f2) this.f31922v).toString();
            case 9:
                StringBuilder sb2 = new StringBuilder("1");
                for (n1 n1Var : n1.values()) {
                    eb.h hVar = (eb.h) ((EnumMap) this.f31922v).get(n1Var);
                    if (hVar == null) {
                        hVar = eb.h.UNSET;
                    }
                    sb2.append(hVar.f16157u);
                }
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public void u(n1 n1Var, int i) {
        eb.h hVar;
        if (i != -30) {
            if (i != -20) {
                if (i != -10) {
                    if (i != 0) {
                        if (i != 30) {
                            hVar = eb.h.UNSET;
                        } else {
                            hVar = eb.h.INITIALIZATION;
                        }
                    }
                } else {
                    hVar = eb.h.MANIFEST;
                }
            }
            hVar = eb.h.API;
        } else {
            hVar = eb.h.TCF;
        }
        ((EnumMap) this.f31922v).put((EnumMap) n1Var, (n1) hVar);
    }

    public void v(n1 n1Var, eb.h hVar) {
        ((EnumMap) this.f31922v).put((EnumMap) n1Var, (n1) hVar);
    }

    @Override // ib.d
    public void w(Exception exc) {
        ((CountDownLatch) this.f31922v).countDown();
    }

    public k0 x() {
        k0 k0Var = eb.d1.a((Service) this.f31922v, null, null).C;
        eb.d1.d(k0Var);
        return k0Var;
    }

    @Override // kb.c, com.google.android.gms.internal.ads.i81
    /* renamed from: zza */
    public Object mo207zza() {
        return ((jb.f) this.f31922v).f19108a;
    }

    @Override // k0.l
    public void b() {
    }

    public /* synthetic */ h(Object obj, int i, Object obj2) {
        this.f31921u = i;
        this.f31922v = obj2;
    }

    public /* synthetic */ h(jb.f fVar) {
        this.f31921u = 28;
        h hVar = new h(27, fVar);
        int i = 1;
        this.f31922v = kb.a(new ic.c(4, kb.a(new i0(i, kb.a(new j6.s(hVar, 13, kb.a(new jb.d(hVar, 1)))), kb.a(new jb.d(hVar, 0)), hVar))));
    }

    public h(EnumMap enumMap) {
        this.f31921u = 9;
        EnumMap enumMap2 = new EnumMap(n1.class);
        this.f31922v = enumMap2;
        enumMap2.putAll(enumMap);
    }

    public h(a aVar) {
        this.f31921u = 8;
        this.f31922v = new x90(aVar);
    }

    public /* synthetic */ h(int i, Object obj) {
        this.f31921u = i;
        this.f31922v = obj;
    }
}
